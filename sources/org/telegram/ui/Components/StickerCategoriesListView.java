package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheFetcher;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;

public class StickerCategoriesListView extends RecyclerListView {
    private static EmojiGroupFetcher fetcher;
    public static CacheFetcher<String, TLRPC.TL_emojiList> search;
    private Adapter adapter;
    private Paint backgroundPaint;
    private EmojiCategory[] categories;
    private boolean categoriesShouldShow;
    private ValueAnimator categoriesShownAnimator;
    private float categoriesShownT;
    private int categoriesType;
    private int dontOccupyWidth;
    public boolean isGlassDesign;
    public Integer layerNum;
    private LinearLayoutManager layoutManager;
    private AnimatedFloat leftBoundAlpha;
    private Drawable leftBoundDrawable;
    private Utilities.Callback<EmojiCategory> onCategoryClick;
    private Utilities.Callback<Boolean> onScrollFully;
    private Utilities.Callback<Integer> onScrollIntoOccupiedWidth;
    private View paddingView;
    private int paddingWidth;
    private final RectF rect1;
    private final RectF rect2;
    private final RectF rect3;
    private AnimatedFloat rightBoundAlpha;
    private Drawable rightBoundDrawable;
    private boolean scrolledFully;
    private boolean scrolledIntoOccupiedWidth;
    private AnimatedFloat selectedAlpha;
    private int selectedCategoryIndex;
    private AnimatedFloat selectedIndex;
    private Paint selectedPaint;
    private float shownButtonsAtStart;
    private static Set<Integer> loadedIconsType = new HashSet();
    static int loadedCategoryIcons = 0;

    public class Adapter extends RecyclerListView.SelectionAdapter {
        private static final int VIEW_TYPE_CATEGORY = 1;
        private static final int VIEW_TYPE_PADDING = 0;
        private int lastItemCount;

        private Adapter() {
        }

        @Override
        public int getItemCount() {
            int length = (StickerCategoriesListView.this.categories == null ? 0 : StickerCategoriesListView.this.categories.length) + 1;
            if (length != this.lastItemCount) {
                if (StickerCategoriesListView.this.paddingView != null) {
                    StickerCategoriesListView.this.paddingView.requestLayout();
                }
                this.lastItemCount = length;
            }
            return length;
        }

        @Override
        public int getItemViewType(int i) {
            return i == 0 ? 0 : 1;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 1;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.getItemViewType() != 1 || StickerCategoriesListView.this.categories == null) {
                return;
            }
            int i2 = i - 1;
            EmojiCategory emojiCategory = StickerCategoriesListView.this.categories[i2];
            CategoryButton categoryButton = (CategoryButton) viewHolder.itemView;
            categoryButton.set(emojiCategory, i2, StickerCategoriesListView.this.selectedCategoryIndex == i2);
            categoryButton.setAlpha(StickerCategoriesListView.this.categoriesShownT);
            categoryButton.setScaleX(StickerCategoriesListView.this.categoriesShownT);
            categoryButton.setScaleY(StickerCategoriesListView.this.categoriesShownT);
            categoryButton.play(false);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View categoryButton;
            if (i == 0) {
                categoryButton = StickerCategoriesListView.this.paddingView = new View(StickerCategoriesListView.this.getContext()) {
                    @Override
                    public void onMeasure(int i2, int i3) {
                        int iDp;
                        int size = View.MeasureSpec.getSize(i2);
                        if (size <= 0) {
                            size = ((View) getParent()).getMeasuredWidth();
                        }
                        int size2 = View.MeasureSpec.getSize(i3) - AndroidUtilities.dp(4.0f);
                        StickerCategoriesListView stickerCategoriesListView = StickerCategoriesListView.this;
                        if (stickerCategoriesListView.dontOccupyWidth > 0) {
                            iDp = AndroidUtilities.dp(4.0f) + StickerCategoriesListView.this.dontOccupyWidth;
                        } else {
                            iDp = 0;
                        }
                        super.onMeasure(View.MeasureSpec.makeMeasureSpec(stickerCategoriesListView.paddingWidth = Math.max(iDp, (int) (size - Math.min(AndroidUtilities.dp(4.0f) + ((Adapter.this.getItemCount() - 1) * size2), StickerCategoriesListView.this.shownButtonsAtStart * size2))), 1073741824), i3);
                    }
                };
            } else {
                StickerCategoriesListView stickerCategoriesListView = StickerCategoriesListView.this;
                categoryButton = stickerCategoriesListView.new CategoryButton(stickerCategoriesListView.getContext());
            }
            return new RecyclerListView.Holder(categoryButton);
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getItemViewType() == 1) {
                CategoryButton categoryButton = (CategoryButton) viewHolder.itemView;
                categoryButton.setSelected(StickerCategoriesListView.this.selectedCategoryIndex == viewHolder.getAdapterPosition() - 1, false);
                categoryButton.play(false);
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface CategoriesType {
        public static final int DEFAULT = 0;
        public static final int PROFILE_PHOTOS = 2;
        public static final int STATUS = 1;
        public static final int STICKERS = 3;
    }

    public class CategoryButton extends RLottieImageView {
        ValueAnimator backAnimator;
        private int imageColor;
        private int index;
        private long lastPlayed;
        ValueAnimator loadAnimator;
        float loadProgress;
        private boolean loaded;
        float pressedProgress;
        private ValueAnimator selectedAnimator;
        private float selectedT;

        public CategoryButton(Context context) {
            super(context);
            this.loaded = false;
            this.loadProgress = 1.0f;
            setImageColor(StickerCategoriesListView.this.isGlassDesign ? StickerCategoriesListView.this.getGlassIconColor(0.4f) : StickerCategoriesListView.this.getThemedColor(Theme.key_chat_emojiPanelIcon));
            setScaleType(ImageView.ScaleType.CENTER);
            setLayerNum(StickerCategoriesListView.this.layerNum);
        }

        public void lambda$onLoaded$2(ValueAnimator valueAnimator) {
            this.loadProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            invalidate();
        }

        public void lambda$set$0(boolean z, TLRPC.Document document) {
            setOnlyLastFrame(!z);
            setAnimation(document, 24, 24);
            playAnimation();
        }

        public void lambda$set$1() {
            if (this.loaded) {
                return;
            }
            this.loadProgress = 0.0f;
        }

        public void lambda$setPressed$4(ValueAnimator valueAnimator) {
            this.pressedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            invalidate();
        }

        public void lambda$setSelected$3(ValueAnimator valueAnimator) {
            updateSelectedT(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }

        public void updateSelectedT(float f) {
            this.selectedT = f;
            StickerCategoriesListView stickerCategoriesListView = StickerCategoriesListView.this;
            if (stickerCategoriesListView.isGlassDesign) {
                setImageColor(stickerCategoriesListView.getGlassIconColor(AndroidUtilities.lerp(0.4f, 0.8f, f)));
            } else {
                setImageColor(ColorUtils.blendARGB(this.selectedT, stickerCategoriesListView.getThemedColor(Theme.key_chat_emojiPanelIcon), StickerCategoriesListView.this.getThemedColor(Theme.key_chat_emojiPanelIconSelected)));
            }
            invalidate();
        }

        @Override
        public void draw(Canvas canvas) {
            updatePressedProgress();
            float scale = getScale();
            if (scale != 1.0f) {
                canvas.save();
                canvas.scale(scale, scale, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            }
            super.draw(canvas);
            if (scale != 1.0f) {
                canvas.restore();
            }
        }

        public float getScale() {
            return DiffUtil.m(1.0f, this.pressedProgress, 0.15f, 0.85f) * this.loadProgress;
        }

        @Override
        public void onLoaded() {
            int i = 2;
            this.loaded = true;
            if (this.loadProgress < 1.0f) {
                ValueAnimator valueAnimator = this.loadAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.loadAnimator = null;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.loadProgress, 1.0f);
                this.loadAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new StickerCategoriesListView$CategoryButton$$ExternalSyntheticLambda0(this, i));
                this.loadAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        CategoryButton categoryButton = CategoryButton.this;
                        categoryButton.loadProgress = 1.0f;
                        categoryButton.invalidate();
                        CategoryButton.this.loadAnimator = null;
                    }
                });
                this.loadAnimator.setDuration(320L);
                this.loadAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.loadAnimator.start();
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i2);
            super.onMeasure(OKLCH.m(4.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        }

        public void play(boolean z) {
            if (System.currentTimeMillis() - this.lastPlayed > 250 || z) {
                this.lastPlayed = System.currentTimeMillis();
                RLottieDrawable animatedDrawable = getAnimatedDrawable();
                if (animatedDrawable == null && getImageReceiver() != null) {
                    animatedDrawable = getImageReceiver().getLottieAnimation();
                }
                if (animatedDrawable != null) {
                    animatedDrawable.stop();
                    animatedDrawable.setCurrentFrame(0);
                    animatedDrawable.restart(true);
                } else if (animatedDrawable == null) {
                    setProgress(0.0f);
                    playAnimation();
                }
            }
        }

        public void set(EmojiCategory emojiCategory, int i, boolean z) {
            this.index = i;
            if (!TextUtils.isEmpty(emojiCategory.title)) {
                setContentDescription(emojiCategory.title);
            } else if (TextUtils.isEmpty(emojiCategory.emojis)) {
                setContentDescription(null);
            } else {
                setContentDescription(emojiCategory.emojis);
            }
            ValueAnimator valueAnimator = this.loadAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.loadAnimator = null;
            }
            if (emojiCategory.remote) {
                setImageResource(0);
                clearAnimationDrawable();
                final boolean zIsTabIconsAnimationEnabled = StickerCategoriesListView.this.isTabIconsAnimationEnabled(true);
                this.loaded = false;
                this.loadProgress = 1.0f;
                AnimatedEmojiDrawable.getDocumentFetcher(UserConfig.selectedAccount).fetchDocument(emojiCategory.documentId, new AnimatedEmojiDrawable.ReceivedDocument() {
                    @Override
                    public final void run(TLRPC.Document document) {
                        this.f$0.lambda$set$0(zIsTabIconsAnimationEnabled, document);
                    }
                });
                AndroidUtilities.runOnUIThread(new ShareAlert$23$$ExternalSyntheticLambda0(this, 6), 60L);
            } else if (emojiCategory.animated) {
                this.cached = false;
                setImageResource(0);
                setAnimation(emojiCategory.iconResId, 24, 24);
                playAnimation();
                this.loadProgress = 1.0f;
            } else {
                clearAnimationDrawable();
                setImageResource(emojiCategory.iconResId);
                this.loadProgress = 1.0f;
            }
            setSelected(z, false);
        }

        public void setImageColor(int i) {
            if (this.imageColor != i) {
                this.imageColor = i;
                setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
        }

        @Override
        public void setPressed(boolean z) {
            ValueAnimator valueAnimator;
            int i = 0;
            if (isPressed() != z) {
                super.setPressed(z);
                invalidate();
                StickerCategoriesListView.this.invalidate();
                if (z && (valueAnimator = this.backAnimator) != null) {
                    valueAnimator.removeAllListeners();
                    this.backAnimator.cancel();
                }
                if (z) {
                    return;
                }
                float f = this.pressedProgress;
                if (f != 0.0f) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 0.0f);
                    this.backAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new StickerCategoriesListView$CategoryButton$$ExternalSyntheticLambda0(this, i));
                    this.backAnimator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            CategoryButton.this.backAnimator = null;
                        }
                    });
                    zzkk.m(3.0f, this.backAnimator);
                    this.backAnimator.setDuration(350L);
                    this.backAnimator.start();
                }
            }
        }

        public void setSelected(boolean z, boolean z2) {
            int i = 1;
            if (Math.abs(this.selectedT - (z ? 1.0f : 0.0f)) > 0.01f) {
                ValueAnimator valueAnimator = this.selectedAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.selectedAnimator = null;
                }
                if (!z2) {
                    updateSelectedT(z ? 1.0f : 0.0f);
                    return;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.selectedT, z ? 1.0f : 0.0f);
                this.selectedAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new StickerCategoriesListView$CategoryButton$$ExternalSyntheticLambda0(this, i));
                this.selectedAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        CategoryButton categoryButton = CategoryButton.this;
                        categoryButton.updateSelectedT(((Float) categoryButton.selectedAnimator.getAnimatedValue()).floatValue());
                        CategoryButton.this.selectedAnimator = null;
                    }
                });
                this.selectedAnimator.setDuration(350L);
                this.selectedAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.selectedAnimator.start();
            }
        }

        public void updatePressedProgress() {
            if (isPressed()) {
                float f = this.pressedProgress;
                if (f != 1.0f) {
                    this.pressedProgress = Utilities.clamp(((1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f, 1.0f, 0.0f);
                    invalidate();
                    StickerCategoriesListView.this.invalidate();
                }
            }
        }
    }

    public static class EmojiCategory {
        public boolean animated;
        public long documentId;
        public String emojis;
        public boolean greeting;
        public int iconResId;
        public boolean premium;
        public boolean remote;
        public String title;

        public static EmojiCategory remote(TLRPC.EmojiGroup emojiGroup) {
            EmojiCategory emojiCategory = new EmojiCategory();
            emojiCategory.remote = true;
            emojiCategory.documentId = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                emojiCategory.emojis = "premium";
                emojiCategory.premium = true;
            } else {
                emojiCategory.emojis = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            emojiCategory.greeting = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            emojiCategory.title = emojiGroup.title;
            return emojiCategory;
        }

        public static EmojiCategory withAnimatedIcon(int i, String str) {
            EmojiCategory emojiCategory = new EmojiCategory();
            emojiCategory.animated = true;
            emojiCategory.iconResId = i;
            emojiCategory.emojis = str;
            return emojiCategory;
        }

        public static EmojiCategory withIcon(int i, String str) {
            EmojiCategory emojiCategory = new EmojiCategory();
            emojiCategory.animated = false;
            emojiCategory.iconResId = i;
            emojiCategory.emojis = str;
            return emojiCategory;
        }
    }

    public static class EmojiGroupFetcher extends CacheFetcher<Integer, TLRPC.TL_messages_emojiGroups> {
        private EmojiGroupFetcher() {
        }

        public static void lambda$getLocal$1(int i, Integer num, Utilities.Callback2 callback2) throws Throwable {
            SQLiteCursor sQLiteCursorQueryFinalized;
            TLRPC.messages_EmojiGroups messages_emojigroupsTLdeserialize;
            NativeByteBuffer nativeByteBufferByteBufferValue;
            SQLiteCursor sQLiteCursor = 0;
            sQLiteCursor = 0;
            SQLiteCursor sQLiteCursor2 = null;
            try {
                try {
                    SQLiteDatabase database = MessagesStorage.getInstance(i).getDatabase();
                    if (database != null) {
                        try {
                            sQLiteCursorQueryFinalized = database.queryFinalized("SELECT data FROM emoji_groups WHERE type = ?", num);
                            try {
                                if (!sQLiteCursorQueryFinalized.next() || (nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0)) == null) {
                                    messages_emojigroupsTLdeserialize = null;
                                } else {
                                    messages_emojigroupsTLdeserialize = TLRPC.messages_EmojiGroups.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), true);
                                    nativeByteBufferByteBufferValue.reuse();
                                }
                                if (messages_emojigroupsTLdeserialize instanceof TLRPC.TL_messages_emojiGroups) {
                                    TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) messages_emojigroupsTLdeserialize;
                                    callback2.run(Long.valueOf(tL_messages_emojiGroups.hash), tL_messages_emojiGroups);
                                } else {
                                    callback2.run(0L, null);
                                }
                                sQLiteCursor2 = sQLiteCursorQueryFinalized;
                            } catch (Exception e) {
                                e = e;
                                FileLog.e(e);
                                callback2.run(0L, null);
                                if (sQLiteCursorQueryFinalized != null) {
                                    sQLiteCursorQueryFinalized.dispose();
                                    return;
                                }
                                return;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            sQLiteCursorQueryFinalized = null;
                            FileLog.e(e);
                            callback2.run(0L, null);
                            if (sQLiteCursorQueryFinalized != null) {
                                sQLiteCursorQueryFinalized.dispose();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            if (sQLiteCursor != 0) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    }
                    if (sQLiteCursor2 != null) {
                        sQLiteCursor2.dispose();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteCursor = i;
                }
            } catch (Exception e3) {
                e = e3;
            } catch (Throwable th3) {
                th = th3;
            }
        }

        public static void lambda$getRemote$0(Utilities.Callback4 callback4, TLObject tLObject, TLRPC.TL_error tL_error) {
            if (tLObject instanceof TLRPC.TL_messages_emojiGroupsNotModified) {
                Boolean bool = Boolean.TRUE;
                callback4.run(bool, null, 0L, bool);
            } else if (!(tLObject instanceof TLRPC.TL_messages_emojiGroups)) {
                callback4.run(Boolean.FALSE, null, 0L, Boolean.TRUE);
            } else {
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) tLObject;
                callback4.run(Boolean.FALSE, tL_messages_emojiGroups, Long.valueOf(tL_messages_emojiGroups.hash), Boolean.TRUE);
            }
        }

        public static void lambda$setLocal$2(int i, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, Integer num) {
            try {
                SQLiteDatabase database = MessagesStorage.getInstance(i).getDatabase();
                if (database != null) {
                    if (tL_messages_emojiGroups == null) {
                        database.executeFast("DELETE FROM emoji_groups WHERE type = " + num).stepThis().dispose();
                        return;
                    }
                    SQLitePreparedStatement sQLitePreparedStatementExecuteFast = database.executeFast("REPLACE INTO emoji_groups VALUES(?, ?)");
                    sQLitePreparedStatementExecuteFast.requery();
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_emojiGroups.getObjectSize());
                    tL_messages_emojiGroups.serializeToStream(nativeByteBuffer);
                    sQLitePreparedStatementExecuteFast.bindInteger(1, num.intValue());
                    sQLitePreparedStatementExecuteFast.bindByteBuffer(2, nativeByteBuffer);
                    sQLitePreparedStatementExecuteFast.step();
                    nativeByteBuffer.reuse();
                    sQLitePreparedStatementExecuteFast.dispose();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public void getLocal(int i, Integer num, Utilities.Callback2<Long, TLRPC.TL_messages_emojiGroups> callback2) {
            MessagesStorage.getInstance(i).getStorageQueue().postRunnable(new SlotsDrawable$$ExternalSyntheticLambda9(i, num, callback2, 10));
        }

        @Override
        public void getRemote(int i, Integer num, long j, Utilities.Callback4<Boolean, TLRPC.TL_messages_emojiGroups, Long, Boolean> callback4) {
            TLObject tLObject;
            if (num.intValue() == 1) {
                TLRPC.TL_messages_getEmojiStatusGroups tL_messages_getEmojiStatusGroups = new TLRPC.TL_messages_getEmojiStatusGroups();
                tL_messages_getEmojiStatusGroups.hash = (int) j;
                tLObject = tL_messages_getEmojiStatusGroups;
            } else if (num.intValue() == 2) {
                TLRPC.TL_messages_getEmojiProfilePhotoGroups tL_messages_getEmojiProfilePhotoGroups = new TLRPC.TL_messages_getEmojiProfilePhotoGroups();
                tL_messages_getEmojiProfilePhotoGroups.hash = (int) j;
                tLObject = tL_messages_getEmojiProfilePhotoGroups;
            } else if (num.intValue() == 3) {
                TLRPC.TL_messages_getEmojiStickerGroups tL_messages_getEmojiStickerGroups = new TLRPC.TL_messages_getEmojiStickerGroups();
                tL_messages_getEmojiStickerGroups.hash = (int) j;
                tLObject = tL_messages_getEmojiStickerGroups;
            } else {
                TLRPC.TL_messages_getEmojiGroups tL_messages_getEmojiGroups = new TLRPC.TL_messages_getEmojiGroups();
                tL_messages_getEmojiGroups.hash = (int) j;
                tLObject = tL_messages_getEmojiGroups;
            }
            ConnectionsManager.getInstance(i).sendRequest(tLObject, new StickerCategoriesListView$EmojiSearch$$ExternalSyntheticLambda0(callback4, 1));
        }

        @Override
        public void setLocal(int i, Integer num, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j) {
            MessagesStorage.getInstance(i).getStorageQueue().postRunnable(new SlotsDrawable$$ExternalSyntheticLambda9(i, tL_messages_emojiGroups, num, 9));
        }
    }

    public static class EmojiSearch extends CacheFetcher<String, TLRPC.TL_emojiList> {
        private EmojiSearch() {
        }

        public static void lambda$getRemote$0(Utilities.Callback4 callback4, TLObject tLObject, TLRPC.TL_error tL_error) {
            if (tLObject instanceof TLRPC.TL_emojiListNotModified) {
                Boolean bool = Boolean.TRUE;
                callback4.run(bool, null, 0L, bool);
            } else if (!(tLObject instanceof TLRPC.TL_emojiList)) {
                callback4.run(Boolean.FALSE, null, 0L, Boolean.TRUE);
            } else {
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) tLObject;
                callback4.run(Boolean.FALSE, tL_emojiList, Long.valueOf(tL_emojiList.hash), Boolean.TRUE);
            }
        }

        @Override
        public void getRemote(int i, String str, long j, Utilities.Callback4<Boolean, TLRPC.TL_emojiList, Long, Boolean> callback4) {
            TLRPC.TL_messages_searchCustomEmoji tL_messages_searchCustomEmoji = new TLRPC.TL_messages_searchCustomEmoji();
            tL_messages_searchCustomEmoji.emoticon = str;
            tL_messages_searchCustomEmoji.hash = j;
            ConnectionsManager.getInstance(i).sendRequest(tL_messages_searchCustomEmoji, new StickerCategoriesListView$EmojiSearch$$ExternalSyntheticLambda0(callback4, 0));
        }
    }

    static {
        fetcher = new EmojiGroupFetcher();
        search = new EmojiSearch();
    }

    public StickerCategoriesListView(Context context, int i) {
        this(context, null, i, null);
    }

    private void drawSelectedHighlight(Canvas canvas) {
        float f = this.selectedAlpha.set(this.selectedCategoryIndex >= 0 ? 1.0f : 0.0f);
        int i = this.selectedCategoryIndex;
        float f2 = i >= 0 ? this.selectedIndex.set(i) : this.selectedIndex.get();
        if (f <= 0.0f) {
            return;
        }
        float f3 = f2 + 1.0f;
        double d = f3;
        int iMax = Math.max(1, (int) Math.floor(d));
        int iMax2 = Math.max(1, (int) Math.ceil(d));
        View view = null;
        View view2 = null;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            int childAdapterPosition = getChildAdapterPosition(childAt);
            if (childAdapterPosition == iMax) {
                view = childAt;
            }
            if (childAdapterPosition == iMax2) {
                view2 = childAt;
            }
            if (view != null && view2 != null) {
                break;
            }
        }
        int alpha = this.selectedPaint.getAlpha();
        this.selectedPaint.setAlpha((int) (alpha * f));
        if (view != null && view2 != null) {
            float f4 = iMax == iMax2 ? 0.5f : (f3 - iMax) / (iMax2 - iMax);
            getChildBounds(view, this.rect1);
            getChildBounds(view2, this.rect2);
            AndroidUtilities.lerp(this.rect1, this.rect2, f4, this.rect3);
            canvas.drawRoundRect(this.rect3, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), this.selectedPaint);
        }
        this.selectedPaint.setAlpha(alpha);
    }

    private void getChildBounds(View view, RectF rectF) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float width = ((view.getWidth() / 2.0f) - AndroidUtilities.dp(1.0f)) * (view instanceof CategoryButton ? ((CategoryButton) view).getScale() : 1.0f);
        rectF.set(left - width, top - width, left + width, top + width);
    }

    public int getGlassIconColor(float f) {
        return ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_glass_defaultIcon, this.resourcesProvider), (int) (f * 255.0f));
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (!(childAt instanceof CategoryButton)) {
            return -childAt.getLeft();
        }
        return Math.max(0, getHeight() * (getChildAdapterPosition(childAt) - 1)) + this.paddingWidth + (-childAt.getLeft());
    }

    public void lambda$new$2(EmojiCategory[] emojiCategoryArr, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j) {
        this.categories = new EmojiCategory[tL_messages_emojiGroups.groups.size() + (emojiCategoryArr == null ? 0 : emojiCategoryArr.length)];
        int i = 0;
        if (emojiCategoryArr != null) {
            while (i < emojiCategoryArr.length) {
                this.categories[i] = emojiCategoryArr[i];
                i++;
            }
        }
        for (int i2 = 0; i2 < tL_messages_emojiGroups.groups.size(); i2++) {
            this.categories[i + i2] = EmojiCategory.remote(tL_messages_emojiGroups.groups.get(i2));
        }
        this.categories = preprocessCategories(this.categories);
        this.adapter.notifyDataSetChanged();
        setCategoriesShownT(0.0f);
        updateCategoriesShown(this.categoriesShouldShow, System.currentTimeMillis() - j > 16);
    }

    public void lambda$new$3(EmojiCategory[] emojiCategoryArr, long j, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups) {
        if (tL_messages_emojiGroups != null) {
            NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new TopicsTabsView$$ExternalSyntheticLambda0(this, emojiCategoryArr, tL_messages_emojiGroups, j, 2));
        }
    }

    public static void lambda$preload$0(int i, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups) {
        ArrayList<TLRPC.EmojiGroup> arrayList;
        if (tL_messages_emojiGroups == null || (arrayList = tL_messages_emojiGroups.groups) == null) {
            return;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            TLRPC.EmojiGroup emojiGroup = arrayList.get(i2);
            i2++;
            AnimatedEmojiDrawable.getDocumentFetcher(i).fetchDocument(emojiGroup.icon_emoji_id, null);
        }
    }

    public void lambda$scrollToSelected$4(int i) {
        onScrolled(i, 0);
    }

    public void lambda$updateCategoriesShown$5(ValueAnimator valueAnimator) {
        setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void lambda$new$1(int i, View view) {
        EmojiCategory[] emojiCategoryArr;
        if (i >= 1 && (emojiCategoryArr = this.categories) != null) {
            EmojiCategory emojiCategory = emojiCategoryArr[i - 1];
            int iDp = AndroidUtilities.dp(64.0f);
            if (getMeasuredWidth() - view.getRight() < iDp) {
                smoothScrollBy(iDp - (getMeasuredWidth() - view.getRight()), 0, CubicBezierInterpolator.EASE_OUT_QUINT);
            } else if (view.getLeft() < iDp) {
                smoothScrollBy(-(iDp - view.getLeft()), 0, CubicBezierInterpolator.EASE_OUT_QUINT);
            }
            Utilities.Callback<EmojiCategory> callback = this.onCategoryClick;
            if (callback != null) {
                callback.run(emojiCategory);
            }
        }
    }

    public static void preload(final int i, int i2) {
        fetcher.fetch(i, Integer.valueOf(i2), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StickerCategoriesListView.lambda$preload$0(i, (TLRPC.TL_messages_emojiGroups) obj);
            }
        });
    }

    public void setCategoriesShownT(float f) {
        this.categoriesShownT = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof CategoryButton) {
                float fCascade = AndroidUtilities.cascade(f, (getChildCount() - 1) - getChildAdapterPosition(childAt), getChildCount() - 1, 3.0f);
                if (fCascade > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((CategoryButton) childAt).play(false);
                }
                childAt.setAlpha(fCascade);
                childAt.setScaleX(fCascade);
                childAt.setScaleY(fCascade);
            }
        }
        invalidate();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View viewFindChildViewUnder = findChildViewUnder(motionEvent.getX(), motionEvent.getY());
            if (!(viewFindChildViewUnder instanceof CategoryButton) || viewFindChildViewUnder.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public void draw(Canvas canvas) {
        Canvas canvas2;
        Drawable drawable;
        if (this.backgroundPaint != null) {
            int iMin = Integer.MAX_VALUE;
            int iMax = Integer.MIN_VALUE;
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof CategoryButton) {
                    iMin = Math.min(iMin, childAt.getLeft());
                    iMax = Math.max(iMax, childAt.getRight());
                }
            }
            if (iMin < iMax) {
                int iM = (int) DiffUtil.m(1.0f, this.categoriesShownT, AndroidUtilities.dp(32.0f) + getWidth(), iMin);
                int iM2 = (int) DiffUtil.m(1.0f, this.categoriesShownT, AndroidUtilities.dp(32.0f) + getWidth(), iMax);
                canvas2 = canvas;
                canvas2.drawRect(iM, 0.0f, iM2, getHeight(), this.backgroundPaint);
                if (iM2 < getWidth() && (drawable = this.leftBoundDrawable) != null) {
                    drawable.setAlpha(255);
                    Drawable drawable2 = this.leftBoundDrawable;
                    drawable2.setBounds(iM2, 0, drawable2.getIntrinsicWidth() + iM2, getHeight());
                    this.leftBoundDrawable.draw(canvas2);
                }
            } else {
                canvas2 = canvas;
            }
        } else {
            canvas2 = canvas;
        }
        drawSelectedHighlight(canvas2);
        super.draw(canvas2);
        Drawable drawable3 = this.leftBoundDrawable;
        if (drawable3 != null) {
            drawable3.setAlpha((int) (this.leftBoundAlpha.set((canScrollHorizontally(-1) && this.scrolledFully) ? 1.0f : 0.0f) * 255.0f * this.categoriesShownT));
            if (this.leftBoundDrawable.getAlpha() > 0) {
                Drawable drawable4 = this.leftBoundDrawable;
                drawable4.setBounds(0, 0, drawable4.getIntrinsicWidth(), getHeight());
                this.leftBoundDrawable.draw(canvas2);
            }
        }
    }

    public int getCategoryIndex() {
        return this.selectedCategoryIndex;
    }

    public EmojiCategory getSelectedCategory() {
        int i;
        EmojiCategory[] emojiCategoryArr = this.categories;
        if (emojiCategoryArr == null || (i = this.selectedCategoryIndex) < 0 || i >= emojiCategoryArr.length) {
            return null;
        }
        return emojiCategoryArr[i];
    }

    public boolean isCategoriesShown() {
        return this.categoriesShownT > 0.5f;
    }

    public boolean isScrolledIntoOccupiedWidth() {
        return this.scrolledIntoOccupiedWidth;
    }

    public boolean isTabIconsAnimationEnabled(boolean z) {
        return LiteMode.isEnabled(16388);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateCategoriesShown(this.categoriesShouldShow, false);
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View view = this.paddingView;
        if (view != null) {
            view.requestLayout();
        }
    }

    @Override
    public void onScrolled(int i, int i2) {
        boolean z;
        boolean z2;
        Utilities.Callback<Integer> callback;
        super.onScrolled(i, i2);
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            z2 = true;
            if (childAt instanceof CategoryButton) {
                z = true;
            } else if (childAt.getRight() <= this.dontOccupyWidth) {
                z = false;
            } else {
                z = false;
                z2 = false;
            }
        } else {
            z = false;
            z2 = false;
        }
        boolean z3 = this.scrolledIntoOccupiedWidth;
        if (z3 != z2) {
            this.scrolledIntoOccupiedWidth = z2;
            Utilities.Callback<Integer> callback2 = this.onScrollIntoOccupiedWidth;
            if (callback2 != null) {
                callback2.run(Integer.valueOf(z2 ? Math.max(0, getScrollToStartWidth() - (this.paddingWidth - this.dontOccupyWidth)) : 0));
            }
            invalidate();
        } else if (z3 && (callback = this.onScrollIntoOccupiedWidth) != null) {
            callback.run(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.paddingWidth - this.dontOccupyWidth))));
        }
        if (this.scrolledFully != z) {
            this.scrolledFully = z;
            Utilities.Callback<Boolean> callback3 = this.onScrollFully;
            if (callback3 != null) {
                callback3.run(Boolean.valueOf(z));
            }
            invalidate();
        }
    }

    public EmojiCategory[] preprocessCategories(EmojiCategory[] emojiCategoryArr) {
        return emojiCategoryArr;
    }

    public void scrollToSelected() {
        int iDp = (AndroidUtilities.dp(34.0f) * this.selectedCategoryIndex) + ((-getScrollToStartWidth()) - Math.max(0, this.dontOccupyWidth));
        scrollBy(iDp, 0);
        post(new EmojiView$$ExternalSyntheticLambda9(this, iDp, 15));
    }

    public void scrollToStart() {
        smoothScrollBy(-getScrollToStartWidth(), 0, CubicBezierInterpolator.EASE_OUT_QUINT);
    }

    public void selectCategory(EmojiCategory emojiCategory) {
        int i;
        if (this.categories != null) {
            i = 0;
            while (true) {
                EmojiCategory[] emojiCategoryArr = this.categories;
                if (i >= emojiCategoryArr.length) {
                    break;
                } else if (emojiCategoryArr[i] != emojiCategory) {
                    i++;
                }
            }
            i = -1;
        } else {
            i = -1;
        }
        selectCategory(i);
    }

    @Override
    public void setBackgroundColor(int i) {
        if (this.backgroundPaint == null) {
            this.backgroundPaint = new Paint(1);
        }
        this.backgroundPaint.setColor(i);
        Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.gradient_right).mutate();
        this.leftBoundDrawable = drawableMutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(i, mode));
        Drawable drawableMutate2 = getContext().getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.rightBoundDrawable = drawableMutate2;
        drawableMutate2.setColorFilter(new PorterDuffColorFilter(i, mode));
    }

    public void setDontOccupyWidth(int i) {
        this.dontOccupyWidth = i;
    }

    public void setOnCategoryClick(Utilities.Callback<EmojiCategory> callback) {
        this.onCategoryClick = callback;
    }

    public void setOnScrollFully(Utilities.Callback<Boolean> callback) {
        this.onScrollFully = callback;
    }

    public void setOnScrollIntoOccupiedWidth(Utilities.Callback<Integer> callback) {
        this.onScrollIntoOccupiedWidth = callback;
    }

    public void setShownButtonsAtStart(float f) {
        this.shownButtonsAtStart = f;
    }

    public void updateCategoriesShown(boolean z, boolean z2) {
        this.categoriesShouldShow = z;
        ?? r5 = z;
        if (this.categories == null) {
            r5 = 0;
        }
        if (this.categoriesShownT == ((float) r5)) {
            return;
        }
        ValueAnimator valueAnimator = this.categoriesShownAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.categoriesShownAnimator = null;
        }
        if (!z2) {
            setCategoriesShownT(r5 != 0 ? 1.0f : 0.0f);
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.categoriesShownT, r5 != 0 ? 1.0f : 0.0f);
        this.categoriesShownAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda6(this, 29));
        this.categoriesShownAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                StickerCategoriesListView stickerCategoriesListView = StickerCategoriesListView.this;
                stickerCategoriesListView.setCategoriesShownT(((Float) stickerCategoriesListView.categoriesShownAnimator.getAnimatedValue()).floatValue());
                StickerCategoriesListView.this.categoriesShownAnimator = null;
            }
        });
        this.categoriesShownAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        ValueAnimator valueAnimator2 = this.categoriesShownAnimator;
        EmojiCategory[] emojiCategoryArr = this.categories;
        valueAnimator2.setDuration(((long) (emojiCategoryArr == null ? 5 : emojiCategoryArr.length)) * 120);
        this.categoriesShownAnimator.start();
    }

    public StickerCategoriesListView(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        this(context, null, i, resourcesProvider);
    }

    public StickerCategoriesListView(Context context, EmojiCategory[] emojiCategoryArr, int i) {
        this(context, emojiCategoryArr, i, null);
    }

    public StickerCategoriesListView(Context context, final EmojiCategory[] emojiCategoryArr, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider);
        this.shownButtonsAtStart = 6.5f;
        this.categories = null;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.leftBoundAlpha = new AnimatedFloat(this, 360L, cubicBezierInterpolator);
        this.rightBoundAlpha = new AnimatedFloat(this, 360L, cubicBezierInterpolator);
        this.selectedPaint = new Paint(1);
        this.selectedCategoryIndex = -1;
        this.categoriesShownT = 0.0f;
        this.categoriesShouldShow = true;
        this.selectedAlpha = new AnimatedFloat(this, 350L, cubicBezierInterpolator);
        this.selectedIndex = new AnimatedFloat(this, 350L, cubicBezierInterpolator);
        this.rect1 = new RectF();
        this.rect2 = new RectF();
        this.rect3 = new RectF();
        this.categoriesType = i;
        setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
        Adapter adapter = new Adapter();
        this.adapter = adapter;
        setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.layoutManager = linearLayoutManager;
        setLayoutManager(linearLayoutManager);
        this.layoutManager.setOrientation(0);
        setSelectorRadius(AndroidUtilities.dp(15.0f));
        setSelectorType(1);
        int i2 = Theme.key_listSelector;
        setSelectorDrawableColor(getThemedColor(i2));
        this.selectedPaint.setColor(getThemedColor(i2));
        setWillNotDraw(false);
        setOnItemClickListener(new StarAppsSheet$$ExternalSyntheticLambda0(this, 15));
        final long jCurrentTimeMillis = System.currentTimeMillis();
        fetcher.fetch(UserConfig.selectedAccount, Integer.valueOf(i), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$new$3(emojiCategoryArr, jCurrentTimeMillis, (TLRPC.TL_messages_emojiGroups) obj);
            }
        });
    }

    public void selectCategory(int i) {
        if (this.selectedCategoryIndex < 0 && i >= 0) {
            this.selectedIndex.set(i, true);
        }
        this.selectedCategoryIndex = i;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof CategoryButton) {
                ((CategoryButton) childAt).setSelected(this.selectedCategoryIndex == getChildAdapterPosition(childAt) - 1, true);
            }
        }
        invalidate();
    }
}

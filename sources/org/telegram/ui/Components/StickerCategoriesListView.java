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
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheFetcher;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.EmojiThemes$$ExternalSyntheticLambda0;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatLinkActivity$$ExternalSyntheticLambda4;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda17;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda17;
import org.telegram.ui.QrActivity;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;

public abstract class StickerCategoriesListView extends RecyclerListView {
    public static final EmojiGroupFetcher fetcher = new EmojiGroupFetcher();
    public static final EmojiSearch search = new EmojiSearch();
    public final Adapter adapter;
    public Paint backgroundPaint;
    public EmojiCategory[] categories;
    public boolean categoriesShouldShow;
    public ValueAnimator categoriesShownAnimator;
    public float categoriesShownT;
    public int dontOccupyWidth;
    public boolean isGlassDesign;
    public final AnimatedFloat leftBoundAlpha;
    public Drawable leftBoundDrawable;
    public Utilities.Callback onCategoryClick;
    public Utilities.Callback onScrollFully;
    public Utilities.Callback onScrollIntoOccupiedWidth;
    public QrActivity.AnonymousClass2 paddingView;
    public int paddingWidth;
    public final RectF rect1;
    public final RectF rect2;
    public final RectF rect3;
    public Drawable rightBoundDrawable;
    public boolean scrolledFully;
    public boolean scrolledIntoOccupiedWidth;
    public final AnimatedFloat selectedAlpha;
    public int selectedCategoryIndex;
    public final AnimatedFloat selectedIndex;
    public final Paint selectedPaint;
    public float shownButtonsAtStart;

    public final class Adapter extends RecyclerListView.SelectionAdapter {
        public int lastItemCount;

        public Adapter() {
        }

        @Override
        public final int getItemCount() {
            StickerCategoriesListView stickerCategoriesListView = StickerCategoriesListView.this;
            EmojiCategory[] emojiCategoryArr = stickerCategoriesListView.categories;
            int length = (emojiCategoryArr == null ? 0 : emojiCategoryArr.length) + 1;
            if (length != this.lastItemCount) {
                QrActivity.AnonymousClass2 anonymousClass2 = stickerCategoriesListView.paddingView;
                if (anonymousClass2 != null) {
                    anonymousClass2.requestLayout();
                }
                this.lastItemCount = length;
            }
            return length;
        }

        @Override
        public final int getItemViewType(int i) {
            return i == 0 ? 0 : 1;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.mItemViewType == 1;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            StickerCategoriesListView stickerCategoriesListView;
            EmojiCategory[] emojiCategoryArr;
            if (viewHolder.mItemViewType != 1 || (emojiCategoryArr = (stickerCategoriesListView = StickerCategoriesListView.this).categories) == null) {
                return;
            }
            int i2 = i - 1;
            EmojiCategory emojiCategory = emojiCategoryArr[i2];
            final CategoryButton categoryButton = (CategoryButton) viewHolder.itemView;
            boolean z = stickerCategoriesListView.selectedCategoryIndex == i2;
            categoryButton.getClass();
            if (!TextUtils.isEmpty(emojiCategory.title)) {
                categoryButton.setContentDescription(emojiCategory.title);
            } else if (TextUtils.isEmpty(emojiCategory.emojis)) {
                categoryButton.setContentDescription(null);
            } else {
                categoryButton.setContentDescription(emojiCategory.emojis);
            }
            ValueAnimator valueAnimator = categoryButton.loadAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                categoryButton.loadAnimator = null;
            }
            categoryButton.setImageResource(0);
            categoryButton.clearAnimationDrawable();
            final boolean zIsTabIconsAnimationEnabled = StickerCategoriesListView.this.isTabIconsAnimationEnabled();
            categoryButton.loaded = false;
            categoryButton.loadProgress = 1.0f;
            AnimatedEmojiDrawable.getDocumentFetcher(UserConfig.selectedAccount).fetchDocument(emojiCategory.documentId, new AnimatedEmojiDrawable.ReceivedDocument() {
                @Override
                public final void run(TLRPC.Document document) {
                    boolean z2 = !zIsTabIconsAnimationEnabled;
                    StickerCategoriesListView.CategoryButton categoryButton2 = categoryButton;
                    categoryButton2.setOnlyLastFrame(z2);
                    categoryButton2.setAnimation(24, 24, document);
                    categoryButton2.playAnimation();
                }
            });
            AndroidUtilities.runOnUIThread(new SeekBarView$$ExternalSyntheticLambda1(categoryButton, 24), 60L);
            categoryButton.setSelected(z, false);
            categoryButton.setAlpha(stickerCategoriesListView.categoriesShownT);
            categoryButton.setScaleX(stickerCategoriesListView.categoriesShownT);
            categoryButton.setScaleY(stickerCategoriesListView.categoriesShownT);
            categoryButton.play();
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View categoryButton;
            StickerCategoriesListView stickerCategoriesListView = StickerCategoriesListView.this;
            if (i == 0) {
                QrActivity.AnonymousClass2 anonymousClass2 = new QrActivity.AnonymousClass2(this, stickerCategoriesListView.getContext(), 17);
                stickerCategoriesListView.paddingView = anonymousClass2;
                categoryButton = anonymousClass2;
            } else {
                categoryButton = stickerCategoriesListView.new CategoryButton(stickerCategoriesListView.getContext());
            }
            return new RecyclerListView.Holder(categoryButton);
        }

        @Override
        public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.mItemViewType == 1) {
                CategoryButton categoryButton = (CategoryButton) viewHolder.itemView;
                categoryButton.setSelected(StickerCategoriesListView.this.selectedCategoryIndex == viewHolder.getAdapterPosition() - 1, false);
                categoryButton.play();
            }
        }
    }

    public final class CategoryButton extends RLottieImageView {
        public ValueAnimator backAnimator;
        public int imageColor;
        public long lastPlayed;
        public ValueAnimator loadAnimator;
        public float loadProgress;
        public boolean loaded;
        public float pressedProgress;
        public ValueAnimator selectedAnimator;
        public float selectedT;

        public final class AnonymousClass1 extends AnimatorListenerAdapter {
            public final int $r8$classId;
            public final CategoryButton this$1;

            public AnonymousClass1(CategoryButton categoryButton, int i) {
                this.$r8$classId = i;
                this.this$1 = categoryButton;
            }

            @Override
            public final void onAnimationEnd(Animator animator) {
                switch (this.$r8$classId) {
                    case 0:
                        CategoryButton categoryButton = this.this$1;
                        categoryButton.loadProgress = 1.0f;
                        categoryButton.invalidate();
                        categoryButton.loadAnimator = null;
                        break;
                    case 1:
                        CategoryButton categoryButton2 = this.this$1;
                        categoryButton2.updateSelectedT(((Float) categoryButton2.selectedAnimator.getAnimatedValue()).floatValue());
                        categoryButton2.selectedAnimator = null;
                        break;
                    default:
                        super.onAnimationEnd(animator);
                        this.this$1.backAnimator = null;
                        break;
                }
            }
        }

        public CategoryButton(Context context) {
            super(context);
            this.loaded = false;
            this.loadProgress = 1.0f;
            boolean z = StickerCategoriesListView.this.isGlassDesign;
            Theme.ResourcesProvider resourcesProvider = StickerCategoriesListView.this.resourcesProvider;
            int alphaComponent = z ? ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_glass_defaultIcon, resourcesProvider), (int) 102.0f) : Theme.getColor(Theme.key_chat_emojiPanelIcon, resourcesProvider);
            if (this.imageColor != alphaComponent) {
                this.imageColor = alphaComponent;
                setColorFilter(new PorterDuffColorFilter(alphaComponent, PorterDuff.Mode.SRC_IN));
            }
            setScaleType(ImageView.ScaleType.CENTER);
            setLayerNum(null);
        }

        @Override
        public final void draw(Canvas canvas) {
            if (isPressed()) {
                float f = this.pressedProgress;
                if (f != 1.0f) {
                    this.pressedProgress = Utilities.clamp(((1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f, 1.0f, 0.0f);
                    invalidate();
                    StickerCategoriesListView.this.invalidate();
                }
            }
            float fM = DiffUtil.m(1.0f, this.pressedProgress, 0.15f, 0.85f) * this.loadProgress;
            if (fM != 1.0f) {
                canvas.save();
                canvas.scale(fM, fM, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            }
            super.draw(canvas);
            if (fM != 1.0f) {
                canvas.restore();
            }
        }

        @Override
        public final void onLoaded() {
            int i = 0;
            this.loaded = true;
            if (this.loadProgress < 1.0f) {
                ValueAnimator valueAnimator = this.loadAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.loadAnimator = null;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.loadProgress, 1.0f);
                this.loadAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new StickerCategoriesListView$CategoryButton$$ExternalSyntheticLambda0(this, 2));
                this.loadAnimator.addListener(new AnonymousClass1(this, i));
                this.loadAnimator.setDuration(320L);
                this.loadAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.loadAnimator.start();
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i2);
            super.onMeasure(OKLCH.m(size, 4.0f, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        }

        public final void play() {
            if (System.currentTimeMillis() - this.lastPlayed <= 250) {
                return;
            }
            this.lastPlayed = System.currentTimeMillis();
            RLottieDrawable animatedDrawable = getAnimatedDrawable();
            if (animatedDrawable == null && getImageReceiver() != null) {
                animatedDrawable = getImageReceiver().getLottieAnimation();
            }
            if (animatedDrawable != null) {
                animatedDrawable.isRunning = false;
                animatedDrawable.checkChoreographer$1();
                animatedDrawable.setCurrentFrame(0, true, false);
                animatedDrawable.restart(true);
                return;
            }
            if (animatedDrawable == null) {
                setProgress(0.0f);
                playAnimation();
            }
        }

        @Override
        public final void setPressed(boolean z) {
            ValueAnimator valueAnimator;
            int i = 2;
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
                    valueAnimatorOfFloat.addUpdateListener(new StickerCategoriesListView$CategoryButton$$ExternalSyntheticLambda0(this, 0));
                    this.backAnimator.addListener(new AnonymousClass1(this, i));
                    this.backAnimator.setInterpolator(new OvershootInterpolator(3.0f));
                    this.backAnimator.setDuration(350L);
                    this.backAnimator.start();
                }
            }
        }

        public final void setSelected(boolean z, boolean z2) {
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
                valueAnimatorOfFloat.addUpdateListener(new StickerCategoriesListView$CategoryButton$$ExternalSyntheticLambda0(this, 1));
                this.selectedAnimator.addListener(new AnonymousClass1(this, i));
                this.selectedAnimator.setDuration(350L);
                this.selectedAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.selectedAnimator.start();
            }
        }

        public final void updateSelectedT(float f) {
            this.selectedT = f;
            StickerCategoriesListView stickerCategoriesListView = StickerCategoriesListView.this;
            boolean z = stickerCategoriesListView.isGlassDesign;
            Theme.ResourcesProvider resourcesProvider = stickerCategoriesListView.resourcesProvider;
            if (z) {
                int alphaComponent = ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_glass_defaultIcon, resourcesProvider), (int) (AndroidUtilities.lerp(0.4f, 0.8f, f) * 255.0f));
                if (this.imageColor != alphaComponent) {
                    this.imageColor = alphaComponent;
                    setColorFilter(new PorterDuffColorFilter(alphaComponent, PorterDuff.Mode.SRC_IN));
                }
            } else {
                int iBlendARGB = ColorUtils.blendARGB(this.selectedT, Theme.getColor(Theme.key_chat_emojiPanelIcon, resourcesProvider), Theme.getColor(Theme.key_chat_emojiPanelIconSelected, stickerCategoriesListView.resourcesProvider));
                if (this.imageColor != iBlendARGB) {
                    this.imageColor = iBlendARGB;
                    setColorFilter(new PorterDuffColorFilter(iBlendARGB, PorterDuff.Mode.SRC_IN));
                }
            }
            invalidate();
        }
    }

    public final class EmojiCategory {
        public long documentId;
        public String emojis;
        public boolean greeting;
        public String title;
    }

    public final class EmojiGroupFetcher extends CacheFetcher {
        @Override
        public final void getLocal(int i, Object obj, Utilities.Callback2 callback2) {
            MessagesStorage.getInstance(i).getStorageQueue().postRunnable(new PollItemMenu$$ExternalSyntheticLambda17(i, (Integer) obj, callback2, 10));
        }

        @Override
        public final void getRemote(int i, Object obj, long j, Utilities.Callback4 callback4) {
            TLObject tLObject;
            Integer num = (Integer) obj;
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
        public final void setLocal(int i, Object obj, Object obj2, long j) {
            MessagesStorage.getInstance(i).getStorageQueue().postRunnable(new PollItemMenu$$ExternalSyntheticLambda17(i, (TLRPC.TL_messages_emojiGroups) obj2, (Integer) obj, 9));
        }
    }

    public final class EmojiSearch extends CacheFetcher {
        @Override
        public final void getRemote(int i, Object obj, long j, Utilities.Callback4 callback4) {
            TLRPC.TL_messages_searchCustomEmoji tL_messages_searchCustomEmoji = new TLRPC.TL_messages_searchCustomEmoji();
            tL_messages_searchCustomEmoji.emoticon = (String) obj;
            tL_messages_searchCustomEmoji.hash = j;
            ConnectionsManager.getInstance(i).sendRequest(tL_messages_searchCustomEmoji, new StickerCategoriesListView$EmojiSearch$$ExternalSyntheticLambda0(callback4, 0));
        }
    }

    static {
        new HashSet();
    }

    public StickerCategoriesListView(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider);
        this.shownButtonsAtStart = 6.5f;
        this.categories = null;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.leftBoundAlpha = new AnimatedFloat(360L, this, cubicBezierInterpolator);
        Paint paint = new Paint(1);
        this.selectedPaint = paint;
        this.selectedCategoryIndex = -1;
        this.categoriesShownT = 0.0f;
        this.categoriesShouldShow = true;
        this.selectedAlpha = new AnimatedFloat(350L, this, cubicBezierInterpolator);
        this.selectedIndex = new AnimatedFloat(350L, this, cubicBezierInterpolator);
        this.rect1 = new RectF();
        this.rect2 = new RectF();
        this.rect3 = new RectF();
        setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
        Adapter adapter = new Adapter();
        this.adapter = adapter;
        setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        setLayoutManager(linearLayoutManager);
        linearLayoutManager.setOrientation(0);
        setSelectorRadius(AndroidUtilities.dp(15.0f));
        setSelectorType(1);
        int i2 = Theme.key_listSelector;
        setSelectorDrawableColor(Theme.getColor(i2, this.resourcesProvider));
        paint.setColor(Theme.getColor(i2, this.resourcesProvider));
        setWillNotDraw(false);
        setOnItemClickListener(new ChatLinkActivity$$ExternalSyntheticLambda4(this, 29));
        long jCurrentTimeMillis = System.currentTimeMillis();
        fetcher.fetch(UserConfig.selectedAccount, Integer.valueOf(i), new EmojiThemes$$ExternalSyntheticLambda0(this, jCurrentTimeMillis, 1));
    }

    public static void getChildBounds(View view, RectF rectF) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float fM = 1.0f;
        float width = (view.getWidth() / 2.0f) - AndroidUtilities.dp(1.0f);
        if (view instanceof CategoryButton) {
            CategoryButton categoryButton = (CategoryButton) view;
            fM = DiffUtil.m(1.0f, categoryButton.pressedProgress, 0.15f, 0.85f) * categoryButton.loadProgress;
        }
        float f = width * fM;
        rectF.set(left - f, top - f, left + f, top + f);
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (!(childAt instanceof CategoryButton)) {
            return -childAt.getLeft();
        }
        return Math.max(0, getHeight() * (RecyclerView.getChildAdapterPosition(childAt) - 1)) + this.paddingWidth + (-childAt.getLeft());
    }

    public void setCategoriesShownT(float f) {
        this.categoriesShownT = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof CategoryButton) {
                float fCascade = AndroidUtilities.cascade(f, (getChildCount() - 1) - RecyclerView.getChildAdapterPosition(childAt), getChildCount() - 1, 3.0f);
                if (fCascade > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((CategoryButton) childAt).play();
                }
                childAt.setAlpha(fCascade);
                childAt.setScaleX(fCascade);
                childAt.setScaleY(fCascade);
            }
        }
        invalidate();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View viewFindChildViewUnder = findChildViewUnder(motionEvent.getX(), motionEvent.getY());
            if (!(viewFindChildViewUnder instanceof CategoryButton) || viewFindChildViewUnder.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(Canvas canvas) {
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
        float f = this.selectedAlpha.set(this.selectedCategoryIndex >= 0 ? 1.0f : 0.0f, false);
        int i2 = this.selectedCategoryIndex;
        AnimatedFloat animatedFloat = this.selectedIndex;
        float f2 = i2 >= 0 ? animatedFloat.set(i2, false) : animatedFloat.value;
        if (f > 0.0f) {
            float f3 = f2 + 1.0f;
            double d = f3;
            int iMax2 = Math.max(1, (int) Math.floor(d));
            int iMax3 = Math.max(1, (int) Math.ceil(d));
            View view = null;
            View view2 = null;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt2 = getChildAt(i3);
                int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt2);
                if (childAdapterPosition == iMax2) {
                    view = childAt2;
                }
                if (childAdapterPosition == iMax3) {
                    view2 = childAt2;
                }
                if (view != null && view2 != null) {
                    break;
                }
            }
            Paint paint = this.selectedPaint;
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * f));
            if (view != null && view2 != null) {
                float f4 = iMax2 == iMax3 ? 0.5f : (f3 - iMax2) / (iMax3 - iMax2);
                RectF rectF = this.rect1;
                getChildBounds(view, rectF);
                RectF rectF2 = this.rect2;
                getChildBounds(view2, rectF2);
                RectF rectF3 = this.rect3;
                AndroidUtilities.lerp(rectF, rectF2, f4, rectF3);
                canvas2.drawRoundRect(rectF3, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), paint);
            }
            paint.setAlpha(alpha);
        }
        super.draw(canvas2);
        Drawable drawable3 = this.leftBoundDrawable;
        if (drawable3 != null) {
            drawable3.setAlpha((int) (this.leftBoundAlpha.set((canScrollHorizontally(-1) && this.scrolledFully) ? 1.0f : 0.0f, false) * 255.0f * this.categoriesShownT));
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

    public abstract boolean isTabIconsAnimationEnabled();

    public final void lambda$new$2(TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j) {
        this.categories = new EmojiCategory[tL_messages_emojiGroups.groups.size()];
        for (int i = 0; i < tL_messages_emojiGroups.groups.size(); i++) {
            EmojiCategory[] emojiCategoryArr = this.categories;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i);
            EmojiCategory emojiCategory = new EmojiCategory();
            emojiCategory.documentId = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                emojiCategory.emojis = "premium";
            } else {
                emojiCategory.emojis = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            emojiCategory.greeting = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            emojiCategory.title = emojiGroup.title;
            emojiCategoryArr[i] = emojiCategory;
        }
        this.categories = preprocessCategories(this.categories);
        this.adapter.mObservable.notifyChanged();
        setCategoriesShownT(0.0f);
        updateCategoriesShown(this.categoriesShouldShow, System.currentTimeMillis() - j > 16);
    }

    public final void lambda$updateCategoriesShown$5(ValueAnimator valueAnimator) {
        setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateCategoriesShown(this.categoriesShouldShow, false);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        QrActivity.AnonymousClass2 anonymousClass2 = this.paddingView;
        if (anonymousClass2 != null) {
            anonymousClass2.requestLayout();
        }
    }

    @Override
    public final void onScrolled(int i, int i2) {
        boolean z;
        boolean z2;
        Utilities.Callback callback;
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
            Utilities.Callback callback2 = this.onScrollIntoOccupiedWidth;
            if (callback2 != null) {
                callback2.run(Integer.valueOf(z2 ? Math.max(0, getScrollToStartWidth() - (this.paddingWidth - this.dontOccupyWidth)) : 0));
            }
            invalidate();
        } else if (z3 && (callback = this.onScrollIntoOccupiedWidth) != null) {
            callback.run(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.paddingWidth - this.dontOccupyWidth))));
        }
        if (this.scrolledFully != z) {
            this.scrolledFully = z;
            Utilities.Callback callback3 = this.onScrollFully;
            if (callback3 != null) {
                callback3.run(Boolean.valueOf(z));
            }
            invalidate();
        }
    }

    public EmojiCategory[] preprocessCategories(EmojiCategory[] emojiCategoryArr) {
        return emojiCategoryArr;
    }

    public final void scrollToSelected() {
        int iDp = (AndroidUtilities.dp(34.0f) * this.selectedCategoryIndex) + ((-getScrollToStartWidth()) - Math.max(0, this.dontOccupyWidth));
        scrollBy(iDp, 0);
        post(new OAuthSheet$$ExternalSyntheticLambda17((EmojiBottomSheet.SearchField.AnonymousClass5) this, iDp, 7));
    }

    public final void scrollToStart() {
        smoothScrollBy(-getScrollToStartWidth(), 0, CubicBezierInterpolator.EASE_OUT_QUINT);
    }

    public final void selectCategory(EmojiCategory emojiCategory) {
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

    public final void updateCategoriesShown(boolean z, boolean z2) {
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
        valueAnimatorOfFloat.addUpdateListener(new ScrimOptions$$ExternalSyntheticLambda2(this, 22));
        this.categoriesShownAnimator.addListener(new Tooltip.AnonymousClass1(this, 7));
        this.categoriesShownAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        ValueAnimator valueAnimator2 = this.categoriesShownAnimator;
        EmojiCategory[] emojiCategoryArr = this.categories;
        valueAnimator2.setDuration(((long) (emojiCategoryArr == null ? 5 : emojiCategoryArr.length)) * 120);
        this.categoriesShownAnimator.start();
    }

    public void selectCategory(int i) {
        if (this.selectedCategoryIndex < 0 && i >= 0) {
            this.selectedIndex.set(i, true);
        }
        this.selectedCategoryIndex = i;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof CategoryButton) {
                ((CategoryButton) childAt).setSelected(this.selectedCategoryIndex == RecyclerView.getChildAdapterPosition(childAt) - 1, true);
            }
        }
        invalidate();
    }
}

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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Fetcher;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$TL_emojiGroup;
import org.telegram.tgnet.TLRPC$TL_emojiList;
import org.telegram.tgnet.TLRPC$TL_emojiListNotModified;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messages_emojiGroups;
import org.telegram.tgnet.TLRPC$TL_messages_emojiGroupsNotModified;
import org.telegram.tgnet.TLRPC$TL_messages_getEmojiGroups;
import org.telegram.tgnet.TLRPC$TL_messages_getEmojiProfilePhotoGroups;
import org.telegram.tgnet.TLRPC$TL_messages_getEmojiStatusGroups;
import org.telegram.tgnet.TLRPC$TL_messages_searchCustomEmoji;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StickerCategoriesListView;
public class StickerCategoriesListView extends RecyclerListView {
    private static EmojiGroupFetcher fetcher = new EmojiGroupFetcher();
    public static Fetcher<String, TLRPC$TL_emojiList> search = new EmojiSearch();
    private Adapter adapter;
    private Paint backgroundPaint;
    private EmojiCategory[] categories;
    private boolean categoriesShouldShow;
    private ValueAnimator categoriesShownAnimator;
    private float categoriesShownT;
    private int dontOccupyWidth;
    public Integer layerNum;
    private LinearLayoutManager layoutManager;
    private AnimatedFloat leftBoundAlpha;
    private Drawable leftBoundDrawable;
    private Utilities.Callback<EmojiCategory> onCategoryClick;
    private Utilities.Callback<Boolean> onScrollFully;
    private Utilities.Callback<Integer> onScrollIntoOccupiedWidth;
    private View paddingView;
    private int paddingWidth;
    private RectF rect1;
    private RectF rect2;
    private RectF rect3;
    private Drawable rightBoundDrawable;
    private boolean scrolledFully;
    private boolean scrolledIntoOccupiedWidth;
    private AnimatedFloat selectedAlpha;
    private int selectedCategoryIndex;
    private AnimatedFloat selectedIndex;
    private Paint selectedPaint;
    private float shownButtonsAtStart;

    static {
        new HashSet();
    }

    public static void preload(final int i, int i2) {
        fetcher.fetch(i, Integer.valueOf(i2), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StickerCategoriesListView.lambda$preload$0(i, (TLRPC$TL_messages_emojiGroups) obj);
            }
        });
    }

    public static void lambda$preload$0(int i, TLRPC$TL_messages_emojiGroups tLRPC$TL_messages_emojiGroups) {
        ArrayList<TLRPC$TL_emojiGroup> arrayList;
        if (tLRPC$TL_messages_emojiGroups == null || (arrayList = tLRPC$TL_messages_emojiGroups.groups) == null) {
            return;
        }
        Iterator<TLRPC$TL_emojiGroup> it = arrayList.iterator();
        while (it.hasNext()) {
            AnimatedEmojiDrawable.getDocumentFetcher(i).fetchDocument(it.next().icon_emoji_id, null);
        }
    }

    public StickerCategoriesListView(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        this(context, null, i, resourcesProvider);
    }

    public StickerCategoriesListView(Context context, final EmojiCategory[] emojiCategoryArr, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider);
        this.shownButtonsAtStart = 6.5f;
        this.categories = null;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.leftBoundAlpha = new AnimatedFloat(this, 360L, cubicBezierInterpolator);
        new AnimatedFloat(this, 360L, cubicBezierInterpolator);
        this.selectedPaint = new Paint(1);
        this.selectedCategoryIndex = -1;
        this.categoriesShownT = 0.0f;
        this.categoriesShouldShow = true;
        this.selectedAlpha = new AnimatedFloat(this, 350L, cubicBezierInterpolator);
        this.selectedIndex = new AnimatedFloat(this, 350L, cubicBezierInterpolator);
        this.rect1 = new RectF();
        this.rect2 = new RectF();
        this.rect3 = new RectF();
        setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
        Adapter adapter = new Adapter();
        this.adapter = adapter;
        setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        this.layoutManager = linearLayoutManager;
        setLayoutManager(linearLayoutManager);
        this.layoutManager.setOrientation(0);
        this.selectedPaint.setColor(getThemedColor("listSelectorSDK21"));
        setWillNotDraw(false);
        setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i2) {
                StickerCategoriesListView.this.lambda$new$1(view, i2);
            }
        });
        final long currentTimeMillis = System.currentTimeMillis();
        fetcher.fetch(UserConfig.selectedAccount, Integer.valueOf(i), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StickerCategoriesListView.this.lambda$new$2(emojiCategoryArr, currentTimeMillis, (TLRPC$TL_messages_emojiGroups) obj);
            }
        });
    }

    public void lambda$new$2(EmojiCategory[] emojiCategoryArr, long j, TLRPC$TL_messages_emojiGroups tLRPC$TL_messages_emojiGroups) {
        if (tLRPC$TL_messages_emojiGroups != null) {
            this.categories = new EmojiCategory[(emojiCategoryArr == null ? 0 : emojiCategoryArr.length) + tLRPC$TL_messages_emojiGroups.groups.size()];
            int i = 0;
            if (emojiCategoryArr != null) {
                while (i < emojiCategoryArr.length) {
                    this.categories[i] = emojiCategoryArr[i];
                    i++;
                }
            }
            for (int i2 = 0; i2 < tLRPC$TL_messages_emojiGroups.groups.size(); i2++) {
                this.categories[i + i2] = EmojiCategory.remote(tLRPC$TL_messages_emojiGroups.groups.get(i2));
            }
            this.adapter.notifyDataSetChanged();
            setCategoriesShownT(0.0f);
            updateCategoriesShown(this.categoriesShouldShow, System.currentTimeMillis() - j > 16);
        }
    }

    @Override
    public Integer getSelectorColor(int i) {
        return 0;
    }

    public void setShownButtonsAtStart(float f) {
        this.shownButtonsAtStart = f;
    }

    public void lambda$new$1(int i, View view) {
        EmojiCategory[] emojiCategoryArr;
        if (i >= 1 && (emojiCategoryArr = this.categories) != null) {
            EmojiCategory emojiCategory = emojiCategoryArr[i - 1];
            int dp = AndroidUtilities.dp(64.0f);
            if (getMeasuredWidth() - view.getRight() < dp) {
                smoothScrollBy(dp - (getMeasuredWidth() - view.getRight()), 0, CubicBezierInterpolator.EASE_OUT_QUINT);
            } else if (view.getLeft() < dp) {
                smoothScrollBy(-(dp - view.getLeft()), 0, CubicBezierInterpolator.EASE_OUT_QUINT);
            }
            Utilities.Callback<EmojiCategory> callback = this.onCategoryClick;
            if (callback != null) {
                callback.run(emojiCategory);
            }
        }
    }

    private int getScrollToStartWidth() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt instanceof CategoryButton) {
                return this.paddingWidth + Math.max(0, (getChildAdapterPosition(childAt) - 1) * getHeight()) + (-childAt.getLeft());
            }
            return -childAt.getLeft();
        }
        return 0;
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
                } else if (emojiCategoryArr[i] == emojiCategory) {
                    break;
                } else {
                    i++;
                }
            }
            selectCategory(i);
        }
        i = -1;
        selectCategory(i);
    }

    public void selectCategory(int i) {
        if (this.selectedCategoryIndex < 0) {
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

    public EmojiCategory getSelectedCategory() {
        int i;
        EmojiCategory[] emojiCategoryArr = this.categories;
        if (emojiCategoryArr == null || (i = this.selectedCategoryIndex) < 0 || i >= emojiCategoryArr.length) {
            return null;
        }
        return emojiCategoryArr[i];
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateCategoriesShown(this.categoriesShouldShow, false);
    }

    @Override
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View view = this.paddingView;
        if (view != null) {
            view.requestLayout();
        }
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
        if (z2) {
            float[] fArr = new float[2];
            fArr[0] = this.categoriesShownT;
            fArr[1] = r5 == 0 ? 0.0f : 1.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            this.categoriesShownAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    StickerCategoriesListView.this.lambda$updateCategoriesShown$3(valueAnimator2);
                }
            });
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
            valueAnimator2.setDuration((emojiCategoryArr == null ? 5 : emojiCategoryArr.length) * 120);
            this.categoriesShownAnimator.start();
            return;
        }
        setCategoriesShownT(r5 == 0 ? 0.0f : 1.0f);
    }

    public void lambda$updateCategoriesShown$3(ValueAnimator valueAnimator) {
        setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void setCategoriesShownT(float f) {
        this.categoriesShownT = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof CategoryButton) {
                float cascade = AndroidUtilities.cascade(f, (getChildCount() - 1) - getChildAdapterPosition(childAt), getChildCount() - 1, 3.0f);
                if (cascade > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((CategoryButton) childAt).play();
                }
                childAt.setAlpha(cascade);
                childAt.setScaleX(cascade);
                childAt.setScaleY(cascade);
            }
        }
        invalidate();
    }

    public boolean isCategoriesShown() {
        return this.categoriesShownT > 0.5f;
    }

    @Override
    public void onScrolled(int i, int i2) {
        boolean z;
        Utilities.Callback<Integer> callback;
        super.onScrolled(i, i2);
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt instanceof CategoryButton) {
                z = true;
            } else {
                r6 = childAt.getRight() <= this.dontOccupyWidth;
                z = false;
            }
        } else {
            z = false;
            r6 = false;
        }
        boolean z2 = this.scrolledIntoOccupiedWidth;
        if (z2 != r6) {
            this.scrolledIntoOccupiedWidth = r6;
            Utilities.Callback<Integer> callback2 = this.onScrollIntoOccupiedWidth;
            if (callback2 != null) {
                callback2.run(Integer.valueOf(r6 ? Math.max(0, getScrollToStartWidth() - (this.paddingWidth - this.dontOccupyWidth)) : 0));
            }
            invalidate();
        } else if (z2 && (callback = this.onScrollIntoOccupiedWidth) != null) {
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

    public void setDontOccupyWidth(int i) {
        this.dontOccupyWidth = i;
    }

    public void setOnScrollIntoOccupiedWidth(Utilities.Callback<Integer> callback) {
        this.onScrollIntoOccupiedWidth = callback;
    }

    public void setOnScrollFully(Utilities.Callback<Boolean> callback) {
        this.onScrollFully = callback;
    }

    public void setOnCategoryClick(Utilities.Callback<EmojiCategory> callback) {
        this.onCategoryClick = callback;
    }

    public boolean isScrolledIntoOccupiedWidth() {
        return this.scrolledIntoOccupiedWidth;
    }

    @Override
    public void setBackgroundColor(int i) {
        if (this.backgroundPaint == null) {
            this.backgroundPaint = new Paint(1);
        }
        this.backgroundPaint.setColor(i);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.gradient_right).mutate();
        this.leftBoundDrawable = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.rightBoundDrawable = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
    }

    @Override
    public void draw(Canvas canvas) {
        Drawable drawable;
        float f = 1.0f;
        if (this.backgroundPaint != null) {
            int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i2 = Integer.MIN_VALUE;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt instanceof CategoryButton) {
                    i = Math.min(i, childAt.getLeft());
                    i2 = Math.max(i2, childAt.getRight());
                }
            }
            if (i < i2) {
                int width = (int) (i2 + ((getWidth() + AndroidUtilities.dp(32.0f)) * (1.0f - this.categoriesShownT)));
                canvas.drawRect((int) (i + ((getWidth() + AndroidUtilities.dp(32.0f)) * (1.0f - this.categoriesShownT))), 0.0f, width, getHeight(), this.backgroundPaint);
                if (width < getWidth() && (drawable = this.leftBoundDrawable) != null) {
                    drawable.setAlpha(255);
                    Drawable drawable2 = this.leftBoundDrawable;
                    drawable2.setBounds(width, 0, drawable2.getIntrinsicWidth() + width, getHeight());
                    this.leftBoundDrawable.draw(canvas);
                }
            }
        }
        drawSelectedHighlight(canvas);
        super.draw(canvas);
        Drawable drawable3 = this.leftBoundDrawable;
        if (drawable3 != null) {
            drawable3.setAlpha((int) (255.0f * this.leftBoundAlpha.set((canScrollHorizontally(-1) && this.scrolledFully) ? 0.0f : 0.0f) * this.categoriesShownT));
            if (this.leftBoundDrawable.getAlpha() > 0) {
                Drawable drawable4 = this.leftBoundDrawable;
                drawable4.setBounds(0, 0, drawable4.getIntrinsicWidth(), getHeight());
                this.leftBoundDrawable.draw(canvas);
            }
        }
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
        int max = Math.max(1, (int) Math.floor(d));
        int max2 = Math.max(1, (int) Math.ceil(d));
        View view = null;
        View view2 = null;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            int childAdapterPosition = getChildAdapterPosition(childAt);
            if (childAdapterPosition == max) {
                view = childAt;
            }
            if (childAdapterPosition == max2) {
                view2 = childAt;
            }
            if (view != null && view2 != null) {
                break;
            }
        }
        int alpha = this.selectedPaint.getAlpha();
        this.selectedPaint.setAlpha((int) (alpha * f));
        if (view != null && view2 != null) {
            float f4 = max == max2 ? 0.5f : (f3 - max) / (max2 - max);
            getChildBounds(view, this.rect1);
            getChildBounds(view2, this.rect2);
            AndroidUtilities.lerp(this.rect1, this.rect2, f4, this.rect3);
            canvas.drawRoundRect(this.rect3, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), this.selectedPaint);
        }
        this.selectedPaint.setAlpha(alpha);
    }

    private void getChildBounds(View view, RectF rectF) {
        float right = (view.getRight() + view.getLeft()) / 2.0f;
        float bottom = (view.getBottom() + view.getTop()) / 2.0f;
        float width = ((view.getWidth() / 2.0f) - AndroidUtilities.dp(1.0f)) * (view instanceof CategoryButton ? ((CategoryButton) view).getScale() : 1.0f);
        rectF.set(right - width, bottom - width, right + width, bottom + width);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View findChildViewUnder = findChildViewUnder(motionEvent.getX(), motionEvent.getY());
            if (!(findChildViewUnder instanceof CategoryButton) || findChildViewUnder.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public class Adapter extends RecyclerListView.SelectionAdapter {
        private int lastItemCount;

        @Override
        public int getItemViewType(int i) {
            return i == 0 ? 0 : 1;
        }

        private Adapter() {
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View categoryButton;
            if (i == 0) {
                categoryButton = StickerCategoriesListView.this.paddingView = new View(StickerCategoriesListView.this.getContext()) {
                    @Override
                    protected void onMeasure(int i2, int i3) {
                        int size = View.MeasureSpec.getSize(i2);
                        if (size <= 0) {
                            size = ((View) getParent()).getMeasuredWidth();
                        }
                        int size2 = View.MeasureSpec.getSize(i3) - AndroidUtilities.dp(4.0f);
                        StickerCategoriesListView stickerCategoriesListView = StickerCategoriesListView.this;
                        super.onMeasure(View.MeasureSpec.makeMeasureSpec(stickerCategoriesListView.paddingWidth = Math.max(stickerCategoriesListView.dontOccupyWidth > 0 ? StickerCategoriesListView.this.dontOccupyWidth + AndroidUtilities.dp(4.0f) : 0, (int) (size - Math.min(((Adapter.this.getItemCount() - 1) * size2) + AndroidUtilities.dp(4.0f), StickerCategoriesListView.this.shownButtonsAtStart * size2))), 1073741824), i3);
                    }
                };
            } else {
                StickerCategoriesListView stickerCategoriesListView = StickerCategoriesListView.this;
                categoryButton = new CategoryButton(stickerCategoriesListView.getContext());
            }
            return new RecyclerListView.Holder(categoryButton);
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
            categoryButton.play();
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getItemViewType() == 1) {
                CategoryButton categoryButton = (CategoryButton) viewHolder.itemView;
                categoryButton.setSelected(StickerCategoriesListView.this.selectedCategoryIndex == viewHolder.getAdapterPosition() - 1, false);
                categoryButton.play();
            }
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
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 1;
        }
    }

    protected boolean isTabIconsAnimationEnabled(boolean z) {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) && !z;
    }

    public class CategoryButton extends RLottieImageView {
        ValueAnimator backAnimator;
        private int imageColor;
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
            setImageColor(StickerCategoriesListView.this.getThemedColor("chat_emojiPanelIcon"));
            setScaleType(ImageView.ScaleType.CENTER);
            setBackground(Theme.createSelectorDrawable(StickerCategoriesListView.this.getThemedColor("listSelectorSDK21"), 1, AndroidUtilities.dp(15.0f)));
            setLayerNum(StickerCategoriesListView.this.layerNum);
        }

        public void set(EmojiCategory emojiCategory, int i, boolean z) {
            ValueAnimator valueAnimator = this.loadAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.loadAnimator = null;
            }
            if (emojiCategory.remote) {
                setImageResource(0);
                clearAnimationDrawable();
                final boolean isTabIconsAnimationEnabled = StickerCategoriesListView.this.isTabIconsAnimationEnabled(true);
                this.loaded = false;
                this.loadProgress = 1.0f;
                AnimatedEmojiDrawable.getDocumentFetcher(UserConfig.selectedAccount).fetchDocument(emojiCategory.documentId, new AnimatedEmojiDrawable.ReceivedDocument() {
                    @Override
                    public final void run(TLRPC$Document tLRPC$Document) {
                        StickerCategoriesListView.CategoryButton.this.lambda$set$0(isTabIconsAnimationEnabled, tLRPC$Document);
                    }
                });
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        StickerCategoriesListView.CategoryButton.this.lambda$set$1();
                    }
                }, 60L);
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

        public void lambda$set$0(boolean z, TLRPC$Document tLRPC$Document) {
            setOnlyLastFrame(!z);
            setAnimation(tLRPC$Document, 24, 24);
            playAnimation();
        }

        public void lambda$set$1() {
            if (this.loaded) {
                return;
            }
            this.loadProgress = 0.0f;
        }

        @Override
        protected void onLoaded() {
            this.loaded = true;
            if (this.loadProgress < 1.0f) {
                ValueAnimator valueAnimator = this.loadAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.loadAnimator = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.loadProgress, 1.0f);
                this.loadAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        StickerCategoriesListView.CategoryButton.this.lambda$onLoaded$2(valueAnimator2);
                    }
                });
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

        public void lambda$onLoaded$2(ValueAnimator valueAnimator) {
            this.loadProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            invalidate();
        }

        public void setSelected(boolean z, boolean z2) {
            if (Math.abs(this.selectedT - (z ? 1.0f : 0.0f)) > 0.01f) {
                ValueAnimator valueAnimator = this.selectedAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.selectedAnimator = null;
                }
                if (z2) {
                    float[] fArr = new float[2];
                    fArr[0] = this.selectedT;
                    fArr[1] = z ? 1.0f : 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    this.selectedAnimator = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            StickerCategoriesListView.CategoryButton.this.lambda$setSelected$3(valueAnimator2);
                        }
                    });
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
                    return;
                }
                updateSelectedT(z ? 1.0f : 0.0f);
            }
        }

        public void lambda$setSelected$3(ValueAnimator valueAnimator) {
            updateSelectedT(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }

        public void updateSelectedT(float f) {
            this.selectedT = f;
            setImageColor(ColorUtils.blendARGB(StickerCategoriesListView.this.getThemedColor("chat_emojiPanelIcon"), StickerCategoriesListView.this.getThemedColor("chat_emojiPanelIconSelected"), this.selectedT));
            invalidate();
        }

        public void setImageColor(int i) {
            if (this.imageColor != i) {
                this.imageColor = i;
                setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
            }
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

        @Override
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i2);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.dp(4.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        }

        public void play() {
            if (System.currentTimeMillis() - this.lastPlayed > 250) {
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

        public void updatePressedProgress() {
            if (isPressed()) {
                float f = this.pressedProgress;
                if (f != 1.0f) {
                    this.pressedProgress = Utilities.clamp(f + ((1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f), 1.0f, 0.0f);
                    invalidate();
                    StickerCategoriesListView.this.invalidate();
                }
            }
        }

        public float getScale() {
            return (((1.0f - this.pressedProgress) * 0.15f) + 0.85f) * this.loadProgress;
        }

        @Override
        public void setPressed(boolean z) {
            ValueAnimator valueAnimator;
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
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
                    this.backAnimator = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            StickerCategoriesListView.CategoryButton.this.lambda$setPressed$4(valueAnimator2);
                        }
                    });
                    this.backAnimator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            CategoryButton.this.backAnimator = null;
                        }
                    });
                    this.backAnimator.setInterpolator(new OvershootInterpolator(3.0f));
                    this.backAnimator.setDuration(350L);
                    this.backAnimator.start();
                }
            }
        }

        public void lambda$setPressed$4(ValueAnimator valueAnimator) {
            this.pressedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            invalidate();
        }
    }

    public static class EmojiCategory {
        public boolean animated;
        public long documentId;
        public String emojis;
        public int iconResId;
        public boolean remote;

        public static EmojiCategory remote(TLRPC$TL_emojiGroup tLRPC$TL_emojiGroup) {
            EmojiCategory emojiCategory = new EmojiCategory();
            emojiCategory.remote = true;
            emojiCategory.documentId = tLRPC$TL_emojiGroup.icon_emoji_id;
            emojiCategory.emojis = TextUtils.concat((CharSequence[]) tLRPC$TL_emojiGroup.emoticons.toArray(new String[0])).toString();
            return emojiCategory;
        }
    }

    public static class EmojiGroupFetcher extends Fetcher<Integer, TLRPC$TL_messages_emojiGroups> {
        private EmojiGroupFetcher() {
        }

        @Override
        public void getRemote(int i, Integer num, long j, final Utilities.Callback3<Boolean, TLRPC$TL_messages_emojiGroups, Long> callback3) {
            TLRPC$TL_messages_getEmojiGroups tLRPC$TL_messages_getEmojiGroups;
            if (num.intValue() == 1) {
                TLRPC$TL_messages_getEmojiStatusGroups tLRPC$TL_messages_getEmojiStatusGroups = new TLRPC$TL_messages_getEmojiStatusGroups();
                tLRPC$TL_messages_getEmojiStatusGroups.hash = (int) j;
                tLRPC$TL_messages_getEmojiGroups = tLRPC$TL_messages_getEmojiStatusGroups;
            } else if (num.intValue() == 2) {
                TLRPC$TL_messages_getEmojiProfilePhotoGroups tLRPC$TL_messages_getEmojiProfilePhotoGroups = new TLRPC$TL_messages_getEmojiProfilePhotoGroups();
                tLRPC$TL_messages_getEmojiProfilePhotoGroups.hash = (int) j;
                tLRPC$TL_messages_getEmojiGroups = tLRPC$TL_messages_getEmojiProfilePhotoGroups;
            } else {
                TLRPC$TL_messages_getEmojiGroups tLRPC$TL_messages_getEmojiGroups2 = new TLRPC$TL_messages_getEmojiGroups();
                tLRPC$TL_messages_getEmojiGroups2.hash = (int) j;
                tLRPC$TL_messages_getEmojiGroups = tLRPC$TL_messages_getEmojiGroups2;
            }
            ConnectionsManager.getInstance(i).sendRequest(tLRPC$TL_messages_getEmojiGroups, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    StickerCategoriesListView.EmojiGroupFetcher.lambda$getRemote$0(Utilities.Callback3.this, tLObject, tLRPC$TL_error);
                }
            });
        }

        public static void lambda$getRemote$0(Utilities.Callback3 callback3, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            if (tLObject instanceof TLRPC$TL_messages_emojiGroupsNotModified) {
                callback3.run(Boolean.TRUE, null, 0L);
            } else if (!(tLObject instanceof TLRPC$TL_messages_emojiGroups)) {
                callback3.run(Boolean.FALSE, null, 0L);
            } else {
                TLRPC$TL_messages_emojiGroups tLRPC$TL_messages_emojiGroups = (TLRPC$TL_messages_emojiGroups) tLObject;
                callback3.run(Boolean.FALSE, tLRPC$TL_messages_emojiGroups, Long.valueOf(tLRPC$TL_messages_emojiGroups.hash));
            }
        }

        @Override
        public void getLocal(final int i, final Integer num, final Utilities.Callback2<Long, TLRPC$TL_messages_emojiGroups> callback2) {
            MessagesStorage.getInstance(i).getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    StickerCategoriesListView.EmojiGroupFetcher.lambda$getLocal$1(i, num, callback2);
                }
            });
        }

        public static void lambda$getLocal$1(int r7, java.lang.Integer r8, org.telegram.messenger.Utilities.Callback2 r9) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.StickerCategoriesListView.EmojiGroupFetcher.lambda$getLocal$1(int, java.lang.Integer, org.telegram.messenger.Utilities$Callback2):void");
        }

        @Override
        public void setLocal(final int i, final Integer num, final TLRPC$TL_messages_emojiGroups tLRPC$TL_messages_emojiGroups, long j) {
            MessagesStorage.getInstance(i).getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    StickerCategoriesListView.EmojiGroupFetcher.lambda$setLocal$2(i, tLRPC$TL_messages_emojiGroups, num);
                }
            });
        }

        public static void lambda$setLocal$2(int i, TLRPC$TL_messages_emojiGroups tLRPC$TL_messages_emojiGroups, Integer num) {
            try {
                SQLiteDatabase database = MessagesStorage.getInstance(i).getDatabase();
                if (database != null) {
                    if (tLRPC$TL_messages_emojiGroups == null) {
                        database.executeFast("DELETE FROM emoji_groups WHERE type = " + num).stepThis().dispose();
                    } else {
                        SQLitePreparedStatement executeFast = database.executeFast("REPLACE INTO emoji_groups VALUES(?, ?)");
                        executeFast.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$TL_messages_emojiGroups.getObjectSize());
                        tLRPC$TL_messages_emojiGroups.serializeToStream(nativeByteBuffer);
                        executeFast.bindInteger(1, num.intValue());
                        executeFast.bindByteBuffer(2, nativeByteBuffer);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                        executeFast.dispose();
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    private static class EmojiSearch extends Fetcher<String, TLRPC$TL_emojiList> {
        private EmojiSearch() {
        }

        @Override
        public void getRemote(int i, String str, long j, final Utilities.Callback3<Boolean, TLRPC$TL_emojiList, Long> callback3) {
            TLRPC$TL_messages_searchCustomEmoji tLRPC$TL_messages_searchCustomEmoji = new TLRPC$TL_messages_searchCustomEmoji();
            tLRPC$TL_messages_searchCustomEmoji.emoticon = str;
            tLRPC$TL_messages_searchCustomEmoji.hash = j;
            ConnectionsManager.getInstance(i).sendRequest(tLRPC$TL_messages_searchCustomEmoji, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    StickerCategoriesListView.EmojiSearch.lambda$getRemote$0(Utilities.Callback3.this, tLObject, tLRPC$TL_error);
                }
            });
        }

        public static void lambda$getRemote$0(Utilities.Callback3 callback3, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            if (tLObject instanceof TLRPC$TL_emojiListNotModified) {
                callback3.run(Boolean.TRUE, null, 0L);
            } else if (!(tLObject instanceof TLRPC$TL_emojiList)) {
                callback3.run(Boolean.FALSE, null, 0L);
            } else {
                TLRPC$TL_emojiList tLRPC$TL_emojiList = (TLRPC$TL_emojiList) tLObject;
                callback3.run(Boolean.FALSE, tLRPC$TL_emojiList, Long.valueOf(tLRPC$TL_emojiList.hash));
            }
        }
    }
}

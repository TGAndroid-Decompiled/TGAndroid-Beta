package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionValues;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;

public class ScrollSlidingTabStrip extends HorizontalScrollView {
    public static float EXPANDED_WIDTH = 64.0f;
    private boolean animateFromPosition;
    boolean animateToExpanded;
    int currentDragPosition;
    SparseArray<StickerTabView> currentPlayingImages;
    SparseArray<StickerTabView> currentPlayingImagesTmp;
    private int currentPosition;
    private AnimatedFloat currentPositionAnimated;
    private LinearLayout.LayoutParams defaultExpandLayoutParams;
    private LinearLayout.LayoutParams defaultTabLayoutParams;
    private ScrollSlidingTabStripDelegate delegate;
    private int dividerPadding;
    float dragDx;
    private boolean dragEnabled;
    float draggindViewDxOnScreen;
    float draggindViewXOnScreen;
    View draggingView;
    float draggingViewIndicatorOutProgress;
    float draggingViewOutProgress;
    private float expandOffset;
    float expandProgress;
    ValueAnimator expandStickerAnimator;
    boolean expanded;
    private SparseArray<View> futureTabsPositions;
    private int imageReceiversPlayingNum;
    private int indicatorColor;
    private GradientDrawable indicatorDrawable;
    private int indicatorHeight;
    private final boolean isGlassDesign;
    private long lastAnimationTime;
    private int lastScrollX;
    private RectF leftTabBounds;
    Runnable longClickRunnable;
    boolean longClickRunning;
    private float positionAnimationProgress;
    float pressedX;
    float pressedY;
    private HashMap<String, View> prevTypes;
    private Paint rectPaint;
    private final Theme.ResourcesProvider resourcesProvider;
    private RectF rightTabBounds;
    private int scrollByOnNextMeasure;
    private int scrollOffset;
    boolean scrollRight;
    Runnable scrollRunnable;
    long scrollStartTime;
    private Paint selectorPaint;
    private boolean shouldExpand;
    private boolean showSelected;
    private AnimatedFloat showSelectedAlpha;
    private float startAnimationPosition;
    int startDragFromPosition;
    float startDragFromX;
    private float stickerTabExpandedWidth;
    private float stickerTabWidth;
    private RectF tabBounds;
    private int tabCount;
    private int tabPadding;
    private HashMap<String, View> tabTypes;
    private LinearLayout tabsContainer;
    private float touchSlop;
    private Type type;
    private int underlineColor;
    private int underlineHeight;

    public class AnonymousClass3 extends Transition {
        public AnonymousClass3() {
        }

        public void lambda$createAnimator$0(ValueAnimator valueAnimator) {
            ScrollSlidingTabStrip.this.invalidate();
        }

        @Override
        public void captureEndValues(TransitionValues transitionValues) {
        }

        @Override
        public void captureStartValues(TransitionValues transitionValues) {
        }

        @Override
        public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ButtonBounce$$ExternalSyntheticLambda0(this, 14));
            return valueAnimatorOfFloat;
        }
    }

    public interface ScrollSlidingTabStripDelegate {
        void onPageSelected(int i);
    }

    public enum Type {
        LINE,
        TAB
    }

    public ScrollSlidingTabStrip(Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
        super(context);
        this.imageReceiversPlayingNum = 1;
        this.type = Type.LINE;
        this.tabTypes = new HashMap<>();
        this.prevTypes = new HashMap<>();
        this.futureTabsPositions = new SparseArray<>();
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.currentPositionAnimated = new AnimatedFloat(this, 350L, cubicBezierInterpolator);
        this.leftTabBounds = new RectF();
        this.rightTabBounds = new RectF();
        this.tabBounds = new RectF();
        this.indicatorColor = -10066330;
        this.underlineColor = 436207616;
        this.indicatorDrawable = new GradientDrawable();
        this.scrollOffset = AndroidUtilities.dp(33.0f);
        this.underlineHeight = AndroidUtilities.dp(2.0f);
        this.dividerPadding = AndroidUtilities.dp(12.0f);
        this.tabPadding = AndroidUtilities.dp(24.0f);
        this.lastScrollX = 0;
        this.currentPlayingImages = new SparseArray<>();
        this.currentPlayingImagesTmp = new SparseArray<>();
        this.longClickRunnable = new Runnable() {
            @Override
            public void run() {
                ScrollSlidingTabStrip scrollSlidingTabStrip = ScrollSlidingTabStrip.this;
                scrollSlidingTabStrip.longClickRunning = false;
                float scrollX = scrollSlidingTabStrip.getScrollX();
                ScrollSlidingTabStrip scrollSlidingTabStrip2 = ScrollSlidingTabStrip.this;
                scrollSlidingTabStrip.startDragFromX = scrollX + scrollSlidingTabStrip2.pressedX;
                scrollSlidingTabStrip2.dragDx = 0.0f;
                int iCeil = ((int) Math.ceil(scrollSlidingTabStrip2.startDragFromX / scrollSlidingTabStrip2.getTabSize())) - 1;
                ScrollSlidingTabStrip scrollSlidingTabStrip3 = ScrollSlidingTabStrip.this;
                scrollSlidingTabStrip3.currentDragPosition = iCeil;
                scrollSlidingTabStrip3.startDragFromPosition = iCeil;
                if (scrollSlidingTabStrip3.canSwap(iCeil) && iCeil >= 0 && iCeil < ScrollSlidingTabStrip.this.tabsContainer.getChildCount()) {
                    try {
                        ScrollSlidingTabStrip.this.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ScrollSlidingTabStrip scrollSlidingTabStrip4 = ScrollSlidingTabStrip.this;
                    scrollSlidingTabStrip4.draggindViewDxOnScreen = 0.0f;
                    scrollSlidingTabStrip4.draggingViewOutProgress = 0.0f;
                    scrollSlidingTabStrip4.draggingView = scrollSlidingTabStrip4.tabsContainer.getChildAt(iCeil);
                    ScrollSlidingTabStrip scrollSlidingTabStrip5 = ScrollSlidingTabStrip.this;
                    scrollSlidingTabStrip5.draggindViewXOnScreen = scrollSlidingTabStrip5.draggingView.getX() - ScrollSlidingTabStrip.this.getScrollX();
                    ScrollSlidingTabStrip.this.draggingView.invalidate();
                    ScrollSlidingTabStrip.this.tabsContainer.invalidate();
                    ScrollSlidingTabStrip.this.invalidateOverlays();
                    ScrollSlidingTabStrip.this.invalidate();
                }
            }
        };
        this.expanded = false;
        this.stickerTabExpandedWidth = AndroidUtilities.dp(EXPANDED_WIDTH);
        this.stickerTabWidth = AndroidUtilities.dp(33.0f);
        this.scrollByOnNextMeasure = -1;
        this.selectorPaint = new Paint();
        this.showSelected = true;
        this.showSelectedAlpha = new AnimatedFloat(this, 350L, cubicBezierInterpolator);
        this.scrollRunnable = new Runnable() {
            @Override
            public void run() {
                int iMax;
                long jCurrentTimeMillis = System.currentTimeMillis() - ScrollSlidingTabStrip.this.scrollStartTime;
                int i = 1;
                if (jCurrentTimeMillis < 3000) {
                    iMax = Math.max(1, AndroidUtilities.dp(1.0f));
                    if (!ScrollSlidingTabStrip.this.scrollRight) {
                        i = -1;
                    }
                } else if (jCurrentTimeMillis < 5000) {
                    iMax = Math.max(1, AndroidUtilities.dp(2.0f));
                    if (!ScrollSlidingTabStrip.this.scrollRight) {
                        i = -1;
                    }
                } else {
                    iMax = Math.max(1, AndroidUtilities.dp(4.0f));
                    if (!ScrollSlidingTabStrip.this.scrollRight) {
                        i = -1;
                    }
                }
                ScrollSlidingTabStrip.this.scrollBy(iMax * i, 0);
                AndroidUtilities.runOnUIThread(ScrollSlidingTabStrip.this.scrollRunnable);
            }
        };
        this.resourcesProvider = resourcesProvider;
        this.isGlassDesign = z;
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(context) {
            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                if (view instanceof StickerTabView) {
                    ((StickerTabView) view).updateExpandProgress(ScrollSlidingTabStrip.this.expandProgress);
                }
                if (view == ScrollSlidingTabStrip.this.draggingView) {
                    return true;
                }
                return super.drawChild(canvas, view, j);
            }
        };
        this.tabsContainer = linearLayout;
        linearLayout.setOrientation(0);
        this.tabsContainer.setPadding(AndroidUtilities.dp(9.5f), 0, AndroidUtilities.dp(9.5f), 0);
        addView(this.tabsContainer, new FrameLayout.LayoutParams(-1, -1, 16));
        Paint paint = new Paint();
        this.rectPaint = paint;
        paint.setAntiAlias(true);
        this.rectPaint.setStyle(Paint.Style.FILL);
        this.defaultTabLayoutParams = new LinearLayout.LayoutParams(AndroidUtilities.dp(33.0f), -1);
        this.defaultExpandLayoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
    }

    public boolean canSwap(int i) {
        if (this.dragEnabled && i >= 0 && i < this.tabsContainer.getChildCount()) {
            View childAt = this.tabsContainer.getChildAt(i);
            if (childAt instanceof StickerTabView) {
                StickerTabView stickerTabView = (StickerTabView) childAt;
                if (stickerTabView.type == 0 && !stickerTabView.isChatSticker) {
                    return true;
                }
            }
        }
        return false;
    }

    private void checkViewIndex(String str, View view, int i) {
        HashMap<String, View> map = this.prevTypes;
        if (map != null) {
            map.remove(str);
        }
        this.futureTabsPositions.put(i, view);
    }

    private int getGlassIconColor(float f) {
        return ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_glass_defaultIcon, this.resourcesProvider), (int) (f * 255.0f));
    }

    public int getTabSize() {
        return AndroidUtilities.dp(this.animateToExpanded ? EXPANDED_WIDTH : 33.0f);
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    public void lambda$addEmojiTab$3(View view) {
        this.delegate.onPageSelected(((Integer) view.getTag(R.id.index_tag)).intValue());
    }

    public void lambda$addIconTab$0(View view) {
        this.delegate.onPageSelected(((Integer) view.getTag(R.id.index_tag)).intValue());
    }

    public void lambda$addStickerIconTab$1(View view) {
        this.delegate.onPageSelected(((Integer) view.getTag(R.id.index_tag)).intValue());
    }

    public void lambda$addStickerTab$2(View view) {
        this.delegate.onPageSelected(((Integer) view.getTag(R.id.index_tag)).intValue());
    }

    public void lambda$addStickerTab$4(View view) {
        this.delegate.onPageSelected(((Integer) view.getTag(R.id.index_tag)).intValue());
    }

    public void lambda$checkLongPress$6(ValueAnimator valueAnimator) {
        this.draggingViewOutProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidateOverlays();
    }

    public void lambda$expandStickers$5(boolean z, float f, ValueAnimator valueAnimator) {
        if (!z) {
            float childCount = this.stickerTabWidth * this.tabsContainer.getChildCount();
            float scrollX = (getScrollX() + f) / (this.stickerTabExpandedWidth * this.tabsContainer.getChildCount());
            float measuredWidth = (childCount - getMeasuredWidth()) / childCount;
            if (scrollX > measuredWidth) {
                scrollX = measuredWidth;
                f = 0.0f;
            }
            float f2 = childCount * scrollX;
            if (f2 - f < 0.0f) {
                f2 = f;
            }
            this.expandOffset = (getScrollX() + f) - f2;
        }
        this.expandProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i = 0; i < this.tabsContainer.getChildCount(); i++) {
            this.tabsContainer.getChildAt(i).invalidate();
        }
        this.tabsContainer.invalidate();
        updatePosition();
    }

    private void scrollToChild(int i) {
        if (this.tabCount == 0 || this.tabsContainer.getChildAt(i) == null) {
            return;
        }
        int left = this.tabsContainer.getChildAt(i).getLeft();
        if (i > 0) {
            left -= this.scrollOffset;
        }
        int scrollX = getScrollX();
        if (left != this.lastScrollX) {
            if (left < scrollX) {
                this.lastScrollX = left;
                smoothScrollTo(left, 0);
            } else if (this.scrollOffset + left > (getWidth() + scrollX) - (this.scrollOffset * 2)) {
                int width = (this.scrollOffset * 3) + (left - getWidth());
                this.lastScrollX = width;
                smoothScrollTo(width, 0);
            }
        }
    }

    private void startScroll(boolean z) {
        this.scrollRight = z;
        if (this.scrollStartTime <= 0) {
            this.scrollStartTime = System.currentTimeMillis();
        }
        AndroidUtilities.runOnUIThread(this.scrollRunnable, 16L);
    }

    private void stopScroll() {
        this.scrollStartTime = -1L;
        AndroidUtilities.cancelRunOnUIThread(this.scrollRunnable);
    }

    public View addEmojiTab(int i, Emoji.EmojiDrawable emojiDrawable, TLRPC.Document document) {
        String strM = DiffUtil.m(i, "tab");
        int i2 = this.tabCount;
        this.tabCount = i2 + 1;
        StickerTabView stickerTabView = (StickerTabView) this.prevTypes.get(strM);
        if (stickerTabView != null) {
            checkViewIndex(strM, stickerTabView, i2);
        } else {
            stickerTabView = new StickerTabView(getContext(), 2);
            stickerTabView.setFocusable(true);
            stickerTabView.setOnClickListener(new ScrollSlidingTabStrip$$ExternalSyntheticLambda0(this, 2));
            stickerTabView.setExpanded(this.expanded);
            stickerTabView.updateExpandProgress(this.expandProgress);
            this.tabsContainer.addView(stickerTabView, i2);
        }
        stickerTabView.isChatSticker = false;
        stickerTabView.setTag(R.id.index_tag, Integer.valueOf(i2));
        stickerTabView.setTag(R.id.parent_tag, emojiDrawable);
        stickerTabView.setTag(R.id.object_tag, document);
        stickerTabView.setSelected(i2 == this.currentPosition);
        this.tabTypes.put(strM, stickerTabView);
        return stickerTabView;
    }

    public FrameLayout addIconTab(int i, Drawable drawable) {
        String strM = DiffUtil.m(i, "tab");
        int i2 = this.tabCount;
        this.tabCount = i2 + 1;
        FrameLayout frameLayout = (FrameLayout) this.prevTypes.get(strM);
        if (frameLayout != null) {
            checkViewIndex(strM, frameLayout, i2);
        } else {
            frameLayout = new FrameLayout(getContext());
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout.addView(imageView, LayoutHelper.createFrame(24, 24, 17));
            frameLayout.setFocusable(true);
            frameLayout.setOnClickListener(new ScrollSlidingTabStrip$$ExternalSyntheticLambda0(this, 3));
            this.tabsContainer.addView(frameLayout, i2);
        }
        frameLayout.setTag(R.id.index_tag, Integer.valueOf(i2));
        frameLayout.setSelected(i2 == this.currentPosition);
        this.tabTypes.put(strM, frameLayout);
        return frameLayout;
    }

    public StickerTabView addStickerIconTab(int i, Drawable drawable) {
        String strM = DiffUtil.m(i, "tab");
        int i2 = this.tabCount;
        this.tabCount = i2 + 1;
        StickerTabView stickerTabView = (StickerTabView) this.prevTypes.get(strM);
        if (stickerTabView != null) {
            checkViewIndex(strM, stickerTabView, i2);
        } else {
            stickerTabView = new StickerTabView(getContext(), 1);
            stickerTabView.iconView.setImageDrawable(drawable);
            stickerTabView.setFocusable(true);
            stickerTabView.setOnClickListener(new ScrollSlidingTabStrip$$ExternalSyntheticLambda0(this, 4));
            stickerTabView.setExpanded(this.expanded);
            stickerTabView.updateExpandProgress(this.expandProgress);
            this.tabsContainer.addView(stickerTabView, i2);
        }
        stickerTabView.isChatSticker = false;
        stickerTabView.setTag(R.id.index_tag, Integer.valueOf(i2));
        stickerTabView.setSelected(i2 == this.currentPosition);
        this.tabTypes.put(strM, stickerTabView);
        return stickerTabView;
    }

    public void addStickerTab(TLRPC.Chat chat) {
        String str = "chat" + chat.id;
        int i = this.tabCount;
        this.tabCount = i + 1;
        StickerTabView stickerTabView = (StickerTabView) this.prevTypes.get(str);
        if (stickerTabView != null) {
            checkViewIndex(str, stickerTabView, i);
        } else {
            stickerTabView = new StickerTabView(getContext(), 0);
            stickerTabView.setFocusable(true);
            stickerTabView.setOnClickListener(new ScrollSlidingTabStrip$$ExternalSyntheticLambda0(this, 0));
            this.tabsContainer.addView(stickerTabView, i);
            stickerTabView.setRoundImage();
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setTextSize(AndroidUtilities.dp(14.0f));
            avatarDrawable.setInfo(UserConfig.selectedAccount, chat);
            BackupImageView backupImageView = stickerTabView.imageView;
            backupImageView.setLayerNum(this.imageReceiversPlayingNum);
            backupImageView.setForUserOrChat(chat, avatarDrawable);
            backupImageView.setAspectFit(true);
            stickerTabView.setExpanded(this.expanded);
            stickerTabView.updateExpandProgress(this.expandProgress);
            stickerTabView.textView.setText(chat.title);
        }
        stickerTabView.isChatSticker = true;
        stickerTabView.setTag(R.id.index_tag, Integer.valueOf(i));
        stickerTabView.setSelected(i == this.currentPosition);
        this.tabTypes.put(str, stickerTabView);
    }

    public void beginUpdate(boolean z) {
        this.prevTypes = this.tabTypes;
        this.tabTypes = new HashMap<>();
        this.futureTabsPositions.clear();
        this.tabCount = 0;
        if (z) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(250L);
            autoTransition.setOrdering(0);
            autoTransition.addTransition(new AnonymousClass3());
            TransitionManager.beginDelayedTransition(this.tabsContainer, autoTransition);
        }
    }

    @Override
    public void cancelLongPress() {
        super.cancelLongPress();
        this.longClickRunning = false;
        AndroidUtilities.cancelRunOnUIThread(this.longClickRunnable);
    }

    public void cancelPositionAnimation() {
        this.animateFromPosition = false;
        this.positionAnimationProgress = 1.0f;
    }

    public boolean checkLongPress(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && this.draggingView == null) {
            this.longClickRunning = true;
            AndroidUtilities.runOnUIThread(this.longClickRunnable, 500L);
            this.pressedX = motionEvent.getX();
            this.pressedY = motionEvent.getY();
        }
        if (this.longClickRunning && motionEvent.getAction() == 2 && (Math.abs(motionEvent.getX() - this.pressedX) > this.touchSlop || Math.abs(motionEvent.getY() - this.pressedY) > this.touchSlop)) {
            this.longClickRunning = false;
            AndroidUtilities.cancelRunOnUIThread(this.longClickRunnable);
        }
        if (motionEvent.getAction() != 2 || this.draggingView == null) {
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                return false;
            }
            stopScroll();
            AndroidUtilities.cancelRunOnUIThread(this.longClickRunnable);
            if (this.draggingView != null) {
                int i = this.startDragFromPosition;
                int i2 = this.currentDragPosition;
                if (i != i2) {
                    stickerSetPositionChanged(i, i2);
                    for (int i3 = 0; i3 < this.tabsContainer.getChildCount(); i3++) {
                        this.tabsContainer.getChildAt(i3).setTag(R.id.index_tag, Integer.valueOf(i3));
                    }
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda6(this, 22));
                valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        ScrollSlidingTabStrip scrollSlidingTabStrip = ScrollSlidingTabStrip.this;
                        if (scrollSlidingTabStrip.draggingView != null) {
                            scrollSlidingTabStrip.invalidateOverlays();
                            ScrollSlidingTabStrip.this.draggingView.invalidate();
                            ScrollSlidingTabStrip.this.tabsContainer.invalidate();
                            ScrollSlidingTabStrip.this.invalidate();
                            ScrollSlidingTabStrip.this.draggingView = null;
                        }
                    }
                });
                valueAnimatorOfFloat.start();
            }
            this.longClickRunning = false;
            invalidateOverlays();
            return false;
        }
        float x = motionEvent.getX() + getScrollX();
        int iCeil = ((int) Math.ceil(x / getTabSize())) - 1;
        int i4 = this.currentDragPosition;
        if (iCeil != i4) {
            if (iCeil < i4) {
                while (!canSwap(iCeil) && iCeil != this.currentDragPosition) {
                    iCeil++;
                }
            } else {
                while (!canSwap(iCeil) && iCeil != this.currentDragPosition) {
                    iCeil--;
                }
            }
        }
        if (this.currentDragPosition != iCeil && canSwap(iCeil)) {
            for (int i5 = 0; i5 < this.tabsContainer.getChildCount(); i5++) {
                if (i5 != this.currentDragPosition) {
                    ((StickerTabView) this.tabsContainer.getChildAt(i5)).saveXPosition();
                }
            }
            this.startDragFromX += (iCeil - this.currentDragPosition) * getTabSize();
            this.currentDragPosition = iCeil;
            this.tabsContainer.removeView(this.draggingView);
            this.tabsContainer.addView(this.draggingView, this.currentDragPosition);
            invalidate();
        }
        this.dragDx = x - this.startDragFromX;
        this.draggindViewDxOnScreen = this.pressedX - motionEvent.getX();
        float x2 = motionEvent.getX();
        if (x2 < this.draggingView.getMeasuredWidth() / 2.0f) {
            startScroll(false);
        } else if (x2 > getMeasuredWidth() - (this.draggingView.getMeasuredWidth() / 2.0f)) {
            startScroll(true);
        } else {
            stopScroll();
        }
        this.tabsContainer.invalidate();
        invalidateOverlays();
        return true;
    }

    public void commitUpdate() {
        HashMap<String, View> map = this.prevTypes;
        if (map != null) {
            Iterator<Map.Entry<String, View>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                this.tabsContainer.removeView(it.next().getValue());
            }
            this.prevTypes.clear();
        }
        int size = this.futureTabsPositions.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = this.futureTabsPositions.keyAt(i);
            View viewValueAt = this.futureTabsPositions.valueAt(i);
            if (this.tabsContainer.indexOfChild(viewValueAt) != iKeyAt) {
                this.tabsContainer.removeView(viewValueAt);
                this.tabsContainer.addView(viewValueAt, iKeyAt);
            }
        }
        this.futureTabsPositions.clear();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float fLerp;
        float textWidth;
        float f = this.stickerTabWidth - this.stickerTabExpandedWidth;
        float f2 = (1.0f - this.expandProgress) * this.expandOffset;
        for (int i = 0; i < this.tabsContainer.getChildCount(); i++) {
            if (this.tabsContainer.getChildAt(i) instanceof StickerTabView) {
                StickerTabView stickerTabView = (StickerTabView) this.tabsContainer.getChildAt(i);
                stickerTabView.animateIfPositionChanged(this);
                if (this.animateToExpanded) {
                    stickerTabView.setTranslationX(DiffUtil.m(1.0f, this.expandProgress, i * f, f2) + stickerTabView.dragOffset);
                } else {
                    stickerTabView.setTranslationX(stickerTabView.dragOffset);
                }
            }
        }
        float height = getHeight();
        if (this.animateToExpanded) {
            height = BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, this.expandProgress, AndroidUtilities.dp(50.0f), getHeight());
        }
        float f3 = height;
        float f4 = this.showSelectedAlpha.set(this.showSelected ? 1.0f : 0.0f);
        if (isInEditMode() || this.tabCount == 0 || this.indicatorHeight < 0) {
            canvas2 = canvas;
        } else {
            float f5 = this.currentPositionAnimated.set(this.currentPosition);
            double d = f5;
            int iFloor = (int) Math.floor(d);
            int iCeil = (int) Math.ceil(d);
            View childAt = null;
            View childAt2 = (iFloor < 0 || iFloor >= this.tabsContainer.getChildCount()) ? null : this.tabsContainer.getChildAt(iFloor);
            if (iCeil >= 0 && iCeil < this.tabsContainer.getChildCount()) {
                childAt = this.tabsContainer.getChildAt(iCeil);
            }
            float f6 = f3 / 2.0f;
            if (childAt2 != null && childAt != null) {
                float f7 = f5 - iFloor;
                float fLerp2 = AndroidUtilities.lerp((AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(EXPANDED_WIDTH), this.expandProgress) / 2.0f) + childAt2.getTranslationX() + childAt2.getLeft(), (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(EXPANDED_WIDTH), this.expandProgress) / 2.0f) + childAt.getTranslationX() + childAt.getLeft(), f7);
                textWidth = AndroidUtilities.lerp(childAt2 instanceof StickerTabView ? ((StickerTabView) childAt2).getTextWidth() : 0.0f, childAt instanceof StickerTabView ? ((StickerTabView) childAt).getTextWidth() : 0.0f, f7);
                fLerp = fLerp2;
            } else if (childAt2 != null) {
                fLerp = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(EXPANDED_WIDTH), this.expandProgress) / 2.0f) + childAt2.getTranslationX() + childAt2.getLeft();
                textWidth = childAt2 instanceof StickerTabView ? ((StickerTabView) childAt2).getTextWidth() : 0.0f;
            } else if (childAt != null) {
                fLerp = (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(EXPANDED_WIDTH), this.expandProgress) / 2.0f) + childAt.getTranslationX() + childAt.getLeft();
                if (childAt instanceof StickerTabView) {
                    textWidth = ((StickerTabView) childAt).getTextWidth();
                }
            } else {
                fLerp = 0.0f;
            }
            float fDp = AndroidUtilities.dp(30.0f);
            float fAbs = (1.25f - ((Math.abs(0.5f - this.currentPositionAnimated.getTransitionProgressInterpolated()) * 0.25f) * 2.0f)) * fDp;
            float fAbs2 = ((Math.abs(0.5f - this.currentPositionAnimated.getTransitionProgressInterpolated()) * 0.1f * 2.0f) + 0.9f) * fDp;
            float interpolation = CubicBezierInterpolator.EASE_IN.getInterpolation(this.expandProgress);
            float fLerp3 = AndroidUtilities.lerp(fAbs, textWidth + AndroidUtilities.dp(10.0f), interpolation);
            float fLerp4 = f6 + AndroidUtilities.lerp(0, AndroidUtilities.dp(26.0f), interpolation);
            float f8 = fLerp3 / 2.0f;
            float fLerp5 = (AndroidUtilities.lerp(1.0f, 0.55f, interpolation) * fAbs2) / 2.0f;
            this.tabBounds.set(fLerp - f8, fLerp4 - fLerp5, fLerp + f8, fLerp4 + fLerp5);
            if (this.isGlassDesign) {
                this.selectorPaint.setColor(getGlassIconColor(0.05f));
            } else {
                this.selectorPaint.setColor(ColorUtils.setAlphaComponent(getThemedColor(Theme.key_chat_emojiPanelIcon), 46));
                Paint paint = this.selectorPaint;
                paint.setAlpha((int) (paint.getAlpha() * f4));
            }
            RectF rectF = this.tabBounds;
            canvas2 = canvas;
            canvas2.drawRoundRect(rectF, rectF.height() / 2.0f, this.tabBounds.height() / 2.0f, this.selectorPaint);
        }
        super.dispatchDraw(canvas);
        if (isInEditMode() || this.tabCount == 0 || this.underlineHeight <= 0) {
            return;
        }
        this.rectPaint.setColor(this.underlineColor);
        canvas2.drawRect(0.0f, f3 - this.underlineHeight, this.tabsContainer.getWidth(), f3, this.rectPaint);
    }

    public void drawOverlays(Canvas canvas) {
        if (this.draggingView != null) {
            canvas.save();
            float x = this.draggindViewXOnScreen - this.draggindViewDxOnScreen;
            float f = this.draggingViewOutProgress;
            if (f > 0.0f) {
                x = ((this.draggingView.getX() - getScrollX()) * this.draggingViewOutProgress) + ((1.0f - f) * x);
            }
            canvas.translate(x, 0.0f);
            this.draggingView.draw(canvas);
            canvas.restore();
        }
    }

    public void expandStickers(final float f, final boolean z) {
        if (this.expanded != z) {
            this.expanded = z;
            if (!z) {
                fling(0);
            }
            ValueAnimator valueAnimator = this.expandStickerAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.expandStickerAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.expandProgress, z ? 1.0f : 0.0f);
            this.expandStickerAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f$0.lambda$expandStickers$5(z, f, valueAnimator2);
                }
            });
            this.expandStickerAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    ScrollSlidingTabStrip scrollSlidingTabStrip = ScrollSlidingTabStrip.this;
                    scrollSlidingTabStrip.expandStickerAnimator = null;
                    scrollSlidingTabStrip.expandProgress = z ? 1.0f : 0.0f;
                    for (int i = 0; i < ScrollSlidingTabStrip.this.tabsContainer.getChildCount(); i++) {
                        ScrollSlidingTabStrip.this.tabsContainer.getChildAt(i).invalidate();
                    }
                    ScrollSlidingTabStrip.this.tabsContainer.invalidate();
                    ScrollSlidingTabStrip.this.updatePosition();
                    if (z) {
                        return;
                    }
                    float childCount = ScrollSlidingTabStrip.this.stickerTabWidth * ScrollSlidingTabStrip.this.tabsContainer.getChildCount();
                    float scrollX = (ScrollSlidingTabStrip.this.getScrollX() + f) / (ScrollSlidingTabStrip.this.stickerTabExpandedWidth * ScrollSlidingTabStrip.this.tabsContainer.getChildCount());
                    float measuredWidth = (childCount - ScrollSlidingTabStrip.this.getMeasuredWidth()) / childCount;
                    float f2 = f;
                    if (scrollX > measuredWidth) {
                        scrollX = measuredWidth;
                        f2 = 0.0f;
                    }
                    float f3 = childCount * scrollX;
                    if (f3 - f2 < 0.0f) {
                        f3 = f2;
                    }
                    ScrollSlidingTabStrip scrollSlidingTabStrip2 = ScrollSlidingTabStrip.this;
                    scrollSlidingTabStrip2.expandOffset = (scrollSlidingTabStrip2.getScrollX() + f2) - f3;
                    ScrollSlidingTabStrip.this.scrollByOnNextMeasure = (int) (f3 - f2);
                    if (ScrollSlidingTabStrip.this.scrollByOnNextMeasure < 0) {
                        ScrollSlidingTabStrip.this.scrollByOnNextMeasure = 0;
                    }
                    for (int i2 = 0; i2 < ScrollSlidingTabStrip.this.tabsContainer.getChildCount(); i2++) {
                        View childAt = ScrollSlidingTabStrip.this.tabsContainer.getChildAt(i2);
                        if (childAt instanceof StickerTabView) {
                            ((StickerTabView) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    ScrollSlidingTabStrip scrollSlidingTabStrip3 = ScrollSlidingTabStrip.this;
                    scrollSlidingTabStrip3.animateToExpanded = false;
                    scrollSlidingTabStrip3.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    ScrollSlidingTabStrip.this.tabsContainer.requestLayout();
                }
            });
            this.expandStickerAnimator.start();
            if (z) {
                this.animateToExpanded = true;
                for (int i = 0; i < this.tabsContainer.getChildCount(); i++) {
                    View childAt = this.tabsContainer.getChildAt(i);
                    if (childAt instanceof StickerTabView) {
                        ((StickerTabView) childAt).setExpanded(true);
                    }
                    childAt.getLayoutParams().width = AndroidUtilities.dp(EXPANDED_WIDTH);
                }
                this.tabsContainer.requestLayout();
                getLayoutParams().height = AndroidUtilities.dp(86.0f);
            }
            if (z) {
                float childCount = this.stickerTabExpandedWidth * this.tabsContainer.getChildCount() * ((getScrollX() + f) / (this.stickerTabWidth * this.tabsContainer.getChildCount()));
                this.expandOffset = childCount - (getScrollX() + f);
                this.scrollByOnNextMeasure = (int) (childCount - f);
            }
        }
    }

    public int getCurrentPosition() {
        return this.currentPosition;
    }

    public float getExpandedOffset() {
        if (this.animateToExpanded) {
            return AndroidUtilities.dp(50.0f) * this.expandProgress;
        }
        return 0.0f;
    }

    public Type getType() {
        return this.type;
    }

    public void invalidateOverlays() {
    }

    public void invalidateTabs() {
        int childCount = this.tabsContainer.getChildCount();
        for (int i = 0; i < childCount; i++) {
            this.tabsContainer.getChildAt(i).invalidate();
        }
    }

    public boolean isDragging() {
        return this.draggingView != null;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return checkLongPress(motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        setImages();
        int i5 = this.scrollByOnNextMeasure;
        if (i5 >= 0) {
            scrollTo(i5, 0);
            this.scrollByOnNextMeasure = -1;
        }
    }

    public void onPageScrolled(int i, int i2) {
        int i3 = this.currentPosition;
        if (i3 == i) {
            return;
        }
        View childAt = this.tabsContainer.getChildAt(i3);
        if (childAt != null) {
            this.startAnimationPosition = childAt.getLeft();
            this.positionAnimationProgress = 0.0f;
            this.animateFromPosition = true;
            this.lastAnimationTime = SystemClock.elapsedRealtime();
        } else {
            this.animateFromPosition = false;
        }
        this.currentPosition = i;
        if (i >= this.tabsContainer.getChildCount()) {
            return;
        }
        this.positionAnimationProgress = 0.0f;
        int i4 = 0;
        while (i4 < this.tabsContainer.getChildCount()) {
            this.tabsContainer.getChildAt(i4).setSelected(i4 == i);
            i4++;
        }
        if (this.expandStickerAnimator == null) {
            if (i2 != i || i <= 1) {
                scrollToChild(i);
            } else {
                scrollToChild(i - 1);
            }
        }
        invalidate();
    }

    @Override
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        setImages();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return checkLongPress(motionEvent) || super.onTouchEvent(motionEvent);
    }

    public void removeTabs() {
        this.tabsContainer.removeAllViews();
        this.tabTypes.clear();
        this.prevTypes.clear();
        this.futureTabsPositions.clear();
        this.tabCount = 0;
        this.currentPosition = 0;
        this.animateFromPosition = false;
    }

    public void selectTab(int i) {
        if (i < 0 || i >= this.tabCount) {
            return;
        }
        this.tabsContainer.getChildAt(i).performClick();
    }

    public void setCurrentPosition(int i) {
        this.currentPosition = i;
    }

    public void setDelegate(ScrollSlidingTabStripDelegate scrollSlidingTabStripDelegate) {
        this.delegate = scrollSlidingTabStripDelegate;
    }

    public void setDragEnabled(boolean z) {
        this.dragEnabled = z;
    }

    public void setImageReceiversLayerNum(int i) {
        this.imageReceiversPlayingNum = i;
    }

    public void setImages() {
        int i;
        String str;
        ImageLocation forSticker;
        Object obj;
        ArrayList<TLRPC.PhotoSize> arrayList;
        float fDp = AndroidUtilities.dp(33.0f);
        float fDp2 = AndroidUtilities.dp(EXPANDED_WIDTH - 33.0f);
        float f = this.expandProgress;
        float f2 = (fDp2 * f) + fDp;
        int scrollX = (int) (((getScrollX() - (this.animateToExpanded ? (1.0f - f) * this.expandOffset : 0.0f)) - this.tabsContainer.getPaddingLeft()) / f2);
        int iMin = Math.min(this.tabsContainer.getChildCount(), ((int) Math.ceil(getMeasuredWidth() / f2)) + scrollX + 1);
        if (this.animateToExpanded) {
            scrollX -= 2;
            iMin += 2;
            if (scrollX < 0) {
                scrollX = 0;
            }
            if (iMin > this.tabsContainer.getChildCount()) {
                iMin = this.tabsContainer.getChildCount();
            }
        }
        this.currentPlayingImagesTmp.clear();
        for (int i2 = 0; i2 < this.currentPlayingImages.size(); i2++) {
            this.currentPlayingImagesTmp.put(this.currentPlayingImages.valueAt(i2).index, this.currentPlayingImages.valueAt(i2));
        }
        this.currentPlayingImages.clear();
        while (true) {
            if (scrollX >= iMin) {
                break;
            }
            View childAt = this.tabsContainer.getChildAt(scrollX);
            if (childAt instanceof StickerTabView) {
                StickerTabView stickerTabView = (StickerTabView) childAt;
                if (stickerTabView.type == 2) {
                    Object tag = stickerTabView.getTag(R.id.parent_tag);
                    Object tag2 = stickerTabView.getTag(R.id.object_tag);
                    Drawable drawable = tag instanceof Drawable ? (Drawable) tag : null;
                    if (tag2 instanceof TLRPC.Document) {
                        stickerTabView.imageView.setImage(ImageLocation.getForDocument((TLRPC.Document) tag2), !LiteMode.isEnabled(1) ? "36_36_firstframe" : "36_36_nolimit", (Drawable) null, (Object) null);
                    } else {
                        stickerTabView.imageView.setImageDrawable(drawable);
                    }
                } else {
                    Object tag3 = childAt.getTag();
                    Object tag4 = childAt.getTag(R.id.parent_tag);
                    TLRPC.Document document = (TLRPC.Document) childAt.getTag(R.id.object_tag);
                    if (tag3 instanceof TLRPC.Document) {
                        if (!stickerTabView.inited) {
                            stickerTabView.svgThumb = DocumentObject.getSvgThumb((TLRPC.Document) tag3, Theme.key_emptyListPlaceholder, 0.2f);
                        }
                        forSticker = ImageLocation.getForDocument(document);
                        str = null;
                    } else if (tag3 instanceof TLRPC.PhotoSize) {
                        TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) tag3;
                        if (tag4 instanceof TLRPC.TL_messages_stickerSet) {
                            TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) tag4).set;
                            i = stickerSet.thumb_version;
                            if (!stickerTabView.inited) {
                                ArrayList<TLRPC.PhotoSize> arrayList2 = stickerSet.thumbs;
                                stickerTabView.svgThumb = DocumentObject.getSvgThumb(arrayList2, Theme.key_emptyListPlaceholder, 0.2f, DocumentObject.containsPhotoSizeType(arrayList2, "v"));
                            }
                        } else {
                            i = 0;
                        }
                        str = photoSize.type;
                        forSticker = ImageLocation.getForSticker(photoSize, document, i);
                    }
                    ImageLocation imageLocation = forSticker;
                    if (!stickerTabView.inited && stickerTabView.svgThumb == null && document != null) {
                        stickerTabView.svgThumb = DocumentObject.getSvgThumb(document, Theme.key_emptyListPlaceholder, 0.2f);
                    }
                    if (imageLocation != null) {
                        stickerTabView.inited = true;
                        SvgHelper.SvgDrawable svgDrawable = stickerTabView.svgThumb;
                        BackupImageView backupImageView = stickerTabView.imageView;
                        boolean zIsEnabled = LiteMode.isEnabled(1);
                        String str2 = !zIsEnabled ? "40_40_firstframe" : "40_40";
                        if ((str != null || !MessageObject.isVideoSticker(document) || (arrayList = document.thumbs) == null || arrayList.size() <= 0) && (str == null || !str.equalsIgnoreCase("v"))) {
                            if (!(str == null && MessageObject.isAnimatedStickerDocument(document, true)) && (str == null || !str.equalsIgnoreCase("a"))) {
                                if (imageLocation.imageType == 1) {
                                    backupImageView.setImage(imageLocation, str2, "tgs", svgDrawable, tag4);
                                } else {
                                    backupImageView.setImage(imageLocation, str2, "webp", svgDrawable, tag4);
                                }
                            } else if (svgDrawable != null) {
                                backupImageView.setImage(imageLocation, str2, svgDrawable, 0, tag4);
                            } else {
                                obj = tag4;
                                backupImageView.setImage(imageLocation, str2, imageLocation, (String) null, 0, obj);
                                tag4 = obj;
                            }
                        } else if (str == null) {
                            if (!zIsEnabled) {
                                backupImageView.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), "40_40", svgDrawable, 0, tag4);
                            } else if (svgDrawable != null) {
                                backupImageView.setImage(ImageLocation.getForDocument(document), str2, svgDrawable, 0, tag4);
                            } else {
                                obj = tag4;
                                backupImageView.setImage(ImageLocation.getForDocument(document), str2, imageLocation, (String) null, 0, obj);
                                tag4 = obj;
                            }
                        } else if (svgDrawable != null) {
                            backupImageView.setImage(imageLocation, str2, svgDrawable, 0, tag4);
                        } else {
                            obj = tag4;
                            backupImageView.setImage(imageLocation, str2, (ImageLocation) null, (String) null, 0, obj);
                            tag4 = obj;
                        }
                        stickerTabView.textView.setText(tag4 instanceof TLRPC.TL_messages_stickerSet ? ((TLRPC.TL_messages_stickerSet) tag4).set.title : null);
                    }
                }
                this.currentPlayingImages.put(stickerTabView.index, stickerTabView);
                this.currentPlayingImagesTmp.remove(stickerTabView.index);
            }
            scrollX++;
        }
        for (int i3 = 0; i3 < this.currentPlayingImagesTmp.size(); i3++) {
            if (this.currentPlayingImagesTmp.valueAt(i3) != this.draggingView) {
                this.currentPlayingImagesTmp.valueAt(i3).imageView.setImageDrawable(null);
            }
        }
    }

    public void setIndicatorColor(int i) {
        this.indicatorColor = i;
        invalidate();
    }

    public void setIndicatorHeight(int i) {
        this.indicatorHeight = i;
        invalidate();
    }

    public void setShouldExpand(boolean z) {
        this.shouldExpand = z;
        requestLayout();
    }

    public void setType(Type type) {
        if (type == null || this.type == type) {
            return;
        }
        this.type = type;
        int iOrdinal = type.ordinal();
        if (iOrdinal == 0) {
            this.indicatorDrawable.setCornerRadius(0.0f);
        } else {
            if (iOrdinal != 1) {
                return;
            }
            float fDpf2 = AndroidUtilities.dpf2(3.0f);
            this.indicatorDrawable.setCornerRadii(new float[]{fDpf2, fDpf2, fDpf2, fDpf2, 0.0f, 0.0f, 0.0f, 0.0f});
        }
    }

    public void setUnderlineColor(int i) {
        this.underlineColor = i;
        invalidate();
    }

    public void setUnderlineColorResource(int i) {
        this.underlineColor = getResources().getColor(i);
        invalidate();
    }

    public void setUnderlineHeight(int i) {
        if (this.underlineHeight != i) {
            this.underlineHeight = i;
            invalidate();
        }
    }

    public void showSelected(boolean z) {
        this.showSelected = z;
        invalidate();
    }

    public void stickerSetPositionChanged(int i, int i2) {
    }

    public void updatePosition() {
    }

    public void updateTabStyles() {
        for (int i = 0; i < this.tabCount; i++) {
            View childAt = this.tabsContainer.getChildAt(i);
            if (this.shouldExpand) {
                childAt.setLayoutParams(this.defaultExpandLayoutParams);
            } else {
                childAt.setLayoutParams(this.defaultTabLayoutParams);
            }
        }
    }

    public View addStickerTab(TLObject tLObject, TLRPC.Document document, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        StringBuilder sb = new StringBuilder("set");
        sb.append(tL_messages_stickerSet == null ? document.id : tL_messages_stickerSet.set.id);
        String string = sb.toString();
        int i = this.tabCount;
        this.tabCount = i + 1;
        StickerTabView stickerTabView = (StickerTabView) this.prevTypes.get(string);
        if (stickerTabView != null) {
            checkViewIndex(string, stickerTabView, i);
        } else {
            stickerTabView = new StickerTabView(getContext(), 0);
            stickerTabView.setFocusable(true);
            stickerTabView.setOnClickListener(new ScrollSlidingTabStrip$$ExternalSyntheticLambda0(this, 1));
            stickerTabView.setExpanded(this.expanded);
            stickerTabView.updateExpandProgress(this.expandProgress);
            this.tabsContainer.addView(stickerTabView, i);
        }
        stickerTabView.imageView.setLayerNum(this.imageReceiversPlayingNum);
        stickerTabView.isChatSticker = false;
        stickerTabView.setTag(tLObject);
        stickerTabView.setTag(R.id.index_tag, Integer.valueOf(i));
        stickerTabView.setTag(R.id.parent_tag, tL_messages_stickerSet);
        stickerTabView.setTag(R.id.object_tag, document);
        stickerTabView.setSelected(i == this.currentPosition);
        this.tabTypes.put(string, stickerTabView);
        return stickerTabView;
    }
}

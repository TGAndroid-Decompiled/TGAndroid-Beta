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
import android.os.Build;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
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
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$StickerSet;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ScrollSlidingTabStrip;
public class ScrollSlidingTabStrip extends HorizontalScrollView {
    public static float EXPANDED_WIDTH = 64.0f;
    boolean animateToExpanded;
    int currentDragPosition;
    SparseArray<StickerTabView> currentPlayingImages;
    SparseArray<StickerTabView> currentPlayingImagesTmp;
    private int currentPosition;
    private AnimatedFloat currentPositionAnimated;
    private LinearLayout.LayoutParams defaultExpandLayoutParams;
    private LinearLayout.LayoutParams defaultTabLayoutParams;
    private ScrollSlidingTabStripDelegate delegate;
    float dragDx;
    private boolean dragEnabled;
    float draggindViewDxOnScreen;
    float draggindViewXOnScreen;
    View draggingView;
    float draggingViewOutProgress;
    private float expandOffset;
    float expandProgress;
    ValueAnimator expandStickerAnimator;
    boolean expanded;
    private SparseArray<View> futureTabsPositions;
    private int imageReceiversPlayingNum;
    private GradientDrawable indicatorDrawable;
    private int indicatorHeight;
    private int lastScrollX;
    Runnable longClickRunnable;
    boolean longClickRunning;
    float pressedX;
    float pressedY;
    private HashMap<String, View> prevTypes;
    private Paint rectPaint;
    private final Theme.ResourcesProvider resourcesProvider;
    private int scrollByOnNextMeasure;
    private int scrollOffset;
    boolean scrollRight;
    Runnable scrollRunnable;
    long scrollStartTime;
    private Paint selectorPaint;
    private boolean shouldExpand;
    private boolean showSelected;
    private AnimatedFloat showSelectedAlpha;
    int startDragFromPosition;
    float startDragFromX;
    private float stickerTabExpandedWidth;
    private float stickerTabWidth;
    private RectF tabBounds;
    private int tabCount;
    private HashMap<String, View> tabTypes;
    private LinearLayout tabsContainer;
    private float touchSlop;
    private Type type;
    private int underlineColor;
    private int underlineHeight;

    public interface ScrollSlidingTabStripDelegate {
        void onPageSelected(int i);
    }

    public enum Type {
        LINE,
        TAB
    }

    protected void invalidateOverlays() {
    }

    protected void stickerSetPositionChanged(int i, int i2) {
    }

    protected void updatePosition() {
    }

    public ScrollSlidingTabStrip(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.imageReceiversPlayingNum = 1;
        this.type = Type.LINE;
        this.tabTypes = new HashMap<>();
        this.prevTypes = new HashMap<>();
        this.futureTabsPositions = new SparseArray<>();
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.currentPositionAnimated = new AnimatedFloat(this, 350L, cubicBezierInterpolator);
        new RectF();
        new RectF();
        this.tabBounds = new RectF();
        this.underlineColor = 436207616;
        this.indicatorDrawable = new GradientDrawable();
        this.scrollOffset = AndroidUtilities.dp(33.0f);
        this.underlineHeight = AndroidUtilities.dp(2.0f);
        AndroidUtilities.dp(12.0f);
        AndroidUtilities.dp(24.0f);
        this.lastScrollX = 0;
        this.currentPlayingImages = new SparseArray<>();
        this.currentPlayingImagesTmp = new SparseArray<>();
        this.longClickRunnable = new Runnable() {
            @Override
            public void run() {
                ScrollSlidingTabStrip scrollSlidingTabStrip = ScrollSlidingTabStrip.this;
                scrollSlidingTabStrip.longClickRunning = false;
                ScrollSlidingTabStrip scrollSlidingTabStrip2 = ScrollSlidingTabStrip.this;
                scrollSlidingTabStrip.startDragFromX = scrollSlidingTabStrip.getScrollX() + scrollSlidingTabStrip2.pressedX;
                scrollSlidingTabStrip2.dragDx = 0.0f;
                int ceil = ((int) Math.ceil(scrollSlidingTabStrip2.startDragFromX / scrollSlidingTabStrip2.getTabSize())) - 1;
                ScrollSlidingTabStrip scrollSlidingTabStrip3 = ScrollSlidingTabStrip.this;
                scrollSlidingTabStrip3.currentDragPosition = ceil;
                scrollSlidingTabStrip3.startDragFromPosition = ceil;
                if (scrollSlidingTabStrip3.canSwap(ceil) && ceil >= 0 && ceil < ScrollSlidingTabStrip.this.tabsContainer.getChildCount()) {
                    ScrollSlidingTabStrip.this.performHapticFeedback(0);
                    ScrollSlidingTabStrip scrollSlidingTabStrip4 = ScrollSlidingTabStrip.this;
                    scrollSlidingTabStrip4.draggindViewDxOnScreen = 0.0f;
                    scrollSlidingTabStrip4.draggingViewOutProgress = 0.0f;
                    scrollSlidingTabStrip4.draggingView = scrollSlidingTabStrip4.tabsContainer.getChildAt(ceil);
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
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ScrollSlidingTabStrip.AnonymousClass6.run():void");
            }
        };
        this.resourcesProvider = resourcesProvider;
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(context) {
            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
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

    public void setDelegate(ScrollSlidingTabStripDelegate scrollSlidingTabStripDelegate) {
        this.delegate = scrollSlidingTabStripDelegate;
    }

    public Type getType() {
        return this.type;
    }

    public void setType(Type type) {
        if (type == null || this.type == type) {
            return;
        }
        this.type = type;
        int i = AnonymousClass7.$SwitchMap$org$telegram$ui$Components$ScrollSlidingTabStrip$Type[type.ordinal()];
        if (i == 1) {
            this.indicatorDrawable.setCornerRadius(0.0f);
        } else if (i != 2) {
        } else {
            float dpf2 = AndroidUtilities.dpf2(3.0f);
            this.indicatorDrawable.setCornerRadii(new float[]{dpf2, dpf2, dpf2, dpf2, 0.0f, 0.0f, 0.0f, 0.0f});
        }
    }

    public static class AnonymousClass7 {
        static final int[] $SwitchMap$org$telegram$ui$Components$ScrollSlidingTabStrip$Type;

        static {
            int[] iArr = new int[Type.values().length];
            $SwitchMap$org$telegram$ui$Components$ScrollSlidingTabStrip$Type = iArr;
            try {
                iArr[Type.LINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$telegram$ui$Components$ScrollSlidingTabStrip$Type[Type.TAB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public void beginUpdate(boolean z) {
        this.prevTypes = this.tabTypes;
        this.tabTypes = new HashMap<>();
        this.futureTabsPositions.clear();
        this.tabCount = 0;
        if (!z || Build.VERSION.SDK_INT < 19) {
            return;
        }
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.setDuration(250L);
        autoTransition.setOrdering(0);
        autoTransition.addTransition(new AnonymousClass3());
        TransitionManager.beginDelayedTransition(this.tabsContainer, autoTransition);
    }

    public class AnonymousClass3 extends Transition {
        @Override
        public void captureEndValues(TransitionValues transitionValues) {
        }

        @Override
        public void captureStartValues(TransitionValues transitionValues) {
        }

        AnonymousClass3() {
        }

        @Override
        public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ScrollSlidingTabStrip.AnonymousClass3.this.lambda$createAnimator$0(valueAnimator);
                }
            });
            return ofFloat;
        }

        public void lambda$createAnimator$0(ValueAnimator valueAnimator) {
            ScrollSlidingTabStrip.this.invalidate();
        }
    }

    public void commitUpdate() {
        HashMap<String, View> hashMap = this.prevTypes;
        if (hashMap != null) {
            for (Map.Entry<String, View> entry : hashMap.entrySet()) {
                this.tabsContainer.removeView(entry.getValue());
            }
            this.prevTypes.clear();
        }
        int size = this.futureTabsPositions.size();
        for (int i = 0; i < size; i++) {
            int keyAt = this.futureTabsPositions.keyAt(i);
            View valueAt = this.futureTabsPositions.valueAt(i);
            if (this.tabsContainer.indexOfChild(valueAt) != keyAt) {
                this.tabsContainer.removeView(valueAt);
                this.tabsContainer.addView(valueAt, keyAt);
            }
        }
        this.futureTabsPositions.clear();
    }

    public void selectTab(int i) {
        if (i < 0 || i >= this.tabCount) {
            return;
        }
        this.tabsContainer.getChildAt(i).performClick();
    }

    private void checkViewIndex(String str, View view, int i) {
        HashMap<String, View> hashMap = this.prevTypes;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        this.futureTabsPositions.put(i, view);
    }

    public FrameLayout addIconTab(int i, Drawable drawable) {
        String str = "tab" + i;
        int i2 = this.tabCount;
        this.tabCount = i2 + 1;
        FrameLayout frameLayout = (FrameLayout) this.prevTypes.get(str);
        if (frameLayout != null) {
            checkViewIndex(str, frameLayout, i2);
        } else {
            frameLayout = new FrameLayout(getContext());
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout.addView(imageView, LayoutHelper.createFrame(24, 24, 17));
            frameLayout.setFocusable(true);
            frameLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ScrollSlidingTabStrip.this.lambda$addIconTab$0(view);
                }
            });
            this.tabsContainer.addView(frameLayout, i2);
        }
        frameLayout.setTag(R.id.index_tag, Integer.valueOf(i2));
        frameLayout.setSelected(i2 == this.currentPosition);
        this.tabTypes.put(str, frameLayout);
        return frameLayout;
    }

    public void lambda$addIconTab$0(View view) {
        this.delegate.onPageSelected(((Integer) view.getTag(R.id.index_tag)).intValue());
    }

    public StickerTabView addStickerIconTab(int i, Drawable drawable) {
        String str = "tab" + i;
        int i2 = this.tabCount;
        this.tabCount = i2 + 1;
        StickerTabView stickerTabView = (StickerTabView) this.prevTypes.get(str);
        if (stickerTabView != null) {
            checkViewIndex(str, stickerTabView, i2);
        } else {
            stickerTabView = new StickerTabView(getContext(), 1);
            stickerTabView.iconView.setImageDrawable(drawable);
            stickerTabView.setFocusable(true);
            stickerTabView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ScrollSlidingTabStrip.this.lambda$addStickerIconTab$1(view);
                }
            });
            stickerTabView.setExpanded(this.expanded);
            stickerTabView.updateExpandProgress(this.expandProgress);
            this.tabsContainer.addView(stickerTabView, i2);
        }
        stickerTabView.isChatSticker = false;
        stickerTabView.setTag(R.id.index_tag, Integer.valueOf(i2));
        stickerTabView.setSelected(i2 == this.currentPosition);
        this.tabTypes.put(str, stickerTabView);
        return stickerTabView;
    }

    public void lambda$addStickerIconTab$1(View view) {
        this.delegate.onPageSelected(((Integer) view.getTag(R.id.index_tag)).intValue());
    }

    public void addStickerTab(TLRPC$Chat tLRPC$Chat) {
        String str = "chat" + tLRPC$Chat.id;
        int i = this.tabCount;
        this.tabCount = i + 1;
        StickerTabView stickerTabView = (StickerTabView) this.prevTypes.get(str);
        if (stickerTabView != null) {
            checkViewIndex(str, stickerTabView, i);
        } else {
            stickerTabView = new StickerTabView(getContext(), 0);
            stickerTabView.setFocusable(true);
            stickerTabView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ScrollSlidingTabStrip.this.lambda$addStickerTab$2(view);
                }
            });
            this.tabsContainer.addView(stickerTabView, i);
            stickerTabView.setRoundImage();
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setTextSize(AndroidUtilities.dp(14.0f));
            avatarDrawable.setInfo(UserConfig.selectedAccount, tLRPC$Chat);
            BackupImageView backupImageView = stickerTabView.imageView;
            backupImageView.setLayerNum(this.imageReceiversPlayingNum);
            backupImageView.setForUserOrChat(tLRPC$Chat, avatarDrawable);
            backupImageView.setAspectFit(true);
            stickerTabView.setExpanded(this.expanded);
            stickerTabView.updateExpandProgress(this.expandProgress);
            stickerTabView.textView.setText(tLRPC$Chat.title);
        }
        stickerTabView.isChatSticker = true;
        stickerTabView.setTag(R.id.index_tag, Integer.valueOf(i));
        stickerTabView.setSelected(i == this.currentPosition);
        this.tabTypes.put(str, stickerTabView);
    }

    public void lambda$addStickerTab$2(View view) {
        this.delegate.onPageSelected(((Integer) view.getTag(R.id.index_tag)).intValue());
    }

    public View addEmojiTab(int i, Emoji.EmojiDrawable emojiDrawable, TLRPC$Document tLRPC$Document) {
        String str = "tab" + i;
        int i2 = this.tabCount;
        this.tabCount = i2 + 1;
        StickerTabView stickerTabView = (StickerTabView) this.prevTypes.get(str);
        if (stickerTabView != null) {
            checkViewIndex(str, stickerTabView, i2);
        } else {
            stickerTabView = new StickerTabView(getContext(), 2);
            stickerTabView.setFocusable(true);
            stickerTabView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ScrollSlidingTabStrip.this.lambda$addEmojiTab$3(view);
                }
            });
            stickerTabView.setExpanded(this.expanded);
            stickerTabView.updateExpandProgress(this.expandProgress);
            this.tabsContainer.addView(stickerTabView, i2);
        }
        stickerTabView.isChatSticker = false;
        stickerTabView.setTag(R.id.index_tag, Integer.valueOf(i2));
        stickerTabView.setTag(R.id.parent_tag, emojiDrawable);
        stickerTabView.setTag(R.id.object_tag, tLRPC$Document);
        stickerTabView.setSelected(i2 == this.currentPosition);
        this.tabTypes.put(str, stickerTabView);
        return stickerTabView;
    }

    public void lambda$addEmojiTab$3(View view) {
        this.delegate.onPageSelected(((Integer) view.getTag(R.id.index_tag)).intValue());
    }

    public View addStickerTab(TLObject tLObject, TLRPC$Document tLRPC$Document, TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        StringBuilder sb = new StringBuilder();
        sb.append("set");
        sb.append(tLRPC$TL_messages_stickerSet == null ? tLRPC$Document.id : tLRPC$TL_messages_stickerSet.set.id);
        String sb2 = sb.toString();
        int i = this.tabCount;
        this.tabCount = i + 1;
        StickerTabView stickerTabView = (StickerTabView) this.prevTypes.get(sb2);
        if (stickerTabView != null) {
            checkViewIndex(sb2, stickerTabView, i);
        } else {
            stickerTabView = new StickerTabView(getContext(), 0);
            stickerTabView.setFocusable(true);
            stickerTabView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ScrollSlidingTabStrip.this.lambda$addStickerTab$4(view);
                }
            });
            stickerTabView.setExpanded(this.expanded);
            stickerTabView.updateExpandProgress(this.expandProgress);
            this.tabsContainer.addView(stickerTabView, i);
        }
        stickerTabView.imageView.setLayerNum(this.imageReceiversPlayingNum);
        stickerTabView.isChatSticker = false;
        stickerTabView.setTag(tLObject);
        stickerTabView.setTag(R.id.index_tag, Integer.valueOf(i));
        stickerTabView.setTag(R.id.parent_tag, tLRPC$TL_messages_stickerSet);
        stickerTabView.setTag(R.id.object_tag, tLRPC$Document);
        stickerTabView.setSelected(i == this.currentPosition);
        this.tabTypes.put(sb2, stickerTabView);
        return stickerTabView;
    }

    public void lambda$addStickerTab$4(View view) {
        this.delegate.onPageSelected(((Integer) view.getTag(R.id.index_tag)).intValue());
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
            float[] fArr = new float[2];
            fArr[0] = this.expandProgress;
            fArr[1] = z ? 1.0f : 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            this.expandStickerAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    ScrollSlidingTabStrip.this.lambda$expandStickers$5(z, f, valueAnimator2);
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

    public float getExpandedOffset() {
        if (this.animateToExpanded) {
            return AndroidUtilities.dp(50.0f) * this.expandProgress;
        }
        return 0.0f;
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
            } else if (this.scrollOffset + left > (scrollX + getWidth()) - (this.scrollOffset * 2)) {
                int width = (left - getWidth()) + (this.scrollOffset * 3);
                this.lastScrollX = width;
                smoothScrollTo(width, 0);
            }
        }
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        setImages();
        int i5 = this.scrollByOnNextMeasure;
        if (i5 >= 0) {
            scrollTo(i5, 0);
            this.scrollByOnNextMeasure = -1;
        }
    }

    public void setImages() {
        float dp;
        int i;
        String str;
        ImageLocation forSticker;
        ArrayList<TLRPC$PhotoSize> arrayList;
        float f = this.expandProgress;
        int scrollX = (int) (((getScrollX() - (this.animateToExpanded ? this.expandOffset * (1.0f - f) : 0.0f)) - this.tabsContainer.getPaddingLeft()) / (AndroidUtilities.dp(33.0f) + (AndroidUtilities.dp(EXPANDED_WIDTH - 33.0f) * f)));
        int min = Math.min(this.tabsContainer.getChildCount(), ((int) Math.ceil(getMeasuredWidth() / dp)) + scrollX + 1);
        if (this.animateToExpanded) {
            scrollX -= 2;
            min += 2;
            if (scrollX < 0) {
                scrollX = 0;
            }
            if (min > this.tabsContainer.getChildCount()) {
                min = this.tabsContainer.getChildCount();
            }
        }
        this.currentPlayingImagesTmp.clear();
        for (int i2 = 0; i2 < this.currentPlayingImages.size(); i2++) {
            this.currentPlayingImagesTmp.put(this.currentPlayingImages.valueAt(i2).index, this.currentPlayingImages.valueAt(i2));
        }
        this.currentPlayingImages.clear();
        while (true) {
            if (scrollX >= min) {
                break;
            }
            View childAt = this.tabsContainer.getChildAt(scrollX);
            if (childAt instanceof StickerTabView) {
                StickerTabView stickerTabView = (StickerTabView) childAt;
                if (stickerTabView.type == 2) {
                    Object tag = stickerTabView.getTag(R.id.parent_tag);
                    Object tag2 = stickerTabView.getTag(R.id.object_tag);
                    Drawable drawable = tag instanceof Drawable ? (Drawable) tag : null;
                    if (tag2 instanceof TLRPC$Document) {
                        stickerTabView.imageView.setImage(ImageLocation.getForDocument((TLRPC$Document) tag2), !LiteMode.isEnabled(1) ? "36_36_firstframe" : "36_36_nolimit", (Drawable) null, (Object) null);
                    } else {
                        stickerTabView.imageView.setImageDrawable(drawable);
                    }
                } else {
                    Object tag3 = childAt.getTag();
                    Object tag4 = childAt.getTag(R.id.parent_tag);
                    TLRPC$Document tLRPC$Document = (TLRPC$Document) childAt.getTag(R.id.object_tag);
                    if (tag3 instanceof TLRPC$Document) {
                        if (!stickerTabView.inited) {
                            stickerTabView.svgThumb = DocumentObject.getSvgThumb((TLRPC$Document) tag3, Theme.key_emptyListPlaceholder, 0.2f);
                        }
                        forSticker = ImageLocation.getForDocument(tLRPC$Document);
                        str = null;
                    } else if (tag3 instanceof TLRPC$PhotoSize) {
                        TLRPC$PhotoSize tLRPC$PhotoSize = (TLRPC$PhotoSize) tag3;
                        if (tag4 instanceof TLRPC$TL_messages_stickerSet) {
                            TLRPC$StickerSet tLRPC$StickerSet = ((TLRPC$TL_messages_stickerSet) tag4).set;
                            i = tLRPC$StickerSet.thumb_version;
                            if (!stickerTabView.inited) {
                                stickerTabView.svgThumb = DocumentObject.getSvgThumb(tLRPC$StickerSet.thumbs, Theme.key_emptyListPlaceholder, 0.2f);
                            }
                        } else {
                            i = 0;
                        }
                        str = tLRPC$PhotoSize.type;
                        forSticker = ImageLocation.getForSticker(tLRPC$PhotoSize, tLRPC$Document, i);
                    }
                    if (!stickerTabView.inited && stickerTabView.svgThumb == null && tLRPC$Document != null) {
                        stickerTabView.svgThumb = DocumentObject.getSvgThumb(tLRPC$Document, Theme.key_emptyListPlaceholder, 0.2f);
                    }
                    if (forSticker != null) {
                        stickerTabView.inited = true;
                        SvgHelper.SvgDrawable svgDrawable = stickerTabView.svgThumb;
                        BackupImageView backupImageView = stickerTabView.imageView;
                        boolean z = !LiteMode.isEnabled(1);
                        String str2 = z ? "40_40_firstframe" : "40_40";
                        if ((str != null || !MessageObject.isVideoSticker(tLRPC$Document) || (arrayList = tLRPC$Document.thumbs) == null || arrayList.size() <= 0) && (str == null || !str.equalsIgnoreCase("v"))) {
                            if (!(str == null && MessageObject.isAnimatedStickerDocument(tLRPC$Document, true)) && (str == null || !str.equalsIgnoreCase("a"))) {
                                if (forSticker.imageType == 1) {
                                    backupImageView.setImage(forSticker, str2, "tgs", svgDrawable, tag4);
                                } else {
                                    backupImageView.setImage(forSticker, str2, "webp", svgDrawable, tag4);
                                }
                            } else if (svgDrawable != null) {
                                backupImageView.setImage(forSticker, str2, svgDrawable, 0, tag4);
                            } else {
                                backupImageView.setImage(forSticker, str2, forSticker, (String) null, 0, tag4);
                            }
                        } else if (str == null) {
                            if (z) {
                                backupImageView.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document.thumbs, 90), tLRPC$Document), "40_40", svgDrawable, 0, tag4);
                            } else if (svgDrawable != null) {
                                backupImageView.setImage(ImageLocation.getForDocument(tLRPC$Document), str2, svgDrawable, 0, tag4);
                            } else {
                                backupImageView.setImage(ImageLocation.getForDocument(tLRPC$Document), str2, forSticker, (String) null, 0, tag4);
                            }
                        } else if (svgDrawable != null) {
                            backupImageView.setImage(forSticker, str2, svgDrawable, 0, tag4);
                        } else {
                            backupImageView.setImage(forSticker, str2, (ImageLocation) null, (String) null, 0, tag4);
                        }
                        stickerTabView.textView.setText(tag4 instanceof TLRPC$TL_messages_stickerSet ? ((TLRPC$TL_messages_stickerSet) tag4).set.title : null);
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

    public int getTabSize() {
        return AndroidUtilities.dp(this.animateToExpanded ? EXPANDED_WIDTH : 33.0f);
    }

    @Override
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        setImages();
    }

    public void showSelected(boolean z) {
        this.showSelected = z;
        invalidate();
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        float f;
        float textWidth;
        Paint paint;
        float f2 = this.stickerTabWidth - this.stickerTabExpandedWidth;
        float f3 = this.expandOffset * (1.0f - this.expandProgress);
        for (int i = 0; i < this.tabsContainer.getChildCount(); i++) {
            if (this.tabsContainer.getChildAt(i) instanceof StickerTabView) {
                StickerTabView stickerTabView = (StickerTabView) this.tabsContainer.getChildAt(i);
                stickerTabView.animateIfPositionChanged(this);
                if (this.animateToExpanded) {
                    stickerTabView.setTranslationX((i * f2 * (1.0f - this.expandProgress)) + f3 + stickerTabView.dragOffset);
                } else {
                    stickerTabView.setTranslationX(stickerTabView.dragOffset);
                }
            }
        }
        float height = getHeight();
        if (this.animateToExpanded) {
            height = getHeight() - (AndroidUtilities.dp(50.0f) * (1.0f - this.expandProgress));
        }
        float f4 = height;
        float f5 = this.showSelectedAlpha.set(this.showSelected ? 1.0f : 0.0f);
        if (!isInEditMode() && this.tabCount != 0 && this.indicatorHeight >= 0) {
            float f6 = this.currentPositionAnimated.set(this.currentPosition);
            double d = f6;
            int floor = (int) Math.floor(d);
            int ceil = (int) Math.ceil(d);
            View view = null;
            View childAt = (floor < 0 || floor >= this.tabsContainer.getChildCount()) ? null : this.tabsContainer.getChildAt(floor);
            if (ceil >= 0 && ceil < this.tabsContainer.getChildCount()) {
                view = this.tabsContainer.getChildAt(ceil);
            }
            float f7 = f4 / 2.0f;
            if (childAt != null && view != null) {
                float f8 = f6 - floor;
                float lerp = AndroidUtilities.lerp(childAt.getLeft() + childAt.getTranslationX() + (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(EXPANDED_WIDTH), this.expandProgress) / 2.0f), view.getLeft() + view.getTranslationX() + (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(EXPANDED_WIDTH), this.expandProgress) / 2.0f), f8);
                textWidth = AndroidUtilities.lerp(childAt instanceof StickerTabView ? ((StickerTabView) childAt).getTextWidth() : 0.0f, view instanceof StickerTabView ? ((StickerTabView) view).getTextWidth() : 0.0f, f8);
                f = lerp;
            } else if (childAt != null) {
                f = childAt.getLeft() + childAt.getTranslationX() + (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(EXPANDED_WIDTH), this.expandProgress) / 2.0f);
                if (childAt instanceof StickerTabView) {
                    textWidth = ((StickerTabView) childAt).getTextWidth();
                }
                textWidth = 0.0f;
            } else {
                if (view != null) {
                    f = view.getLeft() + view.getTranslationX() + (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(EXPANDED_WIDTH), this.expandProgress) / 2.0f);
                    if (view instanceof StickerTabView) {
                        textWidth = ((StickerTabView) view).getTextWidth();
                    }
                } else {
                    f = 0.0f;
                }
                textWidth = 0.0f;
            }
            float dp = AndroidUtilities.dp(30.0f);
            float abs = (1.25f - ((Math.abs(0.5f - this.currentPositionAnimated.getTransitionProgressInterpolated()) * 0.25f) * 2.0f)) * dp;
            float interpolation = CubicBezierInterpolator.EASE_IN.getInterpolation(this.expandProgress);
            float lerp2 = f7 + AndroidUtilities.lerp(0, AndroidUtilities.dp(26.0f), interpolation);
            float lerp3 = AndroidUtilities.lerp(abs, textWidth + AndroidUtilities.dp(10.0f), interpolation) / 2.0f;
            float abs2 = ((dp * (((Math.abs(0.5f - this.currentPositionAnimated.getTransitionProgressInterpolated()) * 0.1f) * 2.0f) + 0.9f)) * AndroidUtilities.lerp(1.0f, 0.55f, interpolation)) / 2.0f;
            this.tabBounds.set(f - lerp3, lerp2 - abs2, f + lerp3, lerp2 + abs2);
            this.selectorPaint.setColor(ColorUtils.setAlphaComponent(getThemedColor(Theme.key_chat_emojiPanelIcon), 46));
            this.selectorPaint.setAlpha((int) (paint.getAlpha() * f5));
            canvas.drawRoundRect(this.tabBounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.selectorPaint);
        }
        super.dispatchDraw(canvas);
        if (isInEditMode() || this.tabCount == 0 || this.underlineHeight <= 0) {
            return;
        }
        this.rectPaint.setColor(this.underlineColor);
        canvas.drawRect(0.0f, f4 - this.underlineHeight, this.tabsContainer.getWidth(), f4, this.rectPaint);
    }

    public void drawOverlays(Canvas canvas) {
        if (this.draggingView != null) {
            canvas.save();
            float f = this.draggindViewXOnScreen - this.draggindViewDxOnScreen;
            float f2 = this.draggingViewOutProgress;
            if (f2 > 0.0f) {
                f = (f * (1.0f - f2)) + ((this.draggingView.getX() - getScrollX()) * this.draggingViewOutProgress);
            }
            canvas.translate(f, 0.0f);
            this.draggingView.draw(canvas);
            canvas.restore();
        }
    }

    public void setShouldExpand(boolean z) {
        this.shouldExpand = z;
        requestLayout();
    }

    public int getCurrentPosition() {
        return this.currentPosition;
    }

    public void onPageScrolled(int i, int i2) {
        int i3 = this.currentPosition;
        if (i3 == i) {
            return;
        }
        View childAt = this.tabsContainer.getChildAt(i3);
        if (childAt != null) {
            childAt.getLeft();
            SystemClock.elapsedRealtime();
        }
        this.currentPosition = i;
        if (i >= this.tabsContainer.getChildCount()) {
            return;
        }
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i4 >= this.tabsContainer.getChildCount()) {
                break;
            }
            View childAt2 = this.tabsContainer.getChildAt(i4);
            if (i4 != i) {
                z = false;
            }
            childAt2.setSelected(z);
            i4++;
        }
        if (this.expandStickerAnimator == null) {
            if (i2 == i && i > 1) {
                scrollToChild(i - 1);
            } else {
                scrollToChild(i);
            }
        }
        invalidate();
    }

    public void invalidateTabs() {
        int childCount = this.tabsContainer.getChildCount();
        for (int i = 0; i < childCount; i++) {
            this.tabsContainer.getChildAt(i).invalidate();
        }
    }

    public void setCurrentPosition(int i) {
        this.currentPosition = i;
    }

    public void setIndicatorHeight(int i) {
        this.indicatorHeight = i;
        invalidate();
    }

    public void setIndicatorColor(int i) {
        invalidate();
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

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return checkLongPress(motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return checkLongPress(motionEvent) || super.onTouchEvent(motionEvent);
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
        if (motionEvent.getAction() == 2 && this.draggingView != null) {
            int ceil = ((int) Math.ceil((getScrollX() + motionEvent.getX()) / getTabSize())) - 1;
            int i = this.currentDragPosition;
            if (ceil != i) {
                if (ceil < i) {
                    while (!canSwap(ceil) && ceil != this.currentDragPosition) {
                        ceil++;
                    }
                } else {
                    while (!canSwap(ceil) && ceil != this.currentDragPosition) {
                        ceil--;
                    }
                }
            }
            if (this.currentDragPosition != ceil && canSwap(ceil)) {
                for (int i2 = 0; i2 < this.tabsContainer.getChildCount(); i2++) {
                    if (i2 != this.currentDragPosition) {
                        ((StickerTabView) this.tabsContainer.getChildAt(i2)).saveXPosition();
                    }
                }
                this.startDragFromX += (ceil - this.currentDragPosition) * getTabSize();
                this.currentDragPosition = ceil;
                this.tabsContainer.removeView(this.draggingView);
                this.tabsContainer.addView(this.draggingView, this.currentDragPosition);
                invalidate();
            }
            this.draggindViewDxOnScreen = this.pressedX - motionEvent.getX();
            float x = motionEvent.getX();
            if (x < this.draggingView.getMeasuredWidth() / 2.0f) {
                startScroll(false);
            } else if (x > getMeasuredWidth() - (this.draggingView.getMeasuredWidth() / 2.0f)) {
                startScroll(true);
            } else {
                stopScroll();
            }
            this.tabsContainer.invalidate();
            invalidateOverlays();
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            stopScroll();
            AndroidUtilities.cancelRunOnUIThread(this.longClickRunnable);
            if (this.draggingView != null) {
                int i3 = this.startDragFromPosition;
                int i4 = this.currentDragPosition;
                if (i3 != i4) {
                    stickerSetPositionChanged(i3, i4);
                    for (int i5 = 0; i5 < this.tabsContainer.getChildCount(); i5++) {
                        this.tabsContainer.getChildAt(i5).setTag(R.id.index_tag, Integer.valueOf(i5));
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ScrollSlidingTabStrip.this.lambda$checkLongPress$6(valueAnimator);
                    }
                });
                ofFloat.addListener(new AnimatorListenerAdapter() {
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
                ofFloat.start();
            }
            this.longClickRunning = false;
            invalidateOverlays();
        }
        return false;
    }

    public void lambda$checkLongPress$6(ValueAnimator valueAnimator) {
        this.draggingViewOutProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidateOverlays();
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

    public boolean isDragging() {
        return this.draggingView != null;
    }

    @Override
    public void cancelLongPress() {
        super.cancelLongPress();
        this.longClickRunning = false;
        AndroidUtilities.cancelRunOnUIThread(this.longClickRunnable);
    }

    public void setDragEnabled(boolean z) {
        this.dragEnabled = z;
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    public void setImageReceiversLayerNum(int i) {
        this.imageReceiversPlayingNum = i;
    }
}

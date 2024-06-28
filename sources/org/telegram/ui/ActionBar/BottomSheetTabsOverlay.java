package org.telegram.ui.ActionBar;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.google.zxing.common.detector.MathUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.BottomSheetTabs;
import org.telegram.ui.ActionBar.BottomSheetTabsOverlay;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Text;
import org.telegram.ui.GradientClip;
import org.telegram.ui.bots.BotWebViewAttachedSheet;
import org.telegram.ui.bots.BotWebViewContainer;
import org.telegram.ui.bots.BotWebViewMenuContainer;
import org.telegram.ui.bots.BotWebViewSheet;

public class BottomSheetTabsOverlay extends FrameLayout {
    private final AnimatedFloat animatedCount;
    private Bitmap blurBitmap;
    private Paint blurBitmapPaint;
    private BitmapShader blurBitmapShader;
    private Matrix blurMatrix;
    private final Path clipPath;
    private final RectF clipRect;
    private Drawable closeAllButtonBackground;
    private boolean closeAllButtonBackgroundDark;
    private Text closeAllButtonText;
    private float dismissProgress;
    private ValueAnimator dismissingAnimator;
    private BotWebViewMenuContainer dismissingMenuContainer;
    private BotWebViewAttachedSheet dismissingSheet;
    private BotWebViewSheet dismissingSheet2;
    private BottomSheetTabs.TabDrawable dismissingTab;
    private GradientClip gradientClip;
    private boolean hitCloseAllButton;
    private boolean horizontallySwiping;
    private boolean isOpen;
    private float lastY;
    private final int maximumVelocity;
    private final int minimumVelocity;
    public float offset;
    private ValueAnimator openAnimator;
    private float openProgress;
    private final int[] pos;
    private final int[] pos2;
    private final int[] pos3;
    private TabPreview pressTab;
    private boolean pressTabClose;
    private final RectF rect;
    private final RectF rect2;
    private ValueAnimator scrollAnimator;
    private final OverScroller scroller;
    private boolean slowerDismiss;
    private long startTime;
    private float startX;
    private float startY;
    private final ArrayList<TabPreview> tabs;
    private BottomSheetTabs tabsView;
    private final RectF tabsViewBounds;
    private VelocityTracker velocityTracker;
    private boolean verticallyScrolling;

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        return false;
    }

    public BottomSheetTabsOverlay(Context context) {
        super(context);
        this.animatedCount = new AnimatedFloat(this, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.tabsViewBounds = new RectF();
        this.tabs = new ArrayList<>();
        this.pos = new int[2];
        this.pos2 = new int[2];
        this.pos3 = new int[2];
        this.rect = new RectF();
        this.rect2 = new RectF();
        this.clipRect = new RectF();
        this.clipPath = new Path();
        setWillNotDraw(false);
        this.scroller = new OverScroller(context);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.maximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.minimumVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2) + AndroidUtilities.navigationBarHeight, 1073741824));
    }

    public void setTabsView(BottomSheetTabs bottomSheetTabs) {
        this.tabsView = bottomSheetTabs;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Drawable drawable;
        if ((AndroidUtilities.isTablet() && motionEvent.getAction() == 0 && !this.tabsViewBounds.contains(motionEvent.getX(), motionEvent.getY())) || this.openProgress <= 0.0f) {
            return false;
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (motionEvent.getAction() == 0) {
            this.startTime = System.currentTimeMillis();
            this.startX = motionEvent.getX();
            this.startY = motionEvent.getY();
            TabPreview tabAt = getTabAt(motionEvent.getX(), motionEvent.getY());
            this.pressTab = tabAt;
            this.hitCloseAllButton = tabAt == null && (drawable = this.closeAllButtonBackground) != null && drawable.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
            Drawable drawable2 = this.closeAllButtonBackground;
            if (drawable2 != null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    drawable2.setHotspot(motionEvent.getX(), motionEvent.getY());
                }
                this.closeAllButtonBackground.setState(this.hitCloseAllButton ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : new int[0]);
            }
            this.verticallyScrolling = false;
            this.horizontallySwiping = false;
            this.pressTabClose = false;
            TabPreview tabPreview = this.pressTab;
            if (tabPreview != null) {
                tabPreview.cancelDismissAnimator();
                boolean contains = this.pressTab.tabDrawable.closeRipple.getBounds().contains((int) (motionEvent.getX() - this.pressTab.clickBounds.left), (int) ((motionEvent.getY() - this.pressTab.clickBounds.top) - AndroidUtilities.dp(24.0f)));
                this.pressTabClose = contains;
                if (Build.VERSION.SDK_INT >= 21 && contains) {
                    this.pressTab.tabDrawable.closeRipple.setHotspot((int) (motionEvent.getX() - this.rect.left), (int) (motionEvent.getY() - this.rect.centerY()));
                }
                this.pressTab.setPressed(!this.pressTabClose);
                this.pressTab.tabDrawable.closeRipple.setState(this.pressTabClose ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : new int[0]);
            }
            this.lastY = motionEvent.getY();
            if (!this.scroller.isFinished()) {
                this.scroller.abortAnimation();
            }
            ValueAnimator valueAnimator = this.scrollAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.scrollAnimator = null;
            }
        } else if (motionEvent.getAction() == 2) {
            TabPreview tabPreview2 = this.pressTab;
            if (tabPreview2 != null) {
                if (tabPreview2.isPressed()) {
                    if (!this.horizontallySwiping && !this.verticallyScrolling && MathUtils.distance(this.startX, motionEvent.getY(), motionEvent.getX(), motionEvent.getY()) > AndroidUtilities.touchSlop) {
                        this.horizontallySwiping = true;
                    }
                    if (!this.verticallyScrolling && !this.horizontallySwiping && MathUtils.distance(motionEvent.getX(), this.startY, motionEvent.getX(), motionEvent.getY()) > AndroidUtilities.touchSlop) {
                        if (!this.scroller.isFinished()) {
                            this.scroller.abortAnimation();
                        }
                        ValueAnimator valueAnimator2 = this.scrollAnimator;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                            this.scrollAnimator = null;
                        }
                        this.verticallyScrolling = true;
                    }
                    if (this.tabsView != null && (this.verticallyScrolling || this.horizontallySwiping)) {
                        this.pressTab.setPressed(false);
                        this.pressTab.cancelDismissAnimator();
                    }
                } else {
                    if (!this.pressTabClose && !this.horizontallySwiping && !this.verticallyScrolling && MathUtils.distance(this.startX, motionEvent.getY(), motionEvent.getX(), motionEvent.getY()) > AndroidUtilities.touchSlop) {
                        this.horizontallySwiping = true;
                    }
                    if (!this.pressTabClose && !this.verticallyScrolling && !this.horizontallySwiping && MathUtils.distance(motionEvent.getX(), this.startY, motionEvent.getX(), motionEvent.getY()) > AndroidUtilities.touchSlop) {
                        if (!this.scroller.isFinished()) {
                            this.scroller.abortAnimation();
                        }
                        ValueAnimator valueAnimator3 = this.scrollAnimator;
                        if (valueAnimator3 != null) {
                            valueAnimator3.cancel();
                            this.scrollAnimator = null;
                        }
                        this.verticallyScrolling = true;
                    }
                    if (this.pressTabClose) {
                        boolean contains2 = this.pressTab.tabDrawable.closeRipple.getBounds().contains((int) (motionEvent.getX() - this.pressTab.clickBounds.left), (int) ((motionEvent.getY() - this.pressTab.clickBounds.top) - AndroidUtilities.dp(24.0f)));
                        this.pressTabClose = contains2;
                        if (!contains2) {
                            this.pressTab.tabDrawable.closeRipple.setState(new int[0]);
                        }
                    }
                }
                if (!this.pressTab.isPressed()) {
                    if (this.horizontallySwiping) {
                        this.pressTab.dismissProgress = (motionEvent.getX() - this.startX) / AndroidUtilities.dp(300.0f);
                    } else if (this.verticallyScrolling) {
                        float y = motionEvent.getY() - this.lastY;
                        if (this.offset < getScrollMin()) {
                            y *= 1.0f - (Utilities.clamp((getScrollMin() - this.offset) / getScrollStep(), 1.0f, 0.0f) * 0.5f);
                        }
                        setScrollOffset(Utilities.clamp(((getScrollOffset() * getScrollStep()) - y) / getScrollStep(), getScrollMax(), getScrollMin() - (getScrollStep() * 1.4f)));
                        invalidate();
                    }
                }
                invalidate();
            }
            Drawable drawable3 = this.closeAllButtonBackground;
            if (drawable3 != null && this.hitCloseAllButton) {
                boolean z = this.pressTab == null && drawable3 != null && drawable3.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
                this.hitCloseAllButton = z;
                if (!z) {
                    this.closeAllButtonBackground.setState(new int[0]);
                }
            }
            this.lastY = motionEvent.getY();
        } else if (motionEvent.getAction() == 1) {
            TabPreview tabPreview3 = this.pressTab;
            if (tabPreview3 != null) {
                if (this.tabsView != null && Math.abs(tabPreview3.dismissProgress) > 0.4f) {
                    TabPreview tabPreview4 = this.pressTab;
                    tabPreview4.animateDismiss(tabPreview4.dismissProgress < 0.0f ? -1.0f : 1.0f);
                    if (this.tabsView.removeTab(this.pressTab.tabData, true)) {
                        closeTabsView();
                    } else {
                        scrollTo(Utilities.clamp(this.offset, getScrollMax(false), getScrollMin(false)));
                    }
                } else {
                    this.pressTab.animateDismiss(0.0f);
                    if (this.tabsView != null && this.pressTab.isPressed()) {
                        closeTabsView();
                        TabPreview tabPreview5 = this.pressTab;
                        tabPreview5.webView = null;
                        this.tabsView.openTab(tabPreview5.tabData);
                    } else if (this.verticallyScrolling) {
                        if (this.offset < getScrollMin() - (getScrollWindow() * 0.15f)) {
                            closeTabsView();
                        } else if (this.offset < getScrollMin()) {
                            scrollTo(getScrollMin());
                        } else {
                            this.velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
                            float yVelocity = this.velocityTracker.getYVelocity();
                            if (Math.abs(yVelocity) > this.minimumVelocity) {
                                this.scroller.fling(0, (int) (getScrollOffset() * getScrollStep()), 0, (int) (-yVelocity), 0, 0, (int) (getScrollMin() * getScrollStep()), (int) (getScrollMax() * getScrollStep()), 0, (int) (0.1f * getScrollStep()));
                            } else {
                                this.scroller.startScroll(0, (int) (getScrollOffset() * getScrollStep()), 0, 0, 0);
                            }
                        }
                        this.velocityTracker.recycle();
                        this.velocityTracker = null;
                        postInvalidateOnAnimation();
                    }
                }
                this.pressTab.setPressed(false);
                if (this.pressTabClose) {
                    this.pressTabClose = this.pressTab.tabDrawable.closeRipple.getBounds().contains((int) (motionEvent.getX() - this.pressTab.clickBounds.left), (int) ((motionEvent.getY() - this.pressTab.clickBounds.top) - AndroidUtilities.dp(24.0f)));
                }
                if (this.pressTabClose) {
                    this.pressTab.animateDismiss(1.0f);
                    if (this.tabsView.removeTab(this.pressTab.tabData, true)) {
                        closeTabsView();
                    } else {
                        scrollTo(Utilities.clamp(this.offset, getScrollMax(false), getScrollMin(false)));
                    }
                }
                this.pressTab.tabDrawable.closeRipple.setState(new int[0]);
            } else if (this.hitCloseAllButton) {
                this.tabsView.removeAll();
                closeTabsView();
            } else if (MathUtils.distance(this.startX, this.startY, motionEvent.getX(), motionEvent.getY()) <= AndroidUtilities.touchSlop && !this.verticallyScrolling && !this.horizontallySwiping && ((float) (System.currentTimeMillis() - this.startTime)) <= ViewConfiguration.getTapTimeout() * 1.2f) {
                closeTabsView();
            }
            this.pressTab = null;
            this.pressTabClose = false;
            VelocityTracker velocityTracker = this.velocityTracker;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.velocityTracker = null;
            }
            this.hitCloseAllButton = false;
            Drawable drawable4 = this.closeAllButtonBackground;
            if (drawable4 != null) {
                drawable4.setState(new int[0]);
            }
        } else if (motionEvent.getAction() == 3) {
            TabPreview tabPreview6 = this.pressTab;
            if (tabPreview6 != null) {
                tabPreview6.animateDismiss(0.0f);
                this.pressTab.setPressed(false);
                this.pressTab.tabDrawable.closeRipple.setState(new int[0]);
            }
            this.pressTab = null;
            this.pressTabClose = false;
            VelocityTracker velocityTracker2 = this.velocityTracker;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.velocityTracker = null;
            }
            this.hitCloseAllButton = false;
            Drawable drawable5 = this.closeAllButtonBackground;
            if (drawable5 != null) {
                drawable5.setState(new int[0]);
            }
        }
        return true;
    }

    @Override
    public void computeScroll() {
        if (this.scroller.computeScrollOffset()) {
            setScrollOffset(this.scroller.getCurrY() / getScrollStep());
            postInvalidateOnAnimation();
        }
    }

    public float getScrollOffset() {
        return this.offset;
    }

    public void setScrollOffset(float f) {
        this.offset = f;
    }

    private float getScrollStep() {
        return AndroidUtilities.dp(200.0f);
    }

    public float getScrollRange() {
        return getScrollRange(true);
    }

    public float getScrollRange(boolean z) {
        float f = 0.0f;
        for (int i = 0; i < this.tabs.size(); i++) {
            f += this.tabs.get(i).tabDrawable.index >= 0 ? 1.0f : 0.0f;
        }
        return z ? this.animatedCount.set(f) : f;
    }

    public float getScrollWindow() {
        return Math.min(SharedConfig.botTabs3DEffect ? 3.0f : 6.0f, getScrollRange());
    }

    public float getScrollMin() {
        return getScrollMin(true);
    }

    public float getScrollMin(boolean z) {
        return ((-getScrollWindow()) / 3.0f) * Utilities.clamp(getScrollRange(z), 1.0f, 0.0f);
    }

    public float getScrollMax() {
        return getScrollMax(true);
    }

    public float getScrollMax(boolean z) {
        return (getScrollRange(z) - getScrollWindow()) - ((getScrollWindow() / 3.0f) * Utilities.clamp(4.0f - getScrollRange(z), 0.5f, 0.0f));
    }

    private TabPreview getTabAt(float f, float f2) {
        if (this.openProgress < 1.0f) {
            return null;
        }
        for (int size = this.tabs.size() - 1; size >= 0; size--) {
            TabPreview tabPreview = this.tabs.get(size);
            if (Math.abs(tabPreview.dismissProgress) < 0.4f && tabPreview.clickBounds.contains(f, f2)) {
                return tabPreview;
            }
        }
        return null;
    }

    public void setSlowerDismiss(boolean z) {
        this.slowerDismiss = z;
    }

    public boolean dismissSheet(BotWebViewAttachedSheet botWebViewAttachedSheet) {
        ValueAnimator valueAnimator;
        if (botWebViewAttachedSheet == null || this.tabsView == null) {
            return false;
        }
        if (this.dismissingSheet != null && (valueAnimator = this.dismissingAnimator) != null) {
            valueAnimator.end();
            this.dismissingAnimator = null;
        }
        this.dismissingSheet = botWebViewAttachedSheet;
        botWebViewAttachedSheet.getWindowView().setDrawingFromOverlay(true);
        invalidate();
        ValueAnimator valueAnimator2 = this.dismissingAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        BottomSheetTabs.WebTabData saveState = botWebViewAttachedSheet.saveState();
        this.dismissingTab = this.tabsView.pushTab(saveState);
        this.dismissProgress = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.dismissingAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                BottomSheetTabsOverlay.this.lambda$dismissSheet$0(valueAnimator3);
            }
        });
        this.dismissingAnimator.addListener(new AnonymousClass1(saveState, botWebViewAttachedSheet));
        AndroidUtilities.applySpring(this.dismissingAnimator, 350.0f, 30.0f, 1.0f);
        ValueAnimator valueAnimator3 = this.dismissingAnimator;
        valueAnimator3.setDuration(valueAnimator3.getDuration() * (this.slowerDismiss ? 3 : 1));
        this.dismissingAnimator.start();
        this.slowerDismiss = false;
        return true;
    }

    public void lambda$dismissSheet$0(ValueAnimator valueAnimator) {
        this.dismissProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public class AnonymousClass1 extends AnimatorListenerAdapter {
        final BotWebViewAttachedSheet val$sheet;
        final BottomSheetTabs.WebTabData val$tab;

        AnonymousClass1(BottomSheetTabs.WebTabData webTabData, BotWebViewAttachedSheet botWebViewAttachedSheet) {
            this.val$tab = webTabData;
            this.val$sheet = botWebViewAttachedSheet;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            int i;
            int i2;
            final BottomSheetTabs.WebTabData webTabData = this.val$tab;
            BotWebViewContainer.MyWebView myWebView = webTabData.webView;
            if (myWebView != null && webTabData.previewBitmap == null && (i = webTabData.webViewWidth) > 0 && (i2 = webTabData.webViewHeight) > 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    BottomSheetTabsOverlay.renderHardwareViewToBitmap(myWebView, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            BottomSheetTabs.WebTabData.this.previewBitmap = (Bitmap) obj;
                        }
                    });
                } else {
                    webTabData.previewBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.RGB_565);
                    this.val$tab.webView.draw(new Canvas(this.val$tab.previewBitmap));
                }
            }
            this.val$sheet.release();
            BottomSheetTabsOverlay.this.dismissingSheet = null;
            BottomSheetTabsOverlay.this.invalidate();
        }
    }

    public boolean dismissSheet(BotWebViewSheet botWebViewSheet) {
        ValueAnimator valueAnimator;
        if (botWebViewSheet == null || this.tabsView == null) {
            return false;
        }
        if (this.dismissingSheet2 != null && (valueAnimator = this.dismissingAnimator) != null) {
            valueAnimator.end();
            this.dismissingAnimator = null;
        }
        this.dismissingSheet2 = botWebViewSheet;
        botWebViewSheet.getWindowView().setDrawingFromOverlay(true);
        invalidate();
        ValueAnimator valueAnimator2 = this.dismissingAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        BottomSheetTabs.WebTabData saveState = botWebViewSheet.saveState();
        this.dismissingTab = this.tabsView.pushTab(saveState);
        this.dismissProgress = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.dismissingAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                BottomSheetTabsOverlay.this.lambda$dismissSheet$1(valueAnimator3);
            }
        });
        this.dismissingAnimator.addListener(new AnonymousClass2(saveState, botWebViewSheet));
        AndroidUtilities.applySpring(this.dismissingAnimator, 350.0f, 30.0f, 1.0f);
        ValueAnimator valueAnimator3 = this.dismissingAnimator;
        valueAnimator3.setDuration(valueAnimator3.getDuration() * 2);
        this.dismissingAnimator.start();
        this.slowerDismiss = false;
        return true;
    }

    public void lambda$dismissSheet$1(ValueAnimator valueAnimator) {
        this.dismissProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public class AnonymousClass2 extends AnimatorListenerAdapter {
        final BotWebViewSheet val$sheet;
        final BottomSheetTabs.WebTabData val$tab;

        AnonymousClass2(BottomSheetTabs.WebTabData webTabData, BotWebViewSheet botWebViewSheet) {
            this.val$tab = webTabData;
            this.val$sheet = botWebViewSheet;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            int i;
            int i2;
            final BottomSheetTabs.WebTabData webTabData = this.val$tab;
            BotWebViewContainer.MyWebView myWebView = webTabData.webView;
            if (myWebView != null && webTabData.previewBitmap == null && (i = webTabData.webViewWidth) > 0 && (i2 = webTabData.webViewHeight) > 0) {
                if (Build.VERSION.SDK_INT >= 26) {
                    BottomSheetTabsOverlay.renderHardwareViewToBitmap(myWebView, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            BottomSheetTabs.WebTabData.this.previewBitmap = (Bitmap) obj;
                        }
                    });
                } else {
                    webTabData.previewBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.RGB_565);
                    this.val$tab.webView.draw(new Canvas(this.val$tab.previewBitmap));
                }
            }
            this.val$sheet.release();
            BottomSheetTabsOverlay.this.dismissingSheet2 = null;
            BottomSheetTabsOverlay.this.invalidate();
        }
    }

    public boolean dismissSheet(final BotWebViewMenuContainer botWebViewMenuContainer) {
        if (botWebViewMenuContainer == null || this.tabsView == null) {
            return false;
        }
        this.dismissingMenuContainer = botWebViewMenuContainer;
        botWebViewMenuContainer.setDrawingFromOverlay(true);
        invalidate();
        ValueAnimator valueAnimator = this.dismissingAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.dismissingTab = this.tabsView.pushTab(botWebViewMenuContainer.saveState());
        this.dismissProgress = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.dismissingAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                BottomSheetTabsOverlay.this.lambda$dismissSheet$2(valueAnimator2);
            }
        });
        this.dismissingAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                botWebViewMenuContainer.onDismiss();
                botWebViewMenuContainer.setDrawingFromOverlay(false);
                BottomSheetTabsOverlay.this.dismissingMenuContainer = null;
                BottomSheetTabsOverlay.this.invalidate();
            }
        });
        AndroidUtilities.applySpring(this.dismissingAnimator, 350.0f, 30.0f, 1.0f);
        ValueAnimator valueAnimator2 = this.dismissingAnimator;
        valueAnimator2.setDuration(valueAnimator2.getDuration());
        this.dismissingAnimator.start();
        return true;
    }

    public void lambda$dismissSheet$2(ValueAnimator valueAnimator) {
        this.dismissProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public boolean onBackPressed() {
        if (!this.isOpen) {
            return false;
        }
        closeTabsView();
        return true;
    }

    private void prepareBlur(View view) {
        this.blurBitmap = AndroidUtilities.makeBlurBitmap(view, 14.0f, 14);
        Paint paint = new Paint(1);
        this.blurBitmapPaint = paint;
        Bitmap bitmap = this.blurBitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.blurBitmapShader = bitmapShader;
        paint.setShader(bitmapShader);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, Theme.isCurrentThemeDark() ? 0.08f : 0.25f);
        this.blurBitmapPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.blurMatrix = new Matrix();
    }

    public void openTabsView() {
        BottomSheetTabs bottomSheetTabs = this.tabsView;
        if (bottomSheetTabs == null || !(bottomSheetTabs.getParent() instanceof View)) {
            return;
        }
        View view = (View) this.tabsView.getParent();
        view.getLocationOnScreen(this.pos);
        getLocationOnScreen(this.pos2);
        RectF rectF = this.tabsViewBounds;
        int i = this.pos[0];
        int[] iArr = this.pos2;
        rectF.set(i - iArr[0], r2[1] - iArr[1], (r2[0] - iArr[0]) + view.getWidth(), (this.pos[1] - this.pos2[1]) + view.getHeight());
        prepareBlur(view);
        clearTabs();
        prepareTabs();
        animateOpen(true);
    }

    public void clearTabs() {
        this.tabs.clear();
    }

    private void prepareTabs() {
        for (int size = this.tabsView.tabs.size() - 1; size >= 0; size--) {
            BottomSheetTabs.WebTabData webTabData = this.tabsView.tabs.get(size);
            BottomSheetTabs.TabDrawable tabDrawable = null;
            int i = 0;
            while (true) {
                if (i >= this.tabsView.tabDrawables.size()) {
                    break;
                }
                BottomSheetTabs.TabDrawable tabDrawable2 = this.tabsView.tabDrawables.get(i);
                if (tabDrawable2.tab == webTabData) {
                    tabDrawable = tabDrawable2;
                    break;
                }
                i++;
            }
            if (tabDrawable != null) {
                this.tabs.add(new TabPreview(this, webTabData, tabDrawable));
            }
        }
        this.animatedCount.set(this.tabs.size(), true);
        setScrollOffset(getScrollMax());
    }

    public void closeTabsView() {
        animateOpen(false);
    }

    private void scrollTo(float f) {
        ValueAnimator valueAnimator = this.scrollAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.scrollAnimator = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.offset, f);
        this.scrollAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                BottomSheetTabsOverlay.this.lambda$scrollTo$3(valueAnimator2);
            }
        });
        this.scrollAnimator.setDuration(250L);
        this.scrollAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.scrollAnimator.start();
    }

    public void lambda$scrollTo$3(ValueAnimator valueAnimator) {
        this.offset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    private void animateOpen(boolean z) {
        if (this.isOpen == z) {
            return;
        }
        ValueAnimator valueAnimator = this.openAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.isOpen = z;
        BottomSheetTabs bottomSheetTabs = this.tabsView;
        if (bottomSheetTabs != null) {
            bottomSheetTabs.drawTabs = false;
            bottomSheetTabs.invalidate();
        }
        invalidate();
        float[] fArr = new float[2];
        fArr[0] = this.openProgress;
        fArr[1] = z ? 1.0f : 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        this.openAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                BottomSheetTabsOverlay.this.lambda$animateOpen$4(valueAnimator2);
            }
        });
        this.openAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (BottomSheetTabsOverlay.this.tabsView != null) {
                    BottomSheetTabsOverlay.this.tabsView.drawTabs = true;
                    BottomSheetTabsOverlay.this.tabsView.invalidate();
                }
                BottomSheetTabsOverlay bottomSheetTabsOverlay = BottomSheetTabsOverlay.this;
                bottomSheetTabsOverlay.openProgress = bottomSheetTabsOverlay.isOpen ? 1.0f : 0.0f;
                BottomSheetTabsOverlay.this.invalidate();
                if (BottomSheetTabsOverlay.this.isOpen) {
                    return;
                }
                BottomSheetTabsOverlay.this.clearTabs();
            }
        });
        this.openAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.openAnimator.setDuration(320L);
        this.openAnimator.start();
    }

    public void lambda$animateOpen$4(ValueAnimator valueAnimator) {
        this.openProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    private void drawDismissingTab(Canvas canvas) {
        if (this.dismissingSheet != null) {
            getLocationOnScreen(this.pos2);
            this.tabsView.getLocationOnScreen(this.pos);
            this.tabsView.getTabBounds(this.rect, 0.0f);
            RectF rectF = this.rect;
            int i = this.pos[0];
            int[] iArr = this.pos2;
            rectF.offset(i - iArr[0], r6[1] - iArr[1]);
            float drawInto = this.dismissingSheet.getWindowView().drawInto(canvas, this.rect, this.dismissProgress, this.clipRect);
            if (this.dismissingTab != null) {
                this.clipPath.rewind();
                this.clipPath.addRoundRect(this.clipRect, drawInto, drawInto, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(this.clipPath);
                float dp = this.clipRect.top - (AndroidUtilities.dp(50.0f) * (1.0f - this.dismissProgress));
                RectF rectF2 = this.rect;
                RectF rectF3 = this.clipRect;
                rectF2.set(rectF3.left, dp, rectF3.right, AndroidUtilities.dp(50.0f) + dp);
                this.tabsView.setupTab(this.dismissingTab);
                this.dismissingTab.draw(canvas, this.rect, drawInto, this.dismissProgress);
                canvas.restore();
            }
        }
        BotWebViewSheet botWebViewSheet = this.dismissingSheet2;
        if (botWebViewSheet != null) {
            BotWebViewSheet.WindowView windowView = botWebViewSheet.getWindowView();
            getLocationOnScreen(this.pos2);
            this.tabsView.getLocationOnScreen(this.pos);
            this.tabsView.getTabBounds(this.rect, 0.0f);
            RectF rectF4 = this.rect;
            int i2 = this.pos[0];
            int[] iArr2 = this.pos2;
            rectF4.offset(i2 - iArr2[0], r7[1] - iArr2[1]);
            float drawInto2 = windowView.drawInto(canvas, this.rect, this.dismissProgress, this.clipRect);
            if (this.dismissingTab != null) {
                this.clipPath.rewind();
                this.clipPath.addRoundRect(this.clipRect, drawInto2, drawInto2, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(this.clipPath);
                float dp2 = this.clipRect.top - (AndroidUtilities.dp(50.0f) * (1.0f - this.dismissProgress));
                RectF rectF5 = this.rect;
                RectF rectF6 = this.clipRect;
                rectF5.set(rectF6.left, dp2, rectF6.right, AndroidUtilities.dp(50.0f) + dp2);
                this.tabsView.setupTab(this.dismissingTab);
                this.dismissingTab.draw(canvas, this.rect, drawInto2, this.dismissProgress);
                canvas.restore();
            }
        }
        if (this.dismissingMenuContainer != null) {
            getLocationOnScreen(this.pos2);
            this.dismissingMenuContainer.getLocationOnScreen(this.pos3);
            this.tabsView.getLocationOnScreen(this.pos);
            this.tabsView.getTabBounds(this.rect, 0.0f);
            RectF rectF7 = this.rect;
            int i3 = this.pos[0];
            int[] iArr3 = this.pos2;
            rectF7.offset(i3 - iArr3[0], r2[1] - iArr3[1]);
            float drawInto3 = this.dismissingMenuContainer.drawInto(canvas, this.rect, this.dismissProgress, this.clipRect);
            if (this.dismissingTab != null) {
                this.clipPath.rewind();
                this.clipPath.addRoundRect(this.clipRect, drawInto3, drawInto3, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(this.clipPath);
                float dp3 = this.clipRect.top - (AndroidUtilities.dp(50.0f) * (1.0f - this.dismissProgress));
                RectF rectF8 = this.rect;
                RectF rectF9 = this.clipRect;
                rectF8.set(rectF9.left, dp3, rectF9.right, AndroidUtilities.dp(50.0f) + dp3);
                this.tabsView.setupTab(this.dismissingTab);
                this.dismissingTab.draw(canvas, this.rect, drawInto3, this.dismissProgress);
                canvas.restore();
            }
        }
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return drawable == this.closeAllButtonBackground || super.verifyDrawable(drawable);
    }

    private void drawTabsPreview(Canvas canvas) {
        float f;
        int i;
        float f2;
        float f3;
        float min;
        Canvas canvas2;
        float f4;
        float f5;
        Canvas canvas3 = canvas;
        float f6 = 0.0f;
        if (this.openProgress <= 0.0f) {
            return;
        }
        canvas.save();
        canvas3.clipRect(this.tabsViewBounds);
        RectF rectF = this.tabsViewBounds;
        canvas3.translate(rectF.left, rectF.top);
        float width = this.tabsViewBounds.width();
        float height = this.tabsViewBounds.height();
        if (this.blurBitmap != null) {
            this.blurMatrix.reset();
            float width2 = this.tabsViewBounds.width() / this.blurBitmap.getWidth();
            this.blurMatrix.postScale(width2, width2);
            this.blurBitmapShader.setLocalMatrix(this.blurMatrix);
            this.blurBitmapPaint.setAlpha((int) (this.openProgress * 255.0f));
            canvas.drawRect(0.0f, 0.0f, width, height, this.blurBitmapPaint);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, width, height, 255, 31);
        float dp = AndroidUtilities.statusBarHeight + AndroidUtilities.dp(40.0f) + AndroidUtilities.dp(55.0f);
        float dp2 = AndroidUtilities.dp(68.0f);
        int min2 = (int) Math.min(AndroidUtilities.dp(340.0f), 0.95f * width);
        int i2 = (int) (height * 0.6f);
        float f7 = width / 2.0f;
        int i3 = 0;
        float f8 = 0.0f;
        while (true) {
            f = 1.0f;
            if (i3 >= this.tabs.size()) {
                break;
            }
            if (this.tabs.get(i3).tabDrawable.index < 0) {
                f = 0.0f;
            }
            f8 += f;
            i3++;
        }
        float f9 = this.animatedCount.set(f8);
        int i4 = 0;
        while (i4 < this.tabs.size()) {
            TabPreview tabPreview = this.tabs.get(i4);
            float position = (f9 - f) - tabPreview.tabDrawable.getPosition();
            float scrollOffset = (position - getScrollOffset()) / getScrollWindow();
            float f10 = width;
            float max = Math.max(scrollOffset, f6);
            float max2 = Math.max(Math.min(scrollOffset, f), -4.0f);
            if (SharedConfig.botTabs3DEffect) {
                i = i4;
                float dp3 = (AndroidUtilities.dp(6.0f) * Math.min(5.0f, position)) + dp;
                float f11 = dp3 + ((((height - dp2) - (i2 * 0.4f)) - dp3) * scrollOffset);
                f3 = dp2;
                f2 = dp;
                min = f11;
            } else {
                i = i4;
                float dp4 = (AndroidUtilities.dp(20.0f) * (((float) Math.pow(1.100000023841858d, position)) - 1.0f)) + dp;
                f2 = dp;
                f3 = dp2;
                min = Math.min(dp4 + ((((height - dp2) - (i2 * 0.4f)) - dp4) * ((float) Math.pow(max, 2.0d))), height);
            }
            float f12 = min2 / 2.0f;
            this.rect2.set(f7 - f12, min, f12 + f7, i2 + min);
            this.tabsView.getTabBounds(this.rect, Utilities.clamp(tabPreview.tabDrawable.getPosition(), 1.0f, 0.0f));
            this.rect.offset(this.tabsView.getX(), this.tabsView.getY());
            RectF rectF2 = this.rect;
            RectF rectF3 = this.rect2;
            AndroidUtilities.lerpCentered(rectF2, rectF3, this.openProgress, rectF3);
            BottomSheetTabs bottomSheetTabs = this.tabsView;
            if (bottomSheetTabs != null) {
                bottomSheetTabs.setupTab(tabPreview.tabDrawable);
            }
            canvas.save();
            tabPreview.clickBounds.set(this.rect2);
            if (!SharedConfig.botTabs3DEffect) {
                canvas2 = canvas;
                float lerp = AndroidUtilities.lerp(1.0f, 1.0f - Utilities.clamp(0.1f * f9, 0.5f, 0.25f), 1.0f - max);
                f4 = f2;
                f5 = f7;
                float lerp2 = AndroidUtilities.lerp(1.0f, AndroidUtilities.lerp(lerp, Math.min(1.0f, (float) Math.pow(0.699999988079071d, 1.0f - max2)), Utilities.clamp(f9 - 3.0f, 1.0f, 0.0f)), this.openProgress);
                canvas2.scale(lerp2, lerp2, this.rect2.centerX(), this.rect2.top);
                scale(tabPreview.clickBounds, lerp2, this.rect.centerX(), this.rect2.top);
                tabPreview.draw(canvas2, this.rect2, AndroidUtilities.lerp(tabPreview.tabDrawable.getAlpha(), 1.0f, this.openProgress), this.openProgress);
                canvas.restore();
            } else {
                tabPreview.matrix.reset();
                tabPreview.src[0] = this.rect2.left;
                tabPreview.src[1] = this.rect2.top;
                tabPreview.src[2] = this.rect2.right;
                tabPreview.src[3] = this.rect2.top;
                tabPreview.src[4] = this.rect2.right;
                tabPreview.src[5] = this.rect2.bottom;
                tabPreview.src[6] = this.rect2.left;
                tabPreview.src[7] = this.rect2.bottom;
                tabPreview.dst[0] = this.rect2.left;
                tabPreview.dst[1] = this.rect2.top - AndroidUtilities.dp(0.0f);
                tabPreview.dst[2] = this.rect2.right;
                tabPreview.dst[3] = this.rect2.top - AndroidUtilities.dp(0.0f);
                tabPreview.dst[4] = this.rect2.centerX() + ((this.rect2.width() / 2.0f) * AndroidUtilities.lerp(1.0f, 0.8f, this.openProgress));
                tabPreview.dst[5] = (this.rect2.top - AndroidUtilities.dp(0.0f)) + ((this.rect2.height() + AndroidUtilities.dp(0.0f)) * AndroidUtilities.lerp(1.0f, 0.6f, this.openProgress));
                tabPreview.dst[6] = this.rect2.centerX() - ((this.rect2.width() / 2.0f) * AndroidUtilities.lerp(1.0f, 0.8f, this.openProgress));
                tabPreview.dst[7] = (this.rect2.top - AndroidUtilities.dp(0.0f)) + ((this.rect2.height() + AndroidUtilities.dp(0.0f)) * AndroidUtilities.lerp(1.0f, 0.6f, this.openProgress));
                tabPreview.matrix.setPolyToPoly(tabPreview.src, 0, tabPreview.dst, 0, 4);
                canvas2 = canvas;
                canvas2.concat(tabPreview.matrix);
                tabPreview.draw(canvas2, this.rect2, AndroidUtilities.lerp(tabPreview.tabDrawable.getAlpha(), 1.0f, this.openProgress), this.openProgress);
                canvas.restore();
                f5 = f7;
                f4 = f2;
            }
            i4 = i + 1;
            dp = f4;
            f7 = f5;
            canvas3 = canvas2;
            width = f10;
            dp2 = f3;
            f = 1.0f;
            f6 = 0.0f;
        }
        float f13 = dp;
        Canvas canvas4 = canvas3;
        float f14 = width;
        canvas.save();
        if (this.gradientClip == null) {
            this.gradientClip = new GradientClip();
        }
        RectF rectF4 = AndroidUtilities.rectTmp;
        rectF4.set(0.0f, 0.0f, f14, f13);
        this.gradientClip.draw(canvas4, rectF4, true, this.openProgress);
        canvas.restore();
        canvas.restore();
        if (this.closeAllButtonText == null) {
            this.closeAllButtonText = new Text(LocaleController.getString(org.telegram.messenger.R.string.BotCloseAllTabs), 14.0f, AndroidUtilities.bold());
        }
        if (this.closeAllButtonBackground == null || this.closeAllButtonBackgroundDark != Theme.isCurrentThemeDark()) {
            boolean isCurrentThemeDark = Theme.isCurrentThemeDark();
            this.closeAllButtonBackgroundDark = isCurrentThemeDark;
            if (isCurrentThemeDark) {
                this.closeAllButtonBackground = Theme.createSimpleSelectorRoundRectDrawable(64, 553648127, 872415231);
            } else {
                this.closeAllButtonBackground = Theme.createSimpleSelectorRoundRectDrawable(64, 771751936, 1140850688);
            }
            this.closeAllButtonBackground.setCallback(this);
        }
        float currentWidth = this.closeAllButtonText.getCurrentWidth() + AndroidUtilities.dp(24.0f);
        float f15 = (f14 - currentWidth) / 2.0f;
        this.closeAllButtonBackground.setBounds((int) f15, (int) ((f13 - (AndroidUtilities.dp(95.0f) / 2.0f)) - AndroidUtilities.dp(14.0f)), (int) ((currentWidth + f14) / 2.0f), (int) ((f13 - (AndroidUtilities.dp(95.0f) / 2.0f)) + AndroidUtilities.dp(14.0f)));
        this.closeAllButtonBackground.setAlpha((int) (this.openProgress * 255.0f));
        this.closeAllButtonBackground.draw(canvas4);
        this.closeAllButtonText.draw(canvas, AndroidUtilities.dp(12.0f) + f15, f13 - (AndroidUtilities.dp(95.0f) / 2.0f), -1, this.openProgress);
        canvas.restore();
    }

    private void scale(RectF rectF, float f, float f2, float f3) {
        float f4 = f2 - rectF.left;
        float f5 = rectF.right - f2;
        rectF.set(f2 - (f4 * f), f3 - ((f3 - rectF.top) * f), f2 + (f5 * f), f3 + ((rectF.bottom - f3) * f));
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        drawDismissingTab(canvas);
        drawTabsPreview(canvas);
    }

    public static class TabPreview {
        private final Paint backgroundPaint;
        private final Paint bitmapPaint;
        public final ButtonBounce bounce;
        public final RectF clickBounds = new RectF();
        private final Path clipPath;
        private ValueAnimator dismissAnimator;
        public float dismissProgress;
        private final float[] dst;
        private final Matrix matrix;
        public final View parentView;
        public final Bitmap previewBitmap;
        public final Object previewNode;
        private final Paint shadowPaint;
        private final float[] src;
        private final RectF tabBounds;
        public final BottomSheetTabs.WebTabData tabData;
        public final BottomSheetTabs.TabDrawable tabDrawable;
        public WebView webView;

        public void cancelDismissAnimator() {
            ValueAnimator valueAnimator = this.dismissAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
        }

        public void animateDismiss(final float f) {
            cancelDismissAnimator();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.dismissProgress, f);
            this.dismissAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BottomSheetTabsOverlay.TabPreview.this.lambda$animateDismiss$0(valueAnimator);
                }
            });
            this.dismissAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    TabPreview tabPreview = TabPreview.this;
                    tabPreview.dismissProgress = f;
                    View view = tabPreview.parentView;
                    if (view != null) {
                        view.invalidate();
                    }
                }
            });
            if (Math.abs(f) < 0.1f) {
                AndroidUtilities.applySpring(this.dismissAnimator, 285.0f, 20.0f);
            } else {
                this.dismissAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            }
            this.dismissAnimator.start();
        }

        public void lambda$animateDismiss$0(ValueAnimator valueAnimator) {
            this.dismissProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            View view = this.parentView;
            if (view != null) {
                view.invalidate();
            }
        }

        public boolean isPressed() {
            return this.bounce.isPressed();
        }

        public void setPressed(boolean z) {
            this.bounce.setPressed(z);
        }

        public TabPreview(View view, BottomSheetTabs.WebTabData webTabData, BottomSheetTabs.TabDrawable tabDrawable) {
            Paint paint = new Paint(1);
            this.backgroundPaint = paint;
            this.matrix = new Matrix();
            this.src = new float[8];
            this.dst = new float[8];
            this.dismissProgress = 0.0f;
            this.shadowPaint = new Paint(1);
            this.tabBounds = new RectF();
            this.clipPath = new Path();
            this.bitmapPaint = new Paint(3);
            this.parentView = view;
            this.tabData = webTabData;
            this.tabDrawable = tabDrawable;
            this.previewBitmap = webTabData.previewBitmap;
            this.webView = null;
            this.previewNode = webTabData.previewNode;
            this.bounce = new ButtonBounce(view);
            paint.setColor(webTabData.backgroundColor);
        }

        public void draw(Canvas canvas, RectF rectF, float f, float f2) {
            float clamp = f * Utilities.clamp(1.0f - ((Math.abs(this.dismissProgress) - 0.3f) / 0.7f), 1.0f, 0.0f);
            if (clamp <= 0.0f) {
                return;
            }
            float lerp = SharedConfig.botTabs3DEffect ? AndroidUtilities.lerp(1.0f, 1.2f, f2) : 1.0f;
            canvas.save();
            canvas.rotate(this.dismissProgress * 20.0f, rectF.centerX() + (AndroidUtilities.dp(50.0f) * this.dismissProgress), rectF.bottom + AndroidUtilities.dp(350.0f));
            float scale = this.bounce.getScale(0.01f);
            canvas.scale(scale, scale, rectF.centerX(), rectF.centerY());
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f), f2);
            this.clipPath.rewind();
            this.clipPath.addRoundRect(rectF, lerp2, lerp2, Path.Direction.CW);
            canvas.save();
            this.shadowPaint.setColor(0);
            this.shadowPaint.setShadowLayer(AndroidUtilities.dp(30.0f), 0.0f, AndroidUtilities.dp(10.0f), Theme.multAlpha(536870912, (f2 > 0.7f ? f2 : 0.0f) * clamp));
            canvas.drawPath(this.clipPath, this.shadowPaint);
            canvas.clipPath(this.clipPath);
            float f3 = 255.0f * clamp;
            this.backgroundPaint.setAlpha((int) f3);
            canvas.drawRoundRect(rectF, lerp2, lerp2, this.backgroundPaint);
            canvas.save();
            canvas.translate(rectF.left, rectF.top + (AndroidUtilities.dp(50.0f) * lerp));
            Object obj = this.previewNode;
            if (obj != null && Build.VERSION.SDK_INT >= 29 && ((RenderNode) obj).hasDisplayList()) {
                RenderNode renderNode = (RenderNode) this.previewNode;
                float width = rectF.width() / renderNode.getWidth();
                canvas.scale(width, width);
                renderNode.setAlpha(clamp * f2);
                canvas.drawRenderNode(renderNode);
            } else if (this.previewBitmap != null) {
                float width2 = rectF.width() / this.previewBitmap.getWidth();
                canvas.scale(width2, width2);
                this.bitmapPaint.setAlpha((int) (f3 * f2));
                canvas.drawBitmap(this.previewBitmap, 0.0f, 0.0f, this.bitmapPaint);
            } else if (this.webView != null) {
                float width3 = rectF.width() / this.webView.getWidth();
                canvas.scale(width3, width3);
                canvas.saveLayerAlpha(0.0f, 0.0f, this.webView.getWidth(), this.webView.getHeight(), (int) (f3 * f2), 31);
                this.webView.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
            this.tabBounds.set(rectF);
            RectF rectF2 = this.tabBounds;
            rectF2.bottom = rectF2.top + Math.min(rectF.height(), AndroidUtilities.dp(50.0f));
            this.tabDrawable.setExpandProgress(f2);
            canvas.scale(1.0f, lerp, this.tabBounds.centerX(), this.tabBounds.top);
            this.tabDrawable.draw(canvas, this.tabBounds, lerp2, clamp * clamp);
            canvas.restore();
            canvas.restore();
        }
    }

    public static void renderHardwareViewToBitmap(View view, final Utilities.Callback<Bitmap> callback) {
        if (view == null || callback == null || view.getWidth() <= 0 || view.getHeight() <= 0) {
            if (callback != null) {
                callback.run(null);
                return;
            }
            return;
        }
        final SurfaceTexture surfaceTexture = new SurfaceTexture(false);
        surfaceTexture.setDefaultBufferSize(view.getWidth(), view.getHeight());
        final Surface surface = new Surface(surfaceTexture);
        final Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
        view.draw(lockHardwareCanvas);
        surface.unlockCanvasAndPost(lockHardwareCanvas);
        PixelCopy.request(surface, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() {
            @Override
            public void onPixelCopyFinished(int i) {
                if (i == 0) {
                    Utilities.Callback.this.run(createBitmap);
                } else {
                    createBitmap.recycle();
                    Utilities.Callback.this.run(null);
                }
                surface.release();
                surfaceTexture.release();
            }
        }, new Handler());
    }
}

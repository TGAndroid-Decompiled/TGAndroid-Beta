package org.telegram.ui.ActionBar;

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
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.OverScroller;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.zxing.common.detector.MathUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticApiModelOutline2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Text;
import org.telegram.ui.GradientClip;
import org.telegram.ui.bots.BotWebViewSheet;

public class BottomSheetTabsOverlay extends View {
    private OverlayAccessibilityHelper accessibilityHelper;
    private View actionBarLayout;
    private final AnimatedFloat animatedCount;
    private ValueAnimator animator;
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
    private Sheet dismissingSheet;
    private BottomSheetTabs.TabDrawable dismissingTab;
    private GradientClip gradientClip;
    private boolean hitCloseAllButton;
    private boolean horizontallySwiping;
    public boolean isOpen;
    private float lastY;
    private final int maximumVelocity;
    private final int minimumVelocity;
    private int navigationBarInset;
    public float offset;
    private ValueAnimator openAnimator;
    private float openProgress;
    private float openingProgress;
    private Sheet openingSheet;
    private BottomSheetTabs.TabDrawable openingTab;
    private float openingTabScroll;
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
    private final ArrayList tabs;
    private BottomSheetTabs tabsView;
    private final RectF tabsViewBounds;
    private VelocityTracker velocityTracker;
    private boolean verticallyScrolling;

    public interface Sheet {

        public abstract class CC {
            public static void $default$setLastVisible(Sheet sheet, boolean z) {
            }
        }

        void dismiss(boolean z);

        int getNavigationBarColor(int i);

        SheetView mo1343getWindowView();

        boolean hadDialog();

        void release();

        BottomSheetTabs.WebTabData saveState();

        boolean setDialog(BottomSheetTabDialog bottomSheetTabDialog);

        void setLastVisible(boolean z);
    }

    public interface SheetView {
        float drawInto(Canvas canvas, RectF rectF, float f, RectF rectF2, float f2, boolean z);

        Context getContext();

        RectF getRect();

        void setDrawingFromOverlay(boolean z);
    }

    public BottomSheetTabsOverlay(Context context) {
        super(context);
        this.animatedCount = new AnimatedFloat(this, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.tabsViewBounds = new RectF();
        this.tabs = new ArrayList();
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
        OverlayAccessibilityHelper overlayAccessibilityHelper = new OverlayAccessibilityHelper(this);
        this.accessibilityHelper = overlayAccessibilityHelper;
        ViewCompat.setAccessibilityDelegate(this, overlayAccessibilityHelper);
        setImportantForAccessibility(2);
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() {
            @Override
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return this.f$0.onApplyWindowInsets(view, windowInsetsCompat);
            }
        });
    }

    @Override
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        OverlayAccessibilityHelper overlayAccessibilityHelper;
        if (this.openProgress <= 0.0f || (overlayAccessibilityHelper = this.accessibilityHelper) == null || !overlayAccessibilityHelper.dispatchHoverEvent(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        this.navigationBarInset = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.navigationBars()).bottom;
        invalidate();
        return WindowInsetsCompat.CONSUMED;
    }

    public void setTabsView(BottomSheetTabs bottomSheetTabs) {
        this.tabsView = bottomSheetTabs;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
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
            this.pressTab = getTabAt(motionEvent.getX(), motionEvent.getY());
            Drawable drawable = this.closeAllButtonBackground;
            boolean z = drawable != null && drawable.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
            this.hitCloseAllButton = z;
            if (z) {
                this.pressTab = null;
            }
            Drawable drawable2 = this.closeAllButtonBackground;
            if (drawable2 != null) {
                drawable2.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.closeAllButtonBackground.setState(this.hitCloseAllButton ? new int[]{16842919, 16842910} : new int[0]);
            }
            this.verticallyScrolling = false;
            this.horizontallySwiping = false;
            this.pressTabClose = false;
            TabPreview tabPreview = this.pressTab;
            if (tabPreview != null) {
                tabPreview.cancelDismissAnimator();
                boolean zContains = this.pressTab.tabDrawable.closeRipple.getBounds().contains((int) (motionEvent.getX() - this.pressTab.clickBounds.left), (int) ((motionEvent.getY() - this.pressTab.clickBounds.top) - AndroidUtilities.dp(24.0f)));
                this.pressTabClose = zContains;
                if (zContains) {
                    this.pressTab.tabDrawable.closeRipple.setHotspot((int) (motionEvent.getX() - this.rect.left), (int) (motionEvent.getY() - this.rect.centerY()));
                }
                this.pressTab.setPressed(!this.pressTabClose);
                this.pressTab.tabDrawable.closeRipple.setState(this.pressTabClose ? new int[]{16842919, 16842910} : new int[0]);
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
                        boolean zContains2 = this.pressTab.tabDrawable.closeRipple.getBounds().contains((int) (motionEvent.getX() - this.pressTab.clickBounds.left), (int) ((motionEvent.getY() - this.pressTab.clickBounds.top) - AndroidUtilities.dp(24.0f)));
                        this.pressTabClose = zContains2;
                        if (!zContains2) {
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
                boolean z2 = this.pressTab == null && drawable3.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
                this.hitCloseAllButton = z2;
                if (!z2) {
                    this.closeAllButtonBackground.setState(new int[0]);
                }
            }
            this.lastY = motionEvent.getY();
        } else if (motionEvent.getAction() == 1) {
            TabPreview tabPreview3 = this.pressTab;
            if (tabPreview3 != null) {
                if (this.tabsView != null && Math.abs(tabPreview3.dismissProgress) > 0.4f) {
                    final TabPreview tabPreview4 = this.pressTab;
                    this.tabsView.removeTab(tabPreview4.tabData, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            this.f$0.lambda$dispatchTouchEvent$0(tabPreview4, (Boolean) obj);
                        }
                    });
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
                                this.scroller.fling(0, (int) (getScrollOffset() * getScrollStep()), 0, (int) (-yVelocity), 0, 0, (int) (getScrollMin() * getScrollStep()), (int) (getScrollMax() * getScrollStep()), 0, (int) (getScrollStep() * 0.1f));
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
                    final TabPreview tabPreview6 = this.pressTab;
                    this.tabsView.removeTab(tabPreview6.tabData, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            this.f$0.lambda$dispatchTouchEvent$1(tabPreview6, (Boolean) obj);
                        }
                    });
                }
                this.pressTab.tabDrawable.closeRipple.setState(new int[0]);
            } else if (this.hitCloseAllButton) {
                this.tabsView.removeAll();
                closeTabsView();
            } else if (MathUtils.distance(this.startX, this.startY, motionEvent.getX(), motionEvent.getY()) <= AndroidUtilities.touchSlop && !this.verticallyScrolling && !this.horizontallySwiping && System.currentTimeMillis() - this.startTime <= ViewConfiguration.getTapTimeout() * 1.2f) {
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
            TabPreview tabPreview7 = this.pressTab;
            if (tabPreview7 != null) {
                tabPreview7.animateDismiss(0.0f);
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

    public void lambda$dispatchTouchEvent$0(TabPreview tabPreview, Boolean bool) {
        if (bool.booleanValue()) {
            tabPreview.animateDismiss(tabPreview.dismissProgress < 0.0f ? -1.0f : 1.0f);
            scrollTo(Utilities.clamp(this.offset, getScrollMax(false), getScrollMin(false)));
            if (this.tabsView.getTabs().isEmpty()) {
                closeTabsView();
                return;
            }
            return;
        }
        tabPreview.animateDismiss(0.0f);
    }

    public void lambda$dispatchTouchEvent$1(TabPreview tabPreview, Boolean bool) {
        if (bool.booleanValue()) {
            tabPreview.animateDismiss(1.0f);
            scrollTo(Utilities.clamp(this.offset, getScrollMax(false), getScrollMin(false)));
            if (this.tabsView.getTabs().isEmpty()) {
                closeTabsView();
                return;
            }
            return;
        }
        tabPreview.animateDismiss(0.0f);
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
            f += ((TabPreview) this.tabs.get(i)).tabDrawable.index >= 0 ? 1.0f : 0.0f;
        }
        return z ? this.animatedCount.set(f) : f;
    }

    public float getScrollWindow() {
        return Math.min(3.0f, getScrollRange());
    }

    public float getScrollWindow(boolean z) {
        return Math.min(3.0f, getScrollRange(z));
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
        return (getScrollRange(z) - getScrollWindow(z)) - ((getScrollWindow(z) / 3.0f) * Utilities.clamp(4.0f - getScrollRange(z), 0.5f, 0.0f));
    }

    private TabPreview getTabAt(float f, float f2) {
        if (this.openProgress < 1.0f) {
            return null;
        }
        for (int size = this.tabs.size() - 1; size >= 0; size--) {
            TabPreview tabPreview = (TabPreview) this.tabs.get(size);
            if (Math.abs(tabPreview.dismissProgress) < 0.4f && tabPreview.clickBounds.contains(f, f2)) {
                return tabPreview;
            }
        }
        return null;
    }

    public void setSlowerDismiss(boolean z) {
        this.slowerDismiss = z;
    }

    public void stopAnimations() {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.animator = null;
        }
    }

    public boolean dismissSheet(final Sheet sheet) {
        ValueAnimator valueAnimator;
        if (sheet == null || this.tabsView == null) {
            return false;
        }
        if ((this.dismissingSheet != null || this.openingSheet != null) && (valueAnimator = this.animator) != null) {
            valueAnimator.end();
            this.animator = null;
        }
        this.dismissingSheet = sheet;
        sheet.setLastVisible(false);
        ValueAnimator valueAnimator2 = this.animator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        BottomSheetTabs.WebTabData webTabDataSaveState = sheet.saveState();
        this.dismissingTab = this.tabsView.pushTab(webTabDataSaveState);
        post(new Runnable() {
            @Override
            public final void run() {
                BottomSheetTabsOverlay.lambda$dismissSheet$3(sheet);
            }
        });
        invalidate();
        this.dismissProgress = 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.animator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                this.f$0.lambda$dismissSheet$4(valueAnimator3);
            }
        });
        this.animator.addListener(new AnonymousClass2(webTabDataSaveState, sheet));
        AndroidUtilities.applySpring(this.animator, 220.0d, 30.0d, 1.0d);
        ValueAnimator valueAnimator3 = this.animator;
        valueAnimator3.setDuration((long) (valueAnimator3.getDuration() * 1.1f));
        this.animator.start();
        this.slowerDismiss = false;
        return true;
    }

    public static void lambda$dismissSheet$3(Sheet sheet) {
        if (sheet == null || sheet.mo1343getWindowView() == null) {
            return;
        }
        sheet.mo1343getWindowView().setDrawingFromOverlay(true);
    }

    public void lambda$dismissSheet$4(ValueAnimator valueAnimator) {
        this.dismissProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    class AnonymousClass2 extends AnimatorListenerAdapter {
        final Sheet val$sheet;
        final BottomSheetTabs.WebTabData val$tab;

        AnonymousClass2(BottomSheetTabs.WebTabData webTabData, Sheet sheet) {
            this.val$tab = webTabData;
            this.val$sheet = sheet;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            int i;
            int i2;
            final BottomSheetTabs.WebTabData webTabData = this.val$tab;
            View view = webTabData.webView;
            if (view == null) {
                view = webTabData.view2;
            }
            if (view != null && webTabData.previewBitmap == null && (i = webTabData.viewWidth) > 0 && (i2 = webTabData.viewHeight) > 0) {
                if (Build.VERSION.SDK_INT >= 26) {
                    float f = -webTabData.viewScroll;
                    final Sheet sheet = this.val$sheet;
                    BottomSheetTabsOverlay.renderHardwareViewToBitmap(view, f, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            BottomSheetTabsOverlay.AnonymousClass2.lambda$onAnimationEnd$0(webTabData, sheet, (Bitmap) obj);
                        }
                    });
                    BottomSheetTabsOverlay.this.dismissingSheet = null;
                    BottomSheetTabsOverlay.this.invalidate();
                    return;
                }
                webTabData.previewBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.RGB_565);
                Canvas canvas = new Canvas(this.val$tab.previewBitmap);
                canvas.translate(0.0f, -this.val$tab.viewScroll);
                view.draw(canvas);
            }
            this.val$sheet.mo1343getWindowView().setDrawingFromOverlay(false);
            this.val$sheet.release();
            BottomSheetTabsOverlay.this.dismissingSheet = null;
            BottomSheetTabsOverlay.this.invalidate();
        }

        public static void lambda$onAnimationEnd$0(BottomSheetTabs.WebTabData webTabData, Sheet sheet, Bitmap bitmap) {
            webTabData.previewBitmap = bitmap;
            sheet.mo1343getWindowView().setDrawingFromOverlay(false);
            sheet.release();
        }
    }

    public boolean onBackPressed() {
        if (!this.isOpen) {
            return false;
        }
        closeTabsView();
        return true;
    }

    private void prepareBlur(View view) {
        AndroidUtilities.makingGlobalBlurBitmap = true;
        this.blurBitmap = AndroidUtilities.makeBlurBitmap(view, 14.0f, 14);
        AndroidUtilities.makingGlobalBlurBitmap = false;
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
        if (!BotWebViewSheet.activeSheets.isEmpty()) {
            Iterator it = new HashSet(BotWebViewSheet.activeSheets).iterator();
            while (it.hasNext()) {
                ((BotWebViewSheet) it.next()).dismiss(true);
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.openTabsView();
                }
            }, 100L);
            return;
        }
        stopAnimations();
        View view = (View) this.tabsView.getParent();
        this.actionBarLayout = view;
        if (view != null) {
            view.getLocationOnScreen(this.pos);
        } else {
            int[] iArr = this.pos;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        getLocationOnScreen(this.pos2);
        RectF rectF = this.tabsViewBounds;
        int[] iArr2 = this.pos;
        int i = iArr2[0];
        int[] iArr3 = this.pos2;
        int i2 = i - iArr3[0];
        rectF.set(i2, iArr2[1] - iArr3[1], i2 + this.actionBarLayout.getWidth(), (this.pos[1] - this.pos2[1]) + this.actionBarLayout.getHeight());
        prepareBlur(this.actionBarLayout);
        clearTabs();
        prepareTabs();
        animateOpen(true);
    }

    public void clearTabs() {
        this.tabs.clear();
    }

    private void prepareTabs() {
        BottomSheetTabs.TabDrawable tabDrawable;
        ArrayList<BottomSheetTabs.WebTabData> tabs = this.tabsView.getTabs();
        ArrayList<BottomSheetTabs.TabDrawable> tabDrawables = this.tabsView.getTabDrawables();
        for (int size = tabs.size() - 1; size >= 0; size--) {
            BottomSheetTabs.WebTabData webTabData = tabs.get(size);
            int i = 0;
            while (true) {
                if (i >= tabDrawables.size()) {
                    tabDrawable = null;
                    break;
                }
                tabDrawable = tabDrawables.get(i);
                if (tabDrawable.tab == webTabData) {
                    break;
                } else {
                    i++;
                }
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
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.offset, f);
        this.scrollAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f$0.lambda$scrollTo$5(valueAnimator2);
            }
        });
        this.scrollAnimator.setDuration(250L);
        this.scrollAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.scrollAnimator.start();
    }

    public void lambda$scrollTo$5(ValueAnimator valueAnimator) {
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
        setModalAccessibility(z);
        invalidate();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.openProgress, z ? 1.0f : 0.0f);
        this.openAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f$0.lambda$animateOpen$6(valueAnimator2);
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
                BottomSheetTabsOverlay bottomSheetTabsOverlay2 = BottomSheetTabsOverlay.this;
                if (bottomSheetTabsOverlay2.isOpen || bottomSheetTabsOverlay2.openingSheet != null) {
                    return;
                }
                BottomSheetTabsOverlay.this.clearTabs();
            }
        });
        this.openAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.openAnimator.setDuration(320L);
        this.openAnimator.start();
    }

    public void lambda$animateOpen$6(ValueAnimator valueAnimator) {
        this.openProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    private void setModalAccessibility(boolean z) {
        setImportantForAccessibility(z ? 1 : 2);
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != this) {
                    childAt.setImportantForAccessibility(z ? 4 : 0);
                }
            }
        }
        OverlayAccessibilityHelper overlayAccessibilityHelper = this.accessibilityHelper;
        if (overlayAccessibilityHelper != null) {
            overlayAccessibilityHelper.invalidateRoot();
        }
        if (z) {
            sendAccessibilityEvent(32);
        }
    }

    class OverlayAccessibilityHelper extends ExploreByTouchHelper {
        private final Rect tmpRect;

        public OverlayAccessibilityHelper(View view) {
            super(view);
            this.tmpRect = new Rect();
        }

        @Override
        protected int getVirtualViewAt(float f, float f2) {
            if (BottomSheetTabsOverlay.this.openProgress < 0.5f) {
                return -1;
            }
            if (BottomSheetTabsOverlay.this.closeAllButtonBackground != null && BottomSheetTabsOverlay.this.closeAllButtonBackground.getBounds().contains((int) f, (int) f2)) {
                return 1;
            }
            for (int size = BottomSheetTabsOverlay.this.tabs.size() - 1; size >= 0; size--) {
                TabPreview tabPreview = (TabPreview) BottomSheetTabsOverlay.this.tabs.get(size);
                if (Math.abs(tabPreview.dismissProgress) < 0.4f && tabPreview.clickBounds.contains(f, f2)) {
                    Rect bounds = tabPreview.tabDrawable.closeRipple.getBounds();
                    if (!bounds.isEmpty()) {
                        RectF rectF = tabPreview.clickBounds;
                        if (bounds.contains((int) (f - rectF.left), (int) ((f2 - rectF.top) - AndroidUtilities.dp(24.0f)))) {
                            return size + 2000;
                        }
                    }
                    return size + 1000;
                }
            }
            return -1;
        }

        @Override
        protected void getVisibleVirtualViews(List list) {
            if (BottomSheetTabsOverlay.this.openProgress < 0.5f) {
                return;
            }
            if (BottomSheetTabsOverlay.this.closeAllButtonBackground != null && !BottomSheetTabsOverlay.this.closeAllButtonBackground.getBounds().isEmpty()) {
                list.add(1);
            }
            for (int i = 0; i < BottomSheetTabsOverlay.this.tabs.size(); i++) {
                TabPreview tabPreview = (TabPreview) BottomSheetTabsOverlay.this.tabs.get(i);
                if (Math.abs(tabPreview.dismissProgress) < 0.4f && !tabPreview.clickBounds.isEmpty()) {
                    list.add(Integer.valueOf(i + 1000));
                    BottomSheetTabs.TabDrawable tabDrawable = tabPreview.tabDrawable;
                    if (tabDrawable != null && !tabDrawable.closeRipple.getBounds().isEmpty()) {
                        list.add(Integer.valueOf(i + 2000));
                    }
                }
            }
        }

        @Override
        protected void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int i2;
            boolean z;
            String string;
            String string2;
            accessibilityNodeInfoCompat.setClassName("android.widget.Button");
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
            if (i == 1) {
                if (BottomSheetTabsOverlay.this.closeAllButtonBackground != null) {
                    this.tmpRect.set(BottomSheetTabsOverlay.this.closeAllButtonBackground.getBounds());
                } else {
                    this.tmpRect.set(0, 0, 1, 1);
                    accessibilityNodeInfoCompat.setVisibleToUser(false);
                }
                accessibilityNodeInfoCompat.setBoundsInParent(this.tmpRect);
                accessibilityNodeInfoCompat.setContentDescription(LocaleController.getString(R.string.BotCloseAllTabs));
                return;
            }
            if (i >= 2000) {
                i2 = i - 2000;
                z = true;
            } else {
                if (i < 1000) {
                    this.tmpRect.set(0, 0, 1, 1);
                    accessibilityNodeInfoCompat.setBoundsInParent(this.tmpRect);
                    accessibilityNodeInfoCompat.setVisibleToUser(false);
                    return;
                }
                i2 = i - 1000;
                z = false;
            }
            if (i2 >= 0 && i2 < BottomSheetTabsOverlay.this.tabs.size()) {
                TabPreview tabPreview = (TabPreview) BottomSheetTabsOverlay.this.tabs.get(i2);
                BottomSheetTabs.WebTabData webTabData = tabPreview.tabData;
                String title = (webTabData == null || webTabData.getTitle() == null) ? "" : tabPreview.tabData.getTitle();
                if (z) {
                    Rect bounds = tabPreview.tabDrawable.closeRipple.getBounds();
                    RectF rectF = tabPreview.clickBounds;
                    int i3 = (int) (rectF.left + bounds.left);
                    int iDp = (int) (rectF.top + AndroidUtilities.dp(24.0f) + bounds.top);
                    RectF rectF2 = tabPreview.clickBounds;
                    this.tmpRect.set(i3, iDp, (int) (rectF2.left + bounds.right), (int) (rectF2.top + AndroidUtilities.dp(24.0f) + bounds.bottom));
                    accessibilityNodeInfoCompat.setBoundsInParent(this.tmpRect);
                    if (TextUtils.isEmpty(title)) {
                        string2 = LocaleController.getString(R.string.Close);
                    } else {
                        string2 = LocaleController.getString(R.string.Close) + ", " + title;
                    }
                    accessibilityNodeInfoCompat.setContentDescription(string2);
                    return;
                }
                Rect rect = this.tmpRect;
                RectF rectF3 = tabPreview.clickBounds;
                rect.set((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                accessibilityNodeInfoCompat.setBoundsInParent(this.tmpRect);
                if (TextUtils.isEmpty(title)) {
                    string = LocaleController.getString(R.string.Open);
                } else {
                    string = LocaleController.getString(R.string.Open) + ", " + title;
                }
                accessibilityNodeInfoCompat.setContentDescription(string);
                return;
            }
            this.tmpRect.set(0, 0, 1, 1);
            accessibilityNodeInfoCompat.setBoundsInParent(this.tmpRect);
            accessibilityNodeInfoCompat.setVisibleToUser(false);
        }

        @Override
        protected boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            int i3;
            boolean z;
            if (i2 != 16) {
                return false;
            }
            if (i == 1) {
                if (BottomSheetTabsOverlay.this.tabsView != null) {
                    BottomSheetTabsOverlay.this.tabsView.removeAll();
                }
                BottomSheetTabsOverlay.this.closeTabsView();
                return true;
            }
            if (i < 2000) {
                if (i >= 1000) {
                    i3 = i - 1000;
                    z = false;
                }
                return false;
            }
            i3 = i - 2000;
            z = true;
            if (i3 >= 0 && i3 < BottomSheetTabsOverlay.this.tabs.size()) {
                final TabPreview tabPreview = (TabPreview) BottomSheetTabsOverlay.this.tabs.get(i3);
                if (z) {
                    if (BottomSheetTabsOverlay.this.tabsView != null) {
                        BottomSheetTabsOverlay.this.tabsView.removeTab(tabPreview.tabData, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj) {
                                this.f$0.lambda$onPerformActionForVirtualView$0(tabPreview, (Boolean) obj);
                            }
                        });
                    }
                    return true;
                }
                if (BottomSheetTabsOverlay.this.tabsView != null) {
                    BottomSheetTabsOverlay.this.closeTabsView();
                    tabPreview.webView = null;
                    BottomSheetTabsOverlay.this.tabsView.openTab(tabPreview.tabData);
                }
                return true;
            }
            return false;
        }

        public void lambda$onPerformActionForVirtualView$0(TabPreview tabPreview, Boolean bool) {
            if (bool.booleanValue()) {
                tabPreview.animateDismiss(1.0f);
                if (BottomSheetTabsOverlay.this.tabsView.getTabs().isEmpty()) {
                    BottomSheetTabsOverlay.this.closeTabsView();
                    return;
                }
                return;
            }
            tabPreview.animateDismiss(0.0f);
        }
    }

    private void drawDismissingTab(Canvas canvas) {
        if (this.dismissingSheet != null) {
            getLocationOnScreen(this.pos2);
            this.tabsView.getLocationOnScreen(this.pos);
            this.tabsView.getTabBounds(this.rect, 0.0f);
            RectF rectF = this.rect;
            int[] iArr = this.pos;
            int i = iArr[0];
            int[] iArr2 = this.pos2;
            rectF.offset(i - iArr2[0], iArr[1] - iArr2[1]);
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - this.navigationBarInset);
            SheetView sheetViewMo1343getWindowView = this.dismissingSheet.mo1343getWindowView();
            RectF rectF2 = this.rect;
            float f = this.dismissProgress;
            float fDrawInto = sheetViewMo1343getWindowView.drawInto(canvas, rectF2, f, this.clipRect, f, false);
            if (this.dismissingTab != null) {
                this.clipPath.rewind();
                this.clipPath.addRoundRect(this.clipRect, fDrawInto, fDrawInto, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(this.clipPath);
                float fDp = this.clipRect.top - (AndroidUtilities.dp(50.0f) * (1.0f - this.dismissProgress));
                RectF rectF3 = this.rect;
                RectF rectF4 = this.clipRect;
                rectF3.set(rectF4.left, fDp, rectF4.right, AndroidUtilities.dp(50.0f) + fDp);
                this.tabsView.setupTab(this.dismissingTab);
                this.dismissingTab.draw(canvas, this.rect, fDrawInto, this.dismissProgress, 1.0f);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return drawable == this.closeAllButtonBackground || super.verifyDrawable(drawable);
    }

    private void drawTabsPreview(Canvas canvas) {
        float f;
        TabPreview tabPreview;
        float f2;
        int i;
        float f3;
        int i2;
        int i3;
        boolean z;
        float f4;
        BottomSheetTabs.TabDrawable tabDrawable;
        float fLerp;
        Sheet sheet;
        if (this.openProgress > 0.0f || this.openingProgress > 0.0f) {
            canvas.save();
            View view = this.actionBarLayout;
            if (view != null) {
                view.getLocationOnScreen(this.pos);
                getLocationOnScreen(this.pos2);
                RectF rectF = this.tabsViewBounds;
                int[] iArr = this.pos;
                int i4 = iArr[0];
                int[] iArr2 = this.pos2;
                int i5 = i4 - iArr2[0];
                rectF.set(i5, iArr[1] - iArr2[1], i5 + this.actionBarLayout.getWidth(), (this.pos[1] - this.pos2[1]) + this.actionBarLayout.getHeight());
            } else {
                int[] iArr3 = this.pos;
                iArr3[1] = 0;
                iArr3[0] = 0;
                this.tabsViewBounds.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            canvas.clipRect(this.tabsViewBounds);
            RectF rectF2 = this.tabsViewBounds;
            canvas.translate(rectF2.left, rectF2.top);
            float fWidth = this.tabsViewBounds.width();
            float fHeight = this.tabsViewBounds.height();
            if (this.blurBitmap != null) {
                this.blurMatrix.reset();
                float fWidth2 = this.tabsViewBounds.width() / this.blurBitmap.getWidth();
                this.blurMatrix.postScale(fWidth2, fWidth2);
                this.blurBitmapShader.setLocalMatrix(this.blurMatrix);
                this.blurBitmapPaint.setAlpha((int) (this.openProgress * 255.0f));
                canvas.drawRect(0.0f, 0.0f, fWidth, fHeight, this.blurBitmapPaint);
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, fWidth, fHeight, 255, 31);
            float fDp = AndroidUtilities.statusBarHeight + AndroidUtilities.dp(40.0f) + AndroidUtilities.dp(55.0f);
            float fDp2 = AndroidUtilities.dp(68.0f);
            int iMin = (int) Math.min(AndroidUtilities.dp(340.0f), 0.95f * fWidth);
            int iHeight = (int) (AndroidUtilities.isTablet() ? this.tabsViewBounds.height() * 0.5f : 0.75f * fHeight);
            float f5 = fWidth / 2.0f;
            int i6 = 0;
            float f6 = 0.0f;
            while (true) {
                f = 1.0f;
                if (i6 >= this.tabs.size()) {
                    break;
                }
                if (((TabPreview) this.tabs.get(i6)).tabDrawable.index < 0) {
                    f = 0.0f;
                }
                f6 += f;
                i6++;
            }
            float f7 = this.animatedCount.set(f6);
            float fLerp2 = AndroidUtilities.lerp(0.0f, 1.0f - Utilities.clamp(getScrollWindow() <= 0.0f ? 0.0f : ((getScrollMin() - getScrollOffset()) / (getScrollWindow() * 0.15f)) * 0.2f, 1.0f, 0.0f), this.openProgress);
            int i7 = 0;
            int i8 = -1;
            for (int i9 = 1; i7 < this.tabs.size() + i9; i9 = 1) {
                if (i7 == this.tabs.size()) {
                    if (i8 < 0 || this.openingProgress <= 0.5f) {
                        i3 = i7;
                        i2 = i8;
                        f3 = fLerp2;
                        i = iHeight;
                        f2 = fDp2;
                    } else {
                        tabPreview = (TabPreview) this.tabs.get(i8);
                    }
                    i8 = i2;
                    i7 = i3 + 1;
                    fDp = fDp;
                    fLerp2 = f3;
                    iHeight = i;
                    iMin = iMin;
                    fDp2 = f2;
                    f = 1.0f;
                } else {
                    tabPreview = (TabPreview) this.tabs.get(i7);
                }
                if (i7 >= this.tabs.size() || tabPreview.tabDrawable != this.openingTab || this.openingProgress <= 0.5f) {
                    BottomSheetTabs.TabDrawable tabDrawable2 = tabPreview.tabDrawable;
                    BottomSheetTabs.TabDrawable tabDrawable3 = this.openingTab;
                    float f8 = tabDrawable2 == tabDrawable3 ? 1.0f : fLerp2;
                    float f9 = tabDrawable2 == tabDrawable3 ? this.openingProgress : 0.0f;
                    float position = (f7 - f) - tabDrawable2.getPosition();
                    float fMax = tabPreview.tabDrawable == this.openingTab ? this.openingTabScroll : (position - Math.max(getScrollMin(), getScrollOffset())) / getScrollWindow();
                    Math.max(fMax, 0.0f);
                    int i10 = i7;
                    Math.max(Math.min(fMax, 1.0f), -4.0f);
                    float fDp3 = (AndroidUtilities.dp(6.0f) * Math.min(5.0f, position)) + fDp;
                    int i11 = i8;
                    float f10 = iHeight;
                    float f11 = fDp3 + ((((fHeight - fDp2) - (0.26f * f10)) - fDp3) * fMax);
                    float f12 = iMin / 2.0f;
                    i = iHeight;
                    this.rect2.set(f5 - f12, f11, f5 + f12, f10 + f11);
                    BottomSheetTabs.TabDrawable tabDrawable4 = tabPreview.tabDrawable;
                    BottomSheetTabs.TabDrawable tabDrawable5 = this.openingTab;
                    if (tabDrawable4 != tabDrawable5) {
                        RectF rectF3 = this.rect2;
                        if ((rectF3.top > fHeight || rectF3.bottom < 0.0f || fLerp2 < 0.1f) && position < f7 - 3.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    Sheet sheet2 = this.openingSheet;
                    if (sheet2 != null && tabDrawable4 == tabDrawable5) {
                        this.rect.set(sheet2.mo1343getWindowView().getRect());
                        RectF rectF4 = this.rect2;
                        AndroidUtilities.lerpCentered(rectF4, this.rect, f9, rectF4);
                    } else {
                        this.tabsView.getTabBounds(this.rect, Utilities.clamp(tabDrawable4.getPosition(), 1.0f, 0.0f));
                        this.rect.offset(this.tabsView.getX(), this.tabsView.getY());
                        RectF rectF5 = this.rect;
                        RectF rectF6 = this.rect2;
                        AndroidUtilities.lerpCentered(rectF5, rectF6, fLerp2, rectF6);
                    }
                    BottomSheetTabs bottomSheetTabs = this.tabsView;
                    if (bottomSheetTabs != null) {
                        bottomSheetTabs.setupTab(tabPreview.tabDrawable);
                    }
                    if (tabPreview.tabDrawable != this.openingTab) {
                        RectF rectF7 = this.rect2;
                        if (rectF7.top > fHeight || rectF7.bottom < 0.0f) {
                            i3 = i10;
                            i2 = i11;
                            f3 = fLerp2;
                            f2 = fDp2;
                        } else {
                            canvas.save();
                            tabPreview.clickBounds.set(this.rect2);
                            tabPreview.matrix.reset();
                            tabPreview.src[0] = this.rect2.left;
                            tabPreview.src[1] = this.rect2.top;
                            tabPreview.src[2] = this.rect2.right;
                            tabPreview.src[3] = this.rect2.top;
                            tabPreview.src[4] = this.rect2.right;
                            float[] fArr = tabPreview.src;
                            RectF rectF8 = this.rect2;
                            fArr[5] = rectF8.top + (rectF8.height() * 1.0f);
                            tabPreview.src[6] = this.rect2.left;
                            float[] fArr2 = tabPreview.src;
                            RectF rectF9 = this.rect2;
                            fArr2[7] = rectF9.top + (rectF9.height() * 1.0f);
                            tabPreview.dst[0] = this.rect2.left;
                            tabPreview.dst[1] = this.rect2.top - AndroidUtilities.dp(0.0f);
                            tabPreview.dst[2] = this.rect2.right;
                            tabPreview.dst[3] = this.rect2.top - AndroidUtilities.dp(0.0f);
                            f4 = (1.0f - f9) * f8;
                            float f13 = fLerp2;
                            tabPreview.dst[4] = this.rect2.centerX() + ((this.rect2.width() / 2.0f) * AndroidUtilities.lerp(1.0f, 0.83f, f4));
                            tabPreview.dst[5] = (this.rect2.top - AndroidUtilities.dp(0.0f)) + (((this.rect2.height() * 1.0f) + AndroidUtilities.dp(0.0f)) * AndroidUtilities.lerp(1.0f, 0.6f, f4));
                            tabPreview.dst[6] = this.rect2.centerX() - ((this.rect2.width() / 2.0f) * AndroidUtilities.lerp(1.0f, 0.83f, f4));
                            tabPreview.dst[7] = (this.rect2.top - AndroidUtilities.dp(0.0f)) + (((this.rect2.height() * 1.0f) + AndroidUtilities.dp(0.0f)) * AndroidUtilities.lerp(1.0f, 0.6f, f4));
                            tabPreview.matrix.setPolyToPoly(tabPreview.src, 0, tabPreview.dst, 0, 4);
                            canvas.concat(tabPreview.matrix);
                            RectF rectF10 = this.rect2;
                            tabDrawable = tabPreview.tabDrawable;
                            if (tabDrawable == this.openingTab) {
                                fLerp = 1.0f;
                            } else {
                                fLerp = AndroidUtilities.lerp(tabDrawable.getAlpha(), 1.0f, this.openProgress);
                            }
                            if (tabPreview.tabDrawable == this.openingTab) {
                                f4 = 1.0f;
                            }
                            float fLerp3 = AndroidUtilities.lerp(Utilities.clamp01((position - f7) + 2.0f), 1.0f, Utilities.clamp01((f8 - 0.1f) / 0.8f));
                            i3 = i10;
                            i2 = i11;
                            f3 = f13;
                            f2 = fDp2;
                            tabPreview.draw(canvas, rectF10, z, fLerp, f4, f9, fLerp3);
                            sheet = this.openingSheet;
                            if (sheet != null && tabPreview.tabDrawable == this.openingTab) {
                                SheetView sheetViewMo1343getWindowView = sheet.mo1343getWindowView();
                                RectF rectF11 = this.rect2;
                                sheetViewMo1343getWindowView.drawInto(canvas, rectF11, 1.0f, rectF11, f9, true);
                            }
                            canvas.restore();
                        }
                    } else {
                        canvas.save();
                        tabPreview.clickBounds.set(this.rect2);
                        tabPreview.matrix.reset();
                        tabPreview.src[0] = this.rect2.left;
                        tabPreview.src[1] = this.rect2.top;
                        tabPreview.src[2] = this.rect2.right;
                        tabPreview.src[3] = this.rect2.top;
                        tabPreview.src[4] = this.rect2.right;
                        float[] fArr3 = tabPreview.src;
                        RectF rectF12 = this.rect2;
                        fArr3[5] = rectF12.top + (rectF12.height() * 1.0f);
                        tabPreview.src[6] = this.rect2.left;
                        float[] fArr4 = tabPreview.src;
                        RectF rectF13 = this.rect2;
                        fArr4[7] = rectF13.top + (rectF13.height() * 1.0f);
                        tabPreview.dst[0] = this.rect2.left;
                        tabPreview.dst[1] = this.rect2.top - AndroidUtilities.dp(0.0f);
                        tabPreview.dst[2] = this.rect2.right;
                        tabPreview.dst[3] = this.rect2.top - AndroidUtilities.dp(0.0f);
                        f4 = (1.0f - f9) * f8;
                        float f14 = fLerp2;
                        tabPreview.dst[4] = this.rect2.centerX() + ((this.rect2.width() / 2.0f) * AndroidUtilities.lerp(1.0f, 0.83f, f4));
                        tabPreview.dst[5] = (this.rect2.top - AndroidUtilities.dp(0.0f)) + (((this.rect2.height() * 1.0f) + AndroidUtilities.dp(0.0f)) * AndroidUtilities.lerp(1.0f, 0.6f, f4));
                        tabPreview.dst[6] = this.rect2.centerX() - ((this.rect2.width() / 2.0f) * AndroidUtilities.lerp(1.0f, 0.83f, f4));
                        tabPreview.dst[7] = (this.rect2.top - AndroidUtilities.dp(0.0f)) + (((this.rect2.height() * 1.0f) + AndroidUtilities.dp(0.0f)) * AndroidUtilities.lerp(1.0f, 0.6f, f4));
                        tabPreview.matrix.setPolyToPoly(tabPreview.src, 0, tabPreview.dst, 0, 4);
                        canvas.concat(tabPreview.matrix);
                        RectF rectF14 = this.rect2;
                        tabDrawable = tabPreview.tabDrawable;
                        if (tabDrawable == this.openingTab) {
                            fLerp = 1.0f;
                        } else {
                            fLerp = AndroidUtilities.lerp(tabDrawable.getAlpha(), 1.0f, this.openProgress);
                        }
                        if (tabPreview.tabDrawable == this.openingTab) {
                            f4 = 1.0f;
                        }
                        float fLerp4 = AndroidUtilities.lerp(Utilities.clamp01((position - f7) + 2.0f), 1.0f, Utilities.clamp01((f8 - 0.1f) / 0.8f));
                        i3 = i10;
                        i2 = i11;
                        f3 = f14;
                        f2 = fDp2;
                        tabPreview.draw(canvas, rectF14, z, fLerp, f4, f9, fLerp4);
                        sheet = this.openingSheet;
                        if (sheet != null) {
                            SheetView sheetViewMo1343getWindowView2 = sheet.mo1343getWindowView();
                            RectF rectF15 = this.rect2;
                            sheetViewMo1343getWindowView2.drawInto(canvas, rectF15, 1.0f, rectF15, f9, true);
                        }
                        canvas.restore();
                    }
                    i8 = i2;
                } else {
                    i8 = i7;
                    i3 = i8;
                    f3 = fLerp2;
                    i = iHeight;
                    iMin = iMin;
                    f2 = fDp2;
                    fDp = fDp;
                }
                i7 = i3 + 1;
                fDp = fDp;
                fLerp2 = f3;
                iHeight = i;
                iMin = iMin;
                fDp2 = f2;
                f = 1.0f;
            }
            float f15 = fDp;
            canvas.save();
            if (this.gradientClip == null) {
                this.gradientClip = new GradientClip();
            }
            RectF rectF16 = AndroidUtilities.rectTmp;
            rectF16.set(0.0f, 0.0f, fWidth, f15);
            this.gradientClip.draw(canvas, rectF16, true, this.openProgress);
            canvas.restore();
            canvas.restore();
            if (this.closeAllButtonText == null) {
                this.closeAllButtonText = new Text(LocaleController.getString(R.string.BotCloseAllTabs), 14.0f, AndroidUtilities.bold());
            }
            if (this.closeAllButtonBackground == null || this.closeAllButtonBackgroundDark != Theme.isCurrentThemeDark()) {
                boolean zIsCurrentThemeDark = Theme.isCurrentThemeDark();
                this.closeAllButtonBackgroundDark = zIsCurrentThemeDark;
                if (zIsCurrentThemeDark) {
                    this.closeAllButtonBackground = Theme.createSimpleSelectorRoundRectDrawable(64, 553648127, 872415231);
                } else {
                    this.closeAllButtonBackground = Theme.createSimpleSelectorRoundRectDrawable(64, 771751936, 1140850688);
                }
                this.closeAllButtonBackground.setCallback(this);
            }
            float currentWidth = this.closeAllButtonText.getCurrentWidth() + AndroidUtilities.dp(24.0f);
            float f16 = (fWidth - currentWidth) / 2.0f;
            this.closeAllButtonBackground.setBounds((int) f16, (int) ((f15 - (AndroidUtilities.dp(95.0f) / 2.0f)) - AndroidUtilities.dp(14.0f)), (int) ((fWidth + currentWidth) / 2.0f), (int) ((f15 - (AndroidUtilities.dp(95.0f) / 2.0f)) + AndroidUtilities.dp(14.0f)));
            this.closeAllButtonBackground.setAlpha((int) (this.openProgress * 255.0f));
            this.closeAllButtonBackground.draw(canvas);
            this.closeAllButtonText.draw(canvas, f16 + AndroidUtilities.dp(12.0f), f15 - (AndroidUtilities.dp(95.0f) / 2.0f), -1, this.openProgress);
            canvas.restore();
        }
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        drawDismissingTab(canvas);
        drawTabsPreview(canvas);
    }

    static class TabPreview {
        private final Paint backgroundPaint;
        private final Paint bitmapPaint;
        public final ButtonBounce bounce;
        public final RectF clickBounds = new RectF();
        private final Path clipPath;
        private ValueAnimator dismissAnimator;
        public float dismissProgress;
        private final float[] dst;
        private final RadialGradient gradient;
        private final Matrix gradientMatrix;
        private final Paint gradientPaint;
        private final Matrix matrix;
        public final View parentView;
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
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.dismissProgress, f);
            this.dismissAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$animateDismiss$0(valueAnimator);
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
                AndroidUtilities.applySpring(this.dismissAnimator, 285.0d, 20.0d);
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
            this.gradient = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
            this.gradientMatrix = new Matrix();
            this.gradientPaint = new Paint(1);
            this.parentView = view;
            this.tabData = webTabData;
            this.tabDrawable = tabDrawable;
            this.webView = null;
            this.bounce = new ButtonBounce(view);
            paint.setColor(webTabData.backgroundColor);
        }

        public void draw(Canvas canvas, RectF rectF, boolean z, float f, float f2, float f3, float f4) {
            float f5;
            Object obj;
            float fClamp = f * Utilities.clamp(1.0f - ((Math.abs(this.dismissProgress) - 0.3f) / 0.7f), 1.0f, 0.0f);
            if (fClamp <= 0.0f) {
                return;
            }
            float f6 = 1.0f - f3;
            float f7 = f2 * f6;
            float fLerp = AndroidUtilities.lerp(1.0f, 1.3f, f7);
            float currentActionBarHeight = f3 * ((AndroidUtilities.statusBarHeight + ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.dp(50.0f));
            canvas.save();
            canvas.rotate(this.dismissProgress * 20.0f, rectF.centerX() + (AndroidUtilities.dp(50.0f) * this.dismissProgress), rectF.bottom + AndroidUtilities.dp(350.0f));
            float scale = this.bounce.getScale(0.01f);
            canvas.scale(scale, scale, rectF.centerX(), rectF.centerY());
            float fLerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), f2);
            if (z) {
                this.shadowPaint.setColor(0);
                this.shadowPaint.setShadowLayer(AndroidUtilities.dp(30.0f), 0.0f, AndroidUtilities.dp(10.0f), Theme.multAlpha(536870912, fClamp * f2 * f6));
                canvas.drawRoundRect(rectF, fLerp2, fLerp2, this.shadowPaint);
                this.backgroundPaint.setAlpha((int) (fClamp * 255.0f));
                canvas.drawRoundRect(rectF, fLerp2, fLerp2, this.backgroundPaint);
                canvas.restore();
                return;
            }
            this.clipPath.rewind();
            this.clipPath.addRoundRect(rectF, fLerp2, fLerp2, Path.Direction.CW);
            canvas.save();
            this.shadowPaint.setColor(0);
            float f8 = fClamp * f2;
            this.shadowPaint.setShadowLayer(AndroidUtilities.dp(30.0f), 0.0f, AndroidUtilities.dp(10.0f), Theme.multAlpha(536870912, f8 * f6));
            canvas.drawPath(this.clipPath, this.shadowPaint);
            canvas.clipPath(this.clipPath);
            float f9 = fClamp * 255.0f * f2;
            int i = (int) f9;
            this.backgroundPaint.setAlpha(i);
            canvas.drawRoundRect(rectF, fLerp2, fLerp2, this.backgroundPaint);
            canvas.save();
            canvas.translate(rectF.left, rectF.top + (AndroidUtilities.dp(50.0f) * fLerp) + currentActionBarHeight);
            canvas.scale(1.0f, AndroidUtilities.lerp(1.0f, 1.25f, f7));
            BottomSheetTabs.WebTabData webTabData = this.tabData;
            if (webTabData != null && (obj = webTabData.previewNode) != null && Build.VERSION.SDK_INT >= 29 && BotFullscreenButtons$$ExternalSyntheticApiModelOutline2.m(obj).hasDisplayList()) {
                RenderNode renderNodeM = BotFullscreenButtons$$ExternalSyntheticApiModelOutline2.m(this.tabData.previewNode);
                float fWidth = rectF.width() / renderNodeM.getWidth();
                canvas.scale(fWidth, fWidth);
                renderNodeM.setAlpha(f8);
                canvas.drawRenderNode(renderNodeM);
            } else {
                BottomSheetTabs.WebTabData webTabData2 = this.tabData;
                if (webTabData2 != null && webTabData2.previewBitmap != null) {
                    float fWidth2 = rectF.width() / this.tabData.previewBitmap.getWidth();
                    canvas.scale(fWidth2, fWidth2);
                    this.bitmapPaint.setAlpha(i);
                    canvas.drawBitmap(this.tabData.previewBitmap, 0.0f, 0.0f, this.bitmapPaint);
                } else {
                    if (this.webView != null) {
                        float fWidth3 = rectF.width() / this.webView.getWidth();
                        canvas.scale(fWidth3, fWidth3);
                        f5 = fLerp2;
                        canvas.saveLayerAlpha(0.0f, 0.0f, this.webView.getWidth(), this.webView.getHeight(), i, 31);
                        this.webView.draw(canvas);
                        canvas.restore();
                    }
                    canvas.restore();
                    canvas.save();
                    this.gradientPaint.setAlpha((int) (f9 * f6));
                    this.gradientMatrix.reset();
                    float fHeight = rectF.height() / 255.0f;
                    this.gradientMatrix.postScale(fHeight, fHeight);
                    this.gradientMatrix.postTranslate(rectF.centerX(), rectF.top);
                    this.gradient.setLocalMatrix(this.gradientMatrix);
                    this.gradientPaint.setShader(this.gradient);
                    canvas.drawRect(rectF, this.gradientPaint);
                    canvas.restore();
                    this.tabBounds.set(rectF);
                    RectF rectF2 = this.tabBounds;
                    rectF2.bottom = rectF2.top + Math.min(rectF.height(), AndroidUtilities.dp(50.0f));
                    this.tabBounds.offset(0.0f, currentActionBarHeight);
                    this.tabDrawable.setExpandProgress(f2);
                    canvas.scale(1.0f, fLerp, this.tabBounds.centerX(), this.tabBounds.top);
                    this.tabDrawable.draw(canvas, this.tabBounds, f5, fClamp * fClamp, f4);
                    canvas.restore();
                    canvas.restore();
                }
            }
            f5 = fLerp2;
            canvas.restore();
            canvas.save();
            this.gradientPaint.setAlpha((int) (f9 * f6));
            this.gradientMatrix.reset();
            float fHeight2 = rectF.height() / 255.0f;
            this.gradientMatrix.postScale(fHeight2, fHeight2);
            this.gradientMatrix.postTranslate(rectF.centerX(), rectF.top);
            this.gradient.setLocalMatrix(this.gradientMatrix);
            this.gradientPaint.setShader(this.gradient);
            canvas.drawRect(rectF, this.gradientPaint);
            canvas.restore();
            this.tabBounds.set(rectF);
            RectF rectF3 = this.tabBounds;
            rectF3.bottom = rectF3.top + Math.min(rectF.height(), AndroidUtilities.dp(50.0f));
            this.tabBounds.offset(0.0f, currentActionBarHeight);
            this.tabDrawable.setExpandProgress(f2);
            canvas.scale(1.0f, fLerp, this.tabBounds.centerX(), this.tabBounds.top);
            this.tabDrawable.draw(canvas, this.tabBounds, f5, fClamp * fClamp, f4);
            canvas.restore();
            canvas.restore();
        }
    }

    public static void renderHardwareViewToBitmap(View view, float f, final Utilities.Callback callback) {
        if (view == null || callback == null || view.getWidth() <= 0 || view.getHeight() <= 0) {
            if (callback != null) {
                callback.run(null);
                return;
            }
            return;
        }
        final SurfaceTexture surfaceTextureM = BottomSheetTabsOverlay$$ExternalSyntheticApiModelOutline0.m(false);
        surfaceTextureM.setDefaultBufferSize(view.getWidth(), view.getHeight());
        final Surface surface = new Surface(surfaceTextureM);
        final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
        canvasLockHardwareCanvas.translate(0.0f, f);
        view.draw(canvasLockHardwareCanvas);
        surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
        PixelCopy.request(surface, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() {
            @Override
            public final void onPixelCopyFinished(int i) {
                BottomSheetTabsOverlay.lambda$renderHardwareViewToBitmap$8(callback, bitmapCreateBitmap, surface, surfaceTextureM, i);
            }
        }, new Handler());
    }

    public static void lambda$renderHardwareViewToBitmap$8(Utilities.Callback callback, Bitmap bitmap, Surface surface, SurfaceTexture surfaceTexture, int i) {
        if (i == 0) {
            callback.run(bitmap);
        } else {
            bitmap.recycle();
            callback.run(null);
        }
        surface.release();
        surfaceTexture.release();
    }
}

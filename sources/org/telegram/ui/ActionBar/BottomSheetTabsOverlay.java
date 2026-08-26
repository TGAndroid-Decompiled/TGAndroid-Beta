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
import android.widget.OverScroller;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.zxing.common.detector.MathUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticApiModelOutline5;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.pip.PipSource$$ExternalSyntheticApiModelOutline0;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.SlideIntChooseView;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda4;
import org.telegram.ui.GradientClip;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bots.BotWebViewSheet;

public final class BottomSheetTabsOverlay extends View {
    public final OverlayAccessibilityHelper accessibilityHelper;
    public View actionBarLayout;
    public final AnimatedFloat animatedCount;
    public ValueAnimator animator;
    public Bitmap blurBitmap;
    public Paint blurBitmapPaint;
    public BitmapShader blurBitmapShader;
    public Matrix blurMatrix;
    public final Path clipPath;
    public final RectF clipRect;
    public BaseCell.RippleDrawableSafe closeAllButtonBackground;
    public boolean closeAllButtonBackgroundDark;
    public Text closeAllButtonText;
    public float dismissProgress;
    public Sheet dismissingSheet;
    public BottomSheetTabs.TabDrawable dismissingTab;
    public GradientClip gradientClip;
    public boolean hitCloseAllButton;
    public boolean horizontallySwiping;
    public boolean isOpen;
    public float lastY;
    public final int maximumVelocity;
    public final int minimumVelocity;
    public int navigationBarInset;
    public float offset;
    public ValueAnimator openAnimator;
    public float openProgress;
    public final int[] pos;
    public final int[] pos2;
    public TabPreview pressTab;
    public boolean pressTabClose;
    public final RectF rect;
    public final RectF rect2;
    public ValueAnimator scrollAnimator;
    public final OverScroller scroller;
    public long startTime;
    public float startX;
    public float startY;
    public final ArrayList tabs;
    public BottomSheetTabs tabsView;
    public final RectF tabsViewBounds;
    public VelocityTracker velocityTracker;
    public boolean verticallyScrolling;

    public final class OverlayAccessibilityHelper extends ExploreByTouchHelper {
        public final Rect tmpRect;

        public OverlayAccessibilityHelper(BottomSheetTabsOverlay bottomSheetTabsOverlay) {
            super(bottomSheetTabsOverlay);
            this.tmpRect = new Rect();
        }

        @Override
        public final int getVirtualViewAt(float f, float f2) {
            BottomSheetTabsOverlay bottomSheetTabsOverlay = BottomSheetTabsOverlay.this;
            if (bottomSheetTabsOverlay.openProgress < 0.5f) {
                return -1;
            }
            BaseCell.RippleDrawableSafe rippleDrawableSafe = bottomSheetTabsOverlay.closeAllButtonBackground;
            if (rippleDrawableSafe != null && rippleDrawableSafe.getBounds().contains((int) f, (int) f2)) {
                return 1;
            }
            for (int size = bottomSheetTabsOverlay.tabs.size() - 1; size >= 0; size--) {
                TabPreview tabPreview = (TabPreview) bottomSheetTabsOverlay.tabs.get(size);
                if (Math.abs(tabPreview.dismissProgress) < 0.4f) {
                    RectF rectF = tabPreview.clickBounds;
                    if (rectF.contains(f, f2)) {
                        Rect bounds = tabPreview.tabDrawable.closeRipple.getBounds();
                        return (bounds.isEmpty() || !bounds.contains((int) (f - rectF.left), (int) ((f2 - rectF.top) - ((float) AndroidUtilities.dp(24.0f))))) ? size + 1000 : size + 2000;
                    }
                }
            }
            return -1;
        }

        @Override
        public final void getVisibleVirtualViews(List list) {
            BottomSheetTabsOverlay bottomSheetTabsOverlay = BottomSheetTabsOverlay.this;
            if (bottomSheetTabsOverlay.openProgress < 0.5f) {
                return;
            }
            BaseCell.RippleDrawableSafe rippleDrawableSafe = bottomSheetTabsOverlay.closeAllButtonBackground;
            if (rippleDrawableSafe != null && !rippleDrawableSafe.getBounds().isEmpty()) {
                ((ArrayList) list).add(1);
            }
            int i = 0;
            while (true) {
                ArrayList arrayList = bottomSheetTabsOverlay.tabs;
                if (i >= arrayList.size()) {
                    return;
                }
                TabPreview tabPreview = (TabPreview) arrayList.get(i);
                if (Math.abs(tabPreview.dismissProgress) < 0.4f && !tabPreview.clickBounds.isEmpty()) {
                    ArrayList arrayList2 = (ArrayList) list;
                    arrayList2.add(Integer.valueOf(i + 1000));
                    BottomSheetTabs.TabDrawable tabDrawable = tabPreview.tabDrawable;
                    if (tabDrawable != null && !tabDrawable.closeRipple.getBounds().isEmpty()) {
                        arrayList2.add(Integer.valueOf(i + 2000));
                    }
                }
                i++;
            }
        }

        @Override
        public final boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            int i3;
            boolean z;
            if (i2 == 16) {
                BottomSheetTabsOverlay bottomSheetTabsOverlay = BottomSheetTabsOverlay.this;
                if (i == 1) {
                    BottomSheetTabs bottomSheetTabs = bottomSheetTabsOverlay.tabsView;
                    if (bottomSheetTabs != null) {
                        bottomSheetTabs.removeAll();
                    }
                    bottomSheetTabsOverlay.animateOpen(false);
                    return true;
                }
                if (i >= 2000) {
                    i3 = i - 2000;
                    z = true;
                } else if (i >= 1000) {
                    i3 = i - 1000;
                    z = false;
                }
                if (i3 >= 0 && i3 < bottomSheetTabsOverlay.tabs.size()) {
                    TabPreview tabPreview = (TabPreview) bottomSheetTabsOverlay.tabs.get(i3);
                    if (z) {
                        BottomSheetTabs bottomSheetTabs2 = bottomSheetTabsOverlay.tabsView;
                        if (bottomSheetTabs2 != null) {
                            bottomSheetTabs2.removeTab(tabPreview.tabData, new GiftSheet$$ExternalSyntheticLambda4(4, this, tabPreview));
                            return true;
                        }
                    } else if (bottomSheetTabsOverlay.tabsView != null) {
                        bottomSheetTabsOverlay.animateOpen(false);
                        tabPreview.getClass();
                        bottomSheetTabsOverlay.tabsView.openTab(tabPreview.tabData);
                    }
                    return true;
                }
            }
            return false;
        }

        @Override
        public final void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int i2;
            boolean z;
            String string;
            String string2;
            accessibilityNodeInfoCompat.setClassName("android.widget.Button");
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
            BottomSheetTabsOverlay bottomSheetTabsOverlay = BottomSheetTabsOverlay.this;
            Rect rect = this.tmpRect;
            if (i == 1) {
                BaseCell.RippleDrawableSafe rippleDrawableSafe = bottomSheetTabsOverlay.closeAllButtonBackground;
                if (rippleDrawableSafe != null) {
                    rect.set(rippleDrawableSafe.getBounds());
                } else {
                    rect.set(0, 0, 1, 1);
                    accessibilityNodeInfoCompat.setVisibleToUser(false);
                }
                accessibilityNodeInfoCompat.setBoundsInParent(rect);
                accessibilityNodeInfoCompat.setContentDescription(LocaleController.getString(R.string.BotCloseAllTabs));
                return;
            }
            if (i >= 2000) {
                i2 = i - 2000;
                z = true;
            } else {
                if (i < 1000) {
                    rect.set(0, 0, 1, 1);
                    accessibilityNodeInfoCompat.setBoundsInParent(rect);
                    accessibilityNodeInfoCompat.setVisibleToUser(false);
                    return;
                }
                i2 = i - 1000;
                z = false;
            }
            if (i2 < 0 || i2 >= bottomSheetTabsOverlay.tabs.size()) {
                rect.set(0, 0, 1, 1);
                accessibilityNodeInfoCompat.setBoundsInParent(rect);
                accessibilityNodeInfoCompat.setVisibleToUser(false);
                return;
            }
            TabPreview tabPreview = (TabPreview) bottomSheetTabsOverlay.tabs.get(i2);
            BottomSheetTabs.WebTabData webTabData = tabPreview.tabData;
            String title = (webTabData == null || webTabData.getTitle() == null) ? "" : tabPreview.tabData.getTitle();
            RectF rectF = tabPreview.clickBounds;
            if (!z) {
                rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                accessibilityNodeInfoCompat.setBoundsInParent(rect);
                if (TextUtils.isEmpty(title)) {
                    string = LocaleController.getString(R.string.Open);
                } else {
                    string = LocaleController.getString(R.string.Open) + ", " + title;
                }
                accessibilityNodeInfoCompat.setContentDescription(string);
                return;
            }
            Rect bounds = tabPreview.tabDrawable.closeRipple.getBounds();
            rect.set((int) (rectF.left + bounds.left), (int) (rectF.top + AndroidUtilities.dp(24.0f) + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.top + AndroidUtilities.dp(24.0f) + bounds.bottom));
            accessibilityNodeInfoCompat.setBoundsInParent(rect);
            if (TextUtils.isEmpty(title)) {
                string2 = LocaleController.getString(R.string.Close);
            } else {
                string2 = LocaleController.getString(R.string.Close) + ", " + title;
            }
            accessibilityNodeInfoCompat.setContentDescription(string2);
        }
    }

    public interface Sheet {
        void dismiss(boolean z);

        int getNavigationBarColor(int i);

        SheetView mo1107getWindowView();

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

    public final class TabPreview {
        public final Paint backgroundPaint;
        public final Paint bitmapPaint;
        public final ButtonBounce bounce;
        public final RectF clickBounds = new RectF();
        public final Path clipPath;
        public ValueAnimator dismissAnimator;
        public float dismissProgress;
        public final float[] dst;
        public final RadialGradient gradient;
        public final Matrix gradientMatrix;
        public final Paint gradientPaint;
        public final Matrix matrix;
        public final BottomSheetTabsOverlay parentView;
        public final Paint shadowPaint;
        public final float[] src;
        public final RectF tabBounds;
        public final BottomSheetTabs.WebTabData tabData;
        public final BottomSheetTabs.TabDrawable tabDrawable;

        public TabPreview(BottomSheetTabsOverlay bottomSheetTabsOverlay, BottomSheetTabs.WebTabData webTabData, BottomSheetTabs.TabDrawable tabDrawable) {
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
            this.parentView = bottomSheetTabsOverlay;
            this.tabData = webTabData;
            this.tabDrawable = tabDrawable;
            this.bounce = new ButtonBounce(bottomSheetTabsOverlay);
            paint.setColor(webTabData.backgroundColor);
        }

        public final void animateDismiss(float f) {
            int i = 2;
            ValueAnimator valueAnimator = this.dismissAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.dismissProgress, f);
            this.dismissAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new BottomSheetTabs$$ExternalSyntheticLambda2(this, 4));
            this.dismissAnimator.addListener(new SlideIntChooseView.AnonymousClass3(this, f, i));
            if (Math.abs(f) < 0.1f) {
                AndroidUtilities.applySpring(this.dismissAnimator, 285.0d, 20.0d);
            } else {
                this.dismissAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            }
            this.dismissAnimator.start();
        }
    }

    public BottomSheetTabsOverlay(LaunchActivity launchActivity) {
        super(launchActivity);
        this.animatedCount = new AnimatedFloat(this, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.tabsViewBounds = new RectF();
        this.tabs = new ArrayList();
        this.pos = new int[2];
        this.pos2 = new int[2];
        this.rect = new RectF();
        this.rect2 = new RectF();
        this.clipRect = new RectF();
        this.clipPath = new Path();
        setWillNotDraw(false);
        this.scroller = new OverScroller(launchActivity);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(launchActivity);
        this.maximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.minimumVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        OverlayAccessibilityHelper overlayAccessibilityHelper = new OverlayAccessibilityHelper(this);
        this.accessibilityHelper = overlayAccessibilityHelper;
        ViewCompat.setAccessibilityDelegate(this, overlayAccessibilityHelper);
        setImportantForAccessibility(2);
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(this, new AlertDialog$$ExternalSyntheticLambda13(this, 6));
    }

    private float getScrollStep() {
        return AndroidUtilities.dp(200.0f);
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

    public final void animateOpen(boolean z) {
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
        valueAnimatorOfFloat.addUpdateListener(new BottomSheetTabsOverlay$$ExternalSyntheticLambda4(this, 0));
        this.openAnimator.addListener(new ActionBar.AnonymousClass7.AnonymousClass1(this, 4));
        this.openAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.openAnimator.setDuration(320L);
        this.openAnimator.start();
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller = this.scroller;
        if (overScroller.computeScrollOffset()) {
            setScrollOffset(overScroller.getCurrY() / getScrollStep());
            postInvalidateOnAnimation();
        }
    }

    public final void dismissSheet(final Sheet sheet) {
        ValueAnimator valueAnimator;
        if (this.tabsView == null) {
            return;
        }
        if (this.dismissingSheet != null && (valueAnimator = this.animator) != null) {
            valueAnimator.end();
            this.animator = null;
        }
        this.dismissingSheet = sheet;
        sheet.setLastVisible(false);
        ValueAnimator valueAnimator2 = this.animator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        final BottomSheetTabs.WebTabData webTabDataSaveState = sheet.saveState();
        BottomSheetTabs bottomSheetTabs = this.tabsView;
        ArrayList<BottomSheetTabs.WebTabData> tabs = bottomSheetTabs.getTabs();
        ArrayList<BottomSheetTabs.TabDrawable> tabDrawables = bottomSheetTabs.getTabDrawables();
        BottomSheetTabs.TabDrawable tabDrawable = new BottomSheetTabs.TabDrawable(bottomSheetTabs, webTabDataSaveState);
        tabDrawable.animatedPosition.set(-1.0f, true);
        tabDrawable.animatedAlpha.set(0.0f, true);
        tabDrawables.add(tabDrawable);
        tabs.add(0, webTabDataSaveState);
        for (int i = 0; i < tabDrawables.size(); i++) {
            BottomSheetTabs.TabDrawable tabDrawable2 = tabDrawables.get(i);
            int iIndexOf = tabs.indexOf(tabDrawable2.tab);
            tabDrawable2.index = iIndexOf;
            if (iIndexOf >= 0) {
                tabDrawable2.position = iIndexOf;
            }
        }
        bottomSheetTabs.updateMultipleTitle();
        bottomSheetTabs.updateVisibility(true);
        bottomSheetTabs.invalidate();
        BottomSheetTabs.TabsAccessibilityHelper tabsAccessibilityHelper = bottomSheetTabs.accessibilityHelper;
        if (tabsAccessibilityHelper != null) {
            tabsAccessibilityHelper.invalidateRoot();
        }
        this.dismissingTab = tabDrawable;
        post(new Theme$$ExternalSyntheticLambda8(sheet, 12));
        invalidate();
        this.dismissProgress = 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.animator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new BottomSheetTabsOverlay$$ExternalSyntheticLambda4(this, 1));
        this.animator.addListener(new AnimatorListenerAdapter() {
            @Override
            public final void onAnimationEnd(Animator animator) {
                int i2;
                int i3;
                BottomSheetTabs.WebTabData webTabData = webTabDataSaveState;
                View view = webTabData.webView;
                if (view == null) {
                    view = webTabData.view2;
                }
                Sheet sheet2 = sheet;
                BottomSheetTabsOverlay bottomSheetTabsOverlay = BottomSheetTabsOverlay.this;
                if (view != null && webTabData.previewBitmap == null && (i2 = webTabData.viewWidth) > 0 && (i3 = webTabData.viewHeight) > 0) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        float f = -webTabData.viewScroll;
                        final GiftSheet$$ExternalSyntheticLambda4 giftSheet$$ExternalSyntheticLambda4 = new GiftSheet$$ExternalSyntheticLambda4(3, webTabData, sheet2);
                        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
                            giftSheet$$ExternalSyntheticLambda4.run(null);
                        } else {
                            final SurfaceTexture surfaceTextureM = PipSource$$ExternalSyntheticApiModelOutline0.m();
                            surfaceTextureM.setDefaultBufferSize(view.getWidth(), view.getHeight());
                            final Surface surface = new Surface(surfaceTextureM);
                            final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
                            Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
                            canvasLockHardwareCanvas.translate(0.0f, f);
                            view.draw(canvasLockHardwareCanvas);
                            surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                            PixelCopy.request(surface, bitmapCreateBitmap, (PixelCopy.OnPixelCopyFinishedListener) new PixelCopy.OnPixelCopyFinishedListener() {
                                @Override
                                public final void onPixelCopyFinished(int i4) {
                                    GiftSheet$$ExternalSyntheticLambda4 giftSheet$$ExternalSyntheticLambda5 = giftSheet$$ExternalSyntheticLambda4;
                                    Bitmap bitmap = bitmapCreateBitmap;
                                    Surface surface2 = surface;
                                    SurfaceTexture surfaceTexture = surfaceTextureM;
                                    if (i4 == 0) {
                                        giftSheet$$ExternalSyntheticLambda5.run(bitmap);
                                    } else {
                                        bitmap.recycle();
                                        giftSheet$$ExternalSyntheticLambda5.run(null);
                                    }
                                    surface2.release();
                                    surfaceTexture.release();
                                }
                            }, new Handler());
                        }
                        bottomSheetTabsOverlay.dismissingSheet = null;
                        bottomSheetTabsOverlay.invalidate();
                        return;
                    }
                    webTabData.previewBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.RGB_565);
                    Canvas canvas = new Canvas(webTabData.previewBitmap);
                    canvas.translate(0.0f, -webTabData.viewScroll);
                    view.draw(canvas);
                }
                sheet2.mo1107getWindowView().setDrawingFromOverlay(false);
                sheet2.release();
                bottomSheetTabsOverlay.dismissingSheet = null;
                bottomSheetTabsOverlay.invalidate();
            }
        });
        AndroidUtilities.applySpring(this.animator, 220.0d, 30.0d, 1.0d);
        ValueAnimator valueAnimator3 = this.animator;
        valueAnimator3.setDuration((long) (valueAnimator3.getDuration() * 1.1f));
        this.animator.start();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        float f;
        int i;
        int i2;
        Object obj;
        BottomSheetTabsOverlay bottomSheetTabsOverlay = this;
        super.dispatchDraw(canvas);
        Sheet sheet = bottomSheetTabsOverlay.dismissingSheet;
        RectF rectF = bottomSheetTabsOverlay.rect;
        int[] iArr = bottomSheetTabsOverlay.pos2;
        int[] iArr2 = bottomSheetTabsOverlay.pos;
        float f2 = 1.0f;
        float fMax = 0.0f;
        if (sheet != null) {
            bottomSheetTabsOverlay.getLocationOnScreen(iArr);
            bottomSheetTabsOverlay.tabsView.getLocationOnScreen(iArr2);
            bottomSheetTabsOverlay.tabsView.getTabBounds(rectF, 0.0f);
            rectF.offset(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
            canvas.save();
            canvas.clipRect(0, 0, bottomSheetTabsOverlay.getMeasuredWidth(), bottomSheetTabsOverlay.getMeasuredHeight() - bottomSheetTabsOverlay.navigationBarInset);
            SheetView sheetViewMo1107getWindowView = bottomSheetTabsOverlay.dismissingSheet.mo1107getWindowView();
            float f3 = bottomSheetTabsOverlay.dismissProgress;
            RectF rectF2 = bottomSheetTabsOverlay.clipRect;
            float fDrawInto = sheetViewMo1107getWindowView.drawInto(canvas, rectF, f3, rectF2, f3, false);
            if (bottomSheetTabsOverlay.dismissingTab != null) {
                Path path = bottomSheetTabsOverlay.clipPath;
                path.rewind();
                path.addRoundRect(rectF2, fDrawInto, fDrawInto, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float fM = BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, bottomSheetTabsOverlay.dismissProgress, AndroidUtilities.dp(50.0f), rectF2.top);
                rectF.set(rectF2.left, fM, rectF2.right, AndroidUtilities.dp(50.0f) + fM);
                bottomSheetTabsOverlay.tabsView.setupTab(bottomSheetTabsOverlay.dismissingTab);
                bottomSheetTabsOverlay.dismissingTab.draw(canvas, rectF, fDrawInto, bottomSheetTabsOverlay.dismissProgress, 1.0f);
                canvas.restore();
            }
            canvas.restore();
        } else {
            rectF = rectF;
        }
        if (bottomSheetTabsOverlay.openProgress <= 0.0f) {
            return;
        }
        canvas.save();
        View view = bottomSheetTabsOverlay.actionBarLayout;
        RectF rectF3 = bottomSheetTabsOverlay.tabsViewBounds;
        if (view != null) {
            view.getLocationOnScreen(iArr2);
            bottomSheetTabsOverlay.getLocationOnScreen(iArr);
            int i3 = iArr2[0] - iArr[0];
            rectF3.set(i3, iArr2[1] - iArr[1], bottomSheetTabsOverlay.actionBarLayout.getWidth() + i3, bottomSheetTabsOverlay.actionBarLayout.getHeight() + (iArr2[1] - iArr[1]));
        } else {
            iArr2[1] = 0;
            iArr2[0] = 0;
            rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        canvas.clipRect(rectF3);
        canvas.translate(rectF3.left, rectF3.top);
        float fWidth = rectF3.width();
        float fHeight = rectF3.height();
        if (bottomSheetTabsOverlay.blurBitmap != null) {
            bottomSheetTabsOverlay.blurMatrix.reset();
            float fWidth2 = rectF3.width() / bottomSheetTabsOverlay.blurBitmap.getWidth();
            bottomSheetTabsOverlay.blurMatrix.postScale(fWidth2, fWidth2);
            bottomSheetTabsOverlay.blurBitmapShader.setLocalMatrix(bottomSheetTabsOverlay.blurMatrix);
            bottomSheetTabsOverlay.blurBitmapPaint.setAlpha((int) (bottomSheetTabsOverlay.openProgress * 255.0f));
            canvas.drawRect(0.0f, 0.0f, fWidth, fHeight, bottomSheetTabsOverlay.blurBitmapPaint);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, fWidth, fHeight, 255, 31);
        float f4 = fWidth;
        float fDp = AndroidUtilities.dp(55.0f) + AndroidUtilities.dp(40.0f) + AndroidUtilities.statusBarHeight;
        float fDp2 = AndroidUtilities.dp(68.0f);
        int iMin = (int) Math.min(AndroidUtilities.dp(340.0f), 0.95f * f4);
        int iHeight = (int) (AndroidUtilities.isTablet() ? rectF3.height() * 0.5f : 0.75f * fHeight);
        float f5 = f4 / 2.0f;
        int i4 = 0;
        float f6 = 0.0f;
        while (true) {
            arrayList = bottomSheetTabsOverlay.tabs;
            if (i4 >= arrayList.size()) {
                break;
            }
            f6 += ((TabPreview) arrayList.get(i4)).tabDrawable.index >= 0 ? 1.0f : 0.0f;
            i4++;
        }
        float f7 = bottomSheetTabsOverlay.animatedCount.set(f6);
        float fLerp = AndroidUtilities.lerp(0.0f, 1.0f - Utilities.clamp(bottomSheetTabsOverlay.getScrollWindow() <= 0.0f ? 0.0f : ((bottomSheetTabsOverlay.getScrollMin() - bottomSheetTabsOverlay.getScrollOffset()) / (bottomSheetTabsOverlay.getScrollWindow() * 0.15f)) * 0.2f, 1.0f, 0.0f), bottomSheetTabsOverlay.openProgress);
        int i5 = 0;
        while (i5 < arrayList.size() + 1) {
            if (i5 == arrayList.size()) {
                f = fDp2;
                i = iMin;
                i2 = i5;
            } else {
                TabPreview tabPreview = (TabPreview) arrayList.get(i5);
                if (i5 < arrayList.size()) {
                    BottomSheetTabs.TabDrawable tabDrawable = tabPreview.tabDrawable;
                }
                BottomSheetTabs.TabDrawable tabDrawable2 = tabPreview.tabDrawable;
                float f8 = tabDrawable2 == null ? 1.0f : fLerp;
                float position = (f7 - f2) - tabDrawable2.getPosition();
                BottomSheetTabs.TabDrawable tabDrawable3 = tabPreview.tabDrawable;
                if (tabDrawable3 != null) {
                    fMax = (position - Math.max(bottomSheetTabsOverlay.getScrollMin(), bottomSheetTabsOverlay.getScrollOffset())) / bottomSheetTabsOverlay.getScrollWindow();
                }
                Math.max(fMax, 0.0f);
                f = fDp2;
                Math.max(Math.min(fMax, 1.0f), -4.0f);
                float fMin = (Math.min(5.0f, position) * AndroidUtilities.dp(6.0f)) + fDp;
                float f9 = iHeight;
                float f10 = ((((fHeight - f) - (0.26f * f9)) - fMin) * fMax) + fMin;
                RectF rectF4 = bottomSheetTabsOverlay.rect2;
                float f11 = iMin / 2.0f;
                i = iMin;
                i2 = i5;
                rectF4.set(f5 - f11, f10, f5 + f11, f10 + f9);
                boolean z = tabDrawable3 != null && (rectF4.top > fHeight || rectF4.bottom < 0.0f || fLerp < 0.1f) && position < f7 - 3.0f;
                bottomSheetTabsOverlay.tabsView.getTabBounds(rectF, Utilities.clamp(tabDrawable3.getPosition(), 1.0f, 0.0f));
                rectF.offset(bottomSheetTabsOverlay.tabsView.getX(), bottomSheetTabsOverlay.tabsView.getY());
                AndroidUtilities.lerpCentered(rectF, rectF4, fLerp, rectF4);
                BottomSheetTabs bottomSheetTabs = bottomSheetTabsOverlay.tabsView;
                if (bottomSheetTabs != null) {
                    bottomSheetTabs.setupTab(tabDrawable3);
                }
                if (rectF4.top <= fHeight && rectF4.bottom >= 0.0f) {
                    canvas.save();
                    tabPreview.clickBounds.set(rectF4);
                    Matrix matrix = tabPreview.matrix;
                    matrix.reset();
                    float f12 = rectF4.left;
                    float[] fArr = tabPreview.src;
                    fArr[0] = f12;
                    float f13 = rectF4.top;
                    fArr[1] = f13;
                    float f14 = rectF4.right;
                    fArr[2] = f14;
                    fArr[3] = f13;
                    fArr[4] = f14;
                    fArr[5] = (rectF4.height() * 1.0f) + f13;
                    fArr[6] = rectF4.left;
                    fArr[7] = (rectF4.height() * 1.0f) + rectF4.top;
                    float f15 = rectF4.left;
                    float[] fArr2 = tabPreview.dst;
                    fArr2[0] = f15;
                    fArr2[1] = rectF4.top - AndroidUtilities.dp(0.0f);
                    fArr2[2] = rectF4.right;
                    fArr2[3] = rectF4.top - AndroidUtilities.dp(0.0f);
                    float f16 = f8 * 1.0f;
                    fArr2[4] = (AndroidUtilities.lerp(1.0f, 0.83f, f16) * (rectF4.width() / 2.0f)) + rectF4.centerX();
                    fArr2[5] = (AndroidUtilities.lerp(1.0f, 0.6f, f16) * ((rectF4.height() * 1.0f) + AndroidUtilities.dp(0.0f))) + (rectF4.top - AndroidUtilities.dp(0.0f));
                    fArr2[6] = rectF4.centerX() - (AndroidUtilities.lerp(1.0f, 0.83f, f16) * (rectF4.width() / 2.0f));
                    fArr2[7] = (AndroidUtilities.lerp(1.0f, 0.6f, f16) * ((rectF4.height() * 1.0f) + AndroidUtilities.dp(0.0f))) + (rectF4.top - AndroidUtilities.dp(0.0f));
                    matrix.setPolyToPoly(tabPreview.src, 0, tabPreview.dst, 0, 4);
                    canvas.concat(matrix);
                    float fLerp2 = AndroidUtilities.lerp(tabDrawable3.getAlpha(), 1.0f, bottomSheetTabsOverlay.openProgress);
                    float fLerp3 = AndroidUtilities.lerp(Utilities.clamp01((position - f7) + 2.0f), 1.0f, Utilities.clamp01((f8 - 0.1f) / 0.8f));
                    float fClamp = Utilities.clamp(1.0f - ((Math.abs(tabPreview.dismissProgress) - 0.3f) / 0.7f), 1.0f, 0.0f) * fLerp2;
                    if (fClamp <= 0.0f) {
                        fLerp = fLerp;
                        arrayList = arrayList;
                        f7 = f7;
                        iHeight = iHeight;
                    } else {
                        float f17 = f16 * 1.0f;
                        float fLerp4 = AndroidUtilities.lerp(1.0f, 1.3f, f17);
                        float currentActionBarHeight = ((ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(50.0f)) * 0.0f;
                        canvas.save();
                        fLerp = fLerp;
                        arrayList = arrayList;
                        f7 = f7;
                        canvas.rotate(tabPreview.dismissProgress * 20.0f, (tabPreview.dismissProgress * AndroidUtilities.dp(50.0f)) + rectF4.centerX(), rectF4.bottom + AndroidUtilities.dp(350.0f));
                        float scale = tabPreview.bounce.getScale(0.01f);
                        canvas.scale(scale, scale, rectF4.centerX(), rectF4.centerY());
                        float fLerp5 = AndroidUtilities.lerp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), f16);
                        Paint paint = tabPreview.backgroundPaint;
                        Paint paint2 = tabPreview.shadowPaint;
                        iHeight = iHeight;
                        if (z) {
                            paint2.setColor(0);
                            paint2.setShadowLayer(AndroidUtilities.dp(30.0f), 0.0f, AndroidUtilities.dp(10.0f), Theme.multAlpha(f16 * fClamp * 1.0f, 536870912));
                            canvas.drawRoundRect(rectF4, fLerp5, fLerp5, paint2);
                            paint.setAlpha((int) (fClamp * 255.0f));
                            canvas.drawRoundRect(rectF4, fLerp5, fLerp5, paint);
                            canvas.restore();
                        } else {
                            Path path2 = tabPreview.clipPath;
                            path2.rewind();
                            path2.addRoundRect(rectF4, fLerp5, fLerp5, Path.Direction.CW);
                            canvas.save();
                            paint2.setColor(0);
                            f4 = f4;
                            float f18 = fClamp * f16;
                            paint2.setShadowLayer(AndroidUtilities.dp(30.0f), 0.0f, AndroidUtilities.dp(10.0f), Theme.multAlpha(f18 * 1.0f, 536870912));
                            canvas.drawPath(path2, paint2);
                            canvas.clipPath(path2);
                            float f19 = fClamp * 255.0f * f16;
                            int i6 = (int) f19;
                            paint.setAlpha(i6);
                            canvas.drawRoundRect(rectF4, fLerp5, fLerp5, paint);
                            canvas.save();
                            canvas.translate(rectF4.left, OKLCH.m(AndroidUtilities.dp(50.0f), fLerp4, rectF4.top, currentActionBarHeight));
                            canvas.scale(1.0f, AndroidUtilities.lerp(1.0f, 1.25f, f17));
                            BottomSheetTabs.WebTabData webTabData = tabPreview.tabData;
                            if (webTabData != null && (obj = webTabData.previewNode) != null && Build.VERSION.SDK_INT >= 29 && AndroidUtilities$$ExternalSyntheticApiModelOutline5.m(obj).hasDisplayList()) {
                                RenderNode renderNodeM = AndroidUtilities$$ExternalSyntheticApiModelOutline5.m(webTabData.previewNode);
                                float fWidth3 = rectF4.width() / renderNodeM.getWidth();
                                canvas.scale(fWidth3, fWidth3);
                                renderNodeM.setAlpha(f18);
                                canvas.drawRenderNode(renderNodeM);
                            } else if (webTabData != null && webTabData.previewBitmap != null) {
                                float fWidth4 = rectF4.width() / webTabData.previewBitmap.getWidth();
                                canvas.scale(fWidth4, fWidth4);
                                Paint paint3 = tabPreview.bitmapPaint;
                                paint3.setAlpha(i6);
                                canvas.drawBitmap(webTabData.previewBitmap, 0.0f, 0.0f, paint3);
                            }
                            canvas.restore();
                            canvas.save();
                            Paint paint4 = tabPreview.gradientPaint;
                            paint4.setAlpha((int) (f19 * 1.0f));
                            Matrix matrix2 = tabPreview.gradientMatrix;
                            matrix2.reset();
                            float fHeight2 = rectF4.height() / 255.0f;
                            matrix2.postScale(fHeight2, fHeight2);
                            matrix2.postTranslate(rectF4.centerX(), rectF4.top);
                            RadialGradient radialGradient = tabPreview.gradient;
                            radialGradient.setLocalMatrix(matrix2);
                            paint4.setShader(radialGradient);
                            canvas.drawRect(rectF4, paint4);
                            canvas.restore();
                            RectF rectF5 = tabPreview.tabBounds;
                            rectF5.set(rectF4);
                            rectF5.bottom = Math.min(rectF4.height(), AndroidUtilities.dp(50.0f)) + rectF5.top;
                            rectF5.offset(0.0f, currentActionBarHeight);
                            tabDrawable3.expandProgress = f16;
                            canvas.scale(1.0f, fLerp4, rectF5.centerX(), rectF5.top);
                            tabPreview.tabDrawable.draw(canvas, rectF5, fLerp5, fClamp * fClamp, fLerp3);
                            canvas.restore();
                            canvas.restore();
                        }
                        canvas.restore();
                    }
                    canvas.restore();
                }
                i5 = i2 + 1;
                fDp = fDp;
                fDp2 = f;
                fLerp = fLerp;
                iMin = i;
                f7 = f7;
                arrayList = arrayList;
                iHeight = iHeight;
                f4 = f4;
                rectF = rectF;
                f2 = 1.0f;
                fMax = 0.0f;
                bottomSheetTabsOverlay = this;
            }
            i5 = i2 + 1;
            fDp = fDp;
            fDp2 = f;
            fLerp = fLerp;
            iMin = i;
            f7 = f7;
            arrayList = arrayList;
            iHeight = iHeight;
            f4 = f4;
            rectF = rectF;
            f2 = 1.0f;
            fMax = 0.0f;
            bottomSheetTabsOverlay = this;
        }
        float f20 = fDp;
        float f21 = f4;
        canvas.save();
        if (this.gradientClip == null) {
            this.gradientClip = new GradientClip();
        }
        RectF rectF6 = AndroidUtilities.rectTmp;
        rectF6.set(0.0f, 0.0f, f21, f20);
        this.gradientClip.draw(canvas, rectF6, true, this.openProgress);
        canvas.restore();
        canvas.restore();
        if (this.closeAllButtonText == null) {
            this.closeAllButtonText = new Text(LocaleController.getString(R.string.BotCloseAllTabs), 14.0f, AndroidUtilities.bold());
        }
        if (this.closeAllButtonBackground == null || this.closeAllButtonBackgroundDark != Theme.currentTheme.isDark()) {
            boolean zIsDark = Theme.currentTheme.isDark();
            this.closeAllButtonBackgroundDark = zIsDark;
            if (zIsDark) {
                this.closeAllButtonBackground = Theme.createSimpleSelectorRoundRectDrawable(64, 64, 64, 64, 553648127, 872415231, 872415231);
            } else {
                this.closeAllButtonBackground = Theme.createSimpleSelectorRoundRectDrawable(64, 64, 64, 64, 771751936, 1140850688, 1140850688);
            }
            this.closeAllButtonBackground.setCallback(this);
        }
        float currentWidth = this.closeAllButtonText.getCurrentWidth() + AndroidUtilities.dp(24.0f);
        float f22 = (f21 - currentWidth) / 2.0f;
        this.closeAllButtonBackground.setBounds((int) f22, (int) ((f20 - (AndroidUtilities.dp(95.0f) / 2.0f)) - AndroidUtilities.dp(14.0f)), (int) ((f21 + currentWidth) / 2.0f), (int) ((f20 - (AndroidUtilities.dp(95.0f) / 2.0f)) + AndroidUtilities.dp(14.0f)));
        this.closeAllButtonBackground.setAlpha((int) (this.openProgress * 255.0f));
        this.closeAllButtonBackground.draw(canvas);
        this.closeAllButtonText.draw(canvas, AndroidUtilities.dp(12.0f) + f22, f20 - (AndroidUtilities.dp(95.0f) / 2.0f), -1, this.openProgress);
        canvas.restore();
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        OverlayAccessibilityHelper overlayAccessibilityHelper;
        if (this.openProgress <= 0.0f || (overlayAccessibilityHelper = this.accessibilityHelper) == null || !overlayAccessibilityHelper.dispatchHoverEvent(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        boolean z;
        ?? r1;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        TabPreview tabPreview;
        if ((AndroidUtilities.isTablet() && motionEvent.getAction() == 0 && !this.tabsViewBounds.contains(motionEvent.getX(), motionEvent.getY())) || this.openProgress <= 0.0f) {
            return false;
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction();
        OverScroller overScroller = this.scroller;
        if (action == 0) {
            this.startTime = System.currentTimeMillis();
            this.startX = motionEvent.getX();
            this.startY = motionEvent.getY();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.openProgress >= 1.0f) {
                ArrayList arrayList = this.tabs;
                int size = arrayList.size() - 1;
                while (true) {
                    if (size < 0) {
                        tabPreview = null;
                        break;
                    }
                    tabPreview = (TabPreview) arrayList.get(size);
                    if (Math.abs(tabPreview.dismissProgress) < 0.4f && tabPreview.clickBounds.contains(x, y)) {
                        break;
                    }
                    size--;
                }
            } else {
                tabPreview = null;
                break;
            }
            this.pressTab = tabPreview;
            BaseCell.RippleDrawableSafe rippleDrawableSafe = this.closeAllButtonBackground;
            boolean z2 = rippleDrawableSafe != null && rippleDrawableSafe.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
            this.hitCloseAllButton = z2;
            if (z2) {
                this.pressTab = null;
            }
            BaseCell.RippleDrawableSafe rippleDrawableSafe2 = this.closeAllButtonBackground;
            if (rippleDrawableSafe2 != null) {
                rippleDrawableSafe2.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.closeAllButtonBackground.setState(this.hitCloseAllButton ? new int[]{16842919, 16842910} : new int[0]);
            }
            this.verticallyScrolling = false;
            this.horizontallySwiping = false;
            this.pressTabClose = false;
            TabPreview tabPreview2 = this.pressTab;
            if (tabPreview2 != null) {
                ValueAnimator valueAnimator = tabPreview2.dismissAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                boolean zContains = this.pressTab.tabDrawable.closeRipple.getBounds().contains((int) (motionEvent.getX() - this.pressTab.clickBounds.left), (int) ((motionEvent.getY() - this.pressTab.clickBounds.top) - AndroidUtilities.dp(24.0f)));
                this.pressTabClose = zContains;
                if (zContains) {
                    BaseCell.RippleDrawableSafe rippleDrawableSafe3 = this.pressTab.tabDrawable.closeRipple;
                    float x2 = motionEvent.getX();
                    RectF rectF = this.rect;
                    rippleDrawableSafe3.setHotspot((int) (x2 - rectF.left), (int) (motionEvent.getY() - rectF.centerY()));
                }
                this.pressTab.bounce.setPressed(!this.pressTabClose);
                this.pressTab.tabDrawable.closeRipple.setState(this.pressTabClose ? new int[]{16842919, 16842910} : new int[0]);
            }
            this.lastY = motionEvent.getY();
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
            }
            ValueAnimator valueAnimator2 = this.scrollAnimator;
            if (valueAnimator2 == null) {
                return true;
            }
            valueAnimator2.cancel();
            this.scrollAnimator = null;
            return true;
        }
        if (motionEvent.getAction() == 2) {
            TabPreview tabPreview3 = this.pressTab;
            if (tabPreview3 != null) {
                if (tabPreview3.bounce.isPressed()) {
                    if (!this.horizontallySwiping && !this.verticallyScrolling && MathUtils.distance(this.startX, motionEvent.getY(), motionEvent.getX(), motionEvent.getY()) > AndroidUtilities.touchSlop) {
                        this.horizontallySwiping = true;
                    }
                    if (!this.verticallyScrolling && !this.horizontallySwiping && MathUtils.distance(motionEvent.getX(), this.startY, motionEvent.getX(), motionEvent.getY()) > AndroidUtilities.touchSlop) {
                        if (!overScroller.isFinished()) {
                            overScroller.abortAnimation();
                        }
                        ValueAnimator valueAnimator3 = this.scrollAnimator;
                        if (valueAnimator3 != null) {
                            valueAnimator3.cancel();
                            this.scrollAnimator = null;
                        }
                        this.verticallyScrolling = true;
                    }
                    if (this.tabsView != null && (this.verticallyScrolling || this.horizontallySwiping)) {
                        this.pressTab.bounce.setPressed(false);
                        ValueAnimator valueAnimator4 = this.pressTab.dismissAnimator;
                        if (valueAnimator4 != null) {
                            valueAnimator4.cancel();
                        }
                    }
                } else {
                    if (!this.pressTabClose && !this.horizontallySwiping && !this.verticallyScrolling && MathUtils.distance(this.startX, motionEvent.getY(), motionEvent.getX(), motionEvent.getY()) > AndroidUtilities.touchSlop) {
                        this.horizontallySwiping = true;
                    }
                    if (!this.pressTabClose && !this.verticallyScrolling && !this.horizontallySwiping && MathUtils.distance(motionEvent.getX(), this.startY, motionEvent.getX(), motionEvent.getY()) > AndroidUtilities.touchSlop) {
                        if (!overScroller.isFinished()) {
                            overScroller.abortAnimation();
                        }
                        ValueAnimator valueAnimator5 = this.scrollAnimator;
                        if (valueAnimator5 != null) {
                            valueAnimator5.cancel();
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
                if (!this.pressTab.bounce.isPressed()) {
                    if (this.horizontallySwiping) {
                        this.pressTab.dismissProgress = (motionEvent.getX() - this.startX) / AndroidUtilities.dp(300.0f);
                    } else if (this.verticallyScrolling) {
                        float y2 = motionEvent.getY() - this.lastY;
                        if (this.offset < getScrollMin()) {
                            y2 *= 1.0f - (Utilities.clamp((getScrollMin() - this.offset) / getScrollStep(), 1.0f, 0.0f) * 0.5f);
                        }
                        setScrollOffset(Utilities.clamp(((getScrollOffset() * getScrollStep()) - y2) / getScrollStep(), getScrollMax(), getScrollMin() - (getScrollStep() * 1.4f)));
                        invalidate();
                    }
                }
                invalidate();
            }
            BaseCell.RippleDrawableSafe rippleDrawableSafe4 = this.closeAllButtonBackground;
            if (rippleDrawableSafe4 != null && this.hitCloseAllButton) {
                boolean z3 = this.pressTab == null && rippleDrawableSafe4.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
                this.hitCloseAllButton = z3;
                if (!z3) {
                    this.closeAllButtonBackground.setState(new int[0]);
                }
            }
            this.lastY = motionEvent.getY();
            return true;
        }
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() != 3) {
                return true;
            }
            TabPreview tabPreview4 = this.pressTab;
            if (tabPreview4 != null) {
                tabPreview4.animateDismiss(0.0f);
                this.pressTab.bounce.setPressed(false);
                this.pressTab.tabDrawable.closeRipple.setState(new int[0]);
            }
            this.pressTab = null;
            this.pressTabClose = false;
            VelocityTracker velocityTracker3 = this.velocityTracker;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.velocityTracker = null;
            }
            this.hitCloseAllButton = false;
            BaseCell.RippleDrawableSafe rippleDrawableSafe5 = this.closeAllButtonBackground;
            if (rippleDrawableSafe5 == null) {
                return true;
            }
            rippleDrawableSafe5.setState(new int[0]);
            return true;
        }
        TabPreview tabPreview5 = this.pressTab;
        if (tabPreview5 != null) {
            if (this.tabsView == null || Math.abs(tabPreview5.dismissProgress) <= 0.4f) {
                this.pressTab.animateDismiss(0.0f);
                if (this.tabsView == null || !this.pressTab.bounce.isPressed()) {
                    if (this.verticallyScrolling) {
                        if (this.offset < getScrollMin() - (getScrollWindow() * 0.15f)) {
                            animateOpen(false);
                        } else {
                            if (this.offset < getScrollMin()) {
                                scrollTo(getScrollMin());
                            } else {
                                this.velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
                                float yVelocity = this.velocityTracker.getYVelocity();
                                if (Math.abs(yVelocity) > this.minimumVelocity) {
                                    velocityTracker = null;
                                    z = true;
                                    overScroller.fling(0, (int) (getScrollOffset() * getScrollStep()), 0, (int) (-yVelocity), 0, 0, (int) (getScrollMin() * getScrollStep()), (int) (getScrollMax() * getScrollStep()), 0, (int) (getScrollStep() * 0.1f));
                                } else {
                                    velocityTracker = null;
                                    z = true;
                                    overScroller.startScroll(0, (int) (getScrollOffset() * getScrollStep()), 0, 0, 0);
                                }
                            }
                            this.velocityTracker.recycle();
                            this.velocityTracker = velocityTracker;
                            postInvalidateOnAnimation();
                            velocityTracker2 = velocityTracker;
                        }
                        velocityTracker = null;
                        z = true;
                        this.velocityTracker.recycle();
                        this.velocityTracker = velocityTracker;
                        postInvalidateOnAnimation();
                        velocityTracker2 = velocityTracker;
                    }
                    this.pressTab.bounce.setPressed(false);
                    if (this.pressTabClose) {
                        this.pressTabClose = this.pressTab.tabDrawable.closeRipple.getBounds().contains((int) (motionEvent.getX() - this.pressTab.clickBounds.left), (int) ((motionEvent.getY() - this.pressTab.clickBounds.top) - AndroidUtilities.dp(24.0f)));
                    }
                    if (this.pressTabClose) {
                        final TabPreview tabPreview6 = this.pressTab;
                        final int i = 1;
                        this.tabsView.removeTab(tabPreview6.tabData, new Utilities.Callback(this) {
                            public final BottomSheetTabsOverlay f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void run(Object obj2) {
                                Boolean bool = (Boolean) obj2;
                                switch (i) {
                                    case 0:
                                        BottomSheetTabsOverlay bottomSheetTabsOverlay = this.f$0;
                                        bottomSheetTabsOverlay.getClass();
                                        boolean zBooleanValue = bool.booleanValue();
                                        BottomSheetTabsOverlay.TabPreview tabPreview7 = tabPreview6;
                                        if (!zBooleanValue) {
                                            tabPreview7.animateDismiss(0.0f);
                                        } else {
                                            tabPreview7.animateDismiss(tabPreview7.dismissProgress < 0.0f ? -1.0f : 1.0f);
                                            bottomSheetTabsOverlay.scrollTo(Utilities.clamp(bottomSheetTabsOverlay.offset, bottomSheetTabsOverlay.getScrollMax(false), Utilities.clamp(bottomSheetTabsOverlay.getScrollRange(false), 1.0f, 0.0f) * ((-bottomSheetTabsOverlay.getScrollWindow()) / 3.0f)));
                                            if (bottomSheetTabsOverlay.tabsView.getTabs().isEmpty()) {
                                                bottomSheetTabsOverlay.animateOpen(false);
                                            }
                                        }
                                        break;
                                    default:
                                        BottomSheetTabsOverlay bottomSheetTabsOverlay2 = this.f$0;
                                        bottomSheetTabsOverlay2.getClass();
                                        boolean zBooleanValue2 = bool.booleanValue();
                                        BottomSheetTabsOverlay.TabPreview tabPreview8 = tabPreview6;
                                        if (!zBooleanValue2) {
                                            tabPreview8.animateDismiss(0.0f);
                                        } else {
                                            tabPreview8.animateDismiss(1.0f);
                                            bottomSheetTabsOverlay2.scrollTo(Utilities.clamp(bottomSheetTabsOverlay2.offset, bottomSheetTabsOverlay2.getScrollMax(false), Utilities.clamp(bottomSheetTabsOverlay2.getScrollRange(false), 1.0f, 0.0f) * ((-bottomSheetTabsOverlay2.getScrollWindow()) / 3.0f)));
                                            if (bottomSheetTabsOverlay2.tabsView.getTabs().isEmpty()) {
                                                bottomSheetTabsOverlay2.animateOpen(false);
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    this.pressTab.tabDrawable.closeRipple.setState(new int[0]);
                    r1 = velocityTracker2;
                } else {
                    animateOpen(false);
                    TabPreview tabPreview7 = this.pressTab;
                    tabPreview7.getClass();
                    this.tabsView.openTab(tabPreview7.tabData);
                }
            } else {
                final TabPreview tabPreview8 = this.pressTab;
                final int i2 = 0;
                this.tabsView.removeTab(tabPreview8.tabData, new Utilities.Callback(this) {
                    public final BottomSheetTabsOverlay f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(Object obj2) {
                        Boolean bool = (Boolean) obj2;
                        switch (i2) {
                            case 0:
                                BottomSheetTabsOverlay bottomSheetTabsOverlay = this.f$0;
                                bottomSheetTabsOverlay.getClass();
                                boolean zBooleanValue = bool.booleanValue();
                                BottomSheetTabsOverlay.TabPreview tabPreview9 = tabPreview8;
                                if (!zBooleanValue) {
                                    tabPreview9.animateDismiss(0.0f);
                                } else {
                                    tabPreview9.animateDismiss(tabPreview9.dismissProgress < 0.0f ? -1.0f : 1.0f);
                                    bottomSheetTabsOverlay.scrollTo(Utilities.clamp(bottomSheetTabsOverlay.offset, bottomSheetTabsOverlay.getScrollMax(false), Utilities.clamp(bottomSheetTabsOverlay.getScrollRange(false), 1.0f, 0.0f) * ((-bottomSheetTabsOverlay.getScrollWindow()) / 3.0f)));
                                    if (bottomSheetTabsOverlay.tabsView.getTabs().isEmpty()) {
                                        bottomSheetTabsOverlay.animateOpen(false);
                                    }
                                }
                                break;
                            default:
                                BottomSheetTabsOverlay bottomSheetTabsOverlay2 = this.f$0;
                                bottomSheetTabsOverlay2.getClass();
                                boolean zBooleanValue2 = bool.booleanValue();
                                BottomSheetTabsOverlay.TabPreview tabPreview10 = tabPreview8;
                                if (!zBooleanValue2) {
                                    tabPreview10.animateDismiss(0.0f);
                                } else {
                                    tabPreview10.animateDismiss(1.0f);
                                    bottomSheetTabsOverlay2.scrollTo(Utilities.clamp(bottomSheetTabsOverlay2.offset, bottomSheetTabsOverlay2.getScrollMax(false), Utilities.clamp(bottomSheetTabsOverlay2.getScrollRange(false), 1.0f, 0.0f) * ((-bottomSheetTabsOverlay2.getScrollWindow()) / 3.0f)));
                                    if (bottomSheetTabsOverlay2.tabsView.getTabs().isEmpty()) {
                                        bottomSheetTabsOverlay2.animateOpen(false);
                                    }
                                }
                                break;
                        }
                    }
                });
            }
            velocityTracker2 = null;
            z = true;
            this.pressTab.bounce.setPressed(false);
            if (this.pressTabClose) {
                this.pressTabClose = this.pressTab.tabDrawable.closeRipple.getBounds().contains((int) (motionEvent.getX() - this.pressTab.clickBounds.left), (int) ((motionEvent.getY() - this.pressTab.clickBounds.top) - AndroidUtilities.dp(24.0f)));
            }
            if (this.pressTabClose) {
                final TabPreview tabPreview9 = this.pressTab;
                final int i3 = 1;
                this.tabsView.removeTab(tabPreview9.tabData, new Utilities.Callback(this) {
                    public final BottomSheetTabsOverlay f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(Object obj2) {
                        Boolean bool = (Boolean) obj2;
                        switch (i3) {
                            case 0:
                                BottomSheetTabsOverlay bottomSheetTabsOverlay = this.f$0;
                                bottomSheetTabsOverlay.getClass();
                                boolean zBooleanValue = bool.booleanValue();
                                BottomSheetTabsOverlay.TabPreview tabPreview10 = tabPreview9;
                                if (!zBooleanValue) {
                                    tabPreview10.animateDismiss(0.0f);
                                } else {
                                    tabPreview10.animateDismiss(tabPreview10.dismissProgress < 0.0f ? -1.0f : 1.0f);
                                    bottomSheetTabsOverlay.scrollTo(Utilities.clamp(bottomSheetTabsOverlay.offset, bottomSheetTabsOverlay.getScrollMax(false), Utilities.clamp(bottomSheetTabsOverlay.getScrollRange(false), 1.0f, 0.0f) * ((-bottomSheetTabsOverlay.getScrollWindow()) / 3.0f)));
                                    if (bottomSheetTabsOverlay.tabsView.getTabs().isEmpty()) {
                                        bottomSheetTabsOverlay.animateOpen(false);
                                    }
                                }
                                break;
                            default:
                                BottomSheetTabsOverlay bottomSheetTabsOverlay2 = this.f$0;
                                bottomSheetTabsOverlay2.getClass();
                                boolean zBooleanValue2 = bool.booleanValue();
                                BottomSheetTabsOverlay.TabPreview tabPreview11 = tabPreview9;
                                if (!zBooleanValue2) {
                                    tabPreview11.animateDismiss(0.0f);
                                } else {
                                    tabPreview11.animateDismiss(1.0f);
                                    bottomSheetTabsOverlay2.scrollTo(Utilities.clamp(bottomSheetTabsOverlay2.offset, bottomSheetTabsOverlay2.getScrollMax(false), Utilities.clamp(bottomSheetTabsOverlay2.getScrollRange(false), 1.0f, 0.0f) * ((-bottomSheetTabsOverlay2.getScrollWindow()) / 3.0f)));
                                    if (bottomSheetTabsOverlay2.tabsView.getTabs().isEmpty()) {
                                        bottomSheetTabsOverlay2.animateOpen(false);
                                    }
                                }
                                break;
                        }
                    }
                });
            }
            this.pressTab.tabDrawable.closeRipple.setState(new int[0]);
            r1 = velocityTracker2;
        } else {
            obj = null;
            z = true;
            if (this.hitCloseAllButton) {
                this.tabsView.removeAll();
                animateOpen(false);
                r1 = obj;
            } else if (MathUtils.distance(this.startX, this.startY, motionEvent.getX(), motionEvent.getY()) <= AndroidUtilities.touchSlop && !this.verticallyScrolling && !this.horizontallySwiping && System.currentTimeMillis() - this.startTime <= ViewConfiguration.getTapTimeout() * 1.2f) {
                r1 = obj;
                r1 = obj;
                r1 = obj;
                r1 = obj;
                animateOpen(false);
                r1 = obj;
            }
        }
        r1 = obj;
        r1 = obj;
        r1 = obj;
        r1 = obj;
        r1 = obj;
        r1 = obj;
        r1 = obj;
        r1 = obj;
        r1 = obj;
        r1 = obj;
        this.pressTab = r1;
        this.pressTabClose = false;
        VelocityTracker velocityTracker4 = this.velocityTracker;
        if (velocityTracker4 != null) {
            velocityTracker4.recycle();
            this.velocityTracker = r1;
        }
        this.hitCloseAllButton = false;
        BaseCell.RippleDrawableSafe rippleDrawableSafe6 = this.closeAllButtonBackground;
        if (rippleDrawableSafe6 == null) {
            return z;
        }
        rippleDrawableSafe6.setState(new int[0]);
        return z;
    }

    public float getScrollMax() {
        return getScrollMax(true);
    }

    public float getScrollMin() {
        return Utilities.clamp(getScrollRange(true), 1.0f, 0.0f) * ((-getScrollWindow()) / 3.0f);
    }

    public float getScrollOffset() {
        return this.offset;
    }

    public float getScrollRange() {
        return getScrollRange(true);
    }

    public float getScrollWindow() {
        return Math.min(3.0f, getScrollRange());
    }

    public final void openTabsView() {
        BottomSheetTabs.TabDrawable tabDrawable;
        BottomSheetTabs bottomSheetTabs = this.tabsView;
        if (bottomSheetTabs == null || !(bottomSheetTabs.getParent() instanceof View)) {
            return;
        }
        HashSet hashSet = BotWebViewSheet.activeSheets;
        if (!hashSet.isEmpty()) {
            Iterator it = new HashSet(hashSet).iterator();
            while (it.hasNext()) {
                ((BotWebViewSheet) it.next()).dismiss$1(true);
            }
            AndroidUtilities.runOnUIThread(new Theme$$ExternalSyntheticLambda8(this, 11), 100L);
            return;
        }
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.animator = null;
        }
        View view = (View) this.tabsView.getParent();
        this.actionBarLayout = view;
        int[] iArr = this.pos;
        if (view != null) {
            view.getLocationOnScreen(iArr);
        } else {
            iArr[1] = 0;
            iArr[0] = 0;
        }
        int[] iArr2 = this.pos2;
        getLocationOnScreen(iArr2);
        RectF rectF = this.tabsViewBounds;
        int i = iArr[0] - iArr2[0];
        rectF.set(i, iArr[1] - iArr2[1], this.actionBarLayout.getWidth() + i, this.actionBarLayout.getHeight() + (iArr[1] - iArr2[1]));
        View view2 = this.actionBarLayout;
        AndroidUtilities.makingGlobalBlurBitmap = true;
        this.blurBitmap = AndroidUtilities.makeBlurBitmap(view2, 14.0f, 14);
        AndroidUtilities.makingGlobalBlurBitmap = false;
        Paint paint = new Paint(1);
        this.blurBitmapPaint = paint;
        Bitmap bitmap = this.blurBitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.blurBitmapShader = bitmapShader;
        paint.setShader(bitmapShader);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, Theme.currentTheme.isDark() ? 0.08f : 0.25f);
        this.blurBitmapPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.blurMatrix = new Matrix();
        ArrayList arrayList = this.tabs;
        arrayList.clear();
        ArrayList<BottomSheetTabs.WebTabData> tabs = this.tabsView.getTabs();
        ArrayList<BottomSheetTabs.TabDrawable> tabDrawables = this.tabsView.getTabDrawables();
        for (int size = tabs.size() - 1; size >= 0; size--) {
            BottomSheetTabs.WebTabData webTabData = tabs.get(size);
            int i2 = 0;
            while (true) {
                if (i2 >= tabDrawables.size()) {
                    tabDrawable = null;
                    break;
                }
                tabDrawable = tabDrawables.get(i2);
                if (tabDrawable.tab == webTabData) {
                    break;
                } else {
                    i2++;
                }
            }
            if (tabDrawable != null) {
                arrayList.add(new TabPreview(this, webTabData, tabDrawable));
            }
        }
        this.animatedCount.set(arrayList.size(), true);
        setScrollOffset(getScrollMax());
        animateOpen(true);
    }

    public final void scrollTo(float f) {
        ValueAnimator valueAnimator = this.scrollAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.scrollAnimator = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.offset, f);
        this.scrollAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new BottomSheetTabsOverlay$$ExternalSyntheticLambda4(this, 2));
        this.scrollAnimator.setDuration(250L);
        this.scrollAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.scrollAnimator.start();
    }

    public void setScrollOffset(float f) {
        this.offset = f;
    }

    public void setSlowerDismiss(boolean z) {
    }

    public void setTabsView(BottomSheetTabs bottomSheetTabs) {
        this.tabsView = bottomSheetTabs;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.closeAllButtonBackground || super.verifyDrawable(drawable);
    }

    public final float getScrollMax(boolean z) {
        return (getScrollRange(z) - Math.min(3.0f, getScrollRange(z))) - (Utilities.clamp(4.0f - getScrollRange(z), 0.5f, 0.0f) * (Math.min(3.0f, getScrollRange(z)) / 3.0f));
    }

    public final float getScrollRange(boolean z) {
        int i = 0;
        float f = 0.0f;
        while (true) {
            ArrayList arrayList = this.tabs;
            if (i >= arrayList.size()) {
                break;
            }
            f += ((TabPreview) arrayList.get(i)).tabDrawable.index >= 0 ? 1.0f : 0.0f;
            i++;
        }
        return z ? this.animatedCount.set(f) : f;
    }
}

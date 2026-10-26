package org.telegram.ui.ActionBar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.Components.ds;
public abstract class h3 extends FrameLayout implements p6 {
    public boolean E;
    public final Paint F;
    public final k3 G;
    public VelocityTracker f22672a;
    public int f22673b;
    public int f22674c;
    public int d;
    public boolean e;
    public boolean f22675f;
    public AnimatorSet h;
    public final b2.v0 f22676n;
    public final Rect f22677r;
    public final Paint f22678s;
    public boolean v;
    public int f22679w;
    public float f22680x;
    public float f22681y;

    public h3(k3 k3Var, Context context) {
        super(context);
        this.G = k3Var;
        this.f22672a = null;
        this.d = -1;
        this.e = false;
        this.f22675f = false;
        this.h = null;
        this.f22677r = new Rect();
        this.f22678s = new Paint();
        this.f22680x = 0.0f;
        this.f22681y = 0.0f;
        this.F = new Paint(1);
        this.f22676n = new Object();
        setWillNotDraw(false);
    }

    public final void a() {
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        this.G.onSwipeStarts();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        this.G.addThemeColorKeys(hashSet);
    }

    public final void b(float f7, float f10) {
        boolean z10;
        k3 k3Var = this.G;
        float translationY = k3Var.containerView.getTranslationY();
        if ((translationY >= AndroidUtilities.getPixelsInCM(0.8f, false) || (f10 >= 3500.0f && Math.abs(f10) >= Math.abs(f7))) && (f10 >= 0.0f || Math.abs(f10) < 3500.0f)) {
            z10 = k3Var.allowCustomAnimation;
            k3Var.allowCustomAnimation = false;
            k3Var.useFastDismiss = true;
            k3Var.dismiss();
            k3Var.allowCustomAnimation = z10;
            return;
        }
        this.e = false;
        this.h = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new f3(this, 4));
        this.h.playTogether(ObjectAnimator.ofFloat(k3Var.containerView, "translationY", 0.0f), ofFloat);
        this.h.setDuration((int) ((Math.max(0.0f, translationY) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 250.0f));
        this.h.setInterpolator(ds.f27586f);
        this.h.addListener(new g3(this, 3));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.h.start();
    }

    public final void c(android.graphics.Canvas r14, float r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.h3.c(android.graphics.Canvas, float):void");
    }

    public final boolean d(MotionEvent motionEvent, boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        boolean z13;
        int i11;
        k3 k3Var = this.G;
        z11 = k3Var.dismissed;
        if (!z11) {
            if (!k3Var.onContainerTouchEvent(motionEvent)) {
                if (!k3Var.canSwipeToBack(motionEvent) && !this.E) {
                    if (k3Var.canDismissWithTouchOutside() && motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f22675f && !this.e && motionEvent.getPointerCount() == 1)) {
                        this.f22673b = (int) motionEvent.getX();
                        int y3 = (int) motionEvent.getY();
                        this.f22674c = y3;
                        if (k3Var.isTouchOutside(this.f22673b, y3)) {
                            k3Var.onDismissWithTouchOutside();
                            return true;
                        }
                        k3Var.onScrollUpBegin(this.f22680x);
                        this.d = motionEvent.getPointerId(0);
                        this.e = true;
                        a();
                        VelocityTracker velocityTracker = this.f22672a;
                        if (velocityTracker != null) {
                            velocityTracker.clear();
                        }
                    } else if (k3Var.canDismissWithSwipe() && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                        if (this.f22672a == null) {
                            this.f22672a = VelocityTracker.obtain();
                        }
                        float abs = Math.abs((int) (motionEvent.getX() - this.f22673b));
                        float y10 = ((int) motionEvent.getY()) - this.f22674c;
                        boolean onScrollUp = k3Var.onScrollUp(this.f22680x + y10);
                        this.f22672a.addMovement(motionEvent);
                        z13 = k3Var.disableScroll;
                        if (!z13 && this.e && !this.f22675f && y10 > 0.0f && y10 / 3.0f > Math.abs(abs)) {
                            float abs2 = Math.abs(y10);
                            i11 = k3Var.touchSlop;
                            if (abs2 >= i11) {
                                this.f22674c = (int) motionEvent.getY();
                                this.e = false;
                                this.f22675f = true;
                                requestDisallowInterceptTouchEvent(true);
                            }
                        }
                        if (this.f22675f) {
                            float f7 = this.f22680x + y10;
                            this.f22680x = f7;
                            if (!onScrollUp) {
                                this.f22680x = Math.max(f7, 0.0f);
                            }
                            k3Var.containerView.setTranslationY(Math.max(this.f22680x, 0.0f));
                            k3Var.onContainerViewTranslation();
                            this.f22674c = (int) motionEvent.getY();
                            k3Var.container.invalidate();
                        }
                    } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                        if (this.f22672a == null) {
                            this.f22672a = VelocityTracker.obtain();
                        }
                        this.f22672a.computeCurrentVelocity(1000);
                        k3Var.onScrollUpEnd(this.f22680x);
                        if (!this.f22675f && this.f22680x <= 0.0f) {
                            this.e = false;
                        } else {
                            b(this.f22672a.getXVelocity(), this.f22672a.getYVelocity());
                        }
                        this.f22675f = false;
                        VelocityTracker velocityTracker2 = this.f22672a;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                            this.f22672a = null;
                        }
                        this.d = -1;
                    }
                } else if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f22675f && !this.e && motionEvent.getPointerCount() == 1)) {
                    this.E = true;
                    this.f22673b = (int) motionEvent.getX();
                    this.f22674c = (int) motionEvent.getY();
                    this.d = motionEvent.getPointerId(0);
                    this.e = true;
                    a();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    float x9 = motionEvent.getX() - this.f22673b;
                    float y11 = motionEvent.getY() - this.f22674c;
                    if (this.f22672a == null) {
                        this.f22672a = VelocityTracker.obtain();
                    }
                    this.f22672a.addMovement(motionEvent);
                    z12 = k3Var.disableScroll;
                    if (!z12 && this.e && !this.f22675f && x9 > 0.0f && x9 / 3.0f > Math.abs(y11)) {
                        float abs3 = Math.abs(x9);
                        i10 = k3Var.touchSlop;
                        if (abs3 >= i10) {
                            this.f22673b = (int) motionEvent.getX();
                            this.e = false;
                            this.f22675f = true;
                        }
                    }
                    if (this.f22675f) {
                        float f10 = this.f22681y + x9;
                        this.f22681y = f10;
                        k3Var.containerView.setTranslationX(Math.max(f10, 0.0f));
                        this.f22673b = (int) motionEvent.getX();
                        k3Var.container.invalidate();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f22672a == null) {
                        this.f22672a = VelocityTracker.obtain();
                    }
                    float xVelocity = this.f22672a.getXVelocity();
                    float yVelocity = this.f22672a.getYVelocity();
                    if (this.f22681y < k3Var.containerView.getMeasuredWidth() / 3.0f && (xVelocity < 3500.0f || xVelocity < yVelocity)) {
                        float max = Math.max(this.f22681y, 0.0f);
                        this.f22681y = max;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(max, 0.0f);
                        ofFloat.addUpdateListener(new f3(this, 1));
                        ofFloat.addListener(new g3(this, 0));
                        ofFloat.setInterpolator(ds.f27586f);
                        ofFloat.setDuration(220L);
                        ofFloat.start();
                    } else {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f22681y, getMeasuredWidth());
                        ofFloat2.addUpdateListener(new f3(this, 2));
                        ofFloat2.addListener(new g3(this, 1));
                        ds dsVar = ds.h;
                        ofFloat2.setInterpolator(dsVar);
                        ofFloat2.setDuration(320L);
                        ofFloat2.start();
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat3.addUpdateListener(new f3(this, 3));
                        ofFloat3.setInterpolator(dsVar);
                        ofFloat3.setDuration(320L);
                        ofFloat3.start();
                    }
                    this.e = false;
                    this.f22675f = false;
                    this.d = -1;
                    this.E = false;
                }
                if ((z10 || !this.e) && !this.f22675f && (k3Var.canDismissWithSwipe() || k3Var.canSwipeToBack(motionEvent))) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.h3.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof CameraView) {
            if (this.G.shouldOverlayCameraViewOverNavBar()) {
                c(canvas, 1.0f);
            }
            return super.drawChild(canvas, view, j10);
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public int getNestedScrollAxes() {
        return this.f22676n.b();
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        WindowInsets windowInsets;
        int i10;
        int i11;
        int i12;
        float f7;
        Paint paint = this.f22678s;
        int alpha = paint.getAlpha();
        k3 k3Var = this.G;
        int i13 = 0;
        if (alpha < 255 && k3Var.drawNavigationBar) {
            float f10 = 0.0f;
            if (k3Var.scrollNavBar || (Build.VERSION.SDK_INT >= 29 && k3.access$1500(k3Var) > 0)) {
                f10 = Math.max(0.0f, k3Var.getBottomInset() - (k3Var.containerView.getMeasuredHeight() - k3Var.containerView.getTranslationY()));
            }
            if (k3Var.drawNavigationBar) {
                i12 = k3Var.getBottomInset();
            } else {
                i12 = 0;
            }
            canvas.save();
            float left = k3Var.containerView.getLeft() + k3Var.backgroundPaddingLeft;
            f7 = k3Var.currentPanTranslationY;
            canvas.clipRect(left, ((getMeasuredHeight() - i12) + f10) - f7, k3Var.containerView.getRight() - k3Var.backgroundPaddingLeft, getMeasuredHeight() + f10, Region.Op.DIFFERENCE);
            canvas2 = canvas;
            z10 = true;
        } else {
            canvas2 = canvas;
            z10 = false;
        }
        super.onDraw(canvas2);
        if (k3Var.drawNavigationBar) {
            windowInsets = k3Var.lastInsets;
            if (windowInsets != null && k3Var.keyboardHeight != 0) {
                int i14 = k3Var.behindKeyboardColorKey;
                if (i14 >= 0) {
                    i10 = k3Var.getThemedColor(i14);
                } else {
                    i10 = k3Var.behindKeyboardColor;
                }
                paint.setColor(i10);
                float left2 = k3Var.containerView.getLeft() + k3Var.backgroundPaddingLeft;
                int measuredHeight = getMeasuredHeight() - k3Var.keyboardHeight;
                if (k3Var.drawNavigationBar) {
                    i11 = k3Var.getBottomInset();
                } else {
                    i11 = 0;
                }
                float f11 = measuredHeight - i11;
                float right = k3Var.containerView.getRight() - k3Var.backgroundPaddingLeft;
                int measuredHeight2 = getMeasuredHeight();
                if (k3Var.drawNavigationBar) {
                    i13 = k3Var.getBottomInset();
                }
                canvas2.drawRect(left2, f11, right, measuredHeight2 - i13, paint);
            }
        }
        k3Var.onContainerDraw(canvas2);
        if (z10) {
            canvas2.restore();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        k3 k3Var = this.G;
        if (!k3Var.canDismissWithSwipe() && !k3Var.canSwipeToBack(motionEvent)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return d(motionEvent, true);
    }

    @Override
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.h3.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.h3.onMeasure(int, int):void");
    }

    @Override
    public final boolean onNestedFling(View view, float f7, float f10, boolean z10) {
        return false;
    }

    @Override
    public final boolean onNestedPreFling(View view, float f7, float f10) {
        return false;
    }

    @Override
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        boolean z10;
        k3 k3Var = this.G;
        z10 = k3Var.dismissed;
        if (!z10 && k3Var.allowNestedScroll) {
            a();
            float translationY = k3Var.containerView.getTranslationY();
            float f7 = 0.0f;
            if (translationY > 0.0f && i11 > 0) {
                float f10 = translationY - i11;
                iArr[1] = i11;
                if (f10 >= 0.0f) {
                    f7 = f10;
                }
                k3Var.containerView.setTranslationY(f7);
                k3Var.onContainerViewTranslation();
                k3Var.container.invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        boolean z10;
        k3 k3Var = this.G;
        z10 = k3Var.dismissed;
        if (!z10 && k3Var.allowNestedScroll) {
            a();
            if (i13 != 0) {
                float translationY = k3Var.containerView.getTranslationY() - i13;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                k3Var.containerView.setTranslationY(translationY);
                k3Var.onContainerViewTranslation();
                k3Var.container.invalidate();
            }
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        boolean z10;
        this.f22676n.f3511a = i10;
        k3 k3Var = this.G;
        z10 = k3Var.dismissed;
        if (!z10 && k3Var.allowNestedScroll) {
            a();
        }
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        boolean z10;
        k3 k3Var = this.G;
        View view3 = k3Var.nestedScrollChild;
        if (view3 == null || view == view3) {
            z10 = k3Var.dismissed;
            if (!z10 && k3Var.allowNestedScroll && i10 == 2 && !k3Var.canDismissWithSwipe()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        boolean z10;
        this.f22676n.f3511a = 0;
        k3 k3Var = this.G;
        z10 = k3Var.dismissed;
        if (!z10 && k3Var.allowNestedScroll) {
            b(0.0f, 0.0f);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent, false);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.e && !this.f22675f) {
            d(null, false);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override
    public final void updateColors() {
        k3 k3Var = this.G;
        try {
            k3.access$000(k3Var);
        } catch (Exception e) {
            FileLog.e(e);
        }
        k3Var.onThemeColorsChanged();
    }
}

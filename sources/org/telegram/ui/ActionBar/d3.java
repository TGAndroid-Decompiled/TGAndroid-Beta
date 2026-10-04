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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.Components.tr;
public abstract class d3 extends FrameLayout {
    public boolean E;
    public final Paint F;
    public final f3 G;
    public VelocityTracker f20516a;
    public int f20517b;
    public int f20518c;
    public int d;
    public boolean f20519e;
    public boolean f20520f;
    public AnimatorSet h;
    public final b2.q0 f20521n;
    public final Rect f20522r;
    public final Paint f20523s;
    public boolean v;
    public int f20524w;
    public float f20525x;
    public float f20526y;

    public d3(f3 f3Var, Context context) {
        super(context);
        this.G = f3Var;
        this.f20516a = null;
        this.d = -1;
        this.f20519e = false;
        this.f20520f = false;
        this.h = null;
        this.f20522r = new Rect();
        this.f20523s = new Paint();
        this.f20525x = 0.0f;
        this.f20526y = 0.0f;
        this.F = new Paint(1);
        this.f20521n = new Object();
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

    public final void b(float f7, float f10) {
        boolean z10;
        f3 f3Var = this.G;
        float translationY = f3Var.containerView.getTranslationY();
        if ((translationY >= AndroidUtilities.getPixelsInCM(0.8f, false) || (f10 >= 3500.0f && Math.abs(f10) >= Math.abs(f7))) && (f10 >= 0.0f || Math.abs(f10) < 3500.0f)) {
            z10 = f3Var.allowCustomAnimation;
            f3Var.allowCustomAnimation = false;
            f3Var.useFastDismiss = true;
            f3Var.dismiss();
            f3Var.allowCustomAnimation = z10;
            return;
        }
        this.f20519e = false;
        this.h = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new b3(this, 4));
        this.h.playTogether(ObjectAnimator.ofFloat(f3Var.containerView, "translationY", 0.0f), ofFloat);
        this.h.setDuration((int) ((Math.max(0.0f, translationY) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 250.0f));
        this.h.setInterpolator(tr.f31141f);
        this.h.addListener(new c3(this, 3));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.h.start();
    }

    public final void c(android.graphics.Canvas r14, float r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.d3.c(android.graphics.Canvas, float):void");
    }

    public final boolean d(MotionEvent motionEvent, boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        boolean z13;
        int i11;
        f3 f3Var = this.G;
        z11 = f3Var.dismissed;
        if (!z11) {
            if (!f3Var.onContainerTouchEvent(motionEvent)) {
                if (!f3Var.canSwipeToBack(motionEvent) && !this.E) {
                    if (f3Var.canDismissWithTouchOutside() && motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f20520f && !this.f20519e && motionEvent.getPointerCount() == 1)) {
                        this.f20517b = (int) motionEvent.getX();
                        int y3 = (int) motionEvent.getY();
                        this.f20518c = y3;
                        if (f3Var.isTouchOutside(this.f20517b, y3)) {
                            f3Var.onDismissWithTouchOutside();
                            return true;
                        }
                        f3Var.onScrollUpBegin(this.f20525x);
                        this.d = motionEvent.getPointerId(0);
                        this.f20519e = true;
                        a();
                        VelocityTracker velocityTracker = this.f20516a;
                        if (velocityTracker != null) {
                            velocityTracker.clear();
                        }
                    } else if (f3Var.canDismissWithSwipe() && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                        if (this.f20516a == null) {
                            this.f20516a = VelocityTracker.obtain();
                        }
                        float abs = Math.abs((int) (motionEvent.getX() - this.f20517b));
                        float y10 = ((int) motionEvent.getY()) - this.f20518c;
                        boolean onScrollUp = f3Var.onScrollUp(this.f20525x + y10);
                        this.f20516a.addMovement(motionEvent);
                        z13 = f3Var.disableScroll;
                        if (!z13 && this.f20519e && !this.f20520f && y10 > 0.0f && y10 / 3.0f > Math.abs(abs)) {
                            float abs2 = Math.abs(y10);
                            i11 = f3Var.touchSlop;
                            if (abs2 >= i11) {
                                this.f20518c = (int) motionEvent.getY();
                                this.f20519e = false;
                                this.f20520f = true;
                                requestDisallowInterceptTouchEvent(true);
                            }
                        }
                        if (this.f20520f) {
                            float f7 = this.f20525x + y10;
                            this.f20525x = f7;
                            if (!onScrollUp) {
                                this.f20525x = Math.max(f7, 0.0f);
                            }
                            f3Var.containerView.setTranslationY(Math.max(this.f20525x, 0.0f));
                            f3Var.onContainerViewTranslation();
                            this.f20518c = (int) motionEvent.getY();
                            f3Var.container.invalidate();
                        }
                    } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                        if (this.f20516a == null) {
                            this.f20516a = VelocityTracker.obtain();
                        }
                        this.f20516a.computeCurrentVelocity(1000);
                        f3Var.onScrollUpEnd(this.f20525x);
                        if (!this.f20520f && this.f20525x <= 0.0f) {
                            this.f20519e = false;
                        } else {
                            b(this.f20516a.getXVelocity(), this.f20516a.getYVelocity());
                        }
                        this.f20520f = false;
                        VelocityTracker velocityTracker2 = this.f20516a;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                            this.f20516a = null;
                        }
                        this.d = -1;
                    }
                } else if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f20520f && !this.f20519e && motionEvent.getPointerCount() == 1)) {
                    this.E = true;
                    this.f20517b = (int) motionEvent.getX();
                    this.f20518c = (int) motionEvent.getY();
                    this.d = motionEvent.getPointerId(0);
                    this.f20519e = true;
                    a();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    float x10 = motionEvent.getX() - this.f20517b;
                    float y11 = motionEvent.getY() - this.f20518c;
                    if (this.f20516a == null) {
                        this.f20516a = VelocityTracker.obtain();
                    }
                    this.f20516a.addMovement(motionEvent);
                    z12 = f3Var.disableScroll;
                    if (!z12 && this.f20519e && !this.f20520f && x10 > 0.0f && x10 / 3.0f > Math.abs(y11)) {
                        float abs3 = Math.abs(x10);
                        i10 = f3Var.touchSlop;
                        if (abs3 >= i10) {
                            this.f20517b = (int) motionEvent.getX();
                            this.f20519e = false;
                            this.f20520f = true;
                        }
                    }
                    if (this.f20520f) {
                        float f10 = this.f20526y + x10;
                        this.f20526y = f10;
                        f3Var.containerView.setTranslationX(Math.max(f10, 0.0f));
                        this.f20517b = (int) motionEvent.getX();
                        f3Var.container.invalidate();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f20516a == null) {
                        this.f20516a = VelocityTracker.obtain();
                    }
                    float xVelocity = this.f20516a.getXVelocity();
                    float yVelocity = this.f20516a.getYVelocity();
                    if (this.f20526y < f3Var.containerView.getMeasuredWidth() / 3.0f && (xVelocity < 3500.0f || xVelocity < yVelocity)) {
                        float max = Math.max(this.f20526y, 0.0f);
                        this.f20526y = max;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(max, 0.0f);
                        ofFloat.addUpdateListener(new b3(this, 1));
                        ofFloat.addListener(new c3(this, 0));
                        ofFloat.setInterpolator(tr.f31141f);
                        ofFloat.setDuration(220L);
                        ofFloat.start();
                    } else {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f20526y, getMeasuredWidth());
                        ofFloat2.addUpdateListener(new b3(this, 2));
                        ofFloat2.addListener(new c3(this, 1));
                        tr trVar = tr.h;
                        ofFloat2.setInterpolator(trVar);
                        ofFloat2.setDuration(320L);
                        ofFloat2.start();
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat3.addUpdateListener(new b3(this, 3));
                        ofFloat3.setInterpolator(trVar);
                        ofFloat3.setDuration(320L);
                        ofFloat3.start();
                    }
                    this.f20519e = false;
                    this.f20520f = false;
                    this.d = -1;
                    this.E = false;
                }
                if ((z10 || !this.f20519e) && !this.f20520f && (f3Var.canDismissWithSwipe() || f3Var.canSwipeToBack(motionEvent))) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.d3.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof CameraView) {
            if (this.G.shouldOverlayCameraViewOverNavBar()) {
                c(canvas, 1.0f);
            }
            return super.drawChild(canvas, view, j3);
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public int getNestedScrollAxes() {
        return this.f20521n.b();
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
        Paint paint = this.f20523s;
        int alpha = paint.getAlpha();
        f3 f3Var = this.G;
        int i13 = 0;
        if (alpha < 255 && f3Var.drawNavigationBar) {
            float f10 = 0.0f;
            if (f3Var.scrollNavBar || (Build.VERSION.SDK_INT >= 29 && f3.access$1400(f3Var) > 0)) {
                f10 = Math.max(0.0f, f3Var.getBottomInset() - (f3Var.containerView.getMeasuredHeight() - f3Var.containerView.getTranslationY()));
            }
            if (f3Var.drawNavigationBar) {
                i12 = f3Var.getBottomInset();
            } else {
                i12 = 0;
            }
            canvas.save();
            float left = f3Var.containerView.getLeft() + f3Var.backgroundPaddingLeft;
            f7 = f3Var.currentPanTranslationY;
            canvas.clipRect(left, ((getMeasuredHeight() - i12) + f10) - f7, f3Var.containerView.getRight() - f3Var.backgroundPaddingLeft, getMeasuredHeight() + f10, Region.Op.DIFFERENCE);
            canvas2 = canvas;
            z10 = true;
        } else {
            canvas2 = canvas;
            z10 = false;
        }
        super.onDraw(canvas2);
        if (f3Var.drawNavigationBar) {
            windowInsets = f3Var.lastInsets;
            if (windowInsets != null && f3Var.keyboardHeight != 0) {
                int i14 = f3Var.behindKeyboardColorKey;
                if (i14 >= 0) {
                    i10 = f3Var.getThemedColor(i14);
                } else {
                    i10 = f3Var.behindKeyboardColor;
                }
                paint.setColor(i10);
                float left2 = f3Var.containerView.getLeft() + f3Var.backgroundPaddingLeft;
                int measuredHeight = getMeasuredHeight() - f3Var.keyboardHeight;
                if (f3Var.drawNavigationBar) {
                    i11 = f3Var.getBottomInset();
                } else {
                    i11 = 0;
                }
                float f11 = measuredHeight - i11;
                float right = f3Var.containerView.getRight() - f3Var.backgroundPaddingLeft;
                int measuredHeight2 = getMeasuredHeight();
                if (f3Var.drawNavigationBar) {
                    i13 = f3Var.getBottomInset();
                }
                canvas2.drawRect(left2, f11, right, measuredHeight2 - i13, paint);
            }
        }
        f3Var.onContainerDraw(canvas2);
        if (z10) {
            canvas2.restore();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        f3 f3Var = this.G;
        if (!f3Var.canDismissWithSwipe() && !f3Var.canSwipeToBack(motionEvent)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return d(motionEvent, true);
    }

    @Override
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.d3.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.d3.onMeasure(int, int):void");
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
        f3 f3Var = this.G;
        z10 = f3Var.dismissed;
        if (!z10 && f3Var.allowNestedScroll) {
            a();
            float translationY = f3Var.containerView.getTranslationY();
            float f7 = 0.0f;
            if (translationY > 0.0f && i11 > 0) {
                float f10 = translationY - i11;
                iArr[1] = i11;
                if (f10 >= 0.0f) {
                    f7 = f10;
                }
                f3Var.containerView.setTranslationY(f7);
                f3Var.onContainerViewTranslation();
                f3Var.container.invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        boolean z10;
        f3 f3Var = this.G;
        z10 = f3Var.dismissed;
        if (!z10 && f3Var.allowNestedScroll) {
            a();
            if (i13 != 0) {
                float translationY = f3Var.containerView.getTranslationY() - i13;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                f3Var.containerView.setTranslationY(translationY);
                f3Var.onContainerViewTranslation();
                f3Var.container.invalidate();
            }
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        boolean z10;
        this.f20521n.f3454a = i10;
        f3 f3Var = this.G;
        z10 = f3Var.dismissed;
        if (!z10 && f3Var.allowNestedScroll) {
            a();
        }
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        boolean z10;
        f3 f3Var = this.G;
        View view3 = f3Var.nestedScrollChild;
        if (view3 == null || view == view3) {
            z10 = f3Var.dismissed;
            if (!z10 && f3Var.allowNestedScroll && i10 == 2 && !f3Var.canDismissWithSwipe()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        boolean z10;
        this.f20521n.f3454a = 0;
        f3 f3Var = this.G;
        z10 = f3Var.dismissed;
        if (!z10 && f3Var.allowNestedScroll) {
            b(0.0f, 0.0f);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent, false);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.f20519e && !this.f20520f) {
            d(null, false);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}

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
import org.telegram.ui.Components.jr;
public abstract class d3 extends FrameLayout {
    public boolean A;
    public final Paint B;
    public final f3 C;
    public VelocityTracker f22848a;
    public int f22849b;
    public int f22850c;
    public int d;
    public boolean f22851e;
    public boolean f22852f;
    public AnimatorSet h;
    public final a5.e f22853n;
    public final Rect f22854r;
    public final Paint f22855s;
    public boolean v;
    public int f22856w;
    public float f22857x;
    public float f22858y;

    public d3(f3 f3Var, Context context) {
        super(context);
        this.C = f3Var;
        this.f22848a = null;
        this.d = -1;
        this.f22851e = false;
        this.f22852f = false;
        this.h = null;
        this.f22854r = new Rect();
        this.f22855s = new Paint();
        this.f22857x = 0.0f;
        this.f22858y = 0.0f;
        this.B = new Paint(1);
        this.f22853n = new Object();
        setWillNotDraw(false);
    }

    public final void a() {
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        this.C.onSwipeStarts();
    }

    public final void b(float f9, float f10) {
        boolean z10;
        f3 f3Var = this.C;
        float translationY = f3Var.containerView.getTranslationY();
        if ((translationY >= AndroidUtilities.getPixelsInCM(0.8f, false) || (f10 >= 3500.0f && Math.abs(f10) >= Math.abs(f9))) && (f10 >= 0.0f || Math.abs(f10) < 3500.0f)) {
            z10 = f3Var.allowCustomAnimation;
            f3Var.allowCustomAnimation = false;
            f3Var.useFastDismiss = true;
            f3Var.dismiss();
            f3Var.allowCustomAnimation = z10;
            return;
        }
        this.f22851e = false;
        this.h = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new b3(this, 4));
        this.h.playTogether(ObjectAnimator.ofFloat(f3Var.containerView, "translationY", 0.0f), ofFloat);
        this.h.setDuration((int) ((Math.max(0.0f, translationY) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 250.0f));
        this.h.setInterpolator(jr.f29800f);
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
        f3 f3Var = this.C;
        z11 = f3Var.dismissed;
        if (!z11) {
            if (!f3Var.onContainerTouchEvent(motionEvent)) {
                if (!f3Var.canSwipeToBack(motionEvent) && !this.A) {
                    if (f3Var.canDismissWithTouchOutside() && motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f22852f && !this.f22851e && motionEvent.getPointerCount() == 1)) {
                        this.f22849b = (int) motionEvent.getX();
                        int y8 = (int) motionEvent.getY();
                        this.f22850c = y8;
                        if (f3Var.isTouchOutside(this.f22849b, y8)) {
                            f3Var.onDismissWithTouchOutside();
                            return true;
                        }
                        f3Var.onScrollUpBegin(this.f22857x);
                        this.d = motionEvent.getPointerId(0);
                        this.f22851e = true;
                        a();
                        VelocityTracker velocityTracker = this.f22848a;
                        if (velocityTracker != null) {
                            velocityTracker.clear();
                        }
                    } else if (f3Var.canDismissWithSwipe() && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                        if (this.f22848a == null) {
                            this.f22848a = VelocityTracker.obtain();
                        }
                        float abs = Math.abs((int) (motionEvent.getX() - this.f22849b));
                        float y10 = ((int) motionEvent.getY()) - this.f22850c;
                        boolean onScrollUp = f3Var.onScrollUp(this.f22857x + y10);
                        this.f22848a.addMovement(motionEvent);
                        z13 = f3Var.disableScroll;
                        if (!z13 && this.f22851e && !this.f22852f && y10 > 0.0f && y10 / 3.0f > Math.abs(abs)) {
                            float abs2 = Math.abs(y10);
                            i11 = f3Var.touchSlop;
                            if (abs2 >= i11) {
                                this.f22850c = (int) motionEvent.getY();
                                this.f22851e = false;
                                this.f22852f = true;
                                requestDisallowInterceptTouchEvent(true);
                            }
                        }
                        if (this.f22852f) {
                            float f9 = this.f22857x + y10;
                            this.f22857x = f9;
                            if (!onScrollUp) {
                                this.f22857x = Math.max(f9, 0.0f);
                            }
                            f3Var.containerView.setTranslationY(Math.max(this.f22857x, 0.0f));
                            f3Var.onContainerViewTranslation();
                            this.f22850c = (int) motionEvent.getY();
                            f3Var.container.invalidate();
                        }
                    } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                        if (this.f22848a == null) {
                            this.f22848a = VelocityTracker.obtain();
                        }
                        this.f22848a.computeCurrentVelocity(1000);
                        f3Var.onScrollUpEnd(this.f22857x);
                        if (!this.f22852f && this.f22857x <= 0.0f) {
                            this.f22851e = false;
                        } else {
                            b(this.f22848a.getXVelocity(), this.f22848a.getYVelocity());
                        }
                        this.f22852f = false;
                        VelocityTracker velocityTracker2 = this.f22848a;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                            this.f22848a = null;
                        }
                        this.d = -1;
                    }
                } else if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f22852f && !this.f22851e && motionEvent.getPointerCount() == 1)) {
                    this.A = true;
                    this.f22849b = (int) motionEvent.getX();
                    this.f22850c = (int) motionEvent.getY();
                    this.d = motionEvent.getPointerId(0);
                    this.f22851e = true;
                    a();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    float x4 = motionEvent.getX() - this.f22849b;
                    float y11 = motionEvent.getY() - this.f22850c;
                    if (this.f22848a == null) {
                        this.f22848a = VelocityTracker.obtain();
                    }
                    this.f22848a.addMovement(motionEvent);
                    z12 = f3Var.disableScroll;
                    if (!z12 && this.f22851e && !this.f22852f && x4 > 0.0f && x4 / 3.0f > Math.abs(y11)) {
                        float abs3 = Math.abs(x4);
                        i10 = f3Var.touchSlop;
                        if (abs3 >= i10) {
                            this.f22849b = (int) motionEvent.getX();
                            this.f22851e = false;
                            this.f22852f = true;
                        }
                    }
                    if (this.f22852f) {
                        float f10 = this.f22858y + x4;
                        this.f22858y = f10;
                        f3Var.containerView.setTranslationX(Math.max(f10, 0.0f));
                        this.f22849b = (int) motionEvent.getX();
                        f3Var.container.invalidate();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f22848a == null) {
                        this.f22848a = VelocityTracker.obtain();
                    }
                    float xVelocity = this.f22848a.getXVelocity();
                    float yVelocity = this.f22848a.getYVelocity();
                    if (this.f22858y < f3Var.containerView.getMeasuredWidth() / 3.0f && (xVelocity < 3500.0f || xVelocity < yVelocity)) {
                        float max = Math.max(this.f22858y, 0.0f);
                        this.f22858y = max;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(max, 0.0f);
                        ofFloat.addUpdateListener(new b3(this, 1));
                        ofFloat.addListener(new c3(this, 0));
                        ofFloat.setInterpolator(jr.f29800f);
                        ofFloat.setDuration(220L);
                        ofFloat.start();
                    } else {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f22858y, getMeasuredWidth());
                        ofFloat2.addUpdateListener(new b3(this, 2));
                        ofFloat2.addListener(new c3(this, 1));
                        jr jrVar = jr.h;
                        ofFloat2.setInterpolator(jrVar);
                        ofFloat2.setDuration(320L);
                        ofFloat2.start();
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat3.addUpdateListener(new b3(this, 3));
                        ofFloat3.setInterpolator(jrVar);
                        ofFloat3.setDuration(320L);
                        ofFloat3.start();
                    }
                    this.f22851e = false;
                    this.f22852f = false;
                    this.d = -1;
                    this.A = false;
                }
                if ((z10 || !this.f22851e) && !this.f22852f && (f3Var.canDismissWithSwipe() || f3Var.canSwipeToBack(motionEvent))) {
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
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof CameraView) {
            if (this.C.shouldOverlayCameraViewOverNavBar()) {
                c(canvas, 1.0f);
            }
            return super.drawChild(canvas, view, j10);
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public int getNestedScrollAxes() {
        a5.e eVar = this.f22853n;
        return eVar.f166b | eVar.f165a;
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
        float f9;
        Paint paint = this.f22855s;
        int alpha = paint.getAlpha();
        f3 f3Var = this.C;
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
            f9 = f3Var.currentPanTranslationY;
            canvas.clipRect(left, ((getMeasuredHeight() - i12) + f10) - f9, f3Var.containerView.getRight() - f3Var.backgroundPaddingLeft, getMeasuredHeight() + f10, Region.Op.DIFFERENCE);
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
        f3 f3Var = this.C;
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
    public final boolean onNestedFling(View view, float f9, float f10, boolean z10) {
        return false;
    }

    @Override
    public final boolean onNestedPreFling(View view, float f9, float f10) {
        return false;
    }

    @Override
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        boolean z10;
        f3 f3Var = this.C;
        z10 = f3Var.dismissed;
        if (!z10 && f3Var.allowNestedScroll) {
            a();
            float translationY = f3Var.containerView.getTranslationY();
            float f9 = 0.0f;
            if (translationY > 0.0f && i11 > 0) {
                float f10 = translationY - i11;
                iArr[1] = i11;
                if (f10 >= 0.0f) {
                    f9 = f10;
                }
                f3Var.containerView.setTranslationY(f9);
                f3Var.onContainerViewTranslation();
                f3Var.container.invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        boolean z10;
        f3 f3Var = this.C;
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
        this.f22853n.f165a = i10;
        f3 f3Var = this.C;
        z10 = f3Var.dismissed;
        if (!z10 && f3Var.allowNestedScroll) {
            a();
        }
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        boolean z10;
        f3 f3Var = this.C;
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
        this.f22853n.f165a = 0;
        f3 f3Var = this.C;
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
        if (this.f22851e && !this.f22852f) {
            d(null, false);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}

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
import org.telegram.ui.Components.js;
public abstract class c3 extends FrameLayout {
    public boolean E;
    public final Paint F;
    public final e3 G;
    public VelocityTracker f20259a;
    public int f20260b;
    public int f20261c;
    public int d;
    public boolean f20262e;
    public boolean f20263f;
    public AnimatorSet h;
    public final b2.q0 f20264n;
    public final Rect f20265r;
    public final Paint f20266s;
    public boolean v;
    public int f20267w;
    public float f20268x;
    public float f20269y;

    public c3(e3 e3Var, Context context) {
        super(context);
        this.G = e3Var;
        this.f20259a = null;
        this.d = -1;
        this.f20262e = false;
        this.f20263f = false;
        this.h = null;
        this.f20265r = new Rect();
        this.f20266s = new Paint();
        this.f20268x = 0.0f;
        this.f20269y = 0.0f;
        this.F = new Paint(1);
        this.f20264n = new Object();
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
        e3 e3Var = this.G;
        float translationY = e3Var.containerView.getTranslationY();
        if ((translationY >= AndroidUtilities.getPixelsInCM(0.8f, false) || (f10 >= 3500.0f && Math.abs(f10) >= Math.abs(f7))) && (f10 >= 0.0f || Math.abs(f10) < 3500.0f)) {
            z10 = e3Var.allowCustomAnimation;
            e3Var.allowCustomAnimation = false;
            e3Var.useFastDismiss = true;
            e3Var.dismiss();
            e3Var.allowCustomAnimation = z10;
            return;
        }
        this.f20262e = false;
        this.h = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a3(this, 4));
        this.h.playTogether(ObjectAnimator.ofFloat(e3Var.containerView, "translationY", 0.0f), ofFloat);
        this.h.setDuration((int) ((Math.max(0.0f, translationY) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 250.0f));
        this.h.setInterpolator(js.f27634f);
        this.h.addListener(new b3(this, 3));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.h.start();
    }

    public final void c(android.graphics.Canvas r14, float r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.c3.c(android.graphics.Canvas, float):void");
    }

    public final boolean d(MotionEvent motionEvent, boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        boolean z13;
        int i11;
        e3 e3Var = this.G;
        z11 = e3Var.dismissed;
        if (!z11) {
            if (!e3Var.onContainerTouchEvent(motionEvent)) {
                if (!e3Var.canSwipeToBack(motionEvent) && !this.E) {
                    if (e3Var.canDismissWithTouchOutside() && motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f20263f && !this.f20262e && motionEvent.getPointerCount() == 1)) {
                        this.f20260b = (int) motionEvent.getX();
                        int y3 = (int) motionEvent.getY();
                        this.f20261c = y3;
                        if (e3Var.isTouchOutside(this.f20260b, y3)) {
                            e3Var.onDismissWithTouchOutside();
                            return true;
                        }
                        e3Var.onScrollUpBegin(this.f20268x);
                        this.d = motionEvent.getPointerId(0);
                        this.f20262e = true;
                        a();
                        VelocityTracker velocityTracker = this.f20259a;
                        if (velocityTracker != null) {
                            velocityTracker.clear();
                        }
                    } else if (e3Var.canDismissWithSwipe() && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                        if (this.f20259a == null) {
                            this.f20259a = VelocityTracker.obtain();
                        }
                        float abs = Math.abs((int) (motionEvent.getX() - this.f20260b));
                        float y10 = ((int) motionEvent.getY()) - this.f20261c;
                        boolean onScrollUp = e3Var.onScrollUp(this.f20268x + y10);
                        this.f20259a.addMovement(motionEvent);
                        z13 = e3Var.disableScroll;
                        if (!z13 && this.f20262e && !this.f20263f && y10 > 0.0f && y10 / 3.0f > Math.abs(abs)) {
                            float abs2 = Math.abs(y10);
                            i11 = e3Var.touchSlop;
                            if (abs2 >= i11) {
                                this.f20261c = (int) motionEvent.getY();
                                this.f20262e = false;
                                this.f20263f = true;
                                requestDisallowInterceptTouchEvent(true);
                            }
                        }
                        if (this.f20263f) {
                            float f7 = this.f20268x + y10;
                            this.f20268x = f7;
                            if (!onScrollUp) {
                                this.f20268x = Math.max(f7, 0.0f);
                            }
                            e3Var.containerView.setTranslationY(Math.max(this.f20268x, 0.0f));
                            e3Var.onContainerViewTranslation();
                            this.f20261c = (int) motionEvent.getY();
                            e3Var.container.invalidate();
                        }
                    } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                        if (this.f20259a == null) {
                            this.f20259a = VelocityTracker.obtain();
                        }
                        this.f20259a.computeCurrentVelocity(1000);
                        e3Var.onScrollUpEnd(this.f20268x);
                        if (!this.f20263f && this.f20268x <= 0.0f) {
                            this.f20262e = false;
                        } else {
                            b(this.f20259a.getXVelocity(), this.f20259a.getYVelocity());
                        }
                        this.f20263f = false;
                        VelocityTracker velocityTracker2 = this.f20259a;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                            this.f20259a = null;
                        }
                        this.d = -1;
                    }
                } else if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f20263f && !this.f20262e && motionEvent.getPointerCount() == 1)) {
                    this.E = true;
                    this.f20260b = (int) motionEvent.getX();
                    this.f20261c = (int) motionEvent.getY();
                    this.d = motionEvent.getPointerId(0);
                    this.f20262e = true;
                    a();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    float x10 = motionEvent.getX() - this.f20260b;
                    float y11 = motionEvent.getY() - this.f20261c;
                    if (this.f20259a == null) {
                        this.f20259a = VelocityTracker.obtain();
                    }
                    this.f20259a.addMovement(motionEvent);
                    z12 = e3Var.disableScroll;
                    if (!z12 && this.f20262e && !this.f20263f && x10 > 0.0f && x10 / 3.0f > Math.abs(y11)) {
                        float abs3 = Math.abs(x10);
                        i10 = e3Var.touchSlop;
                        if (abs3 >= i10) {
                            this.f20260b = (int) motionEvent.getX();
                            this.f20262e = false;
                            this.f20263f = true;
                        }
                    }
                    if (this.f20263f) {
                        float f10 = this.f20269y + x10;
                        this.f20269y = f10;
                        e3Var.containerView.setTranslationX(Math.max(f10, 0.0f));
                        this.f20260b = (int) motionEvent.getX();
                        e3Var.container.invalidate();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f20259a == null) {
                        this.f20259a = VelocityTracker.obtain();
                    }
                    float xVelocity = this.f20259a.getXVelocity();
                    float yVelocity = this.f20259a.getYVelocity();
                    if (this.f20269y < e3Var.containerView.getMeasuredWidth() / 3.0f && (xVelocity < 3500.0f || xVelocity < yVelocity)) {
                        float max = Math.max(this.f20269y, 0.0f);
                        this.f20269y = max;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(max, 0.0f);
                        ofFloat.addUpdateListener(new a3(this, 1));
                        ofFloat.addListener(new b3(this, 0));
                        ofFloat.setInterpolator(js.f27634f);
                        ofFloat.setDuration(220L);
                        ofFloat.start();
                    } else {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f20269y, getMeasuredWidth());
                        ofFloat2.addUpdateListener(new a3(this, 2));
                        ofFloat2.addListener(new b3(this, 1));
                        js jsVar = js.h;
                        ofFloat2.setInterpolator(jsVar);
                        ofFloat2.setDuration(320L);
                        ofFloat2.start();
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat3.addUpdateListener(new a3(this, 3));
                        ofFloat3.setInterpolator(jsVar);
                        ofFloat3.setDuration(320L);
                        ofFloat3.start();
                    }
                    this.f20262e = false;
                    this.f20263f = false;
                    this.d = -1;
                    this.E = false;
                }
                if ((z10 || !this.f20262e) && !this.f20263f && (e3Var.canDismissWithSwipe() || e3Var.canSwipeToBack(motionEvent))) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.c3.dispatchDraw(android.graphics.Canvas):void");
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
        return this.f20264n.b();
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
        Paint paint = this.f20266s;
        int alpha = paint.getAlpha();
        e3 e3Var = this.G;
        int i13 = 0;
        if (alpha < 255 && e3Var.drawNavigationBar) {
            float f10 = 0.0f;
            if (e3Var.scrollNavBar || (Build.VERSION.SDK_INT >= 29 && e3.access$1400(e3Var) > 0)) {
                f10 = Math.max(0.0f, e3Var.getBottomInset() - (e3Var.containerView.getMeasuredHeight() - e3Var.containerView.getTranslationY()));
            }
            if (e3Var.drawNavigationBar) {
                i12 = e3Var.getBottomInset();
            } else {
                i12 = 0;
            }
            canvas.save();
            float left = e3Var.containerView.getLeft() + e3Var.backgroundPaddingLeft;
            f7 = e3Var.currentPanTranslationY;
            canvas.clipRect(left, ((getMeasuredHeight() - i12) + f10) - f7, e3Var.containerView.getRight() - e3Var.backgroundPaddingLeft, getMeasuredHeight() + f10, Region.Op.DIFFERENCE);
            canvas2 = canvas;
            z10 = true;
        } else {
            canvas2 = canvas;
            z10 = false;
        }
        super.onDraw(canvas2);
        if (e3Var.drawNavigationBar) {
            windowInsets = e3Var.lastInsets;
            if (windowInsets != null && e3Var.keyboardHeight != 0) {
                int i14 = e3Var.behindKeyboardColorKey;
                if (i14 >= 0) {
                    i10 = e3Var.getThemedColor(i14);
                } else {
                    i10 = e3Var.behindKeyboardColor;
                }
                paint.setColor(i10);
                float left2 = e3Var.containerView.getLeft() + e3Var.backgroundPaddingLeft;
                int measuredHeight = getMeasuredHeight() - e3Var.keyboardHeight;
                if (e3Var.drawNavigationBar) {
                    i11 = e3Var.getBottomInset();
                } else {
                    i11 = 0;
                }
                float f11 = measuredHeight - i11;
                float right = e3Var.containerView.getRight() - e3Var.backgroundPaddingLeft;
                int measuredHeight2 = getMeasuredHeight();
                if (e3Var.drawNavigationBar) {
                    i13 = e3Var.getBottomInset();
                }
                canvas2.drawRect(left2, f11, right, measuredHeight2 - i13, paint);
            }
        }
        e3Var.onContainerDraw(canvas2);
        if (z10) {
            canvas2.restore();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        e3 e3Var = this.G;
        if (!e3Var.canDismissWithSwipe() && !e3Var.canSwipeToBack(motionEvent)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return d(motionEvent, true);
    }

    @Override
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.c3.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.c3.onMeasure(int, int):void");
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
        e3 e3Var = this.G;
        z10 = e3Var.dismissed;
        if (!z10 && e3Var.allowNestedScroll) {
            a();
            float translationY = e3Var.containerView.getTranslationY();
            float f7 = 0.0f;
            if (translationY > 0.0f && i11 > 0) {
                float f10 = translationY - i11;
                iArr[1] = i11;
                if (f10 >= 0.0f) {
                    f7 = f10;
                }
                e3Var.containerView.setTranslationY(f7);
                e3Var.onContainerViewTranslation();
                e3Var.container.invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        boolean z10;
        e3 e3Var = this.G;
        z10 = e3Var.dismissed;
        if (!z10 && e3Var.allowNestedScroll) {
            a();
            if (i13 != 0) {
                float translationY = e3Var.containerView.getTranslationY() - i13;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                e3Var.containerView.setTranslationY(translationY);
                e3Var.onContainerViewTranslation();
                e3Var.container.invalidate();
            }
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        boolean z10;
        this.f20264n.f3531a = i10;
        e3 e3Var = this.G;
        z10 = e3Var.dismissed;
        if (!z10 && e3Var.allowNestedScroll) {
            a();
        }
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        boolean z10;
        e3 e3Var = this.G;
        View view3 = e3Var.nestedScrollChild;
        if (view3 == null || view == view3) {
            z10 = e3Var.dismissed;
            if (!z10 && e3Var.allowNestedScroll && i10 == 2 && !e3Var.canDismissWithSwipe()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        boolean z10;
        this.f20264n.f3531a = 0;
        e3 e3Var = this.G;
        z10 = e3Var.dismissed;
        if (!z10 && e3Var.allowNestedScroll) {
            b(0.0f, 0.0f);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent, false);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.f20262e && !this.f20263f) {
            d(null, false);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}

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
import org.telegram.ui.Components.nr;
public abstract class e3 extends FrameLayout {
    public boolean B;
    public final Paint C;
    public final g3 D;
    public VelocityTracker f19653a;
    public int f19654b;
    public int f19655c;
    public int d;
    public boolean e;
    public boolean f19656f;
    public AnimatorSet h;
    public final c5.e f19657n;
    public final Rect f19658r;
    public final Paint f19659s;
    public boolean v;
    public int f19660w;
    public float f19661x;
    public float f19662y;

    public e3(g3 g3Var, Context context) {
        super(context);
        this.D = g3Var;
        this.f19653a = null;
        this.d = -1;
        this.e = false;
        this.f19656f = false;
        this.h = null;
        this.f19658r = new Rect();
        this.f19659s = new Paint();
        this.f19661x = 0.0f;
        this.f19662y = 0.0f;
        this.C = new Paint(1);
        this.f19657n = new Object();
        setWillNotDraw(false);
    }

    public final void a() {
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        this.D.onSwipeStarts();
    }

    public final void b(float f10, float f11) {
        boolean z4;
        g3 g3Var = this.D;
        float translationY = g3Var.containerView.getTranslationY();
        if ((translationY >= AndroidUtilities.getPixelsInCM(0.8f, false) || (f11 >= 3500.0f && Math.abs(f11) >= Math.abs(f10))) && (f11 >= 0.0f || Math.abs(f11) < 3500.0f)) {
            z4 = g3Var.allowCustomAnimation;
            g3Var.allowCustomAnimation = false;
            g3Var.useFastDismiss = true;
            g3Var.dismiss();
            g3Var.allowCustomAnimation = z4;
            return;
        }
        this.e = false;
        this.h = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new c3(this, 4));
        this.h.playTogether(ObjectAnimator.ofFloat(g3Var.containerView, "translationY", 0.0f), ofFloat);
        this.h.setDuration((int) ((Math.max(0.0f, translationY) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 250.0f));
        this.h.setInterpolator(nr.f27346f);
        this.h.addListener(new d3(this, 3));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.h.start();
    }

    public final void c(android.graphics.Canvas r14, float r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.e3.c(android.graphics.Canvas, float):void");
    }

    public final boolean d(MotionEvent motionEvent, boolean z4) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        int i11;
        g3 g3Var = this.D;
        z10 = g3Var.dismissed;
        if (!z10) {
            if (!g3Var.onContainerTouchEvent(motionEvent)) {
                if (!g3Var.canSwipeToBack(motionEvent) && !this.B) {
                    if (g3Var.canDismissWithTouchOutside() && motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f19656f && !this.e && motionEvent.getPointerCount() == 1)) {
                        this.f19654b = (int) motionEvent.getX();
                        int y10 = (int) motionEvent.getY();
                        this.f19655c = y10;
                        if (g3Var.isTouchOutside(this.f19654b, y10)) {
                            g3Var.onDismissWithTouchOutside();
                            return true;
                        }
                        g3Var.onScrollUpBegin(this.f19661x);
                        this.d = motionEvent.getPointerId(0);
                        this.e = true;
                        a();
                        VelocityTracker velocityTracker = this.f19653a;
                        if (velocityTracker != null) {
                            velocityTracker.clear();
                        }
                    } else if (g3Var.canDismissWithSwipe() && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                        if (this.f19653a == null) {
                            this.f19653a = VelocityTracker.obtain();
                        }
                        float abs = Math.abs((int) (motionEvent.getX() - this.f19654b));
                        float y11 = ((int) motionEvent.getY()) - this.f19655c;
                        boolean onScrollUp = g3Var.onScrollUp(this.f19661x + y11);
                        this.f19653a.addMovement(motionEvent);
                        z12 = g3Var.disableScroll;
                        if (!z12 && this.e && !this.f19656f && y11 > 0.0f && y11 / 3.0f > Math.abs(abs)) {
                            float abs2 = Math.abs(y11);
                            i11 = g3Var.touchSlop;
                            if (abs2 >= i11) {
                                this.f19655c = (int) motionEvent.getY();
                                this.e = false;
                                this.f19656f = true;
                                requestDisallowInterceptTouchEvent(true);
                            }
                        }
                        if (this.f19656f) {
                            float f10 = this.f19661x + y11;
                            this.f19661x = f10;
                            if (!onScrollUp) {
                                this.f19661x = Math.max(f10, 0.0f);
                            }
                            g3Var.containerView.setTranslationY(Math.max(this.f19661x, 0.0f));
                            g3Var.onContainerViewTranslation();
                            this.f19655c = (int) motionEvent.getY();
                            g3Var.container.invalidate();
                        }
                    } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                        if (this.f19653a == null) {
                            this.f19653a = VelocityTracker.obtain();
                        }
                        this.f19653a.computeCurrentVelocity(1000);
                        g3Var.onScrollUpEnd(this.f19661x);
                        if (!this.f19656f && this.f19661x <= 0.0f) {
                            this.e = false;
                        } else {
                            b(this.f19653a.getXVelocity(), this.f19653a.getYVelocity());
                        }
                        this.f19656f = false;
                        VelocityTracker velocityTracker2 = this.f19653a;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                            this.f19653a = null;
                        }
                        this.d = -1;
                    }
                } else if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f19656f && !this.e && motionEvent.getPointerCount() == 1)) {
                    this.B = true;
                    this.f19654b = (int) motionEvent.getX();
                    this.f19655c = (int) motionEvent.getY();
                    this.d = motionEvent.getPointerId(0);
                    this.e = true;
                    a();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    float x10 = motionEvent.getX() - this.f19654b;
                    float y12 = motionEvent.getY() - this.f19655c;
                    if (this.f19653a == null) {
                        this.f19653a = VelocityTracker.obtain();
                    }
                    this.f19653a.addMovement(motionEvent);
                    z11 = g3Var.disableScroll;
                    if (!z11 && this.e && !this.f19656f && x10 > 0.0f && x10 / 3.0f > Math.abs(y12)) {
                        float abs3 = Math.abs(x10);
                        i10 = g3Var.touchSlop;
                        if (abs3 >= i10) {
                            this.f19654b = (int) motionEvent.getX();
                            this.e = false;
                            this.f19656f = true;
                        }
                    }
                    if (this.f19656f) {
                        float f11 = this.f19662y + x10;
                        this.f19662y = f11;
                        g3Var.containerView.setTranslationX(Math.max(f11, 0.0f));
                        this.f19654b = (int) motionEvent.getX();
                        g3Var.container.invalidate();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f19653a == null) {
                        this.f19653a = VelocityTracker.obtain();
                    }
                    float xVelocity = this.f19653a.getXVelocity();
                    float yVelocity = this.f19653a.getYVelocity();
                    if (this.f19662y < g3Var.containerView.getMeasuredWidth() / 3.0f && (xVelocity < 3500.0f || xVelocity < yVelocity)) {
                        float max = Math.max(this.f19662y, 0.0f);
                        this.f19662y = max;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(max, 0.0f);
                        ofFloat.addUpdateListener(new c3(this, 1));
                        ofFloat.addListener(new d3(this, 0));
                        ofFloat.setInterpolator(nr.f27346f);
                        ofFloat.setDuration(220L);
                        ofFloat.start();
                    } else {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f19662y, getMeasuredWidth());
                        ofFloat2.addUpdateListener(new c3(this, 2));
                        ofFloat2.addListener(new d3(this, 1));
                        nr nrVar = nr.h;
                        ofFloat2.setInterpolator(nrVar);
                        ofFloat2.setDuration(320L);
                        ofFloat2.start();
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat3.addUpdateListener(new c3(this, 3));
                        ofFloat3.setInterpolator(nrVar);
                        ofFloat3.setDuration(320L);
                        ofFloat3.start();
                    }
                    this.e = false;
                    this.f19656f = false;
                    this.d = -1;
                    this.B = false;
                }
                if ((z4 || !this.e) && !this.f19656f && (g3Var.canDismissWithSwipe() || g3Var.canSwipeToBack(motionEvent))) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.e3.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof CameraView) {
            if (this.D.shouldOverlayCameraViewOverNavBar()) {
                c(canvas, 1.0f);
            }
            return super.drawChild(canvas, view, j10);
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public int getNestedScrollAxes() {
        c5.e eVar = this.f19657n;
        return eVar.f2086b | eVar.f2085a;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z4;
        WindowInsets windowInsets;
        int i10;
        int i11;
        int i12;
        float f10;
        Paint paint = this.f19659s;
        int alpha = paint.getAlpha();
        g3 g3Var = this.D;
        int i13 = 0;
        if (alpha < 255 && g3Var.drawNavigationBar) {
            float f11 = 0.0f;
            if (g3Var.scrollNavBar || (Build.VERSION.SDK_INT >= 29 && g3.access$1400(g3Var) > 0)) {
                f11 = Math.max(0.0f, g3Var.getBottomInset() - (g3Var.containerView.getMeasuredHeight() - g3Var.containerView.getTranslationY()));
            }
            if (g3Var.drawNavigationBar) {
                i12 = g3Var.getBottomInset();
            } else {
                i12 = 0;
            }
            canvas.save();
            float left = g3Var.containerView.getLeft() + g3Var.backgroundPaddingLeft;
            f10 = g3Var.currentPanTranslationY;
            canvas.clipRect(left, ((getMeasuredHeight() - i12) + f11) - f10, g3Var.containerView.getRight() - g3Var.backgroundPaddingLeft, getMeasuredHeight() + f11, Region.Op.DIFFERENCE);
            canvas2 = canvas;
            z4 = true;
        } else {
            canvas2 = canvas;
            z4 = false;
        }
        super.onDraw(canvas2);
        if (g3Var.drawNavigationBar) {
            windowInsets = g3Var.lastInsets;
            if (windowInsets != null && g3Var.keyboardHeight != 0) {
                int i14 = g3Var.behindKeyboardColorKey;
                if (i14 >= 0) {
                    i10 = g3Var.getThemedColor(i14);
                } else {
                    i10 = g3Var.behindKeyboardColor;
                }
                paint.setColor(i10);
                float left2 = g3Var.containerView.getLeft() + g3Var.backgroundPaddingLeft;
                int measuredHeight = getMeasuredHeight() - g3Var.keyboardHeight;
                if (g3Var.drawNavigationBar) {
                    i11 = g3Var.getBottomInset();
                } else {
                    i11 = 0;
                }
                float f12 = measuredHeight - i11;
                float right = g3Var.containerView.getRight() - g3Var.backgroundPaddingLeft;
                int measuredHeight2 = getMeasuredHeight();
                if (g3Var.drawNavigationBar) {
                    i13 = g3Var.getBottomInset();
                }
                canvas2.drawRect(left2, f12, right, measuredHeight2 - i13, paint);
            }
        }
        g3Var.onContainerDraw(canvas2);
        if (z4) {
            canvas2.restore();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        g3 g3Var = this.D;
        if (!g3Var.canDismissWithSwipe() && !g3Var.canSwipeToBack(motionEvent)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return d(motionEvent, true);
    }

    @Override
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.e3.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.e3.onMeasure(int, int):void");
    }

    @Override
    public final boolean onNestedFling(View view, float f10, float f11, boolean z4) {
        return false;
    }

    @Override
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        boolean z4;
        g3 g3Var = this.D;
        z4 = g3Var.dismissed;
        if (!z4 && g3Var.allowNestedScroll) {
            a();
            float translationY = g3Var.containerView.getTranslationY();
            float f10 = 0.0f;
            if (translationY > 0.0f && i11 > 0) {
                float f11 = translationY - i11;
                iArr[1] = i11;
                if (f11 >= 0.0f) {
                    f10 = f11;
                }
                g3Var.containerView.setTranslationY(f10);
                g3Var.onContainerViewTranslation();
                g3Var.container.invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        boolean z4;
        g3 g3Var = this.D;
        z4 = g3Var.dismissed;
        if (!z4 && g3Var.allowNestedScroll) {
            a();
            if (i13 != 0) {
                float translationY = g3Var.containerView.getTranslationY() - i13;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                g3Var.containerView.setTranslationY(translationY);
                g3Var.onContainerViewTranslation();
                g3Var.container.invalidate();
            }
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        boolean z4;
        this.f19657n.f2085a = i10;
        g3 g3Var = this.D;
        z4 = g3Var.dismissed;
        if (!z4 && g3Var.allowNestedScroll) {
            a();
        }
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        boolean z4;
        g3 g3Var = this.D;
        View view3 = g3Var.nestedScrollChild;
        if (view3 == null || view == view3) {
            z4 = g3Var.dismissed;
            if (!z4 && g3Var.allowNestedScroll && i10 == 2 && !g3Var.canDismissWithSwipe()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        boolean z4;
        this.f19657n.f2085a = 0;
        g3 g3Var = this.D;
        z4 = g3Var.dismissed;
        if (!z4 && g3Var.allowNestedScroll) {
            b(0.0f, 0.0f);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent, false);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        if (this.e && !this.f19656f) {
            d(null, false);
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }
}

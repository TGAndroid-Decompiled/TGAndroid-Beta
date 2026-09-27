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
import org.telegram.ui.Components.sr;
public abstract class e3 extends FrameLayout {
    public boolean E;
    public final Paint F;
    public final g3 G;
    public VelocityTracker f18817a;
    public int f18818b;
    public int f18819c;
    public int d;
    public boolean e;
    public boolean f18820f;
    public AnimatorSet h;
    public final b2.q0 f18821n;
    public final Rect f18822r;
    public final Paint f18823s;
    public boolean v;
    public int f18824w;
    public float f18825x;
    public float f18826y;

    public e3(g3 g3Var, Context context) {
        super(context);
        this.G = g3Var;
        this.f18817a = null;
        this.d = -1;
        this.e = false;
        this.f18820f = false;
        this.h = null;
        this.f18822r = new Rect();
        this.f18823s = new Paint();
        this.f18825x = 0.0f;
        this.f18826y = 0.0f;
        this.F = new Paint(1);
        this.f18821n = new Object();
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
        g3 g3Var = this.G;
        float translationY = g3Var.containerView.getTranslationY();
        if ((translationY >= AndroidUtilities.getPixelsInCM(0.8f, false) || (f10 >= 3500.0f && Math.abs(f10) >= Math.abs(f7))) && (f10 >= 0.0f || Math.abs(f10) < 3500.0f)) {
            z10 = g3Var.allowCustomAnimation;
            g3Var.allowCustomAnimation = false;
            g3Var.useFastDismiss = true;
            g3Var.dismiss();
            g3Var.allowCustomAnimation = z10;
            return;
        }
        this.e = false;
        this.h = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new c3(this, 4));
        this.h.playTogether(ObjectAnimator.ofFloat(g3Var.containerView, "translationY", 0.0f), ofFloat);
        this.h.setDuration((int) ((Math.max(0.0f, translationY) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 250.0f));
        this.h.setInterpolator(sr.f28359f);
        this.h.addListener(new d3(this, 3));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.h.start();
    }

    public final void c(android.graphics.Canvas r14, float r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.e3.c(android.graphics.Canvas, float):void");
    }

    public final boolean d(MotionEvent motionEvent, boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        boolean z13;
        int i11;
        g3 g3Var = this.G;
        z11 = g3Var.dismissed;
        if (!z11) {
            if (!g3Var.onContainerTouchEvent(motionEvent)) {
                if (!g3Var.canSwipeToBack(motionEvent) && !this.E) {
                    if (g3Var.canDismissWithTouchOutside() && motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f18820f && !this.e && motionEvent.getPointerCount() == 1)) {
                        this.f18818b = (int) motionEvent.getX();
                        int y3 = (int) motionEvent.getY();
                        this.f18819c = y3;
                        if (g3Var.isTouchOutside(this.f18818b, y3)) {
                            g3Var.onDismissWithTouchOutside();
                            return true;
                        }
                        g3Var.onScrollUpBegin(this.f18825x);
                        this.d = motionEvent.getPointerId(0);
                        this.e = true;
                        a();
                        VelocityTracker velocityTracker = this.f18817a;
                        if (velocityTracker != null) {
                            velocityTracker.clear();
                        }
                    } else if (g3Var.canDismissWithSwipe() && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                        if (this.f18817a == null) {
                            this.f18817a = VelocityTracker.obtain();
                        }
                        float abs = Math.abs((int) (motionEvent.getX() - this.f18818b));
                        float y10 = ((int) motionEvent.getY()) - this.f18819c;
                        boolean onScrollUp = g3Var.onScrollUp(this.f18825x + y10);
                        this.f18817a.addMovement(motionEvent);
                        z13 = g3Var.disableScroll;
                        if (!z13 && this.e && !this.f18820f && y10 > 0.0f && y10 / 3.0f > Math.abs(abs)) {
                            float abs2 = Math.abs(y10);
                            i11 = g3Var.touchSlop;
                            if (abs2 >= i11) {
                                this.f18819c = (int) motionEvent.getY();
                                this.e = false;
                                this.f18820f = true;
                                requestDisallowInterceptTouchEvent(true);
                            }
                        }
                        if (this.f18820f) {
                            float f7 = this.f18825x + y10;
                            this.f18825x = f7;
                            if (!onScrollUp) {
                                this.f18825x = Math.max(f7, 0.0f);
                            }
                            g3Var.containerView.setTranslationY(Math.max(this.f18825x, 0.0f));
                            g3Var.onContainerViewTranslation();
                            this.f18819c = (int) motionEvent.getY();
                            g3Var.container.invalidate();
                        }
                    } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                        if (this.f18817a == null) {
                            this.f18817a = VelocityTracker.obtain();
                        }
                        this.f18817a.computeCurrentVelocity(1000);
                        g3Var.onScrollUpEnd(this.f18825x);
                        if (!this.f18820f && this.f18825x <= 0.0f) {
                            this.e = false;
                        } else {
                            b(this.f18817a.getXVelocity(), this.f18817a.getYVelocity());
                        }
                        this.f18820f = false;
                        VelocityTracker velocityTracker2 = this.f18817a;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                            this.f18817a = null;
                        }
                        this.d = -1;
                    }
                } else if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f18820f && !this.e && motionEvent.getPointerCount() == 1)) {
                    this.E = true;
                    this.f18818b = (int) motionEvent.getX();
                    this.f18819c = (int) motionEvent.getY();
                    this.d = motionEvent.getPointerId(0);
                    this.e = true;
                    a();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    float x10 = motionEvent.getX() - this.f18818b;
                    float y11 = motionEvent.getY() - this.f18819c;
                    if (this.f18817a == null) {
                        this.f18817a = VelocityTracker.obtain();
                    }
                    this.f18817a.addMovement(motionEvent);
                    z12 = g3Var.disableScroll;
                    if (!z12 && this.e && !this.f18820f && x10 > 0.0f && x10 / 3.0f > Math.abs(y11)) {
                        float abs3 = Math.abs(x10);
                        i10 = g3Var.touchSlop;
                        if (abs3 >= i10) {
                            this.f18818b = (int) motionEvent.getX();
                            this.e = false;
                            this.f18820f = true;
                        }
                    }
                    if (this.f18820f) {
                        float f10 = this.f18826y + x10;
                        this.f18826y = f10;
                        g3Var.containerView.setTranslationX(Math.max(f10, 0.0f));
                        this.f18818b = (int) motionEvent.getX();
                        g3Var.container.invalidate();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f18817a == null) {
                        this.f18817a = VelocityTracker.obtain();
                    }
                    float xVelocity = this.f18817a.getXVelocity();
                    float yVelocity = this.f18817a.getYVelocity();
                    if (this.f18826y < g3Var.containerView.getMeasuredWidth() / 3.0f && (xVelocity < 3500.0f || xVelocity < yVelocity)) {
                        float max = Math.max(this.f18826y, 0.0f);
                        this.f18826y = max;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(max, 0.0f);
                        ofFloat.addUpdateListener(new c3(this, 1));
                        ofFloat.addListener(new d3(this, 0));
                        ofFloat.setInterpolator(sr.f28359f);
                        ofFloat.setDuration(220L);
                        ofFloat.start();
                    } else {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f18826y, getMeasuredWidth());
                        ofFloat2.addUpdateListener(new c3(this, 2));
                        ofFloat2.addListener(new d3(this, 1));
                        sr srVar = sr.h;
                        ofFloat2.setInterpolator(srVar);
                        ofFloat2.setDuration(320L);
                        ofFloat2.start();
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat3.addUpdateListener(new c3(this, 3));
                        ofFloat3.setInterpolator(srVar);
                        ofFloat3.setDuration(320L);
                        ofFloat3.start();
                    }
                    this.e = false;
                    this.f18820f = false;
                    this.d = -1;
                    this.E = false;
                }
                if ((z10 || !this.e) && !this.f18820f && (g3Var.canDismissWithSwipe() || g3Var.canSwipeToBack(motionEvent))) {
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
        b2.q0 q0Var = this.f18821n;
        return q0Var.f3198b | q0Var.f3197a;
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
        Paint paint = this.f18823s;
        int alpha = paint.getAlpha();
        g3 g3Var = this.G;
        int i13 = 0;
        if (alpha < 255 && g3Var.drawNavigationBar) {
            float f10 = 0.0f;
            if (g3Var.scrollNavBar || (Build.VERSION.SDK_INT >= 29 && g3.access$1400(g3Var) > 0)) {
                f10 = Math.max(0.0f, g3Var.getBottomInset() - (g3Var.containerView.getMeasuredHeight() - g3Var.containerView.getTranslationY()));
            }
            if (g3Var.drawNavigationBar) {
                i12 = g3Var.getBottomInset();
            } else {
                i12 = 0;
            }
            canvas.save();
            float left = g3Var.containerView.getLeft() + g3Var.backgroundPaddingLeft;
            f7 = g3Var.currentPanTranslationY;
            canvas.clipRect(left, ((getMeasuredHeight() - i12) + f10) - f7, g3Var.containerView.getRight() - g3Var.backgroundPaddingLeft, getMeasuredHeight() + f10, Region.Op.DIFFERENCE);
            canvas2 = canvas;
            z10 = true;
        } else {
            canvas2 = canvas;
            z10 = false;
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
                float f11 = measuredHeight - i11;
                float right = g3Var.containerView.getRight() - g3Var.backgroundPaddingLeft;
                int measuredHeight2 = getMeasuredHeight();
                if (g3Var.drawNavigationBar) {
                    i13 = g3Var.getBottomInset();
                }
                canvas2.drawRect(left2, f11, right, measuredHeight2 - i13, paint);
            }
        }
        g3Var.onContainerDraw(canvas2);
        if (z10) {
            canvas2.restore();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        g3 g3Var = this.G;
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
        g3 g3Var = this.G;
        z10 = g3Var.dismissed;
        if (!z10 && g3Var.allowNestedScroll) {
            a();
            float translationY = g3Var.containerView.getTranslationY();
            float f7 = 0.0f;
            if (translationY > 0.0f && i11 > 0) {
                float f10 = translationY - i11;
                iArr[1] = i11;
                if (f10 >= 0.0f) {
                    f7 = f10;
                }
                g3Var.containerView.setTranslationY(f7);
                g3Var.onContainerViewTranslation();
                g3Var.container.invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        boolean z10;
        g3 g3Var = this.G;
        z10 = g3Var.dismissed;
        if (!z10 && g3Var.allowNestedScroll) {
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
        boolean z10;
        this.f18821n.f3197a = i10;
        g3 g3Var = this.G;
        z10 = g3Var.dismissed;
        if (!z10 && g3Var.allowNestedScroll) {
            a();
        }
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        boolean z10;
        g3 g3Var = this.G;
        View view3 = g3Var.nestedScrollChild;
        if (view3 == null || view == view3) {
            z10 = g3Var.dismissed;
            if (!z10 && g3Var.allowNestedScroll && i10 == 2 && !g3Var.canDismissWithSwipe()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        boolean z10;
        this.f18821n.f3197a = 0;
        g3 g3Var = this.G;
        z10 = g3Var.dismissed;
        if (!z10 && g3Var.allowNestedScroll) {
            b(0.0f, 0.0f);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent, false);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.e && !this.f18820f) {
            d(null, false);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}

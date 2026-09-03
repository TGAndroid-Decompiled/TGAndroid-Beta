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
import org.telegram.ui.Components.pr;
public abstract class f3 extends FrameLayout {
    public boolean B;
    public final Paint C;
    public final h3 D;
    public VelocityTracker f21349a;
    public int f21350b;
    public int f21351c;
    public int d;
    public boolean f21352e;
    public boolean f21353f;
    public AnimatorSet h;
    public final c5.e f21354n;
    public final Rect f21355r;
    public final Paint f21356s;
    public boolean v;
    public int f21357w;
    public float f21358x;
    public float f21359y;

    public f3(h3 h3Var, Context context) {
        super(context);
        this.D = h3Var;
        this.f21349a = null;
        this.d = -1;
        this.f21352e = false;
        this.f21353f = false;
        this.h = null;
        this.f21355r = new Rect();
        this.f21356s = new Paint();
        this.f21358x = 0.0f;
        this.f21359y = 0.0f;
        this.C = new Paint(1);
        this.f21354n = new Object();
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
        h3 h3Var = this.D;
        float translationY = h3Var.containerView.getTranslationY();
        if ((translationY >= AndroidUtilities.getPixelsInCM(0.8f, false) || (f11 >= 3500.0f && Math.abs(f11) >= Math.abs(f10))) && (f11 >= 0.0f || Math.abs(f11) < 3500.0f)) {
            z4 = h3Var.allowCustomAnimation;
            h3Var.allowCustomAnimation = false;
            h3Var.useFastDismiss = true;
            h3Var.dismiss();
            h3Var.allowCustomAnimation = z4;
            return;
        }
        this.f21352e = false;
        this.h = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new d3(this, 4));
        this.h.playTogether(ObjectAnimator.ofFloat(h3Var.containerView, "translationY", 0.0f), ofFloat);
        this.h.setDuration((int) ((Math.max(0.0f, translationY) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 250.0f));
        this.h.setInterpolator(pr.f30168f);
        this.h.addListener(new e3(this, 3));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.h.start();
    }

    public final void c(android.graphics.Canvas r14, float r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.f3.c(android.graphics.Canvas, float):void");
    }

    public final boolean d(MotionEvent motionEvent, boolean z4) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        int i11;
        h3 h3Var = this.D;
        z10 = h3Var.dismissed;
        if (!z10) {
            if (!h3Var.onContainerTouchEvent(motionEvent)) {
                if (!h3Var.canSwipeToBack(motionEvent) && !this.B) {
                    if (h3Var.canDismissWithTouchOutside() && motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f21353f && !this.f21352e && motionEvent.getPointerCount() == 1)) {
                        this.f21350b = (int) motionEvent.getX();
                        int y10 = (int) motionEvent.getY();
                        this.f21351c = y10;
                        if (h3Var.isTouchOutside(this.f21350b, y10)) {
                            h3Var.onDismissWithTouchOutside();
                            return true;
                        }
                        h3Var.onScrollUpBegin(this.f21358x);
                        this.d = motionEvent.getPointerId(0);
                        this.f21352e = true;
                        a();
                        VelocityTracker velocityTracker = this.f21349a;
                        if (velocityTracker != null) {
                            velocityTracker.clear();
                        }
                    } else if (h3Var.canDismissWithSwipe() && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                        if (this.f21349a == null) {
                            this.f21349a = VelocityTracker.obtain();
                        }
                        float abs = Math.abs((int) (motionEvent.getX() - this.f21350b));
                        float y11 = ((int) motionEvent.getY()) - this.f21351c;
                        boolean onScrollUp = h3Var.onScrollUp(this.f21358x + y11);
                        this.f21349a.addMovement(motionEvent);
                        z12 = h3Var.disableScroll;
                        if (!z12 && this.f21352e && !this.f21353f && y11 > 0.0f && y11 / 3.0f > Math.abs(abs)) {
                            float abs2 = Math.abs(y11);
                            i11 = h3Var.touchSlop;
                            if (abs2 >= i11) {
                                this.f21351c = (int) motionEvent.getY();
                                this.f21352e = false;
                                this.f21353f = true;
                                requestDisallowInterceptTouchEvent(true);
                            }
                        }
                        if (this.f21353f) {
                            float f10 = this.f21358x + y11;
                            this.f21358x = f10;
                            if (!onScrollUp) {
                                this.f21358x = Math.max(f10, 0.0f);
                            }
                            h3Var.containerView.setTranslationY(Math.max(this.f21358x, 0.0f));
                            h3Var.onContainerViewTranslation();
                            this.f21351c = (int) motionEvent.getY();
                            h3Var.container.invalidate();
                        }
                    } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                        if (this.f21349a == null) {
                            this.f21349a = VelocityTracker.obtain();
                        }
                        this.f21349a.computeCurrentVelocity(1000);
                        h3Var.onScrollUpEnd(this.f21358x);
                        if (!this.f21353f && this.f21358x <= 0.0f) {
                            this.f21352e = false;
                        } else {
                            b(this.f21349a.getXVelocity(), this.f21349a.getYVelocity());
                        }
                        this.f21353f = false;
                        VelocityTracker velocityTracker2 = this.f21349a;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                            this.f21349a = null;
                        }
                        this.d = -1;
                    }
                } else if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f21353f && !this.f21352e && motionEvent.getPointerCount() == 1)) {
                    this.B = true;
                    this.f21350b = (int) motionEvent.getX();
                    this.f21351c = (int) motionEvent.getY();
                    this.d = motionEvent.getPointerId(0);
                    this.f21352e = true;
                    a();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    float x10 = motionEvent.getX() - this.f21350b;
                    float y12 = motionEvent.getY() - this.f21351c;
                    if (this.f21349a == null) {
                        this.f21349a = VelocityTracker.obtain();
                    }
                    this.f21349a.addMovement(motionEvent);
                    z11 = h3Var.disableScroll;
                    if (!z11 && this.f21352e && !this.f21353f && x10 > 0.0f && x10 / 3.0f > Math.abs(y12)) {
                        float abs3 = Math.abs(x10);
                        i10 = h3Var.touchSlop;
                        if (abs3 >= i10) {
                            this.f21350b = (int) motionEvent.getX();
                            this.f21352e = false;
                            this.f21353f = true;
                        }
                    }
                    if (this.f21353f) {
                        float f11 = this.f21359y + x10;
                        this.f21359y = f11;
                        h3Var.containerView.setTranslationX(Math.max(f11, 0.0f));
                        this.f21350b = (int) motionEvent.getX();
                        h3Var.container.invalidate();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f21349a == null) {
                        this.f21349a = VelocityTracker.obtain();
                    }
                    float xVelocity = this.f21349a.getXVelocity();
                    float yVelocity = this.f21349a.getYVelocity();
                    if (this.f21359y < h3Var.containerView.getMeasuredWidth() / 3.0f && (xVelocity < 3500.0f || xVelocity < yVelocity)) {
                        float max = Math.max(this.f21359y, 0.0f);
                        this.f21359y = max;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(max, 0.0f);
                        ofFloat.addUpdateListener(new d3(this, 1));
                        ofFloat.addListener(new e3(this, 0));
                        ofFloat.setInterpolator(pr.f30168f);
                        ofFloat.setDuration(220L);
                        ofFloat.start();
                    } else {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f21359y, getMeasuredWidth());
                        ofFloat2.addUpdateListener(new d3(this, 2));
                        ofFloat2.addListener(new e3(this, 1));
                        pr prVar = pr.h;
                        ofFloat2.setInterpolator(prVar);
                        ofFloat2.setDuration(320L);
                        ofFloat2.start();
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat3.addUpdateListener(new d3(this, 3));
                        ofFloat3.setInterpolator(prVar);
                        ofFloat3.setDuration(320L);
                        ofFloat3.start();
                    }
                    this.f21352e = false;
                    this.f21353f = false;
                    this.d = -1;
                    this.B = false;
                }
                if ((z4 || !this.f21352e) && !this.f21353f && (h3Var.canDismissWithSwipe() || h3Var.canSwipeToBack(motionEvent))) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.f3.dispatchDraw(android.graphics.Canvas):void");
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
        c5.e eVar = this.f21354n;
        return eVar.f2269b | eVar.f2268a;
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
        Paint paint = this.f21356s;
        int alpha = paint.getAlpha();
        h3 h3Var = this.D;
        int i13 = 0;
        if (alpha < 255 && h3Var.drawNavigationBar) {
            float f11 = 0.0f;
            if (h3Var.scrollNavBar || (Build.VERSION.SDK_INT >= 29 && h3.access$1400(h3Var) > 0)) {
                f11 = Math.max(0.0f, h3Var.getBottomInset() - (h3Var.containerView.getMeasuredHeight() - h3Var.containerView.getTranslationY()));
            }
            if (h3Var.drawNavigationBar) {
                i12 = h3Var.getBottomInset();
            } else {
                i12 = 0;
            }
            canvas.save();
            float left = h3Var.containerView.getLeft() + h3Var.backgroundPaddingLeft;
            f10 = h3Var.currentPanTranslationY;
            canvas.clipRect(left, ((getMeasuredHeight() - i12) + f11) - f10, h3Var.containerView.getRight() - h3Var.backgroundPaddingLeft, getMeasuredHeight() + f11, Region.Op.DIFFERENCE);
            canvas2 = canvas;
            z4 = true;
        } else {
            canvas2 = canvas;
            z4 = false;
        }
        super.onDraw(canvas2);
        if (h3Var.drawNavigationBar) {
            windowInsets = h3Var.lastInsets;
            if (windowInsets != null && h3Var.keyboardHeight != 0) {
                int i14 = h3Var.behindKeyboardColorKey;
                if (i14 >= 0) {
                    i10 = h3Var.getThemedColor(i14);
                } else {
                    i10 = h3Var.behindKeyboardColor;
                }
                paint.setColor(i10);
                float left2 = h3Var.containerView.getLeft() + h3Var.backgroundPaddingLeft;
                int measuredHeight = getMeasuredHeight() - h3Var.keyboardHeight;
                if (h3Var.drawNavigationBar) {
                    i11 = h3Var.getBottomInset();
                } else {
                    i11 = 0;
                }
                float f12 = measuredHeight - i11;
                float right = h3Var.containerView.getRight() - h3Var.backgroundPaddingLeft;
                int measuredHeight2 = getMeasuredHeight();
                if (h3Var.drawNavigationBar) {
                    i13 = h3Var.getBottomInset();
                }
                canvas2.drawRect(left2, f12, right, measuredHeight2 - i13, paint);
            }
        }
        h3Var.onContainerDraw(canvas2);
        if (z4) {
            canvas2.restore();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        h3 h3Var = this.D;
        if (!h3Var.canDismissWithSwipe() && !h3Var.canSwipeToBack(motionEvent)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return d(motionEvent, true);
    }

    @Override
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.f3.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.f3.onMeasure(int, int):void");
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
        h3 h3Var = this.D;
        z4 = h3Var.dismissed;
        if (!z4 && h3Var.allowNestedScroll) {
            a();
            float translationY = h3Var.containerView.getTranslationY();
            float f10 = 0.0f;
            if (translationY > 0.0f && i11 > 0) {
                float f11 = translationY - i11;
                iArr[1] = i11;
                if (f11 >= 0.0f) {
                    f10 = f11;
                }
                h3Var.containerView.setTranslationY(f10);
                h3Var.onContainerViewTranslation();
                h3Var.container.invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        boolean z4;
        h3 h3Var = this.D;
        z4 = h3Var.dismissed;
        if (!z4 && h3Var.allowNestedScroll) {
            a();
            if (i13 != 0) {
                float translationY = h3Var.containerView.getTranslationY() - i13;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                h3Var.containerView.setTranslationY(translationY);
                h3Var.onContainerViewTranslation();
                h3Var.container.invalidate();
            }
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        boolean z4;
        this.f21354n.f2268a = i10;
        h3 h3Var = this.D;
        z4 = h3Var.dismissed;
        if (!z4 && h3Var.allowNestedScroll) {
            a();
        }
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        boolean z4;
        h3 h3Var = this.D;
        View view3 = h3Var.nestedScrollChild;
        if (view3 == null || view == view3) {
            z4 = h3Var.dismissed;
            if (!z4 && h3Var.allowNestedScroll && i10 == 2 && !h3Var.canDismissWithSwipe()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        boolean z4;
        this.f21354n.f2268a = 0;
        h3 h3Var = this.D;
        z4 = h3Var.dismissed;
        if (!z4 && h3Var.allowNestedScroll) {
            b(0.0f, 0.0f);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent, false);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        if (this.f21352e && !this.f21353f) {
            d(null, false);
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }
}

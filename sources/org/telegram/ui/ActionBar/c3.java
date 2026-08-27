package org.telegram.ui.ActionBar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.z60;

public abstract class c3 extends FrameLayout {
    public boolean A;
    public final Paint B;
    public final e3 C;

    public VelocityTracker f22807a;

    public int f22808b;

    public int f22809c;
    public int d;

    public boolean f22810e;

    public boolean f22811f;
    public AnimatorSet h;

    public final d5.p f22812n;

    public final Rect f22813r;

    public final Paint f22814s;
    public boolean v;

    public int f22815w;

    public float f22816x;

    public float f22817y;

    public c3(e3 e3Var, Context context) {
        super(context);
        this.C = e3Var;
        this.f22807a = null;
        this.d = -1;
        this.f22810e = false;
        this.f22811f = false;
        this.h = null;
        this.f22813r = new Rect();
        this.f22814s = new Paint();
        this.f22816x = 0.0f;
        this.f22817y = 0.0f;
        this.B = new Paint(1);
        this.f22812n = new d5.p();
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

    public final void b(float f10, float f11) {
        e3 e3Var = this.C;
        float translationY = e3Var.containerView.getTranslationY();
        if ((translationY >= AndroidUtilities.getPixelsInCM(0.8f, false) || (f11 >= 3500.0f && Math.abs(f11) >= Math.abs(f10))) && (f11 >= 0.0f || Math.abs(f11) < 3500.0f)) {
            boolean z10 = e3Var.allowCustomAnimation;
            e3Var.allowCustomAnimation = false;
            e3Var.useFastDismiss = true;
            e3Var.dismiss();
            e3Var.allowCustomAnimation = z10;
            return;
        }
        this.f22810e = false;
        this.h = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a3(this, 4));
        this.h.playTogether(ObjectAnimator.ofFloat(e3Var.containerView, "translationY", 0.0f), valueAnimatorOfFloat);
        this.h.setDuration((int) ((Math.max(0.0f, translationY) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 250.0f));
        this.h.setInterpolator(er.f28122f);
        this.h.addListener(new b3(this, 3));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.h.start();
    }

    public final void c(Canvas canvas, float f10) {
        float fMax;
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.f22814s;
        e3 e3Var = this.C;
        if (i10 >= 26) {
            int i11 = e3Var.navBarColorKey;
            if (i11 >= 0) {
                paint.setColor(e3Var.getThemedColor(i11));
            } else {
                paint.setColor(e3Var.navBarColor);
            }
        } else {
            paint.setColor(-16777216);
        }
        if (!e3Var.transitionFromRight || e3Var.containerView.getVisibility() == 0) {
            float f11 = 0.0f;
            if ((!e3Var.drawNavigationBar || e3Var.bottomInset == 0) && e3Var.currentPanTranslationY == 0.0f) {
                return;
            }
            int bottomInset = e3Var.drawNavigationBar ? e3Var.getBottomInset() : 0;
            if (!e3Var.scrollNavBar && (i10 < 29 || e3.access$1400(e3Var) <= 0)) {
                fMax = 0.0f;
            } else if (e3Var.drawDoubleNavigationBar) {
                fMax = Math.max(0.0f, Math.min(bottomInset - e3Var.currentPanTranslationY, e3Var.containerView.getTranslationY()));
            } else {
                fMax = Math.max(0.0f, e3Var.getBottomInset() - (e3Var.containerView.getMeasuredHeight() - e3Var.containerView.getTranslationY()));
            }
            int alpha = paint.getAlpha();
            if (e3Var.transitionFromRight) {
                f10 *= e3Var.containerView.getAlpha();
            }
            int x8 = e3Var.transitionFromRight ? (int) e3Var.containerView.getX() : e3Var.containerView.getLeft();
            if (f10 < 1.0f) {
                paint.setAlpha((int) (alpha * f10));
            }
            canvas.drawRect(e3Var.backgroundPaddingLeft + x8, ((getMeasuredHeight() - bottomInset) + fMax) - e3Var.currentPanTranslationY, e3Var.containerView.getRight() - e3Var.backgroundPaddingLeft, getMeasuredHeight() + fMax, paint);
            paint.setAlpha(alpha);
            if (e3Var.overlayDrawNavBarColor != 0) {
                paint.setColor(e3Var.overlayDrawNavBarColor);
                int alpha2 = paint.getAlpha();
                float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(bottomInset);
                if (f10 < 1.0f) {
                    paint.setAlpha((int) (alpha2 * f10 * navigationBarThirdButtonsFactor));
                } else {
                    f11 = fMax;
                }
                if (paint.getAlpha() > 0) {
                    canvas.drawRect(x8 + e3Var.backgroundPaddingLeft, ((getMeasuredHeight() - bottomInset) + f11) - e3Var.currentPanTranslationY, e3Var.containerView.getRight() - e3Var.backgroundPaddingLeft, getMeasuredHeight() + f11, paint);
                }
                paint.setAlpha(alpha2);
            }
        }
    }

    public final boolean d(MotionEvent motionEvent, boolean z10) {
        e3 e3Var = this.C;
        int i10 = 0;
        if (!e3Var.dismissed) {
            int i11 = 1;
            if (!e3Var.onContainerTouchEvent(motionEvent)) {
                int i12 = 3;
                int i13 = 2;
                if (e3Var.canSwipeToBack(motionEvent) || this.A) {
                    if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f22811f && !this.f22810e && motionEvent.getPointerCount() == 1)) {
                        this.A = true;
                        this.f22808b = (int) motionEvent.getX();
                        this.f22809c = (int) motionEvent.getY();
                        this.d = motionEvent.getPointerId(0);
                        this.f22810e = true;
                        a();
                    } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                        float x8 = motionEvent.getX() - this.f22808b;
                        float y10 = motionEvent.getY() - this.f22809c;
                        if (this.f22807a == null) {
                            this.f22807a = VelocityTracker.obtain();
                        }
                        this.f22807a.addMovement(motionEvent);
                        if (!e3Var.disableScroll && this.f22810e && !this.f22811f && x8 > 0.0f && x8 / 3.0f > Math.abs(y10) && Math.abs(x8) >= e3Var.touchSlop) {
                            this.f22808b = (int) motionEvent.getX();
                            this.f22810e = false;
                            this.f22811f = true;
                        } else if (this.f22811f) {
                            float f10 = this.f22817y + x8;
                            this.f22817y = f10;
                            e3Var.containerView.setTranslationX(Math.max(f10, 0.0f));
                            this.f22808b = (int) motionEvent.getX();
                            e3Var.container.invalidate();
                        }
                    } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                        if (this.f22807a == null) {
                            this.f22807a = VelocityTracker.obtain();
                        }
                        float xVelocity = this.f22807a.getXVelocity();
                        float yVelocity = this.f22807a.getYVelocity();
                        if (this.f22817y >= e3Var.containerView.getMeasuredWidth() / 3.0f || (xVelocity >= 3500.0f && xVelocity >= yVelocity)) {
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f22817y, getMeasuredWidth());
                            valueAnimatorOfFloat.addUpdateListener(new a3(this, i13));
                            valueAnimatorOfFloat.addListener(new b3(this, i11));
                            er erVar = er.h;
                            valueAnimatorOfFloat.setInterpolator(erVar);
                            valueAnimatorOfFloat.setDuration(320L);
                            valueAnimatorOfFloat.start();
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                            valueAnimatorOfFloat2.addUpdateListener(new a3(this, i12));
                            valueAnimatorOfFloat2.setInterpolator(erVar);
                            valueAnimatorOfFloat2.setDuration(320L);
                            valueAnimatorOfFloat2.start();
                        } else {
                            float fMax = Math.max(this.f22817y, 0.0f);
                            this.f22817y = fMax;
                            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(fMax, 0.0f);
                            valueAnimatorOfFloat3.addUpdateListener(new a3(this, i11));
                            valueAnimatorOfFloat3.addListener(new b3(this, i10));
                            valueAnimatorOfFloat3.setInterpolator(er.f28122f);
                            valueAnimatorOfFloat3.setDuration(220L);
                            valueAnimatorOfFloat3.start();
                        }
                        this.f22810e = false;
                        this.f22811f = false;
                        this.d = -1;
                        this.A = false;
                    }
                } else if (e3Var.canDismissWithTouchOutside() && motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f22811f && !this.f22810e && motionEvent.getPointerCount() == 1)) {
                    this.f22808b = (int) motionEvent.getX();
                    int y11 = (int) motionEvent.getY();
                    this.f22809c = y11;
                    if (e3Var.isTouchOutside(this.f22808b, y11)) {
                        e3Var.onDismissWithTouchOutside();
                        return true;
                    }
                    e3Var.onScrollUpBegin(this.f22816x);
                    this.d = motionEvent.getPointerId(0);
                    this.f22810e = true;
                    a();
                    VelocityTracker velocityTracker = this.f22807a;
                    if (velocityTracker != null) {
                        velocityTracker.clear();
                    }
                } else if (e3Var.canDismissWithSwipe() && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    if (this.f22807a == null) {
                        this.f22807a = VelocityTracker.obtain();
                    }
                    float fAbs = Math.abs((int) (motionEvent.getX() - this.f22808b));
                    float y12 = ((int) motionEvent.getY()) - this.f22809c;
                    boolean zOnScrollUp = e3Var.onScrollUp(this.f22816x + y12);
                    this.f22807a.addMovement(motionEvent);
                    if (!e3Var.disableScroll && this.f22810e && !this.f22811f && y12 > 0.0f && y12 / 3.0f > Math.abs(fAbs) && Math.abs(y12) >= e3Var.touchSlop) {
                        this.f22809c = (int) motionEvent.getY();
                        this.f22810e = false;
                        this.f22811f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f22811f) {
                        float f11 = this.f22816x + y12;
                        this.f22816x = f11;
                        if (!zOnScrollUp) {
                            this.f22816x = Math.max(f11, 0.0f);
                        }
                        e3Var.containerView.setTranslationY(Math.max(this.f22816x, 0.0f));
                        e3Var.onContainerViewTranslation();
                        this.f22809c = (int) motionEvent.getY();
                        e3Var.container.invalidate();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f22807a == null) {
                        this.f22807a = VelocityTracker.obtain();
                    }
                    this.f22807a.computeCurrentVelocity(1000);
                    e3Var.onScrollUpEnd(this.f22816x);
                    if (this.f22811f || this.f22816x > 0.0f) {
                        b(this.f22807a.getXVelocity(), this.f22807a.getYVelocity());
                    } else {
                        this.f22810e = false;
                    }
                    this.f22811f = false;
                    VelocityTracker velocityTracker2 = this.f22807a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.f22807a = null;
                    }
                    this.d = -1;
                }
                if ((z10 || !this.f22810e) && !this.f22811f && (e3Var.canDismissWithSwipe() || e3Var.canSwipeToBack(motionEvent))) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Paint paint;
        e3 e3Var = this.C;
        if (e3Var.containerView != null && this.f22815w > 0) {
            int i10 = e3Var.internalBackgroundColor;
            Paint paint2 = this.B;
            paint2.setColor(i10);
            canvas.drawRect(0.0f, (e3Var.containerView.getTranslationY() + (getMeasuredHeight() - this.f22815w)) - 1.0f, getMeasuredWidth(), e3Var.containerView.getTranslationY() + getMeasuredHeight(), paint2);
        }
        int i11 = Build.VERSION.SDK_INT;
        Paint paint3 = this.f22814s;
        if (i11 >= 26) {
            int i12 = e3Var.navBarColorKey;
            if (i12 >= 0) {
                paint3.setColor(e3Var.getThemedColor(i12));
            } else {
                paint3.setColor(e3Var.navBarColor);
            }
        } else {
            paint3.setColor(-16777216);
        }
        if (e3Var.drawDoubleNavigationBar && !e3Var.shouldOverlayCameraViewOverNavBar()) {
            c(canvas, 1.0f);
        }
        if (paint3.getAlpha() >= 255 || !e3Var.drawNavigationBar) {
            super.dispatchDraw(canvas);
        } else {
            float fMax = 0.0f;
            if (e3Var.scrollNavBar || (i11 >= 29 && e3.access$1400(e3Var) > 0)) {
                fMax = Math.max(0.0f, e3Var.getBottomInset() - (e3Var.containerView.getMeasuredHeight() - e3Var.containerView.getTranslationY()));
            }
            int bottomInset = e3Var.drawNavigationBar ? e3Var.getBottomInset() : 0;
            canvas.save();
            canvas.clipRect(e3Var.containerView.getLeft() + e3Var.backgroundPaddingLeft, ((getMeasuredHeight() - bottomInset) + fMax) - e3Var.currentPanTranslationY, e3Var.containerView.getRight() - e3Var.backgroundPaddingLeft, getMeasuredHeight() + fMax, Region.Op.DIFFERENCE);
            super.dispatchDraw(canvas);
            canvas.restore();
        }
        if (e3Var.doNotOverlayNavigationBar) {
            if ((getMeasuredHeight() - e3Var.containerView.getY()) - e3Var.containerView.getMeasuredHeight() > AndroidUtilities.dp(48.0f)) {
                int i13 = e3Var.behindKeyboardColorKey;
                paint3.setColor(i13 >= 0 ? e3Var.getThemedColor(i13) : e3Var.behindKeyboardColor);
                canvas.drawRect(e3Var.containerView.getLeft() + e3Var.backgroundPaddingLeft, e3Var.containerView.getMeasuredHeight() + e3Var.containerView.getY(), e3Var.containerView.getRight() - e3Var.backgroundPaddingLeft, getMeasuredHeight(), paint3);
                return;
            }
            return;
        }
        if (!e3Var.shouldOverlayCameraViewOverNavBar()) {
            c(canvas, e3Var.drawDoubleNavigationBar ? e3Var.navigationBarAlpha * 0.7f : 1.0f);
        }
        if (!e3Var.drawNavigationBar || e3Var.rightInset == 0 || e3Var.rightInset <= e3Var.leftInset || !e3Var.fullWidth) {
            paint = paint3;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                paint = paint3;
                canvas.drawRect(e3Var.containerView.getRight() - e3Var.backgroundPaddingLeft, e3Var.containerView.getTranslationY(), e3Var.rightInset + e3Var.containerView.getRight(), getMeasuredHeight(), paint);
            } else {
                paint = paint3;
            }
        }
        if (e3Var.drawNavigationBar && e3Var.leftInset != 0 && e3Var.leftInset > e3Var.rightInset && e3Var.fullWidth) {
            Point point2 = AndroidUtilities.displaySize;
            if (point2.x > point2.y) {
                canvas.drawRect(0.0f, e3Var.containerView.getTranslationY(), e3Var.containerView.getLeft() + e3Var.backgroundPaddingLeft, getMeasuredHeight(), paint);
            }
        }
        if (e3Var.containerView.getY() + e3Var.containerView.getMeasuredHeight() < getMeasuredHeight()) {
            int i14 = e3Var.behindKeyboardColorKey;
            paint.setColor(i14 >= 0 ? e3Var.getThemedColor(i14) : e3Var.behindKeyboardColor);
            canvas.drawRect(e3Var.containerView.getLeft() + e3Var.backgroundPaddingLeft, e3Var.containerView.getMeasuredHeight() + e3Var.containerView.getY(), e3Var.containerView.getRight() - e3Var.backgroundPaddingLeft, getMeasuredHeight(), paint);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (!(view instanceof CameraView)) {
            return super.drawChild(canvas, view, j10);
        }
        if (this.C.shouldOverlayCameraViewOverNavBar()) {
            c(canvas, 1.0f);
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public int getNestedScrollAxes() {
        d5.p pVar = this.f22812n;
        return pVar.f4822b | pVar.f4821a;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        Paint paint = this.f22814s;
        int alpha = paint.getAlpha();
        e3 e3Var = this.C;
        if (alpha >= 255 || !e3Var.drawNavigationBar) {
            canvas2 = canvas;
            z10 = false;
        } else {
            float fMax = 0.0f;
            if (e3Var.scrollNavBar || (Build.VERSION.SDK_INT >= 29 && e3.access$1400(e3Var) > 0)) {
                fMax = Math.max(0.0f, e3Var.getBottomInset() - (e3Var.containerView.getMeasuredHeight() - e3Var.containerView.getTranslationY()));
            }
            int bottomInset = e3Var.drawNavigationBar ? e3Var.getBottomInset() : 0;
            canvas.save();
            canvas.clipRect(e3Var.containerView.getLeft() + e3Var.backgroundPaddingLeft, ((getMeasuredHeight() - bottomInset) + fMax) - e3Var.currentPanTranslationY, e3Var.containerView.getRight() - e3Var.backgroundPaddingLeft, getMeasuredHeight() + fMax, Region.Op.DIFFERENCE);
            canvas2 = canvas;
            z10 = true;
        }
        super.onDraw(canvas2);
        if (e3Var.drawNavigationBar && e3Var.lastInsets != null && e3Var.keyboardHeight != 0) {
            int i10 = e3Var.behindKeyboardColorKey;
            paint.setColor(i10 >= 0 ? e3Var.getThemedColor(i10) : e3Var.behindKeyboardColor);
            canvas2.drawRect(e3Var.containerView.getLeft() + e3Var.backgroundPaddingLeft, (getMeasuredHeight() - e3Var.keyboardHeight) - (e3Var.drawNavigationBar ? e3Var.getBottomInset() : 0), e3Var.containerView.getRight() - e3Var.backgroundPaddingLeft, getMeasuredHeight() - (e3Var.drawNavigationBar ? e3Var.getBottomInset() : 0), paint);
        }
        e3Var.onContainerDraw(canvas2);
        if (z10) {
            canvas2.restore();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        e3 e3Var = this.C;
        return (e3Var.canDismissWithSwipe() || e3Var.canSwipeToBack(motionEvent)) ? d(motionEvent, true) : super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Runnable runnable;
        int i14;
        e3 e3Var;
        int i15;
        int i16;
        int leftInset;
        int i17;
        int i18;
        int i19;
        int leftInset2 = i10;
        int i20 = i11;
        int rightInset = i12;
        int i21 = i13 - this.f22815w;
        e3 e3Var2 = this.C;
        e3Var2.onContainerLayout(leftInset2, i20, rightInset, i21);
        e3.access$1510(e3Var2);
        ViewGroup viewGroup = e3Var2.containerView;
        int i22 = 1;
        int i23 = 2;
        int i24 = 0;
        if (viewGroup != null) {
            int measuredHeight = (i21 - i20) - viewGroup.getMeasuredHeight();
            if (e3Var2.lastInsets != null) {
                leftInset2 += e3Var2.getLeftInset();
                rightInset -= e3Var2.getRightInset();
                if (e3Var2.useSmoothKeyboard) {
                    measuredHeight = 0;
                } else if (!e3Var2.occupyNavigationBar) {
                    measuredHeight = (int) (measuredHeight - (((1.0f - e3Var2.hideSystemVerticalInsetsProgress) * e3Var2.lastInsets.getSystemWindowInsetBottom()) - (e3Var2.drawNavigationBar ? 0 : e3Var2.getBottomInset())));
                    if (Build.VERSION.SDK_INT >= 29) {
                        measuredHeight -= e3.access$1400(e3Var2);
                    }
                }
            }
            int measuredWidth = ((rightInset - leftInset2) - e3Var2.containerView.getMeasuredWidth()) / 2;
            if (e3Var2.lastInsets != null) {
                measuredWidth += e3Var2.getLeftInset();
            }
            if ((e3Var2.smoothKeyboardAnimationEnabled && e3Var2.startAnimationRunnable == null && this.v && !e3Var2.dismissed && (!e3Var2.smoothKeyboardByBottom ? e3Var2.containerView.getTop() != measuredHeight : e3Var2.containerView.getBottom() != e3Var2.containerView.getMeasuredHeight() + measuredHeight)) || (e3Var2.smoothContainerViewLayoutUntil > 0 && System.currentTimeMillis() < e3Var2.smoothContainerViewLayoutUntil)) {
                ViewGroup viewGroup2 = e3Var2.containerView;
                viewGroup2.setTranslationY(e3Var2.smoothKeyboardByBottom ? viewGroup2.getBottom() - (e3Var2.containerView.getMeasuredHeight() + measuredHeight) : viewGroup2.getTop() - measuredHeight);
                e3Var2.onContainerViewTranslation();
                e3Var2.onSmoothContainerViewLayout(e3Var2.containerView.getTranslationY());
                ValueAnimator valueAnimator = e3Var2.keyboardContentAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(e3Var2.containerView.getTranslationY(), 0.0f);
                e3Var2.keyboardContentAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new a3(this, i24));
                e3Var2.keyboardContentAnimator.addListener(new b3(this, i23));
                e3Var2.keyboardContentAnimator.setDuration(250L).setInterpolator(p1.f23706w);
                e3Var2.keyboardContentAnimator.start();
                e3Var2.smoothContainerViewLayoutUntil = -1L;
            }
            ViewGroup viewGroup3 = e3Var2.containerView;
            viewGroup3.layout(measuredWidth, measuredHeight, viewGroup3.getMeasuredWidth() + measuredWidth, e3Var2.containerView.getMeasuredHeight() + measuredHeight);
        }
        int i25 = rightInset;
        int childCount = getChildCount();
        int i26 = 0;
        while (i26 < childCount) {
            View childAt = getChildAt(i26);
            if (childAt.getVisibility() == 8 || childAt == e3Var2.containerView) {
                e3 e3Var3 = e3Var2;
                i14 = leftInset2;
                e3Var = e3Var3;
            } else {
                int bottomInset = e3Var2.drawNavigationBar ? e3Var2.getBottomInset() : 0;
                e3 e3Var4 = e3Var2;
                i14 = leftInset2;
                e3Var = e3Var4;
                if (!e3Var.onCustomLayout(childAt, i14, i20, i25, i21 - bottomInset)) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    int i27 = layoutParams.gravity;
                    if (i27 == -1) {
                        i27 = 51;
                    }
                    int i28 = i27 & 112;
                    int i29 = i27 & 7;
                    if (i29 != i22) {
                        if (i29 != 5) {
                            leftInset = layoutParams.leftMargin;
                        } else {
                            i15 = i25 - measuredWidth2;
                            i16 = layoutParams.rightMargin;
                        }
                        if (i28 != 16) {
                            if (i28 != 80) {
                                i19 = layoutParams.topMargin;
                            } else {
                                i17 = (i21 - i11) - measuredHeight2;
                                i18 = layoutParams.bottomMargin;
                            }
                            if (e3Var.lastInsets != null) {
                                leftInset += e3Var.getLeftInset();
                            }
                            childAt.layout(leftInset, i19, measuredWidth2 + leftInset, measuredHeight2 + i19);
                        } else {
                            i17 = (((i21 - i11) - measuredHeight2) / 2) + layoutParams.topMargin;
                            i18 = layoutParams.bottomMargin;
                        }
                        i19 = i17 - i18;
                        if (e3Var.lastInsets != null) {
                            leftInset += e3Var.getLeftInset();
                        }
                        childAt.layout(leftInset, i19, measuredWidth2 + leftInset, measuredHeight2 + i19);
                    } else {
                        i15 = (((i25 - i14) - measuredWidth2) / 2) + layoutParams.leftMargin;
                        i16 = layoutParams.rightMargin;
                    }
                    leftInset = i15 - i16;
                    if (i28 != 16) {
                        if (i28 != 80) {
                            i19 = layoutParams.topMargin;
                        } else {
                            i17 = (i21 - i11) - measuredHeight2;
                            i18 = layoutParams.bottomMargin;
                        }
                        if (e3Var.lastInsets != null) {
                            leftInset += e3Var.getLeftInset();
                        }
                        childAt.layout(leftInset, i19, measuredWidth2 + leftInset, measuredHeight2 + i19);
                    } else {
                        i17 = (((i21 - i11) - measuredHeight2) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (e3Var.lastInsets != null) {
                        leftInset += e3Var.getLeftInset();
                    }
                    childAt.layout(leftInset, i19, measuredWidth2 + leftInset, measuredHeight2 + i19);
                }
            }
            i26++;
            int i30 = i14;
            e3Var2 = e3Var;
            leftInset2 = i30;
            i20 = i11;
            i22 = 1;
        }
        e3 e3Var5 = e3Var2;
        if (e3Var5.layoutCount == 0 && (runnable = e3Var5.startAnimationRunnable) != null && !e3Var5.waitingKeyboard) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            e3Var5.startAnimationRunnable.run();
            e3Var5.startAnimationRunnable = null;
        }
        if (e3Var5.waitingKeyboard && e3Var5.keyboardVisible) {
            Runnable runnable2 = e3Var5.startAnimationRunnable;
            if (runnable2 != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                e3Var5.startAnimationRunnable.run();
            }
            e3Var5.waitingKeyboard = false;
        }
        this.v = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int bottomInset;
        int iMakeMeasureSpec;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        View rootView = getRootView();
        Rect rect = this.f22813r;
        getWindowVisibleDisplayFrame(rect);
        e3 e3Var = this.C;
        int i12 = e3Var.keyboardHeight;
        if (rect.bottom == 0 || rect.top == 0) {
            e3Var.keyboardHeight = 0;
        } else {
            e3Var.keyboardHeight = Math.max(0, ((int) ((rootView.getHeight() - (rect.top != 0 ? (1.0f - e3Var.hideSystemVerticalInsetsProgress) * AndroidUtilities.statusBarHeight : 0.0f)) - ((1.0f - e3Var.hideSystemVerticalInsetsProgress) * AndroidUtilities.getViewInset(rootView)))) - (rect.bottom - rect.top));
            if (e3Var.keyboardHeight < AndroidUtilities.dp(20.0f)) {
                e3Var.keyboardHeight = 0;
            } else {
                e3Var.lastKeyboardHeight = e3Var.keyboardHeight;
            }
            e3.access$1020(e3Var, e3Var.keyboardHeight);
        }
        int i13 = e3Var.keyboardHeight;
        if (i12 != i13) {
            this.v = true;
        }
        e3Var.keyboardVisible = i13 > AndroidUtilities.dp(20.0f);
        if (e3Var.lastInsets != null) {
            e3Var.bottomInset = e3Var.lastInsets.getSystemWindowInsetBottom();
            e3Var.leftInset = e3Var.lastInsets.getSystemWindowInsetLeft();
            e3Var.rightInset = e3Var.lastInsets.getSystemWindowInsetRight();
            if (Build.VERSION.SDK_INT >= 29) {
                e3.access$1012(e3Var, e3.access$1400(e3Var));
            }
            if (e3Var.keyboardVisible && rect.bottom != 0 && rect.top != 0) {
                e3.access$1020(e3Var, e3Var.keyboardHeight);
            }
            if (e3Var.drawNavigationBar || e3Var.occupyNavigationBar || e3Var.occupyNavigationBarWithoutKeyboard) {
                bottomInset = size2;
            } else {
                bottomInset = size2 - e3Var.getBottomInset();
            }
        } else {
            bottomInset = size2;
        }
        this.f22815w = size2 - bottomInset;
        setMeasuredDimension(size, size2);
        e3Var.navigationBarHeight = 0;
        if (e3Var.lastInsets != null && !e3Var.occupyNavigationBar) {
            int systemWindowInsetBottom = (int) ((1.0f - e3Var.hideSystemVerticalInsetsProgress) * e3Var.lastInsets.getSystemWindowInsetBottom());
            if (Build.VERSION.SDK_INT >= 29) {
                systemWindowInsetBottom += e3.access$1400(e3Var);
            }
            if (!e3Var.occupyNavigationBarWithoutKeyboard) {
                size2 -= systemWindowInsetBottom;
            } else if (systemWindowInsetBottom > AndroidUtilities.dp(10.0f) + AndroidUtilities.navigationBarHeight) {
                size2 -= systemWindowInsetBottom;
            }
            e3Var.navigationBarHeight = Math.min(systemWindowInsetBottom, AndroidUtilities.navigationBarHeight);
        }
        int i14 = size2;
        if (e3Var.lastInsets != null) {
            size -= e3Var.getLeftInset() + e3Var.getRightInset();
        }
        int i15 = size;
        e3Var.isPortrait = i15 < i14;
        ViewGroup viewGroup = e3Var.containerView;
        if (viewGroup != null) {
            if (e3Var.fullWidth) {
                viewGroup.measure(View.MeasureSpec.makeMeasureSpec((e3Var.backgroundPaddingLeft * 2) + i15, 1073741824), View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE));
            } else {
                if (AndroidUtilities.isTablet()) {
                    float fDp = AndroidUtilities.dp(500.0f);
                    Point point = AndroidUtilities.displaySize;
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((e3Var.backgroundPaddingLeft * 2) + ((int) Math.min(fDp, Math.min(point.x, point.y) * 0.8f)), 1073741824);
                } else {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((e3Var.backgroundPaddingLeft * 2) + e3Var.getBottomSheetWidth(e3Var.isPortrait, i15, i14), 1073741824);
                }
                e3Var.containerView.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE));
            }
        }
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8 && childAt != e3Var.containerView) {
                if (childAt instanceof z60) {
                    measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(i15, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824), 0);
                } else if (!e3Var.onCustomMeasure(childAt, i15, i14)) {
                    measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(i15, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(i14, 1073741824), 0);
                }
            }
        }
    }

    @Override
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return false;
    }

    @Override
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        e3 e3Var = this.C;
        if (e3Var.dismissed || !e3Var.allowNestedScroll) {
            return;
        }
        a();
        float translationY = e3Var.containerView.getTranslationY();
        if (translationY <= 0.0f || i11 <= 0) {
            return;
        }
        float f10 = translationY - i11;
        iArr[1] = i11;
        e3Var.containerView.setTranslationY(f10 >= 0.0f ? f10 : 0.0f);
        e3Var.onContainerViewTranslation();
        e3Var.container.invalidate();
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        e3 e3Var = this.C;
        if (e3Var.dismissed || !e3Var.allowNestedScroll) {
            return;
        }
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

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f22812n.f4821a = i10;
        e3 e3Var = this.C;
        if (e3Var.dismissed || !e3Var.allowNestedScroll) {
            return;
        }
        a();
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        e3 e3Var = this.C;
        View view3 = e3Var.nestedScrollChild;
        return (view3 == null || view == view3) && !e3Var.dismissed && e3Var.allowNestedScroll && i10 == 2 && !e3Var.canDismissWithSwipe();
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f22812n.f4821a = 0;
        e3 e3Var = this.C;
        if (e3Var.dismissed || !e3Var.allowNestedScroll) {
            return;
        }
        b(0.0f, 0.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent, false);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.f22810e && !this.f22811f) {
            d(null, false);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}

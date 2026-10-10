package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class kj0 extends FrameLayout {
    public static final int R = 0;
    public boolean E;
    public is F;
    public vd0 G;
    public vd0 H;
    public org.telegram.ui.pc0 I;
    public ij0 J;
    public TextView K;
    public boolean L;
    public TLRPC.User M;
    public int N;
    public boolean O;
    public hj0 P;
    public org.telegram.ui.rc0 Q;
    public VelocityTracker f28050a;
    public int f28051b;
    public int f28052c;
    public int d;
    public boolean f28053e;
    public boolean f28054f;
    public AnimatorSet h;
    public Rect f28055n;
    public boolean f28056r;
    public AnimatorSet f28057s;
    public gj0 v;
    public boolean f28058w;
    public int f28059x;
    public int f28060y;

    public final void a() {
        gj0 gj0Var = this.v;
        if (this.f28056r) {
            return;
        }
        this.f28056r = true;
        AnimatorSet animatorSet = this.f28057s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f28057s = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f28057s = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(gj0Var, View.TRANSLATION_Y, AndroidUtilities.dp(10.0f) + gj0Var.getMeasuredHeight()));
        if (this.E) {
            float measuredHeight = gj0Var.getMeasuredHeight();
            this.f28057s.setDuration(Math.max(60, (int) (((measuredHeight - gj0Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.E = false;
        } else {
            this.f28057s.setDuration(250L);
        }
        this.f28057s.setInterpolator(is.f27443f);
        this.f28057s.addListener(new jj0(this, 2));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.f28057s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        float translationY;
        gj0 gj0Var = this.v;
        if (!this.f28056r) {
            if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f28054f && !this.f28053e && motionEvent.getPointerCount() == 1)) {
                this.f28051b = (int) motionEvent.getX();
                int y3 = (int) motionEvent.getY();
                this.f28052c = y3;
                if (y3 >= gj0Var.getTop() && this.f28051b >= gj0Var.getLeft() && this.f28051b <= gj0Var.getRight()) {
                    this.d = motionEvent.getPointerId(0);
                    this.f28053e = true;
                    AnimatorSet animatorSet = this.h;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.h = null;
                    }
                    VelocityTracker velocityTracker = this.f28050a;
                    if (velocityTracker != null) {
                        velocityTracker.clear();
                    }
                } else {
                    requestDisallowInterceptTouchEvent(true);
                    a();
                    return true;
                }
            } else {
                float f7 = 0.0f;
                if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    if (this.f28050a == null) {
                        this.f28050a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.f28051b));
                    float y10 = ((int) motionEvent.getY()) - this.f28052c;
                    this.f28050a.addMovement(motionEvent);
                    if (this.f28053e && !this.f28054f && y10 > 0.0f && y10 / 3.0f > Math.abs(abs) && Math.abs(y10) >= this.f28060y) {
                        this.f28052c = (int) motionEvent.getY();
                        this.f28053e = false;
                        this.f28054f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f28054f) {
                        float translationY2 = gj0Var.getTranslationY() + y10;
                        if (translationY2 >= 0.0f) {
                            f7 = translationY2;
                        }
                        gj0Var.setTranslationY(f7);
                        this.f28052c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f28050a == null) {
                        this.f28050a = VelocityTracker.obtain();
                    }
                    this.f28050a.computeCurrentVelocity(1000);
                    float translationY3 = gj0Var.getTranslationY();
                    if (!this.f28054f && translationY3 == 0.0f) {
                        this.f28053e = false;
                        this.f28054f = false;
                    } else {
                        float xVelocity = this.f28050a.getXVelocity();
                        float yVelocity = this.f28050a.getYVelocity();
                        if ((gj0Var.getTranslationY() < AndroidUtilities.getPixelsInCM(0.8f, false) && (yVelocity < 3500.0f || Math.abs(yVelocity) < Math.abs(xVelocity))) || (yVelocity < 0.0f && Math.abs(yVelocity) >= 3500.0f)) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.h = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(gj0Var, View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, translationY) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 150.0f));
                            this.h.setInterpolator(is.f27444g);
                            this.h.addListener(new jj0(this, 0));
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                            this.h.start();
                        } else {
                            this.E = true;
                            a();
                        }
                        this.f28054f = false;
                    }
                    VelocityTracker velocityTracker2 = this.f28050a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.f28050a = null;
                    }
                    this.d = -1;
                }
            }
            if ((!z10 && this.f28053e) || this.f28054f) {
                return true;
            }
        }
        return false;
    }

    public final void c(boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kj0.c(boolean):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f28056r) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public View getCustomView() {
        return this.P;
    }

    public boolean getRadiusSet() {
        return this.L;
    }

    public float getValue() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kj0.getValue():float");
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f28056r || b(motionEvent, true)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kj0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        getRootView();
        getWindowVisibleDisplayFrame(this.f28055n);
        setMeasuredDimension(size, size2);
        gj0 gj0Var = this.v;
        gj0Var.measure(View.MeasureSpec.makeMeasureSpec((this.f28059x * 2) + size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && childAt != gj0Var) {
                measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(size2, 1073741824), 0);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f28056r && !b(motionEvent, false)) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.f28053e && !this.f28054f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}

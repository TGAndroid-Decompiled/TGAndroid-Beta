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
public final class lj0 extends FrameLayout {
    public static final int R = 0;
    public boolean E;
    public js F;
    public yd0 G;
    public yd0 H;
    public org.telegram.ui.qc0 I;
    public jj0 J;
    public TextView K;
    public boolean L;
    public TLRPC.User M;
    public int N;
    public boolean O;
    public ij0 P;
    public org.telegram.ui.sc0 Q;
    public VelocityTracker f28211a;
    public int f28212b;
    public int f28213c;
    public int d;
    public boolean f28214e;
    public boolean f28215f;
    public AnimatorSet h;
    public Rect f28216n;
    public boolean f28217r;
    public AnimatorSet f28218s;
    public hj0 v;
    public boolean f28219w;
    public int f28220x;
    public int f28221y;

    public final void a() {
        hj0 hj0Var = this.v;
        if (this.f28217r) {
            return;
        }
        this.f28217r = true;
        AnimatorSet animatorSet = this.f28218s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f28218s = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f28218s = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(hj0Var, View.TRANSLATION_Y, AndroidUtilities.dp(10.0f) + hj0Var.getMeasuredHeight()));
        if (this.E) {
            float measuredHeight = hj0Var.getMeasuredHeight();
            this.f28218s.setDuration(Math.max(60, (int) (((measuredHeight - hj0Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.E = false;
        } else {
            this.f28218s.setDuration(250L);
        }
        this.f28218s.setInterpolator(js.f27627f);
        this.f28218s.addListener(new kj0(this, 2));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.f28218s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        float translationY;
        hj0 hj0Var = this.v;
        if (!this.f28217r) {
            if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f28215f && !this.f28214e && motionEvent.getPointerCount() == 1)) {
                this.f28212b = (int) motionEvent.getX();
                int y3 = (int) motionEvent.getY();
                this.f28213c = y3;
                if (y3 >= hj0Var.getTop() && this.f28212b >= hj0Var.getLeft() && this.f28212b <= hj0Var.getRight()) {
                    this.d = motionEvent.getPointerId(0);
                    this.f28214e = true;
                    AnimatorSet animatorSet = this.h;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.h = null;
                    }
                    VelocityTracker velocityTracker = this.f28211a;
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
                    if (this.f28211a == null) {
                        this.f28211a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.f28212b));
                    float y10 = ((int) motionEvent.getY()) - this.f28213c;
                    this.f28211a.addMovement(motionEvent);
                    if (this.f28214e && !this.f28215f && y10 > 0.0f && y10 / 3.0f > Math.abs(abs) && Math.abs(y10) >= this.f28221y) {
                        this.f28213c = (int) motionEvent.getY();
                        this.f28214e = false;
                        this.f28215f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f28215f) {
                        float translationY2 = hj0Var.getTranslationY() + y10;
                        if (translationY2 >= 0.0f) {
                            f7 = translationY2;
                        }
                        hj0Var.setTranslationY(f7);
                        this.f28213c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f28211a == null) {
                        this.f28211a = VelocityTracker.obtain();
                    }
                    this.f28211a.computeCurrentVelocity(1000);
                    float translationY3 = hj0Var.getTranslationY();
                    if (!this.f28215f && translationY3 == 0.0f) {
                        this.f28214e = false;
                        this.f28215f = false;
                    } else {
                        float xVelocity = this.f28211a.getXVelocity();
                        float yVelocity = this.f28211a.getYVelocity();
                        if ((hj0Var.getTranslationY() < AndroidUtilities.getPixelsInCM(0.8f, false) && (yVelocity < 3500.0f || Math.abs(yVelocity) < Math.abs(xVelocity))) || (yVelocity < 0.0f && Math.abs(yVelocity) >= 3500.0f)) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.h = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(hj0Var, View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, translationY) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 150.0f));
                            this.h.setInterpolator(js.f27628g);
                            this.h.addListener(new kj0(this, 0));
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                            this.h.start();
                        } else {
                            this.E = true;
                            a();
                        }
                        this.f28215f = false;
                    }
                    VelocityTracker velocityTracker2 = this.f28211a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.f28211a = null;
                    }
                    this.d = -1;
                }
            }
            if ((!z10 && this.f28214e) || this.f28215f) {
                return true;
            }
        }
        return false;
    }

    public final void c(boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lj0.c(boolean):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f28217r) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lj0.getValue():float");
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f28217r || b(motionEvent, true)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lj0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        getRootView();
        getWindowVisibleDisplayFrame(this.f28216n);
        setMeasuredDimension(size, size2);
        hj0 hj0Var = this.v;
        hj0Var.measure(View.MeasureSpec.makeMeasureSpec((this.f28220x * 2) + size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && childAt != hj0Var) {
                measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(size2, 1073741824), 0);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f28217r && !b(motionEvent, false)) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.f28214e && !this.f28215f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}

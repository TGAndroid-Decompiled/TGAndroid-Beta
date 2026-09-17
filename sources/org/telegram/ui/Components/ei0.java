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
public final class ei0 extends FrameLayout {
    public static final int R = 0;
    public boolean E;
    public pr F;
    public vc0 G;
    public vc0 H;
    public org.telegram.ui.qc0 I;
    public ci0 J;
    public TextView K;
    public boolean L;
    public TLRPC.User M;
    public int N;
    public boolean O;
    public bi0 P;
    public org.telegram.ui.sc0 Q;
    public VelocityTracker f25707a;
    public int f25708b;
    public int f25709c;
    public int d;
    public boolean f25710e;
    public boolean f25711f;
    public AnimatorSet h;
    public Rect f25712n;
    public boolean f25713r;
    public AnimatorSet f25714s;
    public ai0 v;
    public boolean f25715w;
    public int f25716x;
    public int f25717y;

    public final void a() {
        ai0 ai0Var = this.v;
        if (this.f25713r) {
            return;
        }
        this.f25713r = true;
        AnimatorSet animatorSet = this.f25714s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f25714s = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f25714s = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(ai0Var, View.TRANSLATION_Y, AndroidUtilities.dp(10.0f) + ai0Var.getMeasuredHeight()));
        if (this.E) {
            float measuredHeight = ai0Var.getMeasuredHeight();
            this.f25714s.setDuration(Math.max(60, (int) (((measuredHeight - ai0Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.E = false;
        } else {
            this.f25714s.setDuration(250L);
        }
        this.f25714s.setInterpolator(pr.f29467f);
        this.f25714s.addListener(new di0(this, 2));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.f25714s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        float translationY;
        ai0 ai0Var = this.v;
        if (!this.f25713r) {
            if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f25711f && !this.f25710e && motionEvent.getPointerCount() == 1)) {
                this.f25708b = (int) motionEvent.getX();
                int y3 = (int) motionEvent.getY();
                this.f25709c = y3;
                if (y3 >= ai0Var.getTop() && this.f25708b >= ai0Var.getLeft() && this.f25708b <= ai0Var.getRight()) {
                    this.d = motionEvent.getPointerId(0);
                    this.f25710e = true;
                    AnimatorSet animatorSet = this.h;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.h = null;
                    }
                    VelocityTracker velocityTracker = this.f25707a;
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
                    if (this.f25707a == null) {
                        this.f25707a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.f25708b));
                    float y10 = ((int) motionEvent.getY()) - this.f25709c;
                    this.f25707a.addMovement(motionEvent);
                    if (this.f25710e && !this.f25711f && y10 > 0.0f && y10 / 3.0f > Math.abs(abs) && Math.abs(y10) >= this.f25717y) {
                        this.f25709c = (int) motionEvent.getY();
                        this.f25710e = false;
                        this.f25711f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f25711f) {
                        float translationY2 = ai0Var.getTranslationY() + y10;
                        if (translationY2 >= 0.0f) {
                            f7 = translationY2;
                        }
                        ai0Var.setTranslationY(f7);
                        this.f25709c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f25707a == null) {
                        this.f25707a = VelocityTracker.obtain();
                    }
                    this.f25707a.computeCurrentVelocity(1000);
                    float translationY3 = ai0Var.getTranslationY();
                    if (!this.f25711f && translationY3 == 0.0f) {
                        this.f25710e = false;
                        this.f25711f = false;
                    } else {
                        float xVelocity = this.f25707a.getXVelocity();
                        float yVelocity = this.f25707a.getYVelocity();
                        if ((ai0Var.getTranslationY() < AndroidUtilities.getPixelsInCM(0.8f, false) && (yVelocity < 3500.0f || Math.abs(yVelocity) < Math.abs(xVelocity))) || (yVelocity < 0.0f && Math.abs(yVelocity) >= 3500.0f)) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.h = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(ai0Var, View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, translationY) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 150.0f));
                            this.h.setInterpolator(pr.f29468g);
                            this.h.addListener(new di0(this, 0));
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                            this.h.start();
                        } else {
                            this.E = true;
                            a();
                        }
                        this.f25711f = false;
                    }
                    VelocityTracker velocityTracker2 = this.f25707a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.f25707a = null;
                    }
                    this.d = -1;
                }
            }
            if ((!z10 && this.f25710e) || this.f25711f) {
                return true;
            }
        }
        return false;
    }

    public final void c(boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ei0.c(boolean):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f25713r) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ei0.getValue():float");
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f25713r || b(motionEvent, true)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ei0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        getRootView();
        getWindowVisibleDisplayFrame(this.f25712n);
        setMeasuredDimension(size, size2);
        ai0 ai0Var = this.v;
        ai0Var.measure(View.MeasureSpec.makeMeasureSpec((this.f25716x * 2) + size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && childAt != ai0Var) {
                measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(size2, 1073741824), 0);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f25713r && !b(motionEvent, false)) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.f25710e && !this.f25711f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}

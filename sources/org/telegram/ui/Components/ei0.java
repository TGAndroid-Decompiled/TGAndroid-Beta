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
    public VelocityTracker f25733a;
    public int f25734b;
    public int f25735c;
    public int d;
    public boolean f25736e;
    public boolean f25737f;
    public AnimatorSet h;
    public Rect f25738n;
    public boolean f25739r;
    public AnimatorSet f25740s;
    public ai0 v;
    public boolean f25741w;
    public int f25742x;
    public int f25743y;

    public final void a() {
        ai0 ai0Var = this.v;
        if (this.f25739r) {
            return;
        }
        this.f25739r = true;
        AnimatorSet animatorSet = this.f25740s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f25740s = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f25740s = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(ai0Var, View.TRANSLATION_Y, AndroidUtilities.dp(10.0f) + ai0Var.getMeasuredHeight()));
        if (this.E) {
            float measuredHeight = ai0Var.getMeasuredHeight();
            this.f25740s.setDuration(Math.max(60, (int) (((measuredHeight - ai0Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.E = false;
        } else {
            this.f25740s.setDuration(250L);
        }
        this.f25740s.setInterpolator(pr.f29493f);
        this.f25740s.addListener(new di0(this, 2));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.f25740s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        float translationY;
        ai0 ai0Var = this.v;
        if (!this.f25739r) {
            if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f25737f && !this.f25736e && motionEvent.getPointerCount() == 1)) {
                this.f25734b = (int) motionEvent.getX();
                int y3 = (int) motionEvent.getY();
                this.f25735c = y3;
                if (y3 >= ai0Var.getTop() && this.f25734b >= ai0Var.getLeft() && this.f25734b <= ai0Var.getRight()) {
                    this.d = motionEvent.getPointerId(0);
                    this.f25736e = true;
                    AnimatorSet animatorSet = this.h;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.h = null;
                    }
                    VelocityTracker velocityTracker = this.f25733a;
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
                    if (this.f25733a == null) {
                        this.f25733a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.f25734b));
                    float y10 = ((int) motionEvent.getY()) - this.f25735c;
                    this.f25733a.addMovement(motionEvent);
                    if (this.f25736e && !this.f25737f && y10 > 0.0f && y10 / 3.0f > Math.abs(abs) && Math.abs(y10) >= this.f25743y) {
                        this.f25735c = (int) motionEvent.getY();
                        this.f25736e = false;
                        this.f25737f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f25737f) {
                        float translationY2 = ai0Var.getTranslationY() + y10;
                        if (translationY2 >= 0.0f) {
                            f7 = translationY2;
                        }
                        ai0Var.setTranslationY(f7);
                        this.f25735c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f25733a == null) {
                        this.f25733a = VelocityTracker.obtain();
                    }
                    this.f25733a.computeCurrentVelocity(1000);
                    float translationY3 = ai0Var.getTranslationY();
                    if (!this.f25737f && translationY3 == 0.0f) {
                        this.f25736e = false;
                        this.f25737f = false;
                    } else {
                        float xVelocity = this.f25733a.getXVelocity();
                        float yVelocity = this.f25733a.getYVelocity();
                        if ((ai0Var.getTranslationY() < AndroidUtilities.getPixelsInCM(0.8f, false) && (yVelocity < 3500.0f || Math.abs(yVelocity) < Math.abs(xVelocity))) || (yVelocity < 0.0f && Math.abs(yVelocity) >= 3500.0f)) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.h = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(ai0Var, View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, translationY) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 150.0f));
                            this.h.setInterpolator(pr.f29494g);
                            this.h.addListener(new di0(this, 0));
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                            this.h.start();
                        } else {
                            this.E = true;
                            a();
                        }
                        this.f25737f = false;
                    }
                    VelocityTracker velocityTracker2 = this.f25733a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.f25733a = null;
                    }
                    this.d = -1;
                }
            }
            if ((!z10 && this.f25736e) || this.f25737f) {
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
        if (this.f25739r) {
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
        if (this.f25739r || b(motionEvent, true)) {
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
        getWindowVisibleDisplayFrame(this.f25738n);
        setMeasuredDimension(size, size2);
        ai0 ai0Var = this.v;
        ai0Var.measure(View.MeasureSpec.makeMeasureSpec((this.f25742x * 2) + size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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
        if (!this.f25739r && !b(motionEvent, false)) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.f25736e && !this.f25737f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}

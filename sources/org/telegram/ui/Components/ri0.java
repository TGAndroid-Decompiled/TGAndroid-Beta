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
public final class ri0 extends FrameLayout {
    public static final int R = 0;
    public boolean E;
    public tr F;
    public gd0 G;
    public gd0 H;
    public org.telegram.ui.oc0 I;
    public pi0 J;
    public TextView K;
    public boolean L;
    public TLRPC.User M;
    public int N;
    public boolean O;
    public oi0 P;
    public org.telegram.ui.qc0 Q;
    public VelocityTracker f30415a;
    public int f30416b;
    public int f30417c;
    public int d;
    public boolean f30418e;
    public boolean f30419f;
    public AnimatorSet h;
    public Rect f30420n;
    public boolean f30421r;
    public AnimatorSet f30422s;
    public ni0 v;
    public boolean f30423w;
    public int f30424x;
    public int f30425y;

    public final void a() {
        ni0 ni0Var = this.v;
        if (this.f30421r) {
            return;
        }
        this.f30421r = true;
        AnimatorSet animatorSet = this.f30422s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f30422s = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f30422s = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(ni0Var, View.TRANSLATION_Y, AndroidUtilities.dp(10.0f) + ni0Var.getMeasuredHeight()));
        if (this.E) {
            float measuredHeight = ni0Var.getMeasuredHeight();
            this.f30422s.setDuration(Math.max(60, (int) (((measuredHeight - ni0Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.E = false;
        } else {
            this.f30422s.setDuration(250L);
        }
        this.f30422s.setInterpolator(tr.f31147f);
        this.f30422s.addListener(new qi0(this, 2));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.f30422s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        float translationY;
        ni0 ni0Var = this.v;
        if (!this.f30421r) {
            if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f30419f && !this.f30418e && motionEvent.getPointerCount() == 1)) {
                this.f30416b = (int) motionEvent.getX();
                int y3 = (int) motionEvent.getY();
                this.f30417c = y3;
                if (y3 >= ni0Var.getTop() && this.f30416b >= ni0Var.getLeft() && this.f30416b <= ni0Var.getRight()) {
                    this.d = motionEvent.getPointerId(0);
                    this.f30418e = true;
                    AnimatorSet animatorSet = this.h;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.h = null;
                    }
                    VelocityTracker velocityTracker = this.f30415a;
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
                    if (this.f30415a == null) {
                        this.f30415a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.f30416b));
                    float y10 = ((int) motionEvent.getY()) - this.f30417c;
                    this.f30415a.addMovement(motionEvent);
                    if (this.f30418e && !this.f30419f && y10 > 0.0f && y10 / 3.0f > Math.abs(abs) && Math.abs(y10) >= this.f30425y) {
                        this.f30417c = (int) motionEvent.getY();
                        this.f30418e = false;
                        this.f30419f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f30419f) {
                        float translationY2 = ni0Var.getTranslationY() + y10;
                        if (translationY2 >= 0.0f) {
                            f7 = translationY2;
                        }
                        ni0Var.setTranslationY(f7);
                        this.f30417c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f30415a == null) {
                        this.f30415a = VelocityTracker.obtain();
                    }
                    this.f30415a.computeCurrentVelocity(1000);
                    float translationY3 = ni0Var.getTranslationY();
                    if (!this.f30419f && translationY3 == 0.0f) {
                        this.f30418e = false;
                        this.f30419f = false;
                    } else {
                        float xVelocity = this.f30415a.getXVelocity();
                        float yVelocity = this.f30415a.getYVelocity();
                        if ((ni0Var.getTranslationY() < AndroidUtilities.getPixelsInCM(0.8f, false) && (yVelocity < 3500.0f || Math.abs(yVelocity) < Math.abs(xVelocity))) || (yVelocity < 0.0f && Math.abs(yVelocity) >= 3500.0f)) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.h = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(ni0Var, View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, translationY) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 150.0f));
                            this.h.setInterpolator(tr.f31148g);
                            this.h.addListener(new qi0(this, 0));
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                            this.h.start();
                        } else {
                            this.E = true;
                            a();
                        }
                        this.f30419f = false;
                    }
                    VelocityTracker velocityTracker2 = this.f30415a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.f30415a = null;
                    }
                    this.d = -1;
                }
            }
            if ((!z10 && this.f30418e) || this.f30419f) {
                return true;
            }
        }
        return false;
    }

    public final void c(boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ri0.c(boolean):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f30421r) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ri0.getValue():float");
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f30421r || b(motionEvent, true)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ri0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        getRootView();
        getWindowVisibleDisplayFrame(this.f30420n);
        setMeasuredDimension(size, size2);
        ni0 ni0Var = this.v;
        ni0Var.measure(View.MeasureSpec.makeMeasureSpec((this.f30424x * 2) + size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && childAt != ni0Var) {
                measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(size2, 1073741824), 0);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f30421r && !b(motionEvent, false)) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.f30418e && !this.f30419f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}

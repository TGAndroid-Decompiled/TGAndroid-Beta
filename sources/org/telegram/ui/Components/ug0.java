package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class ug0 extends FrameLayout {
    public static final int S = 0;
    public int E;
    public boolean F;
    public lr G;
    public sb0 H;
    public sb0 I;
    public org.telegram.ui.ca0 J;
    public sg0 K;
    public TextView L;
    public boolean M;
    public TLRPC.User N;
    public int O;
    public boolean P;
    public rg0 Q;
    public org.telegram.ui.z90 R;
    public VelocityTracker f40341a;
    public int f40342b;
    public int f40343c;
    public int d;
    public boolean f40344e;
    public boolean f40345f;
    public AnimatorSet h;
    public Rect f40346n;
    public boolean f40347r;
    public AnimatorSet f40348s;
    public qg0 f40349w;
    public boolean f40350x;
    public int f40351y;

    public final void a() {
        qg0 qg0Var = this.f40349w;
        if (this.f40347r) {
            return;
        }
        this.f40347r = true;
        AnimatorSet animatorSet = this.f40348s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f40348s = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f40348s = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(qg0Var, View.TRANSLATION_Y, org.telegram.messenger.g0.L(10.0f) + qg0Var.getMeasuredHeight()));
        if (this.F) {
            float measuredHeight = qg0Var.getMeasuredHeight();
            this.f40348s.setDuration(Math.max(60, (int) (((measuredHeight - qg0Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.F = false;
        } else {
            this.f40348s.setDuration(250L);
        }
        this.f40348s.setInterpolator(lr.f37208f);
        this.f40348s.addListener(new tg0(this, 2));
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25137j1, 512);
        this.f40348s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        float translationY;
        qg0 qg0Var = this.f40349w;
        if (!this.f40347r) {
            if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f40345f && !this.f40344e && motionEvent.getPointerCount() == 1)) {
                this.f40342b = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                this.f40343c = y10;
                if (y10 >= qg0Var.getTop() && this.f40342b >= qg0Var.getLeft() && this.f40342b <= qg0Var.getRight()) {
                    this.d = motionEvent.getPointerId(0);
                    this.f40344e = true;
                    AnimatorSet animatorSet = this.h;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.h = null;
                    }
                    VelocityTracker velocityTracker = this.f40341a;
                    if (velocityTracker != null) {
                        velocityTracker.clear();
                    }
                } else {
                    requestDisallowInterceptTouchEvent(true);
                    a();
                    return true;
                }
            } else {
                float f10 = 0.0f;
                if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    if (this.f40341a == null) {
                        this.f40341a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.f40342b));
                    float y11 = ((int) motionEvent.getY()) - this.f40343c;
                    this.f40341a.addMovement(motionEvent);
                    if (this.f40344e && !this.f40345f && y11 > 0.0f && y11 / 3.0f > Math.abs(abs) && Math.abs(y11) >= this.E) {
                        this.f40343c = (int) motionEvent.getY();
                        this.f40344e = false;
                        this.f40345f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f40345f) {
                        float translationY2 = qg0Var.getTranslationY() + y11;
                        if (translationY2 >= 0.0f) {
                            f10 = translationY2;
                        }
                        qg0Var.setTranslationY(f10);
                        this.f40343c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f40341a == null) {
                        this.f40341a = VelocityTracker.obtain();
                    }
                    this.f40341a.computeCurrentVelocity(1000);
                    float translationY3 = qg0Var.getTranslationY();
                    if (!this.f40345f && translationY3 == 0.0f) {
                        this.f40344e = false;
                        this.f40345f = false;
                    } else {
                        float xVelocity = this.f40341a.getXVelocity();
                        float yVelocity = this.f40341a.getYVelocity();
                        if ((qg0Var.getTranslationY() < org.telegram.messenger.g0.a1(false, 0.8f) && (yVelocity < 3500.0f || Math.abs(yVelocity) < Math.abs(xVelocity))) || (yVelocity < 0.0f && Math.abs(yVelocity) >= 3500.0f)) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.h = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(qg0Var, View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, translationY) / org.telegram.messenger.g0.a1(false, 0.8f)) * 150.0f));
                            this.h.setInterpolator(lr.f37209g);
                            this.h.addListener(new tg0(this, 0));
                            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25137j1, 512);
                            this.h.start();
                        } else {
                            this.F = true;
                            a();
                        }
                        this.f40345f = false;
                    }
                    VelocityTracker velocityTracker2 = this.f40341a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.f40341a = null;
                    }
                    this.d = -1;
                }
            }
            if ((!z10 && this.f40344e) || this.f40345f) {
                return true;
            }
        }
        return false;
    }

    public final void c(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ug0.c(boolean):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f40347r) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public View getCustomView() {
        return this.Q;
    }

    public boolean getRadiusSet() {
        return this.M;
    }

    public float getValue() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ug0.getValue():float");
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f40347r || b(motionEvent, true)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ug0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        getRootView();
        getWindowVisibleDisplayFrame(this.f40346n);
        setMeasuredDimension(size, size2);
        qg0 qg0Var = this.f40349w;
        qg0Var.measure(View.MeasureSpec.makeMeasureSpec((this.f40351y * 2) + size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8 && childAt != qg0Var) {
                measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(size2, 1073741824), 0);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f40347r && !b(motionEvent, false)) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.f40344e && !this.f40345f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}

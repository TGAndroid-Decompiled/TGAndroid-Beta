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
public final class vg0 extends FrameLayout {
    public static final int S = 0;
    public int E;
    public boolean F;
    public kr G;
    public qb0 H;
    public qb0 I;
    public org.telegram.ui.ca0 J;
    public tg0 K;
    public TextView L;
    public boolean M;
    public TLRPC.User N;
    public int O;
    public boolean P;
    public sg0 Q;
    public org.telegram.ui.z90 R;
    public VelocityTracker f40690a;
    public int f40691b;
    public int f40692c;
    public int d;
    public boolean f40693e;
    public boolean f40694f;
    public AnimatorSet h;
    public Rect f40695n;
    public boolean f40696r;
    public AnimatorSet f40697s;
    public rg0 f40698w;
    public boolean f40699x;
    public int f40700y;

    public final void a() {
        rg0 rg0Var = this.f40698w;
        if (this.f40696r) {
            return;
        }
        this.f40696r = true;
        AnimatorSet animatorSet = this.f40697s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f40697s = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f40697s = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(rg0Var, View.TRANSLATION_Y, org.telegram.messenger.g0.L(10.0f) + rg0Var.getMeasuredHeight()));
        if (this.F) {
            float measuredHeight = rg0Var.getMeasuredHeight();
            this.f40697s.setDuration(Math.max(60, (int) (((measuredHeight - rg0Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.F = false;
        } else {
            this.f40697s.setDuration(250L);
        }
        this.f40697s.setInterpolator(kr.f36858f);
        this.f40697s.addListener(new ug0(this, 2));
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25234j1, 512);
        this.f40697s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        float translationY;
        rg0 rg0Var = this.f40698w;
        if (!this.f40696r) {
            if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f40694f && !this.f40693e && motionEvent.getPointerCount() == 1)) {
                this.f40691b = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                this.f40692c = y10;
                if (y10 >= rg0Var.getTop() && this.f40691b >= rg0Var.getLeft() && this.f40691b <= rg0Var.getRight()) {
                    this.d = motionEvent.getPointerId(0);
                    this.f40693e = true;
                    AnimatorSet animatorSet = this.h;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.h = null;
                    }
                    VelocityTracker velocityTracker = this.f40690a;
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
                    if (this.f40690a == null) {
                        this.f40690a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.f40691b));
                    float y11 = ((int) motionEvent.getY()) - this.f40692c;
                    this.f40690a.addMovement(motionEvent);
                    if (this.f40693e && !this.f40694f && y11 > 0.0f && y11 / 3.0f > Math.abs(abs) && Math.abs(y11) >= this.E) {
                        this.f40692c = (int) motionEvent.getY();
                        this.f40693e = false;
                        this.f40694f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f40694f) {
                        float translationY2 = rg0Var.getTranslationY() + y11;
                        if (translationY2 >= 0.0f) {
                            f10 = translationY2;
                        }
                        rg0Var.setTranslationY(f10);
                        this.f40692c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f40690a == null) {
                        this.f40690a = VelocityTracker.obtain();
                    }
                    this.f40690a.computeCurrentVelocity(1000);
                    float translationY3 = rg0Var.getTranslationY();
                    if (!this.f40694f && translationY3 == 0.0f) {
                        this.f40693e = false;
                        this.f40694f = false;
                    } else {
                        float xVelocity = this.f40690a.getXVelocity();
                        float yVelocity = this.f40690a.getYVelocity();
                        if ((rg0Var.getTranslationY() < org.telegram.messenger.g0.a1(false, 0.8f) && (yVelocity < 3500.0f || Math.abs(yVelocity) < Math.abs(xVelocity))) || (yVelocity < 0.0f && Math.abs(yVelocity) >= 3500.0f)) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.h = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(rg0Var, View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, translationY) / org.telegram.messenger.g0.a1(false, 0.8f)) * 150.0f));
                            this.h.setInterpolator(kr.f36859g);
                            this.h.addListener(new ug0(this, 0));
                            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25234j1, 512);
                            this.h.start();
                        } else {
                            this.F = true;
                            a();
                        }
                        this.f40694f = false;
                    }
                    VelocityTracker velocityTracker2 = this.f40690a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.f40690a = null;
                    }
                    this.d = -1;
                }
            }
            if ((!z10 && this.f40693e) || this.f40694f) {
                return true;
            }
        }
        return false;
    }

    public final void c(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vg0.c(boolean):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f40696r) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vg0.getValue():float");
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f40696r || b(motionEvent, true)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vg0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        getRootView();
        getWindowVisibleDisplayFrame(this.f40695n);
        setMeasuredDimension(size, size2);
        rg0 rg0Var = this.f40698w;
        rg0Var.measure(View.MeasureSpec.makeMeasureSpec((this.f40700y * 2) + size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8 && childAt != rg0Var) {
                measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(size2, 1073741824), 0);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f40696r && !b(motionEvent, false)) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.f40693e && !this.f40694f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}

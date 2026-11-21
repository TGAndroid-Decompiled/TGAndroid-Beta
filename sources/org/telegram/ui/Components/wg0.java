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
public final class wg0 extends FrameLayout {
    public static final int S = 0;
    public int E;
    public boolean F;
    public nr G;
    public tb0 H;
    public tb0 I;
    public org.telegram.ui.da0 J;
    public ug0 K;
    public TextView L;
    public boolean M;
    public TLRPC.User N;
    public int O;
    public boolean P;
    public tg0 Q;
    public org.telegram.ui.aa0 R;
    public VelocityTracker f41814a;
    public int f41815b;
    public int f41816c;
    public int d;
    public boolean f41817e;
    public boolean f41818f;
    public AnimatorSet h;
    public Rect f41819n;
    public boolean f41820r;
    public AnimatorSet f41821s;
    public sg0 f41822w;
    public boolean f41823x;
    public int f41824y;

    public final void a() {
        sg0 sg0Var = this.f41822w;
        if (this.f41820r) {
            return;
        }
        this.f41820r = true;
        AnimatorSet animatorSet = this.f41821s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f41821s = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f41821s = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(sg0Var, View.TRANSLATION_Y, org.telegram.messenger.g0.L(10.0f) + sg0Var.getMeasuredHeight()));
        if (this.F) {
            float measuredHeight = sg0Var.getMeasuredHeight();
            this.f41821s.setDuration(Math.max(60, (int) (((measuredHeight - sg0Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.F = false;
        } else {
            this.f41821s.setDuration(250L);
        }
        this.f41821s.setInterpolator(nr.f37956f);
        this.f41821s.addListener(new vg0(this, 2));
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25163j1, 512);
        this.f41821s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        float translationY;
        sg0 sg0Var = this.f41822w;
        if (!this.f41820r) {
            if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f41818f && !this.f41817e && motionEvent.getPointerCount() == 1)) {
                this.f41815b = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                this.f41816c = y10;
                if (y10 >= sg0Var.getTop() && this.f41815b >= sg0Var.getLeft() && this.f41815b <= sg0Var.getRight()) {
                    this.d = motionEvent.getPointerId(0);
                    this.f41817e = true;
                    AnimatorSet animatorSet = this.h;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.h = null;
                    }
                    VelocityTracker velocityTracker = this.f41814a;
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
                    if (this.f41814a == null) {
                        this.f41814a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.f41815b));
                    float y11 = ((int) motionEvent.getY()) - this.f41816c;
                    this.f41814a.addMovement(motionEvent);
                    if (this.f41817e && !this.f41818f && y11 > 0.0f && y11 / 3.0f > Math.abs(abs) && Math.abs(y11) >= this.E) {
                        this.f41816c = (int) motionEvent.getY();
                        this.f41817e = false;
                        this.f41818f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f41818f) {
                        float translationY2 = sg0Var.getTranslationY() + y11;
                        if (translationY2 >= 0.0f) {
                            f10 = translationY2;
                        }
                        sg0Var.setTranslationY(f10);
                        this.f41816c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f41814a == null) {
                        this.f41814a = VelocityTracker.obtain();
                    }
                    this.f41814a.computeCurrentVelocity(1000);
                    float translationY3 = sg0Var.getTranslationY();
                    if (!this.f41818f && translationY3 == 0.0f) {
                        this.f41817e = false;
                        this.f41818f = false;
                    } else {
                        float xVelocity = this.f41814a.getXVelocity();
                        float yVelocity = this.f41814a.getYVelocity();
                        if ((sg0Var.getTranslationY() < org.telegram.messenger.g0.a1(false, 0.8f) && (yVelocity < 3500.0f || Math.abs(yVelocity) < Math.abs(xVelocity))) || (yVelocity < 0.0f && Math.abs(yVelocity) >= 3500.0f)) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.h = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(sg0Var, View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, translationY) / org.telegram.messenger.g0.a1(false, 0.8f)) * 150.0f));
                            this.h.setInterpolator(nr.f37957g);
                            this.h.addListener(new vg0(this, 0));
                            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25163j1, 512);
                            this.h.start();
                        } else {
                            this.F = true;
                            a();
                        }
                        this.f41818f = false;
                    }
                    VelocityTracker velocityTracker2 = this.f41814a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.f41814a = null;
                    }
                    this.d = -1;
                }
            }
            if ((!z10 && this.f41817e) || this.f41818f) {
                return true;
            }
        }
        return false;
    }

    public final void c(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wg0.c(boolean):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f41820r) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wg0.getValue():float");
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f41820r || b(motionEvent, true)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wg0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        getRootView();
        getWindowVisibleDisplayFrame(this.f41819n);
        setMeasuredDimension(size, size2);
        sg0 sg0Var = this.f41822w;
        sg0Var.measure(View.MeasureSpec.makeMeasureSpec((this.f41824y * 2) + size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8 && childAt != sg0Var) {
                measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(size2, 1073741824), 0);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f41820r && !b(motionEvent, false)) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.f41817e && !this.f41818f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}

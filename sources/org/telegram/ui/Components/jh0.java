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
public final class jh0 extends FrameLayout {
    public static final int R = 0;
    public int D;
    public boolean E;
    public gr F;
    public ac0 G;
    public ac0 H;
    public org.telegram.ui.fb0 I;
    public hh0 J;
    public TextView K;
    public boolean L;
    public TLRPC.User M;
    public int N;
    public boolean O;
    public gh0 P;
    public org.telegram.ui.cb0 Q;
    public VelocityTracker f27378a;
    public int f27379b;
    public int f27380c;
    public int d;
    public boolean e;
    public boolean f27381f;
    public AnimatorSet h;
    public Rect f27382n;
    public boolean f27383r;
    public AnimatorSet f27384s;
    public fh0 f27385w;
    public boolean f27386x;
    public int f27387y;

    public final void a() {
        fh0 fh0Var = this.f27385w;
        if (this.f27383r) {
            return;
        }
        this.f27383r = true;
        AnimatorSet animatorSet = this.f27384s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f27384s = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f27384s = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(fh0Var, View.TRANSLATION_Y, org.telegram.messenger.i0.L(10.0f) + fh0Var.getMeasuredHeight()));
        if (this.E) {
            float measuredHeight = fh0Var.getMeasuredHeight();
            this.f27384s.setDuration(Math.max(60, (int) (((measuredHeight - fh0Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.E = false;
        } else {
            this.f27384s.setDuration(250L);
        }
        this.f27384s.setInterpolator(gr.f26495f);
        this.f27384s.addListener(new ih0(this, 2));
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.f19633j1, 512);
        this.f27384s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        float translationY;
        fh0 fh0Var = this.f27385w;
        if (!this.f27383r) {
            if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f27381f && !this.e && motionEvent.getPointerCount() == 1)) {
                this.f27379b = (int) motionEvent.getX();
                int y3 = (int) motionEvent.getY();
                this.f27380c = y3;
                if (y3 >= fh0Var.getTop() && this.f27379b >= fh0Var.getLeft() && this.f27379b <= fh0Var.getRight()) {
                    this.d = motionEvent.getPointerId(0);
                    this.e = true;
                    AnimatorSet animatorSet = this.h;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.h = null;
                    }
                    VelocityTracker velocityTracker = this.f27378a;
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
                    if (this.f27378a == null) {
                        this.f27378a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.f27379b));
                    float y10 = ((int) motionEvent.getY()) - this.f27380c;
                    this.f27378a.addMovement(motionEvent);
                    if (this.e && !this.f27381f && y10 > 0.0f && y10 / 3.0f > Math.abs(abs) && Math.abs(y10) >= this.D) {
                        this.f27380c = (int) motionEvent.getY();
                        this.e = false;
                        this.f27381f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f27381f) {
                        float translationY2 = fh0Var.getTranslationY() + y10;
                        if (translationY2 >= 0.0f) {
                            f7 = translationY2;
                        }
                        fh0Var.setTranslationY(f7);
                        this.f27380c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f27378a == null) {
                        this.f27378a = VelocityTracker.obtain();
                    }
                    this.f27378a.computeCurrentVelocity(1000);
                    float translationY3 = fh0Var.getTranslationY();
                    if (!this.f27381f && translationY3 == 0.0f) {
                        this.e = false;
                        this.f27381f = false;
                    } else {
                        float xVelocity = this.f27378a.getXVelocity();
                        float yVelocity = this.f27378a.getYVelocity();
                        if ((fh0Var.getTranslationY() < org.telegram.messenger.i0.a1(false, 0.8f) && (yVelocity < 3500.0f || Math.abs(yVelocity) < Math.abs(xVelocity))) || (yVelocity < 0.0f && Math.abs(yVelocity) >= 3500.0f)) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.h = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(fh0Var, View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, translationY) / org.telegram.messenger.i0.a1(false, 0.8f)) * 150.0f));
                            this.h.setInterpolator(gr.f26496g);
                            this.h.addListener(new ih0(this, 0));
                            org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.f19633j1, 512);
                            this.h.start();
                        } else {
                            this.E = true;
                            a();
                        }
                        this.f27381f = false;
                    }
                    VelocityTracker velocityTracker2 = this.f27378a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.f27378a = null;
                    }
                    this.d = -1;
                }
            }
            if ((!z10 && this.e) || this.f27381f) {
                return true;
            }
        }
        return false;
    }

    public final void c(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jh0.c(boolean):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f27383r) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jh0.getValue():float");
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f27383r || b(motionEvent, true)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jh0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        getRootView();
        getWindowVisibleDisplayFrame(this.f27382n);
        setMeasuredDimension(size, size2);
        fh0 fh0Var = this.f27385w;
        fh0Var.measure(View.MeasureSpec.makeMeasureSpec((this.f27387y * 2) + size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && childAt != fh0Var) {
                measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(size2, 1073741824), 0);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f27383r && !b(motionEvent, false)) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.e && !this.f27381f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}

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
public final class kh0 extends FrameLayout {
    public static final int R = 0;
    public int D;
    public boolean E;
    public gr F;
    public ac0 G;
    public ac0 H;
    public org.telegram.ui.eb0 I;
    public ih0 J;
    public TextView K;
    public boolean L;
    public TLRPC.User M;
    public int N;
    public boolean O;
    public hh0 P;
    public org.telegram.ui.bb0 Q;
    public VelocityTracker f27846a;
    public int f27847b;
    public int f27848c;
    public int d;
    public boolean e;
    public boolean f27849f;
    public AnimatorSet h;
    public Rect f27850n;
    public boolean f27851r;
    public AnimatorSet f27852s;
    public gh0 f27853w;
    public boolean f27854x;
    public int f27855y;

    public final void a() {
        gh0 gh0Var = this.f27853w;
        if (this.f27851r) {
            return;
        }
        this.f27851r = true;
        AnimatorSet animatorSet = this.f27852s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f27852s = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f27852s = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(gh0Var, View.TRANSLATION_Y, org.telegram.messenger.i0.L(10.0f) + gh0Var.getMeasuredHeight()));
        if (this.E) {
            float measuredHeight = gh0Var.getMeasuredHeight();
            this.f27852s.setDuration(Math.max(60, (int) (((measuredHeight - gh0Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.E = false;
        } else {
            this.f27852s.setDuration(250L);
        }
        this.f27852s.setInterpolator(gr.f26523f);
        this.f27852s.addListener(new jh0(this, 2));
        org.telegram.messenger.at.e().k(org.telegram.messenger.at.f14729j1, 512);
        this.f27852s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        float translationY;
        gh0 gh0Var = this.f27853w;
        if (!this.f27851r) {
            if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f27849f && !this.e && motionEvent.getPointerCount() == 1)) {
                this.f27847b = (int) motionEvent.getX();
                int y3 = (int) motionEvent.getY();
                this.f27848c = y3;
                if (y3 >= gh0Var.getTop() && this.f27847b >= gh0Var.getLeft() && this.f27847b <= gh0Var.getRight()) {
                    this.d = motionEvent.getPointerId(0);
                    this.e = true;
                    AnimatorSet animatorSet = this.h;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.h = null;
                    }
                    VelocityTracker velocityTracker = this.f27846a;
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
                    if (this.f27846a == null) {
                        this.f27846a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.f27847b));
                    float y10 = ((int) motionEvent.getY()) - this.f27848c;
                    this.f27846a.addMovement(motionEvent);
                    if (this.e && !this.f27849f && y10 > 0.0f && y10 / 3.0f > Math.abs(abs) && Math.abs(y10) >= this.D) {
                        this.f27848c = (int) motionEvent.getY();
                        this.e = false;
                        this.f27849f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f27849f) {
                        float translationY2 = gh0Var.getTranslationY() + y10;
                        if (translationY2 >= 0.0f) {
                            f7 = translationY2;
                        }
                        gh0Var.setTranslationY(f7);
                        this.f27848c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f27846a == null) {
                        this.f27846a = VelocityTracker.obtain();
                    }
                    this.f27846a.computeCurrentVelocity(1000);
                    float translationY3 = gh0Var.getTranslationY();
                    if (!this.f27849f && translationY3 == 0.0f) {
                        this.e = false;
                        this.f27849f = false;
                    } else {
                        float xVelocity = this.f27846a.getXVelocity();
                        float yVelocity = this.f27846a.getYVelocity();
                        if ((gh0Var.getTranslationY() < org.telegram.messenger.i0.a1(false, 0.8f) && (yVelocity < 3500.0f || Math.abs(yVelocity) < Math.abs(xVelocity))) || (yVelocity < 0.0f && Math.abs(yVelocity) >= 3500.0f)) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.h = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(gh0Var, View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, translationY) / org.telegram.messenger.i0.a1(false, 0.8f)) * 150.0f));
                            this.h.setInterpolator(gr.f26524g);
                            this.h.addListener(new jh0(this, 0));
                            org.telegram.messenger.at.e().k(org.telegram.messenger.at.f14729j1, 512);
                            this.h.start();
                        } else {
                            this.E = true;
                            a();
                        }
                        this.f27849f = false;
                    }
                    VelocityTracker velocityTracker2 = this.f27846a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.f27846a = null;
                    }
                    this.d = -1;
                }
            }
            if ((!z10 && this.e) || this.f27849f) {
                return true;
            }
        }
        return false;
    }

    public final void c(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kh0.c(boolean):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f27851r) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kh0.getValue():float");
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f27851r || b(motionEvent, true)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kh0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        getRootView();
        getWindowVisibleDisplayFrame(this.f27850n);
        setMeasuredDimension(size, size2);
        gh0 gh0Var = this.f27853w;
        gh0Var.measure(View.MeasureSpec.makeMeasureSpec((this.f27855y * 2) + size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && childAt != gh0Var) {
                measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(size2, 1073741824), 0);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f27851r && !b(motionEvent, false)) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.e && !this.f27849f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}

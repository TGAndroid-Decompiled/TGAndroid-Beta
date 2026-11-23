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
    public VelocityTracker f41807a;
    public int f41808b;
    public int f41809c;
    public int d;
    public boolean f41810e;
    public boolean f41811f;
    public AnimatorSet h;
    public Rect f41812n;
    public boolean f41813r;
    public AnimatorSet f41814s;
    public sg0 f41815w;
    public boolean f41816x;
    public int f41817y;

    public final void a() {
        sg0 sg0Var = this.f41815w;
        if (this.f41813r) {
            return;
        }
        this.f41813r = true;
        AnimatorSet animatorSet = this.f41814s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f41814s = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f41814s = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(sg0Var, View.TRANSLATION_Y, org.telegram.messenger.g0.L(10.0f) + sg0Var.getMeasuredHeight()));
        if (this.F) {
            float measuredHeight = sg0Var.getMeasuredHeight();
            this.f41814s.setDuration(Math.max(60, (int) (((measuredHeight - sg0Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.F = false;
        } else {
            this.f41814s.setDuration(250L);
        }
        this.f41814s.setInterpolator(nr.f37960f);
        this.f41814s.addListener(new vg0(this, 2));
        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.f25329j1, 512);
        this.f41814s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        float translationY;
        sg0 sg0Var = this.f41815w;
        if (!this.f41813r) {
            if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f41811f && !this.f41810e && motionEvent.getPointerCount() == 1)) {
                this.f41808b = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                this.f41809c = y10;
                if (y10 >= sg0Var.getTop() && this.f41808b >= sg0Var.getLeft() && this.f41808b <= sg0Var.getRight()) {
                    this.d = motionEvent.getPointerId(0);
                    this.f41810e = true;
                    AnimatorSet animatorSet = this.h;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.h = null;
                    }
                    VelocityTracker velocityTracker = this.f41807a;
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
                    if (this.f41807a == null) {
                        this.f41807a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.f41808b));
                    float y11 = ((int) motionEvent.getY()) - this.f41809c;
                    this.f41807a.addMovement(motionEvent);
                    if (this.f41810e && !this.f41811f && y11 > 0.0f && y11 / 3.0f > Math.abs(abs) && Math.abs(y11) >= this.E) {
                        this.f41809c = (int) motionEvent.getY();
                        this.f41810e = false;
                        this.f41811f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f41811f) {
                        float translationY2 = sg0Var.getTranslationY() + y11;
                        if (translationY2 >= 0.0f) {
                            f10 = translationY2;
                        }
                        sg0Var.setTranslationY(f10);
                        this.f41809c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f41807a == null) {
                        this.f41807a = VelocityTracker.obtain();
                    }
                    this.f41807a.computeCurrentVelocity(1000);
                    float translationY3 = sg0Var.getTranslationY();
                    if (!this.f41811f && translationY3 == 0.0f) {
                        this.f41810e = false;
                        this.f41811f = false;
                    } else {
                        float xVelocity = this.f41807a.getXVelocity();
                        float yVelocity = this.f41807a.getYVelocity();
                        if ((sg0Var.getTranslationY() < org.telegram.messenger.g0.a1(false, 0.8f) && (yVelocity < 3500.0f || Math.abs(yVelocity) < Math.abs(xVelocity))) || (yVelocity < 0.0f && Math.abs(yVelocity) >= 3500.0f)) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.h = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(sg0Var, View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, translationY) / org.telegram.messenger.g0.a1(false, 0.8f)) * 150.0f));
                            this.h.setInterpolator(nr.f37961g);
                            this.h.addListener(new vg0(this, 0));
                            org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.f25329j1, 512);
                            this.h.start();
                        } else {
                            this.F = true;
                            a();
                        }
                        this.f41811f = false;
                    }
                    VelocityTracker velocityTracker2 = this.f41807a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.f41807a = null;
                    }
                    this.d = -1;
                }
            }
            if ((!z10 && this.f41810e) || this.f41811f) {
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
        if (this.f41813r) {
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
        if (this.f41813r || b(motionEvent, true)) {
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
        getWindowVisibleDisplayFrame(this.f41812n);
        setMeasuredDimension(size, size2);
        sg0 sg0Var = this.f41815w;
        sg0Var.measure(View.MeasureSpec.makeMeasureSpec((this.f41817y * 2) + size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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
        if (!this.f41813r && !b(motionEvent, false)) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.f41810e && !this.f41811f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}

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
public final class hg0 extends FrameLayout {
    public static final int R = 0;
    public int D;
    public boolean E;
    public xq F;
    public hb0 G;
    public hb0 H;
    public org.telegram.ui.aa0 I;
    public fg0 J;
    public TextView K;
    public boolean L;
    public TLRPC.User M;
    public int N;
    public boolean O;
    public eg0 P;
    public org.telegram.ui.x90 Q;
    public VelocityTracker f34253a;
    public int f34254b;
    public int f34255c;
    public int d;
    public boolean f34256e;
    public boolean f34257f;
    public AnimatorSet h;
    public Rect f34258n;
    public boolean f34259r;
    public AnimatorSet f34260s;
    public dg0 f34261w;
    public boolean f34262x;
    public int f34263y;

    public final void a() {
        dg0 dg0Var = this.f34261w;
        if (this.f34259r) {
            return;
        }
        this.f34259r = true;
        AnimatorSet animatorSet = this.f34260s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f34260s = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f34260s = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(dg0Var, View.TRANSLATION_Y, org.telegram.messenger.g0.L(10.0f) + dg0Var.getMeasuredHeight()));
        if (this.E) {
            float measuredHeight = dg0Var.getMeasuredHeight();
            this.f34260s.setDuration(Math.max(60, (int) (((measuredHeight - dg0Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.E = false;
        } else {
            this.f34260s.setDuration(250L);
        }
        this.f34260s.setInterpolator(xq.f40366f);
        this.f34260s.addListener(new gg0(this, 2));
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25021j1, 512);
        this.f34260s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z9) {
        float translationY;
        dg0 dg0Var = this.f34261w;
        if (!this.f34259r) {
            if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f34257f && !this.f34256e && motionEvent.getPointerCount() == 1)) {
                this.f34254b = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                this.f34255c = y10;
                if (y10 >= dg0Var.getTop() && this.f34254b >= dg0Var.getLeft() && this.f34254b <= dg0Var.getRight()) {
                    this.d = motionEvent.getPointerId(0);
                    this.f34256e = true;
                    AnimatorSet animatorSet = this.h;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.h = null;
                    }
                    VelocityTracker velocityTracker = this.f34253a;
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
                    if (this.f34253a == null) {
                        this.f34253a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.f34254b));
                    float y11 = ((int) motionEvent.getY()) - this.f34255c;
                    this.f34253a.addMovement(motionEvent);
                    if (this.f34256e && !this.f34257f && y11 > 0.0f && y11 / 3.0f > Math.abs(abs) && Math.abs(y11) >= this.D) {
                        this.f34255c = (int) motionEvent.getY();
                        this.f34256e = false;
                        this.f34257f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f34257f) {
                        float translationY2 = dg0Var.getTranslationY() + y11;
                        if (translationY2 >= 0.0f) {
                            f10 = translationY2;
                        }
                        dg0Var.setTranslationY(f10);
                        this.f34255c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f34253a == null) {
                        this.f34253a = VelocityTracker.obtain();
                    }
                    this.f34253a.computeCurrentVelocity(1000);
                    float translationY3 = dg0Var.getTranslationY();
                    if (!this.f34257f && translationY3 == 0.0f) {
                        this.f34256e = false;
                        this.f34257f = false;
                    } else {
                        float xVelocity = this.f34253a.getXVelocity();
                        float yVelocity = this.f34253a.getYVelocity();
                        if ((dg0Var.getTranslationY() < org.telegram.messenger.g0.a1(false, 0.8f) && (yVelocity < 3500.0f || Math.abs(yVelocity) < Math.abs(xVelocity))) || (yVelocity < 0.0f && Math.abs(yVelocity) >= 3500.0f)) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.h = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(dg0Var, View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, translationY) / org.telegram.messenger.g0.a1(false, 0.8f)) * 150.0f));
                            this.h.setInterpolator(xq.f40367g);
                            this.h.addListener(new gg0(this, 0));
                            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25021j1, 512);
                            this.h.start();
                        } else {
                            this.E = true;
                            a();
                        }
                        this.f34257f = false;
                    }
                    VelocityTracker velocityTracker2 = this.f34253a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.f34253a = null;
                    }
                    this.d = -1;
                }
            }
            if ((!z9 && this.f34256e) || this.f34257f) {
                return true;
            }
        }
        return false;
    }

    public final void c(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hg0.c(boolean):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f34259r) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hg0.getValue():float");
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f34259r || b(motionEvent, true)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hg0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        getRootView();
        getWindowVisibleDisplayFrame(this.f34258n);
        setMeasuredDimension(size, size2);
        dg0 dg0Var = this.f34261w;
        dg0Var.measure(View.MeasureSpec.makeMeasureSpec((this.f34263y * 2) + size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8 && childAt != dg0Var) {
                measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(size2, 1073741824), 0);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f34259r && !b(motionEvent, false)) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        if (this.f34256e && !this.f34257f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z9);
    }
}

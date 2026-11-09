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
public final class ig0 extends FrameLayout {
    public static final int R = 0;
    public int D;
    public boolean E;
    public xq F;
    public ib0 G;
    public ib0 H;
    public org.telegram.ui.ca0 I;
    public gg0 J;
    public TextView K;
    public boolean L;
    public TLRPC.User M;
    public int N;
    public boolean O;
    public fg0 P;
    public org.telegram.ui.z90 Q;
    public VelocityTracker f34737a;
    public int f34738b;
    public int f34739c;
    public int d;
    public boolean f34740e;
    public boolean f34741f;
    public AnimatorSet h;
    public Rect f34742n;
    public boolean f34743r;
    public AnimatorSet f34744s;
    public eg0 f34745w;
    public boolean f34746x;
    public int f34747y;

    public final void a() {
        eg0 eg0Var = this.f34745w;
        if (this.f34743r) {
            return;
        }
        this.f34743r = true;
        AnimatorSet animatorSet = this.f34744s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f34744s = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f34744s = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(eg0Var, View.TRANSLATION_Y, org.telegram.messenger.g0.L(10.0f) + eg0Var.getMeasuredHeight()));
        if (this.E) {
            float measuredHeight = eg0Var.getMeasuredHeight();
            this.f34744s.setDuration(Math.max(60, (int) (((measuredHeight - eg0Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.E = false;
        } else {
            this.f34744s.setDuration(250L);
        }
        this.f34744s.setInterpolator(xq.f40458f);
        this.f34744s.addListener(new hg0(this, 2));
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25021j1, 512);
        this.f34744s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z9) {
        float translationY;
        eg0 eg0Var = this.f34745w;
        if (!this.f34743r) {
            if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f34741f && !this.f34740e && motionEvent.getPointerCount() == 1)) {
                this.f34738b = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                this.f34739c = y10;
                if (y10 >= eg0Var.getTop() && this.f34738b >= eg0Var.getLeft() && this.f34738b <= eg0Var.getRight()) {
                    this.d = motionEvent.getPointerId(0);
                    this.f34740e = true;
                    AnimatorSet animatorSet = this.h;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.h = null;
                    }
                    VelocityTracker velocityTracker = this.f34737a;
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
                    if (this.f34737a == null) {
                        this.f34737a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.f34738b));
                    float y11 = ((int) motionEvent.getY()) - this.f34739c;
                    this.f34737a.addMovement(motionEvent);
                    if (this.f34740e && !this.f34741f && y11 > 0.0f && y11 / 3.0f > Math.abs(abs) && Math.abs(y11) >= this.D) {
                        this.f34739c = (int) motionEvent.getY();
                        this.f34740e = false;
                        this.f34741f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f34741f) {
                        float translationY2 = eg0Var.getTranslationY() + y11;
                        if (translationY2 >= 0.0f) {
                            f10 = translationY2;
                        }
                        eg0Var.setTranslationY(f10);
                        this.f34739c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f34737a == null) {
                        this.f34737a = VelocityTracker.obtain();
                    }
                    this.f34737a.computeCurrentVelocity(1000);
                    float translationY3 = eg0Var.getTranslationY();
                    if (!this.f34741f && translationY3 == 0.0f) {
                        this.f34740e = false;
                        this.f34741f = false;
                    } else {
                        float xVelocity = this.f34737a.getXVelocity();
                        float yVelocity = this.f34737a.getYVelocity();
                        if ((eg0Var.getTranslationY() < org.telegram.messenger.g0.a1(false, 0.8f) && (yVelocity < 3500.0f || Math.abs(yVelocity) < Math.abs(xVelocity))) || (yVelocity < 0.0f && Math.abs(yVelocity) >= 3500.0f)) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.h = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(eg0Var, View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, translationY) / org.telegram.messenger.g0.a1(false, 0.8f)) * 150.0f));
                            this.h.setInterpolator(xq.f40459g);
                            this.h.addListener(new hg0(this, 0));
                            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25021j1, 512);
                            this.h.start();
                        } else {
                            this.E = true;
                            a();
                        }
                        this.f34741f = false;
                    }
                    VelocityTracker velocityTracker2 = this.f34737a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.f34737a = null;
                    }
                    this.d = -1;
                }
            }
            if ((!z9 && this.f34740e) || this.f34741f) {
                return true;
            }
        }
        return false;
    }

    public final void c(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ig0.c(boolean):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f34743r) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ig0.getValue():float");
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f34743r || b(motionEvent, true)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ig0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        getRootView();
        getWindowVisibleDisplayFrame(this.f34742n);
        setMeasuredDimension(size, size2);
        eg0 eg0Var = this.f34745w;
        eg0Var.measure(View.MeasureSpec.makeMeasureSpec((this.f34747y * 2) + size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8 && childAt != eg0Var) {
                measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(size2, 1073741824), 0);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f34743r && !b(motionEvent, false)) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        if (this.f34740e && !this.f34741f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z9);
    }
}

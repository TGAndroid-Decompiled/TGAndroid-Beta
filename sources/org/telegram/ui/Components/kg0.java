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
public final class kg0 extends FrameLayout {
    public static final int S = 0;
    public int E;
    public boolean F;
    public er G;
    public ib0 H;
    public ib0 I;
    public org.telegram.ui.ba0 J;
    public ig0 K;
    public TextView L;
    public boolean M;
    public TLRPC.User N;
    public int O;
    public boolean P;
    public hg0 Q;
    public org.telegram.ui.y90 R;
    public VelocityTracker f36408a;
    public int f36409b;
    public int f36410c;
    public int d;
    public boolean f36411e;
    public boolean f36412f;
    public AnimatorSet h;
    public Rect f36413n;
    public boolean f36414r;
    public AnimatorSet f36415s;
    public gg0 f36416w;
    public boolean f36417x;
    public int f36418y;

    public final void a() {
        gg0 gg0Var = this.f36416w;
        if (this.f36414r) {
            return;
        }
        this.f36414r = true;
        AnimatorSet animatorSet = this.f36415s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f36415s = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f36415s = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(gg0Var, View.TRANSLATION_Y, org.telegram.messenger.g0.L(10.0f) + gg0Var.getMeasuredHeight()));
        if (this.F) {
            float measuredHeight = gg0Var.getMeasuredHeight();
            this.f36415s.setDuration(Math.max(60, (int) (((measuredHeight - gg0Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.F = false;
        } else {
            this.f36415s.setDuration(250L);
        }
        this.f36415s.setInterpolator(er.f34419f);
        this.f36415s.addListener(new jg0(this, 2));
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25518j1, 512);
        this.f36415s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        float translationY;
        gg0 gg0Var = this.f36416w;
        if (!this.f36414r) {
            if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f36412f && !this.f36411e && motionEvent.getPointerCount() == 1)) {
                this.f36409b = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                this.f36410c = y10;
                if (y10 >= gg0Var.getTop() && this.f36409b >= gg0Var.getLeft() && this.f36409b <= gg0Var.getRight()) {
                    this.d = motionEvent.getPointerId(0);
                    this.f36411e = true;
                    AnimatorSet animatorSet = this.h;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.h = null;
                    }
                    VelocityTracker velocityTracker = this.f36408a;
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
                    if (this.f36408a == null) {
                        this.f36408a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.f36409b));
                    float y11 = ((int) motionEvent.getY()) - this.f36410c;
                    this.f36408a.addMovement(motionEvent);
                    if (this.f36411e && !this.f36412f && y11 > 0.0f && y11 / 3.0f > Math.abs(abs) && Math.abs(y11) >= this.E) {
                        this.f36410c = (int) motionEvent.getY();
                        this.f36411e = false;
                        this.f36412f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f36412f) {
                        float translationY2 = gg0Var.getTranslationY() + y11;
                        if (translationY2 >= 0.0f) {
                            f10 = translationY2;
                        }
                        gg0Var.setTranslationY(f10);
                        this.f36410c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f36408a == null) {
                        this.f36408a = VelocityTracker.obtain();
                    }
                    this.f36408a.computeCurrentVelocity(1000);
                    float translationY3 = gg0Var.getTranslationY();
                    if (!this.f36412f && translationY3 == 0.0f) {
                        this.f36411e = false;
                        this.f36412f = false;
                    } else {
                        float xVelocity = this.f36408a.getXVelocity();
                        float yVelocity = this.f36408a.getYVelocity();
                        if ((gg0Var.getTranslationY() < org.telegram.messenger.g0.a1(false, 0.8f) && (yVelocity < 3500.0f || Math.abs(yVelocity) < Math.abs(xVelocity))) || (yVelocity < 0.0f && Math.abs(yVelocity) >= 3500.0f)) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.h = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(gg0Var, View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, translationY) / org.telegram.messenger.g0.a1(false, 0.8f)) * 150.0f));
                            this.h.setInterpolator(er.f34420g);
                            this.h.addListener(new jg0(this, 0));
                            org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25518j1, 512);
                            this.h.start();
                        } else {
                            this.F = true;
                            a();
                        }
                        this.f36412f = false;
                    }
                    VelocityTracker velocityTracker2 = this.f36408a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.f36408a = null;
                    }
                    this.d = -1;
                }
            }
            if ((!z10 && this.f36411e) || this.f36412f) {
                return true;
            }
        }
        return false;
    }

    public final void c(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kg0.c(boolean):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f36414r) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kg0.getValue():float");
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f36414r || b(motionEvent, true)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kg0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        getRootView();
        getWindowVisibleDisplayFrame(this.f36413n);
        setMeasuredDimension(size, size2);
        gg0 gg0Var = this.f36416w;
        gg0Var.measure(View.MeasureSpec.makeMeasureSpec((this.f36418y * 2) + size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8 && childAt != gg0Var) {
                measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(size2, 1073741824), 0);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f36414r && !b(motionEvent, false)) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.f36411e && !this.f36412f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}

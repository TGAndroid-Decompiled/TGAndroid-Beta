package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.Utilities;
public class i81 extends FrameLayout {
    public static final ir0 S = new ir0(1);
    public float E;
    public boolean F;
    public final int G;
    public boolean H;
    public boolean I;
    public final AnimationNotificationsLocker J;
    public final float K;
    public a81 L;
    public y71 M;
    public final bi.u5 N;
    public final Rect O;
    public boolean P;
    public ValueAnimator Q;
    public float R;
    public final org.telegram.ui.ActionBar.f6 f27014a;
    public int f27015b;
    public float f27016c;
    public int d;
    public final View[] f27017e;
    public final int[] f27018f;
    public final SparseArray h;
    public int f27019n;
    public int f27020r;
    public int f27021s;
    public VelocityTracker v;
    public AnimatorSet f27022w;
    public boolean f27023x;
    public boolean f27024y;

    public i81(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f27016c = 1.0f;
        this.h = new SparseArray();
        this.J = new AnimationNotificationsLocker();
        this.N = new bi.u5(this, 9);
        this.O = new Rect();
        this.P = true;
        this.f27014a = f6Var;
        this.K = AndroidUtilities.getPixelsInCM(0.3f, true);
        this.G = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.f27018f = new int[2];
        this.f27017e = new View[2];
        setClipChildren(true);
    }

    public static ll0 p(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof ll0) {
                    return (ll0) childAt;
                }
                if (childAt instanceof ViewGroup) {
                    p(childAt);
                }
            }
            return null;
        }
        return null;
    }

    public final boolean A(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i81.A(android.view.MotionEvent):boolean");
    }

    public final boolean B(MotionEvent motionEvent, boolean z10) {
        int i10;
        if (!z10 && this.f27015b == 0) {
            this.R = 0.0f;
            return false;
        } else if ((z10 && this.f27015b == this.L.e() - 1) || this.Q != null || !i(motionEvent) || ((z10 && !k(motionEvent)) || (!z10 && !j(motionEvent)))) {
            return false;
        } else {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.I = false;
            this.H = true;
            v();
            this.f27020r = (int) (motionEvent.getX() + this.E);
            y71 y71Var = this.M;
            if (y71Var != null) {
                y71Var.setEnabled(false);
            }
            this.J.lock();
            this.f27024y = z10;
            int i11 = this.f27015b;
            if (z10) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            this.d = i11 + i10;
            I(1);
            View[] viewArr = this.f27017e;
            View view = viewArr[1];
            if (view != null) {
                if (z10) {
                    E(view, viewArr[0].getMeasuredWidth());
                } else {
                    E(view, -viewArr[0].getMeasuredWidth());
                }
            }
            w(false);
            return true;
        }
    }

    public final void C(boolean z10) {
        int i10;
        int intValue;
        onTouchEvent(null);
        a81 a81Var = this.L;
        a81Var.getClass();
        if (!(a81Var instanceof org.telegram.ui.e7)) {
            z10 = false;
        }
        AnimatorSet animatorSet = this.f27022w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f27022w = null;
        }
        View[] viewArr = this.f27017e;
        View view = viewArr[1];
        if (view != null) {
            removeView(view);
            viewArr[1] = null;
        }
        View view2 = viewArr[0];
        viewArr[1] = view2;
        if (view2 != null && view2.getTag() != null) {
            i10 = ((Integer) viewArr[1].getTag()).intValue();
        } else {
            i10 = 0;
        }
        if (this.L.e() == 0) {
            View view3 = viewArr[1];
            if (view3 != null) {
                removeView(view3);
                viewArr[1] = null;
            }
            View view4 = viewArr[0];
            if (view4 != null) {
                removeView(view4);
                viewArr[0] = null;
                return;
            }
            return;
        }
        if (this.f27015b > this.L.e() - 1) {
            this.f27015b = this.L.e() - 1;
        }
        if (this.f27015b < 0) {
            this.f27015b = 0;
        }
        int h = this.L.h(this.f27015b);
        int[] iArr = this.f27018f;
        iArr[0] = h;
        View d = this.L.d(h);
        viewArr[0] = d;
        this.L.b(d, this.f27015b, iArr[0]);
        addView(viewArr[0]);
        viewArr[0].setVisibility(0);
        if (viewArr[0].getTag() == null) {
            intValue = 0;
        } else {
            intValue = ((Integer) viewArr[0].getTag()).intValue();
        }
        if (intValue == i10) {
            z10 = false;
        }
        if (z10) {
            this.M.getClass();
        }
        o(z10);
        if (z10) {
            this.f27022w = new AnimatorSet();
            View view5 = viewArr[1];
            if (view5 != null) {
                E(view5, 0.0f);
            }
            View view6 = viewArr[0];
            if (view6 != null) {
                E(view6, -getMeasuredWidth());
            }
            View view7 = viewArr[1];
            if (view7 != null) {
                this.f27022w.playTogether(H(view7, getMeasuredWidth()));
            }
            View view8 = viewArr[0];
            if (view8 != null) {
                this.f27022w.playTogether(H(view8, 0.0f));
            }
            w(true);
            y71 y71Var = this.M;
            y71Var.f26632a = 0.0f;
            y71Var.v.e1();
            this.M.invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new w71(this, 2));
            this.f27022w.playTogether(ofFloat);
            this.f27022w.setInterpolator(S);
            this.f27022w.setDuration(220L);
            this.f27022w.addListener(new x71(this, 2));
            this.M.setEnabled(false);
            this.f27023x = true;
            this.f27022w.start();
            return;
        }
        View view9 = viewArr[1];
        if (view9 != null) {
            removeView(view9);
            viewArr[1] = null;
        }
    }

    public final void D(int i10) {
        boolean z10;
        int i11;
        if (i10 != this.f27015b) {
            ValueAnimator valueAnimator = this.Q;
            if (valueAnimator == null || this.d != i10) {
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.Q = null;
                }
                if (this.f27015b < i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f27024y = z10;
                this.d = i10;
                I(1);
                y(i10, z10);
                View[] viewArr = this.f27017e;
                View view = viewArr[0];
                if (view != null) {
                    i11 = view.getMeasuredWidth();
                } else {
                    i11 = 0;
                }
                if (z10) {
                    E(viewArr[1], i11);
                } else {
                    E(viewArr[1], -i11);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.Q = ofFloat;
                ofFloat.addUpdateListener(new w71(this, 0));
                this.Q.addListener(new x71(this, 0));
                this.Q.setDuration(getManualScrollDuration());
                this.Q.setInterpolator(pr.h);
                this.Q.start();
            }
        }
    }

    public void E(View view, float f7) {
        view.setTranslationX(f7);
    }

    public void F() {
        View[] viewArr = this.f27017e;
        View view = viewArr[0];
        View view2 = viewArr[1];
        viewArr[0] = view2;
        viewArr[1] = view;
        int i10 = this.f27015b;
        int i11 = this.d;
        this.f27015b = i11;
        this.d = i10;
        this.f27016c = 1.0f - this.f27016c;
        int[] iArr = this.f27018f;
        int i12 = iArr[0];
        iArr[0] = iArr[1];
        iArr[1] = i12;
        t(view2, view, i11, i10);
    }

    public int G() {
        return 16;
    }

    public final ValueAnimator H(View view, float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(view.getTranslationX(), f7);
        ofFloat.addUpdateListener(new bx0(this, view, 1));
        ofFloat.addListener(new z71(this, view, f7));
        return ofFloat;
    }

    public final void I(int i10) {
        int i11;
        if (i10 == 0) {
            i11 = this.f27015b;
        } else {
            i11 = this.d;
        }
        if (i11 >= 0 && i11 < this.L.e()) {
            View[] viewArr = this.f27017e;
            View view = viewArr[i10];
            SparseArray sparseArray = this.h;
            int[] iArr = this.f27018f;
            if (view == null) {
                int h = this.L.h(i11);
                iArr[i10] = h;
                View view2 = (View) sparseArray.get(h);
                if (view2 == null) {
                    view2 = this.L.d(iArr[i10]);
                } else {
                    sparseArray.remove(iArr[i10]);
                }
                if (view2.getParent() != null) {
                    ((ViewGroup) view2.getParent()).removeView(view2);
                }
                addView(view2);
                view2.setTranslationX(getMeasuredWidth());
                viewArr[i10] = view2;
                this.L.b(view2, i11, iArr[i10]);
                viewArr[i10].setVisibility(0);
            } else if (iArr[i10] == this.L.h(i11)) {
                this.L.b(viewArr[i10], i11, iArr[i10]);
                viewArr[i10].setVisibility(0);
            } else {
                sparseArray.put(iArr[i10], viewArr[i10]);
                viewArr[i10].setVisibility(8);
                removeView(viewArr[i10]);
                int h10 = this.L.h(i11);
                iArr[i10] = h10;
                View view3 = (View) sparseArray.get(h10);
                if (view3 == null) {
                    view3 = this.L.d(iArr[i10]);
                } else {
                    sparseArray.remove(iArr[i10]);
                }
                addView(view3);
                viewArr[i10] = view3;
                view3.setVisibility(0);
                a81 a81Var = this.L;
                a81Var.b(viewArr[i10], i11, a81Var.h(i11));
            }
        }
    }

    @Override
    public final boolean canScrollHorizontally(int i10) {
        boolean z10;
        if (i10 != 0) {
            if (!this.f27023x && !this.H) {
                if (i10 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((z10 || this.f27015b != 0) && (!z10 || this.f27015b != this.L.e() - 1)) {
                }
            }
            return true;
        }
        return false;
    }

    public float getAvailableTranslationX() {
        return AndroidUtilities.displaySize.x;
    }

    public int getCurrentPosition() {
        return this.f27015b;
    }

    public float getCurrentPositionAlpha() {
        View[] viewArr = this.f27017e;
        View view = viewArr[0];
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return Utilities.clamp(1.0f - Math.abs(viewArr[0].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f);
    }

    public View getCurrentView() {
        return this.f27017e[0];
    }

    public long getManualScrollDuration() {
        return 540L;
    }

    public int getNextPosition() {
        return this.d;
    }

    public float getNextPositionAlpha() {
        View[] viewArr = this.f27017e;
        View view = viewArr[1];
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return Utilities.clamp(1.0f - Math.abs(viewArr[1].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f);
    }

    public float getPositionAnimated() {
        float f7;
        View[] viewArr = this.f27017e;
        View view = viewArr[0];
        if (view != null && view.getVisibility() == 0) {
            f7 = (this.f27015b * Utilities.clamp(1.0f - Math.abs(viewArr[0].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f)) + 0.0f;
        } else {
            f7 = 0.0f;
        }
        View view2 = viewArr[1];
        if (view2 != null && view2.getVisibility() == 0) {
            return (this.d * Utilities.clamp(1.0f - Math.abs(viewArr[1].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f)) + f7;
        }
        return f7;
    }

    public View[] getViewPages() {
        return this.f27017e;
    }

    public boolean i(MotionEvent motionEvent) {
        return true;
    }

    public boolean j(MotionEvent motionEvent) {
        return true;
    }

    public boolean k(MotionEvent motionEvent) {
        return i(motionEvent);
    }

    public final void l() {
        boolean z10;
        float f7;
        View view;
        View view2;
        int measuredWidth;
        int measuredWidth2;
        float f10;
        boolean z11;
        boolean z12;
        VelocityTracker velocityTracker = this.v;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.G);
        }
        if (this.H) {
            View[] viewArr = this.f27017e;
            float x10 = viewArr[0].getX();
            this.f27022w = new AnimatorSet();
            if (this.E != 0.0f) {
                if (Math.abs(0.0f) > 1500.0f) {
                    this.F = false;
                } else if (this.f27024y) {
                    View view3 = viewArr[1];
                    if (view3 != null) {
                        if (view3.getX() > (viewArr[0].getMeasuredWidth() >> 1)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.F = z12;
                    } else {
                        this.F = false;
                    }
                } else {
                    if (viewArr[0].getX() < (viewArr[0].getMeasuredWidth() >> 1)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.F = z11;
                }
            } else {
                if (Math.abs(x10) < viewArr[0].getMeasuredWidth() / 3.0f && (Math.abs(0.0f) < 3500.0f || Math.abs(0.0f) < Math.abs(0.0f))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.F = z10;
            }
            if (this.F) {
                f7 = Math.abs(x10);
                if (this.f27024y) {
                    this.f27022w.playTogether(H(viewArr[0], 0.0f));
                    View view4 = viewArr[1];
                    if (view4 != null) {
                        this.f27022w.playTogether(H(view4, view4.getMeasuredWidth()));
                    }
                } else {
                    this.f27022w.playTogether(H(viewArr[0], 0.0f));
                    View view5 = viewArr[1];
                    if (view5 != null) {
                        this.f27022w.playTogether(H(view5, -view5.getMeasuredWidth()));
                    }
                }
            } else if (this.d >= 0) {
                f7 = viewArr[0].getMeasuredWidth() - Math.abs(x10);
                if (this.f27024y) {
                    this.f27022w.playTogether(H(viewArr[0], -view2.getMeasuredWidth()));
                    View view6 = viewArr[1];
                    if (view6 != null) {
                        this.f27022w.playTogether(H(view6, 0.0f));
                    }
                } else {
                    this.f27022w.playTogether(H(viewArr[0], view.getMeasuredWidth()));
                    View view7 = viewArr[1];
                    if (view7 != null) {
                        this.f27022w.playTogether(H(view7, 0.0f));
                    }
                }
            } else {
                f7 = 0.0f;
            }
            if (this.d < 0) {
                float f11 = this.R;
                if (this.F) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                ofFloat.addUpdateListener(new w71(this, 3));
                this.f27022w.playTogether(ofFloat);
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(this.N);
            this.f27022w.playTogether(ofFloat2);
            this.f27022w.setInterpolator(S);
            float measuredWidth3 = getMeasuredWidth() / 2;
            float sin = (((float) Math.sin((Math.min(1.0f, (f7 * 1.0f) / measuredWidth) - 0.5f) * 0.47123894f)) * measuredWidth3) + measuredWidth3;
            float abs = Math.abs(0.0f);
            if (abs > 0.0f) {
                measuredWidth2 = Math.round(Math.abs(sin / abs) * 1000.0f) * 4;
            } else {
                measuredWidth2 = (int) (((f7 / getMeasuredWidth()) + 1.0f) * 100.0f);
            }
            this.f27022w.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
            this.f27022w.addListener(new x71(this, 3));
            this.f27022w.start();
            this.f27023x = true;
            this.H = false;
            w(false);
        } else {
            this.I = false;
            y71 y71Var = this.M;
            if (y71Var != null) {
                y71Var.setEnabled(true);
            }
        }
        VelocityTracker velocityTracker2 = this.v;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.v = null;
        }
    }

    public final boolean m() {
        boolean z10;
        if (!this.f27023x) {
            return false;
        }
        boolean z11 = this.F;
        int i10 = -1;
        View[] viewArr = this.f27017e;
        if (z11) {
            if (Math.abs(viewArr[0].getTranslationX()) < 1.0f) {
                E(viewArr[0], 0.0f);
                View view = viewArr[1];
                if (view != null) {
                    int measuredWidth = viewArr[0].getMeasuredWidth();
                    if (this.f27024y) {
                        i10 = 1;
                    }
                    E(view, measuredWidth * i10);
                }
                z10 = true;
            }
            z10 = false;
        } else {
            if (Math.abs(viewArr[1].getTranslationX()) < 1.0f) {
                View view2 = viewArr[0];
                int measuredWidth2 = view2.getMeasuredWidth();
                if (!this.f27024y) {
                    i10 = 1;
                }
                E(view2, measuredWidth2 * i10);
                View view3 = viewArr[1];
                if (view3 != null) {
                    E(view3, 0.0f);
                }
                z10 = true;
            }
            z10 = false;
        }
        w(true);
        if (z10) {
            AnimatorSet animatorSet = this.f27022w;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f27022w = null;
            }
            this.f27023x = false;
        }
        return this.f27023x;
    }

    public final h81 n(int i10, boolean z10) {
        y71 y71Var = new y71(this, getContext(), z10, i10, this.f27014a);
        this.M = y71Var;
        y71Var.f26654r = G();
        this.M.setDelegate(new k2.g0(this, 13));
        o(false);
        return this.M;
    }

    public final void o(boolean z10) {
        y71 y71Var;
        if (this.L != null && (y71Var = this.M) != null) {
            y71Var.h.clear();
            y71Var.f26635b0.clear();
            y71Var.f26637c0.clear();
            y71Var.f26638d0.clear();
            y71Var.f26640e0.clear();
            y71Var.H = 0;
            for (int i10 = 0; i10 < this.L.e(); i10++) {
                this.L.getClass();
                this.M.a(this.L.f(i10), this.L.g(i10));
            }
            h();
            if (z10) {
                bi.o0 o0Var = this.M.v;
                TransitionSet transitionSet = new TransitionSet();
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(150L);
                transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
                transitionSet.setOrdering(0);
                transitionSet.setInterpolator((TimeInterpolator) pr.f29466f);
                TransitionManager.beginDelayedTransition(o0Var, transitionSet);
            }
            this.M.f26658x.l();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        y71 y71Var = this.M;
        if (y71Var != null && y71Var.J) {
            return false;
        }
        if (m()) {
            return true;
        }
        onTouchEvent(motionEvent);
        return this.H;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return A(motionEvent);
    }

    public final View q(ViewGroup viewGroup, float f7, float f10) {
        View q6;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                Rect rect = this.O;
                childAt.getHitRect(rect);
                if (!rect.contains((int) f7, (int) f10)) {
                    continue;
                } else if (childAt.canScrollHorizontally(-1)) {
                    return childAt;
                } else {
                    if ((childAt instanceof ViewGroup) && (q6 = q((ViewGroup) childAt, f7 - rect.left, f10 - rect.top)) != null) {
                        return q6;
                    }
                }
            }
        }
        return null;
    }

    public final float r(int i10) {
        if (getMeasuredWidth() == 0) {
            return w7.p.b(1 - Math.abs(getCurrentPosition() - i10), 0, 1);
        }
        return w7.p.a(1.0f - Math.abs(getPositionAnimated() - i10), 0.0f, 1.0f);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.P && this.I && !this.H) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void setAdapter(a81 a81Var) {
        this.L = a81Var;
        int h = a81Var.h(this.f27015b);
        int[] iArr = this.f27018f;
        iArr[0] = h;
        View d = a81Var.d(h);
        View[] viewArr = this.f27017e;
        viewArr[0] = d;
        if (d == null && this.f27015b != 0) {
            this.f27015b = 0;
            int h10 = a81Var.h(0);
            iArr[0] = h10;
            viewArr[0] = a81Var.d(h10);
        }
        a81Var.b(viewArr[0], this.f27015b, iArr[0]);
        addView(viewArr[0]);
        viewArr[0].setVisibility(0);
        o(false);
    }

    public void setAllowDisallowInterceptTouch(boolean z10) {
        this.P = z10;
    }

    public void setPosition(int i10) {
        if (this.L == null) {
            this.f27015b = i10;
            w(false);
        }
        AnimatorSet animatorSet = this.f27022w;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        View[] viewArr = this.f27017e;
        View view = viewArr[1];
        if (view != null) {
            this.h.put(this.f27018f[1], view);
            removeView(viewArr[1]);
            viewArr[1] = null;
        }
        int i11 = this.f27015b;
        if (i11 != i10) {
            this.f27015b = i10;
            this.d = 0;
            this.f27016c = 1.0f;
            View view2 = viewArr[0];
            I(0);
            t(viewArr[0], view2, this.f27015b, i11);
            E(viewArr[0], 0.0f);
            y71 y71Var = this.M;
            if (y71Var != null) {
                y71Var.e(this.f27016c, this.f27015b, this.d);
            }
            w(true);
        }
    }

    public void y(int i10, boolean z10) {
        x(i10);
    }

    public void h() {
    }

    public void s() {
    }

    public void u() {
    }

    public void v() {
    }

    public void w(boolean z10) {
    }

    public void x(int i10) {
    }

    public void z(int i10) {
    }

    public void t(View view, View view2, int i10, int i11) {
    }
}

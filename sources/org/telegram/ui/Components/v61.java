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
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
public class v61 extends FrameLayout {
    public static final qp0 U = new qp0(1);
    public boolean D;
    public float E;
    public boolean F;
    public final int G;
    public boolean H;
    public boolean I;
    public final h2.f J;
    public final float K;
    public m61 L;
    public k61 M;
    public final di.n4 N;
    public final Rect O;
    public boolean P;
    public final ArrayList Q;
    public final ArrayList R;
    public ValueAnimator S;
    public float T;
    public final org.telegram.ui.ActionBar.h6 f38890a;
    public int f38891b;
    public float f38892c;
    public int d;
    public final View[] f38893e;
    public final int[] f38894f;
    public final SparseArray h;
    public int f38895n;
    public int f38896r;
    public int f38897s;
    public VelocityTracker f38898w;
    public AnimatorSet f38899x;
    public boolean f38900y;

    public v61(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f38892c = 1.0f;
        this.h = new SparseArray();
        this.J = new h2.f((int[]) null);
        this.N = new di.n4(this, 10);
        this.O = new Rect();
        this.P = true;
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.f38890a = h6Var;
        this.K = org.telegram.messenger.g0.a1(true, 0.3f);
        this.G = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.f38894f = new int[2];
        this.f38893e = new View[2];
        setClipChildren(true);
    }

    public static pj0 p(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (childAt instanceof pj0) {
                    return (pj0) childAt;
                }
                if (childAt instanceof ViewGroup) {
                    p(childAt);
                }
            }
            return null;
        }
        return null;
    }

    public boolean B(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v61.B(android.view.MotionEvent):boolean");
    }

    public final boolean C(MotionEvent motionEvent, boolean z9) {
        int i7;
        View[] viewArr;
        if (!z9 && this.f38891b == 0) {
            this.T = 0.0f;
            return false;
        } else if ((z9 && this.f38891b == this.L.e() - 1) || this.S != null || !b(motionEvent) || ((z9 && !k(motionEvent)) || (!z9 && !j(motionEvent)))) {
            return false;
        } else {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.I = false;
            this.H = true;
            v();
            this.f38896r = (int) (motionEvent.getX() + this.E);
            k61 k61Var = this.M;
            if (k61Var != null) {
                k61Var.setEnabled(false);
            }
            this.J.d();
            this.D = z9;
            int i10 = this.f38891b;
            if (z9) {
                i7 = 1;
            } else {
                i7 = -1;
            }
            this.d = i10 + i7;
            K(1);
            View view = this.f38893e[1];
            if (view != null) {
                if (z9) {
                    F(view, viewArr[0].getMeasuredWidth());
                } else {
                    F(view, -viewArr[0].getMeasuredWidth());
                }
            }
            x(false);
            return true;
        }
    }

    public final void D(boolean z9) {
        int i7;
        int intValue;
        onTouchEvent(null);
        m61 m61Var = this.L;
        m61Var.getClass();
        if (!(m61Var instanceof org.telegram.ui.d7)) {
            z9 = false;
        }
        AnimatorSet animatorSet = this.f38899x;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f38899x = null;
        }
        View[] viewArr = this.f38893e;
        View view = viewArr[1];
        if (view != null) {
            removeView(view);
            viewArr[1] = null;
        }
        View view2 = viewArr[0];
        viewArr[1] = view2;
        if (view2 != null && view2.getTag() != null) {
            i7 = ((Integer) viewArr[1].getTag()).intValue();
        } else {
            i7 = 0;
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
        if (this.f38891b > this.L.e() - 1) {
            this.f38891b = this.L.e() - 1;
        }
        if (this.f38891b < 0) {
            this.f38891b = 0;
        }
        int h = this.L.h(this.f38891b);
        int[] iArr = this.f38894f;
        iArr[0] = h;
        View d = this.L.d(h);
        viewArr[0] = d;
        this.L.b(d, this.f38891b, iArr[0]);
        addView(viewArr[0]);
        viewArr[0].setVisibility(0);
        if (viewArr[0].getTag() == null) {
            intValue = 0;
        } else {
            intValue = ((Integer) viewArr[0].getTag()).intValue();
        }
        if (intValue == i7) {
            z9 = false;
        }
        if (z9) {
            this.M.getClass();
        }
        o(z9);
        if (z9) {
            this.f38899x = new AnimatorSet();
            View view5 = viewArr[1];
            if (view5 != null) {
                F(view5, 0.0f);
            }
            View view6 = viewArr[0];
            if (view6 != null) {
                F(view6, -getMeasuredWidth());
            }
            View view7 = viewArr[1];
            if (view7 != null) {
                this.f38899x.playTogether(I(view7, getMeasuredWidth()));
            }
            View view8 = viewArr[0];
            if (view8 != null) {
                this.f38899x.playTogether(I(view8, 0.0f));
            }
            x(true);
            k61 k61Var = this.M;
            k61Var.f38556a = 0.0f;
            k61Var.f38581w.g1();
            this.M.invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new i61(this, 2));
            this.f38899x.playTogether(ofFloat);
            this.f38899x.setInterpolator(U);
            this.f38899x.setDuration(220L);
            this.f38899x.addListener(new j61(this, 2));
            this.M.setEnabled(false);
            this.f38900y = true;
            this.f38899x.start();
            return;
        }
        View view9 = viewArr[1];
        if (view9 != null) {
            removeView(view9);
            viewArr[1] = null;
        }
    }

    public final boolean E(int i7) {
        ValueAnimator valueAnimator;
        boolean z9;
        int i10;
        if (i7 == this.f38891b || ((valueAnimator = this.S) != null && this.d == i7)) {
            return false;
        }
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.S = null;
        }
        if (this.f38891b < i7) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.D = z9;
        this.d = i7;
        K(1);
        z(i7, z9);
        View[] viewArr = this.f38893e;
        View view = viewArr[0];
        if (view != null) {
            i10 = view.getMeasuredWidth();
        } else {
            i10 = 0;
        }
        if (z9) {
            F(viewArr[1], i10);
        } else {
            F(viewArr[1], -i10);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.S = ofFloat;
        ofFloat.addUpdateListener(new i61(this, 0));
        this.S.addListener(new j61(this, 0));
        this.S.setDuration(getManualScrollDuration());
        this.S.setInterpolator(wq.h);
        this.S.start();
        return true;
    }

    public void F(View view, float f10) {
        int i7;
        int round = Math.round(f10);
        int round2 = Math.round(view.getTranslationX());
        view.setTranslationX(round);
        if (view == this.f38893e[0] && (i7 = round2 - round) != 0) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.R;
                if (i10 < arrayList.size()) {
                    ((oi.g) arrayList.get(i10)).f21084a.h(i7, 0);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public void G() {
        View[] viewArr = this.f38893e;
        View view = viewArr[0];
        View view2 = viewArr[1];
        viewArr[0] = view2;
        viewArr[1] = view;
        int i7 = this.f38891b;
        int i10 = this.d;
        this.f38891b = i10;
        this.d = i7;
        this.f38892c = 1.0f - this.f38892c;
        int[] iArr = this.f38894f;
        int i11 = iArr[0];
        iArr[0] = iArr[1];
        iArr[1] = i11;
        t(view2, view, i10, i7);
    }

    public int H() {
        return 16;
    }

    public final ValueAnimator I(View view, float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(view.getTranslationX(), f10);
        ofFloat.addUpdateListener(new fv0(this, view, 1));
        ofFloat.addListener(new l61(this, view, f10));
        return ofFloat;
    }

    public final void J() {
        int[] iArr = this.f38894f;
        if (iArr[0] != this.L.h(this.f38891b)) {
            K(0);
            View[] viewArr = this.f38893e;
            View view = viewArr[1];
            if (view != null) {
                this.h.put(iArr[1], view);
                removeView(viewArr[1]);
                viewArr[1] = null;
            }
            F(viewArr[0], 0.0f);
            x(true);
        }
    }

    public final void K(int i7) {
        int i10;
        if (i7 == 0) {
            i10 = this.f38891b;
        } else {
            i10 = this.d;
        }
        if (i10 >= 0 && i10 < this.L.e()) {
            View[] viewArr = this.f38893e;
            View view = viewArr[i7];
            float f10 = 0.0f;
            SparseArray sparseArray = this.h;
            int[] iArr = this.f38894f;
            if (view == null) {
                int h = this.L.h(i10);
                iArr[i7] = h;
                View view2 = (View) sparseArray.get(h);
                if (view2 == null) {
                    view2 = this.L.d(iArr[i7]);
                } else {
                    sparseArray.remove(iArr[i7]);
                }
                if (view2.getParent() != null) {
                    ((ViewGroup) view2.getParent()).removeView(view2);
                }
                addView(view2);
                if (i7 != 0) {
                    f10 = getMeasuredWidth();
                }
                view2.setTranslationX(f10);
                viewArr[i7] = view2;
                this.L.b(view2, i10, iArr[i7]);
                viewArr[i7].setVisibility(0);
            } else if (iArr[i7] == this.L.h(i10)) {
                this.L.b(viewArr[i7], i10, iArr[i7]);
                viewArr[i7].setVisibility(0);
            } else {
                sparseArray.put(iArr[i7], viewArr[i7]);
                viewArr[i7].setVisibility(8);
                removeView(viewArr[i7]);
                int h7 = this.L.h(i10);
                iArr[i7] = h7;
                View view3 = (View) sparseArray.get(h7);
                if (view3 == null) {
                    view3 = this.L.d(iArr[i7]);
                } else {
                    sparseArray.remove(iArr[i7]);
                }
                if (i7 != 0) {
                    f10 = getMeasuredWidth();
                }
                view3.setTranslationX(f10);
                addView(view3);
                viewArr[i7] = view3;
                view3.setVisibility(0);
                m61 m61Var = this.L;
                m61Var.b(viewArr[i7], i10, m61Var.h(i10));
            }
        }
    }

    public boolean b(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public boolean canScrollHorizontally(int i7) {
        boolean z9;
        if (i7 != 0) {
            if (!this.f38900y && !this.H) {
                if (i7 > 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if ((z9 || this.f38891b != 0) && (!z9 || this.f38891b != this.L.e() - 1)) {
                }
            }
            return true;
        }
        return false;
    }

    public float getAvailableTranslationX() {
        return org.telegram.messenger.g0.f22567q.x;
    }

    public int getCurrentPosition() {
        return this.f38891b;
    }

    public float getCurrentPositionAlpha() {
        View[] viewArr = this.f38893e;
        View view = viewArr[0];
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return Utilities.i(1.0f - Math.abs(viewArr[0].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f);
    }

    public View getCurrentView() {
        return this.f38893e[0];
    }

    public long getManualScrollDuration() {
        return 540L;
    }

    public int getNextPosition() {
        return this.d;
    }

    public float getNextPositionAlpha() {
        View[] viewArr = this.f38893e;
        View view = viewArr[1];
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return Utilities.i(1.0f - Math.abs(viewArr[1].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f);
    }

    public float getPositionAnimated() {
        float f10;
        View[] viewArr = this.f38893e;
        View view = viewArr[0];
        if (view != null && view.getVisibility() == 0) {
            f10 = (this.f38891b * Utilities.i(1.0f - Math.abs(viewArr[0].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f)) + 0.0f;
        } else {
            f10 = 0.0f;
        }
        View view2 = viewArr[1];
        if (view2 != null && view2.getVisibility() == 0) {
            return (this.d * Utilities.i(1.0f - Math.abs(viewArr[1].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f)) + f10;
        }
        return f10;
    }

    public View[] getViewPages() {
        return this.f38893e;
    }

    public boolean j(MotionEvent motionEvent) {
        return true;
    }

    public boolean k(MotionEvent motionEvent) {
        return b(motionEvent);
    }

    public final void l() {
        boolean z9;
        float f10;
        View view;
        View view2;
        int measuredWidth;
        int measuredWidth2;
        float f11;
        boolean z10;
        boolean z11;
        VelocityTracker velocityTracker = this.f38898w;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.G);
        }
        if (this.H) {
            View[] viewArr = this.f38893e;
            float x10 = viewArr[0].getX();
            this.f38899x = new AnimatorSet();
            if (this.E != 0.0f) {
                if (Math.abs(0.0f) > 1500.0f) {
                    this.F = false;
                } else if (this.D) {
                    View view3 = viewArr[1];
                    if (view3 != null) {
                        if (view3.getX() > (viewArr[0].getMeasuredWidth() >> 1)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.F = z11;
                    } else {
                        this.F = false;
                    }
                } else {
                    if (viewArr[0].getX() < (viewArr[0].getMeasuredWidth() >> 1)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.F = z10;
                }
            } else {
                if (Math.abs(x10) < viewArr[0].getMeasuredWidth() / 3.0f && (Math.abs(0.0f) < 3500.0f || Math.abs(0.0f) < Math.abs(0.0f))) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.F = z9;
            }
            if (this.F) {
                f10 = Math.abs(x10);
                if (this.D) {
                    this.f38899x.playTogether(I(viewArr[0], 0.0f));
                    View view4 = viewArr[1];
                    if (view4 != null) {
                        this.f38899x.playTogether(I(view4, view4.getMeasuredWidth()));
                    }
                } else {
                    this.f38899x.playTogether(I(viewArr[0], 0.0f));
                    View view5 = viewArr[1];
                    if (view5 != null) {
                        this.f38899x.playTogether(I(view5, -view5.getMeasuredWidth()));
                    }
                }
            } else if (this.d >= 0) {
                f10 = viewArr[0].getMeasuredWidth() - Math.abs(x10);
                if (this.D) {
                    this.f38899x.playTogether(I(viewArr[0], -view2.getMeasuredWidth()));
                    View view6 = viewArr[1];
                    if (view6 != null) {
                        this.f38899x.playTogether(I(view6, 0.0f));
                    }
                } else {
                    this.f38899x.playTogether(I(viewArr[0], view.getMeasuredWidth()));
                    View view7 = viewArr[1];
                    if (view7 != null) {
                        this.f38899x.playTogether(I(view7, 0.0f));
                    }
                }
            } else {
                f10 = 0.0f;
            }
            if (this.d < 0) {
                float f12 = this.T;
                if (this.F) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
                ofFloat.addUpdateListener(new i61(this, 3));
                this.f38899x.playTogether(ofFloat);
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(this.N);
            this.f38899x.playTogether(ofFloat2);
            this.f38899x.setInterpolator(U);
            float measuredWidth3 = getMeasuredWidth() / 2;
            float sin = (((float) Math.sin((Math.min(1.0f, (f10 * 1.0f) / measuredWidth) - 0.5f) * 0.47123894f)) * measuredWidth3) + measuredWidth3;
            float abs = Math.abs(0.0f);
            if (abs > 0.0f) {
                measuredWidth2 = Math.round(Math.abs(sin / abs) * 1000.0f) * 4;
            } else {
                measuredWidth2 = (int) (((f10 / getMeasuredWidth()) + 1.0f) * 100.0f);
            }
            this.f38899x.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
            this.f38899x.addListener(new j61(this, 3));
            this.f38899x.start();
            this.f38900y = true;
            this.H = false;
            x(false);
        } else {
            this.I = false;
            k61 k61Var = this.M;
            if (k61Var != null) {
                k61Var.setEnabled(true);
            }
        }
        VelocityTracker velocityTracker2 = this.f38898w;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.f38898w = null;
        }
    }

    public final boolean m() {
        boolean z9;
        if (!this.f38900y) {
            return false;
        }
        boolean z10 = this.F;
        int i7 = -1;
        View[] viewArr = this.f38893e;
        if (z10) {
            if (Math.abs(viewArr[0].getTranslationX()) < 1.0f) {
                F(viewArr[0], 0.0f);
                View view = viewArr[1];
                if (view != null) {
                    int measuredWidth = viewArr[0].getMeasuredWidth();
                    if (this.D) {
                        i7 = 1;
                    }
                    F(view, measuredWidth * i7);
                }
                z9 = true;
            }
            z9 = false;
        } else {
            if (Math.abs(viewArr[1].getTranslationX()) < 1.0f) {
                View view2 = viewArr[0];
                int measuredWidth2 = view2.getMeasuredWidth();
                if (!this.D) {
                    i7 = 1;
                }
                F(view2, measuredWidth2 * i7);
                View view3 = viewArr[1];
                if (view3 != null) {
                    F(view3, 0.0f);
                }
                z9 = true;
            }
            z9 = false;
        }
        x(true);
        if (z9) {
            AnimatorSet animatorSet = this.f38899x;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f38899x = null;
            }
            this.f38900y = false;
        }
        return this.f38900y;
    }

    public final u61 n(int i7, boolean z9) {
        k61 k61Var = new k61(this, getContext(), z9, i7, this.f38890a);
        this.M = k61Var;
        k61Var.f38578r = H();
        this.M.setDelegate(new m(this));
        o(false);
        return this.M;
    }

    public final void o(boolean z9) {
        k61 k61Var;
        if (this.L != null && (k61Var = this.M) != null) {
            k61Var.h.clear();
            k61Var.f38559b0.clear();
            k61Var.f38561c0.clear();
            k61Var.f38562d0.clear();
            k61Var.f38564e0.clear();
            k61Var.H = 0;
            for (int i7 = 0; i7 < this.L.e(); i7++) {
                this.L.getClass();
                this.M.a(this.L.f(i7), this.L.g(i7));
            }
            a();
            if (z9) {
                bi.q1 q1Var = this.M.f38581w;
                TransitionSet transitionSet = new TransitionSet();
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(150L);
                transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
                transitionSet.setOrdering(0);
                transitionSet.setInterpolator((TimeInterpolator) wq.f40046f);
                TransitionManager.beginDelayedTransition(q1Var, transitionSet);
            }
            this.M.f38583y.f();
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        k61 k61Var = this.M;
        if (k61Var != null && k61Var.J) {
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
        return B(motionEvent);
    }

    public final View q(ViewGroup viewGroup, float f10, float f11) {
        View q10;
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt.getVisibility() == 0) {
                Rect rect = this.O;
                childAt.getHitRect(rect);
                if (!rect.contains((int) f10, (int) f11)) {
                    continue;
                } else if (childAt.canScrollHorizontally(-1)) {
                    return childAt;
                } else {
                    if ((childAt instanceof ViewGroup) && (q10 = q((ViewGroup) childAt, f10 - rect.left, f11 - rect.top)) != null) {
                        return q10;
                    }
                }
            }
        }
        return null;
    }

    public final float r(int i7) {
        if (getMeasuredWidth() == 0) {
            return c8.j9.b(1 - Math.abs(getCurrentPosition() - i7), 0, 1);
        }
        return c8.j9.a(1.0f - Math.abs(getPositionAnimated() - i7), 0.0f, 1.0f);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        if (this.P && this.I && !this.H) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z9);
    }

    public void setAdapter(m61 m61Var) {
        this.L = m61Var;
        int h = m61Var.h(this.f38891b);
        int[] iArr = this.f38894f;
        iArr[0] = h;
        View d = m61Var.d(h);
        View[] viewArr = this.f38893e;
        viewArr[0] = d;
        if (d == null && this.f38891b != 0) {
            this.f38891b = 0;
            int h7 = m61Var.h(0);
            iArr[0] = h7;
            viewArr[0] = m61Var.d(h7);
        }
        m61Var.b(viewArr[0], this.f38891b, iArr[0]);
        addView(viewArr[0]);
        viewArr[0].setVisibility(0);
        o(false);
    }

    public void setAllowDisallowInterceptTouch(boolean z9) {
        this.P = z9;
    }

    public void setPosition(int i7) {
        if (this.L == null) {
            this.f38891b = i7;
            x(false);
        }
        AnimatorSet animatorSet = this.f38899x;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        View[] viewArr = this.f38893e;
        View view = viewArr[1];
        if (view != null) {
            this.h.put(this.f38894f[1], view);
            removeView(viewArr[1]);
            viewArr[1] = null;
        }
        int i10 = this.f38891b;
        if (i10 != i7) {
            this.f38891b = i7;
            this.d = 0;
            this.f38892c = 1.0f;
            View view2 = viewArr[0];
            K(0);
            t(viewArr[0], view2, this.f38891b, i10);
            F(viewArr[0], 0.0f);
            k61 k61Var = this.M;
            if (k61Var != null) {
                k61Var.e(this.f38892c, this.d, this.f38891b);
            }
            x(true);
        }
    }

    public final void x(boolean z9) {
        Iterator it = this.Q.iterator();
        if (!it.hasNext()) {
            w(z9);
        } else {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public void z(int i7, boolean z9) {
        y(i7);
    }

    public void A(int i7) {
    }

    public void w(boolean z9) {
    }

    public void y(int i7) {
    }

    public void a() {
    }

    public void s() {
    }

    public void u() {
    }

    public void v() {
    }

    public void t(View view, View view2, int i7, int i10) {
    }
}

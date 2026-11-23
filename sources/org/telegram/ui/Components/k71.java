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
public class k71 extends FrameLayout {
    public static final cq0 V = new cq0(1);
    public boolean E;
    public float F;
    public boolean G;
    public final int H;
    public boolean I;
    public boolean J;
    public final h2.f K;
    public final float L;
    public c71 M;
    public a71 N;
    public final fi.d4 O;
    public final Rect P;
    public boolean Q;
    public final ArrayList R;
    public final ArrayList S;
    public ValueAnimator T;
    public float U;
    public final org.telegram.ui.ActionBar.i6 f36662a;
    public int f36663b;
    public float f36664c;
    public int d;
    public final View[] f36665e;
    public final int[] f36666f;
    public final SparseArray h;
    public int f36667n;
    public int f36668r;
    public int f36669s;
    public VelocityTracker f36670w;
    public AnimatorSet f36671x;
    public boolean f36672y;

    public k71(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f36664c = 1.0f;
        this.h = new SparseArray();
        this.K = new h2.f((int[]) null);
        this.O = new fi.d4(this, 10);
        this.P = new Rect();
        this.Q = true;
        this.R = new ArrayList();
        this.S = new ArrayList();
        this.f36662a = i6Var;
        this.L = org.telegram.messenger.g0.a1(true, 0.3f);
        this.H = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.f36666f = new int[2];
        this.f36665e = new View[2];
        setClipChildren(true);
    }

    public static ek0 m(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (childAt instanceof ek0) {
                    return (ek0) childAt;
                }
                if (childAt instanceof ViewGroup) {
                    m(childAt);
                }
            }
            return null;
        }
        return null;
    }

    public final void A(boolean z10) {
        int i7;
        int intValue;
        onTouchEvent(null);
        c71 c71Var = this.M;
        c71Var.getClass();
        if (!(c71Var instanceof org.telegram.ui.d7)) {
            z10 = false;
        }
        AnimatorSet animatorSet = this.f36671x;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f36671x = null;
        }
        View[] viewArr = this.f36665e;
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
        if (this.M.e() == 0) {
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
        if (this.f36663b > this.M.e() - 1) {
            this.f36663b = this.M.e() - 1;
        }
        if (this.f36663b < 0) {
            this.f36663b = 0;
        }
        int h = this.M.h(this.f36663b);
        int[] iArr = this.f36666f;
        iArr[0] = h;
        View d = this.M.d(h);
        viewArr[0] = d;
        this.M.b(d, this.f36663b, iArr[0]);
        addView(viewArr[0]);
        viewArr[0].setVisibility(0);
        if (viewArr[0].getTag() == null) {
            intValue = 0;
        } else {
            intValue = ((Integer) viewArr[0].getTag()).intValue();
        }
        if (intValue == i7) {
            z10 = false;
        }
        if (z10) {
            this.N.getClass();
        }
        l(z10);
        if (z10) {
            this.f36671x = new AnimatorSet();
            View view5 = viewArr[1];
            if (view5 != null) {
                D(view5, 0.0f);
            }
            View view6 = viewArr[0];
            if (view6 != null) {
                D(view6, -getMeasuredWidth());
            }
            View view7 = viewArr[1];
            if (view7 != null) {
                this.f36671x.playTogether(G(view7, getMeasuredWidth()));
            }
            View view8 = viewArr[0];
            if (view8 != null) {
                this.f36671x.playTogether(G(view8, 0.0f));
            }
            u(true);
            a71 a71Var = this.N;
            a71Var.f36322a = 0.0f;
            a71Var.f36348w.g1();
            this.N.invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new y61(this, 2));
            this.f36671x.playTogether(ofFloat);
            this.f36671x.setInterpolator(V);
            this.f36671x.setDuration(220L);
            this.f36671x.addListener(new z61(this, 2));
            this.N.setEnabled(false);
            this.f36672y = true;
            this.f36671x.start();
            return;
        }
        View view9 = viewArr[1];
        if (view9 != null) {
            removeView(view9);
            viewArr[1] = null;
        }
    }

    public final boolean C(int i7) {
        ValueAnimator valueAnimator;
        boolean z10;
        int i10;
        if (i7 == this.f36663b || ((valueAnimator = this.T) != null && this.d == i7)) {
            return false;
        }
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.T = null;
        }
        if (this.f36663b < i7) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.E = z10;
        this.d = i7;
        I(1);
        w(i7, z10);
        View[] viewArr = this.f36665e;
        View view = viewArr[0];
        if (view != null) {
            i10 = view.getMeasuredWidth();
        } else {
            i10 = 0;
        }
        if (z10) {
            D(viewArr[1], i10);
        } else {
            D(viewArr[1], -i10);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.T = ofFloat;
        ofFloat.addUpdateListener(new y61(this, 0));
        this.T.addListener(new z61(this, 0));
        this.T.setDuration(getManualScrollDuration());
        this.T.setInterpolator(kr.h);
        this.T.start();
        return true;
    }

    public void D(View view, float f10) {
        int i7;
        int round = Math.round(f10);
        int round2 = Math.round(view.getTranslationX());
        view.setTranslationX(round);
        if (view == this.f36665e[0] && (i7 = round2 - round) != 0) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.S;
                if (i10 < arrayList.size()) {
                    ((ri.g) arrayList.get(i10)).f56797a.h(i7, 0);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public void E() {
        View[] viewArr = this.f36665e;
        View view = viewArr[0];
        View view2 = viewArr[1];
        viewArr[0] = view2;
        viewArr[1] = view;
        int i7 = this.f36663b;
        int i10 = this.d;
        this.f36663b = i10;
        this.d = i7;
        this.f36664c = 1.0f - this.f36664c;
        int[] iArr = this.f36666f;
        int i11 = iArr[0];
        iArr[0] = iArr[1];
        iArr[1] = i11;
        q(view2, view, i10, i7);
    }

    public int F() {
        return 16;
    }

    public final ValueAnimator G(View view, float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(view.getTranslationX(), f10);
        ofFloat.addUpdateListener(new qv0(this, view, 1));
        ofFloat.addListener(new b71(this, view, f10));
        return ofFloat;
    }

    public final void H() {
        int[] iArr = this.f36666f;
        if (iArr[0] != this.M.h(this.f36663b)) {
            I(0);
            View[] viewArr = this.f36665e;
            View view = viewArr[1];
            if (view != null) {
                this.h.put(iArr[1], view);
                removeView(viewArr[1]);
                viewArr[1] = null;
            }
            D(viewArr[0], 0.0f);
            u(true);
        }
    }

    public final void I(int i7) {
        int i10;
        if (i7 == 0) {
            i10 = this.f36663b;
        } else {
            i10 = this.d;
        }
        if (i10 >= 0 && i10 < this.M.e()) {
            View[] viewArr = this.f36665e;
            View view = viewArr[i7];
            float f10 = 0.0f;
            SparseArray sparseArray = this.h;
            int[] iArr = this.f36666f;
            if (view == null) {
                int h = this.M.h(i10);
                iArr[i7] = h;
                View view2 = (View) sparseArray.get(h);
                if (view2 == null) {
                    view2 = this.M.d(iArr[i7]);
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
                this.M.b(view2, i10, iArr[i7]);
                viewArr[i7].setVisibility(0);
            } else if (iArr[i7] == this.M.h(i10)) {
                this.M.b(viewArr[i7], i10, iArr[i7]);
                viewArr[i7].setVisibility(0);
            } else {
                sparseArray.put(iArr[i7], viewArr[i7]);
                viewArr[i7].setVisibility(8);
                removeView(viewArr[i7]);
                int h7 = this.M.h(i10);
                iArr[i7] = h7;
                View view3 = (View) sparseArray.get(h7);
                if (view3 == null) {
                    view3 = this.M.d(iArr[i7]);
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
                c71 c71Var = this.M;
                c71Var.b(viewArr[i7], i10, c71Var.h(i10));
            }
        }
    }

    public boolean b(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public boolean canScrollHorizontally(int i7) {
        boolean z10;
        if (i7 != 0) {
            if (!this.f36672y && !this.I) {
                if (i7 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((z10 || this.f36663b != 0) && (!z10 || this.f36663b != this.M.e() - 1)) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean e(MotionEvent motionEvent) {
        return true;
    }

    public boolean f(MotionEvent motionEvent) {
        return b(motionEvent);
    }

    public final void g() {
        boolean z10;
        float f10;
        View view;
        View view2;
        int measuredWidth;
        int measuredWidth2;
        float f11;
        boolean z11;
        boolean z12;
        VelocityTracker velocityTracker = this.f36670w;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.H);
        }
        if (this.I) {
            View[] viewArr = this.f36665e;
            float x10 = viewArr[0].getX();
            this.f36671x = new AnimatorSet();
            if (this.F != 0.0f) {
                if (Math.abs(0.0f) > 1500.0f) {
                    this.G = false;
                } else if (this.E) {
                    View view3 = viewArr[1];
                    if (view3 != null) {
                        if (view3.getX() > (viewArr[0].getMeasuredWidth() >> 1)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.G = z12;
                    } else {
                        this.G = false;
                    }
                } else {
                    if (viewArr[0].getX() < (viewArr[0].getMeasuredWidth() >> 1)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.G = z11;
                }
            } else {
                if (Math.abs(x10) < viewArr[0].getMeasuredWidth() / 3.0f && (Math.abs(0.0f) < 3500.0f || Math.abs(0.0f) < Math.abs(0.0f))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.G = z10;
            }
            if (this.G) {
                f10 = Math.abs(x10);
                if (this.E) {
                    this.f36671x.playTogether(G(viewArr[0], 0.0f));
                    View view4 = viewArr[1];
                    if (view4 != null) {
                        this.f36671x.playTogether(G(view4, view4.getMeasuredWidth()));
                    }
                } else {
                    this.f36671x.playTogether(G(viewArr[0], 0.0f));
                    View view5 = viewArr[1];
                    if (view5 != null) {
                        this.f36671x.playTogether(G(view5, -view5.getMeasuredWidth()));
                    }
                }
            } else if (this.d >= 0) {
                f10 = viewArr[0].getMeasuredWidth() - Math.abs(x10);
                if (this.E) {
                    this.f36671x.playTogether(G(viewArr[0], -view2.getMeasuredWidth()));
                    View view6 = viewArr[1];
                    if (view6 != null) {
                        this.f36671x.playTogether(G(view6, 0.0f));
                    }
                } else {
                    this.f36671x.playTogether(G(viewArr[0], view.getMeasuredWidth()));
                    View view7 = viewArr[1];
                    if (view7 != null) {
                        this.f36671x.playTogether(G(view7, 0.0f));
                    }
                }
            } else {
                f10 = 0.0f;
            }
            if (this.d < 0) {
                float f12 = this.U;
                if (this.G) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
                ofFloat.addUpdateListener(new y61(this, 3));
                this.f36671x.playTogether(ofFloat);
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(this.O);
            this.f36671x.playTogether(ofFloat2);
            this.f36671x.setInterpolator(V);
            float measuredWidth3 = getMeasuredWidth() / 2;
            float sin = (((float) Math.sin((Math.min(1.0f, (f10 * 1.0f) / measuredWidth) - 0.5f) * 0.47123894f)) * measuredWidth3) + measuredWidth3;
            float abs = Math.abs(0.0f);
            if (abs > 0.0f) {
                measuredWidth2 = Math.round(Math.abs(sin / abs) * 1000.0f) * 4;
            } else {
                measuredWidth2 = (int) (((f10 / getMeasuredWidth()) + 1.0f) * 100.0f);
            }
            this.f36671x.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
            this.f36671x.addListener(new z61(this, 3));
            this.f36671x.start();
            this.f36672y = true;
            this.I = false;
            u(false);
        } else {
            this.J = false;
            a71 a71Var = this.N;
            if (a71Var != null) {
                a71Var.setEnabled(true);
            }
        }
        VelocityTracker velocityTracker2 = this.f36670w;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.f36670w = null;
        }
    }

    public float getAvailableTranslationX() {
        return org.telegram.messenger.g0.f24226q.x;
    }

    public int getCurrentPosition() {
        return this.f36663b;
    }

    public float getCurrentPositionAlpha() {
        View[] viewArr = this.f36665e;
        View view = viewArr[0];
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return Utilities.i(1.0f - Math.abs(viewArr[0].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f);
    }

    public View getCurrentView() {
        return this.f36665e[0];
    }

    public long getManualScrollDuration() {
        return 540L;
    }

    public int getNextPosition() {
        return this.d;
    }

    public float getNextPositionAlpha() {
        View[] viewArr = this.f36665e;
        View view = viewArr[1];
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return Utilities.i(1.0f - Math.abs(viewArr[1].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f);
    }

    public float getPositionAnimated() {
        float f10;
        View[] viewArr = this.f36665e;
        View view = viewArr[0];
        if (view != null && view.getVisibility() == 0) {
            f10 = (this.f36663b * Utilities.i(1.0f - Math.abs(viewArr[0].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f)) + 0.0f;
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
        return this.f36665e;
    }

    public final boolean i() {
        boolean z10;
        if (!this.f36672y) {
            return false;
        }
        boolean z11 = this.G;
        int i7 = -1;
        View[] viewArr = this.f36665e;
        if (z11) {
            if (Math.abs(viewArr[0].getTranslationX()) < 1.0f) {
                D(viewArr[0], 0.0f);
                View view = viewArr[1];
                if (view != null) {
                    int measuredWidth = viewArr[0].getMeasuredWidth();
                    if (this.E) {
                        i7 = 1;
                    }
                    D(view, measuredWidth * i7);
                }
                z10 = true;
            }
            z10 = false;
        } else {
            if (Math.abs(viewArr[1].getTranslationX()) < 1.0f) {
                View view2 = viewArr[0];
                int measuredWidth2 = view2.getMeasuredWidth();
                if (!this.E) {
                    i7 = 1;
                }
                D(view2, measuredWidth2 * i7);
                View view3 = viewArr[1];
                if (view3 != null) {
                    D(view3, 0.0f);
                }
                z10 = true;
            }
            z10 = false;
        }
        u(true);
        if (z10) {
            AnimatorSet animatorSet = this.f36671x;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f36671x = null;
            }
            this.f36672y = false;
        }
        return this.f36672y;
    }

    public final j71 k(int i7, boolean z10) {
        a71 a71Var = new a71(this, getContext(), z10, i7, this.f36662a);
        this.N = a71Var;
        a71Var.f36344r = F();
        this.N.setDelegate(new org.telegram.ui.ActionBar.i5(this));
        l(false);
        return this.N;
    }

    public final void l(boolean z10) {
        a71 a71Var;
        if (this.M != null && (a71Var = this.N) != null) {
            a71Var.c();
            for (int i7 = 0; i7 < this.M.e(); i7++) {
                this.M.getClass();
                this.N.a(this.M.f(i7), this.M.g(i7));
            }
            a();
            if (z10) {
                di.b1 b1Var = this.N.f36348w;
                TransitionSet transitionSet = new TransitionSet();
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(150L);
                transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
                transitionSet.setOrdering(0);
                transitionSet.setInterpolator((TimeInterpolator) kr.f36858f);
                TransitionManager.beginDelayedTransition(b1Var, transitionSet);
            }
            this.N.f36350y.f();
        }
    }

    public final View n(ViewGroup viewGroup, float f10, float f11) {
        View n10;
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt.getVisibility() == 0) {
                Rect rect = this.P;
                childAt.getHitRect(rect);
                if (!rect.contains((int) f10, (int) f11)) {
                    continue;
                } else if (childAt.canScrollHorizontally(-1)) {
                    return childAt;
                } else {
                    if ((childAt instanceof ViewGroup) && (n10 = n((ViewGroup) childAt, f10 - rect.left, f11 - rect.top)) != null) {
                        return n10;
                    }
                }
            }
        }
        return null;
    }

    public final float o(int i7) {
        if (getMeasuredWidth() == 0) {
            return c8.m9.b(1 - Math.abs(getCurrentPosition() - i7), 0, 1);
        }
        return c8.m9.a(1.0f - Math.abs(getPositionAnimated() - i7), 0.0f, 1.0f);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        a71 a71Var = this.N;
        if (a71Var != null && a71Var.K) {
            return false;
        }
        if (i()) {
            return true;
        }
        onTouchEvent(motionEvent);
        return this.I;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return y(motionEvent);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.Q && this.J && !this.I) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void setAdapter(c71 c71Var) {
        this.M = c71Var;
        int h = c71Var.h(this.f36663b);
        int[] iArr = this.f36666f;
        iArr[0] = h;
        View d = c71Var.d(h);
        View[] viewArr = this.f36665e;
        viewArr[0] = d;
        if (d == null && this.f36663b != 0) {
            this.f36663b = 0;
            int h7 = c71Var.h(0);
            iArr[0] = h7;
            viewArr[0] = c71Var.d(h7);
        }
        c71Var.b(viewArr[0], this.f36663b, iArr[0]);
        addView(viewArr[0]);
        viewArr[0].setVisibility(0);
        l(false);
    }

    public void setAllowDisallowInterceptTouch(boolean z10) {
        this.Q = z10;
    }

    public void setPosition(int i7) {
        if (this.M == null) {
            this.f36663b = i7;
            u(false);
        }
        AnimatorSet animatorSet = this.f36671x;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        View[] viewArr = this.f36665e;
        View view = viewArr[1];
        if (view != null) {
            this.h.put(this.f36666f[1], view);
            removeView(viewArr[1]);
            viewArr[1] = null;
        }
        int i10 = this.f36663b;
        if (i10 != i7) {
            this.f36663b = i7;
            this.d = 0;
            this.f36664c = 1.0f;
            View view2 = viewArr[0];
            I(0);
            q(viewArr[0], view2, this.f36663b, i10);
            D(viewArr[0], 0.0f);
            a71 a71Var = this.N;
            if (a71Var != null) {
                a71Var.f(this.f36664c, this.d, this.f36663b);
            }
            u(true);
        }
    }

    public final void u(boolean z10) {
        Iterator it = this.R.iterator();
        if (!it.hasNext()) {
            t(z10);
        } else {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public void w(int i7, boolean z10) {
        v(i7);
    }

    public boolean y(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k71.y(android.view.MotionEvent):boolean");
    }

    public final boolean z(MotionEvent motionEvent, boolean z10) {
        int i7;
        View[] viewArr;
        if (!z10 && this.f36663b == 0) {
            this.U = 0.0f;
            return false;
        } else if ((z10 && this.f36663b == this.M.e() - 1) || this.T != null || !b(motionEvent) || ((z10 && !f(motionEvent)) || (!z10 && !e(motionEvent)))) {
            return false;
        } else {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.J = false;
            this.I = true;
            s();
            this.f36668r = (int) (motionEvent.getX() + this.F);
            a71 a71Var = this.N;
            if (a71Var != null) {
                a71Var.setEnabled(false);
            }
            this.K.d();
            this.E = z10;
            int i10 = this.f36663b;
            if (z10) {
                i7 = 1;
            } else {
                i7 = -1;
            }
            this.d = i10 + i7;
            I(1);
            View view = this.f36665e[1];
            if (view != null) {
                if (z10) {
                    D(view, viewArr[0].getMeasuredWidth());
                } else {
                    D(view, -viewArr[0].getMeasuredWidth());
                }
            }
            u(false);
            return true;
        }
    }

    public void t(boolean z10) {
    }

    public void v(int i7) {
    }

    public void x(int i7) {
    }

    public void a() {
    }

    public void p() {
    }

    public void r() {
    }

    public void s() {
    }

    public void q(View view, View view2, int i7, int i10) {
    }
}

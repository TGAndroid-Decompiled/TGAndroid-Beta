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
public class n61 extends FrameLayout {
    public static final qp0 V = new qp0(1);
    public boolean E;
    public float F;
    public boolean G;
    public final int H;
    public boolean I;
    public boolean J;
    public final g2.g K;
    public final float L;
    public f61 M;
    public d61 N;
    public final ei.n4 O;
    public final Rect P;
    public boolean Q;
    public final ArrayList R;
    public final ArrayList S;
    public ValueAnimator T;
    public float U;
    public final org.telegram.ui.ActionBar.e6 f36383a;
    public int f36384b;
    public float f36385c;
    public int d;
    public final View[] f36386e;
    public final int[] f36387f;
    public final SparseArray h;
    public int f36388n;
    public int f36389r;
    public int f36390s;
    public VelocityTracker f36391w;
    public AnimatorSet f36392x;
    public boolean f36393y;

    public n61(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f36385c = 1.0f;
        this.h = new SparseArray();
        this.K = new g2.g((int[]) null);
        this.O = new ei.n4(this, 10);
        this.P = new Rect();
        this.Q = true;
        this.R = new ArrayList();
        this.S = new ArrayList();
        this.f36383a = e6Var;
        this.L = org.telegram.messenger.g0.a1(true, 0.3f);
        this.H = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.f36387f = new int[2];
        this.f36386e = new View[2];
        setClipChildren(true);
    }

    public static tj0 l(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                View childAt = viewGroup.getChildAt(i3);
                if (childAt instanceof tj0) {
                    return (tj0) childAt;
                }
                if (childAt instanceof ViewGroup) {
                    l(childAt);
                }
            }
            return null;
        }
        return null;
    }

    public boolean A(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n61.A(android.view.MotionEvent):boolean");
    }

    public final boolean B(MotionEvent motionEvent, boolean z10) {
        int i3;
        View[] viewArr;
        if (!z10 && this.f36384b == 0) {
            this.U = 0.0f;
            return false;
        } else if ((z10 && this.f36384b == this.M.e() - 1) || this.T != null || !c(motionEvent) || ((z10 && !f(motionEvent)) || (!z10 && !e(motionEvent)))) {
            return false;
        } else {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.J = false;
            this.I = true;
            t();
            this.f36389r = (int) (motionEvent.getX() + this.F);
            d61 d61Var = this.N;
            if (d61Var != null) {
                d61Var.setEnabled(false);
            }
            this.K.d();
            this.E = z10;
            int i10 = this.f36384b;
            if (z10) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            this.d = i10 + i3;
            K(1);
            View view = this.f36386e[1];
            if (view != null) {
                if (z10) {
                    E(view, viewArr[0].getMeasuredWidth());
                } else {
                    E(view, -viewArr[0].getMeasuredWidth());
                }
            }
            v(false);
            return true;
        }
    }

    public final void C(boolean z10) {
        int i3;
        int intValue;
        onTouchEvent(null);
        f61 f61Var = this.M;
        f61Var.getClass();
        if (!(f61Var instanceof org.telegram.ui.e7)) {
            z10 = false;
        }
        AnimatorSet animatorSet = this.f36392x;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f36392x = null;
        }
        View[] viewArr = this.f36386e;
        View view = viewArr[1];
        if (view != null) {
            removeView(view);
            viewArr[1] = null;
        }
        View view2 = viewArr[0];
        viewArr[1] = view2;
        if (view2 != null && view2.getTag() != null) {
            i3 = ((Integer) viewArr[1].getTag()).intValue();
        } else {
            i3 = 0;
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
        if (this.f36384b > this.M.e() - 1) {
            this.f36384b = this.M.e() - 1;
        }
        if (this.f36384b < 0) {
            this.f36384b = 0;
        }
        int h = this.M.h(this.f36384b);
        int[] iArr = this.f36387f;
        iArr[0] = h;
        View d = this.M.d(h);
        viewArr[0] = d;
        this.M.b(d, this.f36384b, iArr[0]);
        addView(viewArr[0]);
        viewArr[0].setVisibility(0);
        if (viewArr[0].getTag() == null) {
            intValue = 0;
        } else {
            intValue = ((Integer) viewArr[0].getTag()).intValue();
        }
        if (intValue == i3) {
            z10 = false;
        }
        if (z10) {
            this.N.getClass();
        }
        k(z10);
        if (z10) {
            this.f36392x = new AnimatorSet();
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
                this.f36392x.playTogether(H(view7, getMeasuredWidth()));
            }
            View view8 = viewArr[0];
            if (view8 != null) {
                this.f36392x.playTogether(H(view8, 0.0f));
            }
            v(true);
            d61 d61Var = this.N;
            d61Var.f36026a = 0.0f;
            d61Var.f36052w.g1();
            this.N.invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new b61(this, 2));
            this.f36392x.playTogether(ofFloat);
            this.f36392x.setInterpolator(V);
            this.f36392x.setDuration(220L);
            this.f36392x.addListener(new c61(this, 2));
            this.N.setEnabled(false);
            this.f36393y = true;
            this.f36392x.start();
            return;
        }
        View view9 = viewArr[1];
        if (view9 != null) {
            removeView(view9);
            viewArr[1] = null;
        }
    }

    public final boolean D(int i3) {
        ValueAnimator valueAnimator;
        boolean z10;
        int i10;
        if (i3 == this.f36384b || ((valueAnimator = this.T) != null && this.d == i3)) {
            return false;
        }
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.T = null;
        }
        if (this.f36384b < i3) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.E = z10;
        this.d = i3;
        K(1);
        y(i3, z10);
        View[] viewArr = this.f36386e;
        View view = viewArr[0];
        if (view != null) {
            i10 = view.getMeasuredWidth();
        } else {
            i10 = 0;
        }
        if (z10) {
            E(viewArr[1], i10);
        } else {
            E(viewArr[1], -i10);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.T = ofFloat;
        ofFloat.addUpdateListener(new b61(this, 0));
        this.T.addListener(new c61(this, 0));
        this.T.setDuration(getManualScrollDuration());
        this.T.setInterpolator(xq.h);
        this.T.start();
        return true;
    }

    public void E(View view, float f10) {
        int i3;
        int round = Math.round(f10);
        int round2 = Math.round(view.getTranslationX());
        view.setTranslationX(round);
        if (view == this.f36386e[0] && (i3 = round2 - round) != 0) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.S;
                if (i10 < arrayList.size()) {
                    ((pi.g) arrayList.get(i10)).f53582a.h(i3, 0);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public void F() {
        View[] viewArr = this.f36386e;
        View view = viewArr[0];
        View view2 = viewArr[1];
        viewArr[0] = view2;
        viewArr[1] = view;
        int i3 = this.f36384b;
        int i10 = this.d;
        this.f36384b = i10;
        this.d = i3;
        this.f36385c = 1.0f - this.f36385c;
        int[] iArr = this.f36387f;
        int i11 = iArr[0];
        iArr[0] = iArr[1];
        iArr[1] = i11;
        r(view2, view, i10, i3);
    }

    public int G() {
        return 16;
    }

    public final ValueAnimator H(View view, float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(view.getTranslationX(), f10);
        ofFloat.addUpdateListener(new dv0(this, view, 1));
        ofFloat.addListener(new e61(this, view, f10));
        return ofFloat;
    }

    public final void J() {
        int[] iArr = this.f36387f;
        if (iArr[0] != this.M.h(this.f36384b)) {
            K(0);
            View[] viewArr = this.f36386e;
            View view = viewArr[1];
            if (view != null) {
                this.h.put(iArr[1], view);
                removeView(viewArr[1]);
                viewArr[1] = null;
            }
            E(viewArr[0], 0.0f);
            v(true);
        }
    }

    public final void K(int i3) {
        int i10;
        if (i3 == 0) {
            i10 = this.f36384b;
        } else {
            i10 = this.d;
        }
        if (i10 >= 0 && i10 < this.M.e()) {
            View[] viewArr = this.f36386e;
            View view = viewArr[i3];
            float f10 = 0.0f;
            SparseArray sparseArray = this.h;
            int[] iArr = this.f36387f;
            if (view == null) {
                int h = this.M.h(i10);
                iArr[i3] = h;
                View view2 = (View) sparseArray.get(h);
                if (view2 == null) {
                    view2 = this.M.d(iArr[i3]);
                } else {
                    sparseArray.remove(iArr[i3]);
                }
                if (view2.getParent() != null) {
                    ((ViewGroup) view2.getParent()).removeView(view2);
                }
                addView(view2);
                if (i3 != 0) {
                    f10 = getMeasuredWidth();
                }
                view2.setTranslationX(f10);
                viewArr[i3] = view2;
                this.M.b(view2, i10, iArr[i3]);
                viewArr[i3].setVisibility(0);
            } else if (iArr[i3] == this.M.h(i10)) {
                this.M.b(viewArr[i3], i10, iArr[i3]);
                viewArr[i3].setVisibility(0);
            } else {
                sparseArray.put(iArr[i3], viewArr[i3]);
                viewArr[i3].setVisibility(8);
                removeView(viewArr[i3]);
                int h7 = this.M.h(i10);
                iArr[i3] = h7;
                View view3 = (View) sparseArray.get(h7);
                if (view3 == null) {
                    view3 = this.M.d(iArr[i3]);
                } else {
                    sparseArray.remove(iArr[i3]);
                }
                if (i3 != 0) {
                    f10 = getMeasuredWidth();
                }
                view3.setTranslationX(f10);
                addView(view3);
                viewArr[i3] = view3;
                view3.setVisibility(0);
                f61 f61Var = this.M;
                f61Var.b(viewArr[i3], i10, f61Var.h(i10));
            }
        }
    }

    public boolean c(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public boolean canScrollHorizontally(int i3) {
        boolean z10;
        if (i3 != 0) {
            if (!this.f36393y && !this.I) {
                if (i3 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((z10 || this.f36384b != 0) && (!z10 || this.f36384b != this.M.e() - 1)) {
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
        return c(motionEvent);
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
        VelocityTracker velocityTracker = this.f36391w;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.H);
        }
        if (this.I) {
            View[] viewArr = this.f36386e;
            float x10 = viewArr[0].getX();
            this.f36392x = new AnimatorSet();
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
                    this.f36392x.playTogether(H(viewArr[0], 0.0f));
                    View view4 = viewArr[1];
                    if (view4 != null) {
                        this.f36392x.playTogether(H(view4, view4.getMeasuredWidth()));
                    }
                } else {
                    this.f36392x.playTogether(H(viewArr[0], 0.0f));
                    View view5 = viewArr[1];
                    if (view5 != null) {
                        this.f36392x.playTogether(H(view5, -view5.getMeasuredWidth()));
                    }
                }
            } else if (this.d >= 0) {
                f10 = viewArr[0].getMeasuredWidth() - Math.abs(x10);
                if (this.E) {
                    this.f36392x.playTogether(H(viewArr[0], -view2.getMeasuredWidth()));
                    View view6 = viewArr[1];
                    if (view6 != null) {
                        this.f36392x.playTogether(H(view6, 0.0f));
                    }
                } else {
                    this.f36392x.playTogether(H(viewArr[0], view.getMeasuredWidth()));
                    View view7 = viewArr[1];
                    if (view7 != null) {
                        this.f36392x.playTogether(H(view7, 0.0f));
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
                ofFloat.addUpdateListener(new b61(this, 3));
                this.f36392x.playTogether(ofFloat);
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(this.O);
            this.f36392x.playTogether(ofFloat2);
            this.f36392x.setInterpolator(V);
            float measuredWidth3 = getMeasuredWidth() / 2;
            float sin = (((float) Math.sin((Math.min(1.0f, (f10 * 1.0f) / measuredWidth) - 0.5f) * 0.47123894f)) * measuredWidth3) + measuredWidth3;
            float abs = Math.abs(0.0f);
            if (abs > 0.0f) {
                measuredWidth2 = Math.round(Math.abs(sin / abs) * 1000.0f) * 4;
            } else {
                measuredWidth2 = (int) (((f10 / getMeasuredWidth()) + 1.0f) * 100.0f);
            }
            this.f36392x.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
            this.f36392x.addListener(new c61(this, 3));
            this.f36392x.start();
            this.f36393y = true;
            this.I = false;
            v(false);
        } else {
            this.J = false;
            d61 d61Var = this.N;
            if (d61Var != null) {
                d61Var.setEnabled(true);
            }
        }
        VelocityTracker velocityTracker2 = this.f36391w;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.f36391w = null;
        }
    }

    public float getAvailableTranslationX() {
        return org.telegram.messenger.g0.f22608q.x;
    }

    public int getCurrentPosition() {
        return this.f36384b;
    }

    public float getCurrentPositionAlpha() {
        View[] viewArr = this.f36386e;
        View view = viewArr[0];
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return Utilities.i(1.0f - Math.abs(viewArr[0].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f);
    }

    public View getCurrentView() {
        return this.f36386e[0];
    }

    public long getManualScrollDuration() {
        return 540L;
    }

    public int getNextPosition() {
        return this.d;
    }

    public float getNextPositionAlpha() {
        View[] viewArr = this.f36386e;
        View view = viewArr[1];
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return Utilities.i(1.0f - Math.abs(viewArr[1].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f);
    }

    public float getPositionAnimated() {
        float f10;
        View[] viewArr = this.f36386e;
        View view = viewArr[0];
        if (view != null && view.getVisibility() == 0) {
            f10 = (this.f36384b * Utilities.i(1.0f - Math.abs(viewArr[0].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f)) + 0.0f;
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
        return this.f36386e;
    }

    public final boolean i() {
        boolean z10;
        if (!this.f36393y) {
            return false;
        }
        boolean z11 = this.G;
        int i3 = -1;
        View[] viewArr = this.f36386e;
        if (z11) {
            if (Math.abs(viewArr[0].getTranslationX()) < 1.0f) {
                E(viewArr[0], 0.0f);
                View view = viewArr[1];
                if (view != null) {
                    int measuredWidth = viewArr[0].getMeasuredWidth();
                    if (this.E) {
                        i3 = 1;
                    }
                    E(view, measuredWidth * i3);
                }
                z10 = true;
            }
            z10 = false;
        } else {
            if (Math.abs(viewArr[1].getTranslationX()) < 1.0f) {
                View view2 = viewArr[0];
                int measuredWidth2 = view2.getMeasuredWidth();
                if (!this.E) {
                    i3 = 1;
                }
                E(view2, measuredWidth2 * i3);
                View view3 = viewArr[1];
                if (view3 != null) {
                    E(view3, 0.0f);
                }
                z10 = true;
            }
            z10 = false;
        }
        v(true);
        if (z10) {
            AnimatorSet animatorSet = this.f36392x;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f36392x = null;
            }
            this.f36393y = false;
        }
        return this.f36393y;
    }

    public final m61 j(int i3, boolean z10) {
        d61 d61Var = new d61(this, getContext(), z10, i3, this.f36383a);
        this.N = d61Var;
        d61Var.f36048r = G();
        this.N.setDelegate(new y00(this));
        k(false);
        return this.N;
    }

    public final void k(boolean z10) {
        d61 d61Var;
        if (this.M != null && (d61Var = this.N) != null) {
            d61Var.h.clear();
            d61Var.f36031c0.clear();
            d61Var.f36032d0.clear();
            d61Var.f36034e0.clear();
            d61Var.f36036f0.clear();
            d61Var.I = 0;
            for (int i3 = 0; i3 < this.M.e(); i3++) {
                this.M.getClass();
                this.N.a(this.M.f(i3), this.M.g(i3));
            }
            a();
            if (z10) {
                ci.j1 j1Var = this.N.f36052w;
                TransitionSet transitionSet = new TransitionSet();
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(150L);
                transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
                transitionSet.setOrdering(0);
                transitionSet.setInterpolator((TimeInterpolator) xq.f40452f);
                TransitionManager.beginDelayedTransition(j1Var, transitionSet);
            }
            this.N.f36054y.f();
        }
    }

    public final View m(ViewGroup viewGroup, float f10, float f11) {
        View m10;
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if (childAt.getVisibility() == 0) {
                Rect rect = this.P;
                childAt.getHitRect(rect);
                if (!rect.contains((int) f10, (int) f11)) {
                    continue;
                } else if (childAt.canScrollHorizontally(-1)) {
                    return childAt;
                } else {
                    if ((childAt instanceof ViewGroup) && (m10 = m((ViewGroup) childAt, f10 - rect.left, f11 - rect.top)) != null) {
                        return m10;
                    }
                }
            }
        }
        return null;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        d61 d61Var = this.N;
        if (d61Var != null && d61Var.K) {
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
        return A(motionEvent);
    }

    public final float p(int i3) {
        if (getMeasuredWidth() == 0) {
            return b8.be.b(1 - Math.abs(getCurrentPosition() - i3), 0, 1);
        }
        return b8.be.a(1.0f - Math.abs(getPositionAnimated() - i3), 0.0f, 1.0f);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.Q && this.J && !this.I) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void setAdapter(f61 f61Var) {
        this.M = f61Var;
        int h = f61Var.h(this.f36384b);
        int[] iArr = this.f36387f;
        iArr[0] = h;
        View d = f61Var.d(h);
        View[] viewArr = this.f36386e;
        viewArr[0] = d;
        if (d == null && this.f36384b != 0) {
            this.f36384b = 0;
            int h7 = f61Var.h(0);
            iArr[0] = h7;
            viewArr[0] = f61Var.d(h7);
        }
        f61Var.b(viewArr[0], this.f36384b, iArr[0]);
        addView(viewArr[0]);
        viewArr[0].setVisibility(0);
        k(false);
    }

    public void setAllowDisallowInterceptTouch(boolean z10) {
        this.Q = z10;
    }

    public void setPosition(int i3) {
        if (this.M == null) {
            this.f36384b = i3;
            v(false);
        }
        AnimatorSet animatorSet = this.f36392x;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        View[] viewArr = this.f36386e;
        View view = viewArr[1];
        if (view != null) {
            this.h.put(this.f36387f[1], view);
            removeView(viewArr[1]);
            viewArr[1] = null;
        }
        int i10 = this.f36384b;
        if (i10 != i3) {
            this.f36384b = i3;
            this.d = 0;
            this.f36385c = 1.0f;
            View view2 = viewArr[0];
            K(0);
            r(viewArr[0], view2, this.f36384b, i10);
            E(viewArr[0], 0.0f);
            d61 d61Var = this.N;
            if (d61Var != null) {
                d61Var.e(this.f36385c, this.d, this.f36384b);
            }
            v(true);
        }
    }

    public final void v(boolean z10) {
        Iterator it = this.R.iterator();
        if (!it.hasNext()) {
            u(z10);
            return;
        }
        throw a1.g.m(it);
    }

    public void y(int i3, boolean z10) {
        x(i3);
    }

    public void u(boolean z10) {
    }

    public void x(int i3) {
    }

    public void z(int i3) {
    }

    public void a() {
    }

    public void q() {
    }

    public void s() {
    }

    public void t() {
    }

    public void r(View view, View view2, int i3, int i10) {
    }
}

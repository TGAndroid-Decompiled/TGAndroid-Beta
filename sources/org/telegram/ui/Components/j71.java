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
public class j71 extends FrameLayout {
    public static final dq0 V = new dq0(1);
    public boolean E;
    public float F;
    public boolean G;
    public final int H;
    public boolean I;
    public boolean J;
    public final h2.f K;
    public final float L;
    public b71 M;
    public z61 N;
    public final fi.d4 O;
    public final Rect P;
    public boolean Q;
    public final ArrayList R;
    public final ArrayList S;
    public ValueAnimator T;
    public float U;
    public final org.telegram.ui.ActionBar.h6 f36437a;
    public int f36438b;
    public float f36439c;
    public int d;
    public final View[] f36440e;
    public final int[] f36441f;
    public final SparseArray h;
    public int f36442n;
    public int f36443r;
    public int f36444s;
    public VelocityTracker f36445w;
    public AnimatorSet f36446x;
    public boolean f36447y;

    public j71(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f36439c = 1.0f;
        this.h = new SparseArray();
        this.K = new h2.f((int[]) null);
        this.O = new fi.d4(this, 10);
        this.P = new Rect();
        this.Q = true;
        this.R = new ArrayList();
        this.S = new ArrayList();
        this.f36437a = h6Var;
        this.L = org.telegram.messenger.g0.a1(true, 0.3f);
        this.H = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.f36441f = new int[2];
        this.f36440e = new View[2];
        setClipChildren(true);
    }

    public static ek0 k(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (childAt instanceof ek0) {
                    return (ek0) childAt;
                }
                if (childAt instanceof ViewGroup) {
                    k(childAt);
                }
            }
            return null;
        }
        return null;
    }

    public final boolean A(int i7) {
        ValueAnimator valueAnimator;
        boolean z10;
        int i10;
        if (i7 == this.f36438b || ((valueAnimator = this.T) != null && this.d == i7)) {
            return false;
        }
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.T = null;
        }
        if (this.f36438b < i7) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.E = z10;
        this.d = i7;
        G(1);
        v(i7, z10);
        View[] viewArr = this.f36440e;
        View view = viewArr[0];
        if (view != null) {
            i10 = view.getMeasuredWidth();
        } else {
            i10 = 0;
        }
        if (z10) {
            B(viewArr[1], i10);
        } else {
            B(viewArr[1], -i10);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.T = ofFloat;
        ofFloat.addUpdateListener(new x61(this, 0));
        this.T.addListener(new y61(this, 0));
        this.T.setDuration(getManualScrollDuration());
        this.T.setInterpolator(nr.h);
        this.T.start();
        return true;
    }

    public void B(View view, float f10) {
        int i7;
        int round = Math.round(f10);
        int round2 = Math.round(view.getTranslationX());
        view.setTranslationX(round);
        if (view == this.f36440e[0] && (i7 = round2 - round) != 0) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.S;
                if (i10 < arrayList.size()) {
                    ((ri.g) arrayList.get(i10)).f56715a.h(i7, 0);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public void C() {
        View[] viewArr = this.f36440e;
        View view = viewArr[0];
        View view2 = viewArr[1];
        viewArr[0] = view2;
        viewArr[1] = view;
        int i7 = this.f36438b;
        int i10 = this.d;
        this.f36438b = i10;
        this.d = i7;
        this.f36439c = 1.0f - this.f36439c;
        int[] iArr = this.f36441f;
        int i11 = iArr[0];
        iArr[0] = iArr[1];
        iArr[1] = i11;
        p(view2, view, i10, i7);
    }

    public int D() {
        return 16;
    }

    public final ValueAnimator E(View view, float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(view.getTranslationX(), f10);
        ofFloat.addUpdateListener(new rv0(this, view, 1));
        ofFloat.addListener(new a71(this, view, f10));
        return ofFloat;
    }

    public final void F() {
        int[] iArr = this.f36441f;
        if (iArr[0] != this.M.h(this.f36438b)) {
            G(0);
            View[] viewArr = this.f36440e;
            View view = viewArr[1];
            if (view != null) {
                this.h.put(iArr[1], view);
                removeView(viewArr[1]);
                viewArr[1] = null;
            }
            B(viewArr[0], 0.0f);
            t(true);
        }
    }

    public final void G(int i7) {
        int i10;
        if (i7 == 0) {
            i10 = this.f36438b;
        } else {
            i10 = this.d;
        }
        if (i10 >= 0 && i10 < this.M.e()) {
            View[] viewArr = this.f36440e;
            View view = viewArr[i7];
            float f10 = 0.0f;
            SparseArray sparseArray = this.h;
            int[] iArr = this.f36441f;
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
                b71 b71Var = this.M;
                b71Var.b(viewArr[i7], i10, b71Var.h(i10));
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
            if (!this.f36447y && !this.I) {
                if (i7 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((z10 || this.f36438b != 0) && (!z10 || this.f36438b != this.M.e() - 1)) {
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
        VelocityTracker velocityTracker = this.f36445w;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.H);
        }
        if (this.I) {
            View[] viewArr = this.f36440e;
            float x10 = viewArr[0].getX();
            this.f36446x = new AnimatorSet();
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
                    this.f36446x.playTogether(E(viewArr[0], 0.0f));
                    View view4 = viewArr[1];
                    if (view4 != null) {
                        this.f36446x.playTogether(E(view4, view4.getMeasuredWidth()));
                    }
                } else {
                    this.f36446x.playTogether(E(viewArr[0], 0.0f));
                    View view5 = viewArr[1];
                    if (view5 != null) {
                        this.f36446x.playTogether(E(view5, -view5.getMeasuredWidth()));
                    }
                }
            } else if (this.d >= 0) {
                f10 = viewArr[0].getMeasuredWidth() - Math.abs(x10);
                if (this.E) {
                    this.f36446x.playTogether(E(viewArr[0], -view2.getMeasuredWidth()));
                    View view6 = viewArr[1];
                    if (view6 != null) {
                        this.f36446x.playTogether(E(view6, 0.0f));
                    }
                } else {
                    this.f36446x.playTogether(E(viewArr[0], view.getMeasuredWidth()));
                    View view7 = viewArr[1];
                    if (view7 != null) {
                        this.f36446x.playTogether(E(view7, 0.0f));
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
                ofFloat.addUpdateListener(new x61(this, 3));
                this.f36446x.playTogether(ofFloat);
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(this.O);
            this.f36446x.playTogether(ofFloat2);
            this.f36446x.setInterpolator(V);
            float measuredWidth3 = getMeasuredWidth() / 2;
            float sin = (((float) Math.sin((Math.min(1.0f, (f10 * 1.0f) / measuredWidth) - 0.5f) * 0.47123894f)) * measuredWidth3) + measuredWidth3;
            float abs = Math.abs(0.0f);
            if (abs > 0.0f) {
                measuredWidth2 = Math.round(Math.abs(sin / abs) * 1000.0f) * 4;
            } else {
                measuredWidth2 = (int) (((f10 / getMeasuredWidth()) + 1.0f) * 100.0f);
            }
            this.f36446x.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
            this.f36446x.addListener(new y61(this, 3));
            this.f36446x.start();
            this.f36447y = true;
            this.I = false;
            t(false);
        } else {
            this.J = false;
            z61 z61Var = this.N;
            if (z61Var != null) {
                z61Var.setEnabled(true);
            }
        }
        VelocityTracker velocityTracker2 = this.f36445w;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.f36445w = null;
        }
    }

    public float getAvailableTranslationX() {
        return org.telegram.messenger.g0.f24146q.x;
    }

    public int getCurrentPosition() {
        return this.f36438b;
    }

    public float getCurrentPositionAlpha() {
        View[] viewArr = this.f36440e;
        View view = viewArr[0];
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return Utilities.i(1.0f - Math.abs(viewArr[0].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f);
    }

    public View getCurrentView() {
        return this.f36440e[0];
    }

    public long getManualScrollDuration() {
        return 540L;
    }

    public int getNextPosition() {
        return this.d;
    }

    public float getNextPositionAlpha() {
        View[] viewArr = this.f36440e;
        View view = viewArr[1];
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return Utilities.i(1.0f - Math.abs(viewArr[1].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f);
    }

    public float getPositionAnimated() {
        float f10;
        View[] viewArr = this.f36440e;
        View view = viewArr[0];
        if (view != null && view.getVisibility() == 0) {
            f10 = (this.f36438b * Utilities.i(1.0f - Math.abs(viewArr[0].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f)) + 0.0f;
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
        return this.f36440e;
    }

    public final boolean h() {
        boolean z10;
        if (!this.f36447y) {
            return false;
        }
        boolean z11 = this.G;
        int i7 = -1;
        View[] viewArr = this.f36440e;
        if (z11) {
            if (Math.abs(viewArr[0].getTranslationX()) < 1.0f) {
                B(viewArr[0], 0.0f);
                View view = viewArr[1];
                if (view != null) {
                    int measuredWidth = viewArr[0].getMeasuredWidth();
                    if (this.E) {
                        i7 = 1;
                    }
                    B(view, measuredWidth * i7);
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
                B(view2, measuredWidth2 * i7);
                View view3 = viewArr[1];
                if (view3 != null) {
                    B(view3, 0.0f);
                }
                z10 = true;
            }
            z10 = false;
        }
        t(true);
        if (z10) {
            AnimatorSet animatorSet = this.f36446x;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f36446x = null;
            }
            this.f36447y = false;
        }
        return this.f36447y;
    }

    public final i71 i(int i7, boolean z10) {
        z61 z61Var = new z61(this, getContext(), z10, i7, this.f36437a);
        this.N = z61Var;
        z61Var.f36222r = D();
        this.N.setDelegate(new org.telegram.ui.Cells.c5(this));
        j(false);
        return this.N;
    }

    public final void j(boolean z10) {
        z61 z61Var;
        if (this.M != null && (z61Var = this.N) != null) {
            z61Var.c();
            for (int i7 = 0; i7 < this.M.e(); i7++) {
                this.M.getClass();
                this.N.a(this.M.f(i7), this.M.g(i7));
            }
            a();
            if (z10) {
                di.b1 b1Var = this.N.f36226w;
                TransitionSet transitionSet = new TransitionSet();
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(150L);
                transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
                transitionSet.setOrdering(0);
                transitionSet.setInterpolator((TimeInterpolator) nr.f37956f);
                TransitionManager.beginDelayedTransition(b1Var, transitionSet);
            }
            this.N.f36228y.f();
        }
    }

    public final View l(ViewGroup viewGroup, float f10, float f11) {
        View l10;
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
                    if ((childAt instanceof ViewGroup) && (l10 = l((ViewGroup) childAt, f10 - rect.left, f11 - rect.top)) != null) {
                        return l10;
                    }
                }
            }
        }
        return null;
    }

    public final float m(int i7) {
        if (getMeasuredWidth() == 0) {
            return c8.l9.b(1 - Math.abs(getCurrentPosition() - i7), 0, 1);
        }
        return c8.l9.a(1.0f - Math.abs(getPositionAnimated() - i7), 0.0f, 1.0f);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        z61 z61Var = this.N;
        if (z61Var != null && z61Var.K) {
            return false;
        }
        if (h()) {
            return true;
        }
        onTouchEvent(motionEvent);
        return this.I;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return x(motionEvent);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.Q && this.J && !this.I) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void setAdapter(b71 b71Var) {
        this.M = b71Var;
        int h = b71Var.h(this.f36438b);
        int[] iArr = this.f36441f;
        iArr[0] = h;
        View d = b71Var.d(h);
        View[] viewArr = this.f36440e;
        viewArr[0] = d;
        if (d == null && this.f36438b != 0) {
            this.f36438b = 0;
            int h7 = b71Var.h(0);
            iArr[0] = h7;
            viewArr[0] = b71Var.d(h7);
        }
        b71Var.b(viewArr[0], this.f36438b, iArr[0]);
        addView(viewArr[0]);
        viewArr[0].setVisibility(0);
        j(false);
    }

    public void setAllowDisallowInterceptTouch(boolean z10) {
        this.Q = z10;
    }

    public void setPosition(int i7) {
        if (this.M == null) {
            this.f36438b = i7;
            t(false);
        }
        AnimatorSet animatorSet = this.f36446x;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        View[] viewArr = this.f36440e;
        View view = viewArr[1];
        if (view != null) {
            this.h.put(this.f36441f[1], view);
            removeView(viewArr[1]);
            viewArr[1] = null;
        }
        int i10 = this.f36438b;
        if (i10 != i7) {
            this.f36438b = i7;
            this.d = 0;
            this.f36439c = 1.0f;
            View view2 = viewArr[0];
            G(0);
            p(viewArr[0], view2, this.f36438b, i10);
            B(viewArr[0], 0.0f);
            z61 z61Var = this.N;
            if (z61Var != null) {
                z61Var.f(this.f36439c, this.d, this.f36438b);
            }
            t(true);
        }
    }

    public final void t(boolean z10) {
        Iterator it = this.R.iterator();
        if (!it.hasNext()) {
            s(z10);
        } else {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public void v(int i7, boolean z10) {
        u(i7);
    }

    public boolean x(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j71.x(android.view.MotionEvent):boolean");
    }

    public final boolean y(MotionEvent motionEvent, boolean z10) {
        int i7;
        View[] viewArr;
        if (!z10 && this.f36438b == 0) {
            this.U = 0.0f;
            return false;
        } else if ((z10 && this.f36438b == this.M.e() - 1) || this.T != null || !b(motionEvent) || ((z10 && !f(motionEvent)) || (!z10 && !e(motionEvent)))) {
            return false;
        } else {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.J = false;
            this.I = true;
            r();
            this.f36443r = (int) (motionEvent.getX() + this.F);
            z61 z61Var = this.N;
            if (z61Var != null) {
                z61Var.setEnabled(false);
            }
            this.K.d();
            this.E = z10;
            int i10 = this.f36438b;
            if (z10) {
                i7 = 1;
            } else {
                i7 = -1;
            }
            this.d = i10 + i7;
            G(1);
            View view = this.f36440e[1];
            if (view != null) {
                if (z10) {
                    B(view, viewArr[0].getMeasuredWidth());
                } else {
                    B(view, -viewArr[0].getMeasuredWidth());
                }
            }
            t(false);
            return true;
        }
    }

    public final void z(boolean z10) {
        int i7;
        int intValue;
        onTouchEvent(null);
        b71 b71Var = this.M;
        b71Var.getClass();
        if (!(b71Var instanceof org.telegram.ui.c7)) {
            z10 = false;
        }
        AnimatorSet animatorSet = this.f36446x;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f36446x = null;
        }
        View[] viewArr = this.f36440e;
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
        if (this.f36438b > this.M.e() - 1) {
            this.f36438b = this.M.e() - 1;
        }
        if (this.f36438b < 0) {
            this.f36438b = 0;
        }
        int h = this.M.h(this.f36438b);
        int[] iArr = this.f36441f;
        iArr[0] = h;
        View d = this.M.d(h);
        viewArr[0] = d;
        this.M.b(d, this.f36438b, iArr[0]);
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
        j(z10);
        if (z10) {
            this.f36446x = new AnimatorSet();
            View view5 = viewArr[1];
            if (view5 != null) {
                B(view5, 0.0f);
            }
            View view6 = viewArr[0];
            if (view6 != null) {
                B(view6, -getMeasuredWidth());
            }
            View view7 = viewArr[1];
            if (view7 != null) {
                this.f36446x.playTogether(E(view7, getMeasuredWidth()));
            }
            View view8 = viewArr[0];
            if (view8 != null) {
                this.f36446x.playTogether(E(view8, 0.0f));
            }
            t(true);
            z61 z61Var = this.N;
            z61Var.f36200a = 0.0f;
            z61Var.f36226w.g1();
            this.N.invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new x61(this, 2));
            this.f36446x.playTogether(ofFloat);
            this.f36446x.setInterpolator(V);
            this.f36446x.setDuration(220L);
            this.f36446x.addListener(new y61(this, 2));
            this.N.setEnabled(false);
            this.f36447y = true;
            this.f36446x.start();
            return;
        }
        View view9 = viewArr[1];
        if (view9 != null) {
            removeView(view9);
            viewArr[1] = null;
        }
    }

    public void s(boolean z10) {
    }

    public void u(int i7) {
    }

    public void w(int i7) {
    }

    public void a() {
    }

    public void o() {
    }

    public void q() {
    }

    public void r() {
    }

    public void p(View view, View view2, int i7, int i10) {
    }
}

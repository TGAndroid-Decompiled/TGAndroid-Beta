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

public class p71 extends FrameLayout {
    public static final sq0 O = new sq0(1);
    public float A;
    public boolean B;
    public final int C;
    public boolean D;
    public boolean E;
    public final AnimationNotificationsLocker F;
    public final float G;
    public g71 H;
    public e71 I;
    public final ag.q1 J;
    public final Rect K;
    public boolean L;
    public ValueAnimator M;
    public float N;

    public final org.telegram.ui.ActionBar.c6 f31542a;

    public int f31543b;

    public float f31544c;
    public int d;

    public final View[] f31545e;

    public final int[] f31546f;
    public final SparseArray h;

    public int f31547n;

    public int f31548r;

    public int f31549s;
    public VelocityTracker v;

    public AnimatorSet f31550w;

    public boolean f31551x;

    public boolean f31552y;

    public p71(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f31544c = 1.0f;
        this.h = new SparseArray();
        this.F = new AnimationNotificationsLocker();
        this.J = new ag.q1(this, 9);
        this.K = new Rect();
        this.L = true;
        this.f31542a = c6Var;
        this.G = AndroidUtilities.getPixelsInCM(0.3f, true);
        this.C = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.f31546f = new int[2];
        this.f31545e = new View[2];
        setClipChildren(true);
    }

    public static zk0 p(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof zk0) {
                return (zk0) childAt;
            }
            if (childAt instanceof ViewGroup) {
                p(childAt);
            }
        }
        return null;
    }

    public final boolean A(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p71.A(android.view.MotionEvent):boolean");
    }

    public final boolean B(MotionEvent motionEvent, boolean z10) {
        if (!z10 && this.f31543b == 0) {
            this.N = 0.0f;
            return false;
        }
        if ((z10 && this.f31543b == this.H.e() - 1) || this.M != null || !i(motionEvent) || ((z10 && !k(motionEvent)) || (!z10 && !j(motionEvent)))) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.E = false;
        this.D = true;
        v();
        this.f31548r = (int) (motionEvent.getX() + this.A);
        e71 e71Var = this.I;
        if (e71Var != null) {
            e71Var.setEnabled(false);
        }
        this.F.lock();
        this.f31552y = z10;
        this.d = this.f31543b + (z10 ? 1 : -1);
        I(1);
        View[] viewArr = this.f31545e;
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

    public final void C(boolean z10) {
        onTouchEvent(null);
        g71 g71Var = this.H;
        g71Var.getClass();
        if (!(g71Var instanceof org.telegram.ui.e7)) {
            z10 = false;
        }
        AnimatorSet animatorSet = this.f31550w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f31550w = null;
        }
        View[] viewArr = this.f31545e;
        View view = viewArr[1];
        if (view != null) {
            removeView(view);
            viewArr[1] = null;
        }
        View view2 = viewArr[0];
        viewArr[1] = view2;
        int iIntValue = (view2 == null || view2.getTag() == null) ? 0 : ((Integer) viewArr[1].getTag()).intValue();
        if (this.H.e() == 0) {
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
        if (this.f31543b > this.H.e() - 1) {
            this.f31543b = this.H.e() - 1;
        }
        if (this.f31543b < 0) {
            this.f31543b = 0;
        }
        int iH = this.H.h(this.f31543b);
        int[] iArr = this.f31546f;
        iArr[0] = iH;
        View viewD = this.H.d(iH);
        viewArr[0] = viewD;
        this.H.b(viewD, this.f31543b, iArr[0]);
        addView(viewArr[0]);
        viewArr[0].setVisibility(0);
        if ((viewArr[0].getTag() == null ? 0 : ((Integer) viewArr[0].getTag()).intValue()) == iIntValue) {
            z10 = false;
        }
        if (z10) {
            this.I.getClass();
        }
        o(z10);
        if (!z10) {
            View view5 = viewArr[1];
            if (view5 != null) {
                removeView(view5);
                viewArr[1] = null;
                return;
            }
            return;
        }
        this.f31550w = new AnimatorSet();
        View view6 = viewArr[1];
        if (view6 != null) {
            E(view6, 0.0f);
        }
        View view7 = viewArr[0];
        if (view7 != null) {
            E(view7, -getMeasuredWidth());
        }
        View view8 = viewArr[1];
        if (view8 != null) {
            this.f31550w.playTogether(H(view8, getMeasuredWidth()));
        }
        View view9 = viewArr[0];
        if (view9 != null) {
            this.f31550w.playTogether(H(view9, 0.0f));
        }
        w(true);
        e71 e71Var = this.I;
        e71Var.f31204a = 0.0f;
        e71Var.v.f1();
        this.I.invalidate();
        int i10 = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new c71(this, i10));
        this.f31550w.playTogether(valueAnimatorOfFloat);
        this.f31550w.setInterpolator(O);
        this.f31550w.setDuration(220L);
        this.f31550w.addListener(new d71(this, i10));
        this.I.setEnabled(false);
        this.f31551x = true;
        this.f31550w.start();
    }

    public final void D(int i10) {
        if (i10 != this.f31543b) {
            ValueAnimator valueAnimator = this.M;
            if (valueAnimator == null || this.d != i10) {
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.M = null;
                }
                int i11 = 0;
                boolean z10 = this.f31543b < i10;
                this.f31552y = z10;
                this.d = i10;
                I(1);
                y(i10, z10);
                View[] viewArr = this.f31545e;
                View view = viewArr[0];
                int measuredWidth = view != null ? view.getMeasuredWidth() : 0;
                if (z10) {
                    E(viewArr[1], measuredWidth);
                } else {
                    E(viewArr[1], -measuredWidth);
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.M = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new c71(this, i11));
                this.M.addListener(new d71(this, i11));
                this.M.setDuration(getManualScrollDuration());
                this.M.setInterpolator(er.h);
                this.M.start();
            }
        }
    }

    public void E(View view, float f10) {
        view.setTranslationX(f10);
    }

    public void F() {
        View[] viewArr = this.f31545e;
        View view = viewArr[0];
        View view2 = viewArr[1];
        viewArr[0] = view2;
        viewArr[1] = view;
        int i10 = this.f31543b;
        int i11 = this.d;
        this.f31543b = i11;
        this.d = i10;
        this.f31544c = 1.0f - this.f31544c;
        int[] iArr = this.f31546f;
        int i12 = iArr[0];
        iArr[0] = iArr[1];
        iArr[1] = i12;
        t(view2, view, i11, i10);
    }

    public int G() {
        return 16;
    }

    public final ValueAnimator H(View view, float f10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(view.getTranslationX(), f10);
        valueAnimatorOfFloat.addUpdateListener(new mw0(this, view, 1));
        valueAnimatorOfFloat.addListener(new f71(this, view, f10));
        return valueAnimatorOfFloat;
    }

    public final void I(int i10) {
        int i11 = i10 == 0 ? this.f31543b : this.d;
        if (i11 < 0 || i11 >= this.H.e()) {
            return;
        }
        View[] viewArr = this.f31545e;
        View view = viewArr[i10];
        SparseArray sparseArray = this.h;
        int[] iArr = this.f31546f;
        if (view == null) {
            int iH = this.H.h(i11);
            iArr[i10] = iH;
            View viewD = (View) sparseArray.get(iH);
            if (viewD == null) {
                viewD = this.H.d(iArr[i10]);
            } else {
                sparseArray.remove(iArr[i10]);
            }
            if (viewD.getParent() != null) {
                ((ViewGroup) viewD.getParent()).removeView(viewD);
            }
            addView(viewD);
            viewD.setTranslationX(getMeasuredWidth());
            viewArr[i10] = viewD;
            this.H.b(viewD, i11, iArr[i10]);
            viewArr[i10].setVisibility(0);
            return;
        }
        if (iArr[i10] == this.H.h(i11)) {
            this.H.b(viewArr[i10], i11, iArr[i10]);
            viewArr[i10].setVisibility(0);
            return;
        }
        sparseArray.put(iArr[i10], viewArr[i10]);
        viewArr[i10].setVisibility(8);
        removeView(viewArr[i10]);
        int iH2 = this.H.h(i11);
        iArr[i10] = iH2;
        View viewD2 = (View) sparseArray.get(iH2);
        if (viewD2 == null) {
            viewD2 = this.H.d(iArr[i10]);
        } else {
            sparseArray.remove(iArr[i10]);
        }
        addView(viewD2);
        viewArr[i10] = viewD2;
        viewD2.setVisibility(0);
        g71 g71Var = this.H;
        g71Var.b(viewArr[i10], i11, g71Var.h(i11));
    }

    @Override
    public final boolean canScrollHorizontally(int i10) {
        if (i10 != 0) {
            if (!this.f31551x && !this.D) {
                boolean z10 = i10 > 0;
                if ((z10 || this.f31543b != 0) && (!z10 || this.f31543b != this.H.e() - 1)) {
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
        return this.f31543b;
    }

    public float getCurrentPositionAlpha() {
        View[] viewArr = this.f31545e;
        View view = viewArr[0];
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return Utilities.clamp(1.0f - Math.abs(viewArr[0].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f);
    }

    public View getCurrentView() {
        return this.f31545e[0];
    }

    public long getManualScrollDuration() {
        return 540L;
    }

    public int getNextPosition() {
        return this.d;
    }

    public float getNextPositionAlpha() {
        View[] viewArr = this.f31545e;
        View view = viewArr[1];
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return Utilities.clamp(1.0f - Math.abs(viewArr[1].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f);
    }

    public float getPositionAnimated() {
        float fClamp;
        View[] viewArr = this.f31545e;
        View view = viewArr[0];
        if (view == null || view.getVisibility() != 0) {
            fClamp = 0.0f;
        } else {
            fClamp = (this.f31543b * Utilities.clamp(1.0f - Math.abs(viewArr[0].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f)) + 0.0f;
        }
        View view2 = viewArr[1];
        if (view2 == null || view2.getVisibility() != 0) {
            return fClamp;
        }
        return (this.d * Utilities.clamp(1.0f - Math.abs(viewArr[1].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f)) + fClamp;
    }

    public View[] getViewPages() {
        return this.f31545e;
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
        float measuredWidth;
        VelocityTracker velocityTracker = this.v;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.C);
        }
        if (this.D) {
            View[] viewArr = this.f31545e;
            float x8 = viewArr[0].getX();
            this.f31550w = new AnimatorSet();
            if (this.A == 0.0f) {
                this.B = Math.abs(x8) < ((float) viewArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(0.0f) < 3500.0f || Math.abs(0.0f) < Math.abs(0.0f));
            } else if (Math.abs(0.0f) > 1500.0f) {
                this.B = false;
            } else if (this.f31552y) {
                View view = viewArr[1];
                if (view != null) {
                    this.B = view.getX() > ((float) (viewArr[0].getMeasuredWidth() >> 1));
                } else {
                    this.B = false;
                }
            } else {
                this.B = viewArr[0].getX() < ((float) (viewArr[0].getMeasuredWidth() >> 1));
            }
            if (this.B) {
                measuredWidth = Math.abs(x8);
                if (this.f31552y) {
                    this.f31550w.playTogether(H(viewArr[0], 0.0f));
                    View view2 = viewArr[1];
                    if (view2 != null) {
                        this.f31550w.playTogether(H(view2, view2.getMeasuredWidth()));
                    }
                } else {
                    this.f31550w.playTogether(H(viewArr[0], 0.0f));
                    View view3 = viewArr[1];
                    if (view3 != null) {
                        this.f31550w.playTogether(H(view3, -view3.getMeasuredWidth()));
                    }
                }
            } else if (this.d >= 0) {
                measuredWidth = viewArr[0].getMeasuredWidth() - Math.abs(x8);
                if (this.f31552y) {
                    AnimatorSet animatorSet = this.f31550w;
                    View view4 = viewArr[0];
                    animatorSet.playTogether(H(view4, -view4.getMeasuredWidth()));
                    View view5 = viewArr[1];
                    if (view5 != null) {
                        this.f31550w.playTogether(H(view5, 0.0f));
                    }
                } else {
                    AnimatorSet animatorSet2 = this.f31550w;
                    View view6 = viewArr[0];
                    animatorSet2.playTogether(H(view6, view6.getMeasuredWidth()));
                    View view7 = viewArr[1];
                    if (view7 != null) {
                        this.f31550w.playTogether(H(view7, 0.0f));
                    }
                }
            } else {
                measuredWidth = 0.0f;
            }
            int i10 = 3;
            if (this.d < 0) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.N, this.B ? 0.0f : 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new c71(this, i10));
                this.f31550w.playTogether(valueAnimatorOfFloat);
            }
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat2.addUpdateListener(this.J);
            this.f31550w.playTogether(valueAnimatorOfFloat2);
            this.f31550w.setInterpolator(O);
            int measuredWidth2 = getMeasuredWidth();
            float f10 = measuredWidth2 / 2;
            float fSin = (((float) Math.sin((Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2) - 0.5f) * 0.47123894f)) * f10) + f10;
            float fAbs = Math.abs(0.0f);
            this.f31550w.setDuration(Math.max(150, Math.min(fAbs > 0.0f ? Math.round(Math.abs(fSin / fAbs) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
            this.f31550w.addListener(new d71(this, i10));
            this.f31550w.start();
            this.f31551x = true;
            this.D = false;
            w(false);
        } else {
            this.E = false;
            e71 e71Var = this.I;
            if (e71Var != null) {
                e71Var.setEnabled(true);
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
        if (!this.f31551x) {
            return false;
        }
        boolean z11 = this.B;
        View[] viewArr = this.f31545e;
        if (z11) {
            if (Math.abs(viewArr[0].getTranslationX()) < 1.0f) {
                E(viewArr[0], 0.0f);
                View view = viewArr[1];
                if (view != null) {
                    E(view, viewArr[0].getMeasuredWidth() * (this.f31552y ? 1 : -1));
                }
                z10 = true;
            } else {
                z10 = false;
            }
        } else if (Math.abs(viewArr[1].getTranslationX()) < 1.0f) {
            View view2 = viewArr[0];
            E(view2, view2.getMeasuredWidth() * (this.f31552y ? -1 : 1));
            View view3 = viewArr[1];
            if (view3 != null) {
                E(view3, 0.0f);
            }
            z10 = true;
        } else {
            z10 = false;
        }
        w(true);
        if (z10) {
            AnimatorSet animatorSet = this.f31550w;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f31550w = null;
            }
            this.f31551x = false;
        }
        return this.f31551x;
    }

    public final o71 n(int i10, boolean z10) {
        e71 e71Var = new e71(this, getContext(), z10, i10, this.f31542a);
        this.I = e71Var;
        e71Var.f31223r = G();
        this.I.setDelegate(new m5.o(this, 13));
        o(false);
        return this.I;
    }

    public final void o(boolean z10) {
        e71 e71Var;
        if (this.H == null || (e71Var = this.I) == null) {
            return;
        }
        e71Var.h.clear();
        e71Var.U.clear();
        e71Var.V.clear();
        e71Var.W.clear();
        e71Var.f31205a0.clear();
        e71Var.D = 0;
        for (int i10 = 0; i10 < this.H.e(); i10++) {
            this.H.getClass();
            this.I.a(this.H.f(i10), this.H.g(i10));
        }
        h();
        if (z10) {
            hh.f1 f1Var = this.I.v;
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) er.f28122f);
            TransitionManager.beginDelayedTransition(f1Var, transitionSet);
        }
        this.I.f31226x.l();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        e71 e71Var = this.I;
        if (e71Var != null && e71Var.F) {
            return false;
        }
        if (m()) {
            return true;
        }
        onTouchEvent(motionEvent);
        return this.D;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return A(motionEvent);
    }

    public final View q(ViewGroup viewGroup, float f10, float f11) {
        View viewQ;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                Rect rect = this.K;
                childAt.getHitRect(rect);
                if (!rect.contains((int) f10, (int) f11)) {
                    continue;
                } else {
                    if (childAt.canScrollHorizontally(-1)) {
                        return childAt;
                    }
                    if ((childAt instanceof ViewGroup) && (viewQ = q((ViewGroup) childAt, f10 - rect.left, f11 - rect.top)) != null) {
                        return viewQ;
                    }
                }
            }
        }
        return null;
    }

    public final float r(int i10) {
        return getMeasuredWidth() == 0 ? h7.n.b(1 - Math.abs(getCurrentPosition() - i10), 0, 1) : h7.n.a(1.0f - Math.abs(getPositionAnimated() - i10), 0.0f, 1.0f);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.L && this.E && !this.D) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void setAdapter(g71 g71Var) {
        this.H = g71Var;
        int iH = g71Var.h(this.f31543b);
        int[] iArr = this.f31546f;
        iArr[0] = iH;
        View viewD = g71Var.d(iH);
        View[] viewArr = this.f31545e;
        viewArr[0] = viewD;
        if (viewD == null && this.f31543b != 0) {
            this.f31543b = 0;
            int iH2 = g71Var.h(0);
            iArr[0] = iH2;
            viewArr[0] = g71Var.d(iH2);
        }
        g71Var.b(viewArr[0], this.f31543b, iArr[0]);
        addView(viewArr[0]);
        viewArr[0].setVisibility(0);
        o(false);
    }

    public void setAllowDisallowInterceptTouch(boolean z10) {
        this.L = z10;
    }

    public void setPosition(int i10) {
        if (this.H == null) {
            this.f31543b = i10;
            w(false);
        }
        AnimatorSet animatorSet = this.f31550w;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        View[] viewArr = this.f31545e;
        View view = viewArr[1];
        if (view != null) {
            this.h.put(this.f31546f[1], view);
            removeView(viewArr[1]);
            viewArr[1] = null;
        }
        int i11 = this.f31543b;
        if (i11 != i10) {
            this.f31543b = i10;
            this.d = 0;
            this.f31544c = 1.0f;
            View view2 = viewArr[0];
            I(0);
            t(viewArr[0], view2, this.f31543b, i11);
            E(viewArr[0], 0.0f);
            e71 e71Var = this.I;
            if (e71Var != null) {
                e71Var.e(this.f31544c, this.f31543b, this.d);
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

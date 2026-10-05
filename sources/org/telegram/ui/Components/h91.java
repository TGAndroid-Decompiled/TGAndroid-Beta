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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.Utilities;
public class h91 extends FrameLayout {
    public static final bs0 U = new bs0(1);
    public float E;
    public boolean F;
    public final int G;
    public boolean H;
    public boolean I;
    public final AnimationNotificationsLocker J;
    public final float K;
    public y81 L;
    public w81 M;
    public final ai.k6 N;
    public final Rect O;
    public boolean P;
    public final ArrayList Q;
    public final ArrayList R;
    public ValueAnimator S;
    public float T;
    public final org.telegram.ui.ActionBar.d6 f27165a;
    public int f27166b;
    public float f27167c;
    public int d;
    public final View[] f27168e;
    public final int[] f27169f;
    public final SparseArray h;
    public int f27170n;
    public int f27171r;
    public int f27172s;
    public VelocityTracker v;
    public AnimatorSet f27173w;
    public boolean f27174x;
    public boolean f27175y;

    public h91(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f27167c = 1.0f;
        this.h = new SparseArray();
        this.J = new AnimationNotificationsLocker();
        this.N = new ai.k6(this, 9);
        this.O = new Rect();
        this.P = true;
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.f27165a = d6Var;
        this.K = AndroidUtilities.getPixelsInCM(0.3f, true);
        this.G = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.f27169f = new int[2];
        this.f27168e = new View[2];
        setClipChildren(true);
    }

    public static zl0 p(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof zl0) {
                    return (zl0) childAt;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h91.B(android.view.MotionEvent):boolean");
    }

    public final boolean C(MotionEvent motionEvent, boolean z10) {
        int i10;
        if (!z10 && this.f27166b == 0) {
            this.T = 0.0f;
            return false;
        } else if ((z10 && this.f27166b == this.L.e() - 1) || this.S != null || !i(motionEvent) || ((z10 && !k(motionEvent)) || (!z10 && !j(motionEvent)))) {
            return false;
        } else {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.I = false;
            this.H = true;
            v();
            this.f27171r = (int) (motionEvent.getX() + this.E);
            w81 w81Var = this.M;
            if (w81Var != null) {
                w81Var.setEnabled(false);
            }
            this.J.lock();
            this.f27175y = z10;
            int i11 = this.f27166b;
            if (z10) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            this.d = i11 + i10;
            K(1);
            View[] viewArr = this.f27168e;
            View view = viewArr[1];
            if (view != null) {
                if (z10) {
                    F(view, viewArr[0].getMeasuredWidth());
                } else {
                    F(view, -viewArr[0].getMeasuredWidth());
                }
            }
            x(false);
            return true;
        }
    }

    public final void D(boolean z10) {
        int i10;
        int intValue;
        onTouchEvent(null);
        y81 y81Var = this.L;
        y81Var.getClass();
        if (!(y81Var instanceof org.telegram.ui.f7)) {
            z10 = false;
        }
        AnimatorSet animatorSet = this.f27173w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f27173w = null;
        }
        View[] viewArr = this.f27168e;
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
        if (this.f27166b > this.L.e() - 1) {
            this.f27166b = this.L.e() - 1;
        }
        if (this.f27166b < 0) {
            this.f27166b = 0;
        }
        int h = this.L.h(this.f27166b);
        int[] iArr = this.f27169f;
        iArr[0] = h;
        View d = this.L.d(h);
        viewArr[0] = d;
        this.L.b(d, this.f27166b, iArr[0]);
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
            this.f27173w = new AnimatorSet();
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
                this.f27173w.playTogether(I(view7, getMeasuredWidth()));
            }
            View view8 = viewArr[0];
            if (view8 != null) {
                this.f27173w.playTogether(I(view8, 0.0f));
            }
            x(true);
            w81 w81Var = this.M;
            w81Var.f26767a = 0.0f;
            w81Var.v.g1();
            this.M.invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new u81(this, 2));
            this.f27173w.playTogether(ofFloat);
            this.f27173w.setInterpolator(U);
            this.f27173w.setDuration(220L);
            this.f27173w.addListener(new v81(this, 2));
            this.M.setEnabled(false);
            this.f27174x = true;
            this.f27173w.start();
            return;
        }
        View view9 = viewArr[1];
        if (view9 != null) {
            removeView(view9);
            viewArr[1] = null;
        }
    }

    public final void E(int i10) {
        boolean z10;
        int i11;
        if (i10 != this.f27166b) {
            ValueAnimator valueAnimator = this.S;
            if (valueAnimator == null || this.d != i10) {
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.S = null;
                }
                if (this.f27166b < i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f27175y = z10;
                this.d = i10;
                K(1);
                z(i10, z10);
                View[] viewArr = this.f27168e;
                View view = viewArr[0];
                if (view != null) {
                    i11 = view.getMeasuredWidth();
                } else {
                    i11 = 0;
                }
                if (z10) {
                    F(viewArr[1], i11);
                } else {
                    F(viewArr[1], -i11);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.S = ofFloat;
                ofFloat.addUpdateListener(new u81(this, 0));
                this.S.addListener(new v81(this, 0));
                this.S.setDuration(getManualScrollDuration());
                this.S.setInterpolator(tr.h);
                this.S.start();
            }
        }
    }

    public void F(View view, float f7) {
        int i10;
        int round = Math.round(f7);
        int round2 = Math.round(view.getTranslationX());
        view.setTranslationX(round);
        if (view == this.f27168e[0] && (i10 = round2 - round) != 0) {
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.R;
                if (i11 < arrayList.size()) {
                    ((li.g) arrayList.get(i11)).f15653a.h(i10, 0);
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    public void G() {
        View[] viewArr = this.f27168e;
        View view = viewArr[0];
        View view2 = viewArr[1];
        viewArr[0] = view2;
        viewArr[1] = view;
        int i10 = this.f27166b;
        int i11 = this.d;
        this.f27166b = i11;
        this.d = i10;
        this.f27167c = 1.0f - this.f27167c;
        int[] iArr = this.f27169f;
        int i12 = iArr[0];
        iArr[0] = iArr[1];
        iArr[1] = i12;
        t(view2, view, i11, i10);
    }

    public int H() {
        return 16;
    }

    public final ValueAnimator I(View view, float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(view.getTranslationX(), f7);
        ofFloat.addUpdateListener(new yx0(this, view, 1));
        ofFloat.addListener(new x81(this, view, f7));
        return ofFloat;
    }

    public final void J() {
        int[] iArr = this.f27169f;
        if (iArr[0] != this.L.h(this.f27166b)) {
            K(0);
            View[] viewArr = this.f27168e;
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

    public final void K(int i10) {
        int i11;
        if (i10 == 0) {
            i11 = this.f27166b;
        } else {
            i11 = this.d;
        }
        if (i11 >= 0 && i11 < this.L.e()) {
            View[] viewArr = this.f27168e;
            View view = viewArr[i10];
            float f7 = 0.0f;
            SparseArray sparseArray = this.h;
            int[] iArr = this.f27169f;
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
                if (i10 != 0) {
                    f7 = getMeasuredWidth();
                }
                view2.setTranslationX(f7);
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
                if (i10 != 0) {
                    f7 = getMeasuredWidth();
                }
                view3.setTranslationX(f7);
                addView(view3);
                viewArr[i10] = view3;
                view3.setVisibility(0);
                y81 y81Var = this.L;
                y81Var.b(viewArr[i10], i11, y81Var.h(i11));
            }
        }
    }

    @Override
    public boolean canScrollHorizontally(int i10) {
        boolean z10;
        if (i10 != 0) {
            if (!this.f27174x && !this.H) {
                if (i10 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((z10 || this.f27166b != 0) && (!z10 || this.f27166b != this.L.e() - 1)) {
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
        return this.f27166b;
    }

    public float getCurrentPositionAlpha() {
        View[] viewArr = this.f27168e;
        View view = viewArr[0];
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return Utilities.clamp(1.0f - Math.abs(viewArr[0].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f);
    }

    public View getCurrentView() {
        return this.f27168e[0];
    }

    public long getManualScrollDuration() {
        return 540L;
    }

    public int getNextPosition() {
        return this.d;
    }

    public float getNextPositionAlpha() {
        View[] viewArr = this.f27168e;
        View view = viewArr[1];
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return Utilities.clamp(1.0f - Math.abs(viewArr[1].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f);
    }

    public float getPositionAnimated() {
        float f7;
        View[] viewArr = this.f27168e;
        View view = viewArr[0];
        if (view != null && view.getVisibility() == 0) {
            f7 = (this.f27166b * Utilities.clamp(1.0f - Math.abs(viewArr[0].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f)) + 0.0f;
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
        return this.f27168e;
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
            View[] viewArr = this.f27168e;
            float x10 = viewArr[0].getX();
            this.f27173w = new AnimatorSet();
            if (this.E != 0.0f) {
                if (Math.abs(0.0f) > 1500.0f) {
                    this.F = false;
                } else if (this.f27175y) {
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
                if (this.f27175y) {
                    this.f27173w.playTogether(I(viewArr[0], 0.0f));
                    View view4 = viewArr[1];
                    if (view4 != null) {
                        this.f27173w.playTogether(I(view4, view4.getMeasuredWidth()));
                    }
                } else {
                    this.f27173w.playTogether(I(viewArr[0], 0.0f));
                    View view5 = viewArr[1];
                    if (view5 != null) {
                        this.f27173w.playTogether(I(view5, -view5.getMeasuredWidth()));
                    }
                }
            } else if (this.d >= 0) {
                f7 = viewArr[0].getMeasuredWidth() - Math.abs(x10);
                if (this.f27175y) {
                    this.f27173w.playTogether(I(viewArr[0], -view2.getMeasuredWidth()));
                    View view6 = viewArr[1];
                    if (view6 != null) {
                        this.f27173w.playTogether(I(view6, 0.0f));
                    }
                } else {
                    this.f27173w.playTogether(I(viewArr[0], view.getMeasuredWidth()));
                    View view7 = viewArr[1];
                    if (view7 != null) {
                        this.f27173w.playTogether(I(view7, 0.0f));
                    }
                }
            } else {
                f7 = 0.0f;
            }
            if (this.d < 0) {
                float f11 = this.T;
                if (this.F) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                ofFloat.addUpdateListener(new u81(this, 3));
                this.f27173w.playTogether(ofFloat);
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(this.N);
            this.f27173w.playTogether(ofFloat2);
            this.f27173w.setInterpolator(U);
            float measuredWidth3 = getMeasuredWidth() / 2;
            float sin = (((float) Math.sin((Math.min(1.0f, (f7 * 1.0f) / measuredWidth) - 0.5f) * 0.47123894f)) * measuredWidth3) + measuredWidth3;
            float abs = Math.abs(0.0f);
            if (abs > 0.0f) {
                measuredWidth2 = Math.round(Math.abs(sin / abs) * 1000.0f) * 4;
            } else {
                measuredWidth2 = (int) (((f7 / getMeasuredWidth()) + 1.0f) * 100.0f);
            }
            this.f27173w.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
            this.f27173w.addListener(new v81(this, 3));
            this.f27173w.start();
            this.f27174x = true;
            this.H = false;
            x(false);
        } else {
            this.I = false;
            w81 w81Var = this.M;
            if (w81Var != null) {
                w81Var.setEnabled(true);
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
        if (!this.f27174x) {
            return false;
        }
        boolean z11 = this.F;
        int i10 = -1;
        View[] viewArr = this.f27168e;
        if (z11) {
            if (Math.abs(viewArr[0].getTranslationX()) < 1.0f) {
                F(viewArr[0], 0.0f);
                View view = viewArr[1];
                if (view != null) {
                    int measuredWidth = viewArr[0].getMeasuredWidth();
                    if (this.f27175y) {
                        i10 = 1;
                    }
                    F(view, measuredWidth * i10);
                }
                z10 = true;
            }
            z10 = false;
        } else {
            if (Math.abs(viewArr[1].getTranslationX()) < 1.0f) {
                View view2 = viewArr[0];
                int measuredWidth2 = view2.getMeasuredWidth();
                if (!this.f27175y) {
                    i10 = 1;
                }
                F(view2, measuredWidth2 * i10);
                View view3 = viewArr[1];
                if (view3 != null) {
                    F(view3, 0.0f);
                }
                z10 = true;
            }
            z10 = false;
        }
        x(true);
        if (z10) {
            AnimatorSet animatorSet = this.f27173w;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f27173w = null;
            }
            this.f27174x = false;
        }
        return this.f27174x;
    }

    public final g91 n(int i10, boolean z10) {
        w81 w81Var = new w81(this, getContext(), z10, i10, this.f27165a);
        this.M = w81Var;
        w81Var.f26789r = H();
        this.M.setDelegate(new n2.c(this, 9));
        o(false);
        return this.M;
    }

    public final void o(boolean z10) {
        w81 w81Var;
        if (this.L != null && (w81Var = this.M) != null) {
            w81Var.h.clear();
            w81Var.f26770b0.clear();
            w81Var.f26772c0.clear();
            w81Var.f26773d0.clear();
            w81Var.f26775e0.clear();
            w81Var.H = 0;
            for (int i10 = 0; i10 < this.L.e(); i10++) {
                this.L.getClass();
                this.M.a(this.L.f(i10), this.L.g(i10));
            }
            h();
            if (z10) {
                ai.w0 w0Var = this.M.v;
                TransitionSet transitionSet = new TransitionSet();
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(150L);
                transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
                transitionSet.setOrdering(0);
                transitionSet.setInterpolator((TimeInterpolator) tr.f31215f);
                TransitionManager.beginDelayedTransition(w0Var, transitionSet);
            }
            this.M.f26793x.l();
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        w81 w81Var = this.M;
        if (w81Var != null && w81Var.J) {
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
            return w7.q.b(1 - Math.abs(getCurrentPosition() - i10), 0, 1);
        }
        return w7.q.a(1.0f - Math.abs(getPositionAnimated() - i10), 0.0f, 1.0f);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.P && this.I && !this.H) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void setAdapter(y81 y81Var) {
        this.L = y81Var;
        int h = y81Var.h(this.f27166b);
        int[] iArr = this.f27169f;
        iArr[0] = h;
        View d = y81Var.d(h);
        View[] viewArr = this.f27168e;
        viewArr[0] = d;
        if (d == null && this.f27166b != 0) {
            this.f27166b = 0;
            int h10 = y81Var.h(0);
            iArr[0] = h10;
            viewArr[0] = y81Var.d(h10);
        }
        y81Var.b(viewArr[0], this.f27166b, iArr[0]);
        addView(viewArr[0]);
        viewArr[0].setVisibility(0);
        o(false);
    }

    public void setAllowDisallowInterceptTouch(boolean z10) {
        this.P = z10;
    }

    public void setPosition(int i10) {
        if (this.L == null) {
            this.f27166b = i10;
            x(false);
        }
        AnimatorSet animatorSet = this.f27173w;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        View[] viewArr = this.f27168e;
        View view = viewArr[1];
        if (view != null) {
            this.h.put(this.f27169f[1], view);
            removeView(viewArr[1]);
            viewArr[1] = null;
        }
        int i11 = this.f27166b;
        if (i11 != i10) {
            this.f27166b = i10;
            this.d = 0;
            this.f27167c = 1.0f;
            View view2 = viewArr[0];
            K(0);
            t(viewArr[0], view2, this.f27166b, i11);
            F(viewArr[0], 0.0f);
            w81 w81Var = this.M;
            if (w81Var != null) {
                w81Var.e(this.f27167c, this.f27166b, this.d);
            }
            x(true);
        }
    }

    public final void x(boolean z10) {
        Iterator it = this.Q.iterator();
        if (!it.hasNext()) {
            w(z10);
            return;
        }
        throw a4.a.k(it);
    }

    public void z(int i10, boolean z10) {
        y(i10);
    }

    public void A(int i10) {
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

    public void y(int i10) {
    }

    public void t(View view, View view2, int i10, int i11) {
    }
}

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
public class o91 extends FrameLayout {
    public static final ns0 S = new ns0(1);
    public float E;
    public boolean F;
    public final int G;
    public boolean H;
    public boolean I;
    public final AnimationNotificationsLocker J;
    public final float K;
    public f91 L;
    public d91 M;
    public final ai.l6 N;
    public final Rect O;
    public boolean P;
    public ValueAnimator Q;
    public float R;
    public final org.telegram.ui.ActionBar.e6 f29426a;
    public int f29427b;
    public float f29428c;
    public int d;
    public final View[] f29429e;
    public final int[] f29430f;
    public final SparseArray h;
    public int f29431n;
    public int f29432r;
    public int f29433s;
    public VelocityTracker v;
    public AnimatorSet f29434w;
    public boolean f29435x;
    public boolean f29436y;

    public o91(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f29428c = 1.0f;
        this.h = new SparseArray();
        this.J = new AnimationNotificationsLocker();
        this.N = new ai.l6(this, 9);
        this.O = new Rect();
        this.P = true;
        this.f29426a = e6Var;
        this.K = AndroidUtilities.getPixelsInCM(0.3f, true);
        this.G = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.f29430f = new int[2];
        this.f29429e = new View[2];
        setClipChildren(true);
    }

    public static qm0 p(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof qm0) {
                    return (qm0) childAt;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o91.A(android.view.MotionEvent):boolean");
    }

    public final boolean B(MotionEvent motionEvent, boolean z10) {
        int i10;
        View[] viewArr;
        if (!z10 && this.f29427b == 0) {
            this.R = 0.0f;
            return false;
        } else if ((z10 && this.f29427b == this.L.e() - 1) || this.Q != null || !i(motionEvent) || ((z10 && !k(motionEvent)) || (!z10 && !j(motionEvent)))) {
            return false;
        } else {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.I = false;
            this.H = true;
            v();
            this.f29432r = (int) (motionEvent.getX() + this.E);
            d91 d91Var = this.M;
            if (d91Var != null) {
                d91Var.setEnabled(false);
            }
            this.J.lock();
            this.f29436y = z10;
            int i11 = this.f29427b;
            if (z10) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            this.d = i11 + i10;
            I(1);
            View view = this.f29429e[1];
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
        f91 f91Var = this.L;
        f91Var.getClass();
        if (!(f91Var instanceof org.telegram.ui.d7)) {
            z10 = false;
        }
        AnimatorSet animatorSet = this.f29434w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f29434w = null;
        }
        View[] viewArr = this.f29429e;
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
        if (this.f29427b > this.L.e() - 1) {
            this.f29427b = this.L.e() - 1;
        }
        if (this.f29427b < 0) {
            this.f29427b = 0;
        }
        int h = this.L.h(this.f29427b);
        int[] iArr = this.f29430f;
        iArr[0] = h;
        View d = this.L.d(h);
        viewArr[0] = d;
        this.L.b(d, this.f29427b, iArr[0]);
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
            this.f29434w = new AnimatorSet();
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
                this.f29434w.playTogether(H(view7, getMeasuredWidth()));
            }
            View view8 = viewArr[0];
            if (view8 != null) {
                this.f29434w.playTogether(H(view8, 0.0f));
            }
            w(true);
            d91 d91Var = this.M;
            d91Var.f29095a = 0.0f;
            d91Var.v.f1();
            this.M.invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new b91(this, 2));
            this.f29434w.playTogether(ofFloat);
            this.f29434w.setInterpolator(S);
            this.f29434w.setDuration(220L);
            this.f29434w.addListener(new c91(this, 2));
            this.M.setEnabled(false);
            this.f29435x = true;
            this.f29434w.start();
            return;
        }
        View view9 = viewArr[1];
        if (view9 != null) {
            removeView(view9);
            viewArr[1] = null;
        }
    }

    public final boolean D(int i10) {
        ValueAnimator valueAnimator;
        boolean z10;
        int i11;
        if (i10 == this.f29427b || ((valueAnimator = this.Q) != null && this.d == i10)) {
            return false;
        }
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Q = null;
        }
        if (this.f29427b < i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f29436y = z10;
        this.d = i10;
        I(1);
        y(i10, z10);
        View[] viewArr = this.f29429e;
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
        ofFloat.addUpdateListener(new b91(this, 0));
        this.Q.addListener(new c91(this, 0));
        this.Q.setDuration(getManualScrollDuration());
        this.Q.setInterpolator(hs.h);
        this.Q.start();
        return true;
    }

    public void E(View view, float f7) {
        view.setTranslationX(f7);
    }

    public void F() {
        View[] viewArr = this.f29429e;
        View view = viewArr[0];
        View view2 = viewArr[1];
        viewArr[0] = view2;
        viewArr[1] = view;
        int i10 = this.f29427b;
        int i11 = this.d;
        this.f29427b = i11;
        this.d = i10;
        this.f29428c = 1.0f - this.f29428c;
        int[] iArr = this.f29430f;
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
        ofFloat.addUpdateListener(new ey0(this, view, 1));
        ofFloat.addListener(new e91(this, view, f7));
        return ofFloat;
    }

    public final void I(int i10) {
        int i11;
        if (i10 == 0) {
            i11 = this.f29427b;
        } else {
            i11 = this.d;
        }
        if (i11 >= 0 && i11 < this.L.e()) {
            View[] viewArr = this.f29429e;
            View view = viewArr[i10];
            SparseArray sparseArray = this.h;
            int[] iArr = this.f29430f;
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
                f91 f91Var = this.L;
                f91Var.b(viewArr[i10], i11, f91Var.h(i11));
            }
        }
    }

    @Override
    public final boolean canScrollHorizontally(int i10) {
        boolean z10;
        if (i10 != 0) {
            if (!this.f29435x && !this.H) {
                if (i10 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((z10 || this.f29427b != 0) && (!z10 || this.f29427b != this.L.e() - 1)) {
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
        return this.f29427b;
    }

    public float getCurrentPositionAlpha() {
        View[] viewArr = this.f29429e;
        View view = viewArr[0];
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return Utilities.clamp(1.0f - Math.abs(viewArr[0].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f);
    }

    public View getCurrentView() {
        return this.f29429e[0];
    }

    public long getManualScrollDuration() {
        return 540L;
    }

    public int getNextPosition() {
        return this.d;
    }

    public float getNextPositionAlpha() {
        View[] viewArr = this.f29429e;
        View view = viewArr[1];
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return Utilities.clamp(1.0f - Math.abs(viewArr[1].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f);
    }

    public float getPositionAnimated() {
        float f7;
        View[] viewArr = this.f29429e;
        View view = viewArr[0];
        if (view != null && view.getVisibility() == 0) {
            f7 = (this.f29427b * Utilities.clamp(1.0f - Math.abs(viewArr[0].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f)) + 0.0f;
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
        return this.f29429e;
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
            View[] viewArr = this.f29429e;
            float x10 = viewArr[0].getX();
            this.f29434w = new AnimatorSet();
            if (this.E != 0.0f) {
                if (Math.abs(0.0f) > 1500.0f) {
                    this.F = false;
                } else if (this.f29436y) {
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
                if (this.f29436y) {
                    this.f29434w.playTogether(H(viewArr[0], 0.0f));
                    View view4 = viewArr[1];
                    if (view4 != null) {
                        this.f29434w.playTogether(H(view4, view4.getMeasuredWidth()));
                    }
                } else {
                    this.f29434w.playTogether(H(viewArr[0], 0.0f));
                    View view5 = viewArr[1];
                    if (view5 != null) {
                        this.f29434w.playTogether(H(view5, -view5.getMeasuredWidth()));
                    }
                }
            } else if (this.d >= 0) {
                f7 = viewArr[0].getMeasuredWidth() - Math.abs(x10);
                if (this.f29436y) {
                    this.f29434w.playTogether(H(viewArr[0], -view2.getMeasuredWidth()));
                    View view6 = viewArr[1];
                    if (view6 != null) {
                        this.f29434w.playTogether(H(view6, 0.0f));
                    }
                } else {
                    this.f29434w.playTogether(H(viewArr[0], view.getMeasuredWidth()));
                    View view7 = viewArr[1];
                    if (view7 != null) {
                        this.f29434w.playTogether(H(view7, 0.0f));
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
                ofFloat.addUpdateListener(new b91(this, 3));
                this.f29434w.playTogether(ofFloat);
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(this.N);
            this.f29434w.playTogether(ofFloat2);
            this.f29434w.setInterpolator(S);
            float measuredWidth3 = getMeasuredWidth() / 2;
            float sin = (((float) Math.sin((Math.min(1.0f, (f7 * 1.0f) / measuredWidth) - 0.5f) * 0.47123894f)) * measuredWidth3) + measuredWidth3;
            float abs = Math.abs(0.0f);
            if (abs > 0.0f) {
                measuredWidth2 = Math.round(Math.abs(sin / abs) * 1000.0f) * 4;
            } else {
                measuredWidth2 = (int) (((f7 / getMeasuredWidth()) + 1.0f) * 100.0f);
            }
            this.f29434w.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
            this.f29434w.addListener(new c91(this, 3));
            this.f29434w.start();
            this.f29435x = true;
            this.H = false;
            w(false);
        } else {
            this.I = false;
            d91 d91Var = this.M;
            if (d91Var != null) {
                d91Var.setEnabled(true);
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
        if (!this.f29435x) {
            return false;
        }
        boolean z11 = this.F;
        int i10 = -1;
        View[] viewArr = this.f29429e;
        if (z11) {
            if (Math.abs(viewArr[0].getTranslationX()) < 1.0f) {
                E(viewArr[0], 0.0f);
                View view = viewArr[1];
                if (view != null) {
                    int measuredWidth = viewArr[0].getMeasuredWidth();
                    if (this.f29436y) {
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
                if (!this.f29436y) {
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
            AnimatorSet animatorSet = this.f29434w;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f29434w = null;
            }
            this.f29435x = false;
        }
        return this.f29435x;
    }

    public final n91 n(int i10, boolean z10) {
        d91 d91Var = new d91(this, getContext(), z10, i10, this.f29426a);
        this.M = d91Var;
        d91Var.f29117r = G();
        this.M.setDelegate(new m2.t(this, 10));
        o(false);
        return this.M;
    }

    public final void o(boolean z10) {
        d91 d91Var;
        if (this.L != null && (d91Var = this.M) != null) {
            d91Var.h.clear();
            d91Var.f29098b0.clear();
            d91Var.f29100c0.clear();
            d91Var.f29101d0.clear();
            d91Var.f29103e0.clear();
            d91Var.H = 0;
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
                transitionSet.setInterpolator((TimeInterpolator) hs.f27118f);
                TransitionManager.beginDelayedTransition(w0Var, transitionSet);
            }
            this.M.f29121x.l();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        d91 d91Var = this.M;
        if (d91Var != null && d91Var.J) {
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
            return w7.o.b(1 - Math.abs(getCurrentPosition() - i10), 0, 1);
        }
        return w7.o.a(1.0f - Math.abs(getPositionAnimated() - i10), 0.0f, 1.0f);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.P && this.I && !this.H) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void setAdapter(f91 f91Var) {
        this.L = f91Var;
        int h = f91Var.h(this.f29427b);
        int[] iArr = this.f29430f;
        iArr[0] = h;
        View d = f91Var.d(h);
        View[] viewArr = this.f29429e;
        viewArr[0] = d;
        if (d == null && this.f29427b != 0) {
            this.f29427b = 0;
            int h10 = f91Var.h(0);
            iArr[0] = h10;
            viewArr[0] = f91Var.d(h10);
        }
        f91Var.b(viewArr[0], this.f29427b, iArr[0]);
        addView(viewArr[0]);
        viewArr[0].setVisibility(0);
        o(false);
    }

    public void setAllowDisallowInterceptTouch(boolean z10) {
        this.P = z10;
    }

    public void setPosition(int i10) {
        if (this.L == null) {
            this.f29427b = i10;
            w(false);
        }
        AnimatorSet animatorSet = this.f29434w;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        View[] viewArr = this.f29429e;
        View view = viewArr[1];
        if (view != null) {
            this.h.put(this.f29430f[1], view);
            removeView(viewArr[1]);
            viewArr[1] = null;
        }
        int i11 = this.f29427b;
        if (i11 != i10) {
            this.f29427b = i10;
            this.d = 0;
            this.f29428c = 1.0f;
            View view2 = viewArr[0];
            I(0);
            t(viewArr[0], view2, this.f29427b, i11);
            E(viewArr[0], 0.0f);
            d91 d91Var = this.M;
            if (d91Var != null) {
                d91Var.e(this.f29428c, this.f29427b, this.d);
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

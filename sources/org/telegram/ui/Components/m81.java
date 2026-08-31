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
public class m81 extends FrameLayout {
    public static final lr0 P = new lr0(1);
    public float B;
    public boolean C;
    public final int D;
    public boolean E;
    public boolean F;
    public final AnimationNotificationsLocker G;
    public final float H;
    public e81 I;
    public c81 J;
    public final f2.d0 K;
    public final Rect L;
    public boolean M;
    public ValueAnimator N;
    public float O;
    public final org.telegram.ui.ActionBar.g6 f28984a;
    public int f28985b;
    public float f28986c;
    public int d;
    public final View[] f28987e;
    public final int[] f28988f;
    public final SparseArray h;
    public int f28989n;
    public int f28990r;
    public int f28991s;
    public VelocityTracker v;
    public AnimatorSet f28992w;
    public boolean f28993x;
    public boolean f28994y;

    public m81(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f28986c = 1.0f;
        this.h = new SparseArray();
        this.G = new AnimationNotificationsLocker();
        this.K = new f2.d0(this, 7);
        this.L = new Rect();
        this.M = true;
        this.f28984a = g6Var;
        this.H = AndroidUtilities.getPixelsInCM(0.3f, true);
        this.D = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.f28988f = new int[2];
        this.f28987e = new View[2];
        setClipChildren(true);
    }

    public static tl0 p(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof tl0) {
                    return (tl0) childAt;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m81.A(android.view.MotionEvent):boolean");
    }

    public final boolean B(MotionEvent motionEvent, boolean z4) {
        int i10;
        if (!z4 && this.f28985b == 0) {
            this.O = 0.0f;
            return false;
        } else if ((z4 && this.f28985b == this.I.e() - 1) || this.N != null || !i(motionEvent) || ((z4 && !k(motionEvent)) || (!z4 && !j(motionEvent)))) {
            return false;
        } else {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.F = false;
            this.E = true;
            v();
            this.f28990r = (int) (motionEvent.getX() + this.B);
            c81 c81Var = this.J;
            if (c81Var != null) {
                c81Var.setEnabled(false);
            }
            this.G.lock();
            this.f28994y = z4;
            int i11 = this.f28985b;
            if (z4) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            this.d = i11 + i10;
            I(1);
            View[] viewArr = this.f28987e;
            View view = viewArr[1];
            if (view != null) {
                if (z4) {
                    E(view, viewArr[0].getMeasuredWidth());
                } else {
                    E(view, -viewArr[0].getMeasuredWidth());
                }
            }
            w(false);
            return true;
        }
    }

    public final void C(boolean z4) {
        int i10;
        int intValue;
        onTouchEvent(null);
        e81 e81Var = this.I;
        e81Var.getClass();
        if (!(e81Var instanceof org.telegram.ui.g7)) {
            z4 = false;
        }
        AnimatorSet animatorSet = this.f28992w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f28992w = null;
        }
        View[] viewArr = this.f28987e;
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
        if (this.I.e() == 0) {
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
        if (this.f28985b > this.I.e() - 1) {
            this.f28985b = this.I.e() - 1;
        }
        if (this.f28985b < 0) {
            this.f28985b = 0;
        }
        int h = this.I.h(this.f28985b);
        int[] iArr = this.f28988f;
        iArr[0] = h;
        View d = this.I.d(h);
        viewArr[0] = d;
        this.I.b(d, this.f28985b, iArr[0]);
        addView(viewArr[0]);
        viewArr[0].setVisibility(0);
        if (viewArr[0].getTag() == null) {
            intValue = 0;
        } else {
            intValue = ((Integer) viewArr[0].getTag()).intValue();
        }
        if (intValue == i10) {
            z4 = false;
        }
        if (z4) {
            this.J.getClass();
        }
        o(z4);
        if (z4) {
            this.f28992w = new AnimatorSet();
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
                this.f28992w.playTogether(H(view7, getMeasuredWidth()));
            }
            View view8 = viewArr[0];
            if (view8 != null) {
                this.f28992w.playTogether(H(view8, 0.0f));
            }
            w(true);
            c81 c81Var = this.J;
            c81Var.f28647a = 0.0f;
            c81Var.v.f1();
            this.J.invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new a81(this, 2));
            this.f28992w.playTogether(ofFloat);
            this.f28992w.setInterpolator(P);
            this.f28992w.setDuration(220L);
            this.f28992w.addListener(new b81(this, 2));
            this.J.setEnabled(false);
            this.f28993x = true;
            this.f28992w.start();
            return;
        }
        View view9 = viewArr[1];
        if (view9 != null) {
            removeView(view9);
            viewArr[1] = null;
        }
    }

    public final void D(int i10) {
        boolean z4;
        int i11;
        if (i10 != this.f28985b) {
            ValueAnimator valueAnimator = this.N;
            if (valueAnimator == null || this.d != i10) {
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.N = null;
                }
                if (this.f28985b < i10) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f28994y = z4;
                this.d = i10;
                I(1);
                y(i10, z4);
                View[] viewArr = this.f28987e;
                View view = viewArr[0];
                if (view != null) {
                    i11 = view.getMeasuredWidth();
                } else {
                    i11 = 0;
                }
                if (z4) {
                    E(viewArr[1], i11);
                } else {
                    E(viewArr[1], -i11);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.N = ofFloat;
                ofFloat.addUpdateListener(new a81(this, 0));
                this.N.addListener(new b81(this, 0));
                this.N.setDuration(getManualScrollDuration());
                this.N.setInterpolator(pr.h);
                this.N.start();
            }
        }
    }

    public void E(View view, float f10) {
        view.setTranslationX(f10);
    }

    public void F() {
        View[] viewArr = this.f28987e;
        View view = viewArr[0];
        View view2 = viewArr[1];
        viewArr[0] = view2;
        viewArr[1] = view;
        int i10 = this.f28985b;
        int i11 = this.d;
        this.f28985b = i11;
        this.d = i10;
        this.f28986c = 1.0f - this.f28986c;
        int[] iArr = this.f28988f;
        int i12 = iArr[0];
        iArr[0] = iArr[1];
        iArr[1] = i12;
        t(view2, view, i11, i10);
    }

    public int G() {
        return 16;
    }

    public final ValueAnimator H(View view, float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(view.getTranslationX(), f10);
        ofFloat.addUpdateListener(new ex0(this, view, 1));
        ofFloat.addListener(new d81(this, view, f10));
        return ofFloat;
    }

    public final void I(int i10) {
        int i11;
        if (i10 == 0) {
            i11 = this.f28985b;
        } else {
            i11 = this.d;
        }
        if (i11 >= 0 && i11 < this.I.e()) {
            View[] viewArr = this.f28987e;
            View view = viewArr[i10];
            SparseArray sparseArray = this.h;
            int[] iArr = this.f28988f;
            if (view == null) {
                int h = this.I.h(i11);
                iArr[i10] = h;
                View view2 = (View) sparseArray.get(h);
                if (view2 == null) {
                    view2 = this.I.d(iArr[i10]);
                } else {
                    sparseArray.remove(iArr[i10]);
                }
                if (view2.getParent() != null) {
                    ((ViewGroup) view2.getParent()).removeView(view2);
                }
                addView(view2);
                view2.setTranslationX(getMeasuredWidth());
                viewArr[i10] = view2;
                this.I.b(view2, i11, iArr[i10]);
                viewArr[i10].setVisibility(0);
            } else if (iArr[i10] == this.I.h(i11)) {
                this.I.b(viewArr[i10], i11, iArr[i10]);
                viewArr[i10].setVisibility(0);
            } else {
                sparseArray.put(iArr[i10], viewArr[i10]);
                viewArr[i10].setVisibility(8);
                removeView(viewArr[i10]);
                int h9 = this.I.h(i11);
                iArr[i10] = h9;
                View view3 = (View) sparseArray.get(h9);
                if (view3 == null) {
                    view3 = this.I.d(iArr[i10]);
                } else {
                    sparseArray.remove(iArr[i10]);
                }
                addView(view3);
                viewArr[i10] = view3;
                view3.setVisibility(0);
                e81 e81Var = this.I;
                e81Var.b(viewArr[i10], i11, e81Var.h(i11));
            }
        }
    }

    @Override
    public final boolean canScrollHorizontally(int i10) {
        boolean z4;
        if (i10 != 0) {
            if (!this.f28993x && !this.E) {
                if (i10 > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((z4 || this.f28985b != 0) && (!z4 || this.f28985b != this.I.e() - 1)) {
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
        return this.f28985b;
    }

    public float getCurrentPositionAlpha() {
        View[] viewArr = this.f28987e;
        View view = viewArr[0];
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return Utilities.clamp(1.0f - Math.abs(viewArr[0].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f);
    }

    public View getCurrentView() {
        return this.f28987e[0];
    }

    public long getManualScrollDuration() {
        return 540L;
    }

    public int getNextPosition() {
        return this.d;
    }

    public float getNextPositionAlpha() {
        View[] viewArr = this.f28987e;
        View view = viewArr[1];
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return Utilities.clamp(1.0f - Math.abs(viewArr[1].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f);
    }

    public float getPositionAnimated() {
        float f10;
        View[] viewArr = this.f28987e;
        View view = viewArr[0];
        if (view != null && view.getVisibility() == 0) {
            f10 = (this.f28985b * Utilities.clamp(1.0f - Math.abs(viewArr[0].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f)) + 0.0f;
        } else {
            f10 = 0.0f;
        }
        View view2 = viewArr[1];
        if (view2 != null && view2.getVisibility() == 0) {
            return (this.d * Utilities.clamp(1.0f - Math.abs(viewArr[1].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f)) + f10;
        }
        return f10;
    }

    public View[] getViewPages() {
        return this.f28987e;
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
        boolean z4;
        float f10;
        View view;
        View view2;
        int measuredWidth;
        int measuredWidth2;
        float f11;
        boolean z10;
        boolean z11;
        VelocityTracker velocityTracker = this.v;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.D);
        }
        if (this.E) {
            View[] viewArr = this.f28987e;
            float x10 = viewArr[0].getX();
            this.f28992w = new AnimatorSet();
            if (this.B != 0.0f) {
                if (Math.abs(0.0f) > 1500.0f) {
                    this.C = false;
                } else if (this.f28994y) {
                    View view3 = viewArr[1];
                    if (view3 != null) {
                        if (view3.getX() > (viewArr[0].getMeasuredWidth() >> 1)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.C = z11;
                    } else {
                        this.C = false;
                    }
                } else {
                    if (viewArr[0].getX() < (viewArr[0].getMeasuredWidth() >> 1)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.C = z10;
                }
            } else {
                if (Math.abs(x10) < viewArr[0].getMeasuredWidth() / 3.0f && (Math.abs(0.0f) < 3500.0f || Math.abs(0.0f) < Math.abs(0.0f))) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.C = z4;
            }
            if (this.C) {
                f10 = Math.abs(x10);
                if (this.f28994y) {
                    this.f28992w.playTogether(H(viewArr[0], 0.0f));
                    View view4 = viewArr[1];
                    if (view4 != null) {
                        this.f28992w.playTogether(H(view4, view4.getMeasuredWidth()));
                    }
                } else {
                    this.f28992w.playTogether(H(viewArr[0], 0.0f));
                    View view5 = viewArr[1];
                    if (view5 != null) {
                        this.f28992w.playTogether(H(view5, -view5.getMeasuredWidth()));
                    }
                }
            } else if (this.d >= 0) {
                f10 = viewArr[0].getMeasuredWidth() - Math.abs(x10);
                if (this.f28994y) {
                    this.f28992w.playTogether(H(viewArr[0], -view2.getMeasuredWidth()));
                    View view6 = viewArr[1];
                    if (view6 != null) {
                        this.f28992w.playTogether(H(view6, 0.0f));
                    }
                } else {
                    this.f28992w.playTogether(H(viewArr[0], view.getMeasuredWidth()));
                    View view7 = viewArr[1];
                    if (view7 != null) {
                        this.f28992w.playTogether(H(view7, 0.0f));
                    }
                }
            } else {
                f10 = 0.0f;
            }
            if (this.d < 0) {
                float f12 = this.O;
                if (this.C) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
                ofFloat.addUpdateListener(new a81(this, 3));
                this.f28992w.playTogether(ofFloat);
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(this.K);
            this.f28992w.playTogether(ofFloat2);
            this.f28992w.setInterpolator(P);
            float measuredWidth3 = getMeasuredWidth() / 2;
            float sin = (((float) Math.sin((Math.min(1.0f, (f10 * 1.0f) / measuredWidth) - 0.5f) * 0.47123894f)) * measuredWidth3) + measuredWidth3;
            float abs = Math.abs(0.0f);
            if (abs > 0.0f) {
                measuredWidth2 = Math.round(Math.abs(sin / abs) * 1000.0f) * 4;
            } else {
                measuredWidth2 = (int) (((f10 / getMeasuredWidth()) + 1.0f) * 100.0f);
            }
            this.f28992w.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
            this.f28992w.addListener(new b81(this, 3));
            this.f28992w.start();
            this.f28993x = true;
            this.E = false;
            w(false);
        } else {
            this.F = false;
            c81 c81Var = this.J;
            if (c81Var != null) {
                c81Var.setEnabled(true);
            }
        }
        VelocityTracker velocityTracker2 = this.v;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.v = null;
        }
    }

    public final boolean m() {
        boolean z4;
        if (!this.f28993x) {
            return false;
        }
        boolean z10 = this.C;
        int i10 = -1;
        View[] viewArr = this.f28987e;
        if (z10) {
            if (Math.abs(viewArr[0].getTranslationX()) < 1.0f) {
                E(viewArr[0], 0.0f);
                View view = viewArr[1];
                if (view != null) {
                    int measuredWidth = viewArr[0].getMeasuredWidth();
                    if (this.f28994y) {
                        i10 = 1;
                    }
                    E(view, measuredWidth * i10);
                }
                z4 = true;
            }
            z4 = false;
        } else {
            if (Math.abs(viewArr[1].getTranslationX()) < 1.0f) {
                View view2 = viewArr[0];
                int measuredWidth2 = view2.getMeasuredWidth();
                if (!this.f28994y) {
                    i10 = 1;
                }
                E(view2, measuredWidth2 * i10);
                View view3 = viewArr[1];
                if (view3 != null) {
                    E(view3, 0.0f);
                }
                z4 = true;
            }
            z4 = false;
        }
        w(true);
        if (z4) {
            AnimatorSet animatorSet = this.f28992w;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f28992w = null;
            }
            this.f28993x = false;
        }
        return this.f28993x;
    }

    public final l81 n(int i10, boolean z4) {
        c81 c81Var = new c81(this, getContext(), z4, i10, this.f28984a);
        this.J = c81Var;
        c81Var.f28667r = G();
        this.J.setDelegate(new oh.h4(this, 6));
        o(false);
        return this.J;
    }

    public final void o(boolean z4) {
        c81 c81Var;
        if (this.I != null && (c81Var = this.J) != null) {
            c81Var.h.clear();
            c81Var.V.clear();
            c81Var.W.clear();
            c81Var.f28648a0.clear();
            c81Var.f28650b0.clear();
            c81Var.E = 0;
            for (int i10 = 0; i10 < this.I.e(); i10++) {
                this.I.getClass();
                this.J.a(this.I.f(i10), this.I.g(i10));
            }
            h();
            if (z4) {
                mh.d1 d1Var = this.J.v;
                TransitionSet transitionSet = new TransitionSet();
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(150L);
                transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
                transitionSet.setOrdering(0);
                transitionSet.setInterpolator((TimeInterpolator) pr.f30183f);
                TransitionManager.beginDelayedTransition(d1Var, transitionSet);
            }
            this.J.f28670x.l();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        c81 c81Var = this.J;
        if (c81Var != null && c81Var.G) {
            return false;
        }
        if (m()) {
            return true;
        }
        onTouchEvent(motionEvent);
        return this.E;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return A(motionEvent);
    }

    public final View q(ViewGroup viewGroup, float f10, float f11) {
        View q10;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                Rect rect = this.L;
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

    public final float r(int i10) {
        if (getMeasuredWidth() == 0) {
            return k7.o.b(1 - Math.abs(getCurrentPosition() - i10), 0, 1);
        }
        return k7.o.a(1.0f - Math.abs(getPositionAnimated() - i10), 0.0f, 1.0f);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        if (this.M && this.F && !this.E) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    public void setAdapter(e81 e81Var) {
        this.I = e81Var;
        int h = e81Var.h(this.f28985b);
        int[] iArr = this.f28988f;
        iArr[0] = h;
        View d = e81Var.d(h);
        View[] viewArr = this.f28987e;
        viewArr[0] = d;
        if (d == null && this.f28985b != 0) {
            this.f28985b = 0;
            int h9 = e81Var.h(0);
            iArr[0] = h9;
            viewArr[0] = e81Var.d(h9);
        }
        e81Var.b(viewArr[0], this.f28985b, iArr[0]);
        addView(viewArr[0]);
        viewArr[0].setVisibility(0);
        o(false);
    }

    public void setAllowDisallowInterceptTouch(boolean z4) {
        this.M = z4;
    }

    public void setPosition(int i10) {
        if (this.I == null) {
            this.f28985b = i10;
            w(false);
        }
        AnimatorSet animatorSet = this.f28992w;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        View[] viewArr = this.f28987e;
        View view = viewArr[1];
        if (view != null) {
            this.h.put(this.f28988f[1], view);
            removeView(viewArr[1]);
            viewArr[1] = null;
        }
        int i11 = this.f28985b;
        if (i11 != i10) {
            this.f28985b = i10;
            this.d = 0;
            this.f28986c = 1.0f;
            View view2 = viewArr[0];
            I(0);
            t(viewArr[0], view2, this.f28985b, i11);
            E(viewArr[0], 0.0f);
            c81 c81Var = this.J;
            if (c81Var != null) {
                c81Var.e(this.f28986c, this.f28985b, this.d);
            }
            w(true);
        }
    }

    public void y(int i10, boolean z4) {
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

    public void w(boolean z4) {
    }

    public void x(int i10) {
    }

    public void z(int i10) {
    }

    public void t(View view, View view2, int i10, int i11) {
    }
}

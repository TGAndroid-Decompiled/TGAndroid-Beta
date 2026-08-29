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
public class z71 extends FrameLayout {
    public static final cr0 O = new cr0(1);
    public float A;
    public boolean B;
    public final int C;
    public boolean D;
    public boolean E;
    public final AnimationNotificationsLocker F;
    public final float G;
    public q71 H;
    public o71 I;
    public final cg.c1 J;
    public final Rect K;
    public boolean L;
    public ValueAnimator M;
    public float N;
    public final org.telegram.ui.ActionBar.c6 f35258a;
    public int f35259b;
    public float f35260c;
    public int d;
    public final View[] f35261e;
    public final int[] f35262f;
    public final SparseArray h;
    public int f35263n;
    public int f35264r;
    public int f35265s;
    public VelocityTracker v;
    public AnimatorSet f35266w;
    public boolean f35267x;
    public boolean f35268y;

    public z71(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f35260c = 1.0f;
        this.h = new SparseArray();
        this.F = new AnimationNotificationsLocker();
        this.J = new cg.c1(this, 9);
        this.K = new Rect();
        this.L = true;
        this.f35258a = c6Var;
        this.G = AndroidUtilities.getPixelsInCM(0.3f, true);
        this.C = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.f35262f = new int[2];
        this.f35261e = new View[2];
        setClipChildren(true);
    }

    public static jl0 p(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof jl0) {
                    return (jl0) childAt;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z71.A(android.view.MotionEvent):boolean");
    }

    public final boolean B(MotionEvent motionEvent, boolean z10) {
        int i10;
        if (!z10 && this.f35259b == 0) {
            this.N = 0.0f;
            return false;
        } else if ((z10 && this.f35259b == this.H.e() - 1) || this.M != null || !i(motionEvent) || ((z10 && !k(motionEvent)) || (!z10 && !j(motionEvent)))) {
            return false;
        } else {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.E = false;
            this.D = true;
            v();
            this.f35264r = (int) (motionEvent.getX() + this.A);
            o71 o71Var = this.I;
            if (o71Var != null) {
                o71Var.setEnabled(false);
            }
            this.F.lock();
            this.f35268y = z10;
            int i11 = this.f35259b;
            if (z10) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            this.d = i11 + i10;
            I(1);
            View[] viewArr = this.f35261e;
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
        q71 q71Var = this.H;
        q71Var.getClass();
        if (!(q71Var instanceof org.telegram.ui.c7)) {
            z10 = false;
        }
        AnimatorSet animatorSet = this.f35266w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f35266w = null;
        }
        View[] viewArr = this.f35261e;
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
        if (this.f35259b > this.H.e() - 1) {
            this.f35259b = this.H.e() - 1;
        }
        if (this.f35259b < 0) {
            this.f35259b = 0;
        }
        int h = this.H.h(this.f35259b);
        int[] iArr = this.f35262f;
        iArr[0] = h;
        View d = this.H.d(h);
        viewArr[0] = d;
        this.H.b(d, this.f35259b, iArr[0]);
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
            this.I.getClass();
        }
        o(z10);
        if (z10) {
            this.f35266w = new AnimatorSet();
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
                this.f35266w.playTogether(H(view7, getMeasuredWidth()));
            }
            View view8 = viewArr[0];
            if (view8 != null) {
                this.f35266w.playTogether(H(view8, 0.0f));
            }
            w(true);
            o71 o71Var = this.I;
            o71Var.f34940a = 0.0f;
            o71Var.v.f1();
            this.I.invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new m71(this, 2));
            this.f35266w.playTogether(ofFloat);
            this.f35266w.setInterpolator(O);
            this.f35266w.setDuration(220L);
            this.f35266w.addListener(new n71(this, 2));
            this.I.setEnabled(false);
            this.f35267x = true;
            this.f35266w.start();
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
        if (i10 != this.f35259b) {
            ValueAnimator valueAnimator = this.M;
            if (valueAnimator == null || this.d != i10) {
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.M = null;
                }
                if (this.f35259b < i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f35268y = z10;
                this.d = i10;
                I(1);
                y(i10, z10);
                View[] viewArr = this.f35261e;
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
                this.M = ofFloat;
                ofFloat.addUpdateListener(new m71(this, 0));
                this.M.addListener(new n71(this, 0));
                this.M.setDuration(getManualScrollDuration());
                this.M.setInterpolator(jr.h);
                this.M.start();
            }
        }
    }

    public void E(View view, float f9) {
        view.setTranslationX(f9);
    }

    public void F() {
        View[] viewArr = this.f35261e;
        View view = viewArr[0];
        View view2 = viewArr[1];
        viewArr[0] = view2;
        viewArr[1] = view;
        int i10 = this.f35259b;
        int i11 = this.d;
        this.f35259b = i11;
        this.d = i10;
        this.f35260c = 1.0f - this.f35260c;
        int[] iArr = this.f35262f;
        int i12 = iArr[0];
        iArr[0] = iArr[1];
        iArr[1] = i12;
        t(view2, view, i11, i10);
    }

    public int G() {
        return 16;
    }

    public final ValueAnimator H(View view, float f9) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(view.getTranslationX(), f9);
        ofFloat.addUpdateListener(new uw0(this, view, 1));
        ofFloat.addListener(new p71(this, view, f9));
        return ofFloat;
    }

    public final void I(int i10) {
        int i11;
        if (i10 == 0) {
            i11 = this.f35259b;
        } else {
            i11 = this.d;
        }
        if (i11 >= 0 && i11 < this.H.e()) {
            View[] viewArr = this.f35261e;
            View view = viewArr[i10];
            SparseArray sparseArray = this.h;
            int[] iArr = this.f35262f;
            if (view == null) {
                int h = this.H.h(i11);
                iArr[i10] = h;
                View view2 = (View) sparseArray.get(h);
                if (view2 == null) {
                    view2 = this.H.d(iArr[i10]);
                } else {
                    sparseArray.remove(iArr[i10]);
                }
                if (view2.getParent() != null) {
                    ((ViewGroup) view2.getParent()).removeView(view2);
                }
                addView(view2);
                view2.setTranslationX(getMeasuredWidth());
                viewArr[i10] = view2;
                this.H.b(view2, i11, iArr[i10]);
                viewArr[i10].setVisibility(0);
            } else if (iArr[i10] == this.H.h(i11)) {
                this.H.b(viewArr[i10], i11, iArr[i10]);
                viewArr[i10].setVisibility(0);
            } else {
                sparseArray.put(iArr[i10], viewArr[i10]);
                viewArr[i10].setVisibility(8);
                removeView(viewArr[i10]);
                int h10 = this.H.h(i11);
                iArr[i10] = h10;
                View view3 = (View) sparseArray.get(h10);
                if (view3 == null) {
                    view3 = this.H.d(iArr[i10]);
                } else {
                    sparseArray.remove(iArr[i10]);
                }
                addView(view3);
                viewArr[i10] = view3;
                view3.setVisibility(0);
                q71 q71Var = this.H;
                q71Var.b(viewArr[i10], i11, q71Var.h(i11));
            }
        }
    }

    @Override
    public final boolean canScrollHorizontally(int i10) {
        boolean z10;
        if (i10 != 0) {
            if (!this.f35267x && !this.D) {
                if (i10 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((z10 || this.f35259b != 0) && (!z10 || this.f35259b != this.H.e() - 1)) {
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
        return this.f35259b;
    }

    public float getCurrentPositionAlpha() {
        View[] viewArr = this.f35261e;
        View view = viewArr[0];
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return Utilities.clamp(1.0f - Math.abs(viewArr[0].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f);
    }

    public View getCurrentView() {
        return this.f35261e[0];
    }

    public long getManualScrollDuration() {
        return 540L;
    }

    public int getNextPosition() {
        return this.d;
    }

    public float getNextPositionAlpha() {
        View[] viewArr = this.f35261e;
        View view = viewArr[1];
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return Utilities.clamp(1.0f - Math.abs(viewArr[1].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f);
    }

    public float getPositionAnimated() {
        float f9;
        View[] viewArr = this.f35261e;
        View view = viewArr[0];
        if (view != null && view.getVisibility() == 0) {
            f9 = (this.f35259b * Utilities.clamp(1.0f - Math.abs(viewArr[0].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f)) + 0.0f;
        } else {
            f9 = 0.0f;
        }
        View view2 = viewArr[1];
        if (view2 != null && view2.getVisibility() == 0) {
            return (this.d * Utilities.clamp(1.0f - Math.abs(viewArr[1].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f)) + f9;
        }
        return f9;
    }

    public View[] getViewPages() {
        return this.f35261e;
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
        float f9;
        View view;
        View view2;
        int measuredWidth;
        int measuredWidth2;
        float f10;
        boolean z11;
        boolean z12;
        VelocityTracker velocityTracker = this.v;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.C);
        }
        if (this.D) {
            View[] viewArr = this.f35261e;
            float x4 = viewArr[0].getX();
            this.f35266w = new AnimatorSet();
            if (this.A != 0.0f) {
                if (Math.abs(0.0f) > 1500.0f) {
                    this.B = false;
                } else if (this.f35268y) {
                    View view3 = viewArr[1];
                    if (view3 != null) {
                        if (view3.getX() > (viewArr[0].getMeasuredWidth() >> 1)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.B = z12;
                    } else {
                        this.B = false;
                    }
                } else {
                    if (viewArr[0].getX() < (viewArr[0].getMeasuredWidth() >> 1)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.B = z11;
                }
            } else {
                if (Math.abs(x4) < viewArr[0].getMeasuredWidth() / 3.0f && (Math.abs(0.0f) < 3500.0f || Math.abs(0.0f) < Math.abs(0.0f))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.B = z10;
            }
            if (this.B) {
                f9 = Math.abs(x4);
                if (this.f35268y) {
                    this.f35266w.playTogether(H(viewArr[0], 0.0f));
                    View view4 = viewArr[1];
                    if (view4 != null) {
                        this.f35266w.playTogether(H(view4, view4.getMeasuredWidth()));
                    }
                } else {
                    this.f35266w.playTogether(H(viewArr[0], 0.0f));
                    View view5 = viewArr[1];
                    if (view5 != null) {
                        this.f35266w.playTogether(H(view5, -view5.getMeasuredWidth()));
                    }
                }
            } else if (this.d >= 0) {
                f9 = viewArr[0].getMeasuredWidth() - Math.abs(x4);
                if (this.f35268y) {
                    this.f35266w.playTogether(H(viewArr[0], -view2.getMeasuredWidth()));
                    View view6 = viewArr[1];
                    if (view6 != null) {
                        this.f35266w.playTogether(H(view6, 0.0f));
                    }
                } else {
                    this.f35266w.playTogether(H(viewArr[0], view.getMeasuredWidth()));
                    View view7 = viewArr[1];
                    if (view7 != null) {
                        this.f35266w.playTogether(H(view7, 0.0f));
                    }
                }
            } else {
                f9 = 0.0f;
            }
            if (this.d < 0) {
                float f11 = this.N;
                if (this.B) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                ofFloat.addUpdateListener(new m71(this, 3));
                this.f35266w.playTogether(ofFloat);
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(this.J);
            this.f35266w.playTogether(ofFloat2);
            this.f35266w.setInterpolator(O);
            float measuredWidth3 = getMeasuredWidth() / 2;
            float sin = (((float) Math.sin((Math.min(1.0f, (f9 * 1.0f) / measuredWidth) - 0.5f) * 0.47123894f)) * measuredWidth3) + measuredWidth3;
            float abs = Math.abs(0.0f);
            if (abs > 0.0f) {
                measuredWidth2 = Math.round(Math.abs(sin / abs) * 1000.0f) * 4;
            } else {
                measuredWidth2 = (int) (((f9 / getMeasuredWidth()) + 1.0f) * 100.0f);
            }
            this.f35266w.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
            this.f35266w.addListener(new n71(this, 3));
            this.f35266w.start();
            this.f35267x = true;
            this.D = false;
            w(false);
        } else {
            this.E = false;
            o71 o71Var = this.I;
            if (o71Var != null) {
                o71Var.setEnabled(true);
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
        if (!this.f35267x) {
            return false;
        }
        boolean z11 = this.B;
        int i10 = -1;
        View[] viewArr = this.f35261e;
        if (z11) {
            if (Math.abs(viewArr[0].getTranslationX()) < 1.0f) {
                E(viewArr[0], 0.0f);
                View view = viewArr[1];
                if (view != null) {
                    int measuredWidth = viewArr[0].getMeasuredWidth();
                    if (this.f35268y) {
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
                if (!this.f35268y) {
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
            AnimatorSet animatorSet = this.f35266w;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f35266w = null;
            }
            this.f35267x = false;
        }
        return this.f35267x;
    }

    public final y71 n(int i10, boolean z10) {
        o71 o71Var = new o71(this, getContext(), z10, i10, this.f35258a);
        this.I = o71Var;
        o71Var.f34959r = G();
        this.I.setDelegate(new n(this, 4));
        o(false);
        return this.I;
    }

    public final void o(boolean z10) {
        o71 o71Var;
        if (this.H != null && (o71Var = this.I) != null) {
            o71Var.h.clear();
            o71Var.U.clear();
            o71Var.V.clear();
            o71Var.W.clear();
            o71Var.f34941a0.clear();
            o71Var.D = 0;
            for (int i10 = 0; i10 < this.H.e(); i10++) {
                this.H.getClass();
                this.I.a(this.H.f(i10), this.H.g(i10));
            }
            h();
            if (z10) {
                jh.e1 e1Var = this.I.v;
                TransitionSet transitionSet = new TransitionSet();
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(150L);
                transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
                transitionSet.setOrdering(0);
                transitionSet.setInterpolator((TimeInterpolator) jr.f29800f);
                TransitionManager.beginDelayedTransition(e1Var, transitionSet);
            }
            this.I.f34962x.l();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        o71 o71Var = this.I;
        if (o71Var != null && o71Var.F) {
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

    public final View q(ViewGroup viewGroup, float f9, float f10) {
        View q6;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                Rect rect = this.K;
                childAt.getHitRect(rect);
                if (!rect.contains((int) f9, (int) f10)) {
                    continue;
                } else if (childAt.canScrollHorizontally(-1)) {
                    return childAt;
                } else {
                    if ((childAt instanceof ViewGroup) && (q6 = q((ViewGroup) childAt, f9 - rect.left, f10 - rect.top)) != null) {
                        return q6;
                    }
                }
            }
        }
        return null;
    }

    public final float r(int i10) {
        if (getMeasuredWidth() == 0) {
            return i7.w.b(1 - Math.abs(getCurrentPosition() - i10), 0, 1);
        }
        return i7.w.a(1.0f - Math.abs(getPositionAnimated() - i10), 0.0f, 1.0f);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.L && this.E && !this.D) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void setAdapter(q71 q71Var) {
        this.H = q71Var;
        int h = q71Var.h(this.f35259b);
        int[] iArr = this.f35262f;
        iArr[0] = h;
        View d = q71Var.d(h);
        View[] viewArr = this.f35261e;
        viewArr[0] = d;
        if (d == null && this.f35259b != 0) {
            this.f35259b = 0;
            int h10 = q71Var.h(0);
            iArr[0] = h10;
            viewArr[0] = q71Var.d(h10);
        }
        q71Var.b(viewArr[0], this.f35259b, iArr[0]);
        addView(viewArr[0]);
        viewArr[0].setVisibility(0);
        o(false);
    }

    public void setAllowDisallowInterceptTouch(boolean z10) {
        this.L = z10;
    }

    public void setPosition(int i10) {
        if (this.H == null) {
            this.f35259b = i10;
            w(false);
        }
        AnimatorSet animatorSet = this.f35266w;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        View[] viewArr = this.f35261e;
        View view = viewArr[1];
        if (view != null) {
            this.h.put(this.f35262f[1], view);
            removeView(viewArr[1]);
            viewArr[1] = null;
        }
        int i11 = this.f35259b;
        if (i11 != i10) {
            this.f35259b = i10;
            this.d = 0;
            this.f35260c = 1.0f;
            View view2 = viewArr[0];
            I(0);
            t(viewArr[0], view2, this.f35259b, i11);
            E(viewArr[0], 0.0f);
            o71 o71Var = this.I;
            if (o71Var != null) {
                o71Var.e(this.f35260c, this.f35259b, this.d);
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

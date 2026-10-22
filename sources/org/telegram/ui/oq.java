package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class oq implements ViewTreeObserver.OnPreDrawListener {
    public final int f39959a;
    public final View f39960b;
    public final int f39961c;
    public final Object d;

    public oq(Object obj, org.telegram.ui.Components.b10 b10Var, int i10, int i11) {
        this.f39959a = i11;
        this.d = obj;
        this.f39960b = b10Var;
        this.f39961c = i10;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z10;
        float f7;
        float f10;
        int i10;
        int i11 = this.f39959a;
        int i12 = this.f39961c;
        Object obj = this.d;
        View view = this.f39960b;
        float f11 = 0.0f;
        int i13 = 2;
        int i14 = 0;
        boolean z11 = true;
        switch (i11) {
            case 0:
                hr hrVar = (hr) obj;
                hrVar.f37725c.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = hrVar.f37725c.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = hrVar.f37725c.getChildAt(i15);
                    if (childAt != view) {
                        hrVar.f37725c.getClass();
                        if (RecyclerView.R(childAt) >= i12) {
                            childAt.setAlpha(0.0f);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                            ofFloat.setStartDelay((int) ((Math.min(hrVar.f37725c.getMeasuredHeight(), Math.max(0, childAt.getTop())) / hrVar.f37725c.getMeasuredHeight()) * 100.0f));
                            ofFloat.setDuration(200L);
                            animatorSet.playTogether(ofFloat);
                        }
                    }
                }
                if (view != null && view.getParent() == null) {
                    hrVar.f37725c.addView(view);
                    s4.n0 layoutManager = hrVar.f37725c.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        z10 = true;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new nq(this, layoutManager));
                        ofFloat2.start();
                        animatorSet.start();
                        return z10;
                    }
                }
                z10 = true;
                animatorSet.start();
                return z10;
            case 1:
                float f12 = 0.0f;
                org.telegram.ui.Components.mk mkVar = (org.telegram.ui.Components.mk) obj;
                org.telegram.ui.Components.nk nkVar = mkVar.X;
                nkVar.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount2 = nkVar.f28826r.getChildCount();
                AnimatorSet animatorSet2 = new AnimatorSet();
                int i16 = 0;
                while (i16 < childCount2) {
                    View childAt2 = nkVar.f28826r.getChildAt(i16);
                    if (view != null) {
                        nkVar.f28826r.getClass();
                        if (RecyclerView.R(childAt2) < i12) {
                            i16++;
                            f12 = 0.0f;
                        }
                    }
                    childAt2.setAlpha(f12);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat3.setStartDelay((int) ((Math.min(nkVar.f28826r.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / nkVar.f28826r.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(200L);
                    animatorSet2.playTogether(ofFloat3);
                    i16++;
                    f12 = 0.0f;
                }
                animatorSet2.addListener(new org.telegram.ui.Components.kk(this));
                mkVar.U.lock();
                animatorSet2.start();
                if (view != null && view.getParent() == null) {
                    nkVar.f28826r.addView(view);
                    s4.n0 layoutManager2 = nkVar.f28826r.getLayoutManager();
                    if (layoutManager2 != null) {
                        layoutManager2.M(view);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat4.addListener(new org.telegram.ui.Components.kk(this, layoutManager2));
                        ofFloat4.start();
                        return true;
                    }
                }
                return true;
            case 2:
                int i17 = 0;
                org.telegram.ui.Components.ol0 ol0Var = (org.telegram.ui.Components.ol0) obj;
                SparseArray sparseArray = ol0Var.f29069b;
                org.telegram.ui.Components.jm0 jm0Var = ol0Var.f29068a;
                jm0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ol0Var.h.remove(this);
                int childCount3 = jm0Var.getChildCount();
                AnimatorSet animatorSet3 = new AnimatorSet();
                while (i14 < childCount3) {
                    View childAt3 = jm0Var.getChildAt(i14);
                    jm0Var.getClass();
                    int R = RecyclerView.R(childAt3);
                    if (childAt3 != view && R >= i12 - 1 && sparseArray.get(R, null) == null) {
                        sparseArray.put(R, Float.valueOf(0.0f));
                        ol0Var.d = z11;
                        jm0Var.invalidate();
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat5.addUpdateListener(new org.telegram.ui.ActionBar.q2(this, R, 6));
                        ofFloat5.addListener(new gi.p2(this, R, 10));
                        ofFloat5.setStartDelay((int) ((Math.min(jm0Var.getMeasuredHeight(), Math.max(i17, childAt3.getTop())) / jm0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat5.setDuration(200L);
                        animatorSet3.playTogether(ofFloat5);
                    }
                    i14++;
                    z11 = true;
                    i17 = 0;
                }
                ol0Var.f29072g.add(animatorSet3);
                animatorSet3.start();
                animatorSet3.addListener(new org.telegram.ui.Components.nl0(1, this, animatorSet3));
                return false;
            default:
                e10 e10Var = (e10) obj;
                e10Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ai.u1 u1Var = e10Var.f36497b;
                int childCount4 = u1Var.getChildCount();
                AnimatorSet animatorSet4 = new AnimatorSet();
                int i18 = 0;
                while (i18 < childCount4) {
                    View childAt4 = u1Var.getChildAt(i18);
                    if (view != null) {
                        u1Var.getClass();
                        f7 = 100.0f;
                        if (RecyclerView.R(childAt4) < i12) {
                            f10 = f11;
                            i10 = i14;
                            i18++;
                            f11 = f10;
                            i14 = i10;
                            i13 = 2;
                        }
                    } else {
                        f7 = 100.0f;
                    }
                    childAt4.setAlpha(f11);
                    f10 = f11;
                    i10 = i14;
                    float[] fArr = new float[i13];
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(childAt4, View.ALPHA, fArr);
                    ofFloat6.setStartDelay((int) ((Math.min(u1Var.getMeasuredHeight(), Math.max(i14, childAt4.getTop())) / u1Var.getMeasuredHeight()) * f7));
                    ofFloat6.setDuration(200L);
                    Animator[] animatorArr = new Animator[1];
                    animatorArr[i10] = ofFloat6;
                    animatorSet4.playTogether(animatorArr);
                    i18++;
                    f11 = f10;
                    i14 = i10;
                    i13 = 2;
                }
                float f13 = f11;
                int i19 = i14;
                animatorSet4.addListener(new u00(this));
                e10Var.f36510l0.lock();
                animatorSet4.start();
                if (view != null && view.getParent() == null) {
                    u1Var.addView(view);
                    s4.n0 layoutManager3 = u1Var.getLayoutManager();
                    if (layoutManager3 != null) {
                        layoutManager3.M(view);
                        Property property = View.ALPHA;
                        float[] fArr2 = new float[2];
                        fArr2[i19] = view.getAlpha();
                        fArr2[1] = f13;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, property, fArr2);
                        ofFloat7.addListener(new u00(this, layoutManager3));
                        ofFloat7.start();
                    }
                }
                return true;
        }
    }
}

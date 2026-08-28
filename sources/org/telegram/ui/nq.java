package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class nq implements ViewTreeObserver.OnPreDrawListener {
    public final int f40786a;
    public final View f40787b;
    public final int f40788c;
    public final Object d;

    public nq(Object obj, org.telegram.ui.Components.e00 e00Var, int i9, int i10) {
        this.f40786a = i10;
        this.d = obj;
        this.f40787b = e00Var;
        this.f40788c = i9;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z10;
        float f10;
        int i9 = this.f40786a;
        int i10 = this.f40788c;
        Object obj = this.d;
        View view = this.f40787b;
        float f11 = 0.0f;
        int i11 = 2;
        int i12 = 0;
        boolean z11 = true;
        switch (i9) {
            case 0:
                jr jrVar = (jr) obj;
                jrVar.f39563c.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = jrVar.f39563c.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = jrVar.f39563c.getChildAt(i13);
                    if (childAt != view) {
                        jrVar.f39563c.getClass();
                        if (RecyclerView.R(childAt) >= i10) {
                            childAt.setAlpha(0.0f);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                            ofFloat.setStartDelay((int) ((Math.min(jrVar.f39563c.getMeasuredHeight(), Math.max(0, childAt.getTop())) / jrVar.f39563c.getMeasuredHeight()) * 100.0f));
                            ofFloat.setDuration(200L);
                            animatorSet.playTogether(ofFloat);
                        }
                    }
                }
                if (view != null && view.getParent() == null) {
                    jrVar.f39563c.addView(view);
                    f2.z0 layoutManager = jrVar.f39563c.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        z10 = true;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new xp(this, layoutManager));
                        ofFloat2.start();
                        animatorSet.start();
                        return z10;
                    }
                }
                z10 = true;
                animatorSet.start();
                return z10;
            case 1:
                org.telegram.ui.Components.ek ekVar = (org.telegram.ui.Components.ek) obj;
                org.telegram.ui.Components.fk fkVar = ekVar.T;
                fkVar.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount2 = fkVar.f28459r.getChildCount();
                AnimatorSet animatorSet2 = new AnimatorSet();
                for (int i14 = 0; i14 < childCount2; i14++) {
                    View childAt2 = fkVar.f28459r.getChildAt(i14);
                    if (view != null) {
                        fkVar.f28459r.getClass();
                        if (RecyclerView.R(childAt2) < i10) {
                        }
                    }
                    childAt2.setAlpha(0.0f);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat3.setStartDelay((int) ((Math.min(fkVar.f28459r.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / fkVar.f28459r.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(200L);
                    animatorSet2.playTogether(ofFloat3);
                }
                animatorSet2.addListener(new org.telegram.ui.Components.ck(this));
                ekVar.Q.lock();
                animatorSet2.start();
                if (view != null && view.getParent() == null) {
                    fkVar.f28459r.addView(view);
                    f2.z0 layoutManager2 = fkVar.f28459r.getLayoutManager();
                    if (layoutManager2 != null) {
                        layoutManager2.M(view);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat4.addListener(new org.telegram.ui.Components.ck(this, layoutManager2));
                        ofFloat4.start();
                        return true;
                    }
                }
                return true;
            case 2:
                org.telegram.ui.Components.dk0 dk0Var = (org.telegram.ui.Components.dk0) obj;
                SparseArray sparseArray = dk0Var.f27746b;
                org.telegram.ui.Components.wk0 wk0Var = dk0Var.f27745a;
                wk0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                dk0Var.h.remove(this);
                int childCount3 = wk0Var.getChildCount();
                AnimatorSet animatorSet3 = new AnimatorSet();
                int i15 = 0;
                while (i15 < childCount3) {
                    View childAt3 = wk0Var.getChildAt(i15);
                    wk0Var.getClass();
                    int R = RecyclerView.R(childAt3);
                    if (childAt3 != view && R >= i10 - 1 && sparseArray.get(R, null) == null) {
                        sparseArray.put(R, Float.valueOf(0.0f));
                        dk0Var.d = z11;
                        wk0Var.invalidate();
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat5.addUpdateListener(new dh.b(this, R, 6));
                        ofFloat5.addListener(new mh.o2(this, R, 8));
                        ofFloat5.setStartDelay((int) ((Math.min(wk0Var.getMeasuredHeight(), Math.max(0, childAt3.getTop())) / wk0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat5.setDuration(200L);
                        animatorSet3.playTogether(ofFloat5);
                    }
                    i15++;
                    z11 = true;
                }
                dk0Var.f27750g.add(animatorSet3);
                animatorSet3.start();
                animatorSet3.addListener(new fg.j(28, this, animatorSet3));
                return false;
            default:
                f10 f10Var = (f10) obj;
                f10Var.getViewTreeObserver().removeOnPreDrawListener(this);
                gh.f1 f1Var = f10Var.f38087b;
                int childCount4 = f1Var.getChildCount();
                AnimatorSet animatorSet4 = new AnimatorSet();
                int i16 = 0;
                while (i16 < childCount4) {
                    View childAt4 = f1Var.getChildAt(i16);
                    if (view != null) {
                        f1Var.getClass();
                        f10 = 100.0f;
                        if (RecyclerView.R(childAt4) < i10) {
                            i16++;
                            f11 = 0.0f;
                            i11 = 2;
                            i12 = 0;
                        }
                    } else {
                        f10 = 100.0f;
                    }
                    childAt4.setAlpha(f11);
                    float[] fArr = new float[i11];
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(childAt4, View.ALPHA, fArr);
                    ofFloat6.setStartDelay((int) ((Math.min(f1Var.getMeasuredHeight(), Math.max(i12, childAt4.getTop())) / f1Var.getMeasuredHeight()) * f10));
                    ofFloat6.setDuration(200L);
                    animatorSet4.playTogether(ofFloat6);
                    i16++;
                    f11 = 0.0f;
                    i11 = 2;
                    i12 = 0;
                }
                animatorSet4.addListener(new v00(this));
                f10Var.f38097h0.lock();
                animatorSet4.start();
                if (view != null && view.getParent() == null) {
                    f1Var.addView(view);
                    f2.z0 layoutManager3 = f1Var.getLayoutManager();
                    if (layoutManager3 != null) {
                        layoutManager3.M(view);
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat7.addListener(new v00(this, layoutManager3));
                        ofFloat7.start();
                    }
                }
                return true;
        }
    }
}

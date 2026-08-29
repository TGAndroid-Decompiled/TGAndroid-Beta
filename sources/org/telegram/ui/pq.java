package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class pq implements ViewTreeObserver.OnPreDrawListener {
    public final int f41445a;
    public final View f41446b;
    public final int f41447c;
    public final Object d;

    public pq(Object obj, org.telegram.ui.Components.p00 p00Var, int i10, int i11) {
        this.f41445a = i11;
        this.d = obj;
        this.f41446b = p00Var;
        this.f41447c = i10;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z10;
        float f9;
        int i10 = this.f41445a;
        int i11 = this.f41447c;
        Object obj = this.d;
        View view = this.f41446b;
        float f10 = 0.0f;
        int i12 = 2;
        int i13 = 0;
        boolean z11 = true;
        switch (i10) {
            case 0:
                jr jrVar = (jr) obj;
                jrVar.f39624c.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = jrVar.f39624c.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = jrVar.f39624c.getChildAt(i14);
                    if (childAt != view) {
                        jrVar.f39624c.getClass();
                        if (RecyclerView.R(childAt) >= i11) {
                            childAt.setAlpha(0.0f);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                            ofFloat.setStartDelay((int) ((Math.min(jrVar.f39624c.getMeasuredHeight(), Math.max(0, childAt.getTop())) / jrVar.f39624c.getMeasuredHeight()) * 100.0f));
                            ofFloat.setDuration(200L);
                            animatorSet.playTogether(ofFloat);
                        }
                    }
                }
                if (view != null && view.getParent() == null) {
                    jrVar.f39624c.addView(view);
                    f2.w0 layoutManager = jrVar.f39624c.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        z10 = true;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new bm(this, layoutManager));
                        ofFloat2.start();
                        animatorSet.start();
                        return z10;
                    }
                }
                z10 = true;
                animatorSet.start();
                return z10;
            case 1:
                org.telegram.ui.Components.ik ikVar = (org.telegram.ui.Components.ik) obj;
                org.telegram.ui.Components.jk jkVar = ikVar.T;
                jkVar.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount2 = jkVar.f29678r.getChildCount();
                AnimatorSet animatorSet2 = new AnimatorSet();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt2 = jkVar.f29678r.getChildAt(i15);
                    if (view != null) {
                        jkVar.f29678r.getClass();
                        if (RecyclerView.R(childAt2) < i11) {
                        }
                    }
                    childAt2.setAlpha(0.0f);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat3.setStartDelay((int) ((Math.min(jkVar.f29678r.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / jkVar.f29678r.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(200L);
                    animatorSet2.playTogether(ofFloat3);
                }
                animatorSet2.addListener(new org.telegram.ui.Components.gk(this));
                ikVar.Q.lock();
                animatorSet2.start();
                if (view != null && view.getParent() == null) {
                    jkVar.f29678r.addView(view);
                    f2.w0 layoutManager2 = jkVar.f29678r.getLayoutManager();
                    if (layoutManager2 != null) {
                        layoutManager2.M(view);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat4.addListener(new org.telegram.ui.Components.gk(this, layoutManager2));
                        ofFloat4.start();
                        return true;
                    }
                }
                return true;
            case 2:
                org.telegram.ui.Components.pk0 pk0Var = (org.telegram.ui.Components.pk0) obj;
                SparseArray sparseArray = pk0Var.f31699b;
                org.telegram.ui.Components.jl0 jl0Var = pk0Var.f31698a;
                jl0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                pk0Var.h.remove(this);
                int childCount3 = jl0Var.getChildCount();
                AnimatorSet animatorSet3 = new AnimatorSet();
                int i16 = 0;
                while (i16 < childCount3) {
                    View childAt3 = jl0Var.getChildAt(i16);
                    jl0Var.getClass();
                    int R = RecyclerView.R(childAt3);
                    if (childAt3 != view && R >= i11 - 1 && sparseArray.get(R, null) == null) {
                        sparseArray.put(R, Float.valueOf(0.0f));
                        pk0Var.d = z11;
                        jl0Var.invalidate();
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat5.addUpdateListener(new gh.b(this, R, 6));
                        ofFloat5.addListener(new org.telegram.ui.Cells.z3(this, R, 6));
                        ofFloat5.setStartDelay((int) ((Math.min(jl0Var.getMeasuredHeight(), Math.max(0, childAt3.getTop())) / jl0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat5.setDuration(200L);
                        animatorSet3.playTogether(ofFloat5);
                    }
                    i16++;
                    z11 = true;
                }
                pk0Var.f31703g.add(animatorSet3);
                animatorSet3.start();
                animatorSet3.addListener(new org.telegram.ui.Components.ok0(1, this, animatorSet3));
                return false;
            default:
                h10 h10Var = (h10) obj;
                h10Var.getViewTreeObserver().removeOnPreDrawListener(this);
                jh.e1 e1Var = h10Var.f38720b;
                int childCount4 = e1Var.getChildCount();
                AnimatorSet animatorSet4 = new AnimatorSet();
                int i17 = 0;
                while (i17 < childCount4) {
                    View childAt4 = e1Var.getChildAt(i17);
                    if (view != null) {
                        e1Var.getClass();
                        f9 = 100.0f;
                        if (RecyclerView.R(childAt4) < i11) {
                            i17++;
                            f10 = 0.0f;
                            i12 = 2;
                            i13 = 0;
                        }
                    } else {
                        f9 = 100.0f;
                    }
                    childAt4.setAlpha(f10);
                    float[] fArr = new float[i12];
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(childAt4, View.ALPHA, fArr);
                    ofFloat6.setStartDelay((int) ((Math.min(e1Var.getMeasuredHeight(), Math.max(i13, childAt4.getTop())) / e1Var.getMeasuredHeight()) * f9));
                    ofFloat6.setDuration(200L);
                    animatorSet4.playTogether(ofFloat6);
                    i17++;
                    f10 = 0.0f;
                    i12 = 2;
                    i13 = 0;
                }
                animatorSet4.addListener(new x00(this));
                h10Var.f38730h0.lock();
                animatorSet4.start();
                if (view != null && view.getParent() == null) {
                    e1Var.addView(view);
                    f2.w0 layoutManager3 = e1Var.getLayoutManager();
                    if (layoutManager3 != null) {
                        layoutManager3.M(view);
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat7.addListener(new x00(this, layoutManager3));
                        ofFloat7.start();
                    }
                }
                return true;
        }
    }
}

package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

public final class pq implements ViewTreeObserver.OnPreDrawListener {

    public final int f41408a;

    public final View f41409b;

    public final int f41410c;
    public final Object d;

    public pq(Object obj, org.telegram.ui.Components.h00 h00Var, int i10, int i11) {
        this.f41408a = i11;
        this.d = obj;
        this.f41409b = h00Var;
        this.f41410c = i10;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z10;
        float f10;
        int i10 = this.f41408a;
        int i11 = this.f41410c;
        Object obj = this.d;
        View view = this.f41409b;
        float f11 = 0.0f;
        int i12 = 2;
        int i13 = 0;
        switch (i10) {
            case 0:
                lr lrVar = (lr) obj;
                lrVar.f40185c.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = lrVar.f40185c.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = lrVar.f40185c.getChildAt(i14);
                    if (childAt != view) {
                        lrVar.f40185c.getClass();
                        if (RecyclerView.R(childAt) >= i11) {
                            childAt.setAlpha(0.0f);
                            int iMin = (int) ((Math.min(lrVar.f40185c.getMeasuredHeight(), Math.max(0, childAt.getTop())) / lrVar.f40185c.getMeasuredHeight()) * 100.0f);
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                            objectAnimatorOfFloat.setStartDelay(iMin);
                            objectAnimatorOfFloat.setDuration(200L);
                            animatorSet.playTogether(objectAnimatorOfFloat);
                        }
                    }
                }
                if (view == null || view.getParent() != null) {
                    z10 = true;
                } else {
                    lrVar.f40185c.addView(view);
                    f2.x0 layoutManager = lrVar.f40185c.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        z10 = true;
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                        objectAnimatorOfFloat2.addListener(new am(this, layoutManager));
                        objectAnimatorOfFloat2.start();
                    } else {
                        z10 = true;
                    }
                }
                animatorSet.start();
                return z10;
            case 1:
                org.telegram.ui.Components.ak akVar = (org.telegram.ui.Components.ak) obj;
                org.telegram.ui.Components.bk bkVar = akVar.T;
                bkVar.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount2 = bkVar.f27115r.getChildCount();
                AnimatorSet animatorSet2 = new AnimatorSet();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt2 = bkVar.f27115r.getChildAt(i15);
                    if (view != null) {
                        bkVar.f27115r.getClass();
                        if (RecyclerView.R(childAt2) >= i11) {
                            childAt2.setAlpha(0.0f);
                            int iMin2 = (int) ((Math.min(bkVar.f27115r.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / bkVar.f27115r.getMeasuredHeight()) * 100.0f);
                            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                            objectAnimatorOfFloat3.setStartDelay(iMin2);
                            objectAnimatorOfFloat3.setDuration(200L);
                            animatorSet2.playTogether(objectAnimatorOfFloat3);
                        }
                    } else {
                        childAt2.setAlpha(0.0f);
                        int iMin3 = (int) ((Math.min(bkVar.f27115r.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / bkVar.f27115r.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        objectAnimatorOfFloat4.setStartDelay(iMin3);
                        objectAnimatorOfFloat4.setDuration(200L);
                        animatorSet2.playTogether(objectAnimatorOfFloat4);
                    }
                }
                animatorSet2.addListener(new org.telegram.ui.Components.yj(this));
                akVar.Q.lock();
                animatorSet2.start();
                if (view != null && view.getParent() == null) {
                    bkVar.f27115r.addView(view);
                    f2.x0 layoutManager2 = bkVar.f27115r.getLayoutManager();
                    if (layoutManager2 != null) {
                        layoutManager2.M(view);
                        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                        objectAnimatorOfFloat5.addListener(new org.telegram.ui.Components.yj(this, layoutManager2));
                        objectAnimatorOfFloat5.start();
                        return true;
                    }
                }
                return true;
            case 2:
                org.telegram.ui.Components.gk0 gk0Var = (org.telegram.ui.Components.gk0) obj;
                SparseArray sparseArray = gk0Var.f28738b;
                org.telegram.ui.Components.zk0 zk0Var = gk0Var.f28737a;
                zk0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                gk0Var.h.remove(this);
                int childCount3 = zk0Var.getChildCount();
                AnimatorSet animatorSet3 = new AnimatorSet();
                for (int i16 = 0; i16 < childCount3; i16++) {
                    View childAt3 = zk0Var.getChildAt(i16);
                    zk0Var.getClass();
                    int iR = RecyclerView.R(childAt3);
                    if (childAt3 != view && iR >= i11 - 1 && sparseArray.get(iR, null) == null) {
                        sparseArray.put(iR, Float.valueOf(0.0f));
                        gk0Var.d = true;
                        zk0Var.invalidate();
                        int iMin4 = (int) ((Math.min(zk0Var.getMeasuredHeight(), Math.max(0, childAt3.getTop())) / zk0Var.getMeasuredHeight()) * 100.0f);
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.addUpdateListener(new eh.b(this, iR, 6));
                        valueAnimatorOfFloat.addListener(new nh.n2(this, iR, 8));
                        valueAnimatorOfFloat.setStartDelay(iMin4);
                        valueAnimatorOfFloat.setDuration(200L);
                        animatorSet3.playTogether(valueAnimatorOfFloat);
                    }
                }
                gk0Var.f28742g.add(animatorSet3);
                animatorSet3.start();
                animatorSet3.addListener(new org.telegram.ui.Components.fk0(0, this, animatorSet3));
                return false;
            default:
                i10 i10Var = (i10) obj;
                i10Var.getViewTreeObserver().removeOnPreDrawListener(this);
                hh.f1 f1Var = i10Var.f38936b;
                int childCount4 = f1Var.getChildCount();
                AnimatorSet animatorSet4 = new AnimatorSet();
                int i17 = 0;
                while (i17 < childCount4) {
                    View childAt4 = f1Var.getChildAt(i17);
                    if (view != null) {
                        f1Var.getClass();
                        f10 = 100.0f;
                        if (RecyclerView.R(childAt4) < i11) {
                        }
                        i17++;
                        f11 = 0.0f;
                        i12 = 2;
                        i13 = 0;
                    } else {
                        f10 = 100.0f;
                    }
                    childAt4.setAlpha(f11);
                    int iMin5 = (int) ((Math.min(f1Var.getMeasuredHeight(), Math.max(i13, childAt4.getTop())) / f1Var.getMeasuredHeight()) * f10);
                    float[] fArr = new float[i12];
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(childAt4, (Property<View, Float>) View.ALPHA, fArr);
                    objectAnimatorOfFloat6.setStartDelay(iMin5);
                    objectAnimatorOfFloat6.setDuration(200L);
                    animatorSet4.playTogether(objectAnimatorOfFloat6);
                    i17++;
                    f11 = 0.0f;
                    i12 = 2;
                    i13 = 0;
                }
                animatorSet4.addListener(new y00(this));
                i10Var.f38946h0.lock();
                animatorSet4.start();
                if (view != null && view.getParent() == null) {
                    f1Var.addView(view);
                    f2.x0 layoutManager3 = f1Var.getLayoutManager();
                    if (layoutManager3 != null) {
                        layoutManager3.M(view);
                        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                        objectAnimatorOfFloat7.addListener(new y00(this, layoutManager3));
                        objectAnimatorOfFloat7.start();
                        return true;
                    }
                }
                return true;
        }
    }
}

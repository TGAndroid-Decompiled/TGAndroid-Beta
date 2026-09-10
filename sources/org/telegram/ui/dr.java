package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class dr implements ViewTreeObserver.OnPreDrawListener {
    public final int f31960a;
    public final View f31961b;
    public final int f31962c;
    public final Object d;

    public dr(Object obj, org.telegram.ui.Components.a10 a10Var, int i10, int i11) {
        this.f31960a = i11;
        this.d = obj;
        this.f31961b = a10Var;
        this.f31962c = i10;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z10;
        float f7;
        int i10 = this.f31960a;
        int i11 = this.f31962c;
        Object obj = this.d;
        View view = this.f31961b;
        float f10 = 0.0f;
        int i12 = 2;
        int i13 = 0;
        boolean z11 = true;
        switch (i10) {
            case 0:
                wr wrVar = (wr) obj;
                wrVar.f38323c.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = wrVar.f38323c.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = wrVar.f38323c.getChildAt(i14);
                    if (childAt != view) {
                        wrVar.f38323c.getClass();
                        if (RecyclerView.R(childAt) >= i11) {
                            childAt.setAlpha(0.0f);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                            ofFloat.setStartDelay((int) ((Math.min(wrVar.f38323c.getMeasuredHeight(), Math.max(0, childAt.getTop())) / wrVar.f38323c.getMeasuredHeight()) * 100.0f));
                            ofFloat.setDuration(200L);
                            animatorSet.playTogether(ofFloat);
                        }
                    }
                }
                if (view != null && view.getParent() == null) {
                    wrVar.f38323c.addView(view);
                    s4.o0 layoutManager = wrVar.f38323c.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        z10 = true;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new org.telegram.ui.Cells.v5(this, layoutManager));
                        ofFloat2.start();
                        animatorSet.start();
                        return z10;
                    }
                }
                z10 = true;
                animatorSet.start();
                return z10;
            case 1:
                org.telegram.ui.Components.sk skVar = (org.telegram.ui.Components.sk) obj;
                org.telegram.ui.Components.tk tkVar = skVar.X;
                tkVar.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount2 = tkVar.f27428r.getChildCount();
                AnimatorSet animatorSet2 = new AnimatorSet();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt2 = tkVar.f27428r.getChildAt(i15);
                    if (view != null) {
                        tkVar.f27428r.getClass();
                        if (RecyclerView.R(childAt2) < i11) {
                        }
                    }
                    childAt2.setAlpha(0.0f);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat3.setStartDelay((int) ((Math.min(tkVar.f27428r.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / tkVar.f27428r.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(200L);
                    animatorSet2.playTogether(ofFloat3);
                }
                animatorSet2.addListener(new org.telegram.ui.Components.qk(this));
                skVar.U.lock();
                animatorSet2.start();
                if (view != null && view.getParent() == null) {
                    tkVar.f27428r.addView(view);
                    s4.o0 layoutManager2 = tkVar.f27428r.getLayoutManager();
                    if (layoutManager2 != null) {
                        layoutManager2.M(view);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat4.addListener(new org.telegram.ui.Components.qk(this, layoutManager2));
                        ofFloat4.start();
                        return true;
                    }
                }
                return true;
            case 2:
                org.telegram.ui.Components.zk0 zk0Var = (org.telegram.ui.Components.zk0) obj;
                SparseArray sparseArray = zk0Var.f29713b;
                org.telegram.ui.Components.vl0 vl0Var = zk0Var.f29712a;
                vl0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                zk0Var.h.remove(this);
                int childCount3 = vl0Var.getChildCount();
                AnimatorSet animatorSet3 = new AnimatorSet();
                int i16 = 0;
                while (i16 < childCount3) {
                    View childAt3 = vl0Var.getChildAt(i16);
                    vl0Var.getClass();
                    int R = RecyclerView.R(childAt3);
                    if (childAt3 != view && R >= i11 - 1 && sparseArray.get(R, null) == null) {
                        sparseArray.put(R, Float.valueOf(0.0f));
                        zk0Var.d = z11;
                        vl0Var.invalidate();
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat5.addUpdateListener(new org.telegram.ui.ActionBar.s2(this, R, 5));
                        ofFloat5.addListener(new di.y2(this, R, 9));
                        ofFloat5.setStartDelay((int) ((Math.min(vl0Var.getMeasuredHeight(), Math.max(0, childAt3.getTop())) / vl0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat5.setDuration(200L);
                        animatorSet3.playTogether(ofFloat5);
                    }
                    i16++;
                    z11 = true;
                }
                zk0Var.f29716g.add(animatorSet3);
                animatorSet3.start();
                animatorSet3.addListener(new bi.u3(28, this, animatorSet3));
                return false;
            default:
                z10 z10Var = (z10) obj;
                z10Var.getViewTreeObserver().removeOnPreDrawListener(this);
                bi.y1 y1Var = z10Var.f39162b;
                int childCount4 = y1Var.getChildCount();
                AnimatorSet animatorSet4 = new AnimatorSet();
                int i17 = 0;
                while (i17 < childCount4) {
                    View childAt4 = y1Var.getChildAt(i17);
                    if (view != null) {
                        y1Var.getClass();
                        f7 = 100.0f;
                        if (RecyclerView.R(childAt4) < i11) {
                            i17++;
                            f10 = 0.0f;
                            i12 = 2;
                            i13 = 0;
                        }
                    } else {
                        f7 = 100.0f;
                    }
                    childAt4.setAlpha(f10);
                    float[] fArr = new float[i12];
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(childAt4, View.ALPHA, fArr);
                    ofFloat6.setStartDelay((int) ((Math.min(y1Var.getMeasuredHeight(), Math.max(i13, childAt4.getTop())) / y1Var.getMeasuredHeight()) * f7));
                    ofFloat6.setDuration(200L);
                    animatorSet4.playTogether(ofFloat6);
                    i17++;
                    f10 = 0.0f;
                    i12 = 2;
                    i13 = 0;
                }
                animatorSet4.addListener(new p10(this));
                z10Var.f39175l0.lock();
                animatorSet4.start();
                if (view != null && view.getParent() == null) {
                    y1Var.addView(view);
                    s4.o0 layoutManager3 = y1Var.getLayoutManager();
                    if (layoutManager3 != null) {
                        layoutManager3.M(view);
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat7.addListener(new p10(this, layoutManager3));
                        ofFloat7.start();
                    }
                }
                return true;
        }
    }
}

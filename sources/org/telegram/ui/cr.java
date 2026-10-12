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
public final class cr implements ViewTreeObserver.OnPreDrawListener {
    public final int f36498a;
    public final View f36499b;
    public final int f36500c;
    public final Object d;

    public cr(Object obj, org.telegram.ui.Components.m10 m10Var, int i10, int i11) {
        this.f36498a = i11;
        this.d = obj;
        this.f36499b = m10Var;
        this.f36500c = i10;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z10;
        float f7;
        float f10;
        int i10;
        int i11 = this.f36498a;
        int i12 = this.f36500c;
        Object obj = this.d;
        View view = this.f36499b;
        float f11 = 0.0f;
        int i13 = 2;
        int i14 = 0;
        switch (i11) {
            case 0:
                wr wrVar = (wr) obj;
                wrVar.f43619c.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = wrVar.f43619c.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = wrVar.f43619c.getChildAt(i15);
                    if (childAt != view) {
                        wrVar.f43619c.getClass();
                        if (RecyclerView.R(childAt) >= i12) {
                            childAt.setAlpha(0.0f);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                            ofFloat.setStartDelay((int) ((Math.min(wrVar.f43619c.getMeasuredHeight(), Math.max(0, childAt.getTop())) / wrVar.f43619c.getMeasuredHeight()) * 100.0f));
                            ofFloat.setDuration(200L);
                            animatorSet.playTogether(ofFloat);
                        }
                    }
                }
                if (view != null && view.getParent() == null) {
                    wrVar.f43619c.addView(view);
                    s4.p0 layoutManager = wrVar.f43619c.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        z10 = true;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new w4(this, layoutManager));
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
                org.telegram.ui.Components.tk tkVar = (org.telegram.ui.Components.tk) obj;
                org.telegram.ui.Components.uk ukVar = tkVar.X;
                ukVar.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount2 = ukVar.f31186r.getChildCount();
                AnimatorSet animatorSet2 = new AnimatorSet();
                int i16 = 0;
                while (i16 < childCount2) {
                    View childAt2 = ukVar.f31186r.getChildAt(i16);
                    if (view != null) {
                        ukVar.f31186r.getClass();
                        if (RecyclerView.R(childAt2) < i12) {
                            i16++;
                            f12 = 0.0f;
                        }
                    }
                    childAt2.setAlpha(f12);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat3.setStartDelay((int) ((Math.min(ukVar.f31186r.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / ukVar.f31186r.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(200L);
                    animatorSet2.playTogether(ofFloat3);
                    i16++;
                    f12 = 0.0f;
                }
                animatorSet2.addListener(new org.telegram.ui.Components.rk(this));
                tkVar.U.lock();
                animatorSet2.start();
                if (view != null && view.getParent() == null) {
                    ukVar.f31186r.addView(view);
                    s4.p0 layoutManager2 = ukVar.f31186r.getLayoutManager();
                    if (layoutManager2 != null) {
                        layoutManager2.M(view);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat4.addListener(new org.telegram.ui.Components.rk(this, layoutManager2));
                        ofFloat4.start();
                        return true;
                    }
                }
                return true;
            case 2:
                int i17 = 0;
                org.telegram.ui.Components.bm0 bm0Var = (org.telegram.ui.Components.bm0) obj;
                SparseArray sparseArray = bm0Var.f24680b;
                org.telegram.ui.Components.wm0 wm0Var = bm0Var.f24679a;
                wm0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                bm0Var.h.remove(this);
                int childCount3 = wm0Var.getChildCount();
                AnimatorSet animatorSet3 = new AnimatorSet();
                int i18 = 0;
                while (i18 < childCount3) {
                    View childAt3 = wm0Var.getChildAt(i18);
                    wm0Var.getClass();
                    int R = RecyclerView.R(childAt3);
                    if (childAt3 != view && R >= i12 - 1 && sparseArray.get(R, null) == null) {
                        sparseArray.put(R, Float.valueOf(0.0f));
                        bm0Var.d = true;
                        wm0Var.invalidate();
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat5.addUpdateListener(new org.telegram.ui.ActionBar.p2(this, R, 6));
                        ofFloat5.addListener(new ei.v2(this, R, 10));
                        ofFloat5.setStartDelay((int) ((Math.min(wm0Var.getMeasuredHeight(), Math.max(i17, childAt3.getTop())) / wm0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat5.setDuration(200L);
                        animatorSet3.playTogether(ofFloat5);
                    }
                    i18++;
                    i17 = 0;
                }
                bm0Var.f24684g.add(animatorSet3);
                animatorSet3.start();
                animatorSet3.addListener(new org.telegram.ui.Components.am0(0, this, animatorSet3));
                return false;
            default:
                y10 y10Var = (y10) obj;
                y10Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ai.w0 w0Var = y10Var.f44248b;
                int childCount4 = w0Var.getChildCount();
                AnimatorSet animatorSet4 = new AnimatorSet();
                int i19 = 0;
                while (i19 < childCount4) {
                    View childAt4 = w0Var.getChildAt(i19);
                    if (view != null) {
                        w0Var.getClass();
                        f7 = 100.0f;
                        if (RecyclerView.R(childAt4) < i12) {
                            f10 = f11;
                            i10 = i14;
                            i19++;
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
                    ofFloat6.setStartDelay((int) ((Math.min(w0Var.getMeasuredHeight(), Math.max(i14, childAt4.getTop())) / w0Var.getMeasuredHeight()) * f7));
                    ofFloat6.setDuration(200L);
                    Animator[] animatorArr = new Animator[1];
                    animatorArr[i10] = ofFloat6;
                    animatorSet4.playTogether(animatorArr);
                    i19++;
                    f11 = f10;
                    i14 = i10;
                    i13 = 2;
                }
                float f13 = f11;
                int i20 = i14;
                animatorSet4.addListener(new o10(this));
                y10Var.f44262l0.lock();
                animatorSet4.start();
                if (view != null && view.getParent() == null) {
                    w0Var.addView(view);
                    s4.p0 layoutManager3 = w0Var.getLayoutManager();
                    if (layoutManager3 != null) {
                        layoutManager3.M(view);
                        Property property = View.ALPHA;
                        float[] fArr2 = new float[2];
                        fArr2[i20] = view.getAlpha();
                        fArr2[1] = f13;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, property, fArr2);
                        ofFloat7.addListener(new o10(this, layoutManager3));
                        ofFloat7.start();
                        return true;
                    }
                }
                return true;
        }
    }
}

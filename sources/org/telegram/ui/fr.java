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
public final class fr implements ViewTreeObserver.OnPreDrawListener {
    public final int f36215a;
    public final View f36216b;
    public final int f36217c;
    public final Object d;

    public fr(Object obj, org.telegram.ui.Components.f10 f10Var, int i10, int i11) {
        this.f36215a = i11;
        this.d = obj;
        this.f36216b = f10Var;
        this.f36217c = i10;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z10;
        float f7;
        float f10;
        int i10;
        int i11 = this.f36215a;
        int i12 = this.f36217c;
        Object obj = this.d;
        View view = this.f36216b;
        float f11 = 0.0f;
        int i13 = 2;
        int i14 = 0;
        switch (i11) {
            case 0:
                yr yrVar = (yr) obj;
                yrVar.f42218c.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = yrVar.f42218c.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = yrVar.f42218c.getChildAt(i15);
                    if (childAt != view) {
                        yrVar.f42218c.getClass();
                        if (RecyclerView.R(childAt) >= i12) {
                            childAt.setAlpha(0.0f);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                            ofFloat.setStartDelay((int) ((Math.min(yrVar.f42218c.getMeasuredHeight(), Math.max(0, childAt.getTop())) / yrVar.f42218c.getMeasuredHeight()) * 100.0f));
                            ofFloat.setDuration(200L);
                            animatorSet.playTogether(ofFloat);
                        }
                    }
                }
                if (view != null && view.getParent() == null) {
                    yrVar.f42218c.addView(view);
                    s4.n0 layoutManager = yrVar.f42218c.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        z10 = true;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new u0(this, layoutManager));
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
                org.telegram.ui.Components.ok okVar = (org.telegram.ui.Components.ok) obj;
                org.telegram.ui.Components.pk pkVar = okVar.X;
                pkVar.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount2 = pkVar.f28354r.getChildCount();
                AnimatorSet animatorSet2 = new AnimatorSet();
                int i16 = 0;
                while (i16 < childCount2) {
                    View childAt2 = pkVar.f28354r.getChildAt(i16);
                    if (view != null) {
                        pkVar.f28354r.getClass();
                        if (RecyclerView.R(childAt2) < i12) {
                            i16++;
                            f12 = 0.0f;
                        }
                    }
                    childAt2.setAlpha(f12);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat3.setStartDelay((int) ((Math.min(pkVar.f28354r.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / pkVar.f28354r.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(200L);
                    animatorSet2.playTogether(ofFloat3);
                    i16++;
                    f12 = 0.0f;
                }
                animatorSet2.addListener(new org.telegram.ui.Components.mk(this));
                okVar.U.lock();
                animatorSet2.start();
                if (view != null && view.getParent() == null) {
                    pkVar.f28354r.addView(view);
                    s4.n0 layoutManager2 = pkVar.f28354r.getLayoutManager();
                    if (layoutManager2 != null) {
                        layoutManager2.M(view);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat4.addListener(new org.telegram.ui.Components.mk(this, layoutManager2));
                        ofFloat4.start();
                        return true;
                    }
                }
                return true;
            case 2:
                int i17 = 0;
                org.telegram.ui.Components.rl0 rl0Var = (org.telegram.ui.Components.rl0) obj;
                SparseArray sparseArray = rl0Var.f28866b;
                org.telegram.ui.Components.mm0 mm0Var = rl0Var.f28865a;
                mm0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                rl0Var.h.remove(this);
                int childCount3 = mm0Var.getChildCount();
                AnimatorSet animatorSet3 = new AnimatorSet();
                int i18 = 0;
                while (i18 < childCount3) {
                    View childAt3 = mm0Var.getChildAt(i18);
                    mm0Var.getClass();
                    int R = RecyclerView.R(childAt3);
                    if (childAt3 != view && R >= i12 - 1 && sparseArray.get(R, null) == null) {
                        sparseArray.put(R, Float.valueOf(0.0f));
                        rl0Var.d = true;
                        mm0Var.invalidate();
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat5.addUpdateListener(new org.telegram.ui.ActionBar.p2(this, R, 6));
                        ofFloat5.addListener(new fi.v2(this, R, 10));
                        ofFloat5.setStartDelay((int) ((Math.min(mm0Var.getMeasuredHeight(), Math.max(i17, childAt3.getTop())) / mm0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat5.setDuration(200L);
                        animatorSet3.playTogether(ofFloat5);
                    }
                    i18++;
                    i17 = 0;
                }
                rl0Var.f28869g.add(animatorSet3);
                animatorSet3.start();
                animatorSet3.addListener(new org.telegram.ui.Components.ql0(0, this, animatorSet3));
                return false;
            default:
                c20 c20Var = (c20) obj;
                c20Var.getViewTreeObserver().removeOnPreDrawListener(this);
                bi.o0 o0Var = c20Var.f34681b;
                int childCount4 = o0Var.getChildCount();
                AnimatorSet animatorSet4 = new AnimatorSet();
                int i19 = 0;
                while (i19 < childCount4) {
                    View childAt4 = o0Var.getChildAt(i19);
                    if (view != null) {
                        o0Var.getClass();
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
                    ofFloat6.setStartDelay((int) ((Math.min(o0Var.getMeasuredHeight(), Math.max(i14, childAt4.getTop())) / o0Var.getMeasuredHeight()) * f7));
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
                animatorSet4.addListener(new s10(this));
                c20Var.f34694l0.lock();
                animatorSet4.start();
                if (view != null && view.getParent() == null) {
                    o0Var.addView(view);
                    s4.n0 layoutManager3 = o0Var.getLayoutManager();
                    if (layoutManager3 != null) {
                        layoutManager3.M(view);
                        Property property = View.ALPHA;
                        float[] fArr2 = new float[2];
                        fArr2[i20] = view.getAlpha();
                        fArr2[1] = f13;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, property, fArr2);
                        ofFloat7.addListener(new s10(this, layoutManager3));
                        ofFloat7.start();
                        return true;
                    }
                }
                return true;
        }
    }
}

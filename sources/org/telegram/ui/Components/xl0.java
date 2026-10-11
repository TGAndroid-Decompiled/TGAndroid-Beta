package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
public final class xl0 {
    public final sm0 f32979a;
    public boolean d;
    public final boolean f32982e;
    public final SparseArray f32980b = new SparseArray();
    public final HashSet f32981c = new HashSet();
    public final boolean f32983f = true;
    public final ArrayList f32984g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public xl0(sm0 sm0Var, boolean z10) {
        this.f32979a = sm0Var;
        this.f32982e = z10;
        sm0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f32984g;
        int i10 = 0;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                ((AnimatorSet) arrayList2.get(i11)).end();
                ((AnimatorSet) arrayList2.get(i11)).cancel();
            }
        }
        arrayList.clear();
        while (true) {
            ArrayList arrayList3 = this.h;
            int size = arrayList3.size();
            sm0 sm0Var = this.f32979a;
            if (i10 < size) {
                sm0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
                i10++;
            } else {
                arrayList3.clear();
                this.f32980b.clear();
                sm0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i10) {
        Animator ofFloat;
        sm0 sm0Var = this.f32979a;
        int childCount = sm0Var.getChildCount();
        k10 k10Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = sm0Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof k10)) {
                k10Var = childAt;
            }
        }
        s4.p0 layoutManager = sm0Var.getLayoutManager();
        if (k10Var != null && layoutManager != null) {
            sm0Var.removeView(k10Var);
            this.f32981c.add(k10Var);
            sm0Var.addView(k10Var);
            layoutManager.M(k10Var);
            if (this.f32983f) {
                ofFloat = ObjectAnimator.ofFloat(k10Var, View.ALPHA, k10Var.getAlpha(), 0.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            ofFloat.addListener(new ai.z(this, k10Var, layoutManager));
            ofFloat.start();
            i10--;
        }
        org.telegram.ui.zq zqVar = new org.telegram.ui.zq(this, k10Var, i10, 2);
        this.h.add(zqVar);
        sm0Var.getViewTreeObserver().addOnPreDrawListener(zqVar);
    }
}

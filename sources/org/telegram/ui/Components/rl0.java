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
public final class rl0 {
    public final nm0 f32274a;
    public boolean d;
    public final boolean e;
    public final SparseArray f32275b = new SparseArray();
    public final HashSet f32276c = new HashSet();
    public final boolean f32277f = true;
    public final ArrayList f32278g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public rl0(nm0 nm0Var, boolean z10) {
        this.f32274a = nm0Var;
        this.e = z10;
        nm0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f32278g;
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
            nm0 nm0Var = this.f32274a;
            if (i10 < size) {
                nm0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
                i10++;
            } else {
                arrayList3.clear();
                this.f32275b.clear();
                nm0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i10) {
        Animator ofFloat;
        nm0 nm0Var = this.f32274a;
        int childCount = nm0Var.getChildCount();
        c10 c10Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = nm0Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof c10)) {
                c10Var = childAt;
            }
        }
        s4.p0 layoutManager = nm0Var.getLayoutManager();
        if (c10Var != null && layoutManager != null) {
            nm0Var.removeView(c10Var);
            this.f32276c.add(c10Var);
            nm0Var.addView(c10Var);
            layoutManager.M(c10Var);
            if (this.f32277f) {
                ofFloat = ObjectAnimator.ofFloat(c10Var, View.ALPHA, c10Var.getAlpha(), 0.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            ofFloat.addListener(new ml0(this, c10Var, layoutManager));
            ofFloat.start();
            i10--;
        }
        org.telegram.ui.tq tqVar = new org.telegram.ui.tq(this, c10Var, i10, 2);
        this.h.add(tqVar);
        nm0Var.getViewTreeObserver().addOnPreDrawListener(tqVar);
    }
}

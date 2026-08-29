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
public final class pk0 {
    public final jl0 f31698a;
    public boolean d;
    public final boolean f31701e;
    public final SparseArray f31699b = new SparseArray();
    public final HashSet f31700c = new HashSet();
    public final boolean f31702f = true;
    public final ArrayList f31703g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public pk0(jl0 jl0Var, boolean z10) {
        this.f31698a = jl0Var;
        this.f31701e = z10;
        jl0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f31703g;
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
            jl0 jl0Var = this.f31698a;
            if (i10 < size) {
                jl0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
                i10++;
            } else {
                arrayList3.clear();
                this.f31699b.clear();
                jl0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i10) {
        Animator ofFloat;
        jl0 jl0Var = this.f31698a;
        int childCount = jl0Var.getChildCount();
        p00 p00Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = jl0Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof p00)) {
                p00Var = childAt;
            }
        }
        f2.w0 layoutManager = jl0Var.getLayoutManager();
        if (p00Var != null && layoutManager != null) {
            jl0Var.removeView(p00Var);
            this.f31700c.add(p00Var);
            jl0Var.addView(p00Var);
            layoutManager.M(p00Var);
            if (this.f31702f) {
                ofFloat = ObjectAnimator.ofFloat(p00Var, View.ALPHA, p00Var.getAlpha(), 0.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            ofFloat.addListener(new ok0(this, p00Var, layoutManager));
            ofFloat.start();
            i10--;
        }
        org.telegram.ui.pq pqVar = new org.telegram.ui.pq(this, p00Var, i10, 2);
        this.h.add(pqVar);
        jl0Var.getViewTreeObserver().addOnPreDrawListener(pqVar);
    }
}

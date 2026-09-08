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
public final class qk0 {
    public final ll0 f29780a;
    public boolean d;
    public final boolean f29783e;
    public final SparseArray f29781b = new SparseArray();
    public final HashSet f29782c = new HashSet();
    public final boolean f29784f = true;
    public final ArrayList f29785g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public qk0(ll0 ll0Var, boolean z10) {
        this.f29780a = ll0Var;
        this.f29783e = z10;
        ll0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f29785g;
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
            ll0 ll0Var = this.f29780a;
            if (i10 < size) {
                ll0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
                i10++;
            } else {
                arrayList3.clear();
                this.f29781b.clear();
                ll0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i10) {
        Animator ofFloat;
        ll0 ll0Var = this.f29780a;
        int childCount = ll0Var.getChildCount();
        t00 t00Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = ll0Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof t00)) {
                t00Var = childAt;
            }
        }
        s4.o0 layoutManager = ll0Var.getLayoutManager();
        if (t00Var != null && layoutManager != null) {
            ll0Var.removeView(t00Var);
            this.f29782c.add(t00Var);
            ll0Var.addView(t00Var);
            layoutManager.M(t00Var);
            if (this.f29784f) {
                ofFloat = ObjectAnimator.ofFloat(t00Var, View.ALPHA, t00Var.getAlpha(), 0.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            ofFloat.addListener(new bi.t(this, t00Var, layoutManager));
            ofFloat.start();
            i10--;
        }
        org.telegram.ui.cr crVar = new org.telegram.ui.cr(this, t00Var, i10, 2);
        this.h.add(crVar);
        ll0Var.getViewTreeObserver().addOnPreDrawListener(crVar);
    }
}

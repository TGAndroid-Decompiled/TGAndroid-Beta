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
public final class rk0 {
    public final ml0 f27636a;
    public boolean d;
    public final boolean e;
    public final SparseArray f27637b = new SparseArray();
    public final HashSet f27638c = new HashSet();
    public final boolean f27639f = true;
    public final ArrayList f27640g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public rk0(ml0 ml0Var, boolean z10) {
        this.f27636a = ml0Var;
        this.e = z10;
        ml0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f27640g;
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
            ml0 ml0Var = this.f27636a;
            if (i10 < size) {
                ml0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
                i10++;
            } else {
                arrayList3.clear();
                this.f27637b.clear();
                ml0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i10) {
        Animator ofFloat;
        ml0 ml0Var = this.f27636a;
        int childCount = ml0Var.getChildCount();
        t00 t00Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = ml0Var.getChildAt(i11);
            if (RecyclerView.S(childAt) >= 0 && (childAt instanceof t00)) {
                t00Var = childAt;
            }
        }
        s4.o0 layoutManager = ml0Var.getLayoutManager();
        if (t00Var != null && layoutManager != null) {
            ml0Var.removeView(t00Var);
            this.f27638c.add(t00Var);
            ml0Var.addView(t00Var);
            layoutManager.M(t00Var);
            if (this.f27639f) {
                ofFloat = ObjectAnimator.ofFloat(t00Var, View.ALPHA, t00Var.getAlpha(), 0.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            ofFloat.addListener(new ai.z(this, t00Var, layoutManager));
            ofFloat.start();
            i10--;
        }
        org.telegram.ui.br brVar = new org.telegram.ui.br(this, t00Var, i10, 2);
        this.h.add(brVar);
        ml0Var.getViewTreeObserver().addOnPreDrawListener(brVar);
    }
}

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
    public final ml0 f27657a;
    public boolean d;
    public final boolean e;
    public final SparseArray f27658b = new SparseArray();
    public final HashSet f27659c = new HashSet();
    public final boolean f27660f = true;
    public final ArrayList f27661g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public rk0(ml0 ml0Var, boolean z10) {
        this.f27657a = ml0Var;
        this.e = z10;
        ml0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f27661g;
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
            ml0 ml0Var = this.f27657a;
            if (i10 < size) {
                ml0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
                i10++;
            } else {
                arrayList3.clear();
                this.f27658b.clear();
                ml0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i10) {
        Animator ofFloat;
        ml0 ml0Var = this.f27657a;
        int childCount = ml0Var.getChildCount();
        u00 u00Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = ml0Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof u00)) {
                u00Var = childAt;
            }
        }
        s4.o0 layoutManager = ml0Var.getLayoutManager();
        if (u00Var != null && layoutManager != null) {
            ml0Var.removeView(u00Var);
            this.f27659c.add(u00Var);
            ml0Var.addView(u00Var);
            layoutManager.M(u00Var);
            if (this.f27660f) {
                ofFloat = ObjectAnimator.ofFloat(u00Var, View.ALPHA, u00Var.getAlpha(), 0.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            ofFloat.addListener(new ai.z(this, u00Var, layoutManager));
            ofFloat.start();
            i10--;
        }
        org.telegram.ui.xq xqVar = new org.telegram.ui.xq(this, u00Var, i10, 2);
        this.h.add(xqVar);
        ml0Var.getViewTreeObserver().addOnPreDrawListener(xqVar);
    }
}

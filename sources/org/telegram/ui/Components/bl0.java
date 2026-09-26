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
public final class bl0 {
    public final wl0 f23039a;
    public boolean d;
    public final boolean e;
    public final SparseArray f23040b = new SparseArray();
    public final HashSet f23041c = new HashSet();
    public final boolean f23042f = true;
    public final ArrayList f23043g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public bl0(wl0 wl0Var, boolean z10) {
        this.f23039a = wl0Var;
        this.e = z10;
        wl0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f23043g;
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
            wl0 wl0Var = this.f23039a;
            if (i10 < size) {
                wl0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
                i10++;
            } else {
                arrayList3.clear();
                this.f23040b.clear();
                wl0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i10) {
        Animator ofFloat;
        wl0 wl0Var = this.f23039a;
        int childCount = wl0Var.getChildCount();
        u00 u00Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = wl0Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof u00)) {
                u00Var = childAt;
            }
        }
        s4.o0 layoutManager = wl0Var.getLayoutManager();
        if (u00Var != null && layoutManager != null) {
            wl0Var.removeView(u00Var);
            this.f23041c.add(u00Var);
            wl0Var.addView(u00Var);
            layoutManager.M(u00Var);
            if (this.f23042f) {
                ofFloat = ObjectAnimator.ofFloat(u00Var, View.ALPHA, u00Var.getAlpha(), 0.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            ofFloat.addListener(new ai.z(this, u00Var, layoutManager));
            ofFloat.start();
            i10--;
        }
        org.telegram.ui.wq wqVar = new org.telegram.ui.wq(this, u00Var, i10, 2);
        this.h.add(wqVar);
        wl0Var.getViewTreeObserver().addOnPreDrawListener(wqVar);
    }
}

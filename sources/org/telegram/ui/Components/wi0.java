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
public final class wi0 {
    public final tj0 f40013a;
    public boolean d;
    public final boolean f40016e;
    public final SparseArray f40014b = new SparseArray();
    public final HashSet f40015c = new HashSet();
    public final boolean f40017f = true;
    public final ArrayList f40018g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public wi0(tj0 tj0Var, boolean z10) {
        this.f40013a = tj0Var;
        this.f40016e = z10;
        tj0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f40018g;
        int i3 = 0;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                ((AnimatorSet) arrayList2.get(i10)).end();
                ((AnimatorSet) arrayList2.get(i10)).cancel();
            }
        }
        arrayList.clear();
        while (true) {
            ArrayList arrayList3 = this.h;
            int size = arrayList3.size();
            tj0 tj0Var = this.f40013a;
            if (i3 < size) {
                tj0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i3));
                i3++;
            } else {
                arrayList3.clear();
                this.f40014b.clear();
                tj0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i3) {
        Animator ofFloat;
        tj0 tj0Var = this.f40013a;
        int childCount = tj0Var.getChildCount();
        iz izVar = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = tj0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof iz)) {
                izVar = childAt;
            }
        }
        u4.o0 layoutManager = tj0Var.getLayoutManager();
        if (izVar != null && layoutManager != null) {
            tj0Var.removeView(izVar);
            this.f40015c.add(izVar);
            tj0Var.addView(izVar);
            layoutManager.M(izVar);
            if (this.f40017f) {
                ofFloat = ObjectAnimator.ofFloat(izVar, View.ALPHA, izVar.getAlpha(), 0.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            ofFloat.addListener(new ri0(this, izVar, layoutManager));
            ofFloat.start();
            i3--;
        }
        org.telegram.ui.tp tpVar = new org.telegram.ui.tp(this, izVar, i3, 2);
        this.h.add(tpVar);
        tj0Var.getViewTreeObserver().addOnPreDrawListener(tpVar);
    }
}

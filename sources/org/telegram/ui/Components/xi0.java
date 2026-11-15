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
public final class xi0 {
    public final uj0 f41697a;
    public boolean d;
    public final boolean f41700e;
    public final SparseArray f41698b = new SparseArray();
    public final HashSet f41699c = new HashSet();
    public final boolean f41701f = true;
    public final ArrayList f41702g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public xi0(uj0 uj0Var, boolean z10) {
        this.f41697a = uj0Var;
        this.f41700e = z10;
        uj0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f41702g;
        int i7 = 0;
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
            uj0 uj0Var = this.f41697a;
            if (i7 < size) {
                uj0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i7));
                i7++;
            } else {
                arrayList3.clear();
                this.f41698b.clear();
                uj0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i7) {
        Animator ofFloat;
        uj0 uj0Var = this.f41697a;
        int childCount = uj0Var.getChildCount();
        pz pzVar = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = uj0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof pz)) {
                pzVar = childAt;
            }
        }
        v4.o0 layoutManager = uj0Var.getLayoutManager();
        if (pzVar != null && layoutManager != null) {
            uj0Var.removeView(pzVar);
            this.f41699c.add(pzVar);
            uj0Var.addView(pzVar);
            layoutManager.M(pzVar);
            if (this.f41701f) {
                ofFloat = ObjectAnimator.ofFloat(pzVar, View.ALPHA, pzVar.getAlpha(), 0.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            ofFloat.addListener(new y50(this, pzVar, layoutManager));
            ofFloat.start();
            i7--;
        }
        org.telegram.ui.xp xpVar = new org.telegram.ui.xp(this, pzVar, i7, 2);
        this.h.add(xpVar);
        uj0Var.getViewTreeObserver().addOnPreDrawListener(xpVar);
    }
}

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
public final class hj0 {
    public final ek0 f35753a;
    public boolean d;
    public final boolean f35756e;
    public final SparseArray f35754b = new SparseArray();
    public final HashSet f35755c = new HashSet();
    public final boolean f35757f = true;
    public final ArrayList f35758g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public hj0(ek0 ek0Var, boolean z10) {
        this.f35753a = ek0Var;
        this.f35756e = z10;
        ek0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f35758g;
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
            ek0 ek0Var = this.f35753a;
            if (i7 < size) {
                ek0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i7));
                i7++;
            } else {
                arrayList3.clear();
                this.f35754b.clear();
                ek0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i7) {
        Animator ofFloat;
        ek0 ek0Var = this.f35753a;
        int childCount = ek0Var.getChildCount();
        vz vzVar = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ek0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof vz)) {
                vzVar = childAt;
            }
        }
        v4.p0 layoutManager = ek0Var.getLayoutManager();
        if (vzVar != null && layoutManager != null) {
            ek0Var.removeView(vzVar);
            this.f35755c.add(vzVar);
            ek0Var.addView(vzVar);
            layoutManager.M(vzVar);
            if (this.f35757f) {
                ofFloat = ObjectAnimator.ofFloat(vzVar, View.ALPHA, vzVar.getAlpha(), 0.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            ofFloat.addListener(new f10(this, vzVar, layoutManager));
            ofFloat.start();
            i7--;
        }
        org.telegram.ui.yp ypVar = new org.telegram.ui.yp(this, vzVar, i7, 2);
        this.h.add(ypVar);
        ek0Var.getViewTreeObserver().addOnPreDrawListener(ypVar);
    }
}

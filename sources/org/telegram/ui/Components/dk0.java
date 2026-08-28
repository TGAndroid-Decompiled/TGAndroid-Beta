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
public final class dk0 {
    public final wk0 f27745a;
    public boolean d;
    public final boolean f27748e;
    public final SparseArray f27746b = new SparseArray();
    public final HashSet f27747c = new HashSet();
    public final boolean f27749f = true;
    public final ArrayList f27750g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public dk0(wk0 wk0Var, boolean z10) {
        this.f27745a = wk0Var;
        this.f27748e = z10;
        wk0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f27750g;
        int i9 = 0;
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
            wk0 wk0Var = this.f27745a;
            if (i9 < size) {
                wk0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i9));
                i9++;
            } else {
                arrayList3.clear();
                this.f27746b.clear();
                wk0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i9) {
        Animator ofFloat;
        wk0 wk0Var = this.f27745a;
        int childCount = wk0Var.getChildCount();
        e00 e00Var = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = wk0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof e00)) {
                e00Var = childAt;
            }
        }
        f2.z0 layoutManager = wk0Var.getLayoutManager();
        if (e00Var != null && layoutManager != null) {
            wk0Var.removeView(e00Var);
            this.f27747c.add(e00Var);
            wk0Var.addView(e00Var);
            layoutManager.M(e00Var);
            if (this.f27749f) {
                ofFloat = ObjectAnimator.ofFloat(e00Var, View.ALPHA, e00Var.getAlpha(), 0.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            ofFloat.addListener(new fg.j(this, e00Var, layoutManager));
            ofFloat.start();
            i9--;
        }
        org.telegram.ui.nq nqVar = new org.telegram.ui.nq(this, e00Var, i9, 2);
        this.h.add(nqVar);
        wk0Var.getViewTreeObserver().addOnPreDrawListener(nqVar);
    }
}

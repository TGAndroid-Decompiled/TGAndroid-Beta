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
    public final mm0 f28865a;
    public boolean d;
    public final boolean e;
    public final SparseArray f28866b = new SparseArray();
    public final HashSet f28867c = new HashSet();
    public final boolean f28868f = true;
    public final ArrayList f28869g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public rl0(mm0 mm0Var, boolean z10) {
        this.f28865a = mm0Var;
        this.e = z10;
        mm0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f28869g;
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
            mm0 mm0Var = this.f28865a;
            if (i10 < size) {
                mm0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
                i10++;
            } else {
                arrayList3.clear();
                this.f28866b.clear();
                mm0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i10) {
        Animator ofFloat;
        mm0 mm0Var = this.f28865a;
        int childCount = mm0Var.getChildCount();
        f10 f10Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = mm0Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof f10)) {
                f10Var = childAt;
            }
        }
        s4.n0 layoutManager = mm0Var.getLayoutManager();
        if (f10Var != null && layoutManager != null) {
            mm0Var.removeView(f10Var);
            this.f28867c.add(f10Var);
            mm0Var.addView(f10Var);
            layoutManager.M(f10Var);
            if (this.f28868f) {
                ofFloat = ObjectAnimator.ofFloat(f10Var, View.ALPHA, f10Var.getAlpha(), 0.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            ofFloat.addListener(new bi.t(this, f10Var, layoutManager));
            ofFloat.start();
            i10--;
        }
        org.telegram.ui.fr frVar = new org.telegram.ui.fr(this, f10Var, i10, 2);
        this.h.add(frVar);
        mm0Var.getViewTreeObserver().addOnPreDrawListener(frVar);
    }
}

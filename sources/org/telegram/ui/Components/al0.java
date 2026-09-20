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
public final class al0 {
    public final vl0 f22710a;
    public boolean d;
    public final boolean e;
    public final SparseArray f22711b = new SparseArray();
    public final HashSet f22712c = new HashSet();
    public final boolean f22713f = true;
    public final ArrayList f22714g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public al0(vl0 vl0Var, boolean z10) {
        this.f22710a = vl0Var;
        this.e = z10;
        vl0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f22714g;
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
            vl0 vl0Var = this.f22710a;
            if (i10 < size) {
                vl0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
                i10++;
            } else {
                arrayList3.clear();
                this.f22711b.clear();
                vl0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i10) {
        Animator ofFloat;
        vl0 vl0Var = this.f22710a;
        int childCount = vl0Var.getChildCount();
        t00 t00Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = vl0Var.getChildAt(i11);
            if (RecyclerView.S(childAt) >= 0 && (childAt instanceof t00)) {
                t00Var = childAt;
            }
        }
        s4.o0 layoutManager = vl0Var.getLayoutManager();
        if (t00Var != null && layoutManager != null) {
            vl0Var.removeView(t00Var);
            this.f22712c.add(t00Var);
            vl0Var.addView(t00Var);
            layoutManager.M(t00Var);
            if (this.f22713f) {
                ofFloat = ObjectAnimator.ofFloat(t00Var, View.ALPHA, t00Var.getAlpha(), 0.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            ofFloat.addListener(new ai.z(this, t00Var, layoutManager));
            ofFloat.start();
            i10--;
        }
        org.telegram.ui.zq zqVar = new org.telegram.ui.zq(this, t00Var, i10, 2);
        this.h.add(zqVar);
        vl0Var.getViewTreeObserver().addOnPreDrawListener(zqVar);
    }
}

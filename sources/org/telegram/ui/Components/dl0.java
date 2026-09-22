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
public final class dl0 {
    public final yl0 f23709a;
    public boolean d;
    public final boolean e;
    public final SparseArray f23710b = new SparseArray();
    public final HashSet f23711c = new HashSet();
    public final boolean f23712f = true;
    public final ArrayList f23713g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public dl0(yl0 yl0Var, boolean z10) {
        this.f23709a = yl0Var;
        this.e = z10;
        yl0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f23713g;
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
            yl0 yl0Var = this.f23709a;
            if (i10 < size) {
                yl0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
                i10++;
            } else {
                arrayList3.clear();
                this.f23710b.clear();
                yl0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i10) {
        Animator ofFloat;
        yl0 yl0Var = this.f23709a;
        int childCount = yl0Var.getChildCount();
        t00 t00Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = yl0Var.getChildAt(i11);
            if (RecyclerView.S(childAt) >= 0 && (childAt instanceof t00)) {
                t00Var = childAt;
            }
        }
        s4.o0 layoutManager = yl0Var.getLayoutManager();
        if (t00Var != null && layoutManager != null) {
            yl0Var.removeView(t00Var);
            this.f23711c.add(t00Var);
            yl0Var.addView(t00Var);
            layoutManager.M(t00Var);
            if (this.f23712f) {
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
        yl0Var.getViewTreeObserver().addOnPreDrawListener(zqVar);
    }
}

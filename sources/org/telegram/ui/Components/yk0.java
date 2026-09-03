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
public final class yk0 {
    public final rl0 f31045a;
    public boolean d;
    public final boolean e;
    public final SparseArray f31046b = new SparseArray();
    public final HashSet f31047c = new HashSet();
    public final boolean f31048f = true;
    public final ArrayList f31049g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public yk0(rl0 rl0Var, boolean z4) {
        this.f31045a = rl0Var;
        this.e = z4;
        rl0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f31049g;
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
            rl0 rl0Var = this.f31045a;
            if (i10 < size) {
                rl0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
                i10++;
            } else {
                arrayList3.clear();
                this.f31046b.clear();
                rl0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i10) {
        Animator ofFloat;
        rl0 rl0Var = this.f31045a;
        int childCount = rl0Var.getChildCount();
        u00 u00Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = rl0Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof u00)) {
                u00Var = childAt;
            }
        }
        f2.v0 layoutManager = rl0Var.getLayoutManager();
        if (u00Var != null && layoutManager != null) {
            rl0Var.removeView(u00Var);
            this.f31047c.add(u00Var);
            rl0Var.addView(u00Var);
            layoutManager.M(u00Var);
            if (this.f31048f) {
                ofFloat = ObjectAnimator.ofFloat(u00Var, View.ALPHA, u00Var.getAlpha(), 0.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            ofFloat.addListener(new dg.y2(this, u00Var, layoutManager));
            ofFloat.start();
            i10--;
        }
        org.telegram.ui.xq xqVar = new org.telegram.ui.xq(this, u00Var, i10, 2);
        this.h.add(xqVar);
        rl0Var.getViewTreeObserver().addOnPreDrawListener(xqVar);
    }
}

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
    public final zl0 f25756a;
    public boolean d;
    public final boolean f25759e;
    public final SparseArray f25757b = new SparseArray();
    public final HashSet f25758c = new HashSet();
    public final boolean f25760f = true;
    public final ArrayList f25761g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public dl0(zl0 zl0Var, boolean z10) {
        this.f25756a = zl0Var;
        this.f25759e = z10;
        zl0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f25761g;
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
            zl0 zl0Var = this.f25756a;
            if (i10 < size) {
                zl0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
                i10++;
            } else {
                arrayList3.clear();
                this.f25757b.clear();
                zl0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i10) {
        Animator ofFloat;
        zl0 zl0Var = this.f25756a;
        int childCount = zl0Var.getChildCount();
        w00 w00Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = zl0Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof w00)) {
                w00Var = childAt;
            }
        }
        s4.o0 layoutManager = zl0Var.getLayoutManager();
        if (w00Var != null && layoutManager != null) {
            zl0Var.removeView(w00Var);
            this.f25758c.add(w00Var);
            zl0Var.addView(w00Var);
            layoutManager.M(w00Var);
            if (this.f25760f) {
                ofFloat = ObjectAnimator.ofFloat(w00Var, View.ALPHA, w00Var.getAlpha(), 0.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            ofFloat.addListener(new ai.z(this, w00Var, layoutManager));
            ofFloat.start();
            i10--;
        }
        org.telegram.ui.yq yqVar = new org.telegram.ui.yq(this, w00Var, i10, 2);
        this.h.add(yqVar);
        zl0Var.getViewTreeObserver().addOnPreDrawListener(yqVar);
    }
}

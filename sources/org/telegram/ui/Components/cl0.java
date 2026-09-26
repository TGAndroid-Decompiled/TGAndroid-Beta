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
public final class cl0 {
    public final xl0 f23349a;
    public boolean d;
    public final boolean e;
    public final SparseArray f23350b = new SparseArray();
    public final HashSet f23351c = new HashSet();
    public final boolean f23352f = true;
    public final ArrayList f23353g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public cl0(xl0 xl0Var, boolean z10) {
        this.f23349a = xl0Var;
        this.e = z10;
        xl0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f23353g;
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
            xl0 xl0Var = this.f23349a;
            if (i10 < size) {
                xl0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
                i10++;
            } else {
                arrayList3.clear();
                this.f23350b.clear();
                xl0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i10) {
        Animator ofFloat;
        xl0 xl0Var = this.f23349a;
        int childCount = xl0Var.getChildCount();
        v00 v00Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = xl0Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof v00)) {
                v00Var = childAt;
            }
        }
        s4.o0 layoutManager = xl0Var.getLayoutManager();
        if (v00Var != null && layoutManager != null) {
            xl0Var.removeView(v00Var);
            this.f23351c.add(v00Var);
            xl0Var.addView(v00Var);
            layoutManager.M(v00Var);
            if (this.f23352f) {
                ofFloat = ObjectAnimator.ofFloat(v00Var, View.ALPHA, v00Var.getAlpha(), 0.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            ofFloat.addListener(new ai.z(this, v00Var, layoutManager));
            ofFloat.start();
            i10--;
        }
        org.telegram.ui.wq wqVar = new org.telegram.ui.wq(this, v00Var, i10, 2);
        this.h.add(wqVar);
        xl0Var.getViewTreeObserver().addOnPreDrawListener(wqVar);
    }
}

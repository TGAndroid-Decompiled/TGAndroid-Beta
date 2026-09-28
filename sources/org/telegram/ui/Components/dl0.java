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
    public final yl0 f23685a;
    public boolean d;
    public final boolean e;
    public final SparseArray f23686b = new SparseArray();
    public final HashSet f23687c = new HashSet();
    public final boolean f23688f = true;
    public final ArrayList f23689g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public dl0(yl0 yl0Var, boolean z10) {
        this.f23685a = yl0Var;
        this.e = z10;
        yl0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f23689g;
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
            yl0 yl0Var = this.f23685a;
            if (i10 < size) {
                yl0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
                i10++;
            } else {
                arrayList3.clear();
                this.f23686b.clear();
                yl0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i10) {
        Animator ofFloat;
        yl0 yl0Var = this.f23685a;
        int childCount = yl0Var.getChildCount();
        v00 v00Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = yl0Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof v00)) {
                v00Var = childAt;
            }
        }
        s4.o0 layoutManager = yl0Var.getLayoutManager();
        if (v00Var != null && layoutManager != null) {
            yl0Var.removeView(v00Var);
            this.f23687c.add(v00Var);
            yl0Var.addView(v00Var);
            layoutManager.M(v00Var);
            if (this.f23688f) {
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
        yl0Var.getViewTreeObserver().addOnPreDrawListener(wqVar);
    }
}

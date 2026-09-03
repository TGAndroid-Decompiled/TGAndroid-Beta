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
public final class zk0 {
    public final sl0 f33962a;
    public boolean d;
    public final boolean f33965e;
    public final SparseArray f33963b = new SparseArray();
    public final HashSet f33964c = new HashSet();
    public final boolean f33966f = true;
    public final ArrayList f33967g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public zk0(sl0 sl0Var, boolean z4) {
        this.f33962a = sl0Var;
        this.f33965e = z4;
        sl0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f33967g;
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
            sl0 sl0Var = this.f33962a;
            if (i10 < size) {
                sl0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
                i10++;
            } else {
                arrayList3.clear();
                this.f33963b.clear();
                sl0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i10) {
        Animator ofFloat;
        sl0 sl0Var = this.f33962a;
        int childCount = sl0Var.getChildCount();
        u00 u00Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = sl0Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof u00)) {
                u00Var = childAt;
            }
        }
        f2.w0 layoutManager = sl0Var.getLayoutManager();
        if (u00Var != null && layoutManager != null) {
            sl0Var.removeView(u00Var);
            this.f33964c.add(u00Var);
            sl0Var.addView(u00Var);
            layoutManager.M(u00Var);
            if (this.f33966f) {
                ofFloat = ObjectAnimator.ofFloat(u00Var, View.ALPHA, u00Var.getAlpha(), 0.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            ofFloat.addListener(new eg.w2(this, u00Var, layoutManager));
            ofFloat.start();
            i10--;
        }
        org.telegram.ui.wq wqVar = new org.telegram.ui.wq(this, u00Var, i10, 2);
        this.h.add(wqVar);
        sl0Var.getViewTreeObserver().addOnPreDrawListener(wqVar);
    }
}

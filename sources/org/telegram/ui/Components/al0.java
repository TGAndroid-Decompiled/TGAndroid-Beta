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
    public final tl0 f25285a;
    public boolean d;
    public final boolean f25288e;
    public final SparseArray f25286b = new SparseArray();
    public final HashSet f25287c = new HashSet();
    public final boolean f25289f = true;
    public final ArrayList f25290g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public al0(tl0 tl0Var, boolean z4) {
        this.f25285a = tl0Var;
        this.f25288e = z4;
        tl0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f25290g;
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
            tl0 tl0Var = this.f25285a;
            if (i10 < size) {
                tl0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
                i10++;
            } else {
                arrayList3.clear();
                this.f25286b.clear();
                tl0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i10) {
        Animator ofFloat;
        tl0 tl0Var = this.f25285a;
        int childCount = tl0Var.getChildCount();
        u00 u00Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = tl0Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof u00)) {
                u00Var = childAt;
            }
        }
        f2.w0 layoutManager = tl0Var.getLayoutManager();
        if (u00Var != null && layoutManager != null) {
            tl0Var.removeView(u00Var);
            this.f25287c.add(u00Var);
            tl0Var.addView(u00Var);
            layoutManager.M(u00Var);
            if (this.f25289f) {
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
        tl0Var.getViewTreeObserver().addOnPreDrawListener(wqVar);
    }
}

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
public final class bm0 {
    public final wm0 f24679a;
    public boolean d;
    public final boolean f24682e;
    public final SparseArray f24680b = new SparseArray();
    public final HashSet f24681c = new HashSet();
    public final boolean f24683f = true;
    public final ArrayList f24684g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public bm0(wm0 wm0Var, boolean z10) {
        this.f24679a = wm0Var;
        this.f24682e = z10;
        wm0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f24684g;
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
            wm0 wm0Var = this.f24679a;
            if (i10 < size) {
                wm0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
                i10++;
            } else {
                arrayList3.clear();
                this.f24680b.clear();
                wm0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i10) {
        Animator ofFloat;
        wm0 wm0Var = this.f24679a;
        int childCount = wm0Var.getChildCount();
        m10 m10Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = wm0Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof m10)) {
                m10Var = childAt;
            }
        }
        s4.p0 layoutManager = wm0Var.getLayoutManager();
        if (m10Var != null && layoutManager != null) {
            wm0Var.removeView(m10Var);
            this.f24681c.add(m10Var);
            wm0Var.addView(m10Var);
            layoutManager.M(m10Var);
            if (this.f24683f) {
                ofFloat = ObjectAnimator.ofFloat(m10Var, View.ALPHA, m10Var.getAlpha(), 0.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            ofFloat.addListener(new ai.z(this, m10Var, layoutManager));
            ofFloat.start();
            i10--;
        }
        org.telegram.ui.cr crVar = new org.telegram.ui.cr(this, m10Var, i10, 2);
        this.h.add(crVar);
        wm0Var.getViewTreeObserver().addOnPreDrawListener(crVar);
    }
}

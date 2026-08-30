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
    public final sl0 f31374a;
    public boolean d;
    public final boolean e;
    public final SparseArray f31375b = new SparseArray();
    public final HashSet f31376c = new HashSet();
    public final boolean f31377f = true;
    public final ArrayList f31378g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public zk0(sl0 sl0Var, boolean z4) {
        this.f31374a = sl0Var;
        this.e = z4;
        sl0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f31378g;
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
            sl0 sl0Var = this.f31374a;
            if (i10 < size) {
                sl0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
                i10++;
            } else {
                arrayList3.clear();
                this.f31375b.clear();
                sl0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i10) {
        Animator ofFloat;
        sl0 sl0Var = this.f31374a;
        int childCount = sl0Var.getChildCount();
        t00 t00Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = sl0Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof t00)) {
                t00Var = childAt;
            }
        }
        f2.v0 layoutManager = sl0Var.getLayoutManager();
        if (t00Var != null && layoutManager != null) {
            sl0Var.removeView(t00Var);
            this.f31376c.add(t00Var);
            sl0Var.addView(t00Var);
            layoutManager.M(t00Var);
            if (this.f31377f) {
                ofFloat = ObjectAnimator.ofFloat(t00Var, View.ALPHA, t00Var.getAlpha(), 0.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            ofFloat.addListener(new dg.y2(this, t00Var, layoutManager));
            ofFloat.start();
            i10--;
        }
        org.telegram.ui.vq vqVar = new org.telegram.ui.vq(this, t00Var, i10, 2);
        this.h.add(vqVar);
        sl0Var.getViewTreeObserver().addOnPreDrawListener(vqVar);
    }
}

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
public final class vl0 {
    public final qm0 f31816a;
    public boolean d;
    public final boolean f31819e;
    public final SparseArray f31817b = new SparseArray();
    public final HashSet f31818c = new HashSet();
    public final boolean f31820f = true;
    public final ArrayList f31821g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public vl0(qm0 qm0Var, boolean z10) {
        this.f31816a = qm0Var;
        this.f31819e = z10;
        qm0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f31821g;
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
            qm0 qm0Var = this.f31816a;
            if (i10 < size) {
                qm0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
                i10++;
            } else {
                arrayList3.clear();
                this.f31817b.clear();
                qm0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i10) {
        Animator ofFloat;
        qm0 qm0Var = this.f31816a;
        int childCount = qm0Var.getChildCount();
        j10 j10Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = qm0Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof j10)) {
                j10Var = childAt;
            }
        }
        s4.p0 layoutManager = qm0Var.getLayoutManager();
        if (j10Var != null && layoutManager != null) {
            qm0Var.removeView(j10Var);
            this.f31818c.add(j10Var);
            qm0Var.addView(j10Var);
            layoutManager.M(j10Var);
            if (this.f31820f) {
                ofFloat = ObjectAnimator.ofFloat(j10Var, View.ALPHA, j10Var.getAlpha(), 0.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            ofFloat.addListener(new ai.z(this, j10Var, layoutManager));
            ofFloat.start();
            i10--;
        }
        org.telegram.ui.zq zqVar = new org.telegram.ui.zq(this, j10Var, i10, 2);
        this.h.add(zqVar);
        qm0Var.getViewTreeObserver().addOnPreDrawListener(zqVar);
    }
}

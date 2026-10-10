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
public final class wl0 {
    public final rm0 f32699a;
    public boolean d;
    public final boolean f32702e;
    public final SparseArray f32700b = new SparseArray();
    public final HashSet f32701c = new HashSet();
    public final boolean f32703f = true;
    public final ArrayList f32704g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public wl0(rm0 rm0Var, boolean z10) {
        this.f32699a = rm0Var;
        this.f32702e = z10;
        rm0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f32704g;
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
            rm0 rm0Var = this.f32699a;
            if (i10 < size) {
                rm0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
                i10++;
            } else {
                arrayList3.clear();
                this.f32700b.clear();
                rm0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i10) {
        Animator ofFloat;
        rm0 rm0Var = this.f32699a;
        int childCount = rm0Var.getChildCount();
        k10 k10Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = rm0Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof k10)) {
                k10Var = childAt;
            }
        }
        s4.p0 layoutManager = rm0Var.getLayoutManager();
        if (k10Var != null && layoutManager != null) {
            rm0Var.removeView(k10Var);
            this.f32701c.add(k10Var);
            rm0Var.addView(k10Var);
            layoutManager.M(k10Var);
            if (this.f32703f) {
                ofFloat = ObjectAnimator.ofFloat(k10Var, View.ALPHA, k10Var.getAlpha(), 0.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            ofFloat.addListener(new ai.z(this, k10Var, layoutManager));
            ofFloat.start();
            i10--;
        }
        org.telegram.ui.zq zqVar = new org.telegram.ui.zq(this, k10Var, i10, 2);
        this.h.add(zqVar);
        rm0Var.getViewTreeObserver().addOnPreDrawListener(zqVar);
    }
}

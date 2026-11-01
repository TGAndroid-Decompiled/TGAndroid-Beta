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
public final class xj0 {
    public final uk0 f32592a;
    public boolean d;
    public final boolean e;
    public final SparseArray f32593b = new SparseArray();
    public final HashSet f32594c = new HashSet();
    public final boolean f32595f = true;
    public final ArrayList f32596g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public xj0(uk0 uk0Var, boolean z10) {
        this.f32592a = uk0Var;
        this.e = z10;
        uk0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f32596g;
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
            uk0 uk0Var = this.f32592a;
            if (i10 < size) {
                uk0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
                i10++;
            } else {
                arrayList3.clear();
                this.f32593b.clear();
                uk0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i10) {
        Animator ofFloat;
        uk0 uk0Var = this.f32592a;
        int childCount = uk0Var.getChildCount();
        zz zzVar = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = uk0Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof zz)) {
                zzVar = childAt;
            }
        }
        s4.n0 layoutManager = uk0Var.getLayoutManager();
        if (zzVar != null && layoutManager != null) {
            uk0Var.removeView(zzVar);
            this.f32594c.add(zzVar);
            uk0Var.addView(zzVar);
            layoutManager.M(zzVar);
            if (this.f32595f) {
                ofFloat = ObjectAnimator.ofFloat(zzVar, View.ALPHA, zzVar.getAlpha(), 0.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            ofFloat.addListener(new bg.f(this, zzVar, layoutManager));
            ofFloat.start();
            i10--;
        }
        org.telegram.ui.uq uqVar = new org.telegram.ui.uq(this, zzVar, i10, 2);
        this.h.add(uqVar);
        uk0Var.getViewTreeObserver().addOnPreDrawListener(uqVar);
    }
}

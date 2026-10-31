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
public final class wj0 {
    public final tk0 f32209a;
    public boolean d;
    public final boolean e;
    public final SparseArray f32210b = new SparseArray();
    public final HashSet f32211c = new HashSet();
    public final boolean f32212f = true;
    public final ArrayList f32213g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public wj0(tk0 tk0Var, boolean z10) {
        this.f32209a = tk0Var;
        this.e = z10;
        tk0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f32213g;
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
            tk0 tk0Var = this.f32209a;
            if (i10 < size) {
                tk0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
                i10++;
            } else {
                arrayList3.clear();
                this.f32210b.clear();
                tk0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i10) {
        Animator ofFloat;
        tk0 tk0Var = this.f32209a;
        int childCount = tk0Var.getChildCount();
        zz zzVar = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = tk0Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof zz)) {
                zzVar = childAt;
            }
        }
        s4.n0 layoutManager = tk0Var.getLayoutManager();
        if (zzVar != null && layoutManager != null) {
            tk0Var.removeView(zzVar);
            this.f32211c.add(zzVar);
            tk0Var.addView(zzVar);
            layoutManager.M(zzVar);
            if (this.f32212f) {
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
        tk0Var.getViewTreeObserver().addOnPreDrawListener(uqVar);
    }
}

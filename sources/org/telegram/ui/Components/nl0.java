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
public final class nl0 {
    public final im0 f28807a;
    public boolean d;
    public final boolean e;
    public final SparseArray f28808b = new SparseArray();
    public final HashSet f28809c = new HashSet();
    public final boolean f28810f = true;
    public final ArrayList f28811g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public nl0(im0 im0Var, boolean z10) {
        this.f28807a = im0Var;
        this.e = z10;
        im0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f28811g;
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
            im0 im0Var = this.f28807a;
            if (i10 < size) {
                im0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
                i10++;
            } else {
                arrayList3.clear();
                this.f28808b.clear();
                im0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i10) {
        Animator ofFloat;
        im0 im0Var = this.f28807a;
        int childCount = im0Var.getChildCount();
        b10 b10Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = im0Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof b10)) {
                b10Var = childAt;
            }
        }
        s4.n0 layoutManager = im0Var.getLayoutManager();
        if (b10Var != null && layoutManager != null) {
            im0Var.removeView(b10Var);
            this.f28809c.add(b10Var);
            im0Var.addView(b10Var);
            layoutManager.M(b10Var);
            if (this.f28810f) {
                ofFloat = ObjectAnimator.ofFloat(b10Var, View.ALPHA, b10Var.getAlpha(), 0.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            ofFloat.addListener(new ml0(this, b10Var, layoutManager));
            ofFloat.start();
            i10--;
        }
        org.telegram.ui.oq oqVar = new org.telegram.ui.oq(this, b10Var, i10, 2);
        this.h.add(oqVar);
        im0Var.getViewTreeObserver().addOnPreDrawListener(oqVar);
    }
}

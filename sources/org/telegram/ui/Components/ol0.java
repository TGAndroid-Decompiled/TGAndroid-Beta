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
public final class ol0 {
    public final jm0 f29069a;
    public boolean d;
    public final boolean e;
    public final SparseArray f29070b = new SparseArray();
    public final HashSet f29071c = new HashSet();
    public final boolean f29072f = true;
    public final ArrayList f29073g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public ol0(jm0 jm0Var, boolean z10) {
        this.f29069a = jm0Var;
        this.e = z10;
        jm0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f29073g;
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
            jm0 jm0Var = this.f29069a;
            if (i10 < size) {
                jm0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
                i10++;
            } else {
                arrayList3.clear();
                this.f29070b.clear();
                jm0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i10) {
        Animator ofFloat;
        jm0 jm0Var = this.f29069a;
        int childCount = jm0Var.getChildCount();
        b10 b10Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = jm0Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof b10)) {
                b10Var = childAt;
            }
        }
        s4.n0 layoutManager = jm0Var.getLayoutManager();
        if (b10Var != null && layoutManager != null) {
            jm0Var.removeView(b10Var);
            this.f29071c.add(b10Var);
            jm0Var.addView(b10Var);
            layoutManager.M(b10Var);
            if (this.f29072f) {
                ofFloat = ObjectAnimator.ofFloat(b10Var, View.ALPHA, b10Var.getAlpha(), 0.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            ofFloat.addListener(new nl0(this, b10Var, layoutManager));
            ofFloat.start();
            i10--;
        }
        org.telegram.ui.oq oqVar = new org.telegram.ui.oq(this, b10Var, i10, 2);
        this.h.add(oqVar);
        jm0Var.getViewTreeObserver().addOnPreDrawListener(oqVar);
    }
}

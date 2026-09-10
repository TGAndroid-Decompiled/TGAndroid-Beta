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
    public final vl0 f29712a;
    public boolean d;
    public final boolean e;
    public final SparseArray f29713b = new SparseArray();
    public final HashSet f29714c = new HashSet();
    public final boolean f29715f = true;
    public final ArrayList f29716g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public zk0(vl0 vl0Var, boolean z10) {
        this.f29712a = vl0Var;
        this.e = z10;
        vl0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f29716g;
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
            vl0 vl0Var = this.f29712a;
            if (i10 < size) {
                vl0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
                i10++;
            } else {
                arrayList3.clear();
                this.f29713b.clear();
                vl0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i10) {
        Animator ofFloat;
        vl0 vl0Var = this.f29712a;
        int childCount = vl0Var.getChildCount();
        a10 a10Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = vl0Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof a10)) {
                a10Var = childAt;
            }
        }
        s4.o0 layoutManager = vl0Var.getLayoutManager();
        if (a10Var != null && layoutManager != null) {
            vl0Var.removeView(a10Var);
            this.f29714c.add(a10Var);
            vl0Var.addView(a10Var);
            layoutManager.M(a10Var);
            if (this.f29715f) {
                ofFloat = ObjectAnimator.ofFloat(a10Var, View.ALPHA, a10Var.getAlpha(), 0.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            ofFloat.addListener(new bi.u3(this, a10Var, layoutManager));
            ofFloat.start();
            i10--;
        }
        org.telegram.ui.dr drVar = new org.telegram.ui.dr(this, a10Var, i10, 2);
        this.h.add(drVar);
        vl0Var.getViewTreeObserver().addOnPreDrawListener(drVar);
    }
}

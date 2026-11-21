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
public final class hj0 {
    public final ek0 f35927a;
    public boolean d;
    public final boolean f35930e;
    public final SparseArray f35928b = new SparseArray();
    public final HashSet f35929c = new HashSet();
    public final boolean f35931f = true;
    public final ArrayList f35932g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public hj0(ek0 ek0Var, boolean z10) {
        this.f35927a = ek0Var;
        this.f35930e = z10;
        ek0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f35932g;
        int i7 = 0;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                ((AnimatorSet) arrayList2.get(i10)).end();
                ((AnimatorSet) arrayList2.get(i10)).cancel();
            }
        }
        arrayList.clear();
        while (true) {
            ArrayList arrayList3 = this.h;
            int size = arrayList3.size();
            ek0 ek0Var = this.f35927a;
            if (i7 < size) {
                ek0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i7));
                i7++;
            } else {
                arrayList3.clear();
                this.f35928b.clear();
                ek0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i7) {
        Animator ofFloat;
        ek0 ek0Var = this.f35927a;
        int childCount = ek0Var.getChildCount();
        yz yzVar = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ek0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof yz)) {
                yzVar = childAt;
            }
        }
        v4.p0 layoutManager = ek0Var.getLayoutManager();
        if (yzVar != null && layoutManager != null) {
            ek0Var.removeView(yzVar);
            this.f35929c.add(yzVar);
            ek0Var.addView(yzVar);
            layoutManager.M(yzVar);
            if (this.f35931f) {
                ofFloat = ObjectAnimator.ofFloat(yzVar, View.ALPHA, yzVar.getAlpha(), 0.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            ofFloat.addListener(new h10(this, yzVar, layoutManager));
            ofFloat.start();
            i7--;
        }
        org.telegram.ui.yp ypVar = new org.telegram.ui.yp(this, yzVar, i7, 2);
        this.h.add(ypVar);
        ek0Var.getViewTreeObserver().addOnPreDrawListener(ypVar);
    }
}

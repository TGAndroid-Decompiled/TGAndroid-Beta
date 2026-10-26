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
public final class ql0 {
    public final mm0 f31952a;
    public boolean d;
    public final boolean e;
    public final SparseArray f31953b = new SparseArray();
    public final HashSet f31954c = new HashSet();
    public final boolean f31955f = true;
    public final ArrayList f31956g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public ql0(mm0 mm0Var, boolean z10) {
        this.f31952a = mm0Var;
        this.e = z10;
        mm0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f31956g;
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
            mm0 mm0Var = this.f31952a;
            if (i10 < size) {
                mm0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
                i10++;
            } else {
                arrayList3.clear();
                this.f31953b.clear();
                mm0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i10) {
        Animator ofFloat;
        mm0 mm0Var = this.f31952a;
        int childCount = mm0Var.getChildCount();
        c10 c10Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = mm0Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof c10)) {
                c10Var = childAt;
            }
        }
        s4.p0 layoutManager = mm0Var.getLayoutManager();
        if (c10Var != null && layoutManager != null) {
            mm0Var.removeView(c10Var);
            this.f31954c.add(c10Var);
            mm0Var.addView(c10Var);
            layoutManager.M(c10Var);
            if (this.f31955f) {
                ofFloat = ObjectAnimator.ofFloat(c10Var, View.ALPHA, c10Var.getAlpha(), 0.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            ofFloat.addListener(new ll0(this, c10Var, layoutManager));
            ofFloat.start();
            i10--;
        }
        org.telegram.ui.rq rqVar = new org.telegram.ui.rq(this, c10Var, i10, 2);
        this.h.add(rqVar);
        mm0Var.getViewTreeObserver().addOnPreDrawListener(rqVar);
    }
}

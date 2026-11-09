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
public final class ti0 {
    public final qj0 f38430a;
    public boolean d;
    public final boolean f38433e;
    public final SparseArray f38431b = new SparseArray();
    public final HashSet f38432c = new HashSet();
    public final boolean f38434f = true;
    public final ArrayList f38435g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public ti0(qj0 qj0Var, boolean z9) {
        this.f38430a = qj0Var;
        this.f38433e = z9;
        qj0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f38435g;
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
            qj0 qj0Var = this.f38430a;
            if (i7 < size) {
                qj0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i7));
                i7++;
            } else {
                arrayList3.clear();
                this.f38431b.clear();
                qj0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i7) {
        Animator ofFloat;
        qj0 qj0Var = this.f38430a;
        int childCount = qj0Var.getChildCount();
        mz mzVar = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = qj0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof mz)) {
                mzVar = childAt;
            }
        }
        v4.n0 layoutManager = qj0Var.getLayoutManager();
        if (mzVar != null && layoutManager != null) {
            qj0Var.removeView(mzVar);
            this.f38432c.add(mzVar);
            qj0Var.addView(mzVar);
            layoutManager.M(mzVar);
            if (this.f38434f) {
                ofFloat = ObjectAnimator.ofFloat(mzVar, View.ALPHA, mzVar.getAlpha(), 0.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            ofFloat.addListener(new w50(this, mzVar, layoutManager));
            ofFloat.start();
            i7--;
        }
        org.telegram.ui.xp xpVar = new org.telegram.ui.xp(this, mzVar, i7, 2);
        this.h.add(xpVar);
        qj0Var.getViewTreeObserver().addOnPreDrawListener(xpVar);
    }
}

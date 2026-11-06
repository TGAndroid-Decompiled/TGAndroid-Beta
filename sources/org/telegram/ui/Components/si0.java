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
public final class si0 {
    public final pj0 f38107a;
    public boolean d;
    public final boolean f38110e;
    public final SparseArray f38108b = new SparseArray();
    public final HashSet f38109c = new HashSet();
    public final boolean f38111f = true;
    public final ArrayList f38112g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public si0(pj0 pj0Var, boolean z9) {
        this.f38107a = pj0Var;
        this.f38110e = z9;
        pj0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f38112g;
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
            pj0 pj0Var = this.f38107a;
            if (i7 < size) {
                pj0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i7));
                i7++;
            } else {
                arrayList3.clear();
                this.f38108b.clear();
                pj0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i7) {
        Animator ofFloat;
        pj0 pj0Var = this.f38107a;
        int childCount = pj0Var.getChildCount();
        lz lzVar = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = pj0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof lz)) {
                lzVar = childAt;
            }
        }
        v4.n0 layoutManager = pj0Var.getLayoutManager();
        if (lzVar != null && layoutManager != null) {
            pj0Var.removeView(lzVar);
            this.f38109c.add(lzVar);
            pj0Var.addView(lzVar);
            layoutManager.M(lzVar);
            if (this.f38111f) {
                ofFloat = ObjectAnimator.ofFloat(lzVar, View.ALPHA, lzVar.getAlpha(), 0.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            ofFloat.addListener(new v50(this, lzVar, layoutManager));
            ofFloat.start();
            i7--;
        }
        org.telegram.ui.vp vpVar = new org.telegram.ui.vp(this, lzVar, i7, 2);
        this.h.add(vpVar);
        pj0Var.getViewTreeObserver().addOnPreDrawListener(vpVar);
    }
}

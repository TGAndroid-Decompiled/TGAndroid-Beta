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
    public final lm0 f29948a;
    public boolean d;
    public final boolean e;
    public final SparseArray f29949b = new SparseArray();
    public final HashSet f29950c = new HashSet();
    public final boolean f29951f = true;
    public final ArrayList f29952g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public ql0(lm0 lm0Var, boolean z10) {
        this.f29948a = lm0Var;
        this.e = z10;
        lm0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f29952g;
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
            lm0 lm0Var = this.f29948a;
            if (i10 < size) {
                lm0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
                i10++;
            } else {
                arrayList3.clear();
                this.f29949b.clear();
                lm0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i10) {
        Animator ofFloat;
        lm0 lm0Var = this.f29948a;
        int childCount = lm0Var.getChildCount();
        z00 z00Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = lm0Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof z00)) {
                z00Var = childAt;
            }
        }
        s4.n0 layoutManager = lm0Var.getLayoutManager();
        if (z00Var != null && layoutManager != null) {
            lm0Var.removeView(z00Var);
            this.f29950c.add(z00Var);
            lm0Var.addView(z00Var);
            layoutManager.M(z00Var);
            if (this.f29951f) {
                ofFloat = ObjectAnimator.ofFloat(z00Var, View.ALPHA, z00Var.getAlpha(), 0.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            ofFloat.addListener(new pl0(this, z00Var, layoutManager));
            ofFloat.start();
            i10--;
        }
        org.telegram.ui.qq qqVar = new org.telegram.ui.qq(this, z00Var, i10, 2);
        this.h.add(qqVar);
        lm0Var.getViewTreeObserver().addOnPreDrawListener(qqVar);
    }
}

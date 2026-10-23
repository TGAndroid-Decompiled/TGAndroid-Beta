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
public final class rl0 {
    public final mm0 f30221a;
    public boolean d;
    public final boolean e;
    public final SparseArray f30222b = new SparseArray();
    public final HashSet f30223c = new HashSet();
    public final boolean f30224f = true;
    public final ArrayList f30225g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public rl0(mm0 mm0Var, boolean z10) {
        this.f30221a = mm0Var;
        this.e = z10;
        mm0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f30225g;
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
            mm0 mm0Var = this.f30221a;
            if (i10 < size) {
                mm0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
                i10++;
            } else {
                arrayList3.clear();
                this.f30222b.clear();
                mm0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i10) {
        Animator ofFloat;
        mm0 mm0Var = this.f30221a;
        int childCount = mm0Var.getChildCount();
        b10 b10Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = mm0Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof b10)) {
                b10Var = childAt;
            }
        }
        s4.n0 layoutManager = mm0Var.getLayoutManager();
        if (b10Var != null && layoutManager != null) {
            mm0Var.removeView(b10Var);
            this.f30223c.add(b10Var);
            mm0Var.addView(b10Var);
            layoutManager.M(b10Var);
            if (this.f30224f) {
                ofFloat = ObjectAnimator.ofFloat(b10Var, View.ALPHA, b10Var.getAlpha(), 0.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            ofFloat.addListener(new ql0(this, b10Var, layoutManager));
            ofFloat.start();
            i10--;
        }
        org.telegram.ui.qq qqVar = new org.telegram.ui.qq(this, b10Var, i10, 2);
        this.h.add(qqVar);
        mm0Var.getViewTreeObserver().addOnPreDrawListener(qqVar);
    }
}

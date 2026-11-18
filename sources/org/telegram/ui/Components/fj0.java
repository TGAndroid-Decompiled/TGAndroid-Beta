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
public final class fj0 {
    public final ck0 f35120a;
    public boolean d;
    public final boolean f35123e;
    public final SparseArray f35121b = new SparseArray();
    public final HashSet f35122c = new HashSet();
    public final boolean f35124f = true;
    public final ArrayList f35125g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public fj0(ck0 ck0Var, boolean z10) {
        this.f35120a = ck0Var;
        this.f35123e = z10;
        ck0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f35125g;
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
            ck0 ck0Var = this.f35120a;
            if (i7 < size) {
                ck0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i7));
                i7++;
            } else {
                arrayList3.clear();
                this.f35121b.clear();
                ck0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i7) {
        Animator ofFloat;
        ck0 ck0Var = this.f35120a;
        int childCount = ck0Var.getChildCount();
        wz wzVar = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ck0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 0 && (childAt instanceof wz)) {
                wzVar = childAt;
            }
        }
        v4.p0 layoutManager = ck0Var.getLayoutManager();
        if (wzVar != null && layoutManager != null) {
            ck0Var.removeView(wzVar);
            this.f35122c.add(wzVar);
            ck0Var.addView(wzVar);
            layoutManager.M(wzVar);
            if (this.f35124f) {
                ofFloat = ObjectAnimator.ofFloat(wzVar, View.ALPHA, wzVar.getAlpha(), 0.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            ofFloat.addListener(new h60(this, wzVar, layoutManager));
            ofFloat.start();
            i7--;
        }
        org.telegram.ui.yp ypVar = new org.telegram.ui.yp(this, wzVar, i7, 2);
        this.h.add(ypVar);
        ck0Var.getViewTreeObserver().addOnPreDrawListener(ypVar);
    }
}

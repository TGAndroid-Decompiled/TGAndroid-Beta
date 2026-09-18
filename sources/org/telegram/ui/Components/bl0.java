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
public final class bl0 {
    public final wl0 f23032a;
    public boolean d;
    public final boolean e;
    public final SparseArray f23033b = new SparseArray();
    public final HashSet f23034c = new HashSet();
    public final boolean f23035f = true;
    public final ArrayList f23036g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public bl0(wl0 wl0Var, boolean z10) {
        this.f23032a = wl0Var;
        this.e = z10;
        wl0Var.setItemsEnterAnimator(this);
    }

    public final void a() {
        ArrayList arrayList = this.f23036g;
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
            wl0 wl0Var = this.f23032a;
            if (i10 < size) {
                wl0Var.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i10));
                i10++;
            } else {
                arrayList3.clear();
                this.f23033b.clear();
                wl0Var.invalidate();
                this.d = true;
                return;
            }
        }
    }

    public final void b(int i10) {
        Animator ofFloat;
        wl0 wl0Var = this.f23032a;
        int childCount = wl0Var.getChildCount();
        t00 t00Var = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = wl0Var.getChildAt(i11);
            if (RecyclerView.S(childAt) >= 0 && (childAt instanceof t00)) {
                t00Var = childAt;
            }
        }
        s4.o0 layoutManager = wl0Var.getLayoutManager();
        if (t00Var != null && layoutManager != null) {
            wl0Var.removeView(t00Var);
            this.f23034c.add(t00Var);
            wl0Var.addView(t00Var);
            layoutManager.M(t00Var);
            if (this.f23035f) {
                ofFloat = ObjectAnimator.ofFloat(t00Var, View.ALPHA, t00Var.getAlpha(), 0.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            }
            ofFloat.addListener(new ai.z(this, t00Var, layoutManager));
            ofFloat.start();
            i10--;
        }
        org.telegram.ui.zq zqVar = new org.telegram.ui.zq(this, t00Var, i10, 2);
        this.h.add(zqVar);
        wl0Var.getViewTreeObserver().addOnPreDrawListener(zqVar);
    }
}

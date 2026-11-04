package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
public final class fh extends AnimatorListenerAdapter {
    public final boolean f45277a;
    public final boolean f45278b;
    public final org.telegram.ui.Components.k9 f45279c;
    public final vm d;
    public final org.telegram.ui.ActionBar.k5 f45280e;
    public final boolean f45281f;
    public final lm h;
    public final wm f45282n;

    public fh(wm wmVar, boolean z10, boolean z11, org.telegram.ui.Components.k9 k9Var, vm vmVar, org.telegram.ui.ActionBar.k5 k5Var, boolean z12, lm lmVar) {
        this.f45282n = wmVar;
        this.f45277a = z10;
        this.f45278b = z11;
        this.f45279c = k9Var;
        this.d = vmVar;
        this.f45280e = k5Var;
        this.f45281f = z12;
        this.h = lmVar;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        wm wmVar = this.f45282n;
        wmVar.W2[1] = null;
        wmVar.Q2[1].setTranslationY(0.0f);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        Object[] objArr = this.f45282n.W2;
        if (animator.equals(objArr[1])) {
            org.telegram.ui.Components.k9 k9Var = this.f45279c;
            boolean z10 = this.f45278b;
            boolean z11 = this.f45277a;
            if (!z11 && !z10 && k9Var == null) {
                objArr[1] = null;
                return;
            }
            objArr[1] = new AnimatorSet();
            objArr[1].setInterpolator(org.telegram.ui.Components.xq.h);
            objArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, View.TRANSLATION_Y, 0.0f));
            }
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.f45280e, View.TRANSLATION_Y, 0.0f));
            }
            if (this.f45281f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, View.TRANSLATION_Y, 0.0f));
            }
            if (k9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(k9Var, View.TRANSLATION_Y, 0.0f));
            }
            objArr[1].addListener(new org.telegram.ui.Cells.w9(this, 5));
            objArr[1].playTogether(arrayList);
            objArr[1].start();
        }
    }
}

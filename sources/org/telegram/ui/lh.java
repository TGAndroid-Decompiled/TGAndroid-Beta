package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
public final class lh extends AnimatorListenerAdapter {
    public final boolean f47609a;
    public final boolean f47610b;
    public final org.telegram.ui.Components.k9 f47611c;
    public final bn d;
    public final org.telegram.ui.ActionBar.m5 f47612e;
    public final boolean f47613f;
    public final rm h;
    public final cn f47614n;

    public lh(cn cnVar, boolean z9, boolean z10, org.telegram.ui.Components.k9 k9Var, bn bnVar, org.telegram.ui.ActionBar.m5 m5Var, boolean z11, rm rmVar) {
        this.f47614n = cnVar;
        this.f47609a = z9;
        this.f47610b = z10;
        this.f47611c = k9Var;
        this.d = bnVar;
        this.f47612e = m5Var;
        this.f47613f = z11;
        this.h = rmVar;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        cn cnVar = this.f47614n;
        cnVar.V2[1] = null;
        cnVar.P2[1].setTranslationY(0.0f);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        Object[] objArr = this.f47614n.V2;
        if (animator.equals(objArr[1])) {
            org.telegram.ui.Components.k9 k9Var = this.f47611c;
            boolean z9 = this.f47610b;
            boolean z10 = this.f47609a;
            if (!z10 && !z9 && k9Var == null) {
                objArr[1] = null;
                return;
            }
            objArr[1] = new AnimatorSet();
            objArr[1].setInterpolator(org.telegram.ui.Components.wq.h);
            objArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, View.TRANSLATION_Y, 0.0f));
            }
            if (z9) {
                arrayList.add(ObjectAnimator.ofFloat(this.f47612e, View.TRANSLATION_Y, 0.0f));
            }
            if (this.f47613f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, View.TRANSLATION_Y, 0.0f));
            }
            if (k9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(k9Var, View.TRANSLATION_Y, 0.0f));
            }
            objArr[1].addListener(new va(this, 4));
            objArr[1].playTogether(arrayList);
            objArr[1].start();
        }
    }
}

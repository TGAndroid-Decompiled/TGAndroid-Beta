package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
public final class jh extends AnimatorListenerAdapter {
    public final boolean f49121a;
    public final boolean f49122b;
    public final org.telegram.ui.Components.p9 f49123c;
    public final an d;
    public final org.telegram.ui.ActionBar.n5 f49124e;
    public final boolean f49125f;
    public final qm h;
    public final bn f49126n;

    public jh(bn bnVar, boolean z10, boolean z11, org.telegram.ui.Components.p9 p9Var, an anVar, org.telegram.ui.ActionBar.n5 n5Var, boolean z12, qm qmVar) {
        this.f49126n = bnVar;
        this.f49121a = z10;
        this.f49122b = z11;
        this.f49123c = p9Var;
        this.d = anVar;
        this.f49124e = n5Var;
        this.f49125f = z12;
        this.h = qmVar;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        bn bnVar = this.f49126n;
        bnVar.W2[1] = null;
        bnVar.Q2[1].setTranslationY(0.0f);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        Object[] objArr = this.f49126n.W2;
        if (animator.equals(objArr[1])) {
            org.telegram.ui.Components.p9 p9Var = this.f49123c;
            boolean z10 = this.f49122b;
            boolean z11 = this.f49121a;
            if (!z11 && !z10 && p9Var == null) {
                objArr[1] = null;
                return;
            }
            objArr[1] = new AnimatorSet();
            objArr[1].setInterpolator(org.telegram.ui.Components.kr.h);
            objArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, View.TRANSLATION_Y, 0.0f));
            }
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.f49124e, View.TRANSLATION_Y, 0.0f));
            }
            if (this.f49125f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, View.TRANSLATION_Y, 0.0f));
            }
            if (p9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(p9Var, View.TRANSLATION_Y, 0.0f));
            }
            objArr[1].addListener(new org.telegram.ui.Cells.x9(this, 5));
            objArr[1].playTogether(arrayList);
            objArr[1].start();
        }
    }
}

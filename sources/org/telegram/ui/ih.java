package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
public final class ih extends AnimatorListenerAdapter {
    public final boolean f48727a;
    public final boolean f48728b;
    public final org.telegram.ui.Components.q9 f48729c;
    public final an d;
    public final org.telegram.ui.ActionBar.n5 f48730e;
    public final boolean f48731f;
    public final qm h;
    public final bn f48732n;

    public ih(bn bnVar, boolean z10, boolean z11, org.telegram.ui.Components.q9 q9Var, an anVar, org.telegram.ui.ActionBar.n5 n5Var, boolean z12, qm qmVar) {
        this.f48732n = bnVar;
        this.f48727a = z10;
        this.f48728b = z11;
        this.f48729c = q9Var;
        this.d = anVar;
        this.f48730e = n5Var;
        this.f48731f = z12;
        this.h = qmVar;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        bn bnVar = this.f48732n;
        bnVar.W2[1] = null;
        bnVar.Q2[1].setTranslationY(0.0f);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        Object[] objArr = this.f48732n.W2;
        if (animator.equals(objArr[1])) {
            org.telegram.ui.Components.q9 q9Var = this.f48729c;
            boolean z10 = this.f48728b;
            boolean z11 = this.f48727a;
            if (!z11 && !z10 && q9Var == null) {
                objArr[1] = null;
                return;
            }
            objArr[1] = new AnimatorSet();
            objArr[1].setInterpolator(org.telegram.ui.Components.lr.h);
            objArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, View.TRANSLATION_Y, 0.0f));
            }
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.f48730e, View.TRANSLATION_Y, 0.0f));
            }
            if (this.f48731f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, View.TRANSLATION_Y, 0.0f));
            }
            if (q9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(q9Var, View.TRANSLATION_Y, 0.0f));
            }
            objArr[1].addListener(new org.telegram.ui.Cells.y9(this, 5));
            objArr[1].playTogether(arrayList);
            objArr[1].start();
        }
    }
}

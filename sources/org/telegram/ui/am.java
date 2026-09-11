package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
public final class am extends AnimatorListenerAdapter {
    public final boolean f34472a;
    public final boolean f34473b;
    public final org.telegram.ui.Components.x9 f34474c;
    public final bo d;
    public final org.telegram.ui.ActionBar.j5 f34475e;
    public final boolean f34476f;
    public final bi.c4 h;
    public final co f34477n;

    public am(co coVar, boolean z10, boolean z11, org.telegram.ui.Components.x9 x9Var, bo boVar, org.telegram.ui.ActionBar.j5 j5Var, boolean z12, bi.c4 c4Var) {
        this.f34477n = coVar;
        this.f34472a = z10;
        this.f34473b = z11;
        this.f34474c = x9Var;
        this.d = boVar;
        this.f34475e = j5Var;
        this.f34476f = z12;
        this.h = c4Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        co coVar = this.f34477n;
        coVar.H2[1] = null;
        coVar.B2[1].setTranslationY(0.0f);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        Object[] objArr = this.f34477n.H2;
        if (animator.equals(objArr[1])) {
            org.telegram.ui.Components.x9 x9Var = this.f34474c;
            boolean z10 = this.f34473b;
            boolean z11 = this.f34472a;
            if (!z11 && !z10 && x9Var == null) {
                objArr[1] = null;
                return;
            }
            objArr[1] = new AnimatorSet();
            objArr[1].setInterpolator(org.telegram.ui.Components.pr.h);
            objArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, View.TRANSLATION_Y, 0.0f));
            }
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.f34475e, View.TRANSLATION_Y, 0.0f));
            }
            if (this.f34476f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, View.TRANSLATION_Y, 0.0f));
            }
            if (x9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(x9Var, View.TRANSLATION_Y, 0.0f));
            }
            objArr[1].addListener(new s0(this, 23));
            objArr[1].playTogether(arrayList);
            objArr[1].start();
        }
    }
}

package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
public final class gi extends AnimatorListenerAdapter {
    public final boolean f36404a;
    public final boolean f36405b;
    public final org.telegram.ui.Components.z9 f36406c;
    public final eo d;
    public final org.telegram.ui.ActionBar.h5 e;
    public final boolean f36407f;
    public final bi.f4 h;
    public final fo f36408n;

    public gi(fo foVar, boolean z10, boolean z11, org.telegram.ui.Components.z9 z9Var, eo eoVar, org.telegram.ui.ActionBar.h5 h5Var, boolean z12, bi.f4 f4Var) {
        this.f36408n = foVar;
        this.f36404a = z10;
        this.f36405b = z11;
        this.f36406c = z9Var;
        this.d = eoVar;
        this.e = h5Var;
        this.f36407f = z12;
        this.h = f4Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        fo foVar = this.f36408n;
        foVar.H2[1] = null;
        foVar.B2[1].setTranslationY(0.0f);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        Object[] objArr = this.f36408n.H2;
        if (animator.equals(objArr[1])) {
            org.telegram.ui.Components.z9 z9Var = this.f36406c;
            boolean z10 = this.f36405b;
            boolean z11 = this.f36404a;
            if (!z11 && !z10 && z9Var == null) {
                objArr[1] = null;
                return;
            }
            objArr[1] = new AnimatorSet();
            objArr[1].setInterpolator(org.telegram.ui.Components.es.h);
            objArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, View.TRANSLATION_Y, 0.0f));
            }
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.e, View.TRANSLATION_Y, 0.0f));
            }
            if (this.f36407f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, View.TRANSLATION_Y, 0.0f));
            }
            if (z9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(z9Var, View.TRANSLATION_Y, 0.0f));
            }
            objArr[1].addListener(new u0(this, 21));
            objArr[1].playTogether(arrayList);
            objArr[1].start();
        }
    }
}

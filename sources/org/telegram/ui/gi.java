package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
public final class gi extends AnimatorListenerAdapter {
    public final boolean f38057a;
    public final boolean f38058b;
    public final org.telegram.ui.Components.y9 f38059c;
    public final co d;
    public final org.telegram.ui.ActionBar.h5 f38060e;
    public final boolean f38061f;
    public final ai.q4 h;
    public final eo f38062n;

    public gi(eo eoVar, boolean z10, boolean z11, org.telegram.ui.Components.y9 y9Var, co coVar, org.telegram.ui.ActionBar.h5 h5Var, boolean z12, ai.q4 q4Var) {
        this.f38062n = eoVar;
        this.f38057a = z10;
        this.f38058b = z11;
        this.f38059c = y9Var;
        this.d = coVar;
        this.f38060e = h5Var;
        this.f38061f = z12;
        this.h = q4Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        eo eoVar = this.f38062n;
        eoVar.H2[1] = null;
        eoVar.B2[1].setTranslationY(0.0f);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        Object[] objArr = this.f38062n.H2;
        if (animator.equals(objArr[1])) {
            org.telegram.ui.Components.y9 y9Var = this.f38059c;
            boolean z10 = this.f38058b;
            boolean z11 = this.f38057a;
            if (!z11 && !z10 && y9Var == null) {
                objArr[1] = null;
                return;
            }
            objArr[1] = new AnimatorSet();
            objArr[1].setInterpolator(org.telegram.ui.Components.js.h);
            objArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, View.TRANSLATION_Y, 0.0f));
            }
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.f38060e, View.TRANSLATION_Y, 0.0f));
            }
            if (this.f38061f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, View.TRANSLATION_Y, 0.0f));
            }
            if (y9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(y9Var, View.TRANSLATION_Y, 0.0f));
            }
            objArr[1].addListener(new w4(this, 18));
            objArr[1].playTogether(arrayList);
            objArr[1].start();
        }
    }
}

package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
public final class cm extends AnimatorListenerAdapter {
    public final boolean f31736a;
    public final boolean f31737b;
    public final org.telegram.ui.Components.w9 f31738c;
    public final co d;
    public final org.telegram.ui.ActionBar.l5 e;
    public final boolean f31739f;
    public final di.h h;
    public final eo f31740n;

    public cm(eo eoVar, boolean z10, boolean z11, org.telegram.ui.Components.w9 w9Var, co coVar, org.telegram.ui.ActionBar.l5 l5Var, boolean z12, di.h hVar) {
        this.f31740n = eoVar;
        this.f31736a = z10;
        this.f31737b = z11;
        this.f31738c = w9Var;
        this.d = coVar;
        this.e = l5Var;
        this.f31739f = z12;
        this.h = hVar;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        eo eoVar = this.f31740n;
        eoVar.H2[1] = null;
        eoVar.B2[1].setTranslationY(0.0f);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        Object[] objArr = this.f31740n.H2;
        if (animator.equals(objArr[1])) {
            org.telegram.ui.Components.w9 w9Var = this.f31738c;
            boolean z10 = this.f31737b;
            boolean z11 = this.f31736a;
            if (!z11 && !z10 && w9Var == null) {
                objArr[1] = null;
                return;
            }
            objArr[1] = new AnimatorSet();
            objArr[1].setInterpolator(org.telegram.ui.Components.wr.h);
            objArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, View.TRANSLATION_Y, 0.0f));
            }
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.e, View.TRANSLATION_Y, 0.0f));
            }
            if (this.f31739f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, View.TRANSLATION_Y, 0.0f));
            }
            if (w9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(w9Var, View.TRANSLATION_Y, 0.0f));
            }
            objArr[1].addListener(new org.telegram.ui.Cells.v5(this, 10));
            objArr[1].playTogether(arrayList);
            objArr[1].start();
        }
    }
}

package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
public final class am extends AnimatorListenerAdapter {
    public final boolean f34499a;
    public final boolean f34500b;
    public final org.telegram.ui.Components.x9 f34501c;
    public final bo d;
    public final org.telegram.ui.ActionBar.j5 f34502e;
    public final boolean f34503f;
    public final bi.c4 h;
    public final co f34504n;

    public am(co coVar, boolean z10, boolean z11, org.telegram.ui.Components.x9 x9Var, bo boVar, org.telegram.ui.ActionBar.j5 j5Var, boolean z12, bi.c4 c4Var) {
        this.f34504n = coVar;
        this.f34499a = z10;
        this.f34500b = z11;
        this.f34501c = x9Var;
        this.d = boVar;
        this.f34502e = j5Var;
        this.f34503f = z12;
        this.h = c4Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        co coVar = this.f34504n;
        coVar.H2[1] = null;
        coVar.B2[1].setTranslationY(0.0f);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        Object[] objArr = this.f34504n.H2;
        if (animator.equals(objArr[1])) {
            org.telegram.ui.Components.x9 x9Var = this.f34501c;
            boolean z10 = this.f34500b;
            boolean z11 = this.f34499a;
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
                arrayList.add(ObjectAnimator.ofFloat(this.f34502e, View.TRANSLATION_Y, 0.0f));
            }
            if (this.f34503f) {
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

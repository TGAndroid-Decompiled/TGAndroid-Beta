package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
public final class ol extends AnimatorListenerAdapter {
    public final boolean f41184a;
    public final boolean f41185b;
    public final org.telegram.ui.Components.o9 f41186c;
    public final pn d;
    public final org.telegram.ui.ActionBar.h5 f41187e;
    public final boolean f41188f;
    public final bg.t h;
    public final qn f41189n;

    public ol(qn qnVar, boolean z10, boolean z11, org.telegram.ui.Components.o9 o9Var, pn pnVar, org.telegram.ui.ActionBar.h5 h5Var, boolean z12, bg.t tVar) {
        this.f41189n = qnVar;
        this.f41184a = z10;
        this.f41185b = z11;
        this.f41186c = o9Var;
        this.d = pnVar;
        this.f41187e = h5Var;
        this.f41188f = z12;
        this.h = tVar;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        qn qnVar = this.f41189n;
        qnVar.D2[1] = null;
        qnVar.f42129x2[1].setTranslationY(0.0f);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        Object[] objArr = this.f41189n.D2;
        if (animator.equals(objArr[1])) {
            org.telegram.ui.Components.o9 o9Var = this.f41186c;
            boolean z10 = this.f41185b;
            boolean z11 = this.f41184a;
            if (!z11 && !z10 && o9Var == null) {
                objArr[1] = null;
                return;
            }
            objArr[1] = new AnimatorSet();
            objArr[1].setInterpolator(org.telegram.ui.Components.gr.h);
            objArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, View.TRANSLATION_Y, 0.0f));
            }
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.f41187e, View.TRANSLATION_Y, 0.0f));
            }
            if (this.f41188f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, View.TRANSLATION_Y, 0.0f));
            }
            if (o9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(o9Var, View.TRANSLATION_Y, 0.0f));
            }
            objArr[1].addListener(new mh.x(this, 26));
            objArr[1].playTogether(arrayList);
            objArr[1].start();
        }
    }
}

package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
public final class jh extends AnimatorListenerAdapter {
    public final boolean f48334a;
    public final boolean f48335b;
    public final org.telegram.ui.Components.i9 f48336c;
    public final zm d;
    public final org.telegram.ui.ActionBar.j5 f48337e;
    public final boolean f48338f;
    public final pm h;
    public final an f48339n;

    public jh(an anVar, boolean z10, boolean z11, org.telegram.ui.Components.i9 i9Var, zm zmVar, org.telegram.ui.ActionBar.j5 j5Var, boolean z12, pm pmVar) {
        this.f48339n = anVar;
        this.f48334a = z10;
        this.f48335b = z11;
        this.f48336c = i9Var;
        this.d = zmVar;
        this.f48337e = j5Var;
        this.f48338f = z12;
        this.h = pmVar;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        an anVar = this.f48339n;
        anVar.W2[1] = null;
        anVar.Q2[1].setTranslationY(0.0f);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        Object[] objArr = this.f48339n.W2;
        if (animator.equals(objArr[1])) {
            org.telegram.ui.Components.i9 i9Var = this.f48336c;
            boolean z10 = this.f48335b;
            boolean z11 = this.f48334a;
            if (!z11 && !z10 && i9Var == null) {
                objArr[1] = null;
                return;
            }
            objArr[1] = new AnimatorSet();
            objArr[1].setInterpolator(org.telegram.ui.Components.er.h);
            objArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, View.TRANSLATION_Y, 0.0f));
            }
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.f48337e, View.TRANSLATION_Y, 0.0f));
            }
            if (this.f48338f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, View.TRANSLATION_Y, 0.0f));
            }
            if (i9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(i9Var, View.TRANSLATION_Y, 0.0f));
            }
            objArr[1].addListener(new org.telegram.ui.Cells.w9(this, 5));
            objArr[1].playTogether(arrayList);
            objArr[1].start();
        }
    }
}

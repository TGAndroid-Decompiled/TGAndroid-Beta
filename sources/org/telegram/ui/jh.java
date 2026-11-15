package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
public final class jh extends AnimatorListenerAdapter {
    public final boolean f48349a;
    public final boolean f48350b;
    public final org.telegram.ui.Components.i9 f48351c;
    public final zm d;
    public final org.telegram.ui.ActionBar.j5 f48352e;
    public final boolean f48353f;
    public final pm h;
    public final an f48354n;

    public jh(an anVar, boolean z10, boolean z11, org.telegram.ui.Components.i9 i9Var, zm zmVar, org.telegram.ui.ActionBar.j5 j5Var, boolean z12, pm pmVar) {
        this.f48354n = anVar;
        this.f48349a = z10;
        this.f48350b = z11;
        this.f48351c = i9Var;
        this.d = zmVar;
        this.f48352e = j5Var;
        this.f48353f = z12;
        this.h = pmVar;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        an anVar = this.f48354n;
        anVar.W2[1] = null;
        anVar.Q2[1].setTranslationY(0.0f);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        Object[] objArr = this.f48354n.W2;
        if (animator.equals(objArr[1])) {
            org.telegram.ui.Components.i9 i9Var = this.f48351c;
            boolean z10 = this.f48350b;
            boolean z11 = this.f48349a;
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
                arrayList.add(ObjectAnimator.ofFloat(this.f48352e, View.TRANSLATION_Y, 0.0f));
            }
            if (this.f48353f) {
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

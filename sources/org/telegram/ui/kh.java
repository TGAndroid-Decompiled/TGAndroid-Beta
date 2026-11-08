package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class kh extends AnimatorListenerAdapter {
    public final zm f47191a;
    public final boolean f47192b;
    public final org.telegram.ui.ActionBar.k5 f47193c;
    public final boolean d;
    public final pm f47194e;
    public final boolean f47195f;
    public final an h;

    public kh(an anVar, zm zmVar, boolean z9, org.telegram.ui.ActionBar.k5 k5Var, boolean z10, pm pmVar, boolean z11) {
        this.h = anVar;
        this.f47191a = zmVar;
        this.f47192b = z9;
        this.f47193c = k5Var;
        this.d = z10;
        this.f47194e = pmVar;
        this.f47195f = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        an anVar = this.h;
        if (anVar.T2.getTag() != null) {
            anVar.T2.setVisibility(4);
            int a92 = anVar.a9();
            anVar.T2.a(Math.min(a92 - 1, Math.max(1, a92 - anVar.Y4[0])), false);
        } else {
            anVar.T2.setAlpha(1.0f);
        }
        anVar.T2.setTranslationY(0.0f);
        anVar.R2[0].setTranslationX(0.0f);
        anVar.R2[1].setTranslationX(0.0f);
        anVar.T2.setTranslationX(anVar.U2 + 0.0f);
        zm zmVar = this.f47191a;
        zmVar.setTranslationY(0.0f);
        boolean z9 = this.f47192b;
        if (!z9) {
            zmVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.k5 k5Var = this.f47193c;
        if (!z9) {
            k5Var.setTranslationY(0.0f);
        }
        boolean z10 = this.d;
        pm pmVar = this.f47194e;
        if (!z10) {
            pmVar.setTranslationY(0.0f);
        }
        anVar.Q2[0].setTranslationX(0.0f);
        anVar.Q2[1].setTranslationX(0.0f);
        anVar.P2[1].setAlpha(1.0f);
        anVar.P2[1].setScaleX(1.0f);
        anVar.P2[1].setScaleY(1.0f);
        anVar.P2[0].setAlpha(1.0f);
        anVar.P2[0].setScaleX(1.0f);
        anVar.P2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.k5[] k5VarArr = anVar.R2;
        org.telegram.ui.ActionBar.k5 k5Var2 = k5VarArr[0];
        k5VarArr[1] = k5Var2;
        k5VarArr[0] = k5Var;
        k5Var2.setVisibility(4);
        pm[] pmVarArr = anVar.S2;
        pm pmVar2 = pmVarArr[0];
        pmVarArr[1] = pmVar2;
        pmVarArr[0] = pmVar;
        pmVar2.setVisibility(4);
        zm[] zmVarArr = anVar.Q2;
        zm zmVar2 = zmVarArr[0];
        if (zmVar != zmVar2) {
            zmVarArr[1] = zmVar2;
            zmVarArr[0] = zmVar;
            zmVar2.setVisibility(4);
        }
        if (this.f47195f) {
            anVar.P2[1].setImageBitmap(null);
            anVar.P2[1].setVisibility(4);
        }
        org.telegram.ui.Components.l9[] l9VarArr = anVar.P2;
        org.telegram.ui.Components.l9 l9Var = l9VarArr[1];
        org.telegram.ui.Components.l9 l9Var2 = l9VarArr[0];
        l9VarArr[1] = l9Var2;
        l9VarArr[0] = l9Var;
        l9Var2.setAlpha(1.0f);
        anVar.P2[1].setScaleX(1.0f);
        anVar.P2[1].setScaleY(1.0f);
        anVar.P2[1].setVisibility(4);
        anVar.V2[0] = null;
        anVar.O2 = false;
    }
}

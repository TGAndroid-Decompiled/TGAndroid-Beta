package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fi extends AnimatorListenerAdapter {
    public final co f32838a;
    public final boolean f32839b;
    public final org.telegram.ui.ActionBar.l5 f32840c;
    public final boolean d;
    public final di.h e;
    public final boolean f32841f;
    public final eo h;

    public fi(eo eoVar, co coVar, boolean z10, org.telegram.ui.ActionBar.l5 l5Var, boolean z11, di.h hVar, boolean z12) {
        this.h = eoVar;
        this.f32838a = coVar;
        this.f32839b = z10;
        this.f32840c = l5Var;
        this.d = z11;
        this.e = hVar;
        this.f32841f = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        eo eoVar = this.h;
        if (eoVar.F2.getTag() != null) {
            eoVar.F2.setVisibility(4);
            int G8 = eoVar.G8();
            eoVar.F2.a(Math.min(G8 - 1, Math.max(1, G8 - eoVar.M4[0])), false);
        } else {
            eoVar.F2.setAlpha(1.0f);
        }
        eoVar.F2.setTranslationY(0.0f);
        eoVar.D2[0].setTranslationX(0.0f);
        eoVar.D2[1].setTranslationX(0.0f);
        eoVar.F2.setTranslationX(eoVar.G2 + 0.0f);
        co coVar = this.f32838a;
        coVar.setTranslationY(0.0f);
        boolean z10 = this.f32839b;
        if (!z10) {
            coVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.l5 l5Var = this.f32840c;
        if (!z10) {
            l5Var.setTranslationY(0.0f);
        }
        boolean z11 = this.d;
        di.h hVar = this.e;
        if (!z11) {
            hVar.setTranslationY(0.0f);
        }
        eoVar.C2[0].setTranslationX(0.0f);
        eoVar.C2[1].setTranslationX(0.0f);
        eoVar.B2[1].setAlpha(1.0f);
        eoVar.B2[1].setScaleX(1.0f);
        eoVar.B2[1].setScaleY(1.0f);
        eoVar.B2[0].setAlpha(1.0f);
        eoVar.B2[0].setScaleX(1.0f);
        eoVar.B2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.l5[] l5VarArr = eoVar.D2;
        org.telegram.ui.ActionBar.l5 l5Var2 = l5VarArr[0];
        l5VarArr[1] = l5Var2;
        l5VarArr[0] = l5Var;
        l5Var2.setVisibility(4);
        di.h[] hVarArr = eoVar.E2;
        di.h hVar2 = hVarArr[0];
        hVarArr[1] = hVar2;
        hVarArr[0] = hVar;
        hVar2.setVisibility(4);
        co[] coVarArr = eoVar.C2;
        co coVar2 = coVarArr[0];
        if (coVar != coVar2) {
            coVarArr[1] = coVar2;
            coVarArr[0] = coVar;
            coVar2.setVisibility(4);
        }
        if (this.f32841f) {
            eoVar.B2[1].setImageBitmap(null);
            eoVar.B2[1].setVisibility(4);
        }
        org.telegram.ui.Components.w9[] w9VarArr = eoVar.B2;
        org.telegram.ui.Components.w9 w9Var = w9VarArr[1];
        org.telegram.ui.Components.w9 w9Var2 = w9VarArr[0];
        w9VarArr[1] = w9Var2;
        w9VarArr[0] = w9Var;
        w9Var2.setAlpha(1.0f);
        eoVar.B2[1].setScaleX(1.0f);
        eoVar.B2[1].setScaleY(1.0f);
        eoVar.B2[1].setVisibility(4);
        eoVar.H2[0] = null;
        eoVar.A2 = false;
    }
}

package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class di extends AnimatorListenerAdapter {
    public final bo f35792a;
    public final boolean f35793b;
    public final org.telegram.ui.ActionBar.j5 f35794c;
    public final boolean d;
    public final bi.c4 f35795e;
    public final boolean f35796f;
    public final co h;

    public di(co coVar, bo boVar, boolean z10, org.telegram.ui.ActionBar.j5 j5Var, boolean z11, bi.c4 c4Var, boolean z12) {
        this.h = coVar;
        this.f35792a = boVar;
        this.f35793b = z10;
        this.f35794c = j5Var;
        this.d = z11;
        this.f35795e = c4Var;
        this.f35796f = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        co coVar = this.h;
        if (coVar.F2.getTag() != null) {
            coVar.F2.setVisibility(4);
            int G8 = coVar.G8();
            coVar.F2.a(Math.min(G8 - 1, Math.max(1, G8 - coVar.M4[0])), false);
        } else {
            coVar.F2.setAlpha(1.0f);
        }
        coVar.F2.setTranslationY(0.0f);
        coVar.D2[0].setTranslationX(0.0f);
        coVar.D2[1].setTranslationX(0.0f);
        coVar.F2.setTranslationX(coVar.G2 + 0.0f);
        bo boVar = this.f35792a;
        boVar.setTranslationY(0.0f);
        boolean z10 = this.f35793b;
        if (!z10) {
            boVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.j5 j5Var = this.f35794c;
        if (!z10) {
            j5Var.setTranslationY(0.0f);
        }
        boolean z11 = this.d;
        bi.c4 c4Var = this.f35795e;
        if (!z11) {
            c4Var.setTranslationY(0.0f);
        }
        coVar.C2[0].setTranslationX(0.0f);
        coVar.C2[1].setTranslationX(0.0f);
        coVar.B2[1].setAlpha(1.0f);
        coVar.B2[1].setScaleX(1.0f);
        coVar.B2[1].setScaleY(1.0f);
        coVar.B2[0].setAlpha(1.0f);
        coVar.B2[0].setScaleX(1.0f);
        coVar.B2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.j5[] j5VarArr = coVar.D2;
        org.telegram.ui.ActionBar.j5 j5Var2 = j5VarArr[0];
        j5VarArr[1] = j5Var2;
        j5VarArr[0] = j5Var;
        j5Var2.setVisibility(4);
        bi.c4[] c4VarArr = coVar.E2;
        bi.c4 c4Var2 = c4VarArr[0];
        c4VarArr[1] = c4Var2;
        c4VarArr[0] = c4Var;
        c4Var2.setVisibility(4);
        bo[] boVarArr = coVar.C2;
        bo boVar2 = boVarArr[0];
        if (boVar != boVar2) {
            boVarArr[1] = boVar2;
            boVarArr[0] = boVar;
            boVar2.setVisibility(4);
        }
        if (this.f35796f) {
            coVar.B2[1].setImageBitmap(null);
            coVar.B2[1].setVisibility(4);
        }
        org.telegram.ui.Components.x9[] x9VarArr = coVar.B2;
        org.telegram.ui.Components.x9 x9Var = x9VarArr[1];
        org.telegram.ui.Components.x9 x9Var2 = x9VarArr[0];
        x9VarArr[1] = x9Var2;
        x9VarArr[0] = x9Var;
        x9Var2.setAlpha(1.0f);
        coVar.B2[1].setScaleX(1.0f);
        coVar.B2[1].setScaleY(1.0f);
        coVar.B2[1].setVisibility(4);
        coVar.H2[0] = null;
        coVar.A2 = false;
    }
}

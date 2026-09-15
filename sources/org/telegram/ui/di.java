package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class di extends AnimatorListenerAdapter {
    public final ao f33064a;
    public final boolean f33065b;
    public final org.telegram.ui.ActionBar.j5 f33066c;
    public final boolean d;
    public final ai.p4 e;
    public final boolean f33067f;
    public final bo h;

    public di(bo boVar, ao aoVar, boolean z10, org.telegram.ui.ActionBar.j5 j5Var, boolean z11, ai.p4 p4Var, boolean z12) {
        this.h = boVar;
        this.f33064a = aoVar;
        this.f33065b = z10;
        this.f33066c = j5Var;
        this.d = z11;
        this.e = p4Var;
        this.f33067f = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        bo boVar = this.h;
        if (boVar.F2.getTag() != null) {
            boVar.F2.setVisibility(4);
            int G8 = boVar.G8();
            boVar.F2.a(Math.min(G8 - 1, Math.max(1, G8 - boVar.M4[0])), false);
        } else {
            boVar.F2.setAlpha(1.0f);
        }
        boVar.F2.setTranslationY(0.0f);
        boVar.D2[0].setTranslationX(0.0f);
        boVar.D2[1].setTranslationX(0.0f);
        boVar.F2.setTranslationX(boVar.G2 + 0.0f);
        ao aoVar = this.f33064a;
        aoVar.setTranslationY(0.0f);
        boolean z10 = this.f33065b;
        if (!z10) {
            aoVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.j5 j5Var = this.f33066c;
        if (!z10) {
            j5Var.setTranslationY(0.0f);
        }
        boolean z11 = this.d;
        ai.p4 p4Var = this.e;
        if (!z11) {
            p4Var.setTranslationY(0.0f);
        }
        boVar.C2[0].setTranslationX(0.0f);
        boVar.C2[1].setTranslationX(0.0f);
        boVar.B2[1].setAlpha(1.0f);
        boVar.B2[1].setScaleX(1.0f);
        boVar.B2[1].setScaleY(1.0f);
        boVar.B2[0].setAlpha(1.0f);
        boVar.B2[0].setScaleX(1.0f);
        boVar.B2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.j5[] j5VarArr = boVar.D2;
        org.telegram.ui.ActionBar.j5 j5Var2 = j5VarArr[0];
        j5VarArr[1] = j5Var2;
        j5VarArr[0] = j5Var;
        j5Var2.setVisibility(4);
        ai.p4[] p4VarArr = boVar.E2;
        ai.p4 p4Var2 = p4VarArr[0];
        p4VarArr[1] = p4Var2;
        p4VarArr[0] = p4Var;
        p4Var2.setVisibility(4);
        ao[] aoVarArr = boVar.C2;
        ao aoVar2 = aoVarArr[0];
        if (aoVar != aoVar2) {
            aoVarArr[1] = aoVar2;
            aoVarArr[0] = aoVar;
            aoVar2.setVisibility(4);
        }
        if (this.f33067f) {
            boVar.B2[1].setImageBitmap(null);
            boVar.B2[1].setVisibility(4);
        }
        org.telegram.ui.Components.u9[] u9VarArr = boVar.B2;
        org.telegram.ui.Components.u9 u9Var = u9VarArr[1];
        org.telegram.ui.Components.u9 u9Var2 = u9VarArr[0];
        u9VarArr[1] = u9Var2;
        u9VarArr[0] = u9Var;
        u9Var2.setAlpha(1.0f);
        boVar.B2[1].setScaleX(1.0f);
        boVar.B2[1].setScaleY(1.0f);
        boVar.B2[1].setVisibility(4);
        boVar.H2[0] = null;
        boVar.A2 = false;
    }
}

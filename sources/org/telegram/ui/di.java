package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class di extends AnimatorListenerAdapter {
    public final wn f32981a;
    public final boolean f32982b;
    public final org.telegram.ui.ActionBar.j5 f32983c;
    public final boolean d;
    public final ai.p4 e;
    public final boolean f32984f;
    public final xn h;

    public di(xn xnVar, wn wnVar, boolean z10, org.telegram.ui.ActionBar.j5 j5Var, boolean z11, ai.p4 p4Var, boolean z12) {
        this.h = xnVar;
        this.f32981a = wnVar;
        this.f32982b = z10;
        this.f32983c = j5Var;
        this.d = z11;
        this.e = p4Var;
        this.f32984f = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        xn xnVar = this.h;
        if (xnVar.F2.getTag() != null) {
            xnVar.F2.setVisibility(4);
            int G8 = xnVar.G8();
            xnVar.F2.a(Math.min(G8 - 1, Math.max(1, G8 - xnVar.M4[0])), false);
        } else {
            xnVar.F2.setAlpha(1.0f);
        }
        xnVar.F2.setTranslationY(0.0f);
        xnVar.D2[0].setTranslationX(0.0f);
        xnVar.D2[1].setTranslationX(0.0f);
        xnVar.F2.setTranslationX(xnVar.G2 + 0.0f);
        wn wnVar = this.f32981a;
        wnVar.setTranslationY(0.0f);
        boolean z10 = this.f32982b;
        if (!z10) {
            wnVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.j5 j5Var = this.f32983c;
        if (!z10) {
            j5Var.setTranslationY(0.0f);
        }
        boolean z11 = this.d;
        ai.p4 p4Var = this.e;
        if (!z11) {
            p4Var.setTranslationY(0.0f);
        }
        xnVar.C2[0].setTranslationX(0.0f);
        xnVar.C2[1].setTranslationX(0.0f);
        xnVar.B2[1].setAlpha(1.0f);
        xnVar.B2[1].setScaleX(1.0f);
        xnVar.B2[1].setScaleY(1.0f);
        xnVar.B2[0].setAlpha(1.0f);
        xnVar.B2[0].setScaleX(1.0f);
        xnVar.B2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.j5[] j5VarArr = xnVar.D2;
        org.telegram.ui.ActionBar.j5 j5Var2 = j5VarArr[0];
        j5VarArr[1] = j5Var2;
        j5VarArr[0] = j5Var;
        j5Var2.setVisibility(4);
        ai.p4[] p4VarArr = xnVar.E2;
        ai.p4 p4Var2 = p4VarArr[0];
        p4VarArr[1] = p4Var2;
        p4VarArr[0] = p4Var;
        p4Var2.setVisibility(4);
        wn[] wnVarArr = xnVar.C2;
        wn wnVar2 = wnVarArr[0];
        if (wnVar != wnVar2) {
            wnVarArr[1] = wnVar2;
            wnVarArr[0] = wnVar;
            wnVar2.setVisibility(4);
        }
        if (this.f32984f) {
            xnVar.B2[1].setImageBitmap(null);
            xnVar.B2[1].setVisibility(4);
        }
        org.telegram.ui.Components.w9[] w9VarArr = xnVar.B2;
        org.telegram.ui.Components.w9 w9Var = w9VarArr[1];
        org.telegram.ui.Components.w9 w9Var2 = w9VarArr[0];
        w9VarArr[1] = w9Var2;
        w9VarArr[0] = w9Var;
        w9Var2.setAlpha(1.0f);
        xnVar.B2[1].setScaleX(1.0f);
        xnVar.B2[1].setScaleY(1.0f);
        xnVar.B2[1].setVisibility(4);
        xnVar.H2[0] = null;
        xnVar.A2 = false;
    }
}

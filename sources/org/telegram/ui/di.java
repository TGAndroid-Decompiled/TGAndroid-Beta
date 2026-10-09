package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class di extends AnimatorListenerAdapter {
    public final yn f36981a;
    public final boolean f36982b;
    public final org.telegram.ui.ActionBar.j5 f36983c;
    public final boolean d;
    public final ai.q4 f36984e;
    public final boolean f36985f;
    public final zn h;

    public di(zn znVar, yn ynVar, boolean z10, org.telegram.ui.ActionBar.j5 j5Var, boolean z11, ai.q4 q4Var, boolean z12) {
        this.h = znVar;
        this.f36981a = ynVar;
        this.f36982b = z10;
        this.f36983c = j5Var;
        this.d = z11;
        this.f36984e = q4Var;
        this.f36985f = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        zn znVar = this.h;
        if (znVar.F2.getTag() != null) {
            znVar.F2.setVisibility(4);
            int L8 = znVar.L8();
            znVar.F2.a(Math.min(L8 - 1, Math.max(1, L8 - znVar.M4[0])), false);
        } else {
            znVar.F2.setAlpha(1.0f);
        }
        znVar.F2.setTranslationY(0.0f);
        znVar.D2[0].setTranslationX(0.0f);
        znVar.D2[1].setTranslationX(0.0f);
        znVar.F2.setTranslationX(znVar.G2 + 0.0f);
        yn ynVar = this.f36981a;
        ynVar.setTranslationY(0.0f);
        boolean z10 = this.f36982b;
        if (!z10) {
            ynVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.j5 j5Var = this.f36983c;
        if (!z10) {
            j5Var.setTranslationY(0.0f);
        }
        boolean z11 = this.d;
        ai.q4 q4Var = this.f36984e;
        if (!z11) {
            q4Var.setTranslationY(0.0f);
        }
        znVar.C2[0].setTranslationX(0.0f);
        znVar.C2[1].setTranslationX(0.0f);
        znVar.B2[1].setAlpha(1.0f);
        znVar.B2[1].setScaleX(1.0f);
        znVar.B2[1].setScaleY(1.0f);
        znVar.B2[0].setAlpha(1.0f);
        znVar.B2[0].setScaleX(1.0f);
        znVar.B2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.j5[] j5VarArr = znVar.D2;
        org.telegram.ui.ActionBar.j5 j5Var2 = j5VarArr[0];
        j5VarArr[1] = j5Var2;
        j5VarArr[0] = j5Var;
        j5Var2.setVisibility(4);
        ai.q4[] q4VarArr = znVar.E2;
        ai.q4 q4Var2 = q4VarArr[0];
        q4VarArr[1] = q4Var2;
        q4VarArr[0] = q4Var;
        q4Var2.setVisibility(4);
        yn[] ynVarArr = znVar.C2;
        yn ynVar2 = ynVarArr[0];
        if (ynVar != ynVar2) {
            ynVarArr[1] = ynVar2;
            ynVarArr[0] = ynVar;
            ynVar2.setVisibility(4);
        }
        if (this.f36985f) {
            znVar.B2[1].setImageBitmap(null);
            znVar.B2[1].setVisibility(4);
        }
        org.telegram.ui.Components.y9[] y9VarArr = znVar.B2;
        org.telegram.ui.Components.y9 y9Var = y9VarArr[1];
        org.telegram.ui.Components.y9 y9Var2 = y9VarArr[0];
        y9VarArr[1] = y9Var2;
        y9VarArr[0] = y9Var;
        y9Var2.setAlpha(1.0f);
        znVar.B2[1].setScaleX(1.0f);
        znVar.B2[1].setScaleY(1.0f);
        znVar.B2[1].setVisibility(4);
        znVar.H2[0] = null;
        znVar.A2 = false;
    }
}

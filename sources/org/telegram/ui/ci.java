package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ci extends AnimatorListenerAdapter {
    public final xn f35472a;
    public final boolean f35473b;
    public final org.telegram.ui.ActionBar.i5 f35474c;
    public final boolean d;
    public final ai.p4 f35475e;
    public final boolean f35476f;
    public final yn h;

    public ci(yn ynVar, xn xnVar, boolean z10, org.telegram.ui.ActionBar.i5 i5Var, boolean z11, ai.p4 p4Var, boolean z12) {
        this.h = ynVar;
        this.f35472a = xnVar;
        this.f35473b = z10;
        this.f35474c = i5Var;
        this.d = z11;
        this.f35475e = p4Var;
        this.f35476f = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        yn ynVar = this.h;
        if (ynVar.D2.getTag() != null) {
            ynVar.D2.setVisibility(4);
            int H8 = ynVar.H8();
            ynVar.D2.a(Math.min(H8 - 1, Math.max(1, H8 - ynVar.K4[0])), false);
        } else {
            ynVar.D2.setAlpha(1.0f);
        }
        ynVar.D2.setTranslationY(0.0f);
        ynVar.B2[0].setTranslationX(0.0f);
        ynVar.B2[1].setTranslationX(0.0f);
        ynVar.D2.setTranslationX(ynVar.E2 + 0.0f);
        xn xnVar = this.f35472a;
        xnVar.setTranslationY(0.0f);
        boolean z10 = this.f35473b;
        if (!z10) {
            xnVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.i5 i5Var = this.f35474c;
        if (!z10) {
            i5Var.setTranslationY(0.0f);
        }
        boolean z11 = this.d;
        ai.p4 p4Var = this.f35475e;
        if (!z11) {
            p4Var.setTranslationY(0.0f);
        }
        ynVar.A2[0].setTranslationX(0.0f);
        ynVar.A2[1].setTranslationX(0.0f);
        ynVar.f43578z2[1].setAlpha(1.0f);
        ynVar.f43578z2[1].setScaleX(1.0f);
        ynVar.f43578z2[1].setScaleY(1.0f);
        ynVar.f43578z2[0].setAlpha(1.0f);
        ynVar.f43578z2[0].setScaleX(1.0f);
        ynVar.f43578z2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.i5[] i5VarArr = ynVar.B2;
        org.telegram.ui.ActionBar.i5 i5Var2 = i5VarArr[0];
        i5VarArr[1] = i5Var2;
        i5VarArr[0] = i5Var;
        i5Var2.setVisibility(4);
        ai.p4[] p4VarArr = ynVar.C2;
        ai.p4 p4Var2 = p4VarArr[0];
        p4VarArr[1] = p4Var2;
        p4VarArr[0] = p4Var;
        p4Var2.setVisibility(4);
        xn[] xnVarArr = ynVar.A2;
        xn xnVar2 = xnVarArr[0];
        if (xnVar != xnVar2) {
            xnVarArr[1] = xnVar2;
            xnVarArr[0] = xnVar;
            xnVar2.setVisibility(4);
        }
        if (this.f35476f) {
            ynVar.f43578z2[1].setImageBitmap(null);
            ynVar.f43578z2[1].setVisibility(4);
        }
        org.telegram.ui.Components.w9[] w9VarArr = ynVar.f43578z2;
        org.telegram.ui.Components.w9 w9Var = w9VarArr[1];
        org.telegram.ui.Components.w9 w9Var2 = w9VarArr[0];
        w9VarArr[1] = w9Var2;
        w9VarArr[0] = w9Var;
        w9Var2.setAlpha(1.0f);
        ynVar.f43578z2[1].setScaleX(1.0f);
        ynVar.f43578z2[1].setScaleY(1.0f);
        ynVar.f43578z2[1].setVisibility(4);
        ynVar.F2[0] = null;
        ynVar.f43566y2 = false;
    }
}

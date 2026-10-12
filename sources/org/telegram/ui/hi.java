package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hi extends AnimatorListenerAdapter {
    public final co f38429a;
    public final boolean f38430b;
    public final org.telegram.ui.ActionBar.h5 f38431c;
    public final boolean d;
    public final ai.q4 f38432e;
    public final boolean f38433f;
    public final eo h;

    public hi(eo eoVar, co coVar, boolean z10, org.telegram.ui.ActionBar.h5 h5Var, boolean z11, ai.q4 q4Var, boolean z12) {
        this.h = eoVar;
        this.f38429a = coVar;
        this.f38430b = z10;
        this.f38431c = h5Var;
        this.d = z11;
        this.f38432e = q4Var;
        this.f38433f = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        eo eoVar = this.h;
        if (eoVar.F2.getTag() != null) {
            eoVar.F2.setVisibility(4);
            int L8 = eoVar.L8();
            eoVar.F2.a(Math.min(L8 - 1, Math.max(1, L8 - eoVar.M4[0])), false);
        } else {
            eoVar.F2.setAlpha(1.0f);
        }
        eoVar.F2.setTranslationY(0.0f);
        eoVar.D2[0].setTranslationX(0.0f);
        eoVar.D2[1].setTranslationX(0.0f);
        eoVar.F2.setTranslationX(eoVar.G2 + 0.0f);
        co coVar = this.f38429a;
        coVar.setTranslationY(0.0f);
        boolean z10 = this.f38430b;
        if (!z10) {
            coVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.h5 h5Var = this.f38431c;
        if (!z10) {
            h5Var.setTranslationY(0.0f);
        }
        boolean z11 = this.d;
        ai.q4 q4Var = this.f38432e;
        if (!z11) {
            q4Var.setTranslationY(0.0f);
        }
        eoVar.C2[0].setTranslationX(0.0f);
        eoVar.C2[1].setTranslationX(0.0f);
        eoVar.B2[1].setAlpha(1.0f);
        eoVar.B2[1].setScaleX(1.0f);
        eoVar.B2[1].setScaleY(1.0f);
        eoVar.B2[0].setAlpha(1.0f);
        eoVar.B2[0].setScaleX(1.0f);
        eoVar.B2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.h5[] h5VarArr = eoVar.D2;
        org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[0];
        h5VarArr[1] = h5Var2;
        h5VarArr[0] = h5Var;
        h5Var2.setVisibility(4);
        ai.q4[] q4VarArr = eoVar.E2;
        ai.q4 q4Var2 = q4VarArr[0];
        q4VarArr[1] = q4Var2;
        q4VarArr[0] = q4Var;
        q4Var2.setVisibility(4);
        co[] coVarArr = eoVar.C2;
        co coVar2 = coVarArr[0];
        if (coVar != coVar2) {
            coVarArr[1] = coVar2;
            coVarArr[0] = coVar;
            coVar2.setVisibility(4);
        }
        if (this.f38433f) {
            eoVar.B2[1].setImageBitmap(null);
            eoVar.B2[1].setVisibility(4);
        }
        org.telegram.ui.Components.y9[] y9VarArr = eoVar.B2;
        org.telegram.ui.Components.y9 y9Var = y9VarArr[1];
        org.telegram.ui.Components.y9 y9Var2 = y9VarArr[0];
        y9VarArr[1] = y9Var2;
        y9VarArr[0] = y9Var;
        y9Var2.setAlpha(1.0f);
        eoVar.B2[1].setScaleX(1.0f);
        eoVar.B2[1].setScaleY(1.0f);
        eoVar.B2[1].setVisibility(4);
        eoVar.H2[0] = null;
        eoVar.A2 = false;
    }
}

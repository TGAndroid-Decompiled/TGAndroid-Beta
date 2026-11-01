package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fi extends AnimatorListenerAdapter {
    public final tn f37151a;
    public final boolean f37152b;
    public final org.telegram.ui.ActionBar.u5 f37153c;
    public final boolean d;
    public final jn e;
    public final boolean f37154f;
    public final un h;

    public fi(un unVar, tn tnVar, boolean z10, org.telegram.ui.ActionBar.u5 u5Var, boolean z11, jn jnVar, boolean z12) {
        this.h = unVar;
        this.f37151a = tnVar;
        this.f37152b = z10;
        this.f37153c = u5Var;
        this.d = z11;
        this.e = jnVar;
        this.f37154f = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        un unVar = this.h;
        if (unVar.T2.getTag() != null) {
            unVar.T2.setVisibility(4);
            int X8 = unVar.X8();
            unVar.T2.a(Math.min(X8 - 1, Math.max(1, X8 - unVar.Y4[0])), false);
        } else {
            unVar.T2.setAlpha(1.0f);
        }
        unVar.T2.setTranslationY(0.0f);
        unVar.R2[0].setTranslationX(0.0f);
        unVar.R2[1].setTranslationX(0.0f);
        unVar.T2.setTranslationX(unVar.U2 + 0.0f);
        tn tnVar = this.f37151a;
        tnVar.setTranslationY(0.0f);
        boolean z10 = this.f37152b;
        if (!z10) {
            tnVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.u5 u5Var = this.f37153c;
        if (!z10) {
            u5Var.setTranslationY(0.0f);
        }
        boolean z11 = this.d;
        jn jnVar = this.e;
        if (!z11) {
            jnVar.setTranslationY(0.0f);
        }
        unVar.Q2[0].setTranslationX(0.0f);
        unVar.Q2[1].setTranslationX(0.0f);
        unVar.P2[1].setAlpha(1.0f);
        unVar.P2[1].setScaleX(1.0f);
        unVar.P2[1].setScaleY(1.0f);
        unVar.P2[0].setAlpha(1.0f);
        unVar.P2[0].setScaleX(1.0f);
        unVar.P2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.u5[] u5VarArr = unVar.R2;
        org.telegram.ui.ActionBar.u5 u5Var2 = u5VarArr[0];
        u5VarArr[1] = u5Var2;
        u5VarArr[0] = u5Var;
        u5Var2.setVisibility(4);
        jn[] jnVarArr = unVar.S2;
        jn jnVar2 = jnVarArr[0];
        jnVarArr[1] = jnVar2;
        jnVarArr[0] = jnVar;
        jnVar2.setVisibility(4);
        tn[] tnVarArr = unVar.Q2;
        tn tnVar2 = tnVarArr[0];
        if (tnVar != tnVar2) {
            tnVarArr[1] = tnVar2;
            tnVarArr[0] = tnVar;
            tnVar2.setVisibility(4);
        }
        if (this.f37154f) {
            unVar.P2[1].setImageBitmap(null);
            unVar.P2[1].setVisibility(4);
        }
        org.telegram.ui.Components.g9[] g9VarArr = unVar.P2;
        org.telegram.ui.Components.g9 g9Var = g9VarArr[1];
        org.telegram.ui.Components.g9 g9Var2 = g9VarArr[0];
        g9VarArr[1] = g9Var2;
        g9VarArr[0] = g9Var;
        g9Var2.setAlpha(1.0f);
        unVar.P2[1].setScaleX(1.0f);
        unVar.P2[1].setScaleY(1.0f);
        unVar.P2[1].setVisibility(4);
        unVar.V2[0] = null;
        unVar.O2 = false;
    }
}

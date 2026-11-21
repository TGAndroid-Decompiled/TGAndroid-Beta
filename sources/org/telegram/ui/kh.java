package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class kh extends AnimatorListenerAdapter {
    public final an f49313a;
    public final boolean f49314b;
    public final org.telegram.ui.ActionBar.m5 f49315c;
    public final boolean d;
    public final qm f49316e;
    public final boolean f49317f;
    public final bn h;

    public kh(bn bnVar, an anVar, boolean z10, org.telegram.ui.ActionBar.m5 m5Var, boolean z11, qm qmVar, boolean z12) {
        this.h = bnVar;
        this.f49313a = anVar;
        this.f49314b = z10;
        this.f49315c = m5Var;
        this.d = z11;
        this.f49316e = qmVar;
        this.f49317f = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        bn bnVar = this.h;
        if (bnVar.U2.getTag() != null) {
            bnVar.U2.setVisibility(4);
            int c92 = bnVar.c9();
            bnVar.U2.a(Math.min(c92 - 1, Math.max(1, c92 - bnVar.f45951a5[0])), false);
        } else {
            bnVar.U2.setAlpha(1.0f);
        }
        bnVar.U2.setTranslationY(0.0f);
        bnVar.S2[0].setTranslationX(0.0f);
        bnVar.S2[1].setTranslationX(0.0f);
        bnVar.U2.setTranslationX(bnVar.V2 + 0.0f);
        an anVar = this.f49313a;
        anVar.setTranslationY(0.0f);
        boolean z10 = this.f49314b;
        if (!z10) {
            anVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.m5 m5Var = this.f49315c;
        if (!z10) {
            m5Var.setTranslationY(0.0f);
        }
        boolean z11 = this.d;
        qm qmVar = this.f49316e;
        if (!z11) {
            qmVar.setTranslationY(0.0f);
        }
        bnVar.R2[0].setTranslationX(0.0f);
        bnVar.R2[1].setTranslationX(0.0f);
        bnVar.Q2[1].setAlpha(1.0f);
        bnVar.Q2[1].setScaleX(1.0f);
        bnVar.Q2[1].setScaleY(1.0f);
        bnVar.Q2[0].setAlpha(1.0f);
        bnVar.Q2[0].setScaleX(1.0f);
        bnVar.Q2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.m5[] m5VarArr = bnVar.S2;
        org.telegram.ui.ActionBar.m5 m5Var2 = m5VarArr[0];
        m5VarArr[1] = m5Var2;
        m5VarArr[0] = m5Var;
        m5Var2.setVisibility(4);
        qm[] qmVarArr = bnVar.T2;
        qm qmVar2 = qmVarArr[0];
        qmVarArr[1] = qmVar2;
        qmVarArr[0] = qmVar;
        qmVar2.setVisibility(4);
        an[] anVarArr = bnVar.R2;
        an anVar2 = anVarArr[0];
        if (anVar != anVar2) {
            anVarArr[1] = anVar2;
            anVarArr[0] = anVar;
            anVar2.setVisibility(4);
        }
        if (this.f49317f) {
            bnVar.Q2[1].setImageBitmap(null);
            bnVar.Q2[1].setVisibility(4);
        }
        org.telegram.ui.Components.q9[] q9VarArr = bnVar.Q2;
        org.telegram.ui.Components.q9 q9Var = q9VarArr[1];
        org.telegram.ui.Components.q9 q9Var2 = q9VarArr[0];
        q9VarArr[1] = q9Var2;
        q9VarArr[0] = q9Var;
        q9Var2.setAlpha(1.0f);
        bnVar.Q2[1].setScaleX(1.0f);
        bnVar.Q2[1].setScaleY(1.0f);
        bnVar.Q2[1].setVisibility(4);
        bnVar.W2[0] = null;
        bnVar.P2 = false;
    }
}

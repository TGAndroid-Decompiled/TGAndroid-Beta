package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ai extends AnimatorListenerAdapter {
    public final vn f32170a;
    public final boolean f32171b;
    public final org.telegram.ui.ActionBar.h5 f32172c;
    public final boolean d;
    public final ai.p4 e;
    public final boolean f32173f;
    public final wn h;

    public ai(wn wnVar, vn vnVar, boolean z10, org.telegram.ui.ActionBar.h5 h5Var, boolean z11, ai.p4 p4Var, boolean z12) {
        this.h = wnVar;
        this.f32170a = vnVar;
        this.f32171b = z10;
        this.f32172c = h5Var;
        this.d = z11;
        this.e = p4Var;
        this.f32173f = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        wn wnVar = this.h;
        if (wnVar.F2.getTag() != null) {
            wnVar.F2.setVisibility(4);
            int G8 = wnVar.G8();
            wnVar.F2.a(Math.min(G8 - 1, Math.max(1, G8 - wnVar.M4[0])), false);
        } else {
            wnVar.F2.setAlpha(1.0f);
        }
        wnVar.F2.setTranslationY(0.0f);
        wnVar.D2[0].setTranslationX(0.0f);
        wnVar.D2[1].setTranslationX(0.0f);
        wnVar.F2.setTranslationX(wnVar.G2 + 0.0f);
        vn vnVar = this.f32170a;
        vnVar.setTranslationY(0.0f);
        boolean z10 = this.f32171b;
        if (!z10) {
            vnVar.setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.h5 h5Var = this.f32172c;
        if (!z10) {
            h5Var.setTranslationY(0.0f);
        }
        boolean z11 = this.d;
        ai.p4 p4Var = this.e;
        if (!z11) {
            p4Var.setTranslationY(0.0f);
        }
        wnVar.C2[0].setTranslationX(0.0f);
        wnVar.C2[1].setTranslationX(0.0f);
        wnVar.B2[1].setAlpha(1.0f);
        wnVar.B2[1].setScaleX(1.0f);
        wnVar.B2[1].setScaleY(1.0f);
        wnVar.B2[0].setAlpha(1.0f);
        wnVar.B2[0].setScaleX(1.0f);
        wnVar.B2[0].setScaleY(1.0f);
        org.telegram.ui.ActionBar.h5[] h5VarArr = wnVar.D2;
        org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[0];
        h5VarArr[1] = h5Var2;
        h5VarArr[0] = h5Var;
        h5Var2.setVisibility(4);
        ai.p4[] p4VarArr = wnVar.E2;
        ai.p4 p4Var2 = p4VarArr[0];
        p4VarArr[1] = p4Var2;
        p4VarArr[0] = p4Var;
        p4Var2.setVisibility(4);
        vn[] vnVarArr = wnVar.C2;
        vn vnVar2 = vnVarArr[0];
        if (vnVar != vnVar2) {
            vnVarArr[1] = vnVar2;
            vnVarArr[0] = vnVar;
            vnVar2.setVisibility(4);
        }
        if (this.f32173f) {
            wnVar.B2[1].setImageBitmap(null);
            wnVar.B2[1].setVisibility(4);
        }
        org.telegram.ui.Components.w9[] w9VarArr = wnVar.B2;
        org.telegram.ui.Components.w9 w9Var = w9VarArr[1];
        org.telegram.ui.Components.w9 w9Var2 = w9VarArr[0];
        w9VarArr[1] = w9Var2;
        w9VarArr[0] = w9Var;
        w9Var2.setAlpha(1.0f);
        wnVar.B2[1].setScaleX(1.0f);
        wnVar.B2[1].setScaleY(1.0f);
        wnVar.B2[1].setVisibility(4);
        wnVar.H2[0] = null;
        wnVar.A2 = false;
    }
}

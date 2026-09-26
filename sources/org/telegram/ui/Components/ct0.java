package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ct0 extends AnimatorListenerAdapter {
    public final int f23391a;
    public final jv0 f23392b;

    public ct0(jv0 jv0Var, int i10) {
        this.f23391a = i10;
        this.f23392b = jv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23391a) {
            case 0:
                this.f23392b.L0 = null;
                return;
            default:
                jv0 jv0Var = this.f23392b;
                org.telegram.ui.ActionBar.u0 u0Var = jv0Var.f25540n0;
                cu0[] cu0VarArr = jv0Var.f25535k0;
                jv0Var.f25526f1 = null;
                int i10 = 4;
                if (jv0Var.f25532i1) {
                    cu0VarArr[1].setVisibility(8);
                    if (u0Var != null && !jv0Var.D()) {
                        if (jv0Var.v0()) {
                            i10 = 8;
                        }
                        u0Var.setVisibility(i10);
                        jv0Var.f25542o0 = 0.0f;
                    } else {
                        jv0Var.f25542o0 = jv0Var.b0(0.0f);
                        jv0Var.s1(0.0f);
                    }
                    jv0Var.q1(false);
                    jv0Var.f25564x0 = 0;
                } else {
                    cu0 cu0Var = cu0VarArr[0];
                    cu0VarArr[0] = cu0VarArr[1];
                    cu0VarArr[1] = cu0Var;
                    cu0Var.setVisibility(8);
                    if (u0Var != null && jv0Var.f25564x0 == 2) {
                        if (jv0Var.v0()) {
                            i10 = 8;
                        }
                        u0Var.setVisibility(i10);
                    }
                    jv0Var.f25564x0 = 0;
                    jv0Var.Z0(1.0f, cu0VarArr[0].F);
                    jv0Var.L0();
                    jv0Var.f1();
                }
                jv0Var.f25528g1 = false;
                jv0Var.f25568y1 = false;
                jv0Var.f25565x1 = false;
                jv0Var.N0(false);
                jv0Var.G.setEnabled(true);
                jv0Var.I0.setEnabled(true);
                return;
        }
    }
}

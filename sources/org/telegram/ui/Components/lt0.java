package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class lt0 implements View.OnClickListener {
    public final int f26197a;
    public final org.telegram.ui.ActionBar.e1 f26198b;
    public final org.telegram.ui.ActionBar.e1 f26199c;
    public final nt0 d;

    public lt0(nt0 nt0Var, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2, int i10) {
        this.f26197a = i10;
        this.d = nt0Var;
        this.f26198b = e1Var;
        this.f26199c = e1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26197a) {
            case 0:
                jv0 jv0Var = this.d.d;
                if (!jv0Var.H1) {
                    org.telegram.ui.ActionBar.e1 e1Var = this.f26198b;
                    boolean z10 = e1Var.getCheckView().f27168a.f22195q;
                    org.telegram.ui.ActionBar.e1 e1Var2 = this.f26199c;
                    if (!z10 && e1Var2.getCheckView().f27168a.f22195q) {
                        float f7 = -jv0Var.f25554s1;
                        jv0Var.f25554s1 = f7;
                        AndroidUtilities.shakeViewSpring(e1Var2, f7);
                        return;
                    }
                    e1Var2.setChecked(!e1Var2.getCheckView().f27168a.f22195q);
                    if (e1Var2.getCheckView().f27168a.f22195q && e1Var.getCheckView().f27168a.f22195q) {
                        jv0Var.f25556t1[0].f30706q = 0;
                    } else {
                        jv0Var.f25556t1[0].f30706q = 2;
                    }
                    jv0.s(jv0Var);
                    return;
                }
                return;
            default:
                jv0 jv0Var2 = this.d.d;
                if (!jv0Var2.H1) {
                    org.telegram.ui.ActionBar.e1 e1Var3 = this.f26198b;
                    boolean z11 = e1Var3.getCheckView().f27168a.f22195q;
                    org.telegram.ui.ActionBar.e1 e1Var4 = this.f26199c;
                    if (!z11 && e1Var4.getCheckView().f27168a.f22195q) {
                        float f10 = -jv0Var2.f25554s1;
                        jv0Var2.f25554s1 = f10;
                        AndroidUtilities.shakeViewSpring(e1Var4, f10);
                        return;
                    }
                    e1Var4.setChecked(!e1Var4.getCheckView().f27168a.f22195q);
                    if (e1Var3.getCheckView().f27168a.f22195q && e1Var4.getCheckView().f27168a.f22195q) {
                        jv0Var2.f25556t1[0].f30706q = 0;
                    } else {
                        jv0Var2.f25556t1[0].f30706q = 1;
                    }
                    jv0.s(jv0Var2);
                    return;
                }
                return;
        }
    }
}

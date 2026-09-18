package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class bt0 implements View.OnClickListener {
    public final int f22803a;
    public final org.telegram.ui.ActionBar.g1 f22804b;
    public final org.telegram.ui.ActionBar.g1 f22805c;
    public final dt0 d;

    public bt0(dt0 dt0Var, org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2, int i10) {
        this.f22803a = i10;
        this.d = dt0Var;
        this.f22804b = g1Var;
        this.f22805c = g1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22803a) {
            case 0:
                zu0 zu0Var = this.d.d;
                if (!zu0Var.H1) {
                    org.telegram.ui.ActionBar.g1 g1Var = this.f22804b;
                    boolean z10 = g1Var.getCheckView().f26511a.f21985q;
                    org.telegram.ui.ActionBar.g1 g1Var2 = this.f22805c;
                    if (!z10 && g1Var2.getCheckView().f26511a.f21985q) {
                        float f7 = -zu0Var.f30653s1;
                        zu0Var.f30653s1 = f7;
                        AndroidUtilities.shakeViewSpring(g1Var2, f7);
                        return;
                    }
                    g1Var2.setChecked(!g1Var2.getCheckView().f26511a.f21985q);
                    if (g1Var2.getCheckView().f26511a.f21985q && g1Var.getCheckView().f26511a.f21985q) {
                        zu0Var.f30655t1[0].f26865q = 0;
                    } else {
                        zu0Var.f30655t1[0].f26865q = 2;
                    }
                    zu0.s(zu0Var);
                    return;
                }
                return;
            default:
                zu0 zu0Var2 = this.d.d;
                if (!zu0Var2.H1) {
                    org.telegram.ui.ActionBar.g1 g1Var3 = this.f22804b;
                    boolean z11 = g1Var3.getCheckView().f26511a.f21985q;
                    org.telegram.ui.ActionBar.g1 g1Var4 = this.f22805c;
                    if (!z11 && g1Var4.getCheckView().f26511a.f21985q) {
                        float f10 = -zu0Var2.f30653s1;
                        zu0Var2.f30653s1 = f10;
                        AndroidUtilities.shakeViewSpring(g1Var4, f10);
                        return;
                    }
                    g1Var4.setChecked(!g1Var4.getCheckView().f26511a.f21985q);
                    if (g1Var3.getCheckView().f26511a.f21985q && g1Var4.getCheckView().f26511a.f21985q) {
                        zu0Var2.f30655t1[0].f26865q = 0;
                    } else {
                        zu0Var2.f30655t1[0].f26865q = 1;
                    }
                    zu0.s(zu0Var2);
                    return;
                }
                return;
        }
    }
}

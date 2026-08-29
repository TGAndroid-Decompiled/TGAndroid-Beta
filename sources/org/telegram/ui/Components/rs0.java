package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class rs0 implements View.OnClickListener {
    public final int f32377a;
    public final org.telegram.ui.ActionBar.g1 f32378b;
    public final org.telegram.ui.ActionBar.g1 f32379c;
    public final ts0 d;

    public rs0(ts0 ts0Var, org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2, int i10) {
        this.f32377a = i10;
        this.d = ts0Var;
        this.f32378b = g1Var;
        this.f32379c = g1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32377a) {
            case 0:
                qu0 qu0Var = this.d.d;
                if (!qu0Var.D1) {
                    org.telegram.ui.ActionBar.g1 g1Var = this.f32378b;
                    boolean z10 = g1Var.getCheckView().f29211a.f26324q;
                    org.telegram.ui.ActionBar.g1 g1Var2 = this.f32379c;
                    if (!z10 && g1Var2.getCheckView().f29211a.f26324q) {
                        float f9 = -qu0Var.f32086o1;
                        qu0Var.f32086o1 = f9;
                        AndroidUtilities.shakeViewSpring(g1Var2, f9);
                        return;
                    }
                    g1Var2.setChecked(!g1Var2.getCheckView().f29211a.f26324q);
                    if (g1Var2.getCheckView().f29211a.f26324q && g1Var.getCheckView().f29211a.f26324q) {
                        qu0Var.f32088p1[0].f28548q = 0;
                    } else {
                        qu0Var.f32088p1[0].f28548q = 2;
                    }
                    qu0.s(qu0Var);
                    return;
                }
                return;
            default:
                qu0 qu0Var2 = this.d.d;
                if (!qu0Var2.D1) {
                    org.telegram.ui.ActionBar.g1 g1Var3 = this.f32378b;
                    boolean z11 = g1Var3.getCheckView().f29211a.f26324q;
                    org.telegram.ui.ActionBar.g1 g1Var4 = this.f32379c;
                    if (!z11 && g1Var4.getCheckView().f29211a.f26324q) {
                        float f10 = -qu0Var2.f32086o1;
                        qu0Var2.f32086o1 = f10;
                        AndroidUtilities.shakeViewSpring(g1Var4, f10);
                        return;
                    }
                    g1Var4.setChecked(!g1Var4.getCheckView().f29211a.f26324q);
                    if (g1Var3.getCheckView().f29211a.f26324q && g1Var4.getCheckView().f29211a.f26324q) {
                        qu0Var2.f32088p1[0].f28548q = 0;
                    } else {
                        qu0Var2.f32088p1[0].f28548q = 1;
                    }
                    qu0.s(qu0Var2);
                    return;
                }
                return;
        }
    }
}

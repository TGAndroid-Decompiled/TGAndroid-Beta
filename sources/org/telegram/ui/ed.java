package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
public final class ed implements View.OnFocusChangeListener {
    public final int f44965a;
    public final Object f44966b;

    public ed(Object obj, int i3) {
        this.f44965a = i3;
        this.f44966b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        int i3 = this.f44965a;
        float f10 = 0.0f;
        Object obj = this.f44966b;
        switch (i3) {
            case 0:
                ci.r rVar = ((xd) obj).L0;
                if (z10) {
                    f10 = 1.0f;
                }
                rVar.b(f10, f10, true);
                return;
            case 1:
                uw uwVar = (uw) obj;
                if (z10) {
                    uwVar.Z.b(true);
                    return;
                }
                return;
            case 2:
                xd0 xd0Var = ((lb0) obj).f47284a0;
                if (z10) {
                    xd0Var.f51950c.setEditText((EditText) view);
                    xd0Var.f51950c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.gb0 gb0Var = (org.telegram.ui.Components.gb0) obj;
                if (z10) {
                    f10 = 1.0f;
                }
                gb0Var.b(f10, f10, true);
                return;
            case 4:
                org.telegram.ui.Components.gb0 gb0Var2 = ((vb0) obj).f50451y;
                if (z10) {
                    f10 = 1.0f;
                }
                gb0Var2.b(f10, f10, true);
                return;
            case 5:
                org.telegram.ui.Components.gb0 gb0Var3 = ((cc0) obj).f44297b;
                if (z10) {
                    f10 = 1.0f;
                }
                gb0Var3.b(f10, f10, true);
                return;
            case 6:
                xd0 xd0Var2 = ((fc0) obj).E;
                if (z10) {
                    xd0Var2.f51950c.setEditText((EditText) view);
                    xd0Var2.f51950c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.gb0 gb0Var4 = ((qc0) obj).f48849a;
                if (z10) {
                    f10 = 1.0f;
                }
                gb0Var4.b(f10, f10, true);
                return;
            case 8:
                xd0 xd0Var3 = ((dd0) obj).f44663v0;
                if (z10) {
                    xd0Var3.f51950c.setEditText((EditText) view);
                    xd0Var3.f51950c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.gb0 gb0Var5 = ((wd0) obj).f50787e;
                if (z10) {
                    f10 = 1.0f;
                }
                gb0Var5.b(f10, f10, true);
                return;
            case 10:
                org.telegram.ui.Components.gb0 gb0Var6 = ((PasscodeActivity) obj).f41358f;
                if (z10) {
                    f10 = 1.0f;
                }
                gb0Var6.b(f10, f10, true);
                return;
            case 11:
                o71 o71Var = (o71) obj;
                if (z10) {
                    o71Var.d.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131744194, null)));
                    return;
                } else {
                    o71Var.d.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131744195, null)));
                    return;
                }
            default:
                org.telegram.ui.Components.gb0 gb0Var7 = ((TwoStepVerificationActivity) obj).f42094w;
                if (z10) {
                    f10 = 1.0f;
                }
                gb0Var7.b(f10, f10, true);
                return;
        }
    }
}

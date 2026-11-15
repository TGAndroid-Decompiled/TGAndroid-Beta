package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
public final class ed implements View.OnFocusChangeListener {
    public final int f46718a;
    public final Object f46719b;

    public ed(Object obj, int i7) {
        this.f46718a = i7;
        this.f46719b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        int i7 = this.f46718a;
        float f10 = 0.0f;
        Object obj = this.f46719b;
        switch (i7) {
            case 0:
                di.p pVar = ((xd) obj).L0;
                if (z10) {
                    f10 = 1.0f;
                }
                pVar.b(f10, f10, true);
                return;
            case 1:
                yw ywVar = (yw) obj;
                if (z10) {
                    ywVar.Z.b(true);
                    return;
                }
                return;
            case 2:
                ce0 ce0Var = ((ob0) obj).f49881a0;
                if (z10) {
                    ce0Var.f46078c.setEditText((EditText) view);
                    ce0Var.f46078c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.mb0 mb0Var = (org.telegram.ui.Components.mb0) obj;
                if (z10) {
                    f10 = 1.0f;
                }
                mb0Var.b(f10, f10, true);
                return;
            case 4:
                org.telegram.ui.Components.mb0 mb0Var2 = ((wb0) obj).f52540y;
                if (z10) {
                    f10 = 1.0f;
                }
                mb0Var2.b(f10, f10, true);
                return;
            case 5:
                org.telegram.ui.Components.mb0 mb0Var3 = ((dc0) obj).f46328b;
                if (z10) {
                    f10 = 1.0f;
                }
                mb0Var3.b(f10, f10, true);
                return;
            case 6:
                ce0 ce0Var2 = ((gc0) obj).E;
                if (z10) {
                    ce0Var2.f46078c.setEditText((EditText) view);
                    ce0Var2.f46078c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.mb0 mb0Var4 = ((rc0) obj).f50907a;
                if (z10) {
                    f10 = 1.0f;
                }
                mb0Var4.b(f10, f10, true);
                return;
            case 8:
                ce0 ce0Var3 = ((ed0) obj).f46749v0;
                if (z10) {
                    ce0Var3.f46078c.setEditText((EditText) view);
                    ce0Var3.f46078c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.mb0 mb0Var5 = ((be0) obj).f45688e;
                if (z10) {
                    f10 = 1.0f;
                }
                mb0Var5.b(f10, f10, true);
                return;
            case 10:
                org.telegram.ui.Components.mb0 mb0Var6 = ((PasscodeActivity) obj).f42697f;
                if (z10) {
                    f10 = 1.0f;
                }
                mb0Var6.b(f10, f10, true);
                return;
            case 11:
                w71 w71Var = (w71) obj;
                if (z10) {
                    w71Var.d.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131744184, null)));
                    return;
                } else {
                    w71Var.d.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131744185, null)));
                    return;
                }
            default:
                org.telegram.ui.Components.mb0 mb0Var7 = ((TwoStepVerificationActivity) obj).f43437w;
                if (z10) {
                    f10 = 1.0f;
                }
                mb0Var7.b(f10, f10, true);
                return;
        }
    }
}

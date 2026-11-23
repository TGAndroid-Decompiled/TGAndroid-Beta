package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
public final class ed implements View.OnFocusChangeListener {
    public final int f47214a;
    public final Object f47215b;

    public ed(Object obj, int i7) {
        this.f47214a = i7;
        this.f47215b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        int i7 = this.f47214a;
        float f10 = 0.0f;
        Object obj = this.f47215b;
        switch (i7) {
            case 0:
                di.p pVar = ((xd) obj).L0;
                if (z10) {
                    f10 = 1.0f;
                }
                pVar.b(f10, f10, true);
                return;
            case 1:
                cx cxVar = (cx) obj;
                if (z10) {
                    cxVar.Z.b(true);
                    return;
                }
                return;
            case 2:
                de0 de0Var = ((pb0) obj).f50807a0;
                if (z10) {
                    de0Var.f46890c.setEditText((EditText) view);
                    de0Var.f46890c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.yb0 yb0Var = (org.telegram.ui.Components.yb0) obj;
                if (z10) {
                    f10 = 1.0f;
                }
                yb0Var.b(f10, f10, true);
                return;
            case 4:
                org.telegram.ui.Components.yb0 yb0Var2 = ((xb0) obj).f53743y;
                if (z10) {
                    f10 = 1.0f;
                }
                yb0Var2.b(f10, f10, true);
                return;
            case 5:
                org.telegram.ui.Components.yb0 yb0Var3 = ((ec0) obj).f47203b;
                if (z10) {
                    f10 = 1.0f;
                }
                yb0Var3.b(f10, f10, true);
                return;
            case 6:
                de0 de0Var2 = ((hc0) obj).E;
                if (z10) {
                    de0Var2.f46890c.setEditText((EditText) view);
                    de0Var2.f46890c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.yb0 yb0Var4 = ((sc0) obj).f51978a;
                if (z10) {
                    f10 = 1.0f;
                }
                yb0Var4.b(f10, f10, true);
                return;
            case 8:
                de0 de0Var3 = ((gd0) obj).f48028v0;
                if (z10) {
                    de0Var3.f46890c.setEditText((EditText) view);
                    de0Var3.f46890c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.yb0 yb0Var5 = ((ce0) obj).f46523e;
                if (z10) {
                    f10 = 1.0f;
                }
                yb0Var5.b(f10, f10, true);
                return;
            case 10:
                org.telegram.ui.Components.yb0 yb0Var6 = ((PasscodeActivity) obj).f43152f;
                if (z10) {
                    f10 = 1.0f;
                }
                yb0Var6.b(f10, f10, true);
                return;
            case 11:
                a81 a81Var = (a81) obj;
                if (z10) {
                    a81Var.d.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131743943, null)));
                    return;
                } else {
                    a81Var.d.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131743944, null)));
                    return;
                }
            default:
                org.telegram.ui.Components.yb0 yb0Var7 = ((TwoStepVerificationActivity) obj).f43893w;
                if (z10) {
                    f10 = 1.0f;
                }
                yb0Var7.b(f10, f10, true);
                return;
        }
    }
}

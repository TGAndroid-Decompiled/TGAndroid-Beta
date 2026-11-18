package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
public final class ed implements View.OnFocusChangeListener {
    public final int f47172a;
    public final Object f47173b;

    public ed(Object obj, int i7) {
        this.f47172a = i7;
        this.f47173b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        int i7 = this.f47172a;
        float f10 = 0.0f;
        Object obj = this.f47173b;
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
                ee0 ee0Var = ((pb0) obj).f50789a0;
                if (z10) {
                    ee0Var.f47181c.setEditText((EditText) view);
                    ee0Var.f47181c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.xb0 xb0Var = (org.telegram.ui.Components.xb0) obj;
                if (z10) {
                    f10 = 1.0f;
                }
                xb0Var.b(f10, f10, true);
                return;
            case 4:
                org.telegram.ui.Components.xb0 xb0Var2 = ((xb0) obj).f53776y;
                if (z10) {
                    f10 = 1.0f;
                }
                xb0Var2.b(f10, f10, true);
                return;
            case 5:
                org.telegram.ui.Components.xb0 xb0Var3 = ((ec0) obj).f47161b;
                if (z10) {
                    f10 = 1.0f;
                }
                xb0Var3.b(f10, f10, true);
                return;
            case 6:
                ee0 ee0Var2 = ((hc0) obj).E;
                if (z10) {
                    ee0Var2.f47181c.setEditText((EditText) view);
                    ee0Var2.f47181c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.xb0 xb0Var4 = ((sc0) obj).f51965a;
                if (z10) {
                    f10 = 1.0f;
                }
                xb0Var4.b(f10, f10, true);
                return;
            case 8:
                ee0 ee0Var3 = ((hd0) obj).f48331v0;
                if (z10) {
                    ee0Var3.f47181c.setEditText((EditText) view);
                    ee0Var3.f47181c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.xb0 xb0Var5 = ((de0) obj).f46873e;
                if (z10) {
                    f10 = 1.0f;
                }
                xb0Var5.b(f10, f10, true);
                return;
            case 10:
                org.telegram.ui.Components.xb0 xb0Var6 = ((PasscodeActivity) obj).f43142f;
                if (z10) {
                    f10 = 1.0f;
                }
                xb0Var6.b(f10, f10, true);
                return;
            case 11:
                a81 a81Var = (a81) obj;
                if (z10) {
                    a81Var.d.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131743949, null)));
                    return;
                } else {
                    a81Var.d.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131743950, null)));
                    return;
                }
            default:
                org.telegram.ui.Components.xb0 xb0Var7 = ((TwoStepVerificationActivity) obj).f43883w;
                if (z10) {
                    f10 = 1.0f;
                }
                xb0Var7.b(f10, f10, true);
                return;
        }
    }
}

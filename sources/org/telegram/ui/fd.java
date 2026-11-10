package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
public final class fd implements View.OnFocusChangeListener {
    public final int f45685a;
    public final Object f45686b;

    public fd(Object obj, int i7) {
        this.f45685a = i7;
        this.f45686b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z9) {
        int i7 = this.f45685a;
        float f10 = 0.0f;
        Object obj = this.f45686b;
        switch (i7) {
            case 0:
                bi.u uVar = ((zd) obj).K0;
                if (z9) {
                    f10 = 1.0f;
                }
                uVar.b(f10, f10, true);
                return;
            case 1:
                zw zwVar = (zw) obj;
                if (z9) {
                    zwVar.Y.b(true);
                    return;
                }
                return;
            case 2:
                fe0 fe0Var = ((rb0) obj).W;
                if (z9) {
                    fe0Var.f45696c.setEditText((EditText) view);
                    fe0Var.f45696c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.lb0 lb0Var = (org.telegram.ui.Components.lb0) obj;
                if (z9) {
                    f10 = 1.0f;
                }
                lb0Var.b(f10, f10, true);
                return;
            case 4:
                org.telegram.ui.Components.lb0 lb0Var2 = ((ac0) obj).f43644y;
                if (z9) {
                    f10 = 1.0f;
                }
                lb0Var2.b(f10, f10, true);
                return;
            case 5:
                org.telegram.ui.Components.lb0 lb0Var3 = ((hc0) obj).f46308b;
                if (z9) {
                    f10 = 1.0f;
                }
                lb0Var3.b(f10, f10, true);
                return;
            case 6:
                fe0 fe0Var2 = ((kc0) obj).D;
                if (z9) {
                    fe0Var2.f45696c.setEditText((EditText) view);
                    fe0Var2.f45696c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.lb0 lb0Var4 = ((wc0) obj).f50980a;
                if (z9) {
                    f10 = 1.0f;
                }
                lb0Var4.b(f10, f10, true);
                return;
            case 8:
                fe0 fe0Var3 = ((jd0) obj).f46985u0;
                if (z9) {
                    fe0Var3.f45696c.setEditText((EditText) view);
                    fe0Var3.f45696c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.lb0 lb0Var5 = ((ee0) obj).f45251e;
                if (z9) {
                    f10 = 1.0f;
                }
                lb0Var5.b(f10, f10, true);
                return;
            case 10:
                org.telegram.ui.Components.lb0 lb0Var6 = ((PasscodeActivity) obj).f41327f;
                if (z9) {
                    f10 = 1.0f;
                }
                lb0Var6.b(f10, f10, true);
                return;
            case 11:
                a81 a81Var = (a81) obj;
                if (z9) {
                    a81Var.d.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131744184, null)));
                    return;
                } else {
                    a81Var.d.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131744185, null)));
                    return;
                }
            default:
                org.telegram.ui.Components.lb0 lb0Var7 = ((TwoStepVerificationActivity) obj).f42061w;
                if (z9) {
                    f10 = 1.0f;
                }
                lb0Var7.b(f10, f10, true);
                return;
        }
    }
}

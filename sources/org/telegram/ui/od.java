package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
public final class od implements View.OnFocusChangeListener {
    public final int f40135a;
    public final Object f40136b;

    public od(Object obj, int i10) {
        this.f40135a = i10;
        this.f40136b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        int i10 = this.f40135a;
        float f7 = 0.0f;
        Object obj = this.f40136b;
        switch (i10) {
            case 0:
                yd ydVar = ((le) obj).K0;
                if (z10) {
                    f7 = 1.0f;
                }
                ydVar.b(f7, f7, true);
                return;
            case 1:
                zx zxVar = (zx) obj;
                if (z10) {
                    zxVar.Y.b(true);
                    return;
                }
                return;
            case 2:
                gf0 gf0Var = ((vc0) obj).W;
                if (z10) {
                    gf0Var.f37475c.setEditText((EditText) view);
                    gf0Var.f37475c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.ec0 ec0Var = (org.telegram.ui.Components.ec0) obj;
                if (z10) {
                    f7 = 1.0f;
                }
                ec0Var.b(f7, f7, true);
                return;
            case 4:
                org.telegram.ui.Components.ec0 ec0Var2 = ((dd0) obj).f36570y;
                if (z10) {
                    f7 = 1.0f;
                }
                ec0Var2.b(f7, f7, true);
                return;
            case 5:
                org.telegram.ui.Components.ec0 ec0Var3 = ((kd0) obj).f38842b;
                if (z10) {
                    f7 = 1.0f;
                }
                ec0Var3.b(f7, f7, true);
                return;
            case 6:
                gf0 gf0Var2 = ((nd0) obj).D;
                if (z10) {
                    gf0Var2.f37475c.setEditText((EditText) view);
                    gf0Var2.f37475c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.ec0 ec0Var4 = ((yd0) obj).f43640a;
                if (z10) {
                    f7 = 1.0f;
                }
                ec0Var4.b(f7, f7, true);
                return;
            case 8:
                gf0 gf0Var3 = ((le0) obj).f39259u0;
                if (z10) {
                    gf0Var3.f37475c.setEditText((EditText) view);
                    gf0Var3.f37475c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.ec0 ec0Var5 = ((ff0) obj).e;
                if (z10) {
                    f7 = 1.0f;
                }
                ec0Var5.b(f7, f7, true);
                return;
            case 10:
                org.telegram.ui.Components.ec0 ec0Var6 = ((PasscodeActivity) obj).f33427f;
                if (z10) {
                    f7 = 1.0f;
                }
                ec0Var6.b(f7, f7, true);
                return;
            case 11:
                n91 n91Var = (n91) obj;
                if (z10) {
                    n91Var.d.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(2131744209, null)));
                    return;
                } else {
                    n91Var.d.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(2131744210, null)));
                    return;
                }
            default:
                org.telegram.ui.Components.ec0 ec0Var7 = ((TwoStepVerificationActivity) obj).f34143w;
                if (z10) {
                    f7 = 1.0f;
                }
                ec0Var7.b(f7, f7, true);
                return;
        }
    }
}

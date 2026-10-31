package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
public final class od implements View.OnFocusChangeListener {
    public final int f40230a;
    public final Object f40231b;

    public od(Object obj, int i10) {
        this.f40230a = i10;
        this.f40231b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        int i10 = this.f40230a;
        float f7 = 0.0f;
        Object obj = this.f40231b;
        switch (i10) {
            case 0:
                yd ydVar = ((le) obj).K0;
                if (z10) {
                    f7 = 1.0f;
                }
                ydVar.b(f7, f7, true);
                return;
            case 1:
                ay ayVar = (ay) obj;
                if (z10) {
                    ayVar.Y.b(true);
                    return;
                }
                return;
            case 2:
                hf0 hf0Var = ((wc0) obj).W;
                if (z10) {
                    hf0Var.f37922c.setEditText((EditText) view);
                    hf0Var.f37922c.setDispatchBackWhenEmpty(true);
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
                org.telegram.ui.Components.ec0 ec0Var2 = ((ed0) obj).f37032y;
                if (z10) {
                    f7 = 1.0f;
                }
                ec0Var2.b(f7, f7, true);
                return;
            case 5:
                org.telegram.ui.Components.ec0 ec0Var3 = ((ld0) obj).f39178b;
                if (z10) {
                    f7 = 1.0f;
                }
                ec0Var3.b(f7, f7, true);
                return;
            case 6:
                hf0 hf0Var2 = ((od0) obj).D;
                if (z10) {
                    hf0Var2.f37922c.setEditText((EditText) view);
                    hf0Var2.f37922c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.ec0 ec0Var4 = ((zd0) obj).f44126a;
                if (z10) {
                    f7 = 1.0f;
                }
                ec0Var4.b(f7, f7, true);
                return;
            case 8:
                hf0 hf0Var3 = ((me0) obj).f39682u0;
                if (z10) {
                    hf0Var3.f37922c.setEditText((EditText) view);
                    hf0Var3.f37922c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.ec0 ec0Var5 = ((gf0) obj).e;
                if (z10) {
                    f7 = 1.0f;
                }
                ec0Var5.b(f7, f7, true);
                return;
            case 10:
                org.telegram.ui.Components.ec0 ec0Var6 = ((PasscodeActivity) obj).f33420f;
                if (z10) {
                    f7 = 1.0f;
                }
                ec0Var6.b(f7, f7, true);
                return;
            case 11:
                p91 p91Var = (p91) obj;
                if (z10) {
                    p91Var.d.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131744209, null)));
                    return;
                } else {
                    p91Var.d.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131744210, null)));
                    return;
                }
            default:
                org.telegram.ui.Components.ec0 ec0Var7 = ((TwoStepVerificationActivity) obj).f34136w;
                if (z10) {
                    f7 = 1.0f;
                }
                ec0Var7.b(f7, f7, true);
                return;
        }
    }
}

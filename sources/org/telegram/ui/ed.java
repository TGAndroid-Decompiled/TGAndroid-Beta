package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
public final class ed implements View.OnFocusChangeListener {
    public final int f47506a;
    public final Object f47507b;

    public ed(Object obj, int i7) {
        this.f47506a = i7;
        this.f47507b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        int i7 = this.f47506a;
        float f10 = 0.0f;
        Object obj = this.f47507b;
        switch (i7) {
            case 0:
                di.p pVar = ((xd) obj).L0;
                if (z10) {
                    f10 = 1.0f;
                }
                pVar.b(f10, f10, true);
                return;
            case 1:
                bx bxVar = (bx) obj;
                if (z10) {
                    bxVar.Z.b(true);
                    return;
                }
                return;
            case 2:
                de0 de0Var = ((ob0) obj).f50621a0;
                if (z10) {
                    de0Var.f47053c.setEditText((EditText) view);
                    de0Var.f47053c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.vb0 vb0Var = (org.telegram.ui.Components.vb0) obj;
                if (z10) {
                    f10 = 1.0f;
                }
                vb0Var.b(f10, f10, true);
                return;
            case 4:
                org.telegram.ui.Components.vb0 vb0Var2 = ((wb0) obj).f53288y;
                if (z10) {
                    f10 = 1.0f;
                }
                vb0Var2.b(f10, f10, true);
                return;
            case 5:
                org.telegram.ui.Components.vb0 vb0Var3 = ((dc0) obj).f47030b;
                if (z10) {
                    f10 = 1.0f;
                }
                vb0Var3.b(f10, f10, true);
                return;
            case 6:
                de0 de0Var2 = ((gc0) obj).E;
                if (z10) {
                    de0Var2.f47053c.setEditText((EditText) view);
                    de0Var2.f47053c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.vb0 vb0Var4 = ((rc0) obj).f51691a;
                if (z10) {
                    f10 = 1.0f;
                }
                vb0Var4.b(f10, f10, true);
                return;
            case 8:
                de0 de0Var3 = ((gd0) obj).f48275v0;
                if (z10) {
                    de0Var3.f47053c.setEditText((EditText) view);
                    de0Var3.f47053c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.vb0 vb0Var5 = ((ce0) obj).f46776e;
                if (z10) {
                    f10 = 1.0f;
                }
                vb0Var5.b(f10, f10, true);
                return;
            case 10:
                org.telegram.ui.Components.vb0 vb0Var6 = ((PasscodeActivity) obj).f43262f;
                if (z10) {
                    f10 = 1.0f;
                }
                vb0Var6.b(f10, f10, true);
                return;
            case 11:
                y71 y71Var = (y71) obj;
                if (z10) {
                    y71Var.d.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131743939, null)));
                    return;
                } else {
                    y71Var.d.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131743940, null)));
                    return;
                }
            default:
                org.telegram.ui.Components.vb0 vb0Var7 = ((TwoStepVerificationActivity) obj).f44009w;
                if (z10) {
                    f10 = 1.0f;
                }
                vb0Var7.b(f10, f10, true);
                return;
        }
    }
}

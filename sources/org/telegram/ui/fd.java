package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
public final class fd implements View.OnFocusChangeListener {
    public final int f45688a;
    public final Object f45689b;

    public fd(Object obj, int i7) {
        this.f45688a = i7;
        this.f45689b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z9) {
        int i7 = this.f45688a;
        float f10 = 0.0f;
        Object obj = this.f45689b;
        switch (i7) {
            case 0:
                bi.u uVar = ((zd) obj).K0;
                if (z9) {
                    f10 = 1.0f;
                }
                uVar.b(f10, f10, true);
                return;
            case 1:
                yw ywVar = (yw) obj;
                if (z9) {
                    ywVar.Y.b(true);
                    return;
                }
                return;
            case 2:
                ee0 ee0Var = ((qb0) obj).W;
                if (z9) {
                    ee0Var.f45372c.setEditText((EditText) view);
                    ee0Var.f45372c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.mb0 mb0Var = (org.telegram.ui.Components.mb0) obj;
                if (z9) {
                    f10 = 1.0f;
                }
                mb0Var.b(f10, f10, true);
                return;
            case 4:
                org.telegram.ui.Components.mb0 mb0Var2 = ((zb0) obj).f52494y;
                if (z9) {
                    f10 = 1.0f;
                }
                mb0Var2.b(f10, f10, true);
                return;
            case 5:
                org.telegram.ui.Components.mb0 mb0Var3 = ((gc0) obj).f45964b;
                if (z9) {
                    f10 = 1.0f;
                }
                mb0Var3.b(f10, f10, true);
                return;
            case 6:
                ee0 ee0Var2 = ((jc0) obj).D;
                if (z9) {
                    ee0Var2.f45372c.setEditText((EditText) view);
                    ee0Var2.f45372c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.mb0 mb0Var4 = ((uc0) obj).f50365a;
                if (z9) {
                    f10 = 1.0f;
                }
                mb0Var4.b(f10, f10, true);
                return;
            case 8:
                ee0 ee0Var3 = ((id0) obj).f46649u0;
                if (z9) {
                    ee0Var3.f45372c.setEditText((EditText) view);
                    ee0Var3.f45372c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.mb0 mb0Var5 = ((de0) obj).f44931e;
                if (z9) {
                    f10 = 1.0f;
                }
                mb0Var5.b(f10, f10, true);
                return;
            case 10:
                org.telegram.ui.Components.mb0 mb0Var6 = ((PasscodeActivity) obj).f41336f;
                if (z9) {
                    f10 = 1.0f;
                }
                mb0Var6.b(f10, f10, true);
                return;
            case 11:
                z71 z71Var = (z71) obj;
                if (z9) {
                    z71Var.d.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131744184, null)));
                    return;
                } else {
                    z71Var.d.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131744185, null)));
                    return;
                }
            default:
                org.telegram.ui.Components.mb0 mb0Var7 = ((TwoStepVerificationActivity) obj).f42070w;
                if (z9) {
                    f10 = 1.0f;
                }
                mb0Var7.b(f10, f10, true);
                return;
        }
    }
}

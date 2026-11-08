package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
public final class fd implements View.OnFocusChangeListener {
    public final int f45586a;
    public final Object f45587b;

    public fd(Object obj, int i7) {
        this.f45586a = i7;
        this.f45587b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z9) {
        int i7 = this.f45586a;
        float f10 = 0.0f;
        Object obj = this.f45587b;
        switch (i7) {
            case 0:
                bi.u uVar = ((zd) obj).K0;
                if (z9) {
                    f10 = 1.0f;
                }
                uVar.b(f10, f10, true);
                return;
            case 1:
                ww wwVar = (ww) obj;
                if (z9) {
                    wwVar.Y.b(true);
                    return;
                }
                return;
            case 2:
                ce0 ce0Var = ((ob0) obj).W;
                if (z9) {
                    ce0Var.f44765c.setEditText((EditText) view);
                    ce0Var.f44765c.setDispatchBackWhenEmpty(true);
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
                org.telegram.ui.Components.lb0 lb0Var2 = ((xb0) obj).f51822y;
                if (z9) {
                    f10 = 1.0f;
                }
                lb0Var2.b(f10, f10, true);
                return;
            case 5:
                org.telegram.ui.Components.lb0 lb0Var3 = ((ec0) obj).f45264b;
                if (z9) {
                    f10 = 1.0f;
                }
                lb0Var3.b(f10, f10, true);
                return;
            case 6:
                ce0 ce0Var2 = ((hc0) obj).D;
                if (z9) {
                    ce0Var2.f44765c.setEditText((EditText) view);
                    ce0Var2.f44765c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.lb0 lb0Var4 = ((sc0) obj).f49720a;
                if (z9) {
                    f10 = 1.0f;
                }
                lb0Var4.b(f10, f10, true);
                return;
            case 8:
                ce0 ce0Var3 = ((gd0) obj).f45982u0;
                if (z9) {
                    ce0Var3.f44765c.setEditText((EditText) view);
                    ce0Var3.f44765c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.lb0 lb0Var5 = ((be0) obj).f44300e;
                if (z9) {
                    f10 = 1.0f;
                }
                lb0Var5.b(f10, f10, true);
                return;
            case 10:
                org.telegram.ui.Components.lb0 lb0Var6 = ((PasscodeActivity) obj).f41329f;
                if (z9) {
                    f10 = 1.0f;
                }
                lb0Var6.b(f10, f10, true);
                return;
            case 11:
                y71 y71Var = (y71) obj;
                if (z9) {
                    y71Var.d.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131744187, null)));
                    return;
                } else {
                    y71Var.d.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131744188, null)));
                    return;
                }
            default:
                org.telegram.ui.Components.lb0 lb0Var7 = ((TwoStepVerificationActivity) obj).f42063w;
                if (z9) {
                    f10 = 1.0f;
                }
                lb0Var7.b(f10, f10, true);
                return;
        }
    }
}

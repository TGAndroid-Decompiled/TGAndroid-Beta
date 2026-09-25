package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class od implements View.OnFocusChangeListener {
    public final int f36149a;
    public final Object f36150b;

    public od(Object obj, int i10) {
        this.f36149a = i10;
        this.f36150b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        switch (this.f36149a) {
            case 0:
                yd ydVar = ((je) this.f36150b).U0;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ydVar.b(f7, f7, true);
                return;
            case 1:
                qy qyVar = (qy) this.f36150b;
                if (z10) {
                    qyVar.Y.b(true);
                    return;
                }
                return;
            case 2:
                qg0 qg0Var = ((ae0) this.f36150b).W;
                if (z10) {
                    qg0Var.f36890c.setEditText((EditText) view);
                    qg0Var.f36890c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.jd0 jd0Var = (org.telegram.ui.Components.jd0) this.f36150b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                jd0Var.b(f10, f10, true);
                return;
            case 4:
                org.telegram.ui.Components.jd0 jd0Var2 = ((je0) this.f36150b).f34787x;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                jd0Var2.b(f11, f11, true);
                return;
            case 5:
                org.telegram.ui.Components.jd0 jd0Var3 = ((re0) this.f36150b).f37313b;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                jd0Var3.b(f12, f12, true);
                return;
            case 6:
                qg0 qg0Var2 = ((ue0) this.f36150b).f38453y;
                if (z10) {
                    qg0Var2.f36890c.setEditText((EditText) view);
                    qg0Var2.f36890c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.jd0 jd0Var4 = ((ff0) this.f36150b).f33657a;
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                jd0Var4.b(f13, f13, true);
                return;
            case 8:
                qg0 qg0Var3 = ((tf0) this.f36150b).f38099s0;
                if (z10) {
                    qg0Var3.f36890c.setEditText((EditText) view);
                    qg0Var3.f36890c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.jd0 jd0Var5 = ((pg0) this.f36150b).e;
                if (z10) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                jd0Var5.b(f14, f14, true);
                return;
            case 10:
                org.telegram.ui.Components.jd0 jd0Var6 = ((PasscodeActivity) this.f36150b).f31174f;
                if (z10) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                jd0Var6.b(f15, f15, true);
                return;
            case 11:
                td1 td1Var = (td1) this.f36150b;
                if (z10) {
                    td1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp2)));
                    return;
                } else {
                    td1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
                    return;
                }
            default:
                org.telegram.ui.Components.jd0 jd0Var7 = ((TwoStepVerificationActivity) this.f36150b).v;
                if (z10) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                jd0Var7.b(f16, f16, true);
                return;
        }
    }
}

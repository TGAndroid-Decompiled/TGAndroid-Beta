package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pd implements View.OnFocusChangeListener {
    public final int f40195a;
    public final Object f40196b;

    public pd(Object obj, int i10) {
        this.f40195a = i10;
        this.f40196b = obj;
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
        switch (this.f40195a) {
            case 0:
                ai.s sVar = ((ie) this.f40196b).U0;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                sVar.b(f7, f7, true);
                return;
            case 1:
                cy cyVar = (cy) this.f40196b;
                if (z10) {
                    cyVar.Y.b(true);
                    return;
                }
                return;
            case 2:
                cg0 cg0Var = ((md0) this.f40196b).W;
                if (z10) {
                    cg0Var.f35968c.setEditText((EditText) view);
                    cg0Var.f35968c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.sd0 sd0Var = (org.telegram.ui.Components.sd0) this.f40196b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                sd0Var.b(f10, f10, true);
                return;
            case 4:
                org.telegram.ui.Components.sd0 sd0Var2 = ((vd0) this.f40196b).f42211x;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                sd0Var2.b(f11, f11, true);
                return;
            case 5:
                org.telegram.ui.Components.sd0 sd0Var3 = ((de0) this.f40196b).f36367b;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                sd0Var3.b(f12, f12, true);
                return;
            case 6:
                cg0 cg0Var2 = ((ge0) this.f40196b).f37307y;
                if (z10) {
                    cg0Var2.f35968c.setEditText((EditText) view);
                    cg0Var2.f35968c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.sd0 sd0Var4 = ((re0) this.f40196b).f41139a;
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                sd0Var4.b(f13, f13, true);
                return;
            case 8:
                cg0 cg0Var3 = ((gf0) this.f40196b).f37335s0;
                if (z10) {
                    cg0Var3.f35968c.setEditText((EditText) view);
                    cg0Var3.f35968c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.sd0 sd0Var5 = ((bg0) this.f40196b).e;
                if (z10) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                sd0Var5.b(f14, f14, true);
                return;
            case 10:
                org.telegram.ui.Components.sd0 sd0Var6 = ((PasscodeActivity) this.f40196b).f33222f;
                if (z10) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                sd0Var6.b(f15, f15, true);
                return;
            case 11:
                oc1 oc1Var = (oc1) this.f40196b;
                if (z10) {
                    oc1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp2)));
                    return;
                } else {
                    oc1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
                    return;
                }
            default:
                org.telegram.ui.Components.sd0 sd0Var7 = ((TwoStepVerificationActivity) this.f40196b).v;
                if (z10) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                sd0Var7.b(f16, f16, true);
                return;
        }
    }
}

package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class od implements View.OnFocusChangeListener {
    public final int f35776a;
    public final Object f35777b;

    public od(Object obj, int i10) {
        this.f35776a = i10;
        this.f35777b = obj;
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
        switch (this.f35776a) {
            case 0:
                yd ydVar = ((je) this.f35777b).U0;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ydVar.b(f7, f7, true);
                return;
            case 1:
                ry ryVar = (ry) this.f35777b;
                if (z10) {
                    ryVar.Y.b(true);
                    return;
                }
                return;
            case 2:
                rg0 rg0Var = ((be0) this.f35777b).W;
                if (z10) {
                    rg0Var.f36822c.setEditText((EditText) view);
                    rg0Var.f36822c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.yc0 yc0Var = (org.telegram.ui.Components.yc0) this.f35777b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                yc0Var.b(f10, f10, true);
                return;
            case 4:
                org.telegram.ui.Components.yc0 yc0Var2 = ((ke0) this.f35777b).f34696x;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                yc0Var2.b(f11, f11, true);
                return;
            case 5:
                org.telegram.ui.Components.yc0 yc0Var3 = ((se0) this.f35777b).f37254b;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                yc0Var3.b(f12, f12, true);
                return;
            case 6:
                rg0 rg0Var2 = ((ve0) this.f35777b).f38376y;
                if (z10) {
                    rg0Var2.f36822c.setEditText((EditText) view);
                    rg0Var2.f36822c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.yc0 yc0Var4 = ((gf0) this.f35777b).f33546a;
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                yc0Var4.b(f13, f13, true);
                return;
            case 8:
                rg0 rg0Var3 = ((uf0) this.f35777b).f38093s0;
                if (z10) {
                    rg0Var3.f36822c.setEditText((EditText) view);
                    rg0Var3.f36822c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.yc0 yc0Var5 = ((qg0) this.f35777b).e;
                if (z10) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                yc0Var5.b(f14, f14, true);
                return;
            case 10:
                org.telegram.ui.Components.yc0 yc0Var6 = ((PasscodeActivity) this.f35777b).f30858f;
                if (z10) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                yc0Var6.b(f15, f15, true);
                return;
            case 11:
                td1 td1Var = (td1) this.f35777b;
                if (z10) {
                    td1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp2)));
                    return;
                } else {
                    td1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
                    return;
                }
            default:
                org.telegram.ui.Components.yc0 yc0Var7 = ((TwoStepVerificationActivity) this.f35777b).v;
                if (z10) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                yc0Var7.b(f16, f16, true);
                return;
        }
    }
}

package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pd implements View.OnFocusChangeListener {
    public final int f40512a;
    public final Object f40513b;

    public pd(Object obj, int i10) {
        this.f40512a = i10;
        this.f40513b = obj;
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
        switch (this.f40512a) {
            case 0:
                ai.s sVar = ((ie) this.f40513b).U0;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                sVar.b(f7, f7, true);
                return;
            case 1:
                ey eyVar = (ey) this.f40513b;
                if (z10) {
                    eyVar.Y.b(true);
                    return;
                }
                return;
            case 2:
                hg0 hg0Var = ((qd0) this.f40513b).W;
                if (z10) {
                    hg0Var.f37837c.setEditText((EditText) view);
                    hg0Var.f37837c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.td0 td0Var = (org.telegram.ui.Components.td0) this.f40513b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                td0Var.b(f10, f10, true);
                return;
            case 4:
                org.telegram.ui.Components.td0 td0Var2 = ((ae0) this.f40513b).f35745x;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                td0Var2.b(f11, f11, true);
                return;
            case 5:
                org.telegram.ui.Components.td0 td0Var3 = ((ie0) this.f40513b).f38267b;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                td0Var3.b(f12, f12, true);
                return;
            case 6:
                hg0 hg0Var2 = ((le0) this.f40513b).f39224y;
                if (z10) {
                    hg0Var2.f37837c.setEditText((EditText) view);
                    hg0Var2.f37837c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.td0 td0Var4 = ((xe0) this.f40513b).f43534a;
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                td0Var4.b(f13, f13, true);
                return;
            case 8:
                hg0 hg0Var3 = ((lf0) this.f40513b).f39255u0;
                if (z10) {
                    hg0Var3.f37837c.setEditText((EditText) view);
                    hg0Var3.f37837c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.td0 td0Var5 = ((gg0) this.f40513b).e;
                if (z10) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                td0Var5.b(f14, f14, true);
                return;
            case 10:
                org.telegram.ui.Components.td0 td0Var6 = ((PasscodeActivity) this.f40513b).f33532f;
                if (z10) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                td0Var6.b(f15, f15, true);
                return;
            case 11:
                tc1 tc1Var = (tc1) this.f40513b;
                if (z10) {
                    tc1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp2)));
                    return;
                } else {
                    tc1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
                    return;
                }
            default:
                org.telegram.ui.Components.td0 td0Var7 = ((TwoStepVerificationActivity) this.f40513b).v;
                if (z10) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                td0Var7.b(f16, f16, true);
                return;
        }
    }
}

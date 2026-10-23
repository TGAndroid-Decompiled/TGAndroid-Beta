package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pd implements View.OnFocusChangeListener {
    public final int f40451a;
    public final Object f40452b;

    public pd(Object obj, int i10) {
        this.f40451a = i10;
        this.f40452b = obj;
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
        switch (this.f40451a) {
            case 0:
                ai.s sVar = ((ie) this.f40452b).U0;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                sVar.b(f7, f7, true);
                return;
            case 1:
                ey eyVar = (ey) this.f40452b;
                if (z10) {
                    eyVar.Y.b(true);
                    return;
                }
                return;
            case 2:
                ig0 ig0Var = ((rd0) this.f40452b).W;
                if (z10) {
                    ig0Var.f38196c.setEditText((EditText) view);
                    ig0Var.f38196c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.vd0 vd0Var = (org.telegram.ui.Components.vd0) this.f40452b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                vd0Var.b(f10, f10, true);
                return;
            case 4:
                org.telegram.ui.Components.vd0 vd0Var2 = ((be0) this.f40452b).f36067x;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                vd0Var2.b(f11, f11, true);
                return;
            case 5:
                org.telegram.ui.Components.vd0 vd0Var3 = ((je0) this.f40452b).f38541b;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                vd0Var3.b(f12, f12, true);
                return;
            case 6:
                ig0 ig0Var2 = ((me0) this.f40452b).f39532y;
                if (z10) {
                    ig0Var2.f38196c.setEditText((EditText) view);
                    ig0Var2.f38196c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.vd0 vd0Var4 = ((ye0) this.f40452b).f43781a;
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                vd0Var4.b(f13, f13, true);
                return;
            case 8:
                ig0 ig0Var3 = ((mf0) this.f40452b).f39562u0;
                if (z10) {
                    ig0Var3.f38196c.setEditText((EditText) view);
                    ig0Var3.f38196c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.vd0 vd0Var5 = ((hg0) this.f40452b).e;
                if (z10) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                vd0Var5.b(f14, f14, true);
                return;
            case 10:
                org.telegram.ui.Components.vd0 vd0Var6 = ((PasscodeActivity) this.f40452b).f33530f;
                if (z10) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                vd0Var6.b(f15, f15, true);
                return;
            case 11:
                uc1 uc1Var = (uc1) this.f40452b;
                if (z10) {
                    uc1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp2)));
                    return;
                } else {
                    uc1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
                    return;
                }
            default:
                org.telegram.ui.Components.vd0 vd0Var7 = ((TwoStepVerificationActivity) this.f40452b).v;
                if (z10) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                vd0Var7.b(f16, f16, true);
                return;
        }
    }
}

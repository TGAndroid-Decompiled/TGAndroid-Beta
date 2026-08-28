package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ld implements View.OnFocusChangeListener {
    public final int f40111a;
    public final Object f40112b;

    public ld(Object obj, int i9) {
        this.f40111a = i9;
        this.f40112b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        switch (this.f40111a) {
            case 0:
                gh.n nVar = ((fe) this.f40112b).Q0;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                nVar.b(f10, f10, true);
                return;
            case 1:
                dy dyVar = (dy) this.f40112b;
                if (z10) {
                    dyVar.U.b(true);
                    return;
                }
                return;
            case 2:
                fg0 fg0Var = ((pd0) this.f40112b).S;
                if (z10) {
                    fg0Var.f38263c.setEditText((EditText) view);
                    fg0Var.f38263c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.fc0 fc0Var = (org.telegram.ui.Components.fc0) this.f40112b;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                fc0Var.b(f11, f11, true);
                return;
            case 4:
                org.telegram.ui.Components.fc0 fc0Var2 = ((yd0) this.f40112b).f44840x;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                fc0Var2.b(f12, f12, true);
                return;
            case 5:
                org.telegram.ui.Components.fc0 fc0Var3 = ((ge0) this.f40112b).f38519b;
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                fc0Var3.b(f13, f13, true);
                return;
            case 6:
                fg0 fg0Var2 = ((je0) this.f40112b).f39463y;
                if (z10) {
                    fg0Var2.f38263c.setEditText((EditText) view);
                    fg0Var2.f38263c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.fc0 fc0Var4 = ((ue0) this.f40112b).f43228a;
                if (z10) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                fc0Var4.b(f14, f14, true);
                return;
            case 8:
                fg0 fg0Var3 = ((jf0) this.f40112b).f39488o0;
                if (z10) {
                    fg0Var3.f38263c.setEditText((EditText) view);
                    fg0Var3.f38263c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.fc0 fc0Var5 = ((eg0) this.f40112b).f37935e;
                if (z10) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                fc0Var5.b(f15, f15, true);
                return;
            case 10:
                org.telegram.ui.Components.fc0 fc0Var6 = ((PasscodeActivity) this.f40112b).f35569f;
                if (z10) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                fc0Var6.b(f16, f16, true);
                return;
            case 11:
                tc1 tc1Var = (tc1) this.f40112b;
                if (z10) {
                    tc1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp2)));
                    return;
                } else {
                    tc1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
                    return;
                }
            default:
                org.telegram.ui.Components.fc0 fc0Var7 = ((TwoStepVerificationActivity) this.f40112b).v;
                if (z10) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                fc0Var7.b(f17, f17, true);
                return;
        }
    }
}

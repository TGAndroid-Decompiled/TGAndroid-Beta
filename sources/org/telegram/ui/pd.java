package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pd implements View.OnFocusChangeListener {
    public final int f36453a;
    public final Object f36454b;

    public pd(Object obj, int i10) {
        this.f36453a = i10;
        this.f36454b = obj;
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
        switch (this.f36453a) {
            case 0:
                zd zdVar = ((ke) this.f36454b).U0;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                zdVar.b(f7, f7, true);
                return;
            case 1:
                uy uyVar = (uy) this.f36454b;
                if (z10) {
                    uyVar.Y.b(true);
                    return;
                }
                return;
            case 2:
                xg0 xg0Var = ((he0) this.f36454b).W;
                if (z10) {
                    xg0Var.f39465c.setEditText((EditText) view);
                    xg0Var.f39465c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.id0 id0Var = (org.telegram.ui.Components.id0) this.f36454b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                id0Var.b(f10, f10, true);
                return;
            case 4:
                org.telegram.ui.Components.id0 id0Var2 = ((qe0) this.f36454b).f36807x;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                id0Var2.b(f11, f11, true);
                return;
            case 5:
                org.telegram.ui.Components.id0 id0Var3 = ((ye0) this.f36454b).f39798b;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                id0Var3.b(f12, f12, true);
                return;
            case 6:
                xg0 xg0Var2 = ((bf0) this.f36454b).f32363y;
                if (z10) {
                    xg0Var2.f39465c.setEditText((EditText) view);
                    xg0Var2.f39465c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.id0 id0Var4 = ((mf0) this.f36454b).f35647a;
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                id0Var4.b(f13, f13, true);
                return;
            case 8:
                xg0 xg0Var3 = ((ag0) this.f36454b).f32054s0;
                if (z10) {
                    xg0Var3.f39465c.setEditText((EditText) view);
                    xg0Var3.f39465c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.id0 id0Var5 = ((wg0) this.f36454b).e;
                if (z10) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                id0Var5.b(f14, f14, true);
                return;
            case 10:
                org.telegram.ui.Components.id0 id0Var6 = ((PasscodeActivity) this.f36454b).f31131f;
                if (z10) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                id0Var6.b(f15, f15, true);
                return;
            case 11:
                ae1 ae1Var = (ae1) this.f36454b;
                if (z10) {
                    ae1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp2)));
                    return;
                } else {
                    ae1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
                    return;
                }
            default:
                org.telegram.ui.Components.id0 id0Var7 = ((TwoStepVerificationActivity) this.f36454b).v;
                if (z10) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                id0Var7.b(f16, f16, true);
                return;
        }
    }
}

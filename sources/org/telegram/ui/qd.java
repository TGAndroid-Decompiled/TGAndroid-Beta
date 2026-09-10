package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class qd implements View.OnFocusChangeListener {
    public final int f36023a;
    public final Object f36024b;

    public qd(Object obj, int i10) {
        this.f36023a = i10;
        this.f36024b = obj;
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
        switch (this.f36023a) {
            case 0:
                ae aeVar = ((le) this.f36024b).U0;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                aeVar.b(f7, f7, true);
                return;
            case 1:
                wy wyVar = (wy) this.f36024b;
                if (z10) {
                    wyVar.Y.b(true);
                    return;
                }
                return;
            case 2:
                xg0 xg0Var = ((ge0) this.f36024b).W;
                if (z10) {
                    xg0Var.f38721c.setEditText((EditText) view);
                    xg0Var.f38721c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.hd0 hd0Var = (org.telegram.ui.Components.hd0) this.f36024b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                hd0Var.b(f10, f10, true);
                return;
            case 4:
                org.telegram.ui.Components.hd0 hd0Var2 = ((pe0) this.f36024b).f35806x;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                hd0Var2.b(f11, f11, true);
                return;
            case 5:
                org.telegram.ui.Components.hd0 hd0Var3 = ((xe0) this.f36024b).f38685b;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                hd0Var3.b(f12, f12, true);
                return;
            case 6:
                xg0 xg0Var2 = ((af0) this.f36024b).f30995y;
                if (z10) {
                    xg0Var2.f38721c.setEditText((EditText) view);
                    xg0Var2.f38721c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.hd0 hd0Var4 = ((lf0) this.f36024b).f34697a;
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                hd0Var4.b(f13, f13, true);
                return;
            case 8:
                xg0 xg0Var3 = ((zf0) this.f36024b).f39305s0;
                if (z10) {
                    xg0Var3.f38721c.setEditText((EditText) view);
                    xg0Var3.f38721c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.hd0 hd0Var5 = ((wg0) this.f36024b).e;
                if (z10) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                hd0Var5.b(f14, f14, true);
                return;
            case 10:
                org.telegram.ui.Components.hd0 hd0Var6 = ((PasscodeActivity) this.f36024b).f30000f;
                if (z10) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                hd0Var6.b(f15, f15, true);
                return;
            case 11:
                fe1 fe1Var = (fe1) this.f36024b;
                if (z10) {
                    fe1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp2)));
                    return;
                } else {
                    fe1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
                    return;
                }
            default:
                org.telegram.ui.Components.hd0 hd0Var7 = ((TwoStepVerificationActivity) this.f36024b).v;
                if (z10) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                hd0Var7.b(f16, f16, true);
                return;
        }
    }
}

package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class qd implements View.OnFocusChangeListener {
    public final int f36897a;
    public final Object f36898b;

    public qd(Object obj, int i10) {
        this.f36897a = i10;
        this.f36898b = obj;
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
        switch (this.f36897a) {
            case 0:
                ae aeVar = ((le) this.f36898b).U0;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                aeVar.b(f7, f7, true);
                return;
            case 1:
                wy wyVar = (wy) this.f36898b;
                if (z10) {
                    wyVar.Y.b(true);
                    return;
                }
                return;
            case 2:
                yg0 yg0Var = ((ie0) this.f36898b).W;
                if (z10) {
                    yg0Var.f39887c.setEditText((EditText) view);
                    yg0Var.f39887c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.yc0 yc0Var = (org.telegram.ui.Components.yc0) this.f36898b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                yc0Var.b(f10, f10, true);
                return;
            case 4:
                org.telegram.ui.Components.yc0 yc0Var2 = ((re0) this.f36898b).f37207x;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                yc0Var2.b(f11, f11, true);
                return;
            case 5:
                org.telegram.ui.Components.yc0 yc0Var3 = ((ze0) this.f36898b).f40229b;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                yc0Var3.b(f12, f12, true);
                return;
            case 6:
                yg0 yg0Var2 = ((cf0) this.f36898b).f32785y;
                if (z10) {
                    yg0Var2.f39887c.setEditText((EditText) view);
                    yg0Var2.f39887c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.yc0 yc0Var4 = ((nf0) this.f36898b).f36088a;
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                yc0Var4.b(f13, f13, true);
                return;
            case 8:
                yg0 yg0Var3 = ((bg0) this.f36898b).f32153s0;
                if (z10) {
                    yg0Var3.f39887c.setEditText((EditText) view);
                    yg0Var3.f39887c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.yc0 yc0Var5 = ((xg0) this.f36898b).e;
                if (z10) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                yc0Var5.b(f14, f14, true);
                return;
            case 10:
                org.telegram.ui.Components.yc0 yc0Var6 = ((PasscodeActivity) this.f36898b).f30901f;
                if (z10) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                yc0Var6.b(f15, f15, true);
                return;
            case 11:
                ce1 ce1Var = (ce1) this.f36898b;
                if (z10) {
                    ce1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp2)));
                    return;
                } else {
                    ce1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
                    return;
                }
            default:
                org.telegram.ui.Components.yc0 yc0Var7 = ((TwoStepVerificationActivity) this.f36898b).v;
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

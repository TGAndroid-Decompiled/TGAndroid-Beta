package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pd implements View.OnFocusChangeListener {
    public final int f39504a;
    public final Object f39505b;

    public pd(Object obj, int i10) {
        this.f39504a = i10;
        this.f39505b = obj;
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
        switch (this.f39504a) {
            case 0:
                zd zdVar = ((ke) this.f39505b).U0;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                zdVar.b(f7, f7, true);
                return;
            case 1:
                uy uyVar = (uy) this.f39505b;
                if (z10) {
                    uyVar.Y.b(true);
                    return;
                }
                return;
            case 2:
                wg0 wg0Var = ((ge0) this.f39505b).W;
                if (z10) {
                    wg0Var.f42390c.setEditText((EditText) view);
                    wg0Var.f42390c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.zc0 zc0Var = (org.telegram.ui.Components.zc0) this.f39505b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                zc0Var.b(f10, f10, true);
                return;
            case 4:
                org.telegram.ui.Components.zc0 zc0Var2 = ((pe0) this.f39505b).f39519x;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                zc0Var2.b(f11, f11, true);
                return;
            case 5:
                org.telegram.ui.Components.zc0 zc0Var3 = ((xe0) this.f39505b).f42729b;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                zc0Var3.b(f12, f12, true);
                return;
            case 6:
                wg0 wg0Var2 = ((af0) this.f39505b).f34436y;
                if (z10) {
                    wg0Var2.f42390c.setEditText((EditText) view);
                    wg0Var2.f42390c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.zc0 zc0Var4 = ((lf0) this.f39505b).f38360a;
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                zc0Var4.b(f13, f13, true);
                return;
            case 8:
                wg0 wg0Var3 = ((zf0) this.f39505b).f43448s0;
                if (z10) {
                    wg0Var3.f42390c.setEditText((EditText) view);
                    wg0Var3.f42390c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.zc0 zc0Var5 = ((vg0) this.f39505b).f41566e;
                if (z10) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                zc0Var5.b(f14, f14, true);
                return;
            case 10:
                org.telegram.ui.Components.zc0 zc0Var6 = ((PasscodeActivity) this.f39505b).f33526f;
                if (z10) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                zc0Var6.b(f15, f15, true);
                return;
            case 11:
                be1 be1Var = (be1) this.f39505b;
                if (z10) {
                    be1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp2)));
                    return;
                } else {
                    be1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
                    return;
                }
            default:
                org.telegram.ui.Components.zc0 zc0Var7 = ((TwoStepVerificationActivity) this.f39505b).v;
                if (z10) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                zc0Var7.b(f16, f16, true);
                return;
        }
    }
}

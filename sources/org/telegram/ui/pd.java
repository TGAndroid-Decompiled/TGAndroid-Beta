package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pd implements View.OnFocusChangeListener {
    public final int f40770a;
    public final Object f40771b;

    public pd(Object obj, int i10) {
        this.f40770a = i10;
        this.f40771b = obj;
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
        switch (this.f40770a) {
            case 0:
                zd zdVar = ((ke) this.f40771b).U0;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                zdVar.b(f7, f7, true);
                return;
            case 1:
                ty tyVar = (ty) this.f40771b;
                if (z10) {
                    tyVar.Y.b(true);
                    return;
                }
                return;
            case 2:
                wg0 wg0Var = ((fe0) this.f40771b).W;
                if (z10) {
                    wg0Var.f43576c.setEditText((EditText) view);
                    wg0Var.f43576c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.zd0 zd0Var = (org.telegram.ui.Components.zd0) this.f40771b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                zd0Var.b(f10, f10, true);
                return;
            case 4:
                org.telegram.ui.Components.zd0 zd0Var2 = ((oe0) this.f40771b).f40513x;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                zd0Var2.b(f11, f11, true);
                return;
            case 5:
                org.telegram.ui.Components.zd0 zd0Var3 = ((we0) this.f40771b).f43199b;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                zd0Var3.b(f12, f12, true);
                return;
            case 6:
                wg0 wg0Var2 = ((ze0) this.f40771b).f44573y;
                if (z10) {
                    wg0Var2.f43576c.setEditText((EditText) view);
                    wg0Var2.f43576c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.zd0 zd0Var4 = ((kf0) this.f40771b).f39262a;
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                zd0Var4.b(f13, f13, true);
                return;
            case 8:
                wg0 wg0Var3 = ((zf0) this.f40771b).f44610s0;
                if (z10) {
                    wg0Var3.f43576c.setEditText((EditText) view);
                    wg0Var3.f43576c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.zd0 zd0Var5 = ((vg0) this.f40771b).f42852e;
                if (z10) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                zd0Var5.b(f14, f14, true);
                return;
            case 10:
                org.telegram.ui.Components.zd0 zd0Var6 = ((PasscodeActivity) this.f40771b).f33853f;
                if (z10) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                zd0Var6.b(f15, f15, true);
                return;
            case 11:
                ce1 ce1Var = (ce1) this.f40771b;
                if (z10) {
                    ce1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp2)));
                    return;
                } else {
                    ce1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
                    return;
                }
            default:
                org.telegram.ui.Components.zd0 zd0Var7 = ((TwoStepVerificationActivity) this.f40771b).v;
                if (z10) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                zd0Var7.b(f16, f16, true);
                return;
        }
    }
}

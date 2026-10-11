package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class od implements View.OnFocusChangeListener {
    public final int f40514a;
    public final Object f40515b;

    public od(Object obj, int i10) {
        this.f40514a = i10;
        this.f40515b = obj;
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
        switch (this.f40514a) {
            case 0:
                yd ydVar = ((je) this.f40515b).U0;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ydVar.b(f7, f7, true);
                return;
            case 1:
                sy syVar = (sy) this.f40515b;
                if (z10) {
                    syVar.Y.b(true);
                    return;
                }
                return;
            case 2:
                vg0 vg0Var = ((ee0) this.f40515b).W;
                if (z10) {
                    vg0Var.f43015c.setEditText((EditText) view);
                    vg0Var.f43015c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.be0 be0Var = (org.telegram.ui.Components.be0) this.f40515b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                be0Var.b(f10, f10, true);
                return;
            case 4:
                org.telegram.ui.Components.be0 be0Var2 = ((ne0) this.f40515b).f40234x;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                be0Var2.b(f11, f11, true);
                return;
            case 5:
                org.telegram.ui.Components.be0 be0Var3 = ((ve0) this.f40515b).f42990b;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                be0Var3.b(f12, f12, true);
                return;
            case 6:
                vg0 vg0Var2 = ((ye0) this.f40515b).f44345y;
                if (z10) {
                    vg0Var2.f43015c.setEditText((EditText) view);
                    vg0Var2.f43015c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.be0 be0Var4 = ((jf0) this.f40515b).f39026a;
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                be0Var4.b(f13, f13, true);
                return;
            case 8:
                vg0 vg0Var3 = ((yf0) this.f40515b).f44382s0;
                if (z10) {
                    vg0Var3.f43015c.setEditText((EditText) view);
                    vg0Var3.f43015c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.be0 be0Var5 = ((ug0) this.f40515b).f42555e;
                if (z10) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                be0Var5.b(f14, f14, true);
                return;
            case 10:
                org.telegram.ui.Components.be0 be0Var6 = ((PasscodeActivity) this.f40515b).f33881f;
                if (z10) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                be0Var6.b(f15, f15, true);
                return;
            case 11:
                be1 be1Var = (be1) this.f40515b;
                if (z10) {
                    be1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp2)));
                    return;
                } else {
                    be1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
                    return;
                }
            default:
                org.telegram.ui.Components.be0 be0Var7 = ((TwoStepVerificationActivity) this.f40515b).v;
                if (z10) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                be0Var7.b(f16, f16, true);
                return;
        }
    }
}

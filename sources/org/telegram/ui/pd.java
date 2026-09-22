package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pd implements View.OnFocusChangeListener {
    public final int f36567a;
    public final Object f36568b;

    public pd(Object obj, int i10) {
        this.f36567a = i10;
        this.f36568b = obj;
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
        switch (this.f36567a) {
            case 0:
                zd zdVar = ((ke) this.f36568b).U0;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                zdVar.b(f7, f7, true);
                return;
            case 1:
                uy uyVar = (uy) this.f36568b;
                if (z10) {
                    uyVar.Y.b(true);
                    return;
                }
                return;
            case 2:
                yg0 yg0Var = ((ie0) this.f36568b).W;
                if (z10) {
                    yg0Var.f39933c.setEditText((EditText) view);
                    yg0Var.f39933c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.kd0 kd0Var = (org.telegram.ui.Components.kd0) this.f36568b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                kd0Var.b(f10, f10, true);
                return;
            case 4:
                org.telegram.ui.Components.kd0 kd0Var2 = ((re0) this.f36568b).f37157x;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                kd0Var2.b(f11, f11, true);
                return;
            case 5:
                org.telegram.ui.Components.kd0 kd0Var3 = ((ze0) this.f36568b).f40216b;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                kd0Var3.b(f12, f12, true);
                return;
            case 6:
                yg0 yg0Var2 = ((cf0) this.f36568b).f32763y;
                if (z10) {
                    yg0Var2.f39933c.setEditText((EditText) view);
                    yg0Var2.f39933c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.kd0 kd0Var4 = ((nf0) this.f36568b).f36028a;
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                kd0Var4.b(f13, f13, true);
                return;
            case 8:
                yg0 yg0Var3 = ((bg0) this.f36568b).f32454s0;
                if (z10) {
                    yg0Var3.f39933c.setEditText((EditText) view);
                    yg0Var3.f39933c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.kd0 kd0Var5 = ((xg0) this.f36568b).e;
                if (z10) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                kd0Var5.b(f14, f14, true);
                return;
            case 10:
                org.telegram.ui.Components.kd0 kd0Var6 = ((PasscodeActivity) this.f36568b).f31192f;
                if (z10) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                kd0Var6.b(f15, f15, true);
                return;
            case 11:
                ce1 ce1Var = (ce1) this.f36568b;
                if (z10) {
                    ce1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp2)));
                    return;
                } else {
                    ce1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
                    return;
                }
            default:
                org.telegram.ui.Components.kd0 kd0Var7 = ((TwoStepVerificationActivity) this.f36568b).v;
                if (z10) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                kd0Var7.b(f16, f16, true);
                return;
        }
    }
}

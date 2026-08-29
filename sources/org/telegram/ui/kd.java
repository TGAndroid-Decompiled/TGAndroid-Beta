package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kd implements View.OnFocusChangeListener {
    public final int f39833a;
    public final Object f39834b;

    public kd(Object obj, int i10) {
        this.f39833a = i10;
        this.f39834b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z10) {
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        switch (this.f39833a) {
            case 0:
                jh.l lVar = ((de) this.f39834b).Q0;
                if (z10) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                lVar.b(f9, f9, true);
                return;
            case 1:
                fy fyVar = (fy) this.f39834b;
                if (z10) {
                    fyVar.U.b(true);
                    return;
                }
                return;
            case 2:
                fg0 fg0Var = ((pd0) this.f39834b).S;
                if (z10) {
                    fg0Var.f38155c.setEditText((EditText) view);
                    fg0Var.f38155c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.uc0 uc0Var = (org.telegram.ui.Components.uc0) this.f39834b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                uc0Var.b(f10, f10, true);
                return;
            case 4:
                org.telegram.ui.Components.uc0 uc0Var2 = ((xd0) this.f39834b).f44567x;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                uc0Var2.b(f11, f11, true);
                return;
            case 5:
                org.telegram.ui.Components.uc0 uc0Var3 = ((fe0) this.f39834b).f38124b;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                uc0Var3.b(f12, f12, true);
                return;
            case 6:
                fg0 fg0Var2 = ((ie0) this.f39834b).f39226y;
                if (z10) {
                    fg0Var2.f38155c.setEditText((EditText) view);
                    fg0Var2.f38155c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.uc0 uc0Var4 = ((te0) this.f39834b).f42674a;
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                uc0Var4.b(f13, f13, true);
                return;
            case 8:
                fg0 fg0Var3 = ((if0) this.f39834b).f39249o0;
                if (z10) {
                    fg0Var3.f38155c.setEditText((EditText) view);
                    fg0Var3.f38155c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.uc0 uc0Var5 = ((eg0) this.f39834b).f37813e;
                if (z10) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                uc0Var5.b(f14, f14, true);
                return;
            case 10:
                org.telegram.ui.Components.uc0 uc0Var6 = ((PasscodeActivity) this.f39834b).f35636f;
                if (z10) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                uc0Var6.b(f15, f15, true);
                return;
            case 11:
                vc1 vc1Var = (vc1) this.f39834b;
                if (z10) {
                    vc1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp2)));
                    return;
                } else {
                    vc1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
                    return;
                }
            default:
                org.telegram.ui.Components.uc0 uc0Var7 = ((TwoStepVerificationActivity) this.f39834b).v;
                if (z10) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                uc0Var7.b(f16, f16, true);
                return;
        }
    }
}

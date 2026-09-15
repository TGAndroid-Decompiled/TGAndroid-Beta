package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class od implements View.OnFocusChangeListener {
    public final int f36190a;
    public final Object f36191b;

    public od(Object obj, int i10) {
        this.f36190a = i10;
        this.f36191b = obj;
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
        switch (this.f36190a) {
            case 0:
                yd ydVar = ((je) this.f36191b).U0;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ydVar.b(f7, f7, true);
                return;
            case 1:
                uy uyVar = (uy) this.f36191b;
                if (z10) {
                    uyVar.Y.b(true);
                    return;
                }
                return;
            case 2:
                wg0 wg0Var = ((ge0) this.f36191b).W;
                if (z10) {
                    wg0Var.f39197c.setEditText((EditText) view);
                    wg0Var.f39197c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.yc0 yc0Var = (org.telegram.ui.Components.yc0) this.f36191b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                yc0Var.b(f10, f10, true);
                return;
            case 4:
                org.telegram.ui.Components.yc0 yc0Var2 = ((pe0) this.f36191b).f36558x;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                yc0Var2.b(f11, f11, true);
                return;
            case 5:
                org.telegram.ui.Components.yc0 yc0Var3 = ((xe0) this.f36191b).f39597b;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                yc0Var3.b(f12, f12, true);
                return;
            case 6:
                wg0 wg0Var2 = ((af0) this.f36191b).f31814y;
                if (z10) {
                    wg0Var2.f39197c.setEditText((EditText) view);
                    wg0Var2.f39197c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.yc0 yc0Var4 = ((lf0) this.f36191b).f35487a;
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                yc0Var4.b(f13, f13, true);
                return;
            case 8:
                wg0 wg0Var3 = ((zf0) this.f36191b).f40185s0;
                if (z10) {
                    wg0Var3.f39197c.setEditText((EditText) view);
                    wg0Var3.f39197c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.yc0 yc0Var5 = ((vg0) this.f36191b).e;
                if (z10) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                yc0Var5.b(f14, f14, true);
                return;
            case 10:
                org.telegram.ui.Components.yc0 yc0Var6 = ((PasscodeActivity) this.f36191b).f30887f;
                if (z10) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                yc0Var6.b(f15, f15, true);
                return;
            case 11:
                ae1 ae1Var = (ae1) this.f36191b;
                if (z10) {
                    ae1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp2)));
                    return;
                } else {
                    ae1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
                    return;
                }
            default:
                org.telegram.ui.Components.yc0 yc0Var7 = ((TwoStepVerificationActivity) this.f36191b).v;
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

package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class qd implements View.OnFocusChangeListener {
    public final int f37724a;
    public final Object f37725b;

    public qd(Object obj, int i10) {
        this.f37724a = i10;
        this.f37725b = obj;
    }

    @Override
    public final void onFocusChange(View view, boolean z4) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        switch (this.f37724a) {
            case 0:
                lh.m mVar = ((ke) this.f37725b).R0;
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                mVar.b(f10, f10, true);
                return;
            case 1:
                oy oyVar = (oy) this.f37725b;
                if (z4) {
                    oyVar.V.b(true);
                    return;
                }
                return;
            case 2:
                ng0 ng0Var = ((yd0) this.f37725b).T;
                if (z4) {
                    ng0Var.f36626c.setEditText((EditText) view);
                    ng0Var.f36626c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.ad0 ad0Var = (org.telegram.ui.Components.ad0) this.f37725b;
                if (z4) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ad0Var.b(f11, f11, true);
                return;
            case 4:
                org.telegram.ui.Components.ad0 ad0Var2 = ((he0) this.f37725b).f34843x;
                if (z4) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ad0Var2.b(f12, f12, true);
                return;
            case 5:
                org.telegram.ui.Components.ad0 ad0Var3 = ((pe0) this.f37725b).f37287b;
                if (z4) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ad0Var3.b(f13, f13, true);
                return;
            case 6:
                ng0 ng0Var2 = ((se0) this.f37725b).f38321y;
                if (z4) {
                    ng0Var2.f36626c.setEditText((EditText) view);
                    ng0Var2.f36626c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.ad0 ad0Var4 = ((df0) this.f37725b).f33620a;
                if (z4) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ad0Var4.b(f14, f14, true);
                return;
            case 8:
                ng0 ng0Var3 = ((rf0) this.f37725b).f38034p0;
                if (z4) {
                    ng0Var3.f36626c.setEditText((EditText) view);
                    ng0Var3.f36626c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.ad0 ad0Var5 = ((mg0) this.f37725b).e;
                if (z4) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ad0Var5.b(f15, f15, true);
                return;
            case 10:
                org.telegram.ui.Components.ad0 ad0Var6 = ((PasscodeActivity) this.f37725b).f31685f;
                if (z4) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                ad0Var6.b(f16, f16, true);
                return;
            case 11:
                hd1 hd1Var = (hd1) this.f37725b;
                if (z4) {
                    hd1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp2)));
                    return;
                } else {
                    hd1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
                    return;
                }
            default:
                org.telegram.ui.Components.ad0 ad0Var7 = ((TwoStepVerificationActivity) this.f37725b).v;
                if (z4) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                ad0Var7.b(f17, f17, true);
                return;
        }
    }
}

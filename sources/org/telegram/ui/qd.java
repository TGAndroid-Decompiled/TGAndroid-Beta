package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class qd implements View.OnFocusChangeListener {
    public final int f40436a;
    public final Object f40437b;

    public qd(Object obj, int i10) {
        this.f40436a = i10;
        this.f40437b = obj;
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
        switch (this.f40436a) {
            case 0:
                mh.l lVar = ((ke) this.f40437b).R0;
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                lVar.b(f10, f10, true);
                return;
            case 1:
                py pyVar = (py) this.f40437b;
                if (z4) {
                    pyVar.V.b(true);
                    return;
                }
                return;
            case 2:
                og0 og0Var = ((zd0) this.f40437b).T;
                if (z4) {
                    og0Var.f39754c.setEditText((EditText) view);
                    og0Var.f39754c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.cd0 cd0Var = (org.telegram.ui.Components.cd0) this.f40437b;
                if (z4) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                cd0Var.b(f11, f11, true);
                return;
            case 4:
                org.telegram.ui.Components.cd0 cd0Var2 = ((ie0) this.f40437b).f37818x;
                if (z4) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                cd0Var2.b(f12, f12, true);
                return;
            case 5:
                org.telegram.ui.Components.cd0 cd0Var3 = ((qe0) this.f40437b).f40448b;
                if (z4) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                cd0Var3.b(f13, f13, true);
                return;
            case 6:
                og0 og0Var2 = ((te0) this.f40437b).f41596y;
                if (z4) {
                    og0Var2.f39754c.setEditText((EditText) view);
                    og0Var2.f39754c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.cd0 cd0Var4 = ((ef0) this.f40437b).f36573a;
                if (z4) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                cd0Var4.b(f14, f14, true);
                return;
            case 8:
                og0 og0Var3 = ((sf0) this.f40437b).f41271p0;
                if (z4) {
                    og0Var3.f39754c.setEditText((EditText) view);
                    og0Var3.f39754c.setDispatchBackWhenEmpty(true);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.cd0 cd0Var5 = ((ng0) this.f40437b).f39430e;
                if (z4) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                cd0Var5.b(f15, f15, true);
                return;
            case 10:
                org.telegram.ui.Components.cd0 cd0Var6 = ((PasscodeActivity) this.f40437b).f34210f;
                if (z4) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                cd0Var6.b(f16, f16, true);
                return;
            case 11:
                jd1 jd1Var = (jd1) this.f40437b;
                if (z4) {
                    jd1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp2)));
                    return;
                } else {
                    jd1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
                    return;
                }
            default:
                org.telegram.ui.Components.cd0 cd0Var7 = ((TwoStepVerificationActivity) this.f40437b).v;
                if (z4) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                cd0Var7.b(f17, f17, true);
                return;
        }
    }
}

package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class mt0 implements View.OnClickListener {
    public final int f26522a;
    public final org.telegram.ui.ActionBar.f1 f26523b;
    public final org.telegram.ui.ActionBar.f1 f26524c;
    public final ot0 d;

    public mt0(ot0 ot0Var, org.telegram.ui.ActionBar.f1 f1Var, org.telegram.ui.ActionBar.f1 f1Var2, int i10) {
        this.f26522a = i10;
        this.d = ot0Var;
        this.f26523b = f1Var;
        this.f26524c = f1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26522a) {
            case 0:
                kv0 kv0Var = this.d.d;
                if (!kv0Var.H1) {
                    org.telegram.ui.ActionBar.f1 f1Var = this.f26523b;
                    boolean z10 = f1Var.getCheckView().f26739a.f22158q;
                    org.telegram.ui.ActionBar.f1 f1Var2 = this.f26524c;
                    if (!z10 && f1Var2.getCheckView().f26739a.f22158q) {
                        float f7 = -kv0Var.f25842s1;
                        kv0Var.f25842s1 = f7;
                        AndroidUtilities.shakeViewSpring(f1Var2, f7);
                        return;
                    }
                    f1Var2.setChecked(!f1Var2.getCheckView().f26739a.f22158q);
                    if (f1Var2.getCheckView().f26739a.f22158q && f1Var.getCheckView().f26739a.f22158q) {
                        kv0Var.f25844t1[0].f30890q = 0;
                    } else {
                        kv0Var.f25844t1[0].f30890q = 2;
                    }
                    kv0.s(kv0Var);
                    return;
                }
                return;
            default:
                kv0 kv0Var2 = this.d.d;
                if (!kv0Var2.H1) {
                    org.telegram.ui.ActionBar.f1 f1Var3 = this.f26523b;
                    boolean z11 = f1Var3.getCheckView().f26739a.f22158q;
                    org.telegram.ui.ActionBar.f1 f1Var4 = this.f26524c;
                    if (!z11 && f1Var4.getCheckView().f26739a.f22158q) {
                        float f10 = -kv0Var2.f25842s1;
                        kv0Var2.f25842s1 = f10;
                        AndroidUtilities.shakeViewSpring(f1Var4, f10);
                        return;
                    }
                    f1Var4.setChecked(!f1Var4.getCheckView().f26739a.f22158q);
                    if (f1Var3.getCheckView().f26739a.f22158q && f1Var4.getCheckView().f26739a.f22158q) {
                        kv0Var2.f25844t1[0].f30890q = 0;
                    } else {
                        kv0Var2.f25844t1[0].f30890q = 1;
                    }
                    kv0.s(kv0Var2);
                    return;
                }
                return;
        }
    }
}

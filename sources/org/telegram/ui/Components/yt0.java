package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class yt0 implements View.OnClickListener {
    public final int f33044a;
    public final org.telegram.ui.ActionBar.e1 f33045b;
    public final org.telegram.ui.ActionBar.e1 f33046c;
    public final au0 d;

    public yt0(au0 au0Var, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2, int i10) {
        this.f33044a = i10;
        this.d = au0Var;
        this.f33045b = e1Var;
        this.f33046c = e1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33044a) {
            case 0:
                wv0 wv0Var = this.d.d;
                if (!wv0Var.I1) {
                    org.telegram.ui.ActionBar.e1 e1Var = this.f33045b;
                    boolean z10 = e1Var.getCheckView().f32005a.f24297q;
                    org.telegram.ui.ActionBar.e1 e1Var2 = this.f33046c;
                    if (!z10 && e1Var2.getCheckView().f32005a.f24297q) {
                        float f7 = -wv0Var.f32404s1;
                        wv0Var.f32404s1 = f7;
                        AndroidUtilities.shakeViewSpring(e1Var2, f7);
                        return;
                    }
                    e1Var2.setChecked(!e1Var2.getCheckView().f32005a.f24297q);
                    if (e1Var2.getCheckView().f32005a.f24297q && e1Var.getCheckView().f32005a.f24297q) {
                        wv0Var.f32406t1[0].f28452q = 0;
                    } else {
                        wv0Var.f32406t1[0].f28452q = 2;
                    }
                    wv0.t(wv0Var);
                    return;
                }
                return;
            default:
                wv0 wv0Var2 = this.d.d;
                if (!wv0Var2.I1) {
                    org.telegram.ui.ActionBar.e1 e1Var3 = this.f33045b;
                    boolean z11 = e1Var3.getCheckView().f32005a.f24297q;
                    org.telegram.ui.ActionBar.e1 e1Var4 = this.f33046c;
                    if (!z11 && e1Var4.getCheckView().f32005a.f24297q) {
                        float f10 = -wv0Var2.f32404s1;
                        wv0Var2.f32404s1 = f10;
                        AndroidUtilities.shakeViewSpring(e1Var4, f10);
                        return;
                    }
                    e1Var4.setChecked(!e1Var4.getCheckView().f32005a.f24297q);
                    if (e1Var3.getCheckView().f32005a.f24297q && e1Var4.getCheckView().f32005a.f24297q) {
                        wv0Var2.f32406t1[0].f28452q = 0;
                    } else {
                        wv0Var2.f32406t1[0].f28452q = 1;
                    }
                    wv0.t(wv0Var2);
                    return;
                }
                return;
        }
    }
}

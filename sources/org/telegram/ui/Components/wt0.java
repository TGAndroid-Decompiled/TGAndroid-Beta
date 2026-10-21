package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class wt0 implements View.OnClickListener {
    public final int f32247a;
    public final org.telegram.ui.ActionBar.e1 f32248b;
    public final org.telegram.ui.ActionBar.e1 f32249c;
    public final yt0 d;

    public wt0(yt0 yt0Var, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2, int i10) {
        this.f32247a = i10;
        this.d = yt0Var;
        this.f32248b = e1Var;
        this.f32249c = e1Var2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32247a) {
            case 0:
                uv0 uv0Var = this.d.d;
                if (!uv0Var.H1) {
                    org.telegram.ui.ActionBar.e1 e1Var = this.f32248b;
                    boolean z10 = e1Var.getCheckView().f32459a.f24151q;
                    org.telegram.ui.ActionBar.e1 e1Var2 = this.f32249c;
                    if (!z10 && e1Var2.getCheckView().f32459a.f24151q) {
                        float f7 = -uv0Var.f31065s1;
                        uv0Var.f31065s1 = f7;
                        AndroidUtilities.shakeViewSpring(e1Var2, f7);
                        return;
                    }
                    e1Var2.setChecked(!e1Var2.getCheckView().f32459a.f24151q);
                    if (e1Var2.getCheckView().f32459a.f24151q && e1Var.getCheckView().f32459a.f24151q) {
                        uv0Var.f31067t1[0].f27654q = 0;
                    } else {
                        uv0Var.f31067t1[0].f27654q = 2;
                    }
                    uv0.t(uv0Var);
                    return;
                }
                return;
            default:
                uv0 uv0Var2 = this.d.d;
                if (!uv0Var2.H1) {
                    org.telegram.ui.ActionBar.e1 e1Var3 = this.f32248b;
                    boolean z11 = e1Var3.getCheckView().f32459a.f24151q;
                    org.telegram.ui.ActionBar.e1 e1Var4 = this.f32249c;
                    if (!z11 && e1Var4.getCheckView().f32459a.f24151q) {
                        float f10 = -uv0Var2.f31065s1;
                        uv0Var2.f31065s1 = f10;
                        AndroidUtilities.shakeViewSpring(e1Var4, f10);
                        return;
                    }
                    e1Var4.setChecked(!e1Var4.getCheckView().f32459a.f24151q);
                    if (e1Var3.getCheckView().f32459a.f24151q && e1Var4.getCheckView().f32459a.f24151q) {
                        uv0Var2.f31067t1[0].f27654q = 0;
                    } else {
                        uv0Var2.f31067t1[0].f27654q = 1;
                    }
                    uv0.t(uv0Var2);
                    return;
                }
                return;
        }
    }
}

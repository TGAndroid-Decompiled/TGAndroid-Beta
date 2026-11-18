package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
public final class c implements org.telegram.ui.ActionBar.r1 {
    public final int f46314a;
    public final g f46315b;

    public c(g gVar, int i7) {
        this.f46314a = i7;
        this.f46315b = gVar;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f46314a) {
            case 0:
                g gVar = this.f46315b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26913b.getPackageName()));
                    gVar.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                g gVar2 = this.f46315b;
                gVar2.getClass();
                ee0 ee0Var = new ee0();
                ee0Var.G = 2;
                gVar2.presentFragment(ee0Var, true);
                return;
        }
    }
}

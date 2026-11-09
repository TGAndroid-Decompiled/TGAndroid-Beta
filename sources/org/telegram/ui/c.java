package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
public final class c implements org.telegram.ui.ActionBar.r1 {
    public final int f44166a;
    public final g f44167b;

    public c(g gVar, int i7) {
        this.f44166a = i7;
        this.f44167b = gVar;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f44166a) {
            case 0:
                g gVar = this.f44167b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25566b.getPackageName()));
                    gVar.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                g gVar2 = this.f44167b;
                gVar2.getClass();
                ee0 ee0Var = new ee0();
                ee0Var.F = 2;
                gVar2.presentFragment(ee0Var, true);
                return;
        }
    }
}

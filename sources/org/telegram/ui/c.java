package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
public final class c implements org.telegram.ui.ActionBar.r1 {
    public final int f44488a;
    public final g f44489b;

    public c(g gVar, int i7) {
        this.f44488a = i7;
        this.f44489b = gVar;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f44488a) {
            case 0:
                g gVar = this.f44489b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25555b.getPackageName()));
                    gVar.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                g gVar2 = this.f44489b;
                gVar2.getClass();
                ce0 ce0Var = new ce0();
                ce0Var.F = 2;
                gVar2.presentFragment(ce0Var, true);
                return;
        }
    }
}

package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
public final class c implements org.telegram.ui.ActionBar.q1 {
    public final int f45855a;
    public final g f45856b;

    public c(g gVar, int i7) {
        this.f45855a = i7;
        this.f45856b = gVar;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f45855a) {
            case 0:
                g gVar = this.f45856b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26609b.getPackageName()));
                    gVar.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                g gVar2 = this.f45856b;
                gVar2.getClass();
                ce0 ce0Var = new ce0();
                ce0Var.G = 2;
                gVar2.presentFragment(ce0Var, true);
                return;
        }
    }
}

package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
public final class c implements org.telegram.ui.ActionBar.p1 {
    public final int f44179a;
    public final g f44180b;

    public c(g gVar, int i3) {
        this.f44179a = i3;
        this.f44180b = gVar;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f44179a) {
            case 0:
                g gVar = this.f44180b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25457b.getPackageName()));
                    gVar.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                g gVar2 = this.f44180b;
                gVar2.getClass();
                xd0 xd0Var = new xd0();
                xd0Var.G = 2;
                gVar2.presentFragment(xd0Var, true);
                return;
        }
    }
}

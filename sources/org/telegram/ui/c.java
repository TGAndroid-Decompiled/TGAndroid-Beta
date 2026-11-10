package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
public final class c implements org.telegram.ui.ActionBar.r1 {
    public final int f44187a;
    public final g f44188b;

    public c(g gVar, int i7) {
        this.f44187a = i7;
        this.f44188b = gVar;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f44187a) {
            case 0:
                g gVar = this.f44188b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25570b.getPackageName()));
                    gVar.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                g gVar2 = this.f44188b;
                gVar2.getClass();
                fe0 fe0Var = new fe0();
                fe0Var.F = 2;
                gVar2.presentFragment(fe0Var, true);
                return;
        }
    }
}

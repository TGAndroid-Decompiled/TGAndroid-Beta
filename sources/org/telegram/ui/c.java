package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
public final class c implements org.telegram.ui.ActionBar.q1 {
    public final int f46341a;
    public final g f46342b;

    public c(g gVar, int i7) {
        this.f46341a = i7;
        this.f46342b = gVar;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f46341a) {
            case 0:
                g gVar = this.f46342b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26931b.getPackageName()));
                    gVar.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                g gVar2 = this.f46342b;
                gVar2.getClass();
                de0 de0Var = new de0();
                de0Var.G = 2;
                gVar2.presentFragment(de0Var, true);
                return;
        }
    }
}

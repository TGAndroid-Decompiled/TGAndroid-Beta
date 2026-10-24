package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class c implements org.telegram.ui.ActionBar.z1 {
    public final int f36164a;
    public final g f36165b;

    public c(g gVar, int i10) {
        this.f36164a = i10;
        this.f36165b = gVar;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f36164a) {
            case 0:
                g gVar = this.f36165b;
                gVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    gVar.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                g gVar2 = this.f36165b;
                gVar2.getClass();
                hg0 hg0Var = new hg0();
                hg0Var.F = 2;
                gVar2.presentFragment(hg0Var, true);
                return;
        }
    }
}

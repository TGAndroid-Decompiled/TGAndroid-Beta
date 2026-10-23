package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class c implements org.telegram.ui.ActionBar.z1 {
    public final int f36200a;
    public final g f36201b;

    public c(g gVar, int i10) {
        this.f36200a = i10;
        this.f36201b = gVar;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f36200a) {
            case 0:
                g gVar = this.f36201b;
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
                g gVar2 = this.f36201b;
                gVar2.getClass();
                ig0 ig0Var = new ig0();
                ig0Var.F = 2;
                gVar2.presentFragment(ig0Var, true);
                return;
        }
    }
}

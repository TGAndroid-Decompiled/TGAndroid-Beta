package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class c implements org.telegram.ui.ActionBar.a2 {
    public final int f35763a;
    public final h f35764b;

    public c(h hVar, int i10) {
        this.f35763a = i10;
        this.f35764b = hVar;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f35763a) {
            case 0:
                h hVar = this.f35764b;
                hVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    hVar.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                h hVar2 = this.f35764b;
                hVar2.getClass();
                dg0 dg0Var = new dg0();
                dg0Var.F = 2;
                hVar2.presentFragment(dg0Var, true);
                return;
        }
    }
}

package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class c implements org.telegram.ui.ActionBar.a2 {
    public final int f35218a;
    public final h f35219b;

    public c(h hVar, int i10) {
        this.f35218a = i10;
        this.f35219b = hVar;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f35218a) {
            case 0:
                h hVar = this.f35219b;
                hVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    hVar.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                h hVar2 = this.f35219b;
                hVar2.getClass();
                ug0 ug0Var = new ug0();
                ug0Var.F = 2;
                hVar2.presentFragment(ug0Var, true);
                return;
        }
    }
}

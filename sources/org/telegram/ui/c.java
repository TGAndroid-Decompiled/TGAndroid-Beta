package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class c implements org.telegram.ui.ActionBar.a2 {
    public final int f35783a;
    public final h f35784b;

    public c(h hVar, int i10) {
        this.f35783a = i10;
        this.f35784b = hVar;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f35783a) {
            case 0:
                h hVar = this.f35784b;
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
                h hVar2 = this.f35784b;
                hVar2.getClass();
                fg0 fg0Var = new fg0();
                fg0Var.F = 2;
                hVar2.presentFragment(fg0Var, true);
                return;
        }
    }
}

package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class c implements org.telegram.ui.ActionBar.a2 {
    public final int f34975a;
    public final h f34976b;

    public c(h hVar, int i10) {
        this.f34975a = i10;
        this.f34976b = hVar;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f34975a) {
            case 0:
                h hVar = this.f34976b;
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
                h hVar2 = this.f34976b;
                hVar2.getClass();
                wg0 wg0Var = new wg0();
                wg0Var.F = 2;
                hVar2.presentFragment(wg0Var, true);
                return;
        }
    }
}

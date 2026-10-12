package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class c implements org.telegram.ui.ActionBar.z1 {
    public final int f36284a;
    public final h f36285b;

    public c(h hVar, int i10) {
        this.f36284a = i10;
        this.f36285b = hVar;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f36284a) {
            case 0:
                h hVar = this.f36285b;
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
                h hVar2 = this.f36285b;
                hVar2.getClass();
                xg0 xg0Var = new xg0();
                xg0Var.F = 2;
                hVar2.presentFragment(xg0Var, true);
                return;
        }
    }
}

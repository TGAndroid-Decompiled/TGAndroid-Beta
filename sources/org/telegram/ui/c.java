package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class c implements org.telegram.ui.ActionBar.c2 {
    public final int f31474a;
    public final h f31475b;

    public c(h hVar, int i10) {
        this.f31474a = i10;
        this.f31475b = hVar;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f31474a) {
            case 0:
                h hVar = this.f31475b;
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
                h hVar2 = this.f31475b;
                hVar2.getClass();
                xg0 xg0Var = new xg0();
                xg0Var.F = 2;
                hVar2.presentFragment(xg0Var, true);
                return;
        }
    }
}

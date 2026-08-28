package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class c implements org.telegram.ui.ActionBar.b2 {
    public final int f37017a;
    public final h f37018b;

    public c(h hVar, int i9) {
        this.f37017a = i9;
        this.f37018b = hVar;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f37017a) {
            case 0:
                h hVar = this.f37018b;
                hVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    hVar.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                h hVar2 = this.f37018b;
                hVar2.getClass();
                fg0 fg0Var = new fg0();
                fg0Var.B = 2;
                hVar2.presentFragment(fg0Var, true);
                return;
        }
    }
}

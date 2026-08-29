package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class d implements org.telegram.ui.ActionBar.b2 {
    public final int f37246a;
    public final i f37247b;

    public d(i iVar, int i10) {
        this.f37246a = i10;
        this.f37247b = iVar;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f37246a) {
            case 0:
                i iVar = this.f37247b;
                iVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    iVar.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                i iVar2 = this.f37247b;
                iVar2.getClass();
                fg0 fg0Var = new fg0();
                fg0Var.B = 2;
                iVar2.presentFragment(fg0Var, true);
                return;
        }
    }
}

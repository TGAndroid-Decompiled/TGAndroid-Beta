package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class d implements org.telegram.ui.ActionBar.c2 {
    public final int f35948a;
    public final i f35949b;

    public d(i iVar, int i10) {
        this.f35948a = i10;
        this.f35949b = iVar;
    }

    @Override
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f35948a) {
            case 0:
                i iVar = this.f35949b;
                iVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    iVar.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            default:
                i iVar2 = this.f35949b;
                iVar2.getClass();
                og0 og0Var = new og0();
                og0Var.C = 2;
                iVar2.presentFragment(og0Var, true);
                return;
        }
    }
}

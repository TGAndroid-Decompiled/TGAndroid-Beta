package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class d implements org.telegram.ui.ActionBar.c2 {
    public final int f33453a;
    public final i f33454b;

    public d(i iVar, int i10) {
        this.f33453a = i10;
        this.f33454b = iVar;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f33453a) {
            case 0:
                i iVar = this.f33454b;
                iVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    iVar.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                i iVar2 = this.f33454b;
                iVar2.getClass();
                ng0 ng0Var = new ng0();
                ng0Var.C = 2;
                iVar2.presentFragment(ng0Var, true);
                return;
        }
    }
}

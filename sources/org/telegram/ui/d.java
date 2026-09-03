package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class d implements org.telegram.ui.ActionBar.c2 {
    public final int f33275a;
    public final i f33276b;

    public d(i iVar, int i10) {
        this.f33275a = i10;
        this.f33276b = iVar;
    }

    @Override
    public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f33275a) {
            case 0:
                i iVar = this.f33276b;
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
                i iVar2 = this.f33276b;
                iVar2.getClass();
                pg0 pg0Var = new pg0();
                pg0Var.C = 2;
                iVar2.presentFragment(pg0Var, true);
                return;
        }
    }
}

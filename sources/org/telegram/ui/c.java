package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class c implements org.telegram.ui.ActionBar.z1 {
    public final int f34647a;
    public final h f34648b;

    public c(h hVar, int i10) {
        this.f34647a = i10;
        this.f34648b = hVar;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f34647a) {
            case 0:
                h hVar = this.f34648b;
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
                h hVar2 = this.f34648b;
                hVar2.getClass();
                bh0 bh0Var = new bh0();
                bh0Var.F = 2;
                hVar2.presentFragment(bh0Var, true);
                return;
        }
    }
}

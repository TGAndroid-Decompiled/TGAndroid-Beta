package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class c implements org.telegram.ui.ActionBar.a2 {
    public final int f35737a;
    public final h f35738b;

    public c(h hVar, int i10) {
        this.f35737a = i10;
        this.f35738b = hVar;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f35737a) {
            case 0:
                h hVar = this.f35738b;
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
                h hVar2 = this.f35738b;
                hVar2.getClass();
                eg0 eg0Var = new eg0();
                eg0Var.F = 2;
                hVar2.presentFragment(eg0Var, true);
                return;
        }
    }
}

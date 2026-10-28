package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class c implements org.telegram.ui.ActionBar.b2 {
    public final int f38129a;
    public final g f38130b;

    public c(g gVar, int i10) {
        this.f38129a = i10;
        this.f38130b = gVar;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f38129a) {
            case 0:
                g gVar = this.f38130b;
                gVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    gVar.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                g gVar2 = this.f38130b;
                gVar2.getClass();
                ig0 ig0Var = new ig0();
                ig0Var.F = 2;
                gVar2.presentFragment(ig0Var, true);
                return;
        }
    }
}

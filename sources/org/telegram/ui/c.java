package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class c implements org.telegram.ui.ActionBar.z1 {
    public final int f36517a;
    public final h f36518b;

    public c(h hVar, int i10) {
        this.f36517a = i10;
        this.f36518b = hVar;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f36517a) {
            case 0:
                h hVar = this.f36518b;
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
                h hVar2 = this.f36518b;
                hVar2.getClass();
                vg0 vg0Var = new vg0();
                vg0Var.F = 2;
                hVar2.presentFragment(vg0Var, true);
                return;
        }
    }
}

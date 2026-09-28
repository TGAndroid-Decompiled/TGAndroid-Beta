package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class c implements org.telegram.ui.ActionBar.z1 {
    public final int f32529a;
    public final h f32530b;

    public c(h hVar, int i10) {
        this.f32529a = i10;
        this.f32530b = hVar;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f32529a) {
            case 0:
                h hVar = this.f32530b;
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
                h hVar2 = this.f32530b;
                hVar2.getClass();
                qg0 qg0Var = new qg0();
                qg0Var.F = 2;
                hVar2.presentFragment(qg0Var, true);
                return;
        }
    }
}

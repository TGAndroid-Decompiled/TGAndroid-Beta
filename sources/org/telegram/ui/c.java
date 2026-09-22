package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class c implements org.telegram.ui.ActionBar.a2 {
    public final int f32594a;
    public final h f32595b;

    public c(h hVar, int i10) {
        this.f32594a = i10;
        this.f32595b = hVar;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f32594a) {
            case 0:
                h hVar = this.f32595b;
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
                h hVar2 = this.f32595b;
                hVar2.getClass();
                wg0 wg0Var = new wg0();
                wg0Var.F = 2;
                hVar2.presentFragment(wg0Var, true);
                return;
        }
    }
}

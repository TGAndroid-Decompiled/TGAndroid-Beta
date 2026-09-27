package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class c implements org.telegram.ui.ActionBar.b2 {
    public final int f32464a;
    public final h f32465b;

    public c(h hVar, int i10) {
        this.f32464a = i10;
        this.f32465b = hVar;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f32464a) {
            case 0:
                h hVar = this.f32465b;
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
                h hVar2 = this.f32465b;
                hVar2.getClass();
                tg0 tg0Var = new tg0();
                tg0Var.F = 2;
                hVar2.presentFragment(tg0Var, true);
                return;
        }
    }
}

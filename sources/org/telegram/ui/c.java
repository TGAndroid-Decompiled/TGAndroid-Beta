package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class c implements org.telegram.ui.ActionBar.a2 {
    public final int f32472a;
    public final h f32473b;

    public c(h hVar, int i10) {
        this.f32472a = i10;
        this.f32473b = hVar;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f32472a) {
            case 0:
                h hVar = this.f32473b;
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
                h hVar2 = this.f32473b;
                hVar2.getClass();
                xg0 xg0Var = new xg0();
                xg0Var.F = 2;
                hVar2.presentFragment(xg0Var, true);
                return;
        }
    }
}

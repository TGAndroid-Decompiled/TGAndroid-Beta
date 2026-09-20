package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class c implements org.telegram.ui.ActionBar.a2 {
    public final int f32560a;
    public final h f32561b;

    public c(h hVar, int i10) {
        this.f32560a = i10;
        this.f32561b = hVar;
    }

    @Override
    public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f32560a) {
            case 0:
                h hVar = this.f32561b;
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
                h hVar2 = this.f32561b;
                hVar2.getClass();
                yg0 yg0Var = new yg0();
                yg0Var.F = 2;
                hVar2.presentFragment(yg0Var, true);
                return;
        }
    }
}

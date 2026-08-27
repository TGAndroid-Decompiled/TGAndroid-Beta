package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

public final class c implements org.telegram.ui.ActionBar.a2 {

    public final int f36900a;

    public final h f36901b;

    public c(h hVar, int i10) {
        this.f36900a = i10;
        this.f36901b = hVar;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36900a) {
            case 0:
                h hVar = this.f36901b;
                hVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    hVar.getParentActivity().startActivity(intent);
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
                break;
            default:
                h hVar2 = this.f36901b;
                hVar2.getClass();
                ig0 ig0Var = new ig0();
                ig0Var.B = 2;
                hVar2.presentFragment(ig0Var, true);
                break;
        }
    }
}

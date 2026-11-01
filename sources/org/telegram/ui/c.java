package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
public final class c implements org.telegram.ui.ActionBar.u1 {
    public final int f36142a;
    public final f f36143b;

    public c(f fVar, int i10) {
        this.f36142a = i10;
        this.f36143b = fVar;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f36142a) {
            case 0:
                f fVar = this.f36143b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.f18945b.getPackageName()));
                    fVar.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            default:
                f fVar2 = this.f36143b;
                fVar2.getClass();
                gf0 gf0Var = new gf0();
                gf0Var.F = 2;
                fVar2.presentFragment(gf0Var, true);
                return;
        }
    }
}

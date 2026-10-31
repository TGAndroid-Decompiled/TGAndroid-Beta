package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
public final class c implements org.telegram.ui.ActionBar.u1 {
    public final int f36335a;
    public final f f36336b;

    public c(f fVar, int i10) {
        this.f36335a = i10;
        this.f36336b = fVar;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f36335a) {
            case 0:
                f fVar = this.f36336b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.f19025b.getPackageName()));
                    fVar.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            default:
                f fVar2 = this.f36336b;
                fVar2.getClass();
                hf0 hf0Var = new hf0();
                hf0Var.F = 2;
                fVar2.presentFragment(hf0Var, true);
                return;
        }
    }
}

package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class kc implements org.telegram.messenger.z10 {
    public final int f48625a;
    public final oc f48626b;

    public kc(oc ocVar, int i7) {
        this.f48625a = i7;
        this.f48626b = ocVar;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f48625a) {
            case 0:
                oc ocVar = this.f48626b;
                ocVar.getClass();
                if (view instanceof org.telegram.ui.Components.b01) {
                    view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28940i5, ocVar.f49896b));
                    return;
                }
                return;
            default:
                if (view instanceof org.telegram.ui.Components.b01) {
                    org.telegram.ui.Components.b01 b01Var = (org.telegram.ui.Components.b01) view;
                    if (b01Var.H.f34009a.f29471b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f48626b.f49903w;
                    }
                    b01Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}

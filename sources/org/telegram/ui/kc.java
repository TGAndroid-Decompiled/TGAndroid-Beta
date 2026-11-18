package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class kc implements org.telegram.messenger.x10 {
    public final int f49238a;
    public final oc f49239b;

    public kc(oc ocVar, int i7) {
        this.f49238a = i7;
        this.f49239b = ocVar;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f49238a) {
            case 0:
                oc ocVar = this.f49239b;
                ocVar.getClass();
                if (view instanceof org.telegram.ui.Components.j01) {
                    view.setBackgroundColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29487i5, ocVar.f50566b));
                    return;
                }
                return;
            default:
                if (view instanceof org.telegram.ui.Components.j01) {
                    org.telegram.ui.Components.j01 j01Var = (org.telegram.ui.Components.j01) view;
                    if (j01Var.H.f36837a.f30000b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f49239b.f50573w;
                    }
                    j01Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}

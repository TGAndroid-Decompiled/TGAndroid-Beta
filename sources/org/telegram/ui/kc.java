package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class kc implements org.telegram.messenger.x10 {
    public final int f49234a;
    public final oc f49235b;

    public kc(oc ocVar, int i7) {
        this.f49234a = i7;
        this.f49235b = ocVar;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f49234a) {
            case 0:
                oc ocVar = this.f49235b;
                ocVar.getClass();
                if (view instanceof org.telegram.ui.Components.j01) {
                    view.setBackgroundColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29485i5, ocVar.f50516b));
                    return;
                }
                return;
            default:
                if (view instanceof org.telegram.ui.Components.j01) {
                    org.telegram.ui.Components.j01 j01Var = (org.telegram.ui.Components.j01) view;
                    if (j01Var.H.f36837a.f29998b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f49235b.f50523w;
                    }
                    j01Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}

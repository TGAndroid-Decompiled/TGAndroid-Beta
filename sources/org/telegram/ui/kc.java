package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class kc implements org.telegram.messenger.w10 {
    public final int f49398a;
    public final oc f49399b;

    public kc(oc ocVar, int i7) {
        this.f49398a = i7;
        this.f49399b = ocVar;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f49398a) {
            case 0:
                oc ocVar = this.f49399b;
                ocVar.getClass();
                if (view instanceof org.telegram.ui.Components.j01) {
                    view.setBackgroundColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29542i5, ocVar.f50641b));
                    return;
                }
                return;
            default:
                if (view instanceof org.telegram.ui.Components.j01) {
                    org.telegram.ui.Components.j01 j01Var = (org.telegram.ui.Components.j01) view;
                    if (j01Var.H.f36472a.f30046b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f49399b.f50648w;
                    }
                    j01Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}

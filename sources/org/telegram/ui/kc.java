package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class kc implements org.telegram.messenger.y10 {
    public final int f49235a;
    public final oc f49236b;

    public kc(oc ocVar, int i7) {
        this.f49235a = i7;
        this.f49236b = ocVar;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f49235a) {
            case 0:
                oc ocVar = this.f49236b;
                ocVar.getClass();
                if (view instanceof org.telegram.ui.Components.k01) {
                    view.setBackgroundColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29438i5, ocVar.f50530b));
                    return;
                }
                return;
            default:
                if (view instanceof org.telegram.ui.Components.k01) {
                    org.telegram.ui.Components.k01 k01Var = (org.telegram.ui.Components.k01) view;
                    if (k01Var.H.f37548a.f29950b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f49236b.f50537w;
                    }
                    k01Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}

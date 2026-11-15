package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class kc implements org.telegram.messenger.z10 {
    public final int f48671a;
    public final oc f48672b;

    public kc(oc ocVar, int i7) {
        this.f48671a = i7;
        this.f48672b = ocVar;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f48671a) {
            case 0:
                oc ocVar = this.f48672b;
                ocVar.getClass();
                if (view instanceof org.telegram.ui.Components.b01) {
                    view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28940i5, ocVar.f49906b));
                    return;
                }
                return;
            default:
                if (view instanceof org.telegram.ui.Components.b01) {
                    org.telegram.ui.Components.b01 b01Var = (org.telegram.ui.Components.b01) view;
                    if (b01Var.H.f34022a.f29471b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f48672b.f49913w;
                    }
                    b01Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}

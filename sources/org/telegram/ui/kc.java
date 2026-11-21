package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class kc implements org.telegram.messenger.x10 {
    public final int f49273a;
    public final oc f49274b;

    public kc(oc ocVar, int i7) {
        this.f49273a = i7;
        this.f49274b = ocVar;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f49273a) {
            case 0:
                oc ocVar = this.f49274b;
                ocVar.getClass();
                if (view instanceof org.telegram.ui.Components.l01) {
                    view.setBackgroundColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29469i5, ocVar.f50541b));
                    return;
                }
                return;
            default:
                if (view instanceof org.telegram.ui.Components.l01) {
                    org.telegram.ui.Components.l01 l01Var = (org.telegram.ui.Components.l01) view;
                    if (l01Var.H.f37594a.f29981b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f49274b.f50548w;
                    }
                    l01Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}

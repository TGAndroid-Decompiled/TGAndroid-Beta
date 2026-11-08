package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class lc implements org.telegram.messenger.c20 {
    public final int f47506a;
    public final pc f47507b;

    public lc(pc pcVar, int i7) {
        this.f47506a = i7;
        this.f47507b = pcVar;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f47506a) {
            case 0:
                pc pcVar = this.f47507b;
                pcVar.getClass();
                if (view instanceof org.telegram.ui.Components.zz0) {
                    view.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27943i5, pcVar.f48772b));
                    return;
                }
                return;
            default:
                if (view instanceof org.telegram.ui.Components.zz0) {
                    org.telegram.ui.Components.zz0 zz0Var = (org.telegram.ui.Components.zz0) view;
                    if (zz0Var.G.f38699a.f28460b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f47507b.f48779w;
                    }
                    zz0Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}

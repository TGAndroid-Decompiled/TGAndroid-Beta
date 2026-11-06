package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class lc implements org.telegram.messenger.c20 {
    public final int f47483a;
    public final pc f47484b;

    public lc(pc pcVar, int i7) {
        this.f47483a = i7;
        this.f47484b = pcVar;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f47483a) {
            case 0:
                pc pcVar = this.f47484b;
                pcVar.getClass();
                if (view instanceof org.telegram.ui.Components.yz0) {
                    view.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27939i5, pcVar.f48782b));
                    return;
                }
                return;
            default:
                if (view instanceof org.telegram.ui.Components.yz0) {
                    org.telegram.ui.Components.yz0 yz0Var = (org.telegram.ui.Components.yz0) view;
                    if (yz0Var.G.f38697a.f28456b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f47484b.f48789w;
                    }
                    yz0Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}

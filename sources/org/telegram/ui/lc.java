package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class lc implements org.telegram.messenger.c20 {
    public final int f47509a;
    public final pc f47510b;

    public lc(pc pcVar, int i7) {
        this.f47509a = i7;
        this.f47510b = pcVar;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f47509a) {
            case 0:
                pc pcVar = this.f47510b;
                pcVar.getClass();
                if (view instanceof org.telegram.ui.Components.zz0) {
                    view.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27940i5, pcVar.f48776b));
                    return;
                }
                return;
            default:
                if (view instanceof org.telegram.ui.Components.zz0) {
                    org.telegram.ui.Components.zz0 zz0Var = (org.telegram.ui.Components.zz0) view;
                    if (zz0Var.G.f38684a.f28457b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f47510b.f48783w;
                    }
                    zz0Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}

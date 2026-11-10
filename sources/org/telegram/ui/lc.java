package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class lc implements org.telegram.messenger.c20 {
    public final int f47579a;
    public final pc f47580b;

    public lc(pc pcVar, int i7) {
        this.f47579a = i7;
        this.f47580b = pcVar;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f47579a) {
            case 0:
                pc pcVar = this.f47580b;
                pcVar.getClass();
                if (view instanceof org.telegram.ui.Components.zz0) {
                    view.setBackgroundColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27981i5, pcVar.f48741b));
                    return;
                }
                return;
            default:
                if (view instanceof org.telegram.ui.Components.zz0) {
                    org.telegram.ui.Components.zz0 zz0Var = (org.telegram.ui.Components.zz0) view;
                    if (zz0Var.G.f38725a.f28486b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f47580b.f48748w;
                    }
                    zz0Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}

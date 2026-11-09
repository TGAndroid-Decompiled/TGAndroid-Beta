package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class lc implements org.telegram.messenger.c20 {
    public final int f47562a;
    public final pc f47563b;

    public lc(pc pcVar, int i7) {
        this.f47562a = i7;
        this.f47563b = pcVar;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f47562a) {
            case 0:
                pc pcVar = this.f47563b;
                pcVar.getClass();
                if (view instanceof org.telegram.ui.Components.a01) {
                    view.setBackgroundColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27956i5, pcVar.f48687b));
                    return;
                }
                return;
            default:
                if (view instanceof org.telegram.ui.Components.a01) {
                    org.telegram.ui.Components.a01 a01Var = (org.telegram.ui.Components.a01) view;
                    if (a01Var.G.f38760a.f28461b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f47563b.f48694w;
                    }
                    a01Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}

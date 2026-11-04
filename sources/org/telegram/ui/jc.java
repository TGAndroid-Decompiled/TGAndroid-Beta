package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class jc implements org.telegram.messenger.u10 {
    public final int f46595a;
    public final nc f46596b;

    public jc(nc ncVar, int i3) {
        this.f46595a = i3;
        this.f46596b = ncVar;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f46595a) {
            case 0:
                nc ncVar = this.f46596b;
                ncVar.getClass();
                if (view instanceof org.telegram.ui.Components.yz0) {
                    view.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27971i5, ncVar.f47946b));
                    return;
                }
                return;
            default:
                if (view instanceof org.telegram.ui.Components.yz0) {
                    org.telegram.ui.Components.yz0 yz0Var = (org.telegram.ui.Components.yz0) view;
                    if (yz0Var.H.f38832a.f28420b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f46596b.f47953w;
                    }
                    yz0Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}

package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class kc implements org.telegram.messenger.y10 {
    public final int f49277a;
    public final oc f49278b;

    public kc(oc ocVar, int i7) {
        this.f49277a = i7;
        this.f49278b = ocVar;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f49277a) {
            case 0:
                oc ocVar = this.f49278b;
                ocVar.getClass();
                if (view instanceof org.telegram.ui.Components.k01) {
                    view.setBackgroundColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29472i5, ocVar.f50545b));
                    return;
                }
                return;
            default:
                if (view instanceof org.telegram.ui.Components.k01) {
                    org.telegram.ui.Components.k01 k01Var = (org.telegram.ui.Components.k01) view;
                    if (k01Var.H.f37592a.f29984b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f49278b.f50552w;
                    }
                    k01Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}

package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class pc implements f5.d {
    public final int f41364a;
    public final tc f41365b;

    public pc(tc tcVar, int i10) {
        this.f41364a = i10;
        this.f41365b = tcVar;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f41364a) {
            case 0:
                tc tcVar = this.f41365b;
                tcVar.getClass();
                ((org.telegram.ui.Components.l11) view).setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23151i5, tcVar.f42645b));
                return;
            default:
                if (view instanceof org.telegram.ui.Components.l11) {
                    org.telegram.ui.Components.l11 l11Var = (org.telegram.ui.Components.l11) view;
                    if (l11Var.C.f28512a.f22763b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f41365b.v;
                    }
                    l11Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}

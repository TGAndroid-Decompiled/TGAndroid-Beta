package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class bd implements Utilities.Callback {
    public final int f34514a;
    public final fd f34515b;

    public bd(fd fdVar, int i10) {
        this.f34514a = i10;
        this.f34515b = fdVar;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f34514a) {
            case 0:
                fd fdVar = this.f34515b;
                fdVar.getClass();
                ((org.telegram.ui.Components.v21) view).setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19989i5, fdVar.f35794b));
                return;
            default:
                if (view instanceof org.telegram.ui.Components.v21) {
                    org.telegram.ui.Components.v21 v21Var = (org.telegram.ui.Components.v21) view;
                    if (v21Var.G.f31668a.f19643b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f34515b.v;
                    }
                    v21Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}

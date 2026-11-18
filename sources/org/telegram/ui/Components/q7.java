package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.PhotoViewer;
public final class q7 extends zc {
    public final int f38721b;
    public final org.telegram.messenger.fs f38722c;

    public q7(org.telegram.messenger.fs fsVar, Context context, int i7) {
        super(context);
        this.f38721b = i7;
        this.f38722c = fsVar;
    }

    @Override
    public final void c(boolean z10) {
        boolean z11;
        int i7;
        switch (this.f38721b) {
            case 0:
                g8 g8Var = (g8) this.f38722c;
                g8Var.updateColors();
                org.telegram.ui.xq xqVar = g8Var.I1;
                if (xqVar != null) {
                    xqVar.a(d1.f.u());
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f38722c;
                org.telegram.ui.ActionBar.z0 z0Var = photoViewer.G0;
                if (z0Var != null) {
                    z0Var.f(z10);
                    org.telegram.ui.ActionBar.z0 z0Var2 = photoViewer.G0;
                    if (z10) {
                        i7 = 259241196;
                    } else {
                        i7 = 268435455;
                    }
                    z0Var2.setSelectorColor(i7);
                }
                f61 f61Var = photoViewer.G2;
                if (f61Var != null) {
                    if (!d1.f.u() && !photoViewer.f43310r) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    f61Var.t0(z11);
                }
                org.telegram.ui.xq xqVar2 = photoViewer.f43366x0;
                if (xqVar2 != null) {
                    xqVar2.a(d1.f.u());
                    return;
                }
                return;
        }
    }
}

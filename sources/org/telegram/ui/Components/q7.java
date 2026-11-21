package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.PhotoViewer;
public final class q7 extends zc {
    public final int f38805b;
    public final org.telegram.messenger.fs f38806c;

    public q7(org.telegram.messenger.fs fsVar, Context context, int i7) {
        super(context);
        this.f38805b = i7;
        this.f38806c = fsVar;
    }

    @Override
    public final void c(boolean z10) {
        boolean z11;
        int i7;
        switch (this.f38805b) {
            case 0:
                f8 f8Var = (f8) this.f38806c;
                f8Var.updateColors();
                org.telegram.ui.xq xqVar = f8Var.I1;
                if (xqVar != null) {
                    xqVar.a(d1.f.u());
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f38806c;
                org.telegram.ui.ActionBar.y0 y0Var = photoViewer.G0;
                if (y0Var != null) {
                    y0Var.f(z10);
                    org.telegram.ui.ActionBar.y0 y0Var2 = photoViewer.G0;
                    if (z10) {
                        i7 = 259241196;
                    } else {
                        i7 = 268435455;
                    }
                    y0Var2.setSelectorColor(i7);
                }
                i61 i61Var = photoViewer.G2;
                if (i61Var != null) {
                    if (!d1.f.u() && !photoViewer.f43351r) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    i61Var.t0(z11);
                }
                org.telegram.ui.xq xqVar2 = photoViewer.f43407x0;
                if (xqVar2 != null) {
                    xqVar2.a(d1.f.u());
                    return;
                }
                return;
        }
    }
}

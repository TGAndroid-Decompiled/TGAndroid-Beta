package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.PhotoViewer;
public final class j7 extends qc {
    public final int f35898b;
    public final org.telegram.messenger.is f35899c;

    public j7(org.telegram.messenger.is isVar, Context context, int i7) {
        super(context);
        this.f35898b = i7;
        this.f35899c = isVar;
    }

    @Override
    public final void c(boolean z10) {
        boolean z11;
        int i7;
        switch (this.f35898b) {
            case 0:
                y7 y7Var = (y7) this.f35899c;
                y7Var.updateColors();
                org.telegram.ui.wq wqVar = y7Var.I1;
                if (wqVar != null) {
                    wqVar.a(d1.f.u());
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f35899c;
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
                u51 u51Var = photoViewer.G2;
                if (u51Var != null) {
                    if (!d1.f.u() && !photoViewer.f42865r) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    u51Var.t0(z11);
                }
                org.telegram.ui.wq wqVar2 = photoViewer.f42921x0;
                if (wqVar2 != null) {
                    wqVar2.a(d1.f.u());
                    return;
                }
                return;
        }
    }
}

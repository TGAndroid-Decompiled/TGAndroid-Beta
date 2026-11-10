package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.PhotoViewer;
public final class l7 extends uc {
    public final int f35564b;
    public final org.telegram.messenger.ls f35565c;

    public l7(org.telegram.messenger.ls lsVar, Context context, int i7) {
        super(context);
        this.f35564b = i7;
        this.f35565c = lsVar;
    }

    @Override
    public final void c(boolean z9) {
        boolean z10;
        int i7;
        switch (this.f35564b) {
            case 0:
                a8 a8Var = (a8) this.f35565c;
                a8Var.updateColors();
                org.telegram.ui.xq xqVar = a8Var.H1;
                if (xqVar != null) {
                    xqVar.a(d1.f.u());
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f35565c;
                org.telegram.ui.ActionBar.z0 z0Var = photoViewer.F0;
                if (z0Var != null) {
                    z0Var.f(z9);
                    org.telegram.ui.ActionBar.z0 z0Var2 = photoViewer.F0;
                    if (z9) {
                        i7 = 259241196;
                    } else {
                        i7 = 268435455;
                    }
                    z0Var2.setSelectorColor(i7);
                }
                t51 t51Var = photoViewer.F2;
                if (t51Var != null) {
                    if (!d1.f.u() && !photoViewer.f41494r) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    t51Var.t0(z10);
                }
                org.telegram.ui.xq xqVar2 = photoViewer.f41540w0;
                if (xqVar2 != null) {
                    xqVar2.a(d1.f.u());
                    return;
                }
                return;
        }
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.PhotoViewer;
public final class m7 extends vc {
    public final int f35980b;
    public final org.telegram.messenger.ls f35981c;

    public m7(org.telegram.messenger.ls lsVar, Context context, int i7) {
        super(context);
        this.f35980b = i7;
        this.f35981c = lsVar;
    }

    @Override
    public final void c(boolean z9) {
        boolean z10;
        int i7;
        switch (this.f35980b) {
            case 0:
                b8 b8Var = (b8) this.f35981c;
                b8Var.updateColors();
                org.telegram.ui.wq wqVar = b8Var.E1;
                if (wqVar != null) {
                    wqVar.a(d1.f.u());
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f35981c;
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
                u51 u51Var = photoViewer.F2;
                if (u51Var != null) {
                    if (!d1.f.u() && !photoViewer.f41503r) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    u51Var.t0(z10);
                }
                org.telegram.ui.wq wqVar2 = photoViewer.f41549w0;
                if (wqVar2 != null) {
                    wqVar2.a(d1.f.u());
                    return;
                }
                return;
        }
    }
}

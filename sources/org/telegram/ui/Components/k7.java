package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.PhotoViewer;
public final class k7 extends tc {
    public final int f35336b;
    public final org.telegram.messenger.cs f35337c;

    public k7(org.telegram.messenger.cs csVar, Context context, int i3) {
        super(context);
        this.f35336b = i3;
        this.f35337c = csVar;
    }

    @Override
    public final void c(boolean z10) {
        boolean z11;
        int i3;
        switch (this.f35336b) {
            case 0:
                z7 z7Var = (z7) this.f35337c;
                z7Var.updateColors();
                org.telegram.ui.tq tqVar = z7Var.F1;
                if (tqVar != null) {
                    tqVar.a(d1.f.u());
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f35337c;
                org.telegram.ui.ActionBar.y0 y0Var = photoViewer.G0;
                if (y0Var != null) {
                    y0Var.f(z10);
                    org.telegram.ui.ActionBar.y0 y0Var2 = photoViewer.G0;
                    if (z10) {
                        i3 = 259241196;
                    } else {
                        i3 = 268435455;
                    }
                    y0Var2.setSelectorColor(i3);
                }
                m51 m51Var = photoViewer.G2;
                if (m51Var != null) {
                    if (!d1.f.u() && !photoViewer.f41522r) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    m51Var.t0(z11);
                }
                org.telegram.ui.tq tqVar2 = photoViewer.f41578x0;
                if (tqVar2 != null) {
                    tqVar2.a(d1.f.u());
                    return;
                }
                return;
        }
    }
}

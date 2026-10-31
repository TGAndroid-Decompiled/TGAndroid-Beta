package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.PhotoViewer;
public final class i7 extends oc {
    public final int f26900b;
    public final org.telegram.messenger.us f26901c;

    public i7(org.telegram.messenger.us usVar, Context context, int i10) {
        super(context);
        this.f26900b = i10;
        this.f26901c = usVar;
    }

    @Override
    public final void c(boolean z10) {
        boolean z11;
        int i10;
        switch (this.f26900b) {
            case 0:
                w7 w7Var = (w7) this.f26901c;
                w7Var.updateColors();
                org.telegram.ui.vr vrVar = w7Var.E1;
                if (vrVar != null) {
                    vrVar.a(b5.d.u());
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f26901c;
                org.telegram.ui.ActionBar.b1 b1Var = photoViewer.F0;
                if (b1Var != null) {
                    b1Var.f(z10);
                    org.telegram.ui.ActionBar.b1 b1Var2 = photoViewer.F0;
                    if (z10) {
                        i10 = 259241196;
                    } else {
                        i10 = 268435455;
                    }
                    b1Var2.setSelectorColor(i10);
                }
                u61 u61Var = photoViewer.F2;
                if (u61Var != null) {
                    if (!b5.d.u() && !photoViewer.f33582r) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    u61Var.t0(z11);
                }
                org.telegram.ui.vr vrVar2 = photoViewer.f33630w0;
                if (vrVar2 != null) {
                    vrVar2.a(b5.d.u());
                    return;
                }
                return;
        }
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
public final class m7 extends bd {
    public final int f30730b;
    public final NotificationCenter.NotificationCenterDelegate f30731c;

    public m7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i9) {
        super(context);
        this.f30730b = i9;
        this.f30731c = notificationCenterDelegate;
    }

    @Override
    public final void c(boolean z10) {
        boolean z11;
        int i9;
        switch (this.f30730b) {
            case 0:
                c8 c8Var = (c8) this.f30731c;
                c8Var.C0();
                org.telegram.ui.nr nrVar = c8Var.K;
                if (nrVar != null) {
                    nrVar.a(d1.f.t());
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f30731c;
                org.telegram.ui.ActionBar.g1 g1Var = photoViewer.B0;
                if (g1Var != null) {
                    g1Var.d(z10);
                    org.telegram.ui.ActionBar.g1 g1Var2 = photoViewer.B0;
                    if (z10) {
                        i9 = 259241196;
                    } else {
                        i9 = 268435455;
                    }
                    g1Var2.setSelectorColor(i9);
                }
                k61 k61Var = photoViewer.B2;
                if (k61Var != null) {
                    if (!d1.f.t() && !photoViewer.f35732r) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    k61Var.P(z11);
                }
                org.telegram.ui.nr nrVar2 = photoViewer.f35743s0;
                if (nrVar2 != null) {
                    nrVar2.a(d1.f.t());
                    return;
                }
                return;
        }
    }
}

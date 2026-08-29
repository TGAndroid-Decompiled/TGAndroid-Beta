package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
public final class r7 extends fd {
    public final int f32227b;
    public final NotificationCenter.NotificationCenterDelegate f32228c;

    public r7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f32227b = i10;
        this.f32228c = notificationCenterDelegate;
    }

    @Override
    public final void c(boolean z10) {
        boolean z11;
        int i10;
        switch (this.f32227b) {
            case 0:
                g8 g8Var = (g8) this.f32228c;
                g8Var.D0();
                org.telegram.ui.nr nrVar = g8Var.K;
                if (nrVar != null) {
                    nrVar.a(d1.f.u());
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f32228c;
                org.telegram.ui.ActionBar.g1 g1Var = photoViewer.B0;
                if (g1Var != null) {
                    g1Var.d(z10);
                    org.telegram.ui.ActionBar.g1 g1Var2 = photoViewer.B0;
                    if (z10) {
                        i10 = 259241196;
                    } else {
                        i10 = 268435455;
                    }
                    g1Var2.setSelectorColor(i10);
                }
                x61 x61Var = photoViewer.B2;
                if (x61Var != null) {
                    if (!d1.f.u() && !photoViewer.f35799r) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    x61Var.P(z11);
                }
                org.telegram.ui.nr nrVar2 = photoViewer.f35809s0;
                if (nrVar2 != null) {
                    nrVar2.a(d1.f.u());
                    return;
                }
                return;
        }
    }
}

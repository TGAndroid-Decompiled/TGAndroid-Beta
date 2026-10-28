package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
public final class w7 extends kd {
    public final int f34463b;
    public final NotificationCenter.NotificationCenterDelegate f34464c;

    public w7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f34463b = i10;
        this.f34464c = notificationCenterDelegate;
    }

    @Override
    public final void c(boolean z10) {
        boolean z11;
        int i10;
        switch (this.f34463b) {
            case 0:
                m8 m8Var = (m8) this.f34464c;
                m8Var.updateColors();
                org.telegram.ui.sr srVar = m8Var.N;
                if (srVar != null) {
                    srVar.a(c5.d.u());
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f34464c;
                org.telegram.ui.ActionBar.g1 g1Var = photoViewer.F0;
                if (g1Var != null) {
                    g1Var.f(z10);
                    org.telegram.ui.ActionBar.g1 g1Var2 = photoViewer.F0;
                    if (z10) {
                        i10 = 259241196;
                    } else {
                        i10 = 268435455;
                    }
                    g1Var2.setSelectorColor(i10);
                }
                t81 t81Var = photoViewer.F2;
                if (t81Var != null) {
                    if (!c5.d.u() && !photoViewer.f35783r) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    t81Var.O(z11);
                }
                org.telegram.ui.sr srVar2 = photoViewer.f35830w0;
                if (srVar2 != null) {
                    srVar2.a(c5.d.u());
                    return;
                }
                return;
        }
    }
}

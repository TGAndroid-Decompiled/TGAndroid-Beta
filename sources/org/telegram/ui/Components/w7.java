package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
public final class w7 extends kd {
    public final int f34382b;
    public final NotificationCenter.NotificationCenterDelegate f34383c;

    public w7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f34382b = i10;
        this.f34383c = notificationCenterDelegate;
    }

    @Override
    public final void c(boolean z10) {
        boolean z11;
        int i10;
        switch (this.f34382b) {
            case 0:
                m8 m8Var = (m8) this.f34383c;
                m8Var.updateColors();
                org.telegram.ui.qr qrVar = m8Var.N;
                if (qrVar != null) {
                    qrVar.a(c5.d.u());
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f34383c;
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
                s81 s81Var = photoViewer.F2;
                if (s81Var != null) {
                    if (!c5.d.u() && !photoViewer.f35759r) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    s81Var.O(z11);
                }
                org.telegram.ui.qr qrVar2 = photoViewer.f35806w0;
                if (qrVar2 != null) {
                    qrVar2.a(c5.d.u());
                    return;
                }
                return;
        }
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
public final class r7 extends kd {
    public final int f27572b;
    public final NotificationCenter.NotificationCenterDelegate f27573c;

    public r7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f27572b = i10;
        this.f27573c = notificationCenterDelegate;
    }

    @Override
    public final void c(boolean z10) {
        boolean z11;
        int i10;
        switch (this.f27572b) {
            case 0:
                h8 h8Var = (h8) this.f27573c;
                h8Var.D0();
                org.telegram.ui.as asVar = h8Var.O;
                if (asVar != null) {
                    asVar.a(b5.d.u());
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f27573c;
                org.telegram.ui.ActionBar.g1 g1Var = photoViewer.F0;
                if (g1Var != null) {
                    g1Var.d(z10);
                    org.telegram.ui.ActionBar.g1 g1Var2 = photoViewer.F0;
                    if (z10) {
                        i10 = 259241196;
                    } else {
                        i10 = 268435455;
                    }
                    g1Var2.setSelectorColor(i10);
                }
                h71 h71Var = photoViewer.F2;
                if (h71Var != null) {
                    if (!b5.d.u() && !photoViewer.f31065r) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    h71Var.O(z11);
                }
                org.telegram.ui.as asVar2 = photoViewer.f31113w0;
                if (asVar2 != null) {
                    asVar2.a(b5.d.u());
                    return;
                }
                return;
        }
    }
}

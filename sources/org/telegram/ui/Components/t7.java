package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
public final class t7 extends kd {
    public final int f27356b;
    public final NotificationCenter.NotificationCenterDelegate f27357c;

    public t7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f27356b = i10;
        this.f27357c = notificationCenterDelegate;
    }

    @Override
    public final void c(boolean z10) {
        boolean z11;
        int i10;
        switch (this.f27356b) {
            case 0:
                j8 j8Var = (j8) this.f27357c;
                j8Var.D0();
                org.telegram.ui.as asVar = j8Var.O;
                if (asVar != null) {
                    asVar.a(b5.d.u());
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f27357c;
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
                t71 t71Var = photoViewer.F2;
                if (t71Var != null) {
                    if (!b5.d.u() && !photoViewer.f30160r) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    t71Var.O(z11);
                }
                org.telegram.ui.as asVar2 = photoViewer.f30208w0;
                if (asVar2 != null) {
                    asVar2.a(b5.d.u());
                    return;
                }
                return;
        }
    }
}

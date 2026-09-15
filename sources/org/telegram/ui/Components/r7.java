package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
public final class r7 extends kd {
    public final int f27583b;
    public final NotificationCenter.NotificationCenterDelegate f27584c;

    public r7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f27583b = i10;
        this.f27584c = notificationCenterDelegate;
    }

    @Override
    public final void c(boolean z10) {
        boolean z11;
        int i10;
        switch (this.f27583b) {
            case 0:
                h8 h8Var = (h8) this.f27584c;
                h8Var.D0();
                org.telegram.ui.yr yrVar = h8Var.O;
                if (yrVar != null) {
                    yrVar.a(b5.d.u());
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f27584c;
                org.telegram.ui.ActionBar.f1 f1Var = photoViewer.F0;
                if (f1Var != null) {
                    f1Var.d(z10);
                    org.telegram.ui.ActionBar.f1 f1Var2 = photoViewer.F0;
                    if (z10) {
                        i10 = 259241196;
                    } else {
                        i10 = 268435455;
                    }
                    f1Var2.setSelectorColor(i10);
                }
                g71 g71Var = photoViewer.F2;
                if (g71Var != null) {
                    if (!b5.d.u() && !photoViewer.f31047r) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    g71Var.O(z11);
                }
                org.telegram.ui.yr yrVar2 = photoViewer.f31095w0;
                if (yrVar2 != null) {
                    yrVar2.a(b5.d.u());
                    return;
                }
                return;
        }
    }
}

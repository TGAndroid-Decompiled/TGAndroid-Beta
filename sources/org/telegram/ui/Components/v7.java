package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
public final class v7 extends pd {
    public final int f31446b;
    public final NotificationCenter.NotificationCenterDelegate f31447c;

    public v7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f31446b = i10;
        this.f31447c = notificationCenterDelegate;
    }

    @Override
    public final void c(boolean z10) {
        boolean z11;
        int i10;
        switch (this.f31446b) {
            case 0:
                l8 l8Var = (l8) this.f31447c;
                l8Var.e();
                org.telegram.ui.as asVar = l8Var.O;
                if (asVar != null) {
                    asVar.a(b5.d.u());
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f31447c;
                org.telegram.ui.ActionBar.e1 e1Var = photoViewer.F0;
                if (e1Var != null) {
                    e1Var.d(z10);
                    org.telegram.ui.ActionBar.e1 e1Var2 = photoViewer.F0;
                    if (z10) {
                        i10 = 259241196;
                    } else {
                        i10 = 268435455;
                    }
                    e1Var2.setSelectorColor(i10);
                }
                q81 q81Var = photoViewer.F2;
                if (q81Var != null) {
                    if (!b5.d.u() && !photoViewer.f33852r) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    q81Var.O(z11);
                }
                org.telegram.ui.as asVar2 = photoViewer.f33900w0;
                if (asVar2 != null) {
                    asVar2.a(b5.d.u());
                    return;
                }
                return;
        }
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
public final class v7 extends pd {
    public final int f31701b;
    public final NotificationCenter.NotificationCenterDelegate f31702c;

    public v7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f31701b = i10;
        this.f31702c = notificationCenterDelegate;
    }

    @Override
    public final void c(boolean z10) {
        boolean z11;
        int i10;
        switch (this.f31701b) {
            case 0:
                l8 l8Var = (l8) this.f31702c;
                l8Var.e();
                org.telegram.ui.xr xrVar = l8Var.O;
                if (xrVar != null) {
                    xrVar.a(b5.d.u());
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f31702c;
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
                k81 k81Var = photoViewer.F2;
                if (k81Var != null) {
                    if (!b5.d.u() && !photoViewer.f34015r) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    k81Var.O(z11);
                }
                org.telegram.ui.xr xrVar2 = photoViewer.f34063w0;
                if (xrVar2 != null) {
                    xrVar2.a(b5.d.u());
                    return;
                }
                return;
        }
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
public final class t7 extends nd {
    public final int f31071b;
    public final NotificationCenter.NotificationCenterDelegate f31072c;

    public t7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f31071b = i10;
        this.f31072c = notificationCenterDelegate;
    }

    @Override
    public final void c(boolean z10) {
        boolean z11;
        int i10;
        switch (this.f31071b) {
            case 0:
                j8 j8Var = (j8) this.f31072c;
                j8Var.D0();
                org.telegram.ui.xr xrVar = j8Var.O;
                if (xrVar != null) {
                    xrVar.a(b5.d.u());
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f31072c;
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
                e81 e81Var = photoViewer.F2;
                if (e81Var != null) {
                    if (!b5.d.u() && !photoViewer.f34025r) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    e81Var.O(z11);
                }
                org.telegram.ui.xr xrVar2 = photoViewer.f34073w0;
                if (xrVar2 != null) {
                    xrVar2.a(b5.d.u());
                    return;
                }
                return;
        }
    }
}

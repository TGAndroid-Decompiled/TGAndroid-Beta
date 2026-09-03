package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
public final class n7 extends cd {
    public final int f27204b;
    public final NotificationCenter.NotificationCenterDelegate f27205c;

    public n7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f27204b = i10;
        this.f27205c = notificationCenterDelegate;
    }

    @Override
    public final void c(boolean z4) {
        boolean z10;
        int i10;
        switch (this.f27204b) {
            case 0:
                c8 c8Var = (c8) this.f27205c;
                c8Var.D0();
                org.telegram.ui.vr vrVar = c8Var.L;
                if (vrVar != null) {
                    vrVar.a(d1.f.u());
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f27205c;
                org.telegram.ui.ActionBar.g1 g1Var = photoViewer.C0;
                if (g1Var != null) {
                    g1Var.d(z4);
                    org.telegram.ui.ActionBar.g1 g1Var2 = photoViewer.C0;
                    if (z4) {
                        i10 = 259241196;
                    } else {
                        i10 = 268435455;
                    }
                    g1Var2.setSelectorColor(i10);
                }
                i71 i71Var = photoViewer.C2;
                if (i71Var != null) {
                    if (!d1.f.u() && !photoViewer.f31822r) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    i71Var.O(z10);
                }
                org.telegram.ui.vr vrVar2 = photoViewer.f31841t0;
                if (vrVar2 != null) {
                    vrVar2.a(d1.f.u());
                    return;
                }
                return;
        }
    }
}

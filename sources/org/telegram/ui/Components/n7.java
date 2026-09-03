package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
public final class n7 extends cd {
    public final int f29406b;
    public final NotificationCenter.NotificationCenterDelegate f29407c;

    public n7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f29406b = i10;
        this.f29407c = notificationCenterDelegate;
    }

    @Override
    public final void c(boolean z4) {
        boolean z10;
        int i10;
        switch (this.f29406b) {
            case 0:
                c8 c8Var = (c8) this.f29407c;
                c8Var.D0();
                org.telegram.ui.ur urVar = c8Var.L;
                if (urVar != null) {
                    urVar.a(d1.f.u());
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f29407c;
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
                j71 j71Var = photoViewer.C2;
                if (j71Var != null) {
                    if (!d1.f.u() && !photoViewer.f34374r) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    j71Var.O(z10);
                }
                org.telegram.ui.ur urVar2 = photoViewer.f34393t0;
                if (urVar2 != null) {
                    urVar2.a(d1.f.u());
                    return;
                }
                return;
        }
    }
}

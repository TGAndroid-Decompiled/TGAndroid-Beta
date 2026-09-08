package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
public final class u7 extends md {
    public final int f30855b;
    public final NotificationCenter.NotificationCenterDelegate f30856c;

    public u7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f30855b = i10;
        this.f30856c = notificationCenterDelegate;
    }

    @Override
    public final void c(boolean z10) {
        boolean z11;
        int i10;
        switch (this.f30855b) {
            case 0:
                k8 k8Var = (k8) this.f30856c;
                k8Var.D0();
                org.telegram.ui.zr zrVar = k8Var.O;
                if (zrVar != null) {
                    zrVar.a(b5.d.u());
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f30856c;
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
                    if (!b5.d.u() && !photoViewer.f33687r) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    g71Var.O(z11);
                }
                org.telegram.ui.zr zrVar2 = photoViewer.f33735w0;
                if (zrVar2 != null) {
                    zrVar2.a(b5.d.u());
                    return;
                }
                return;
        }
    }
}

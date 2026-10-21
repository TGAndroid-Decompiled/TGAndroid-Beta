package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
public final class u7 extends ld {
    public final int f30866b;
    public final NotificationCenter.NotificationCenterDelegate f30867c;

    public u7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f30866b = i10;
        this.f30867c = notificationCenterDelegate;
    }

    @Override
    public final void c(boolean z10) {
        boolean z11;
        int i10;
        switch (this.f30866b) {
            case 0:
                k8 k8Var = (k8) this.f30867c;
                k8Var.d();
                org.telegram.ui.lr lrVar = k8Var.O;
                if (lrVar != null) {
                    lrVar.a(b5.d.u());
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f30867c;
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
                c81 c81Var = photoViewer.F2;
                if (c81Var != null) {
                    if (!b5.d.u() && !photoViewer.f33391r) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    c81Var.O(z11);
                }
                org.telegram.ui.lr lrVar2 = photoViewer.f33439w0;
                if (lrVar2 != null) {
                    lrVar2.a(b5.d.u());
                    return;
                }
                return;
        }
    }
}

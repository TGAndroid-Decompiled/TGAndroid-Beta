package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
public final class v7 extends pd {
    public final int f31824b;
    public final NotificationCenter.NotificationCenterDelegate f31825c;

    public v7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f31824b = i10;
        this.f31825c = notificationCenterDelegate;
    }

    @Override
    public final void c(boolean z10) {
        boolean z11;
        int i10;
        switch (this.f31824b) {
            case 0:
                l8 l8Var = (l8) this.f31825c;
                l8Var.e();
                org.telegram.ui.wr wrVar = l8Var.O;
                if (wrVar != null) {
                    wrVar.a(b5.d.u());
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f31825c;
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
                l81 l81Var = photoViewer.F2;
                if (l81Var != null) {
                    if (!b5.d.u() && !photoViewer.f34077r) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    l81Var.O(z11);
                }
                org.telegram.ui.wr wrVar2 = photoViewer.f34125w0;
                if (wrVar2 != null) {
                    wrVar2.a(b5.d.u());
                    return;
                }
                return;
        }
    }
}

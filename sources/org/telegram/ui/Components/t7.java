package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
public final class t7 extends ld {
    public final int f28339b;
    public final NotificationCenter.NotificationCenterDelegate f28340c;

    public t7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f28339b = i10;
        this.f28340c = notificationCenterDelegate;
    }

    @Override
    public final void c(boolean z10) {
        boolean z11;
        int i10;
        switch (this.f28339b) {
            case 0:
                j8 j8Var = (j8) this.f28340c;
                j8Var.D0();
                org.telegram.ui.yr yrVar = j8Var.O;
                if (yrVar != null) {
                    yrVar.a(b5.d.u());
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f28340c;
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
                u71 u71Var = photoViewer.F2;
                if (u71Var != null) {
                    if (!b5.d.u() && !photoViewer.f31292r) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    u71Var.O(z11);
                }
                org.telegram.ui.yr yrVar2 = photoViewer.f31340w0;
                if (yrVar2 != null) {
                    yrVar2.a(b5.d.u());
                    return;
                }
                return;
        }
    }
}

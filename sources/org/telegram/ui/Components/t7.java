package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
public final class t7 extends nd {
    public final int f28484b;
    public final NotificationCenter.NotificationCenterDelegate f28485c;

    public t7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f28484b = i10;
        this.f28485c = notificationCenterDelegate;
    }

    @Override
    public final void c(boolean z10) {
        boolean z11;
        int i10;
        switch (this.f28484b) {
            case 0:
                j8 j8Var = (j8) this.f28485c;
                j8Var.D0();
                org.telegram.ui.tr trVar = j8Var.O;
                if (trVar != null) {
                    trVar.a(b5.d.u());
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f28485c;
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
                u71 u71Var = photoViewer.F2;
                if (u71Var != null) {
                    if (!b5.d.u() && !photoViewer.f31334r) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    u71Var.O(z11);
                }
                org.telegram.ui.tr trVar2 = photoViewer.f31382w0;
                if (trVar2 != null) {
                    trVar2.a(b5.d.u());
                    return;
                }
                return;
        }
    }
}

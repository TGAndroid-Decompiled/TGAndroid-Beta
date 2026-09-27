package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
public final class t7 extends md {
    public final int f28501b;
    public final NotificationCenter.NotificationCenterDelegate f28502c;

    public t7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f28501b = i10;
        this.f28502c = notificationCenterDelegate;
    }

    @Override
    public final void c(boolean z10) {
        boolean z11;
        int i10;
        switch (this.f28501b) {
            case 0:
                j8 j8Var = (j8) this.f28502c;
                j8Var.D0();
                org.telegram.ui.wr wrVar = j8Var.O;
                if (wrVar != null) {
                    wrVar.a(b5.d.u());
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f28502c;
                org.telegram.ui.ActionBar.g1 g1Var = photoViewer.F0;
                if (g1Var != null) {
                    g1Var.d(z10);
                    org.telegram.ui.ActionBar.g1 g1Var2 = photoViewer.F0;
                    if (z10) {
                        i10 = 259241196;
                    } else {
                        i10 = 268435455;
                    }
                    g1Var2.setSelectorColor(i10);
                }
                u71 u71Var = photoViewer.F2;
                if (u71Var != null) {
                    if (!b5.d.u() && !photoViewer.f31336r) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    u71Var.O(z11);
                }
                org.telegram.ui.wr wrVar2 = photoViewer.f31384w0;
                if (wrVar2 != null) {
                    wrVar2.a(b5.d.u());
                    return;
                }
                return;
        }
    }
}

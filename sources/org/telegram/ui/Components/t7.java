package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
public final class t7 extends md {
    public final int f28108b;
    public final NotificationCenter.NotificationCenterDelegate f28109c;

    public t7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f28108b = i10;
        this.f28109c = notificationCenterDelegate;
    }

    @Override
    public final void c(boolean z10) {
        boolean z11;
        int i10;
        switch (this.f28108b) {
            case 0:
                j8 j8Var = (j8) this.f28109c;
                j8Var.D0();
                org.telegram.ui.ur urVar = j8Var.O;
                if (urVar != null) {
                    urVar.a(b5.d.u());
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f28109c;
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
                f71 f71Var = photoViewer.F2;
                if (f71Var != null) {
                    if (!b5.d.u() && !photoViewer.f31019r) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    f71Var.O(z11);
                }
                org.telegram.ui.ur urVar2 = photoViewer.f31067w0;
                if (urVar2 != null) {
                    urVar2.a(b5.d.u());
                    return;
                }
                return;
        }
    }
}

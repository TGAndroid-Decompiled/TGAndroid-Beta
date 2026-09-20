package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
public final class s7 extends md {
    public final int f28068b;
    public final NotificationCenter.NotificationCenterDelegate f28069c;

    public s7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f28068b = i10;
        this.f28069c = notificationCenterDelegate;
    }

    @Override
    public final void c(boolean z10) {
        boolean z11;
        int i10;
        switch (this.f28068b) {
            case 0:
                i8 i8Var = (i8) this.f28069c;
                i8Var.D0();
                org.telegram.ui.yr yrVar = i8Var.O;
                if (yrVar != null) {
                    yrVar.a(b5.d.u());
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f28069c;
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
                t71 t71Var = photoViewer.F2;
                if (t71Var != null) {
                    if (!b5.d.u() && !photoViewer.f31332r) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    t71Var.O(z11);
                }
                org.telegram.ui.yr yrVar2 = photoViewer.f31380w0;
                if (yrVar2 != null) {
                    yrVar2.a(b5.d.u());
                    return;
                }
                return;
        }
    }
}

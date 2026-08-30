package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
public final class n7 extends cd {
    public final int f27208b;
    public final NotificationCenter.NotificationCenterDelegate f27209c;

    public n7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f27208b = i10;
        this.f27209c = notificationCenterDelegate;
    }

    @Override
    public final void c(boolean z4) {
        boolean z10;
        int i10;
        switch (this.f27208b) {
            case 0:
                c8 c8Var = (c8) this.f27209c;
                c8Var.D0();
                org.telegram.ui.tr trVar = c8Var.L;
                if (trVar != null) {
                    trVar.a(d1.f.u());
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f27209c;
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
                    if (!d1.f.u() && !photoViewer.f31848r) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    i71Var.O(z10);
                }
                org.telegram.ui.tr trVar2 = photoViewer.f31867t0;
                if (trVar2 != null) {
                    trVar2.a(d1.f.u());
                    return;
                }
                return;
        }
    }
}

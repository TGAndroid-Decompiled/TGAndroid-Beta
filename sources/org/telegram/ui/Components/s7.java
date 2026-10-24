package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
public final class s7 extends jd {
    public final int f30457b;
    public final NotificationCenter.NotificationCenterDelegate f30458c;

    public s7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f30457b = i10;
        this.f30458c = notificationCenterDelegate;
    }

    @Override
    public final void c(boolean z10) {
        boolean z11;
        int i10;
        switch (this.f30457b) {
            case 0:
                i8 i8Var = (i8) this.f30458c;
                i8Var.updateColors();
                org.telegram.ui.nr nrVar = i8Var.N;
                if (nrVar != null) {
                    nrVar.a(b5.d.u());
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f30458c;
                org.telegram.ui.ActionBar.e1 e1Var = photoViewer.F0;
                if (e1Var != null) {
                    e1Var.f(z10);
                    org.telegram.ui.ActionBar.e1 e1Var2 = photoViewer.F0;
                    if (z10) {
                        i10 = 259241196;
                    } else {
                        i10 = 268435455;
                    }
                    e1Var2.setSelectorColor(i10);
                }
                j81 j81Var = photoViewer.F2;
                if (j81Var != null) {
                    if (!b5.d.u() && !photoViewer.f33694r) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    j81Var.O(z11);
                }
                org.telegram.ui.nr nrVar2 = photoViewer.f33742w0;
                if (nrVar2 != null) {
                    nrVar2.a(b5.d.u());
                    return;
                }
                return;
        }
    }
}

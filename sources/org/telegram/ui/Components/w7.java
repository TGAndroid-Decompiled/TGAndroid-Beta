package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
public final class w7 extends nd {
    public final int f30809b;
    public final NotificationCenter.NotificationCenterDelegate f30810c;

    public w7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f30809b = i10;
        this.f30810c = notificationCenterDelegate;
    }

    @Override
    public final void c(boolean z10) {
        boolean z11;
        int i10;
        switch (this.f30809b) {
            case 0:
                m8 m8Var = (m8) this.f30810c;
                m8Var.d();
                org.telegram.ui.cs csVar = m8Var.O;
                if (csVar != null) {
                    csVar.a(b5.d.u());
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f30810c;
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
                h81 h81Var = photoViewer.F2;
                if (h81Var != null) {
                    if (!b5.d.u() && !photoViewer.f32338r) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    h81Var.O(z11);
                }
                org.telegram.ui.cs csVar2 = photoViewer.f32386w0;
                if (csVar2 != null) {
                    csVar2.a(b5.d.u());
                    return;
                }
                return;
        }
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;

public final class m7 extends yc {

    public final int f30606b;

    public final NotificationCenter.NotificationCenterDelegate f30607c;

    public m7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f30606b = i10;
        this.f30607c = notificationCenterDelegate;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.f30606b) {
            case 0:
                b8 b8Var = (b8) this.f30607c;
                b8Var.D0();
                org.telegram.ui.pr prVar = b8Var.K;
                if (prVar != null) {
                    prVar.a(d1.f.t());
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f30607c;
                org.telegram.ui.ActionBar.f1 f1Var = photoViewer.B0;
                if (f1Var != null) {
                    f1Var.d(z10);
                    photoViewer.B0.setSelectorColor(z10 ? 259241196 : 268435455);
                }
                m61 m61Var = photoViewer.B2;
                if (m61Var != null) {
                    m61Var.P(d1.f.t() || photoViewer.f35735r);
                }
                org.telegram.ui.pr prVar2 = photoViewer.f35746s0;
                if (prVar2 != null) {
                    prVar2.a(d1.f.t());
                }
                break;
        }
    }
}

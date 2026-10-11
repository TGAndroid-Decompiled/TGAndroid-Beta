package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.MessagesController;
public final class pc extends org.telegram.ui.Components.qm0 {
    public final Context f40853c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final int f40854e;
    public final rc f40855f;

    public pc(rc rcVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        this.f40855f = rcVar;
        this.f40853c = context;
        this.d = d6Var;
        this.f40854e = i10;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override
    public final int h() {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f40854e).peerColors;
        if (peerColors == null) {
            return 0;
        }
        return peerColors.colors.size();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        qc qcVar = (qc) d1Var.f47782a;
        qcVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20822d6, this.d));
        if (i10 == this.f40855f.f41445e) {
            z10 = true;
        } else {
            z10 = false;
        }
        qcVar.f41178s = z10;
        qcVar.v.f(z10, true);
        qcVar.invalidate();
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f40854e).peerColors;
        if (peerColors != null && i10 >= 0 && i10 < peerColors.colors.size()) {
            qcVar.a(peerColors.colors.get(i10));
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        return new s4.d1(new qc(this.f40855f, this.f40853c));
    }
}

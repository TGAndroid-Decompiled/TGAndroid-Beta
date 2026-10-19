package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.MessagesController;
public final class pc extends org.telegram.ui.Components.hm0 {
    public final Context f40180c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final int e;
    public final rc f40181f;

    public pc(rc rcVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        this.f40181f = rcVar;
        this.f40180c = context;
        this.d = d6Var;
        this.e = i10;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final int h() {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.e).peerColors;
        if (peerColors == null) {
            return 0;
        }
        return peerColors.colors.size();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        qc qcVar = (qc) b1Var.f45912a;
        qcVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20987d6, this.d));
        if (i10 == this.f40181f.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        qcVar.f40531s = z10;
        qcVar.v.f(z10, true);
        qcVar.invalidate();
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.e).peerColors;
        if (peerColors != null && i10 >= 0 && i10 < peerColors.colors.size()) {
            qcVar.a(peerColors.colors.get(i10));
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new s4.b1(new qc(this.f40181f, this.f40180c));
    }
}

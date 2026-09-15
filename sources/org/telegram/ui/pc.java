package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.MessagesController;
public final class pc extends org.telegram.ui.Components.kl0 {
    public final Context f36536c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final int e;
    public final rc f36537f;

    public pc(rc rcVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        this.f36537f = rcVar;
        this.f36536c = context;
        this.d = e6Var;
        this.e = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
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
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        qc qcVar = (qc) c1Var.f42675a;
        qcVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18836d6, this.d));
        if (i10 == this.f36537f.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        qcVar.f36848s = z10;
        qcVar.v.f(z10, true);
        qcVar.invalidate();
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.e).peerColors;
        if (peerColors != null && i10 >= 0 && i10 < peerColors.colors.size()) {
            qcVar.a(peerColors.colors.get(i10));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new qc(this.f36537f, this.f36536c));
    }
}

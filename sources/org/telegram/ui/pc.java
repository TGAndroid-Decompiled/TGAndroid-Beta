package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.MessagesController;
public final class pc extends org.telegram.ui.Components.rl0 {
    public final Context f39971c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final int f39972e;
    public final rc f39973f;

    public pc(rc rcVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        this.f39973f = rcVar;
        this.f39971c = context;
        this.d = g6Var;
        this.f39972e = i10;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    @Override
    public final int h() {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f39972e).peerColors;
        if (peerColors == null) {
            return 0;
        }
        return peerColors.colors.size();
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
        qc qcVar = (qc) m1Var.f5875a;
        qcVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21661d6, this.d));
        if (i10 == this.f39973f.f40812e) {
            z4 = true;
        } else {
            z4 = false;
        }
        qcVar.f40429s = z4;
        qcVar.v.f(z4, true);
        qcVar.invalidate();
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f39972e).peerColors;
        if (peerColors != null && i10 >= 0 && i10 < peerColors.colors.size()) {
            qcVar.a(peerColors.colors.get(i10));
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        return new f2.m1(new qc(this.f39973f, this.f39971c));
    }
}

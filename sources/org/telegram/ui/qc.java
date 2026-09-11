package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.MessagesController;
public final class qc extends org.telegram.ui.Components.kl0 {
    public final Context f39832c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final int f39833e;
    public final sc f39834f;

    public qc(sc scVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        this.f39834f = scVar;
        this.f39832c = context;
        this.d = f6Var;
        this.f39833e = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f39833e).peerColors;
        if (peerColors == null) {
            return 0;
        }
        return peerColors.colors.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        rc rcVar = (rc) c1Var.f45738a;
        rcVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20663d6, this.d));
        if (i10 == this.f39834f.f40410e) {
            z10 = true;
        } else {
            z10 = false;
        }
        rcVar.f40140s = z10;
        rcVar.v.f(z10, true);
        rcVar.invalidate();
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f39833e).peerColors;
        if (peerColors != null && i10 >= 0 && i10 < peerColors.colors.size()) {
            rcVar.a(peerColors.colors.get(i10));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new rc(this.f39834f, this.f39832c));
    }
}

package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.MessagesController;
public final class qc extends org.telegram.ui.Components.kl0 {
    public final Context f39833c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final int f39834e;
    public final sc f39835f;

    public qc(sc scVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        this.f39835f = scVar;
        this.f39833c = context;
        this.d = f6Var;
        this.f39834e = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f39834e).peerColors;
        if (peerColors == null) {
            return 0;
        }
        return peerColors.colors.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        rc rcVar = (rc) c1Var.f45739a;
        rcVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20664d6, this.d));
        if (i10 == this.f39835f.f40411e) {
            z10 = true;
        } else {
            z10 = false;
        }
        rcVar.f40141s = z10;
        rcVar.v.f(z10, true);
        rcVar.invalidate();
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f39834e).peerColors;
        if (peerColors != null && i10 >= 0 && i10 < peerColors.colors.size()) {
            rcVar.a(peerColors.colors.get(i10));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new rc(this.f39835f, this.f39833c));
    }
}

package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.MessagesController;
public final class qc extends org.telegram.ui.Components.pm0 {
    public final Context f41078c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final int f41079e;
    public final sc f41080f;

    public qc(sc scVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        this.f41080f = scVar;
        this.f41078c = context;
        this.d = e6Var;
        this.f41079e = i10;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override
    public final int h() {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f41079e).peerColors;
        if (peerColors == null) {
            return 0;
        }
        return peerColors.colors.size();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        rc rcVar = (rc) d1Var.f47658a;
        rcVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20797d6, this.d));
        if (i10 == this.f41080f.f41668e) {
            z10 = true;
        } else {
            z10 = false;
        }
        rcVar.f41384s = z10;
        rcVar.v.f(z10, true);
        rcVar.invalidate();
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f41079e).peerColors;
        if (peerColors != null && i10 >= 0 && i10 < peerColors.colors.size()) {
            rcVar.a(peerColors.colors.get(i10));
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        return new s4.d1(new rc(this.f41080f, this.f41078c));
    }
}

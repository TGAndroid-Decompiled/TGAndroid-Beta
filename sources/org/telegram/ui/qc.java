package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.MessagesController;
public final class qc extends org.telegram.ui.Components.ul0 {
    public final Context f36877c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final int e;
    public final sc f36878f;

    public qc(sc scVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        this.f36878f = scVar;
        this.f36877c = context;
        this.d = f6Var;
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
        rc rcVar = (rc) c1Var.f42974a;
        rcVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19094d6, this.d));
        if (i10 == this.f36878f.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        rcVar.f37113s = z10;
        rcVar.v.f(z10, true);
        rcVar.invalidate();
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.e).peerColors;
        if (peerColors != null && i10 >= 0 && i10 < peerColors.colors.size()) {
            rcVar.a(peerColors.colors.get(i10));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new rc(this.f36878f, this.f36877c));
    }
}

package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.MessagesController;
public final class pc extends org.telegram.ui.Components.ll0 {
    public final Context f36081c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final int e;
    public final rc f36082f;

    public pc(rc rcVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        this.f36082f = rcVar;
        this.f36081c = context;
        this.d = d6Var;
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
        qc qcVar = (qc) c1Var.f42627a;
        qcVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18789d6, this.d));
        if (i10 == this.f36082f.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        qcVar.f36392s = z10;
        qcVar.v.f(z10, true);
        qcVar.invalidate();
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.e).peerColors;
        if (peerColors != null && i10 >= 0 && i10 < peerColors.colors.size()) {
            qcVar.a(peerColors.colors.get(i10));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new qc(this.f36082f, this.f36081c));
    }
}

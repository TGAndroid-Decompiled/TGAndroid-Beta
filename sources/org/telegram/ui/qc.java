package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.MessagesController;
public final class qc extends org.telegram.ui.Components.sl0 {
    public final Context f40432c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final int f40433e;
    public final sc f40434f;

    public qc(sc scVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        this.f40434f = scVar;
        this.f40432c = context;
        this.d = g6Var;
        this.f40433e = i10;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    @Override
    public final int h() {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f40433e).peerColors;
        if (peerColors == null) {
            return 0;
        }
        return peerColors.colors.size();
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
        rc rcVar = (rc) m1Var.f5875a;
        rcVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21659d6, this.d));
        if (i10 == this.f40434f.f41227e) {
            z4 = true;
        } else {
            z4 = false;
        }
        rcVar.f40926s = z4;
        rcVar.v.f(z4, true);
        rcVar.invalidate();
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f40433e).peerColors;
        if (peerColors != null && i10 >= 0 && i10 < peerColors.colors.size()) {
            rcVar.a(peerColors.colors.get(i10));
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        return new f2.m1(new rc(this.f40434f, this.f40432c));
    }
}

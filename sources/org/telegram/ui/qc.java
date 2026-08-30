package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.MessagesController;
public final class qc extends org.telegram.ui.Components.rl0 {
    public final Context f37720c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final int e;
    public final sc f37721f;

    public qc(sc scVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        this.f37721f = scVar;
        this.f37720c = context;
        this.d = f6Var;
        this.e = i10;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
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
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        rc rcVar = (rc) l1Var.f5785a;
        rcVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19906d6, this.d));
        if (i10 == this.f37721f.e) {
            z4 = true;
        } else {
            z4 = false;
        }
        rcVar.f37979s = z4;
        rcVar.v.f(z4, true);
        rcVar.invalidate();
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.e).peerColors;
        if (peerColors != null && i10 >= 0 && i10 < peerColors.colors.size()) {
            rcVar.a(peerColors.colors.get(i10));
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        return new f2.l1(new rc(this.f37721f, this.f37720c));
    }
}

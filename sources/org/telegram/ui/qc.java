package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.MessagesController;
public final class qc extends org.telegram.ui.Components.lm0 {
    public final Context f42803c;
    public final org.telegram.ui.ActionBar.u6 d;
    public final int e;
    public final sc f42804f;

    public qc(sc scVar, Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        this.f42804f = scVar;
        this.f42803c = context;
        this.d = u6Var;
        this.e = i10;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
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
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        rc rcVar = (rc) e1Var.f47735a;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23354d6, rcVar, this.d);
        if (i10 == this.f42804f.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        rcVar.f43109s = z10;
        rcVar.v.f(z10, true);
        rcVar.invalidate();
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.e).peerColors;
        if (peerColors != null && i10 >= 0 && i10 < peerColors.colors.size()) {
            rcVar.a(peerColors.colors.get(i10));
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        return new s4.e1(new rc(this.f42804f, this.f42803c));
    }
}

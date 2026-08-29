package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.MessagesController;
public final class kc extends org.telegram.ui.Components.il0 {
    public final Context f39830c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final int f39831e;
    public final mc f39832f;

    public kc(mc mcVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        this.f39832f = mcVar;
        this.f39830c = context;
        this.d = c6Var;
        this.f39831e = i10;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    @Override
    public final int h() {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f39831e).peerColors;
        if (peerColors == null) {
            return 0;
        }
        return peerColors.colors.size();
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        lc lcVar = (lc) n1Var.f6432a;
        lcVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, this.d));
        if (i10 == this.f39832f.f40522e) {
            z10 = true;
        } else {
            z10 = false;
        }
        lcVar.f40162s = z10;
        lcVar.v.f(z10, true);
        lcVar.invalidate();
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f39831e).peerColors;
        if (peerColors != null && i10 >= 0 && i10 < peerColors.colors.size()) {
            lcVar.a(peerColors.colors.get(i10));
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        return new f2.n1(new lc(this.f39832f, this.f39830c));
    }
}

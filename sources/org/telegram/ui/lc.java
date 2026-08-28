package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.MessagesController;
public final class lc extends org.telegram.ui.Components.vk0 {
    public final Context f40104c;
    public final org.telegram.ui.ActionBar.b6 d;
    public final int f40105e;
    public final nc f40106f;

    public lc(nc ncVar, Context context, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        this.f40106f = ncVar;
        this.f40104c = context;
        this.d = b6Var;
        this.f40105e = i9;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override
    public final int h() {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f40105e).peerColors;
        if (peerColors == null) {
            return 0;
        }
        return peerColors.colors.size();
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        mc mcVar = (mc) q1Var.f5501a;
        mcVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, this.d));
        if (i9 == this.f40106f.f40695e) {
            z10 = true;
        } else {
            z10 = false;
        }
        mcVar.f40388s = z10;
        mcVar.v.f(z10, true);
        mcVar.invalidate();
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f40105e).peerColors;
        if (peerColors != null && i9 >= 0 && i9 < peerColors.colors.size()) {
            mcVar.a(peerColors.colors.get(i9));
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        return new f2.q1(new mc(this.f40106f, this.f40104c));
    }
}

package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.MessagesController;

public final class mc extends org.telegram.ui.Components.yk0 {

    public final Context f40439c;
    public final org.telegram.ui.ActionBar.c6 d;

    public final int f40440e;

    public final oc f40441f;

    public mc(oc ocVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        this.f40441f = ocVar;
        this.f40439c = context;
        this.d = c6Var;
        this.f40440e = i10;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    @Override
    public final int h() {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f40440e).peerColors;
        if (peerColors == null) {
            return 0;
        }
        return peerColors.colors.size();
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        nc ncVar = (nc) o1Var.f5789a;
        ncVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, this.d));
        boolean z10 = i10 == this.f40441f.f41060e;
        ncVar.f40727s = z10;
        ncVar.v.f(z10, true);
        ncVar.invalidate();
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f40440e).peerColors;
        if (peerColors == null || i10 < 0 || i10 >= peerColors.colors.size()) {
            return;
        }
        ncVar.a(peerColors.colors.get(i10));
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.lk0(new nc(this.f40441f, this.f40439c));
    }
}

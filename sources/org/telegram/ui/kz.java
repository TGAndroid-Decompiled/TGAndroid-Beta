package org.telegram.ui;

import org.telegram.tgnet.tl.TL_chatlists;
public final class kz implements org.telegram.messenger.r20 {
    public final int f39033a;
    public final h00 f39034b;

    public kz(h00 h00Var, int i10) {
        this.f39033a = i10;
        this.f39034b = h00Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f39033a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f39034b.finishFragment();
                return;
            case 1:
                this.f39034b.s0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f39034b.r0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}

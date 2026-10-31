package org.telegram.ui;

import org.telegram.tgnet.tl.TL_chatlists;
public final class lz implements org.telegram.messenger.q20 {
    public final int f39443a;
    public final i00 f39444b;

    public lz(i00 i00Var, int i10) {
        this.f39443a = i10;
        this.f39444b = i00Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f39443a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f39444b.finishFragment();
                return;
            case 1:
                this.f39444b.r0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f39444b.q0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}

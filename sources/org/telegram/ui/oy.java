package org.telegram.ui;

import org.telegram.tgnet.tl.TL_chatlists;
public final class oy implements org.telegram.messenger.y10 {
    public final int f50653a;
    public final kz f50654b;

    public oy(kz kzVar, int i7) {
        this.f50653a = i7;
        this.f50654b = kzVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f50653a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f50654b.finishFragment();
                return;
            case 1:
                this.f50654b.s0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f50654b.r0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}

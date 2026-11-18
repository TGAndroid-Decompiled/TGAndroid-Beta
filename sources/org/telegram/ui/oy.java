package org.telegram.ui;

import org.telegram.tgnet.tl.TL_chatlists;
public final class oy implements org.telegram.messenger.x10 {
    public final int f50635a;
    public final kz f50636b;

    public oy(kz kzVar, int i7) {
        this.f50635a = i7;
        this.f50636b = kzVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f50635a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f50636b.finishFragment();
                return;
            case 1:
                this.f50636b.s0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f50636b.r0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}

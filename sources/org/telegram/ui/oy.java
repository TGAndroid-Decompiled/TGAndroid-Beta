package org.telegram.ui;

import org.telegram.tgnet.tl.TL_chatlists;
public final class oy implements org.telegram.messenger.x10 {
    public final int f50668a;
    public final kz f50669b;

    public oy(kz kzVar, int i7) {
        this.f50668a = i7;
        this.f50669b = kzVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f50668a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f50669b.finishFragment();
                return;
            case 1:
                this.f50669b.s0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f50669b.r0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}

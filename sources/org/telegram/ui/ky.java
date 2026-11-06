package org.telegram.ui;

import org.telegram.tgnet.tl.TL_chatlists;
public final class ky implements org.telegram.messenger.c20 {
    public final int f47345a;
    public final gz f47346b;

    public ky(gz gzVar, int i7) {
        this.f47345a = i7;
        this.f47346b = gzVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f47345a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f47346b.finishFragment();
                return;
            case 1:
                this.f47346b.s0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f47346b.r0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}

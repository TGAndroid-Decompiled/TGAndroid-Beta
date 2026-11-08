package org.telegram.ui;

import org.telegram.tgnet.tl.TL_chatlists;
public final class ky implements org.telegram.messenger.c20 {
    public final int f47349a;
    public final gz f47350b;

    public ky(gz gzVar, int i7) {
        this.f47349a = i7;
        this.f47350b = gzVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f47349a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f47350b.finishFragment();
                return;
            case 1:
                this.f47350b.s0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f47350b.r0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}

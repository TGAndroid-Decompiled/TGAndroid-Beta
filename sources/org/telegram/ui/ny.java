package org.telegram.ui;

import org.telegram.tgnet.tl.TL_chatlists;
public final class ny implements org.telegram.messenger.c20 {
    public final int f48324a;
    public final jz f48325b;

    public ny(jz jzVar, int i7) {
        this.f48324a = i7;
        this.f48325b = jzVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f48324a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f48325b.finishFragment();
                return;
            case 1:
                this.f48325b.s0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f48325b.r0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}

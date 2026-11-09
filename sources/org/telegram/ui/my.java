package org.telegram.ui;

import org.telegram.tgnet.tl.TL_chatlists;
public final class my implements org.telegram.messenger.c20 {
    public final int f48027a;
    public final iz f48028b;

    public my(iz izVar, int i7) {
        this.f48027a = i7;
        this.f48028b = izVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f48027a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f48028b.finishFragment();
                return;
            case 1:
                this.f48028b.s0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f48028b.r0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}

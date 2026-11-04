package org.telegram.ui;

import org.telegram.tgnet.tl.TL_chatlists;
public final class gy implements org.telegram.messenger.u10 {
    public final int f45727a;
    public final ez f45728b;

    public gy(ez ezVar, int i3) {
        this.f45727a = i3;
        this.f45728b = ezVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f45727a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f45728b.finishFragment();
                return;
            case 1:
                this.f45728b.s0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f45728b.r0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}

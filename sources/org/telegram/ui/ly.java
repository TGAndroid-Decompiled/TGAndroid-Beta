package org.telegram.ui;

import org.telegram.tgnet.tl.TL_chatlists;
public final class ly implements org.telegram.messenger.z10 {
    public final int f49059a;
    public final hz f49060b;

    public ly(hz hzVar, int i7) {
        this.f49059a = i7;
        this.f49060b = hzVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f49059a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f49060b.finishFragment();
                return;
            case 1:
                this.f49060b.s0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f49060b.r0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}

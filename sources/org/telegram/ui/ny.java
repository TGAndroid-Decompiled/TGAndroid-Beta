package org.telegram.ui;

import org.telegram.tgnet.tl.TL_chatlists;
public final class ny implements org.telegram.messenger.w10 {
    public final int f50444a;
    public final jz f50445b;

    public ny(jz jzVar, int i7) {
        this.f50444a = i7;
        this.f50445b = jzVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f50444a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f50445b.finishFragment();
                return;
            case 1:
                this.f50445b.s0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f50445b.r0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}

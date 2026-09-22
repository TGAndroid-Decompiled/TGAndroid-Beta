package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;
public final class f00 implements Utilities.Callback {
    public final int f33454a;
    public final f10 f33455b;

    public f00(f10 f10Var, int i10) {
        this.f33454a = i10;
        this.f33455b = f10Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33454a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f33455b.finishFragment();
                return;
            case 1:
                this.f33455b.m0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f33455b.l0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}

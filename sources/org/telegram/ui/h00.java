package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;
public final class h00 implements Utilities.Callback {
    public final int f33229a;
    public final h10 f33230b;

    public h00(h10 h10Var, int i10) {
        this.f33229a = i10;
        this.f33230b = h10Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33229a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f33230b.finishFragment();
                return;
            case 1:
                this.f33230b.m0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f33230b.l0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}

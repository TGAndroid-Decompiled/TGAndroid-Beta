package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;
public final class d00 implements Utilities.Callback {
    public final int f33279a;
    public final c10 f33280b;

    public d00(c10 c10Var, int i10) {
        this.f33279a = i10;
        this.f33280b = c10Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33279a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f33280b.finishFragment();
                return;
            case 1:
                this.f33280b.m0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f33280b.l0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}

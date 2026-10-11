package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;
public final class e00 implements Utilities.Callback {
    public final int f37199a;
    public final e10 f37200b;

    public e00(e10 e10Var, int i10) {
        this.f37199a = i10;
        this.f37200b = e10Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37199a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f37200b.finishFragment();
                return;
            case 1:
                this.f37200b.m0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f37200b.l0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}

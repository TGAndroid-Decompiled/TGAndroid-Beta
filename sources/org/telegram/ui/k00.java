package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;
public final class k00 implements Utilities.Callback {
    public final int f37480a;
    public final l10 f37481b;

    public k00(l10 l10Var, int i10) {
        this.f37480a = i10;
        this.f37481b = l10Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37480a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f37481b.finishFragment();
                return;
            case 1:
                this.f37481b.m0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f37481b.l0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}

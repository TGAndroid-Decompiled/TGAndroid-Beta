package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;
public final class oz implements Utilities.Callback {
    public final int f41281a;
    public final n00 f41282b;

    public oz(n00 n00Var, int i9) {
        this.f41281a = i9;
        this.f41282b = n00Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f41281a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f41282b.finishFragment();
                return;
            case 1:
                this.f41282b.l0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f41282b.k0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}

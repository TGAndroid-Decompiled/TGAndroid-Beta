package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;
public final class oz implements Utilities.Callback {
    public final int f40006a;
    public final n00 f40007b;

    public oz(n00 n00Var, int i10) {
        this.f40006a = i10;
        this.f40007b = n00Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40006a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f40007b.finishFragment();
                return;
            case 1:
                this.f40007b.m0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f40007b.l0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}

package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;
public final class oz implements Utilities.Callback {
    public final int f40015a;
    public final n00 f40016b;

    public oz(n00 n00Var, int i10) {
        this.f40015a = i10;
        this.f40016b = n00Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40015a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f40016b.finishFragment();
                return;
            case 1:
                this.f40016b.m0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f40016b.l0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}

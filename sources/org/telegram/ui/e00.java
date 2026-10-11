package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;
public final class e00 implements Utilities.Callback {
    public final int f37165a;
    public final e10 f37166b;

    public e00(e10 e10Var, int i10) {
        this.f37165a = i10;
        this.f37166b = e10Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37165a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f37166b.finishFragment();
                return;
            case 1:
                this.f37166b.m0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f37166b.l0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}

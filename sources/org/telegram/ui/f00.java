package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;
public final class f00 implements Utilities.Callback {
    public final int f33385a;
    public final f10 f33386b;

    public f00(f10 f10Var, int i10) {
        this.f33385a = i10;
        this.f33386b = f10Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33385a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f33386b.finishFragment();
                return;
            case 1:
                this.f33386b.m0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f33386b.l0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}

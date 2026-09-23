package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;
public final class c00 implements Utilities.Callback {
    public final int f32208a;
    public final c10 f32209b;

    public c00(c10 c10Var, int i10) {
        this.f32208a = i10;
        this.f32209b = c10Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f32208a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f32209b.finishFragment();
                return;
            case 1:
                this.f32209b.m0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f32209b.l0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}

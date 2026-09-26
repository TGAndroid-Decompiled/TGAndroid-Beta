package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;
public final class b00 implements Utilities.Callback {
    public final int f32266a;
    public final b10 f32267b;

    public b00(b10 b10Var, int i10) {
        this.f32266a = i10;
        this.f32267b = b10Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f32266a) {
            case 0:
                Boolean bool = (Boolean) obj;
                this.f32267b.finishFragment();
                return;
            case 1:
                this.f32267b.m0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
            default:
                this.f32267b.l0((TL_chatlists.TL_exportedChatlistInvite) obj);
                return;
        }
    }
}

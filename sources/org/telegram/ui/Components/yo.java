package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.id1;
public final class yo implements id1 {
    public final int f31082a;
    public final zo f31083b;

    public yo(zo zoVar, int i10) {
        this.f31082a = i10;
        this.f31083b = zoVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f31082a) {
            case 0:
                jp jpVar = this.f31083b.f31439a;
                jpVar.V.dismissInternal();
                jpVar.dismiss();
                return;
            default:
                jp jpVar2 = this.f31083b.f31439a;
                jpVar2.V.dismissInternal();
                jpVar2.dismiss();
                return;
        }
    }
}

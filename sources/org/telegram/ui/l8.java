package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class l8 implements View.OnClickListener {
    public final int f48891a;
    public final i9 f48892b;

    public l8(i9 i9Var, int i7) {
        this.f48891a = i7;
        this.f48892b = i9Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f48891a) {
            case 0:
                Long l10 = (Long) view.getTag();
                i9 i9Var = this.f48892b;
                org.telegram.messenger.r3 g12 = i9Var.getMessagesController().g1(l10.longValue(), false, null);
                TLRPC.Chat M0 = i9Var.getMessagesController().M0(l10);
                i9Var.N = M0;
                if (g12 != null) {
                    org.telegram.ui.Components.voip.c2.l(M0, null, false, null, i9Var.getParentActivity(), i9Var, i9Var.getAccountInstance());
                    return;
                }
                i9Var.O = l10;
                i9Var.getMessagesController().V2(0, l10.longValue(), true);
                return;
            default:
                i9 i9Var2 = this.f48892b;
                i9Var2.getClass();
                i9.l0(i9Var2);
                return;
        }
    }
}

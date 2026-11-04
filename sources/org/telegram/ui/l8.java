package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class l8 implements View.OnClickListener {
    public final int f47212a;
    public final h9 f47213b;

    public l8(h9 h9Var, int i3) {
        this.f47212a = i3;
        this.f47213b = h9Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47212a) {
            case 0:
                Long l10 = (Long) view.getTag();
                h9 h9Var = this.f47213b;
                org.telegram.messenger.r3 g12 = h9Var.getMessagesController().g1(l10.longValue(), false, null);
                TLRPC.Chat M0 = h9Var.getMessagesController().M0(l10);
                h9Var.N = M0;
                if (g12 != null) {
                    org.telegram.ui.Components.voip.n1.l(M0, null, false, null, h9Var.getParentActivity(), h9Var, h9Var.getAccountInstance());
                    return;
                }
                h9Var.O = l10;
                h9Var.getMessagesController().V2(0, l10.longValue(), true);
                return;
            default:
                h9 h9Var2 = this.f47213b;
                h9Var2.getClass();
                h9.l0(h9Var2);
                return;
        }
    }
}

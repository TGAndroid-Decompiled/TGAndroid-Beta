package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class l8 implements View.OnClickListener {
    public final int f49473a;
    public final i9 f49474b;

    public l8(i9 i9Var, int i7) {
        this.f49473a = i7;
        this.f49474b = i9Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f49473a) {
            case 0:
                Long l10 = (Long) view.getTag();
                i9 i9Var = this.f49474b;
                org.telegram.messenger.t3 i12 = i9Var.getMessagesController().i1(l10.longValue(), false, null);
                TLRPC.Chat O0 = i9Var.getMessagesController().O0(l10);
                i9Var.M = O0;
                if (i12 != null) {
                    org.telegram.ui.Components.voip.b2.l(O0, null, false, null, i9Var.getParentActivity(), i9Var, i9Var.getAccountInstance());
                    return;
                }
                i9Var.N = l10;
                i9Var.getMessagesController().b3(0, l10.longValue(), true);
                return;
            default:
                i9 i9Var2 = this.f49474b;
                i9Var2.getClass();
                i9.l0(i9Var2);
                return;
        }
    }
}

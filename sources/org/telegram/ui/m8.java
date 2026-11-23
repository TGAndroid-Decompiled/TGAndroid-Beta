package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class m8 implements View.OnClickListener {
    public final int f50007a;
    public final j9 f50008b;

    public m8(j9 j9Var, int i7) {
        this.f50007a = i7;
        this.f50008b = j9Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50007a) {
            case 0:
                Long l10 = (Long) view.getTag();
                j9 j9Var = this.f50008b;
                org.telegram.messenger.t3 i12 = j9Var.getMessagesController().i1(l10.longValue(), false, null);
                TLRPC.Chat O0 = j9Var.getMessagesController().O0(l10);
                j9Var.M = O0;
                if (i12 != null) {
                    org.telegram.ui.Components.voip.c2.l(O0, null, false, null, j9Var.getParentActivity(), j9Var, j9Var.getAccountInstance());
                    return;
                }
                j9Var.N = l10;
                j9Var.getMessagesController().b3(0, l10.longValue(), true);
                return;
            default:
                j9 j9Var2 = this.f50008b;
                j9Var2.getClass();
                j9.l0(j9Var2);
                return;
        }
    }
}

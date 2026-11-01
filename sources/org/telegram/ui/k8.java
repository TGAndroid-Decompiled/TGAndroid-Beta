package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class k8 implements View.OnClickListener {
    public final int f38673a;
    public final j9 f38674b;

    public k8(j9 j9Var, int i10) {
        this.f38673a = i10;
        this.f38674b = j9Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38673a) {
            case 0:
                Long l4 = (Long) view.getTag();
                j9 j9Var = this.f38674b;
                org.telegram.messenger.u3 f12 = j9Var.getMessagesController().f1(l4.longValue(), false, null);
                TLRPC.Chat L0 = j9Var.getMessagesController().L0(l4);
                j9Var.M = L0;
                if (f12 != null) {
                    org.telegram.ui.Components.voip.n1.l(L0, null, false, null, j9Var.getParentActivity(), j9Var, j9Var.getAccountInstance());
                    return;
                }
                j9Var.N = l4;
                j9Var.getMessagesController().T2(0, l4.longValue(), true);
                return;
            default:
                j9 j9Var2 = this.f38674b;
                j9Var2.getClass();
                j9.l0(j9Var2);
                return;
        }
    }
}

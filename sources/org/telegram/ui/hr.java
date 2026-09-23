package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hr implements w60 {
    public final b70 f33905a;
    public final qr f33906b;

    public hr(qr qrVar, b70 b70Var) {
        this.f33906b = qrVar;
        this.f33905a = b70Var;
    }

    @Override
    public final void i(TLRPC.User user) {
        this.f33906b.t0(user.f18230id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void j(int i10, ArrayList arrayList) {
        if (this.f33905a.getParentActivity() == null) {
            return;
        }
        qr qrVar = this.f33906b;
        qrVar.getMessagesController().addUsersToChat(qrVar.f36582r, qrVar, arrayList, i10, new h3(this, 2), new gr(0), null);
    }
}

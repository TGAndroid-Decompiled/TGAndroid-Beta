package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hr implements u60 {
    public final z60 f37465a;
    public final qr f37466b;

    public hr(qr qrVar, z60 z60Var) {
        this.f37466b = qrVar;
        this.f37465a = z60Var;
    }

    @Override
    public final void h(TLRPC.User user) {
        this.f37466b.t0(user.f20992id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void i(int i10, ArrayList arrayList) {
        if (this.f37465a.getParentActivity() == null) {
            return;
        }
        qr qrVar = this.f37466b;
        qrVar.getMessagesController().addUsersToChat(qrVar.f40605r, qrVar, arrayList, i10, new j3(this, 2), new gr(0), null);
    }
}

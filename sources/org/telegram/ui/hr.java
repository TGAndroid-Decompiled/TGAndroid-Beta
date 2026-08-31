package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hr implements u60 {
    public final z60 f37602a;
    public final qr f37603b;

    public hr(qr qrVar, z60 z60Var) {
        this.f37603b = qrVar;
        this.f37602a = z60Var;
    }

    @Override
    public final void h(TLRPC.User user) {
        this.f37603b.t0(user.f20990id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void i(int i10, ArrayList arrayList) {
        if (this.f37602a.getParentActivity() == null) {
            return;
        }
        qr qrVar = this.f37603b;
        qrVar.getMessagesController().addUsersToChat(qrVar.f40637r, qrVar, arrayList, i10, new j3(this, 2), new gr(0), null);
    }
}

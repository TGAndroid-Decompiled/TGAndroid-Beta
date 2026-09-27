package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hr implements x60 {
    public final c70 f34270a;
    public final qr f34271b;

    public hr(qr qrVar, c70 c70Var) {
        this.f34271b = qrVar;
        this.f34270a = c70Var;
    }

    @Override
    public final void c(TLRPC.User user) {
        this.f34271b.t0(user.f18476id, null, null, null, "", true, 0, false);
    }

    @Override
    public final void i(int i10, ArrayList arrayList) {
        if (this.f34270a.getParentActivity() == null) {
            return;
        }
        qr qrVar = this.f34271b;
        qrVar.getMessagesController().addUsersToChat(qrVar.f36854r, qrVar, arrayList, i10, new i3(this, 2), new gr(0), null);
    }
}

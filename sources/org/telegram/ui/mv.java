package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class mv implements qy, ft {
    public final pv f35894a;

    public mv(pv pvVar) {
        this.f35894a = pvVar;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean K(wy wyVar) {
        return false;
    }

    @Override
    public void b(TLRPC.User user) {
        this.f35894a.l0(user);
    }

    @Override
    public boolean u(wy wyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        if (!arrayList.isEmpty()) {
            long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            if (DialogObject.isUserDialog(j3)) {
                pv pvVar = this.f35894a;
                pvVar.l0(pvVar.getMessagesController().getUser(Long.valueOf(j3)));
                return true;
            }
            return true;
        }
        return true;
    }
}

package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class mv implements qy, et {
    public final pv f35064a;

    public mv(pv pvVar) {
        this.f35064a = pvVar;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean J(wy wyVar) {
        return false;
    }

    @Override
    public void b(TLRPC.User user) {
        this.f35064a.l0(user);
    }

    @Override
    public boolean v(wy wyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ig1 ig1Var) {
        if (!arrayList.isEmpty()) {
            long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            if (DialogObject.isUserDialog(j3)) {
                pv pvVar = this.f35064a;
                pvVar.l0(pvVar.getMessagesController().getUser(Long.valueOf(j3)));
                return true;
            }
            return true;
        }
        return true;
    }
}

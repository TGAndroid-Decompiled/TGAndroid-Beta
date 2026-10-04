package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class kv implements oy, bt {
    public final nv f38099a;

    public kv(nv nvVar) {
        this.f38099a = nvVar;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean H(uy uyVar) {
        return false;
    }

    @Override
    public void b(TLRPC.User user) {
        this.f38099a.l0(user);
    }

    @Override
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, yf1 yf1Var) {
        if (!arrayList.isEmpty()) {
            long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            if (DialogObject.isUserDialog(j3)) {
                nv nvVar = this.f38099a;
                nvVar.l0(nvVar.getMessagesController().getUser(Long.valueOf(j3)));
                return true;
            }
            return true;
        }
        return true;
    }
}

package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class hv implements ly, zs {
    public final kv f33932a;

    public hv(kv kvVar) {
        this.f33932a = kvVar;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean K(ry ryVar) {
        return false;
    }

    @Override
    public void b(TLRPC.User user) {
        this.f33932a.l0(user);
    }

    @Override
    public boolean u(ry ryVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        if (!arrayList.isEmpty()) {
            long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            if (DialogObject.isUserDialog(j3)) {
                kv kvVar = this.f33932a;
                kvVar.l0(kvVar.getMessagesController().getUser(Long.valueOf(j3)));
                return true;
            }
            return true;
        }
        return true;
    }
}

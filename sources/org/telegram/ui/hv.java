package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class hv implements iy, zs {
    public final kv f34954a;

    public hv(kv kvVar) {
        this.f34954a = kvVar;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean K(oy oyVar) {
        return false;
    }

    @Override
    public void b(TLRPC.User user) {
        this.f34954a.l0(user);
    }

    @Override
    public boolean w(oy oyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, kf1 kf1Var) {
        if (!arrayList.isEmpty()) {
            long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            if (DialogObject.isUserDialog(j10)) {
                kv kvVar = this.f34954a;
                kvVar.l0(kvVar.getMessagesController().getUser(Long.valueOf(j10)));
                return true;
            }
            return true;
        }
        return true;
    }
}

package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class gv implements ky, xs {
    public final jv f34064a;

    public gv(jv jvVar) {
        this.f34064a = jvVar;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean K(qy qyVar) {
        return false;
    }

    @Override
    public void b(TLRPC.User user) {
        this.f34064a.l0(user);
    }

    @Override
    public boolean u(qy qyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        if (!arrayList.isEmpty()) {
            long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            if (DialogObject.isUserDialog(j3)) {
                jv jvVar = this.f34064a;
                jvVar.l0(jvVar.getMessagesController().getUser(Long.valueOf(j3)));
                return true;
            }
            return true;
        }
        return true;
    }
}

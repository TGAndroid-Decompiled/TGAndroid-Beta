package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class lv implements oy, dt {
    public final ov f38485a;

    public lv(ov ovVar) {
        this.f38485a = ovVar;
    }

    @Override
    public boolean B() {
        return false;
    }

    @Override
    public boolean K(uy uyVar) {
        return false;
    }

    @Override
    public void b(TLRPC.User user) {
        this.f38485a.l0(user);
    }

    @Override
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        if (!arrayList.isEmpty()) {
            long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            if (DialogObject.isUserDialog(j3)) {
                ov ovVar = this.f38485a;
                ovVar.l0(ovVar.getMessagesController().getUser(Long.valueOf(j3)));
                return true;
            }
            return true;
        }
        return true;
    }
}

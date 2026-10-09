package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class jv implements ny, bt {
    public final mv f39025a;

    public jv(mv mvVar) {
        this.f39025a = mvVar;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean K(ty tyVar) {
        return false;
    }

    @Override
    public void b(TLRPC.User user) {
        this.f39025a.l0(user);
    }

    @Override
    public boolean w(ty tyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        if (!arrayList.isEmpty()) {
            long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            if (DialogObject.isUserDialog(j3)) {
                mv mvVar = this.f39025a;
                mvVar.l0(mvVar.getMessagesController().getUser(Long.valueOf(j3)));
                return true;
            }
            return true;
        }
        return true;
    }
}

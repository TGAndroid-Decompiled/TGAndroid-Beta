package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class iv implements my, at {
    public final lv f38818a;

    public iv(lv lvVar) {
        this.f38818a = lvVar;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean K(sy syVar) {
        return false;
    }

    @Override
    public void b(TLRPC.User user) {
        this.f38818a.l0(user);
    }

    @Override
    public boolean w(sy syVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        if (!arrayList.isEmpty()) {
            long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            if (DialogObject.isUserDialog(j3)) {
                lv lvVar = this.f38818a;
                lvVar.l0(lvVar.getMessagesController().getUser(Long.valueOf(j3)));
                return true;
            }
            return true;
        }
        return true;
    }
}

package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class iv implements jy, at {
    public final lv f37784a;

    public iv(lv lvVar) {
        this.f37784a = lvVar;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean J(py pyVar) {
        return false;
    }

    @Override
    public void b(TLRPC.User user) {
        this.f37784a.l0(user);
    }

    @Override
    public boolean v(py pyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, sf1 sf1Var) {
        if (!arrayList.isEmpty()) {
            long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            if (DialogObject.isUserDialog(j10)) {
                lv lvVar = this.f37784a;
                lvVar.l0(lvVar.getMessagesController().getUser(Long.valueOf(j10)));
                return true;
            }
            return true;
        }
        return true;
    }
}

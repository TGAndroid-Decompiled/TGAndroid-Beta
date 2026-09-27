package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class iv implements ny, at {
    public final lv f34539a;

    public iv(lv lvVar) {
        this.f34539a = lvVar;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean K(ty tyVar) {
        return false;
    }

    @Override
    public void b(TLRPC.User user) {
        this.f34539a.l0(user);
    }

    @Override
    public boolean u(ty tyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        if (!arrayList.isEmpty()) {
            long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            if (DialogObject.isUserDialog(j3)) {
                lv lvVar = this.f34539a;
                lvVar.l0(lvVar.getMessagesController().getUser(Long.valueOf(j3)));
                return true;
            }
            return true;
        }
        return true;
    }
}

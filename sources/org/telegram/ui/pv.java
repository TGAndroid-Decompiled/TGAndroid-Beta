package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class pv implements sy, ht {
    public final sv f39294a;

    public pv(sv svVar) {
        this.f39294a = svVar;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean L(yy yyVar) {
        return false;
    }

    @Override
    public void b(TLRPC.User user) {
        this.f39294a.l0(user);
    }

    @Override
    public boolean w(yy yyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, lg1 lg1Var) {
        if (!arrayList.isEmpty()) {
            long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            if (DialogObject.isUserDialog(j10)) {
                sv svVar = this.f39294a;
                svVar.l0(svVar.getMessagesController().getUser(Long.valueOf(j10)));
                return true;
            }
            return true;
        }
        return true;
    }
}

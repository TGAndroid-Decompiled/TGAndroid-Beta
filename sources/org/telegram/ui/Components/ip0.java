package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ip0 implements rf.y {
    public final dq0 f29441a;

    public ip0(dq0 dq0Var) {
        this.f29441a = dq0Var;
    }

    @Override
    public final void a(a0.h hVar, ArrayList arrayList) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            TLObject tLObject = ((rf.z) arrayList.get(i13)).f47408a;
            if ((tLObject instanceof TLRPC.Chat) && !ChatObject.canWriteToChat((TLRPC.Chat) tLObject)) {
                arrayList.remove(i13);
                i13--;
            }
            i13++;
        }
        dq0 dq0Var = this.f29441a;
        dq0Var.A0 = arrayList;
        for (int i14 = 0; i14 < dq0Var.A0.size(); i14++) {
            rf.z zVar = (rf.z) dq0Var.A0.get(i14);
            TLObject tLObject2 = zVar.f47408a;
            if (tLObject2 instanceof TLRPC.User) {
                i12 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
                MessagesController.getInstance(i12).putUser((TLRPC.User) zVar.f47408a, true);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                i11 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
                MessagesController.getInstance(i11).putChat((TLRPC.Chat) zVar.f47408a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                i10 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) zVar.f47408a, true);
            }
        }
        dq0Var.I.l();
    }
}

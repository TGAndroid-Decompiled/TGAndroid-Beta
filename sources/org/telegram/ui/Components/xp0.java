package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xp0 implements fg.f0 {
    public final sq0 f29124a;

    public xp0(sq0 sq0Var) {
        this.f29124a = sq0Var;
    }

    @Override
    public final void a(a0.i iVar, ArrayList arrayList) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            TLObject tLObject = ((fg.g0) arrayList.get(i13)).f8020a;
            if ((tLObject instanceof TLRPC.Chat) && !ChatObject.canWriteToChat((TLRPC.Chat) tLObject)) {
                arrayList.remove(i13);
                i13--;
            }
            i13++;
        }
        sq0 sq0Var = this.f29124a;
        sq0Var.E0 = arrayList;
        for (int i14 = 0; i14 < sq0Var.E0.size(); i14++) {
            fg.g0 g0Var = (fg.g0) sq0Var.E0.get(i14);
            TLObject tLObject2 = g0Var.f8020a;
            if (tLObject2 instanceof TLRPC.User) {
                i12 = ((org.telegram.ui.ActionBar.h3) sq0Var).currentAccount;
                MessagesController.getInstance(i12).putUser((TLRPC.User) g0Var.f8020a, true);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                i11 = ((org.telegram.ui.ActionBar.h3) sq0Var).currentAccount;
                MessagesController.getInstance(i11).putChat((TLRPC.Chat) g0Var.f8020a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                i10 = ((org.telegram.ui.ActionBar.h3) sq0Var).currentAccount;
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) g0Var.f8020a, true);
            }
        }
        sq0Var.M.l();
    }
}

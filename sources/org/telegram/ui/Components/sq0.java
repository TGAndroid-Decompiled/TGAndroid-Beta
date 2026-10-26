package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sq0 implements ig.g0 {
    public final mr0 f32660a;

    public sq0(mr0 mr0Var) {
        this.f32660a = mr0Var;
    }

    @Override
    public final void a(a0.h hVar, ArrayList arrayList) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            TLObject tLObject = ((ig.h0) arrayList.get(i13)).f14064a;
            if ((tLObject instanceof TLRPC.Chat) && !ChatObject.canWriteToChat((TLRPC.Chat) tLObject)) {
                arrayList.remove(i13);
                i13--;
            }
            i13++;
        }
        mr0 mr0Var = this.f32660a;
        mr0Var.F0 = arrayList;
        for (int i14 = 0; i14 < mr0Var.F0.size(); i14++) {
            ig.h0 h0Var = (ig.h0) mr0Var.F0.get(i14);
            TLObject tLObject2 = h0Var.f14064a;
            if (tLObject2 instanceof TLRPC.User) {
                i12 = ((org.telegram.ui.ActionBar.k3) mr0Var).currentAccount;
                MessagesController.getInstance(i12).putUser((TLRPC.User) h0Var.f14064a, true);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                i11 = ((org.telegram.ui.ActionBar.k3) mr0Var).currentAccount;
                MessagesController.getInstance(i11).putChat((TLRPC.Chat) h0Var.f14064a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                i10 = ((org.telegram.ui.ActionBar.k3) mr0Var).currentAccount;
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) h0Var.f14064a, true);
            }
        }
        mr0Var.N.l();
    }
}

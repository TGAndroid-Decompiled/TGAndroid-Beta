package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xo0 implements of.d0 {
    public final rp0 f34731a;

    public xo0(rp0 rp0Var) {
        this.f34731a = rp0Var;
    }

    @Override
    public final void b(a0.h hVar, ArrayList arrayList) {
        int i9;
        int i10;
        int i11;
        int i12 = 0;
        while (i12 < arrayList.size()) {
            TLObject tLObject = ((of.e0) arrayList.get(i12)).f19279a;
            if ((tLObject instanceof TLRPC.Chat) && !ChatObject.canWriteToChat((TLRPC.Chat) tLObject)) {
                arrayList.remove(i12);
                i12--;
            }
            i12++;
        }
        rp0 rp0Var = this.f34731a;
        rp0Var.A0 = arrayList;
        for (int i13 = 0; i13 < rp0Var.A0.size(); i13++) {
            of.e0 e0Var = (of.e0) rp0Var.A0.get(i13);
            TLObject tLObject2 = e0Var.f19279a;
            if (tLObject2 instanceof TLRPC.User) {
                i11 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
                MessagesController.getInstance(i11).putUser((TLRPC.User) e0Var.f19279a, true);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                i10 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
                MessagesController.getInstance(i10).putChat((TLRPC.Chat) e0Var.f19279a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                i9 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
                MessagesController.getInstance(i9).putEncryptedChat((TLRPC.EncryptedChat) e0Var.f19279a, true);
            }
        }
        rp0Var.I.l();
    }
}

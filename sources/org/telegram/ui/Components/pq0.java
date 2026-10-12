package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pq0 implements hg.f0 {
    public final jr0 f28406a;

    public pq0(jr0 jr0Var) {
        this.f28406a = jr0Var;
    }

    @Override
    public final void b(a0.h hVar, ArrayList arrayList) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            TLObject tLObject = ((hg.g0) arrayList.get(i13)).f10558a;
            if ((tLObject instanceof TLRPC.Chat) && !ChatObject.canWriteToChat((TLRPC.Chat) tLObject)) {
                arrayList.remove(i13);
                i13--;
            }
            i13++;
        }
        jr0 jr0Var = this.f28406a;
        jr0Var.E0 = arrayList;
        for (int i14 = 0; i14 < jr0Var.E0.size(); i14++) {
            hg.g0 g0Var = (hg.g0) jr0Var.E0.get(i14);
            TLObject tLObject2 = g0Var.f10558a;
            if (tLObject2 instanceof TLRPC.User) {
                i12 = ((org.telegram.ui.ActionBar.e3) jr0Var).currentAccount;
                MessagesController.getInstance(i12).putUser((TLRPC.User) g0Var.f10558a, true);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                i11 = ((org.telegram.ui.ActionBar.e3) jr0Var).currentAccount;
                MessagesController.getInstance(i11).putChat((TLRPC.Chat) g0Var.f10558a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                i10 = ((org.telegram.ui.ActionBar.e3) jr0Var).currentAccount;
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) g0Var.f10558a, true);
            }
        }
        jr0Var.M.l();
    }
}

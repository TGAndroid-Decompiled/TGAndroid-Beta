package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yq0 implements gg.f0 {
    public final sr0 f33153a;

    public yq0(sr0 sr0Var) {
        this.f33153a = sr0Var;
    }

    @Override
    public final void a(a0.i iVar, ArrayList arrayList) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            TLObject tLObject = ((gg.g0) arrayList.get(i13)).f10607a;
            if ((tLObject instanceof TLRPC.Chat) && !ChatObject.canWriteToChat((TLRPC.Chat) tLObject)) {
                arrayList.remove(i13);
                i13--;
            }
            i13++;
        }
        sr0 sr0Var = this.f33153a;
        sr0Var.E0 = arrayList;
        for (int i14 = 0; i14 < sr0Var.E0.size(); i14++) {
            gg.g0 g0Var = (gg.g0) sr0Var.E0.get(i14);
            TLObject tLObject2 = g0Var.f10607a;
            if (tLObject2 instanceof TLRPC.User) {
                i12 = ((org.telegram.ui.ActionBar.e3) sr0Var).currentAccount;
                MessagesController.getInstance(i12).putUser((TLRPC.User) g0Var.f10607a, true);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                i11 = ((org.telegram.ui.ActionBar.e3) sr0Var).currentAccount;
                MessagesController.getInstance(i11).putChat((TLRPC.Chat) g0Var.f10607a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                i10 = ((org.telegram.ui.ActionBar.e3) sr0Var).currentAccount;
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) g0Var.f10607a, true);
            }
        }
        sr0Var.M.l();
    }
}

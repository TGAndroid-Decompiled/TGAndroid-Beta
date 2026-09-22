package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cq0 implements gg.g0 {
    public final wq0 f23428a;

    public cq0(wq0 wq0Var) {
        this.f23428a = wq0Var;
    }

    @Override
    public final void a(a0.i iVar, ArrayList arrayList) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            TLObject tLObject = ((gg.h0) arrayList.get(i13)).f9754a;
            if ((tLObject instanceof TLRPC.Chat) && !ChatObject.canWriteToChat((TLRPC.Chat) tLObject)) {
                arrayList.remove(i13);
                i13--;
            }
            i13++;
        }
        wq0 wq0Var = this.f23428a;
        wq0Var.E0 = arrayList;
        for (int i14 = 0; i14 < wq0Var.E0.size(); i14++) {
            gg.h0 h0Var = (gg.h0) wq0Var.E0.get(i14);
            TLObject tLObject2 = h0Var.f9754a;
            if (tLObject2 instanceof TLRPC.User) {
                i12 = ((org.telegram.ui.ActionBar.f3) wq0Var).currentAccount;
                MessagesController.getInstance(i12).putUser((TLRPC.User) h0Var.f9754a, true);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                i11 = ((org.telegram.ui.ActionBar.f3) wq0Var).currentAccount;
                MessagesController.getInstance(i11).putChat((TLRPC.Chat) h0Var.f9754a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                i10 = ((org.telegram.ui.ActionBar.f3) wq0Var).currentAccount;
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) h0Var.f9754a, true);
            }
        }
        wq0Var.M.l();
    }
}

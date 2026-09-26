package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bq0 implements gg.g0 {
    public final vq0 f23083a;

    public bq0(vq0 vq0Var) {
        this.f23083a = vq0Var;
    }

    @Override
    public final void a(a0.i iVar, ArrayList arrayList) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            TLObject tLObject = ((gg.h0) arrayList.get(i13)).f9735a;
            if ((tLObject instanceof TLRPC.Chat) && !ChatObject.canWriteToChat((TLRPC.Chat) tLObject)) {
                arrayList.remove(i13);
                i13--;
            }
            i13++;
        }
        vq0 vq0Var = this.f23083a;
        vq0Var.E0 = arrayList;
        for (int i14 = 0; i14 < vq0Var.E0.size(); i14++) {
            gg.h0 h0Var = (gg.h0) vq0Var.E0.get(i14);
            TLObject tLObject2 = h0Var.f9735a;
            if (tLObject2 instanceof TLRPC.User) {
                i12 = ((org.telegram.ui.ActionBar.e3) vq0Var).currentAccount;
                MessagesController.getInstance(i12).putUser((TLRPC.User) h0Var.f9735a, true);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                i11 = ((org.telegram.ui.ActionBar.e3) vq0Var).currentAccount;
                MessagesController.getInstance(i11).putChat((TLRPC.Chat) h0Var.f9735a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                i10 = ((org.telegram.ui.ActionBar.e3) vq0Var).currentAccount;
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) h0Var.f9735a, true);
            }
        }
        vq0Var.M.l();
    }
}

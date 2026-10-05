package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hq0 implements gg.g0 {
    public final br0 f27312a;

    public hq0(br0 br0Var) {
        this.f27312a = br0Var;
    }

    @Override
    public final void a(a0.i iVar, ArrayList arrayList) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            TLObject tLObject = ((gg.h0) arrayList.get(i13)).f10602a;
            if ((tLObject instanceof TLRPC.Chat) && !ChatObject.canWriteToChat((TLRPC.Chat) tLObject)) {
                arrayList.remove(i13);
                i13--;
            }
            i13++;
        }
        br0 br0Var = this.f27312a;
        br0Var.E0 = arrayList;
        for (int i14 = 0; i14 < br0Var.E0.size(); i14++) {
            gg.h0 h0Var = (gg.h0) br0Var.E0.get(i14);
            TLObject tLObject2 = h0Var.f10602a;
            if (tLObject2 instanceof TLRPC.User) {
                i12 = ((org.telegram.ui.ActionBar.f3) br0Var).currentAccount;
                MessagesController.getInstance(i12).putUser((TLRPC.User) h0Var.f10602a, true);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                i11 = ((org.telegram.ui.ActionBar.f3) br0Var).currentAccount;
                MessagesController.getInstance(i11).putChat((TLRPC.Chat) h0Var.f10602a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                i10 = ((org.telegram.ui.ActionBar.f3) br0Var).currentAccount;
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) h0Var.f10602a, true);
            }
        }
        br0Var.M.l();
    }
}

package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kq0 implements hg.f0 {
    public final fr0 f27917a;

    public kq0(fr0 fr0Var) {
        this.f27917a = fr0Var;
    }

    @Override
    public final void b(a0.h hVar, ArrayList arrayList) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            TLObject tLObject = ((hg.g0) arrayList.get(i13)).f11866a;
            if ((tLObject instanceof TLRPC.Chat) && !ChatObject.canWriteToChat((TLRPC.Chat) tLObject)) {
                arrayList.remove(i13);
                i13--;
            }
            i13++;
        }
        fr0 fr0Var = this.f27917a;
        fr0Var.F0 = arrayList;
        for (int i14 = 0; i14 < fr0Var.F0.size(); i14++) {
            hg.g0 g0Var = (hg.g0) fr0Var.F0.get(i14);
            TLObject tLObject2 = g0Var.f11866a;
            if (tLObject2 instanceof TLRPC.User) {
                i12 = ((org.telegram.ui.ActionBar.f3) fr0Var).currentAccount;
                MessagesController.getInstance(i12).putUser((TLRPC.User) g0Var.f11866a, true);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                i11 = ((org.telegram.ui.ActionBar.f3) fr0Var).currentAccount;
                MessagesController.getInstance(i11).putChat((TLRPC.Chat) g0Var.f11866a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                i10 = ((org.telegram.ui.ActionBar.f3) fr0Var).currentAccount;
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) g0Var.f11866a, true);
            }
        }
        fr0Var.N.l();
    }
}

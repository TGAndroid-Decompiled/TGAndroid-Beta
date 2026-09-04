package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class np0 implements hg.g0 {
    public final hq0 f28846a;

    public np0(hq0 hq0Var) {
        this.f28846a = hq0Var;
    }

    @Override
    public final void b(a0.i iVar, ArrayList arrayList) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            TLObject tLObject = ((hg.h0) arrayList.get(i13)).f11062a;
            if ((tLObject instanceof TLRPC.Chat) && !ChatObject.canWriteToChat((TLRPC.Chat) tLObject)) {
                arrayList.remove(i13);
                i13--;
            }
            i13++;
        }
        hq0 hq0Var = this.f28846a;
        hq0Var.E0 = arrayList;
        for (int i14 = 0; i14 < hq0Var.E0.size(); i14++) {
            hg.h0 h0Var = (hg.h0) hq0Var.E0.get(i14);
            TLObject tLObject2 = h0Var.f11062a;
            if (tLObject2 instanceof TLRPC.User) {
                i12 = ((org.telegram.ui.ActionBar.f3) hq0Var).currentAccount;
                MessagesController.getInstance(i12).putUser((TLRPC.User) h0Var.f11062a, true);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                i11 = ((org.telegram.ui.ActionBar.f3) hq0Var).currentAccount;
                MessagesController.getInstance(i11).putChat((TLRPC.Chat) h0Var.f11062a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                i10 = ((org.telegram.ui.ActionBar.f3) hq0Var).currentAccount;
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) h0Var.f11062a, true);
            }
        }
        hq0Var.M.l();
    }
}

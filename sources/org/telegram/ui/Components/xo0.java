package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class xo0 implements pf.x {

    public final sp0 f34663a;

    public xo0(sp0 sp0Var) {
        this.f34663a = sp0Var;
    }

    @Override
    public final void b(a0.h hVar, ArrayList arrayList) {
        int i10 = 0;
        while (i10 < arrayList.size()) {
            TLObject tLObject = ((pf.y) arrayList.get(i10)).f45967a;
            if ((tLObject instanceof TLRPC.Chat) && !ChatObject.canWriteToChat((TLRPC.Chat) tLObject)) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        sp0 sp0Var = this.f34663a;
        sp0Var.A0 = arrayList;
        for (int i11 = 0; i11 < sp0Var.A0.size(); i11++) {
            pf.y yVar = (pf.y) sp0Var.A0.get(i11);
            TLObject tLObject2 = yVar.f45967a;
            if (tLObject2 instanceof TLRPC.User) {
                MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount).putUser((TLRPC.User) yVar.f45967a, true);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount).putChat((TLRPC.Chat) yVar.f45967a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount).putEncryptedChat((TLRPC.EncryptedChat) yVar.f45967a, true);
            }
        }
        sp0Var.I.l();
    }
}

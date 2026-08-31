package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sp0 implements uf.x {
    public final mq0 f31149a;

    public sp0(mq0 mq0Var) {
        this.f31149a = mq0Var;
    }

    @Override
    public final void a(a0.h hVar, ArrayList arrayList) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            TLObject tLObject = ((uf.y) arrayList.get(i13)).f48739a;
            if ((tLObject instanceof TLRPC.Chat) && !ChatObject.canWriteToChat((TLRPC.Chat) tLObject)) {
                arrayList.remove(i13);
                i13--;
            }
            i13++;
        }
        mq0 mq0Var = this.f31149a;
        mq0Var.B0 = arrayList;
        for (int i14 = 0; i14 < mq0Var.B0.size(); i14++) {
            uf.y yVar = (uf.y) mq0Var.B0.get(i14);
            TLObject tLObject2 = yVar.f48739a;
            if (tLObject2 instanceof TLRPC.User) {
                i12 = ((org.telegram.ui.ActionBar.h3) mq0Var).currentAccount;
                MessagesController.getInstance(i12).putUser((TLRPC.User) yVar.f48739a, true);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                i11 = ((org.telegram.ui.ActionBar.h3) mq0Var).currentAccount;
                MessagesController.getInstance(i11).putChat((TLRPC.Chat) yVar.f48739a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                i10 = ((org.telegram.ui.ActionBar.h3) mq0Var).currentAccount;
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) yVar.f48739a, true);
            }
        }
        mq0Var.J.l();
    }
}

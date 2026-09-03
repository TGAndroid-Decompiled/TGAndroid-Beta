package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qp0 implements tf.x {
    public final lq0 f28230a;

    public qp0(lq0 lq0Var) {
        this.f28230a = lq0Var;
    }

    @Override
    public final void a(a0.h hVar, ArrayList arrayList) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            TLObject tLObject = ((tf.y) arrayList.get(i13)).f44942a;
            if ((tLObject instanceof TLRPC.Chat) && !ChatObject.canWriteToChat((TLRPC.Chat) tLObject)) {
                arrayList.remove(i13);
                i13--;
            }
            i13++;
        }
        lq0 lq0Var = this.f28230a;
        lq0Var.B0 = arrayList;
        for (int i14 = 0; i14 < lq0Var.B0.size(); i14++) {
            tf.y yVar = (tf.y) lq0Var.B0.get(i14);
            TLObject tLObject2 = yVar.f44942a;
            if (tLObject2 instanceof TLRPC.User) {
                i12 = ((org.telegram.ui.ActionBar.g3) lq0Var).currentAccount;
                MessagesController.getInstance(i12).putUser((TLRPC.User) yVar.f44942a, true);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                i11 = ((org.telegram.ui.ActionBar.g3) lq0Var).currentAccount;
                MessagesController.getInstance(i11).putChat((TLRPC.Chat) yVar.f44942a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                i10 = ((org.telegram.ui.ActionBar.g3) lq0Var).currentAccount;
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) yVar.f44942a, true);
            }
        }
        lq0Var.J.l();
    }
}

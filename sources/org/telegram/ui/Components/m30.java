package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class m30 implements Runnable {
    public final int f30562a;
    public final o30 f30563b;
    public final String f30564c;
    public final int d;

    public m30(o30 o30Var, String str, int i10, int i11) {
        this.f30562a = i11;
        this.f30563b = o30Var;
        this.f30564c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f30562a) {
            case 0:
                o30 o30Var = this.f30563b;
                String str = this.f30564c;
                int i10 = this.d;
                if (o30Var.f31246e != null) {
                    o30Var.f31246e = null;
                    AndroidUtilities.runOnUIThread(new m30(o30Var, str, i10, 1));
                    return;
                }
                return;
            default:
                o30 o30Var2 = this.f30563b;
                String str2 = this.f30564c;
                int i11 = this.d;
                ArrayList arrayList = null;
                o30Var2.f31246e = null;
                if (!ChatObject.isChannel(o30Var2.f31251w.R) && o30Var2.f31251w.S != null) {
                    arrayList = new ArrayList(o30Var2.f31251w.S.participants.participants);
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    Utilities.searchQueue.postRunnable(new ag.z1(o30Var2, str2, i11, arrayList2, 18));
                } else {
                    o30Var2.h = false;
                }
                rf.k1 k1Var = o30Var2.d;
                boolean canAddUsers = ChatObject.canAddUsers(o30Var2.f31251w.R);
                if (ChatObject.isChannel(o30Var2.f31251w.R)) {
                    j10 = o30Var2.f31251w.R.f22392id;
                } else {
                    j10 = 0;
                }
                k1Var.g(str2, canAddUsers, false, true, false, j10, false, 2, i11);
                return;
        }
    }
}

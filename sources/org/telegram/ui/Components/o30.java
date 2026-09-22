package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class o30 implements Runnable {
    public final int f26667a;
    public final q30 f26668b;
    public final String f26669c;
    public final int d;

    public o30(q30 q30Var, String str, int i10, int i11) {
        this.f26667a = i11;
        this.f26668b = q30Var;
        this.f26669c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f26667a) {
            case 0:
                q30 q30Var = this.f26668b;
                String str = this.f26669c;
                int i10 = this.d;
                if (q30Var.e != null) {
                    q30Var.e = null;
                    AndroidUtilities.runOnUIThread(new o30(q30Var, str, i10, 1));
                    return;
                }
                return;
            default:
                q30 q30Var2 = this.f26668b;
                String str2 = this.f26669c;
                int i11 = this.d;
                ArrayList arrayList = null;
                q30Var2.e = null;
                if (!ChatObject.isChannel(q30Var2.f27240w.V) && q30Var2.f27240w.W != null) {
                    arrayList = new ArrayList(q30Var2.f27240w.W.participants.participants);
                }
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new ai.c9(q30Var2, str2, i11, arrayList));
                } else {
                    q30Var2.h = false;
                }
                gg.c2 c2Var = q30Var2.d;
                boolean canAddUsers = ChatObject.canAddUsers(q30Var2.f27240w.V);
                if (ChatObject.isChannel(q30Var2.f27240w.V)) {
                    j3 = q30Var2.f27240w.V.f18109id;
                } else {
                    j3 = 0;
                }
                c2Var.g(str2, canAddUsers, false, true, false, j3, false, 2, i11);
                return;
        }
    }
}

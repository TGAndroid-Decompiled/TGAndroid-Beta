package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class g40 implements Runnable {
    public final int f26599a;
    public final i40 f26600b;
    public final String f26601c;
    public final int d;

    public g40(i40 i40Var, String str, int i10, int i11) {
        this.f26599a = i11;
        this.f26600b = i40Var;
        this.f26601c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f26599a) {
            case 0:
                i40 i40Var = this.f26600b;
                String str = this.f26601c;
                int i10 = this.d;
                if (i40Var.f27173e != null) {
                    i40Var.f27173e = null;
                    AndroidUtilities.runOnUIThread(new g40(i40Var, str, i10, 1));
                    return;
                }
                return;
            default:
                i40 i40Var2 = this.f26600b;
                String str2 = this.f26601c;
                int i11 = this.d;
                ArrayList arrayList = null;
                i40Var2.f27173e = null;
                if (!ChatObject.isChannel(i40Var2.f27178w.V) && i40Var2.f27178w.W != null) {
                    arrayList = new ArrayList(i40Var2.f27178w.W.participants.participants);
                }
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new ai.d9(i40Var2, str2, i11, arrayList));
                } else {
                    i40Var2.h = false;
                }
                gg.b2 b2Var = i40Var2.d;
                boolean canAddUsers = ChatObject.canAddUsers(i40Var2.f27178w.V);
                if (ChatObject.isChannel(i40Var2.f27178w.V)) {
                    j3 = i40Var2.f27178w.V.f20032id;
                } else {
                    j3 = 0;
                }
                b2Var.g(str2, canAddUsers, false, true, false, j3, false, 2, i11);
                return;
        }
    }
}

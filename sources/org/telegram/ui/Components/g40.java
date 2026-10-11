package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class g40 implements Runnable {
    public final int f26652a;
    public final i40 f26653b;
    public final String f26654c;
    public final int d;

    public g40(i40 i40Var, String str, int i10, int i11) {
        this.f26652a = i11;
        this.f26653b = i40Var;
        this.f26654c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f26652a) {
            case 0:
                i40 i40Var = this.f26653b;
                String str = this.f26654c;
                int i10 = this.d;
                if (i40Var.f27315e != null) {
                    i40Var.f27315e = null;
                    AndroidUtilities.runOnUIThread(new g40(i40Var, str, i10, 1));
                    return;
                }
                return;
            default:
                i40 i40Var2 = this.f26653b;
                String str2 = this.f26654c;
                int i11 = this.d;
                ArrayList arrayList = null;
                i40Var2.f27315e = null;
                if (!ChatObject.isChannel(i40Var2.f27320w.V) && i40Var2.f27320w.W != null) {
                    arrayList = new ArrayList(i40Var2.f27320w.W.participants.participants);
                }
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new ai.d9(i40Var2, str2, i11, arrayList));
                } else {
                    i40Var2.h = false;
                }
                gg.b2 b2Var = i40Var2.d;
                boolean canAddUsers = ChatObject.canAddUsers(i40Var2.f27320w.V);
                if (ChatObject.isChannel(i40Var2.f27320w.V)) {
                    j3 = i40Var2.f27320w.V.f20068id;
                } else {
                    j3 = 0;
                }
                b2Var.g(str2, canAddUsers, false, true, false, j3, false, 2, i11);
                return;
        }
    }
}

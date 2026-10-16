package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class b40 implements Runnable {
    public final int f23385a;
    public final d40 f23386b;
    public final String f23387c;
    public final int d;

    public b40(d40 d40Var, String str, int i10, int i11) {
        this.f23385a = i11;
        this.f23386b = d40Var;
        this.f23387c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f23385a) {
            case 0:
                d40 d40Var = this.f23386b;
                String str = this.f23387c;
                int i10 = this.d;
                if (d40Var.e != null) {
                    d40Var.e = null;
                    AndroidUtilities.runOnUIThread(new b40(d40Var, str, i10, 1));
                    return;
                }
                return;
            default:
                d40 d40Var2 = this.f23386b;
                String str2 = this.f23387c;
                int i11 = this.d;
                ArrayList arrayList = null;
                d40Var2.e = null;
                if (!ChatObject.isChannel(d40Var2.f23981w.V) && d40Var2.f23981w.W != null) {
                    arrayList = new ArrayList(d40Var2.f23981w.W.participants.participants);
                }
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new bi.n8(d40Var2, str2, i11, arrayList));
                } else {
                    d40Var2.h = false;
                }
                hg.a2 a2Var = d40Var2.d;
                boolean canAddUsers = ChatObject.canAddUsers(d40Var2.f23981w.V);
                if (ChatObject.isChannel(d40Var2.f23981w.V)) {
                    j10 = d40Var2.f23981w.V.f18916id;
                } else {
                    j10 = 0;
                }
                a2Var.g(str2, canAddUsers, false, true, false, j10, false, 2, i11);
                return;
        }
    }
}

package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class ot0 implements Runnable {
    public final int f26885a;
    public final pt0 f26886b;
    public final String f26887c;

    public ot0(pt0 pt0Var, String str, int i10) {
        this.f26885a = i10;
        this.f26886b = pt0Var;
        this.f26887c = str;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f26885a) {
            case 0:
                pt0 pt0Var = this.f26886b;
                String str = this.f26887c;
                pt0Var.getClass();
                AndroidUtilities.runOnUIThread(new ot0(pt0Var, str, 1));
                return;
            default:
                pt0 pt0Var2 = this.f26886b;
                String str2 = this.f26887c;
                ArrayList arrayList = null;
                pt0Var2.f27143f = null;
                if (!ChatObject.isChannel(pt0Var2.f27144n) && pt0Var2.f27146s.f30354d1 != null) {
                    arrayList = new ArrayList(pt0Var2.f27146s.f30354d1.participants.participants);
                }
                pt0Var2.f27145r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new fr0(pt0Var2, str2, arrayList, 3));
                } else {
                    pt0Var2.f27145r = 1;
                }
                gg.c2 c2Var = pt0Var2.e;
                if (ChatObject.isChannel(pt0Var2.f27144n)) {
                    j3 = pt0Var2.f27144n.f18112id;
                } else {
                    j3 = 0;
                }
                c2Var.g(str2, false, false, true, false, j3, false, 2, 1);
                return;
        }
    }
}

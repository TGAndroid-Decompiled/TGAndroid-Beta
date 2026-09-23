package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class ot0 implements Runnable {
    public final int f26851a;
    public final pt0 f26852b;
    public final String f26853c;

    public ot0(pt0 pt0Var, String str, int i10) {
        this.f26851a = i10;
        this.f26852b = pt0Var;
        this.f26853c = str;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f26851a) {
            case 0:
                pt0 pt0Var = this.f26852b;
                String str = this.f26853c;
                pt0Var.getClass();
                AndroidUtilities.runOnUIThread(new ot0(pt0Var, str, 1));
                return;
            default:
                pt0 pt0Var2 = this.f26852b;
                String str2 = this.f26853c;
                ArrayList arrayList = null;
                pt0Var2.f27131f = null;
                if (!ChatObject.isChannel(pt0Var2.f27132n) && pt0Var2.f27134s.f30412d1 != null) {
                    arrayList = new ArrayList(pt0Var2.f27134s.f30412d1.participants.participants);
                }
                pt0Var2.f27133r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new fr0(pt0Var2, str2, arrayList, 3));
                } else {
                    pt0Var2.f27133r = 1;
                }
                gg.c2 c2Var = pt0Var2.e;
                if (ChatObject.isChannel(pt0Var2.f27132n)) {
                    j3 = pt0Var2.f27132n.f18083id;
                } else {
                    j3 = 0;
                }
                c2Var.g(str2, false, false, true, false, j3, false, 2, 1);
                return;
        }
    }
}

package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class nt0 implements Runnable {
    public final int f27360a;
    public final ot0 f27361b;
    public final String f27362c;

    public nt0(ot0 ot0Var, String str, int i10) {
        this.f27360a = i10;
        this.f27361b = ot0Var;
        this.f27362c = str;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f27360a) {
            case 0:
                ot0 ot0Var = this.f27361b;
                String str = this.f27362c;
                ot0Var.getClass();
                AndroidUtilities.runOnUIThread(new nt0(ot0Var, str, 1));
                return;
            default:
                ot0 ot0Var2 = this.f27361b;
                String str2 = this.f27362c;
                ArrayList arrayList = null;
                ot0Var2.f27662f = null;
                if (!ChatObject.isChannel(ot0Var2.f27663n) && ot0Var2.f27665s.f31104a1 != null) {
                    arrayList = new ArrayList(ot0Var2.f27665s.f31104a1.participants.participants);
                }
                ot0Var2.f27664r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new hp(ot0Var2, str2, arrayList, 20));
                } else {
                    ot0Var2.f27664r = 1;
                }
                tf.k1 k1Var = ot0Var2.e;
                if (ChatObject.isChannel(ot0Var2.f27663n)) {
                    j10 = ot0Var2.f27663n.f19184id;
                } else {
                    j10 = 0;
                }
                k1Var.g(str2, false, false, true, false, j10, false, 2, 1);
                return;
        }
    }
}

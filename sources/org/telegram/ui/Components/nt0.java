package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class nt0 implements Runnable {
    public final int f27364a;
    public final ot0 f27365b;
    public final String f27366c;

    public nt0(ot0 ot0Var, String str, int i10) {
        this.f27364a = i10;
        this.f27365b = ot0Var;
        this.f27366c = str;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f27364a) {
            case 0:
                ot0 ot0Var = this.f27365b;
                String str = this.f27366c;
                ot0Var.getClass();
                AndroidUtilities.runOnUIThread(new nt0(ot0Var, str, 1));
                return;
            default:
                ot0 ot0Var2 = this.f27365b;
                String str2 = this.f27366c;
                ArrayList arrayList = null;
                ot0Var2.f27647f = null;
                if (!ChatObject.isChannel(ot0Var2.f27648n) && ot0Var2.f27650s.f31115a1 != null) {
                    arrayList = new ArrayList(ot0Var2.f27650s.f31115a1.participants.participants);
                }
                ot0Var2.f27649r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new gp(ot0Var2, str2, arrayList, 20));
                } else {
                    ot0Var2.f27649r = 1;
                }
                tf.j1 j1Var = ot0Var2.e;
                if (ChatObject.isChannel(ot0Var2.f27648n)) {
                    j10 = ot0Var2.f27648n.f19159id;
                } else {
                    j10 = 0;
                }
                j1Var.g(str2, false, false, true, false, j10, false, 2, 1);
                return;
        }
    }
}

package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class nt0 implements Runnable {
    public final int f29576a;
    public final ot0 f29577b;
    public final String f29578c;

    public nt0(ot0 ot0Var, String str, int i10) {
        this.f29576a = i10;
        this.f29577b = ot0Var;
        this.f29578c = str;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f29576a) {
            case 0:
                ot0 ot0Var = this.f29577b;
                String str = this.f29578c;
                ot0Var.getClass();
                AndroidUtilities.runOnUIThread(new nt0(ot0Var, str, 1));
                return;
            default:
                ot0 ot0Var2 = this.f29577b;
                String str2 = this.f29578c;
                ArrayList arrayList = null;
                ot0Var2.f29883f = null;
                if (!ChatObject.isChannel(ot0Var2.f29884n) && ot0Var2.f29886s.f33608a1 != null) {
                    arrayList = new ArrayList(ot0Var2.f29886s.f33608a1.participants.participants);
                }
                ot0Var2.f29885r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new jp(ot0Var2, str2, arrayList, 20));
                } else {
                    ot0Var2.f29885r = 1;
                }
                uf.k1 k1Var = ot0Var2.f29882e;
                if (ChatObject.isChannel(ot0Var2.f29884n)) {
                    j10 = ot0Var2.f29884n.f20845id;
                } else {
                    j10 = 0;
                }
                k1Var.g(str2, false, false, true, false, j10, false, 2, 1);
                return;
        }
    }
}

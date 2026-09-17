package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class nt0 implements Runnable {
    public final int f28891a;
    public final ot0 f28892b;
    public final String f28893c;

    public nt0(ot0 ot0Var, String str, int i10) {
        this.f28891a = i10;
        this.f28892b = ot0Var;
        this.f28893c = str;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f28891a) {
            case 0:
                ot0 ot0Var = this.f28892b;
                String str = this.f28893c;
                ot0Var.getClass();
                AndroidUtilities.runOnUIThread(new nt0(ot0Var, str, 1));
                return;
            default:
                ot0 ot0Var2 = this.f28892b;
                String str2 = this.f28893c;
                ArrayList arrayList = null;
                ot0Var2.f29211f = null;
                if (!ChatObject.isChannel(ot0Var2.f29212n) && ot0Var2.f29214s.f32715d1 != null) {
                    arrayList = new ArrayList(ot0Var2.f29214s.f32715d1.participants.participants);
                }
                ot0Var2.f29213r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new er0(ot0Var2, str2, arrayList, 3));
                } else {
                    ot0Var2.f29213r = 1;
                }
                hg.b2 b2Var = ot0Var2.f29210e;
                if (ChatObject.isChannel(ot0Var2.f29212n)) {
                    j3 = ot0Var2.f29212n.f19896id;
                } else {
                    j3 = 0;
                }
                b2Var.g(str2, false, false, true, false, j3, false, 2, 1);
                return;
        }
    }
}

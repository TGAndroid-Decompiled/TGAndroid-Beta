package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class nt0 implements Runnable {
    public final int f28864a;
    public final ot0 f28865b;
    public final String f28866c;

    public nt0(ot0 ot0Var, String str, int i10) {
        this.f28864a = i10;
        this.f28865b = ot0Var;
        this.f28866c = str;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f28864a) {
            case 0:
                ot0 ot0Var = this.f28865b;
                String str = this.f28866c;
                ot0Var.getClass();
                AndroidUtilities.runOnUIThread(new nt0(ot0Var, str, 1));
                return;
            default:
                ot0 ot0Var2 = this.f28865b;
                String str2 = this.f28866c;
                ArrayList arrayList = null;
                ot0Var2.f29184f = null;
                if (!ChatObject.isChannel(ot0Var2.f29185n) && ot0Var2.f29187s.f32688d1 != null) {
                    arrayList = new ArrayList(ot0Var2.f29187s.f32688d1.participants.participants);
                }
                ot0Var2.f29186r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new er0(ot0Var2, str2, arrayList, 3));
                } else {
                    ot0Var2.f29186r = 1;
                }
                hg.b2 b2Var = ot0Var2.f29183e;
                if (ChatObject.isChannel(ot0Var2.f29185n)) {
                    j3 = ot0Var2.f29185n.f19869id;
                } else {
                    j3 = 0;
                }
                b2Var.g(str2, false, false, true, false, j3, false, 2, 1);
                return;
        }
    }
}

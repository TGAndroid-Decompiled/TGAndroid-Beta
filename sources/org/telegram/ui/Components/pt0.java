package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class pt0 implements Runnable {
    public final int f27128a;
    public final qt0 f27129b;
    public final String f27130c;

    public pt0(qt0 qt0Var, String str, int i10) {
        this.f27128a = i10;
        this.f27129b = qt0Var;
        this.f27130c = str;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f27128a) {
            case 0:
                qt0 qt0Var = this.f27129b;
                String str = this.f27130c;
                qt0Var.getClass();
                AndroidUtilities.runOnUIThread(new pt0(qt0Var, str, 1));
                return;
            default:
                qt0 qt0Var2 = this.f27129b;
                String str2 = this.f27130c;
                ArrayList arrayList = null;
                qt0Var2.f27401f = null;
                if (!ChatObject.isChannel(qt0Var2.f27402n) && qt0Var2.f27404s.f30618d1 != null) {
                    arrayList = new ArrayList(qt0Var2.f27404s.f30618d1.participants.participants);
                }
                qt0Var2.f27403r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new gr0(qt0Var2, str2, arrayList, 3));
                } else {
                    qt0Var2.f27403r = 1;
                }
                gg.c2 c2Var = qt0Var2.e;
                if (ChatObject.isChannel(qt0Var2.f27402n)) {
                    j3 = qt0Var2.f27402n.f18121id;
                } else {
                    j3 = 0;
                }
                c2Var.g(str2, false, false, true, false, j3, false, 2, 1);
                return;
        }
    }
}

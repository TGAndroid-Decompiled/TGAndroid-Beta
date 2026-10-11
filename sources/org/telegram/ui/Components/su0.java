package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class su0 implements Runnable {
    public final int f30945a;
    public final tu0 f30946b;
    public final String f30947c;

    public su0(tu0 tu0Var, String str, int i10) {
        this.f30945a = i10;
        this.f30946b = tu0Var;
        this.f30947c = str;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f30945a) {
            case 0:
                tu0 tu0Var = this.f30946b;
                String str = this.f30947c;
                tu0Var.getClass();
                AndroidUtilities.runOnUIThread(new su0(tu0Var, str, 1));
                return;
            default:
                tu0 tu0Var2 = this.f30946b;
                String str2 = this.f30947c;
                ArrayList arrayList = null;
                tu0Var2.f31341f = null;
                if (!ChatObject.isChannel(tu0Var2.f31342n) && tu0Var2.f31344s.f25497d1 != null) {
                    arrayList = new ArrayList(tu0Var2.f31344s.f25497d1.participants.participants);
                }
                tu0Var2.f31343r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new bf0(tu0Var2, str2, arrayList, 9));
                } else {
                    tu0Var2.f31343r = 1;
                }
                gg.b2 b2Var = tu0Var2.f31340e;
                if (ChatObject.isChannel(tu0Var2.f31342n)) {
                    j3 = tu0Var2.f31342n.f20068id;
                } else {
                    j3 = 0;
                }
                b2Var.g(str2, false, false, true, false, j3, false, 2, 1);
                return;
        }
    }
}

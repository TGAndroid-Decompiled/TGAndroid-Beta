package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class su0 implements Runnable {
    public final int f30865a;
    public final tu0 f30866b;
    public final String f30867c;

    public su0(tu0 tu0Var, String str, int i10) {
        this.f30865a = i10;
        this.f30866b = tu0Var;
        this.f30867c = str;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f30865a) {
            case 0:
                tu0 tu0Var = this.f30866b;
                String str = this.f30867c;
                tu0Var.getClass();
                AndroidUtilities.runOnUIThread(new su0(tu0Var, str, 1));
                return;
            default:
                tu0 tu0Var2 = this.f30866b;
                String str2 = this.f30867c;
                ArrayList arrayList = null;
                tu0Var2.f31222f = null;
                if (!ChatObject.isChannel(tu0Var2.f31223n) && tu0Var2.f31225s.f25435d1 != null) {
                    arrayList = new ArrayList(tu0Var2.f31225s.f25435d1.participants.participants);
                }
                tu0Var2.f31224r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new cf0(tu0Var2, str2, arrayList, 9));
                } else {
                    tu0Var2.f31224r = 1;
                }
                gg.b2 b2Var = tu0Var2.f31221e;
                if (ChatObject.isChannel(tu0Var2.f31223n)) {
                    j3 = tu0Var2.f31223n.f20042id;
                } else {
                    j3 = 0;
                }
                b2Var.g(str2, false, false, true, false, j3, false, 2, 1);
                return;
        }
    }
}

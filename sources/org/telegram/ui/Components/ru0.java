package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class ru0 implements Runnable {
    public final int f30513a;
    public final su0 f30514b;
    public final String f30515c;

    public ru0(su0 su0Var, String str, int i10) {
        this.f30513a = i10;
        this.f30514b = su0Var;
        this.f30515c = str;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f30513a) {
            case 0:
                su0 su0Var = this.f30514b;
                String str = this.f30515c;
                su0Var.getClass();
                AndroidUtilities.runOnUIThread(new ru0(su0Var, str, 1));
                return;
            default:
                su0 su0Var2 = this.f30514b;
                String str2 = this.f30515c;
                ArrayList arrayList = null;
                su0Var2.f30896f = null;
                if (!ChatObject.isChannel(su0Var2.f30897n) && su0Var2.f30899s.f25127d1 != null) {
                    arrayList = new ArrayList(su0Var2.f30899s.f25127d1.participants.participants);
                }
                su0Var2.f30898r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new og0(su0Var2, str2, arrayList, 8));
                } else {
                    su0Var2.f30898r = 1;
                }
                gg.b2 b2Var = su0Var2.f30895e;
                if (ChatObject.isChannel(su0Var2.f30897n)) {
                    j3 = su0Var2.f30897n.f20038id;
                } else {
                    j3 = 0;
                }
                b2Var.g(str2, false, false, true, false, j3, false, 2, 1);
                return;
        }
    }
}

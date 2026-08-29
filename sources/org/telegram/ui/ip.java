package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ip implements Runnable {
    public final int f39301a;
    public final jp f39302b;
    public final String f39303c;

    public ip(jp jpVar, String str, int i10) {
        this.f39301a = i10;
        this.f39302b = jpVar;
        this.f39303c = str;
    }

    @Override
    public final void run() {
        switch (this.f39301a) {
            case 0:
                jp jpVar = this.f39302b;
                String str = this.f39303c;
                jpVar.getClass();
                AndroidUtilities.runOnUIThread(new ip(jpVar, str, 1));
                return;
            default:
                jp jpVar2 = this.f39302b;
                String str2 = this.f39303c;
                jpVar2.f39609f = null;
                Utilities.searchQueue.postRunnable(new u1(jpVar2, str2, new ArrayList(jpVar2.h.v), 28));
                return;
        }
    }
}

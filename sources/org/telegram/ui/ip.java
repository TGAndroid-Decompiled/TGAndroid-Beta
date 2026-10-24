package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ip implements Runnable {
    public final int f38350a;
    public final jp f38351b;
    public final String f38352c;

    public ip(jp jpVar, String str, int i10) {
        this.f38350a = i10;
        this.f38351b = jpVar;
        this.f38352c = str;
    }

    @Override
    public final void run() {
        switch (this.f38350a) {
            case 0:
                jp jpVar = this.f38351b;
                String str = this.f38352c;
                jpVar.getClass();
                AndroidUtilities.runOnUIThread(new ip(jpVar, str, 1));
                return;
            default:
                jp jpVar2 = this.f38351b;
                String str2 = this.f38352c;
                jpVar2.f38600f = null;
                Utilities.searchQueue.postRunnable(new s1(jpVar2, str2, new ArrayList(jpVar2.h.v), 28));
                return;
        }
    }
}

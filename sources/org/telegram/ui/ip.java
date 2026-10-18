package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ip implements Runnable {
    public final int f37939a;
    public final jp f37940b;
    public final String f37941c;

    public ip(jp jpVar, String str, int i10) {
        this.f37939a = i10;
        this.f37940b = jpVar;
        this.f37941c = str;
    }

    @Override
    public final void run() {
        switch (this.f37939a) {
            case 0:
                jp jpVar = this.f37940b;
                String str = this.f37941c;
                jpVar.getClass();
                AndroidUtilities.runOnUIThread(new ip(jpVar, str, 1));
                return;
            default:
                jp jpVar2 = this.f37940b;
                String str2 = this.f37941c;
                jpVar2.f38242f = null;
                Utilities.searchQueue.postRunnable(new t1(jpVar2, str2, new ArrayList(jpVar2.h.v), 28));
                return;
        }
    }
}

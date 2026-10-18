package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ip implements Runnable {
    public final int f37957a;
    public final jp f37958b;
    public final String f37959c;

    public ip(jp jpVar, String str, int i10) {
        this.f37957a = i10;
        this.f37958b = jpVar;
        this.f37959c = str;
    }

    @Override
    public final void run() {
        switch (this.f37957a) {
            case 0:
                jp jpVar = this.f37958b;
                String str = this.f37959c;
                jpVar.getClass();
                AndroidUtilities.runOnUIThread(new ip(jpVar, str, 1));
                return;
            default:
                jp jpVar2 = this.f37958b;
                String str2 = this.f37959c;
                jpVar2.f38257f = null;
                Utilities.searchQueue.postRunnable(new t1(jpVar2, str2, new ArrayList(jpVar2.h.v), 28));
                return;
        }
    }
}

package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ip implements Runnable {
    public final int f37941a;
    public final jp f37942b;
    public final String f37943c;

    public ip(jp jpVar, String str, int i10) {
        this.f37941a = i10;
        this.f37942b = jpVar;
        this.f37943c = str;
    }

    @Override
    public final void run() {
        switch (this.f37941a) {
            case 0:
                jp jpVar = this.f37942b;
                String str = this.f37943c;
                jpVar.getClass();
                AndroidUtilities.runOnUIThread(new ip(jpVar, str, 1));
                return;
            default:
                jp jpVar2 = this.f37942b;
                String str2 = this.f37943c;
                jpVar2.f38238f = null;
                Utilities.searchQueue.postRunnable(new t1(jpVar2, str2, new ArrayList(jpVar2.h.v), 28));
                return;
        }
    }
}

package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ip implements Runnable {
    public final int f38328a;
    public final jp f38329b;
    public final String f38330c;

    public ip(jp jpVar, String str, int i10) {
        this.f38328a = i10;
        this.f38329b = jpVar;
        this.f38330c = str;
    }

    @Override
    public final void run() {
        switch (this.f38328a) {
            case 0:
                jp jpVar = this.f38329b;
                String str = this.f38330c;
                jpVar.getClass();
                AndroidUtilities.runOnUIThread(new ip(jpVar, str, 1));
                return;
            default:
                jp jpVar2 = this.f38329b;
                String str2 = this.f38330c;
                jpVar2.f38612f = null;
                Utilities.searchQueue.postRunnable(new s1(jpVar2, str2, new ArrayList(jpVar2.h.v), 28));
                return;
        }
    }
}

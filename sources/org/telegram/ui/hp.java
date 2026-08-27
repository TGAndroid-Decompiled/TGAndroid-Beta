package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class hp implements Runnable {

    public final int f38876a;

    public final ip f38877b;

    public final String f38878c;

    public hp(ip ipVar, String str, int i10) {
        this.f38876a = i10;
        this.f38877b = ipVar;
        this.f38878c = str;
    }

    @Override
    public final void run() {
        switch (this.f38876a) {
            case 0:
                ip ipVar = this.f38877b;
                String str = this.f38878c;
                ipVar.getClass();
                AndroidUtilities.runOnUIThread(new hp(ipVar, str, 1));
                break;
            default:
                ip ipVar2 = this.f38877b;
                String str2 = this.f38878c;
                ipVar2.f39147f = null;
                Utilities.searchQueue.postRunnable(new u1(ipVar2, str2, new ArrayList(ipVar2.h.v), 28));
                break;
        }
    }
}

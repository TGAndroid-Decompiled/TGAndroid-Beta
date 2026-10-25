package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class lp implements Runnable {
    public final int f41307a;
    public final mp f41308b;
    public final String f41309c;

    public lp(mp mpVar, String str, int i10) {
        this.f41307a = i10;
        this.f41308b = mpVar;
        this.f41309c = str;
    }

    @Override
    public final void run() {
        switch (this.f41307a) {
            case 0:
                mp mpVar = this.f41308b;
                String str = this.f41309c;
                mpVar.getClass();
                AndroidUtilities.runOnUIThread(new lp(mpVar, str, 1));
                return;
            default:
                mp mpVar2 = this.f41308b;
                String str2 = this.f41309c;
                mpVar2.f41631f = null;
                Utilities.searchQueue.postRunnable(new q1(mpVar2, str2, new ArrayList(mpVar2.h.v), 28));
                return;
        }
    }
}

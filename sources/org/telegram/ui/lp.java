package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class lp implements Runnable {
    public final int f41310a;
    public final mp f41311b;
    public final String f41312c;

    public lp(mp mpVar, String str, int i10) {
        this.f41310a = i10;
        this.f41311b = mpVar;
        this.f41312c = str;
    }

    @Override
    public final void run() {
        switch (this.f41310a) {
            case 0:
                mp mpVar = this.f41311b;
                String str = this.f41312c;
                mpVar.getClass();
                AndroidUtilities.runOnUIThread(new lp(mpVar, str, 1));
                return;
            default:
                mp mpVar2 = this.f41311b;
                String str2 = this.f41312c;
                mpVar2.f41634f = null;
                Utilities.searchQueue.postRunnable(new q1(mpVar2, str2, new ArrayList(mpVar2.h.v), 28));
                return;
        }
    }
}

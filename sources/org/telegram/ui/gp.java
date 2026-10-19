package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class gp implements Runnable {
    public final int f37371a;
    public final hp f37372b;
    public final String f37373c;

    public gp(hp hpVar, String str, int i10) {
        this.f37371a = i10;
        this.f37372b = hpVar;
        this.f37373c = str;
    }

    @Override
    public final void run() {
        switch (this.f37371a) {
            case 0:
                hp hpVar = this.f37372b;
                String str = this.f37373c;
                hpVar.getClass();
                AndroidUtilities.runOnUIThread(new gp(hpVar, str, 1));
                return;
            default:
                hp hpVar2 = this.f37372b;
                String str2 = this.f37373c;
                hpVar2.f37693f = null;
                Utilities.searchQueue.postRunnable(new t1(hpVar2, str2, new ArrayList(hpVar2.h.v), 28));
                return;
        }
    }
}

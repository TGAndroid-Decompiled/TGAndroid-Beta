package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class gp implements Runnable {
    public final int f37381a;
    public final hp f37382b;
    public final String f37383c;

    public gp(hp hpVar, String str, int i10) {
        this.f37381a = i10;
        this.f37382b = hpVar;
        this.f37383c = str;
    }

    @Override
    public final void run() {
        switch (this.f37381a) {
            case 0:
                hp hpVar = this.f37382b;
                String str = this.f37383c;
                hpVar.getClass();
                AndroidUtilities.runOnUIThread(new gp(hpVar, str, 1));
                return;
            default:
                hp hpVar2 = this.f37382b;
                String str2 = this.f37383c;
                hpVar2.f37703f = null;
                Utilities.searchQueue.postRunnable(new t1(hpVar2, str2, new ArrayList(hpVar2.h.v), 28));
                return;
        }
    }
}

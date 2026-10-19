package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class gp implements Runnable {
    public final int f37397a;
    public final hp f37398b;
    public final String f37399c;

    public gp(hp hpVar, String str, int i10) {
        this.f37397a = i10;
        this.f37398b = hpVar;
        this.f37399c = str;
    }

    @Override
    public final void run() {
        switch (this.f37397a) {
            case 0:
                hp hpVar = this.f37398b;
                String str = this.f37399c;
                hpVar.getClass();
                AndroidUtilities.runOnUIThread(new gp(hpVar, str, 1));
                return;
            default:
                hp hpVar2 = this.f37398b;
                String str2 = this.f37399c;
                hpVar2.f37722f = null;
                Utilities.searchQueue.postRunnable(new t1(hpVar2, str2, new ArrayList(hpVar2.h.v), 28));
                return;
        }
    }
}

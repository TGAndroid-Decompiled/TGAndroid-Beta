package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class gp implements Runnable {
    public final int f37378a;
    public final hp f37379b;
    public final String f37380c;

    public gp(hp hpVar, String str, int i10) {
        this.f37378a = i10;
        this.f37379b = hpVar;
        this.f37380c = str;
    }

    @Override
    public final void run() {
        switch (this.f37378a) {
            case 0:
                hp hpVar = this.f37379b;
                String str = this.f37380c;
                hpVar.getClass();
                AndroidUtilities.runOnUIThread(new gp(hpVar, str, 1));
                return;
            default:
                hp hpVar2 = this.f37379b;
                String str2 = this.f37380c;
                hpVar2.f37700f = null;
                Utilities.searchQueue.postRunnable(new t1(hpVar2, str2, new ArrayList(hpVar2.h.v), 28));
                return;
        }
    }
}

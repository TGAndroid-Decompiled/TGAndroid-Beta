package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class fp implements Runnable {
    public final int f38326a;
    public final gp f38327b;
    public final String f38328c;

    public fp(gp gpVar, String str, int i9) {
        this.f38326a = i9;
        this.f38327b = gpVar;
        this.f38328c = str;
    }

    @Override
    public final void run() {
        switch (this.f38326a) {
            case 0:
                gp gpVar = this.f38327b;
                String str = this.f38328c;
                gpVar.getClass();
                AndroidUtilities.runOnUIThread(new fp(gpVar, str, 1));
                return;
            default:
                gp gpVar2 = this.f38327b;
                String str2 = this.f38328c;
                gpVar2.f38588f = null;
                Utilities.searchQueue.postRunnable(new t1(gpVar2, str2, new ArrayList(gpVar2.h.v), 28));
                return;
        }
    }
}

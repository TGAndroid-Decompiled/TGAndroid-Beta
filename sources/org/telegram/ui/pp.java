package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class pp implements Runnable {
    public final int f36589a;
    public final qp f36590b;
    public final String f36591c;

    public pp(qp qpVar, String str, int i10) {
        this.f36589a = i10;
        this.f36590b = qpVar;
        this.f36591c = str;
    }

    @Override
    public final void run() {
        switch (this.f36589a) {
            case 0:
                qp qpVar = this.f36590b;
                String str = this.f36591c;
                qpVar.getClass();
                AndroidUtilities.runOnUIThread(new pp(qpVar, str, 1));
                return;
            default:
                qp qpVar2 = this.f36590b;
                String str2 = this.f36591c;
                qpVar2.f36959f = null;
                Utilities.searchQueue.postRunnable(new r1(qpVar2, str2, new ArrayList(qpVar2.h.v), 28));
                return;
        }
    }
}

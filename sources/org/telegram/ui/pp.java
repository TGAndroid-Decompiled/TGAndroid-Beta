package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class pp implements Runnable {
    public final int f36695a;
    public final qp f36696b;
    public final String f36697c;

    public pp(qp qpVar, String str, int i10) {
        this.f36695a = i10;
        this.f36696b = qpVar;
        this.f36697c = str;
    }

    @Override
    public final void run() {
        switch (this.f36695a) {
            case 0:
                qp qpVar = this.f36696b;
                String str = this.f36697c;
                qpVar.getClass();
                AndroidUtilities.runOnUIThread(new pp(qpVar, str, 1));
                return;
            default:
                qp qpVar2 = this.f36696b;
                String str2 = this.f36697c;
                qpVar2.f37057f = null;
                Utilities.searchQueue.postRunnable(new r1(qpVar2, str2, new ArrayList(qpVar2.h.v), 28));
                return;
        }
    }
}

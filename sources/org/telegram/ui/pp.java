package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class pp implements Runnable {
    public final int f36577a;
    public final qp f36578b;
    public final String f36579c;

    public pp(qp qpVar, String str, int i10) {
        this.f36577a = i10;
        this.f36578b = qpVar;
        this.f36579c = str;
    }

    @Override
    public final void run() {
        switch (this.f36577a) {
            case 0:
                qp qpVar = this.f36578b;
                String str = this.f36579c;
                qpVar.getClass();
                AndroidUtilities.runOnUIThread(new pp(qpVar, str, 1));
                return;
            default:
                qp qpVar2 = this.f36578b;
                String str2 = this.f36579c;
                qpVar2.f36943f = null;
                Utilities.searchQueue.postRunnable(new r1(qpVar2, str2, new ArrayList(qpVar2.h.v), 28));
                return;
        }
    }
}

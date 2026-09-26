package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class pp implements Runnable {
    public final int f36587a;
    public final qp f36588b;
    public final String f36589c;

    public pp(qp qpVar, String str, int i10) {
        this.f36587a = i10;
        this.f36588b = qpVar;
        this.f36589c = str;
    }

    @Override
    public final void run() {
        switch (this.f36587a) {
            case 0:
                qp qpVar = this.f36588b;
                String str = this.f36589c;
                qpVar.getClass();
                AndroidUtilities.runOnUIThread(new pp(qpVar, str, 1));
                return;
            default:
                qp qpVar2 = this.f36588b;
                String str2 = this.f36589c;
                qpVar2.f36957f = null;
                Utilities.searchQueue.postRunnable(new r1(qpVar2, str2, new ArrayList(qpVar2.h.v), 28));
                return;
        }
    }
}

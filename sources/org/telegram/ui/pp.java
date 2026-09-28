package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class pp implements Runnable {
    public final int f36588a;
    public final qp f36589b;
    public final String f36590c;

    public pp(qp qpVar, String str, int i10) {
        this.f36588a = i10;
        this.f36589b = qpVar;
        this.f36590c = str;
    }

    @Override
    public final void run() {
        switch (this.f36588a) {
            case 0:
                qp qpVar = this.f36589b;
                String str = this.f36590c;
                qpVar.getClass();
                AndroidUtilities.runOnUIThread(new pp(qpVar, str, 1));
                return;
            default:
                qp qpVar2 = this.f36589b;
                String str2 = this.f36590c;
                qpVar2.f36958f = null;
                Utilities.searchQueue.postRunnable(new r1(qpVar2, str2, new ArrayList(qpVar2.h.v), 28));
                return;
        }
    }
}

package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class pp implements Runnable {
    public final int f40131a;
    public final qp f40132b;
    public final String f40133c;

    public pp(qp qpVar, String str, int i10) {
        this.f40131a = i10;
        this.f40132b = qpVar;
        this.f40133c = str;
    }

    @Override
    public final void run() {
        switch (this.f40131a) {
            case 0:
                qp qpVar = this.f40132b;
                String str = this.f40133c;
                qpVar.getClass();
                AndroidUtilities.runOnUIThread(new pp(qpVar, str, 1));
                return;
            default:
                qp qpVar2 = this.f40132b;
                String str2 = this.f40133c;
                qpVar2.f40590f = null;
                Utilities.searchQueue.postRunnable(new s1(qpVar2, str2, new ArrayList(qpVar2.h.v), 28));
                return;
        }
    }
}

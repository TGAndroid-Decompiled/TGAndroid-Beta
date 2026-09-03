package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class pp implements Runnable {
    public final int f40094a;
    public final qp f40095b;
    public final String f40096c;

    public pp(qp qpVar, String str, int i10) {
        this.f40094a = i10;
        this.f40095b = qpVar;
        this.f40096c = str;
    }

    @Override
    public final void run() {
        switch (this.f40094a) {
            case 0:
                qp qpVar = this.f40095b;
                String str = this.f40096c;
                qpVar.getClass();
                AndroidUtilities.runOnUIThread(new pp(qpVar, str, 1));
                return;
            default:
                qp qpVar2 = this.f40095b;
                String str2 = this.f40096c;
                qpVar2.f40558f = null;
                Utilities.searchQueue.postRunnable(new s1(qpVar2, str2, new ArrayList(qpVar2.h.v), 28));
                return;
        }
    }
}

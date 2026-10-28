package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class np implements Runnable {
    public final int f41833a;
    public final op f41834b;
    public final String f41835c;

    public np(op opVar, String str, int i10) {
        this.f41833a = i10;
        this.f41834b = opVar;
        this.f41835c = str;
    }

    @Override
    public final void run() {
        switch (this.f41833a) {
            case 0:
                op opVar = this.f41834b;
                String str = this.f41835c;
                opVar.getClass();
                AndroidUtilities.runOnUIThread(new np(opVar, str, 1));
                return;
            default:
                op opVar2 = this.f41834b;
                String str2 = this.f41835c;
                opVar2.f42166f = null;
                Utilities.searchQueue.postRunnable(new q1(opVar2, str2, new ArrayList(opVar2.h.v), 28));
                return;
        }
    }
}

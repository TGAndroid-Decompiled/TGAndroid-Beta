package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class op implements Runnable {
    public final int f36951a;
    public final pp f36952b;
    public final String f36953c;

    public op(pp ppVar, String str, int i10) {
        this.f36951a = i10;
        this.f36952b = ppVar;
        this.f36953c = str;
    }

    @Override
    public final void run() {
        switch (this.f36951a) {
            case 0:
                pp ppVar = this.f36952b;
                String str = this.f36953c;
                ppVar.getClass();
                AndroidUtilities.runOnUIThread(new op(ppVar, str, 1));
                return;
            default:
                pp ppVar2 = this.f36952b;
                String str2 = this.f36953c;
                ppVar2.f37426f = null;
                Utilities.searchQueue.postRunnable(new s1(ppVar2, str2, new ArrayList(ppVar2.h.v), 28));
                return;
        }
    }
}

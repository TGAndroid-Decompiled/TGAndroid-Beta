package org.telegram.ui.Components;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class fu0 implements Runnable {
    public final int f26567a;
    public final gu0 f26568b;
    public final String f26569c;

    public fu0(gu0 gu0Var, String str, int i10) {
        this.f26567a = i10;
        this.f26568b = gu0Var;
        this.f26569c = str;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f26567a) {
            case 0:
                gu0 gu0Var = this.f26568b;
                String str = this.f26569c;
                gu0Var.getClass();
                AndroidUtilities.runOnUIThread(new fu0(gu0Var, str, 1));
                return;
            default:
                gu0 gu0Var2 = this.f26568b;
                String str2 = this.f26569c;
                ArrayList arrayList = null;
                gu0Var2.f26923f = null;
                if (!ChatObject.isChannel(gu0Var2.f26924n) && gu0Var2.f26926s.f29762d1 != null) {
                    arrayList = new ArrayList(gu0Var2.f26926s.f29762d1.participants.participants);
                }
                gu0Var2.f26925r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new in0((Object) gu0Var2, (Serializable) str2, arrayList, 6));
                } else {
                    gu0Var2.f26925r = 1;
                }
                gg.c2 c2Var = gu0Var2.f26922e;
                if (ChatObject.isChannel(gu0Var2.f26924n)) {
                    j3 = gu0Var2.f26924n.f20038id;
                } else {
                    j3 = 0;
                }
                c2Var.g(str2, false, false, true, false, j3, false, 2, 1);
                return;
        }
    }
}

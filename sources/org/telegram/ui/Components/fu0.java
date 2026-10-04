package org.telegram.ui.Components;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class fu0 implements Runnable {
    public final int f26566a;
    public final gu0 f26567b;
    public final String f26568c;

    public fu0(gu0 gu0Var, String str, int i10) {
        this.f26566a = i10;
        this.f26567b = gu0Var;
        this.f26568c = str;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f26566a) {
            case 0:
                gu0 gu0Var = this.f26567b;
                String str = this.f26568c;
                gu0Var.getClass();
                AndroidUtilities.runOnUIThread(new fu0(gu0Var, str, 1));
                return;
            default:
                gu0 gu0Var2 = this.f26567b;
                String str2 = this.f26568c;
                ArrayList arrayList = null;
                gu0Var2.f26922f = null;
                if (!ChatObject.isChannel(gu0Var2.f26923n) && gu0Var2.f26925s.f29761d1 != null) {
                    arrayList = new ArrayList(gu0Var2.f26925s.f29761d1.participants.participants);
                }
                gu0Var2.f26924r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new in0((Object) gu0Var2, (Serializable) str2, arrayList, 6));
                } else {
                    gu0Var2.f26924r = 1;
                }
                gg.c2 c2Var = gu0Var2.f26921e;
                if (ChatObject.isChannel(gu0Var2.f26923n)) {
                    j3 = gu0Var2.f26923n.f20037id;
                } else {
                    j3 = 0;
                }
                c2Var.g(str2, false, false, true, false, j3, false, 2, 1);
                return;
        }
    }
}

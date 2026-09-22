package org.telegram.ui.Components;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class bu0 implements Runnable {
    public final int f23095a;
    public final cu0 f23096b;
    public final String f23097c;

    public bu0(cu0 cu0Var, String str, int i10) {
        this.f23095a = i10;
        this.f23096b = cu0Var;
        this.f23097c = str;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f23095a) {
            case 0:
                cu0 cu0Var = this.f23096b;
                String str = this.f23097c;
                cu0Var.getClass();
                AndroidUtilities.runOnUIThread(new bu0(cu0Var, str, 1));
                return;
            default:
                cu0 cu0Var2 = this.f23096b;
                String str2 = this.f23097c;
                ArrayList arrayList = null;
                cu0Var2.f23445f = null;
                if (!ChatObject.isChannel(cu0Var2.f23446n) && cu0Var2.f23448s.f26196d1 != null) {
                    arrayList = new ArrayList(cu0Var2.f23448s.f26196d1.participants.participants);
                }
                cu0Var2.f23447r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new en0((Object) cu0Var2, (Serializable) str2, arrayList, 6));
                } else {
                    cu0Var2.f23447r = 1;
                }
                gg.c2 c2Var = cu0Var2.e;
                if (ChatObject.isChannel(cu0Var2.f23446n)) {
                    j3 = cu0Var2.f23446n.f18343id;
                } else {
                    j3 = 0;
                }
                c2Var.g(str2, false, false, true, false, j3, false, 2, 1);
                return;
        }
    }
}

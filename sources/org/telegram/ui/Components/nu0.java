package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class nu0 implements Runnable {
    public final int f27716a;
    public final ou0 f27717b;
    public final String f27718c;

    public nu0(ou0 ou0Var, String str, int i10) {
        this.f27716a = i10;
        this.f27717b = ou0Var;
        this.f27718c = str;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f27716a) {
            case 0:
                ou0 ou0Var = this.f27717b;
                String str = this.f27718c;
                ou0Var.getClass();
                AndroidUtilities.runOnUIThread(new nu0(ou0Var, str, 1));
                return;
            default:
                ou0 ou0Var2 = this.f27717b;
                String str2 = this.f27718c;
                ArrayList arrayList = null;
                ou0Var2.f28060f = null;
                if (!ChatObject.isChannel(ou0Var2.f28061n) && ou0Var2.f28063s.f31350d1 != null) {
                    arrayList = new ArrayList(ou0Var2.f28063s.f31350d1.participants.participants);
                }
                ou0Var2.f28062r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new v70((lm0) ou0Var2, str2, arrayList, 12));
                } else {
                    ou0Var2.f28062r = 1;
                }
                hg.a2 a2Var = ou0Var2.e;
                if (ChatObject.isChannel(ou0Var2.f28061n)) {
                    j10 = ou0Var2.f28061n.f19216id;
                } else {
                    j10 = 0;
                }
                a2Var.g(str2, false, false, true, false, j10, false, 2, 1);
                return;
        }
    }
}

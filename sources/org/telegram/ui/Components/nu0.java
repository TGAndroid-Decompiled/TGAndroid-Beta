package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class nu0 implements Runnable {
    public final int f27415a;
    public final ou0 f27416b;
    public final String f27417c;

    public nu0(ou0 ou0Var, String str, int i10) {
        this.f27415a = i10;
        this.f27416b = ou0Var;
        this.f27417c = str;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f27415a) {
            case 0:
                ou0 ou0Var = this.f27416b;
                String str = this.f27417c;
                ou0Var.getClass();
                AndroidUtilities.runOnUIThread(new nu0(ou0Var, str, 1));
                return;
            default:
                ou0 ou0Var2 = this.f27416b;
                String str2 = this.f27417c;
                ArrayList arrayList = null;
                ou0Var2.f27744f = null;
                if (!ChatObject.isChannel(ou0Var2.f27745n) && ou0Var2.f27747s.f31031d1 != null) {
                    arrayList = new ArrayList(ou0Var2.f27747s.f31031d1.participants.participants);
                }
                ou0Var2.f27746r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new ze0(ou0Var2, str2, arrayList, 9));
                } else {
                    ou0Var2.f27746r = 1;
                }
                hg.a2 a2Var = ou0Var2.e;
                if (ChatObject.isChannel(ou0Var2.f27745n)) {
                    j10 = ou0Var2.f27745n.f18916id;
                } else {
                    j10 = 0;
                }
                a2Var.g(str2, false, false, true, false, j10, false, 2, 1);
                return;
        }
    }
}

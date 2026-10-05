package org.telegram.ui.Components;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class gu0 implements Runnable {
    public final int f26976a;
    public final hu0 f26977b;
    public final String f26978c;

    public gu0(hu0 hu0Var, String str, int i10) {
        this.f26976a = i10;
        this.f26977b = hu0Var;
        this.f26978c = str;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f26976a) {
            case 0:
                hu0 hu0Var = this.f26977b;
                String str = this.f26978c;
                hu0Var.getClass();
                AndroidUtilities.runOnUIThread(new gu0(hu0Var, str, 1));
                return;
            default:
                hu0 hu0Var2 = this.f26977b;
                String str2 = this.f26978c;
                ArrayList arrayList = null;
                hu0Var2.f27330f = null;
                if (!ChatObject.isChannel(hu0Var2.f27331n) && hu0Var2.f27333s.f30224d1 != null) {
                    arrayList = new ArrayList(hu0Var2.f27333s.f30224d1.participants.participants);
                }
                hu0Var2.f27332r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new in0((Object) hu0Var2, (Serializable) str2, arrayList, 6));
                } else {
                    hu0Var2.f27332r = 1;
                }
                gg.c2 c2Var = hu0Var2.f27329e;
                if (ChatObject.isChannel(hu0Var2.f27331n)) {
                    j3 = hu0Var2.f27331n.f20047id;
                } else {
                    j3 = 0;
                }
                c2Var.g(str2, false, false, true, false, j3, false, 2, 1);
                return;
        }
    }
}

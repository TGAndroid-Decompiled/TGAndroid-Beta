package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class ju0 implements Runnable {
    public final int f27602a;
    public final ku0 f27603b;
    public final String f27604c;

    public ju0(ku0 ku0Var, String str, int i10) {
        this.f27602a = i10;
        this.f27603b = ku0Var;
        this.f27604c = str;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f27602a) {
            case 0:
                ku0 ku0Var = this.f27603b;
                String str = this.f27604c;
                ku0Var.getClass();
                AndroidUtilities.runOnUIThread(new ju0(ku0Var, str, 1));
                return;
            default:
                ku0 ku0Var2 = this.f27603b;
                String str2 = this.f27604c;
                ArrayList arrayList = null;
                ku0Var2.f27971f = null;
                if (!ChatObject.isChannel(ku0Var2.f27972n) && ku0Var2.f27974s.f30694d1 != null) {
                    arrayList = new ArrayList(ku0Var2.f27974s.f30694d1.participants.participants);
                }
                ku0Var2.f27973r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new lg((Object) ku0Var2, (Object) str2, arrayList, 24));
                } else {
                    ku0Var2.f27973r = 1;
                }
                hg.a2 a2Var = ku0Var2.e;
                if (ChatObject.isChannel(ku0Var2.f27972n)) {
                    j10 = ku0Var2.f27972n.f20273id;
                } else {
                    j10 = 0;
                }
                a2Var.g(str2, false, false, true, false, j10, false, 2, 1);
                return;
        }
    }
}

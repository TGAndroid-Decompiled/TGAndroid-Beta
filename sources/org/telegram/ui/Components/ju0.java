package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class ju0 implements Runnable {
    public final int f27604a;
    public final ku0 f27605b;
    public final String f27606c;

    public ju0(ku0 ku0Var, String str, int i10) {
        this.f27604a = i10;
        this.f27605b = ku0Var;
        this.f27606c = str;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f27604a) {
            case 0:
                ku0 ku0Var = this.f27605b;
                String str = this.f27606c;
                ku0Var.getClass();
                AndroidUtilities.runOnUIThread(new ju0(ku0Var, str, 1));
                return;
            default:
                ku0 ku0Var2 = this.f27605b;
                String str2 = this.f27606c;
                ArrayList arrayList = null;
                ku0Var2.f27973f = null;
                if (!ChatObject.isChannel(ku0Var2.f27974n) && ku0Var2.f27976s.f30696d1 != null) {
                    arrayList = new ArrayList(ku0Var2.f27976s.f30696d1.participants.participants);
                }
                ku0Var2.f27975r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new lg((Object) ku0Var2, (Object) str2, arrayList, 24));
                } else {
                    ku0Var2.f27975r = 1;
                }
                hg.a2 a2Var = ku0Var2.e;
                if (ChatObject.isChannel(ku0Var2.f27974n)) {
                    j10 = ku0Var2.f27974n.f20275id;
                } else {
                    j10 = 0;
                }
                a2Var.g(str2, false, false, true, false, j10, false, 2, 1);
                return;
        }
    }
}

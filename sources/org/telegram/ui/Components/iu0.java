package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class iu0 implements Runnable {
    public final int f27359a;
    public final ju0 f27360b;
    public final String f27361c;

    public iu0(ju0 ju0Var, String str, int i10) {
        this.f27359a = i10;
        this.f27360b = ju0Var;
        this.f27361c = str;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f27359a) {
            case 0:
                ju0 ju0Var = this.f27360b;
                String str = this.f27361c;
                ju0Var.getClass();
                AndroidUtilities.runOnUIThread(new iu0(ju0Var, str, 1));
                return;
            default:
                ju0 ju0Var2 = this.f27360b;
                String str2 = this.f27361c;
                ArrayList arrayList = null;
                ju0Var2.f27607f = null;
                if (!ChatObject.isChannel(ju0Var2.f27608n) && ju0Var2.f27610s.f30357d1 != null) {
                    arrayList = new ArrayList(ju0Var2.f27610s.f30357d1.participants.participants);
                }
                ju0Var2.f27609r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new lg((Object) ju0Var2, (Object) str2, arrayList, 24));
                } else {
                    ju0Var2.f27609r = 1;
                }
                hg.a2 a2Var = ju0Var2.e;
                if (ChatObject.isChannel(ju0Var2.f27608n)) {
                    j10 = ju0Var2.f27608n.f20279id;
                } else {
                    j10 = 0;
                }
                a2Var.g(str2, false, false, true, false, j10, false, 2, 1);
                return;
        }
    }
}

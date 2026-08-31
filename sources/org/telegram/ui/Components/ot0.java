package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class ot0 implements Runnable {
    public final int f29847a;
    public final pt0 f29848b;
    public final String f29849c;

    public ot0(pt0 pt0Var, String str, int i10) {
        this.f29847a = i10;
        this.f29848b = pt0Var;
        this.f29849c = str;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f29847a) {
            case 0:
                pt0 pt0Var = this.f29848b;
                String str = this.f29849c;
                pt0Var.getClass();
                AndroidUtilities.runOnUIThread(new ot0(pt0Var, str, 1));
                return;
            default:
                pt0 pt0Var2 = this.f29848b;
                String str2 = this.f29849c;
                ArrayList arrayList = null;
                pt0Var2.f30200f = null;
                if (!ChatObject.isChannel(pt0Var2.f30201n) && pt0Var2.f30203s.f33963a1 != null) {
                    arrayList = new ArrayList(pt0Var2.f30203s.f33963a1.participants.participants);
                }
                pt0Var2.f30202r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new jp(pt0Var2, str2, arrayList, 20));
                } else {
                    pt0Var2.f30202r = 1;
                }
                uf.k1 k1Var = pt0Var2.f30199e;
                if (ChatObject.isChannel(pt0Var2.f30201n)) {
                    j10 = pt0Var2.f30201n.f20843id;
                } else {
                    j10 = 0;
                }
                k1Var.g(str2, false, false, true, false, j10, false, 2, 1);
                return;
        }
    }
}

package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class ot0 implements Runnable {
    public final int f26882a;
    public final pt0 f26883b;
    public final String f26884c;

    public ot0(pt0 pt0Var, String str, int i10) {
        this.f26882a = i10;
        this.f26883b = pt0Var;
        this.f26884c = str;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f26882a) {
            case 0:
                pt0 pt0Var = this.f26883b;
                String str = this.f26884c;
                pt0Var.getClass();
                AndroidUtilities.runOnUIThread(new ot0(pt0Var, str, 1));
                return;
            default:
                pt0 pt0Var2 = this.f26883b;
                String str2 = this.f26884c;
                ArrayList arrayList = null;
                pt0Var2.f27140f = null;
                if (!ChatObject.isChannel(pt0Var2.f27141n) && pt0Var2.f27143s.f30351d1 != null) {
                    arrayList = new ArrayList(pt0Var2.f27143s.f30351d1.participants.participants);
                }
                pt0Var2.f27142r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new fr0(pt0Var2, str2, arrayList, 3));
                } else {
                    pt0Var2.f27142r = 1;
                }
                gg.c2 c2Var = pt0Var2.e;
                if (ChatObject.isChannel(pt0Var2.f27141n)) {
                    j3 = pt0Var2.f27141n.f18109id;
                } else {
                    j3 = 0;
                }
                c2Var.g(str2, false, false, true, false, j3, false, 2, 1);
                return;
        }
    }
}

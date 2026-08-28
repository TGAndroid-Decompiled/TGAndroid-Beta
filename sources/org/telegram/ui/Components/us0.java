package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class us0 implements Runnable {
    public final int f33118a;
    public final vs0 f33119b;
    public final String f33120c;

    public us0(vs0 vs0Var, String str, int i9) {
        this.f33118a = i9;
        this.f33119b = vs0Var;
        this.f33120c = str;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f33118a) {
            case 0:
                vs0 vs0Var = this.f33119b;
                String str = this.f33120c;
                vs0Var.getClass();
                AndroidUtilities.runOnUIThread(new us0(vs0Var, str, 1));
                return;
            default:
                vs0 vs0Var2 = this.f33119b;
                String str2 = this.f33120c;
                ArrayList arrayList = null;
                vs0Var2.f33999f = null;
                if (!ChatObject.isChannel(vs0Var2.f34000n) && vs0Var2.f34002s.Z0 != null) {
                    arrayList = new ArrayList(vs0Var2.f34002s.Z0.participants.participants);
                }
                vs0Var2.f34001r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new ue0(vs0Var2, str2, arrayList, 8));
                } else {
                    vs0Var2.f34001r = 1;
                }
                of.v1 v1Var = vs0Var2.f33998e;
                if (ChatObject.isChannel(vs0Var2.f34000n)) {
                    j10 = vs0Var2.f34000n.f22380id;
                } else {
                    j10 = 0;
                }
                v1Var.g(str2, false, false, true, false, j10, false, 2, 1);
                return;
        }
    }
}

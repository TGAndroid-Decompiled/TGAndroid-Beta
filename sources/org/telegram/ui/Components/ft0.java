package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class ft0 implements Runnable {
    public final int f28530a;
    public final gt0 f28531b;
    public final String f28532c;

    public ft0(gt0 gt0Var, String str, int i10) {
        this.f28530a = i10;
        this.f28531b = gt0Var;
        this.f28532c = str;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f28530a) {
            case 0:
                gt0 gt0Var = this.f28531b;
                String str = this.f28532c;
                gt0Var.getClass();
                AndroidUtilities.runOnUIThread(new ft0(gt0Var, str, 1));
                return;
            default:
                gt0 gt0Var2 = this.f28531b;
                String str2 = this.f28532c;
                ArrayList arrayList = null;
                gt0Var2.f28982f = null;
                if (!ChatObject.isChannel(gt0Var2.f28983n) && gt0Var2.f28985s.Z0 != null) {
                    arrayList = new ArrayList(gt0Var2.f28985s.Z0.participants.participants);
                }
                gt0Var2.f28984r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new g(gt0Var2, str2, arrayList, 27));
                } else {
                    gt0Var2.f28984r = 1;
                }
                rf.k1 k1Var = gt0Var2.f28981e;
                if (ChatObject.isChannel(gt0Var2.f28983n)) {
                    j10 = gt0Var2.f28983n.f22392id;
                } else {
                    j10 = 0;
                }
                k1Var.g(str2, false, false, true, false, j10, false, 2, 1);
                return;
        }
    }
}

package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class tu0 implements Runnable {
    public final int f31154a;
    public final uu0 f31155b;
    public final String f31156c;

    public tu0(uu0 uu0Var, String str, int i10) {
        this.f31154a = i10;
        this.f31155b = uu0Var;
        this.f31156c = str;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f31154a) {
            case 0:
                uu0 uu0Var = this.f31155b;
                String str = this.f31156c;
                uu0Var.getClass();
                AndroidUtilities.runOnUIThread(new tu0(uu0Var, str, 1));
                return;
            default:
                uu0 uu0Var2 = this.f31155b;
                String str2 = this.f31156c;
                ArrayList arrayList = null;
                uu0Var2.f31567f = null;
                if (!ChatObject.isChannel(uu0Var2.f31568n) && uu0Var2.f31570s.f25696d1 != null) {
                    arrayList = new ArrayList(uu0Var2.f31570s.f25696d1.participants.participants);
                }
                uu0Var2.f31569r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new cf0(uu0Var2, str2, arrayList, 9));
                } else {
                    uu0Var2.f31569r = 1;
                }
                gg.b2 b2Var = uu0Var2.f31566e;
                if (ChatObject.isChannel(uu0Var2.f31568n)) {
                    j3 = uu0Var2.f31568n.f20032id;
                } else {
                    j3 = 0;
                }
                b2Var.g(str2, false, false, true, false, j3, false, 2, 1);
                return;
        }
    }
}

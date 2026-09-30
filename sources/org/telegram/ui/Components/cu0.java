package org.telegram.ui.Components;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class cu0 implements Runnable {
    public final int f23421a;
    public final du0 f23422b;
    public final String f23423c;

    public cu0(du0 du0Var, String str, int i10) {
        this.f23421a = i10;
        this.f23422b = du0Var;
        this.f23423c = str;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f23421a) {
            case 0:
                du0 du0Var = this.f23422b;
                String str = this.f23423c;
                du0Var.getClass();
                AndroidUtilities.runOnUIThread(new cu0(du0Var, str, 1));
                return;
            default:
                du0 du0Var2 = this.f23422b;
                String str2 = this.f23423c;
                ArrayList arrayList = null;
                du0Var2.f23730f = null;
                if (!ChatObject.isChannel(du0Var2.f23731n) && du0Var2.f23733s.f26411d1 != null) {
                    arrayList = new ArrayList(du0Var2.f23733s.f26411d1.participants.participants);
                }
                du0Var2.f23732r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new fn0((Object) du0Var2, (Serializable) str2, arrayList, 6));
                } else {
                    du0Var2.f23732r = 1;
                }
                gg.c2 c2Var = du0Var2.e;
                if (ChatObject.isChannel(du0Var2.f23731n)) {
                    j3 = du0Var2.f23731n.f18352id;
                } else {
                    j3 = 0;
                }
                c2Var.g(str2, false, false, true, false, j3, false, 2, 1);
                return;
        }
    }
}

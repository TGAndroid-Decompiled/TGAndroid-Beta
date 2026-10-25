package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class z30 implements Runnable {
    public final int f35192a;
    public final b40 f35193b;
    public final String f35194c;
    public final int d;

    public z30(b40 b40Var, String str, int i10, int i11) {
        this.f35192a = i11;
        this.f35193b = b40Var;
        this.f35194c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f35192a) {
            case 0:
                b40 b40Var = this.f35193b;
                String str = this.f35194c;
                int i10 = this.d;
                if (b40Var.e != null) {
                    b40Var.e = null;
                    AndroidUtilities.runOnUIThread(new z30(b40Var, str, i10, 1));
                    return;
                }
                return;
            default:
                b40 b40Var2 = this.f35193b;
                String str2 = this.f35194c;
                int i11 = this.d;
                ArrayList arrayList = null;
                b40Var2.e = null;
                if (!ChatObject.isChannel(b40Var2.f26751w.V) && b40Var2.f26751w.W != null) {
                    arrayList = new ArrayList(b40Var2.f26751w.W.participants.participants);
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    Utilities.searchQueue.postRunnable(new ai.h1(b40Var2, str2, i11, arrayList2, 24));
                } else {
                    b40Var2.h = false;
                }
                ig.a2 a2Var = b40Var2.d;
                boolean canAddUsers = ChatObject.canAddUsers(b40Var2.f26751w.V);
                if (ChatObject.isChannel(b40Var2.f26751w.V)) {
                    j10 = b40Var2.f26751w.V.f22027id;
                } else {
                    j10 = 0;
                }
                a2Var.g(str2, canAddUsers, false, true, false, j10, false, 2, i11);
                return;
        }
    }
}

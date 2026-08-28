package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class y20 implements Runnable {
    public final int f34839a;
    public final a30 f34840b;
    public final String f34841c;
    public final int d;

    public y20(a30 a30Var, String str, int i9, int i10) {
        this.f34839a = i10;
        this.f34840b = a30Var;
        this.f34841c = str;
        this.d = i9;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f34839a) {
            case 0:
                a30 a30Var = this.f34840b;
                String str = this.f34841c;
                int i9 = this.d;
                if (a30Var.f26651e != null) {
                    a30Var.f26651e = null;
                    AndroidUtilities.runOnUIThread(new y20(a30Var, str, i9, 1));
                    return;
                }
                return;
            default:
                a30 a30Var2 = this.f34840b;
                String str2 = this.f34841c;
                int i10 = this.d;
                ArrayList arrayList = null;
                a30Var2.f26651e = null;
                if (!ChatObject.isChannel(a30Var2.f26656w.R) && a30Var2.f26656w.S != null) {
                    arrayList = new ArrayList(a30Var2.f26656w.S.participants.participants);
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    Utilities.searchQueue.postRunnable(new c3.d(a30Var2, str2, i10, arrayList2, 19));
                } else {
                    a30Var2.h = false;
                }
                of.v1 v1Var = a30Var2.d;
                boolean canAddUsers = ChatObject.canAddUsers(a30Var2.f26656w.R);
                if (ChatObject.isChannel(a30Var2.f26656w.R)) {
                    j10 = a30Var2.f26656w.R.f22380id;
                } else {
                    j10 = 0;
                }
                v1Var.g(str2, canAddUsers, false, true, false, j10, false, 2, i10);
                return;
        }
    }
}

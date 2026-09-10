package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class y30 implements Runnable {
    public final int f29238a;
    public final a40 f29239b;
    public final String f29240c;
    public final int d;

    public y30(a40 a40Var, String str, int i10, int i11) {
        this.f29238a = i11;
        this.f29239b = a40Var;
        this.f29240c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f29238a) {
            case 0:
                a40 a40Var = this.f29239b;
                String str = this.f29240c;
                int i10 = this.d;
                if (a40Var.e != null) {
                    a40Var.e = null;
                    AndroidUtilities.runOnUIThread(new y30(a40Var, str, i10, 1));
                    return;
                }
                return;
            default:
                a40 a40Var2 = this.f29239b;
                String str2 = this.f29240c;
                int i11 = this.d;
                ArrayList arrayList = null;
                a40Var2.e = null;
                if (!ChatObject.isChannel(a40Var2.f21385w.V) && a40Var2.f21385w.W != null) {
                    arrayList = new ArrayList(a40Var2.f21385w.W.participants.participants);
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    Utilities.searchQueue.postRunnable(new di.q((Object) a40Var2, (Object) str2, i11, arrayList2, 19));
                } else {
                    a40Var2.h = false;
                }
                fg.d2 d2Var = a40Var2.d;
                boolean canAddUsers = ChatObject.canAddUsers(a40Var2.f21385w.V);
                if (ChatObject.isChannel(a40Var2.f21385w.V)) {
                    j3 = a40Var2.f21385w.V.f17195id;
                } else {
                    j3 = 0;
                }
                d2Var.g(str2, canAddUsers, false, true, false, j3, false, 2, i11);
                return;
        }
    }
}

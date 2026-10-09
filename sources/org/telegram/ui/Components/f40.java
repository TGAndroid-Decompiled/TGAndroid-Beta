package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class f40 implements Runnable {
    public final int f26237a;
    public final h40 f26238b;
    public final String f26239c;
    public final int d;

    public f40(h40 h40Var, String str, int i10, int i11) {
        this.f26237a = i11;
        this.f26238b = h40Var;
        this.f26239c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f26237a) {
            case 0:
                h40 h40Var = this.f26238b;
                String str = this.f26239c;
                int i10 = this.d;
                if (h40Var.f26954e != null) {
                    h40Var.f26954e = null;
                    AndroidUtilities.runOnUIThread(new f40(h40Var, str, i10, 1));
                    return;
                }
                return;
            default:
                h40 h40Var2 = this.f26238b;
                String str2 = this.f26239c;
                int i11 = this.d;
                ArrayList arrayList = null;
                h40Var2.f26954e = null;
                if (!ChatObject.isChannel(h40Var2.f26959w.V) && h40Var2.f26959w.W != null) {
                    arrayList = new ArrayList(h40Var2.f26959w.W.participants.participants);
                }
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new ai.d9(h40Var2, str2, i11, arrayList));
                } else {
                    h40Var2.h = false;
                }
                gg.b2 b2Var = h40Var2.d;
                boolean canAddUsers = ChatObject.canAddUsers(h40Var2.f26959w.V);
                if (ChatObject.isChannel(h40Var2.f26959w.V)) {
                    j3 = h40Var2.f26959w.V.f20038id;
                } else {
                    j3 = 0;
                }
                b2Var.g(str2, canAddUsers, false, true, false, j3, false, 2, i11);
                return;
        }
    }
}

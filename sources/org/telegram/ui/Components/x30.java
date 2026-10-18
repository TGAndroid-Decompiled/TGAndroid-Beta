package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class x30 implements Runnable {
    public final int f32297a;
    public final z30 f32298b;
    public final String f32299c;
    public final int d;

    public x30(z30 z30Var, String str, int i10, int i11) {
        this.f32297a = i11;
        this.f32298b = z30Var;
        this.f32299c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f32297a) {
            case 0:
                z30 z30Var = this.f32298b;
                String str = this.f32299c;
                int i10 = this.d;
                if (z30Var.e != null) {
                    z30Var.e = null;
                    AndroidUtilities.runOnUIThread(new x30(z30Var, str, i10, 1));
                    return;
                }
                return;
            default:
                z30 z30Var2 = this.f32298b;
                String str2 = this.f32299c;
                int i11 = this.d;
                ArrayList arrayList = null;
                z30Var2.e = null;
                if (!ChatObject.isChannel(z30Var2.f32830w.V) && z30Var2.f32830w.W != null) {
                    arrayList = new ArrayList(z30Var2.f32830w.W.participants.participants);
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    Utilities.searchQueue.postRunnable(new ai.cb(z30Var2, str2, i11, arrayList2, 21));
                } else {
                    z30Var2.h = false;
                }
                hg.a2 a2Var = z30Var2.d;
                boolean canAddUsers = ChatObject.canAddUsers(z30Var2.f32830w.V);
                if (ChatObject.isChannel(z30Var2.f32830w.V)) {
                    j10 = z30Var2.f32830w.V.f20272id;
                } else {
                    j10 = 0;
                }
                a2Var.g(str2, canAddUsers, false, true, false, j10, false, 2, i11);
                return;
        }
    }
}

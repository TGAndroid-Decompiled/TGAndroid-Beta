package org.telegram.ui.Components;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class bu0 implements Runnable {
    public final int f23125a;
    public final cu0 f23126b;
    public final String f23127c;

    public bu0(cu0 cu0Var, String str, int i10) {
        this.f23125a = i10;
        this.f23126b = cu0Var;
        this.f23127c = str;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f23125a) {
            case 0:
                cu0 cu0Var = this.f23126b;
                String str = this.f23127c;
                cu0Var.getClass();
                AndroidUtilities.runOnUIThread(new bu0(cu0Var, str, 1));
                return;
            default:
                cu0 cu0Var2 = this.f23126b;
                String str2 = this.f23127c;
                ArrayList arrayList = null;
                cu0Var2.f23409f = null;
                if (!ChatObject.isChannel(cu0Var2.f23410n) && cu0Var2.f23412s.f26174d1 != null) {
                    arrayList = new ArrayList(cu0Var2.f23412s.f26174d1.participants.participants);
                }
                cu0Var2.f23411r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new en0((Object) cu0Var2, (Serializable) str2, arrayList, 6));
                } else {
                    cu0Var2.f23411r = 1;
                }
                gg.c2 c2Var = cu0Var2.e;
                if (ChatObject.isChannel(cu0Var2.f23410n)) {
                    j3 = cu0Var2.f23410n.f18329id;
                } else {
                    j3 = 0;
                }
                c2Var.g(str2, false, false, true, false, j3, false, 2, 1);
                return;
        }
    }
}

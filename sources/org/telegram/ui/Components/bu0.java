package org.telegram.ui.Components;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class bu0 implements Runnable {
    public final int f23107a;
    public final cu0 f23108b;
    public final String f23109c;

    public bu0(cu0 cu0Var, String str, int i10) {
        this.f23107a = i10;
        this.f23108b = cu0Var;
        this.f23109c = str;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f23107a) {
            case 0:
                cu0 cu0Var = this.f23108b;
                String str = this.f23109c;
                cu0Var.getClass();
                AndroidUtilities.runOnUIThread(new bu0(cu0Var, str, 1));
                return;
            default:
                cu0 cu0Var2 = this.f23108b;
                String str2 = this.f23109c;
                ArrayList arrayList = null;
                cu0Var2.f23395f = null;
                if (!ChatObject.isChannel(cu0Var2.f23396n) && cu0Var2.f23398s.f26121d1 != null) {
                    arrayList = new ArrayList(cu0Var2.f23398s.f26121d1.participants.participants);
                }
                cu0Var2.f23397r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new en0((Object) cu0Var2, (Serializable) str2, arrayList, 6));
                } else {
                    cu0Var2.f23397r = 1;
                }
                gg.c2 c2Var = cu0Var2.e;
                if (ChatObject.isChannel(cu0Var2.f23396n)) {
                    j3 = cu0Var2.f23396n.f18335id;
                } else {
                    j3 = 0;
                }
                c2Var.g(str2, false, false, true, false, j3, false, 2, 1);
                return;
        }
    }
}

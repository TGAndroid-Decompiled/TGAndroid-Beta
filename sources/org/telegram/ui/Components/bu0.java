package org.telegram.ui.Components;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class bu0 implements Runnable {
    public final int f23077a;
    public final cu0 f23078b;
    public final String f23079c;

    public bu0(cu0 cu0Var, String str, int i10) {
        this.f23077a = i10;
        this.f23078b = cu0Var;
        this.f23079c = str;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f23077a) {
            case 0:
                cu0 cu0Var = this.f23078b;
                String str = this.f23079c;
                cu0Var.getClass();
                AndroidUtilities.runOnUIThread(new bu0(cu0Var, str, 1));
                return;
            default:
                cu0 cu0Var2 = this.f23078b;
                String str2 = this.f23079c;
                ArrayList arrayList = null;
                cu0Var2.f23394f = null;
                if (!ChatObject.isChannel(cu0Var2.f23395n) && cu0Var2.f23397s.f26116d1 != null) {
                    arrayList = new ArrayList(cu0Var2.f23397s.f26116d1.participants.participants);
                }
                cu0Var2.f23396r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new en0((Object) cu0Var2, (Serializable) str2, arrayList, 6));
                } else {
                    cu0Var2.f23396r = 1;
                }
                gg.c2 c2Var = cu0Var2.e;
                if (ChatObject.isChannel(cu0Var2.f23395n)) {
                    j3 = cu0Var2.f23395n.f18337id;
                } else {
                    j3 = 0;
                }
                c2Var.g(str2, false, false, true, false, j3, false, 2, 1);
                return;
        }
    }
}

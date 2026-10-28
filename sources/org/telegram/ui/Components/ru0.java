package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class ru0 implements Runnable {
    public final int f32375a;
    public final su0 f32376b;
    public final String f32377c;

    public ru0(su0 su0Var, String str, int i10) {
        this.f32375a = i10;
        this.f32376b = su0Var;
        this.f32377c = str;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f32375a) {
            case 0:
                su0 su0Var = this.f32376b;
                String str = this.f32377c;
                su0Var.getClass();
                AndroidUtilities.runOnUIThread(new ru0(su0Var, str, 1));
                return;
            default:
                su0 su0Var2 = this.f32376b;
                String str2 = this.f32377c;
                ArrayList arrayList = null;
                su0Var2.f32685f = null;
                if (!ChatObject.isChannel(su0Var2.f32686n) && su0Var2.f32688s.f26943f1 != null) {
                    arrayList = new ArrayList(su0Var2.f32688s.f26943f1.participants.participants);
                }
                su0Var2.f32687r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new kg(su0Var2, str2, arrayList, 24));
                } else {
                    su0Var2.f32687r = 1;
                }
                ig.a2 a2Var = su0Var2.e;
                if (ChatObject.isChannel(su0Var2.f32686n)) {
                    j10 = su0Var2.f32686n.f22028id;
                } else {
                    j10 = 0;
                }
                a2Var.g(str2, false, false, true, false, j10, false, 2, 1);
                return;
        }
    }
}

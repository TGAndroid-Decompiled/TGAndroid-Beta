package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class mu0 implements Runnable {
    public final int f28698a;
    public final nu0 f28699b;
    public final String f28700c;

    public mu0(nu0 nu0Var, String str, int i10) {
        this.f28698a = i10;
        this.f28699b = nu0Var;
        this.f28700c = str;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f28698a) {
            case 0:
                nu0 nu0Var = this.f28699b;
                String str = this.f28700c;
                nu0Var.getClass();
                AndroidUtilities.runOnUIThread(new mu0(nu0Var, str, 1));
                return;
            default:
                nu0 nu0Var2 = this.f28699b;
                String str2 = this.f28700c;
                ArrayList arrayList = null;
                nu0Var2.f29036f = null;
                if (!ChatObject.isChannel(nu0Var2.f29037n) && nu0Var2.f29039s.f32369d1 != null) {
                    arrayList = new ArrayList(nu0Var2.f29039s.f32369d1.participants.participants);
                }
                nu0Var2.f29038r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new jg((Object) nu0Var2, (Object) str2, arrayList, 24));
                } else {
                    nu0Var2.f29038r = 1;
                }
                hg.a2 a2Var = nu0Var2.e;
                if (ChatObject.isChannel(nu0Var2.f29037n)) {
                    j10 = nu0Var2.f29037n.f20344id;
                } else {
                    j10 = 0;
                }
                a2Var.g(str2, false, false, true, false, j10, false, 2, 1);
                return;
        }
    }
}

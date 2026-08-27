package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

public final class d30 implements Runnable {

    public final int f27636a;

    public final f30 f27637b;

    public final String f27638c;
    public final int d;

    public d30(f30 f30Var, String str, int i10, int i11) {
        this.f27636a = i11;
        this.f27637b = f30Var;
        this.f27638c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f27636a) {
            case 0:
                f30 f30Var = this.f27637b;
                String str = this.f27638c;
                int i10 = this.d;
                if (f30Var.f28244e != null) {
                    f30Var.f28244e = null;
                    AndroidUtilities.runOnUIThread(new d30(f30Var, str, i10, 1));
                    break;
                }
                break;
            default:
                f30 f30Var2 = this.f27637b;
                String str2 = this.f27638c;
                int i11 = this.d;
                ArrayList arrayList = null;
                f30Var2.f28244e = null;
                if (!ChatObject.isChannel(f30Var2.f28249w.R) && f30Var2.f28249w.S != null) {
                    arrayList = new ArrayList(f30Var2.f28249w.S.participants.participants);
                }
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new ag.k0(f30Var2, str2, i11, arrayList));
                } else {
                    f30Var2.h = false;
                }
                f30Var2.d.g(str2, ChatObject.canAddUsers(f30Var2.f28249w.R), false, true, false, ChatObject.isChannel(f30Var2.f28249w.R) ? f30Var2.f28249w.R.f22380id : 0L, false, 2, i11);
                break;
        }
    }
}

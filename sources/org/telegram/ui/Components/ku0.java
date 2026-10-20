package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class ku0 implements Runnable {
    public final int f27949a;
    public final lu0 f27950b;
    public final String f27951c;

    public ku0(lu0 lu0Var, String str, int i10) {
        this.f27949a = i10;
        this.f27950b = lu0Var;
        this.f27951c = str;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f27949a) {
            case 0:
                lu0 lu0Var = this.f27950b;
                String str = this.f27951c;
                lu0Var.getClass();
                AndroidUtilities.runOnUIThread(new ku0(lu0Var, str, 1));
                return;
            default:
                lu0 lu0Var2 = this.f27950b;
                String str2 = this.f27951c;
                ArrayList arrayList = null;
                lu0Var2.f28278f = null;
                if (!ChatObject.isChannel(lu0Var2.f28279n) && lu0Var2.f28281s.f31032d1 != null) {
                    arrayList = new ArrayList(lu0Var2.f28281s.f31032d1.participants.participants);
                }
                lu0Var2.f28280r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new lg((Object) lu0Var2, (Object) str2, arrayList, 24));
                } else {
                    lu0Var2.f28280r = 1;
                }
                hg.a2 a2Var = lu0Var2.e;
                if (ChatObject.isChannel(lu0Var2.f28279n)) {
                    j10 = lu0Var2.f28279n.f20276id;
                } else {
                    j10 = 0;
                }
                a2Var.g(str2, false, false, true, false, j10, false, 2, 1);
                return;
        }
    }
}

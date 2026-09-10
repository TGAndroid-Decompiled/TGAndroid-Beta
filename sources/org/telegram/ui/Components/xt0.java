package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class xt0 implements Runnable {
    public final int f29152a;
    public final yt0 f29153b;
    public final String f29154c;

    public xt0(yt0 yt0Var, String str, int i10) {
        this.f29152a = i10;
        this.f29153b = yt0Var;
        this.f29154c = str;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f29152a) {
            case 0:
                yt0 yt0Var = this.f29153b;
                String str = this.f29154c;
                yt0Var.getClass();
                AndroidUtilities.runOnUIThread(new xt0(yt0Var, str, 1));
                return;
            default:
                yt0 yt0Var2 = this.f29153b;
                String str2 = this.f29154c;
                ArrayList arrayList = null;
                yt0Var2.f29495f = null;
                if (!ChatObject.isChannel(yt0Var2.f29496n) && yt0Var2.f29498s.f24093d1 != null) {
                    arrayList = new ArrayList(yt0Var2.f29498s.f24093d1.participants.participants);
                }
                yt0Var2.f29497r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new gf(yt0Var2, str2, arrayList, 25));
                } else {
                    yt0Var2.f29497r = 1;
                }
                fg.d2 d2Var = yt0Var2.e;
                if (ChatObject.isChannel(yt0Var2.f29496n)) {
                    j3 = yt0Var2.f29496n.f17195id;
                } else {
                    j3 = 0;
                }
                d2Var.g(str2, false, false, true, false, j3, false, 2, 1);
                return;
        }
    }
}

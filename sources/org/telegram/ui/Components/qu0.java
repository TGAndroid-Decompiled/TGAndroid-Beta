package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class qu0 implements Runnable {
    public final int f32024a;
    public final ru0 f32025b;
    public final String f32026c;

    public qu0(ru0 ru0Var, String str, int i10) {
        this.f32024a = i10;
        this.f32025b = ru0Var;
        this.f32026c = str;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f32024a) {
            case 0:
                ru0 ru0Var = this.f32025b;
                String str = this.f32026c;
                ru0Var.getClass();
                AndroidUtilities.runOnUIThread(new qu0(ru0Var, str, 1));
                return;
            default:
                ru0 ru0Var2 = this.f32025b;
                String str2 = this.f32026c;
                ArrayList arrayList = null;
                ru0Var2.f32334f = null;
                if (!ChatObject.isChannel(ru0Var2.f32335n) && ru0Var2.f32337s.f26653f1 != null) {
                    arrayList = new ArrayList(ru0Var2.f32337s.f26653f1.participants.participants);
                }
                ru0Var2.f32336r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new kg(ru0Var2, str2, arrayList, 24));
                } else {
                    ru0Var2.f32336r = 1;
                }
                ig.a2 a2Var = ru0Var2.e;
                if (ChatObject.isChannel(ru0Var2.f32335n)) {
                    j10 = ru0Var2.f32335n.f22027id;
                } else {
                    j10 = 0;
                }
                a2Var.g(str2, false, false, true, false, j10, false, 2, 1);
                return;
        }
    }
}

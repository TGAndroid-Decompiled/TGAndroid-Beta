package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class nu0 implements Runnable {
    public final int f29014a;
    public final ou0 f29015b;
    public final String f29016c;

    public nu0(ou0 ou0Var, String str, int i10) {
        this.f29014a = i10;
        this.f29015b = ou0Var;
        this.f29016c = str;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f29014a) {
            case 0:
                ou0 ou0Var = this.f29015b;
                String str = this.f29016c;
                ou0Var.getClass();
                AndroidUtilities.runOnUIThread(new nu0(ou0Var, str, 1));
                return;
            default:
                ou0 ou0Var2 = this.f29015b;
                String str2 = this.f29016c;
                ArrayList arrayList = null;
                ou0Var2.f29316f = null;
                if (!ChatObject.isChannel(ou0Var2.f29317n) && ou0Var2.f29319s.f32670d1 != null) {
                    arrayList = new ArrayList(ou0Var2.f29319s.f32670d1.participants.participants);
                }
                ou0Var2.f29318r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new lg((Object) ou0Var2, (Object) str2, arrayList, 24));
                } else {
                    ou0Var2.f29318r = 1;
                }
                hg.a2 a2Var = ou0Var2.e;
                if (ChatObject.isChannel(ou0Var2.f29317n)) {
                    j10 = ou0Var2.f29317n.f20343id;
                } else {
                    j10 = 0;
                }
                a2Var.g(str2, false, false, true, false, j10, false, 2, 1);
                return;
        }
    }
}

package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class jk0 implements Runnable {
    public final int f34913a;
    public final kk0 f34914b;
    public final String f34915c;

    public jk0(kk0 kk0Var, String str, int i10) {
        this.f34913a = i10;
        this.f34914b = kk0Var;
        this.f34915c = str;
    }

    @Override
    public final void run() {
        switch (this.f34913a) {
            case 0:
                kk0 kk0Var = this.f34914b;
                String str = this.f34915c;
                kk0Var.getClass();
                AndroidUtilities.runOnUIThread(new jk0(kk0Var, str, 1));
                return;
            default:
                kk0 kk0Var2 = this.f34914b;
                String str2 = this.f34915c;
                gg.c2 c2Var = kk0Var2.h;
                int i10 = kk0Var2.f35192n.f31230s;
                boolean z10 = true;
                c2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new jf0(kk0Var2, str2, new ArrayList(kk0Var2.f35192n.f31231w), 8));
                return;
        }
    }
}

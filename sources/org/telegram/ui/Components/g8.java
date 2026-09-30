package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class g8 implements Runnable {
    public final int f24450a;
    public final i8 f24451b;
    public final String f24452c;

    public g8(i8 i8Var, String str, int i10) {
        this.f24450a = i10;
        this.f24451b = i8Var;
        this.f24452c = str;
    }

    @Override
    public final void run() {
        switch (this.f24450a) {
            case 0:
                i8 i8Var = this.f24451b;
                String str = this.f24452c;
                i8Var.f25035f = null;
                AndroidUtilities.runOnUIThread(new g8(i8Var, str, 1));
                return;
            default:
                i8 i8Var2 = this.f24451b;
                String str2 = this.f24452c;
                i8Var2.getClass();
                Utilities.searchQueue.postRunnable(new h8(i8Var2, str2, new ArrayList(i8Var2.f25036n.f25343x0)));
                return;
        }
    }
}

package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class z7 implements Runnable {
    public final int f31257a;
    public final b8 f31258b;
    public final String f31259c;

    public z7(b8 b8Var, String str, int i10) {
        this.f31257a = i10;
        this.f31258b = b8Var;
        this.f31259c = str;
    }

    @Override
    public final void run() {
        switch (this.f31257a) {
            case 0:
                b8 b8Var = this.f31258b;
                String str = this.f31259c;
                b8Var.f23590f = null;
                AndroidUtilities.runOnUIThread(new z7(b8Var, str, 1));
                return;
            default:
                b8 b8Var2 = this.f31258b;
                String str2 = this.f31259c;
                b8Var2.getClass();
                Utilities.searchQueue.postRunnable(new a8(b8Var2, str2, new ArrayList(b8Var2.f23591n.f23910u0)));
                return;
        }
    }
}

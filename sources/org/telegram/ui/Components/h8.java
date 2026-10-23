package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h8 implements Runnable {
    public final int f26815a;
    public final j8 f26816b;
    public final String f26817c;

    public h8(j8 j8Var, String str, int i10) {
        this.f26815a = i10;
        this.f26816b = j8Var;
        this.f26817c = str;
    }

    @Override
    public final void run() {
        switch (this.f26815a) {
            case 0:
                j8 j8Var = this.f26816b;
                String str = this.f26817c;
                j8Var.f27547f = null;
                AndroidUtilities.runOnUIThread(new h8(j8Var, str, 1));
                return;
            default:
                j8 j8Var2 = this.f26816b;
                String str2 = this.f26817c;
                j8Var2.getClass();
                Utilities.searchQueue.postRunnable(new i8(j8Var2, str2, new ArrayList(j8Var2.f27548n.f27942w0)));
                return;
        }
    }
}

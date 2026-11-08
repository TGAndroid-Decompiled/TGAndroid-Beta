package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class y7 implements Runnable {
    public final int f40595a;
    public final a8 f40596b;
    public final String f40597c;

    public y7(a8 a8Var, String str, int i7) {
        this.f40595a = i7;
        this.f40596b = a8Var;
        this.f40597c = str;
    }

    @Override
    public final void run() {
        switch (this.f40595a) {
            case 0:
                a8 a8Var = this.f40596b;
                String str = this.f40597c;
                a8Var.f31729f = null;
                org.telegram.messenger.g0.h3(new y7(a8Var, str, 1));
                return;
            default:
                a8 a8Var2 = this.f40596b;
                String str2 = this.f40597c;
                a8Var2.getClass();
                Utilities.f21338g.c(new z7(a8Var2, str2, new ArrayList(a8Var2.f31730n.f32099n2)));
                return;
        }
    }
}

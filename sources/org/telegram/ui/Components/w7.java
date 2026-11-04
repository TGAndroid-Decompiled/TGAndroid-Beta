package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class w7 implements Runnable {
    public final int f39921a;
    public final y7 f39922b;
    public final String f39923c;

    public w7(y7 y7Var, String str, int i3) {
        this.f39921a = i3;
        this.f39922b = y7Var;
        this.f39923c = str;
    }

    @Override
    public final void run() {
        switch (this.f39921a) {
            case 0:
                y7 y7Var = this.f39922b;
                String str = this.f39923c;
                y7Var.f40641f = null;
                org.telegram.messenger.g0.h3(new w7(y7Var, str, 1));
                return;
            default:
                y7 y7Var2 = this.f39922b;
                String str2 = this.f39923c;
                y7Var2.getClass();
                Utilities.f21389g.c(new x7(y7Var2, str2, new ArrayList(y7Var2.f40642n.f40957o2)));
                return;
        }
    }
}

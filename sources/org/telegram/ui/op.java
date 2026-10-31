package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class op implements Runnable {
    public final int f40359a;
    public final pp f40360b;
    public final String f40361c;

    public op(pp ppVar, String str, int i10) {
        this.f40359a = i10;
        this.f40360b = ppVar;
        this.f40361c = str;
    }

    @Override
    public final void run() {
        switch (this.f40359a) {
            case 0:
                pp ppVar = this.f40360b;
                String str = this.f40361c;
                ppVar.getClass();
                org.telegram.messenger.i0.g3(new op(ppVar, str, 1));
                return;
            default:
                pp ppVar2 = this.f40360b;
                String str2 = this.f40361c;
                ppVar2.f40711f = null;
                Utilities.f14522g.c(new p1(ppVar2, str2, new ArrayList(ppVar2.h.f41027w), 28));
                return;
        }
    }
}

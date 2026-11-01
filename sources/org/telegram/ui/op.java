package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class op implements Runnable {
    public final int f40240a;
    public final pp f40241b;
    public final String f40242c;

    public op(pp ppVar, String str, int i10) {
        this.f40240a = i10;
        this.f40241b = ppVar;
        this.f40242c = str;
    }

    @Override
    public final void run() {
        switch (this.f40240a) {
            case 0:
                pp ppVar = this.f40241b;
                String str = this.f40242c;
                ppVar.getClass();
                org.telegram.messenger.i0.g3(new op(ppVar, str, 1));
                return;
            default:
                pp ppVar2 = this.f40241b;
                String str2 = this.f40242c;
                ppVar2.f40518f = null;
                Utilities.f14523g.c(new p1(ppVar2, str2, new ArrayList(ppVar2.h.f40876w), 28));
                return;
        }
    }
}

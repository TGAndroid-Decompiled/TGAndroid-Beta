package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class oo implements Runnable {
    public final int f48321a;
    public final po f48322b;
    public final String f48323c;

    public oo(po poVar, String str, int i3) {
        this.f48321a = i3;
        this.f48322b = poVar;
        this.f48323c = str;
    }

    @Override
    public final void run() {
        switch (this.f48321a) {
            case 0:
                po poVar = this.f48322b;
                String str = this.f48323c;
                poVar.getClass();
                org.telegram.messenger.g0.h3(new oo(poVar, str, 1));
                return;
            default:
                po poVar2 = this.f48322b;
                String str2 = this.f48323c;
                poVar2.f48619f = null;
                Utilities.f21389g.c(new p1(poVar2, str2, new ArrayList(poVar2.h.f48928w), 28));
                return;
        }
    }
}

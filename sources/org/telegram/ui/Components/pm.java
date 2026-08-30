package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class pm implements Utilities.Callback {
    public final int f27930a;
    public final qn f27931b;
    public final int f27932c;

    public pm(qn qnVar, int i10, int i11) {
        this.f27930a = i11;
        this.f27931b = qnVar;
        this.f27932c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f27930a) {
            case 0:
                this.f27931b.e0(this.f27932c, (dh.h) obj);
                return;
            default:
                qn qnVar = this.f27931b;
                qnVar.getClass();
                qnVar.e0(this.f27932c, new eh.e((String) obj));
                return;
        }
    }
}

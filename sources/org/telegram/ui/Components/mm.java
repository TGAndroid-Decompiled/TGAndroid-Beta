package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class mm implements Utilities.Callback {
    public final int f30726a;
    public final on f30727b;
    public final int f30728c;

    public mm(on onVar, int i10, int i11) {
        this.f30726a = i11;
        this.f30727b = onVar;
        this.f30728c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f30726a) {
            case 0:
                this.f30727b.e0(this.f30728c, (bh.h) obj);
                return;
            default:
                on onVar = this.f30727b;
                onVar.getClass();
                onVar.e0(this.f30728c, new ch.e((String) obj));
                return;
        }
    }
}

package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

public final class fm implements Utilities.Callback {

    public final int f28406a;

    public final in f28407b;

    public final int f28408c;

    public fm(in inVar, int i10, int i11) {
        this.f28406a = i11;
        this.f28407b = inVar;
        this.f28408c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f28406a) {
            case 0:
                this.f28407b.e0(this.f28408c, (zg.e) obj);
                break;
            default:
                in inVar = this.f28407b;
                inVar.getClass();
                inVar.e0(this.f28408c, new ah.e((String) obj));
                break;
        }
    }
}

package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class ym implements Utilities.Callback {
    public final int f29452a;
    public final zn f29453b;
    public final int f29454c;

    public ym(zn znVar, int i10, int i11) {
        this.f29452a = i11;
        this.f29453b = znVar;
        this.f29454c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f29452a) {
            case 0:
                this.f29453b.e0(this.f29454c, (ph.e) obj);
                return;
            default:
                zn znVar = this.f29453b;
                znVar.getClass();
                znVar.e0(this.f29454c, new qh.e((String) obj));
                return;
        }
    }
}

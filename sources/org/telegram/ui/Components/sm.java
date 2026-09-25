package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class sm implements Utilities.Callback {
    public final int f28275a;
    public final vn f28276b;
    public final int f28277c;

    public sm(vn vnVar, int i10, int i11) {
        this.f28275a = i11;
        this.f28276b = vnVar;
        this.f28277c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f28275a) {
            case 0:
                this.f28276b.e0(this.f28277c, (qh.e) obj);
                return;
            default:
                vn vnVar = this.f28276b;
                vnVar.getClass();
                vnVar.e0(this.f28277c, new rh.e((String) obj));
                return;
        }
    }
}

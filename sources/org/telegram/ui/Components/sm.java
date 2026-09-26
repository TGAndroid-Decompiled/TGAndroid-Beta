package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class sm implements Utilities.Callback {
    public final int f28274a;
    public final vn f28275b;
    public final int f28276c;

    public sm(vn vnVar, int i10, int i11) {
        this.f28274a = i11;
        this.f28275b = vnVar;
        this.f28276c = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f28274a) {
            case 0:
                this.f28275b.e0(this.f28276c, (qh.e) obj);
                return;
            default:
                vn vnVar = this.f28275b;
                vnVar.getClass();
                vnVar.e0(this.f28276c, new rh.e((String) obj));
                return;
        }
    }
}

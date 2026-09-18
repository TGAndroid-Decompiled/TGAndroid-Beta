package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class go implements View.OnClickListener {
    public final int f24463a;
    public final jo f24464b;
    public final TLRPC.Document f24465c;

    public go(jo joVar, TLRPC.Document document, int i10) {
        this.f24463a = i10;
        this.f24464b = joVar;
        this.f24465c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24463a) {
            case 0:
                io ioVar = this.f24464b.d;
                if (ioVar != null) {
                    ioVar.c(this.f24465c);
                    return;
                }
                return;
            default:
                io ioVar2 = this.f24464b.d;
                if (ioVar2 != null) {
                    ioVar2.c(this.f24465c);
                    return;
                }
                return;
        }
    }
}

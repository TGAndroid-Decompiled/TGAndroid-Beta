package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class go implements View.OnClickListener {
    public final int f24600a;
    public final jo f24601b;
    public final TLRPC.Document f24602c;

    public go(jo joVar, TLRPC.Document document, int i10) {
        this.f24600a = i10;
        this.f24601b = joVar;
        this.f24602c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24600a) {
            case 0:
                io ioVar = this.f24601b.d;
                if (ioVar != null) {
                    ioVar.c(this.f24602c);
                    return;
                }
                return;
            default:
                io ioVar2 = this.f24601b.d;
                if (ioVar2 != null) {
                    ioVar2.c(this.f24602c);
                    return;
                }
                return;
        }
    }
}

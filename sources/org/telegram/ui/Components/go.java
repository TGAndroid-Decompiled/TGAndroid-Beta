package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class go implements View.OnClickListener {
    public final int f24425a;
    public final jo f24426b;
    public final TLRPC.Document f24427c;

    public go(jo joVar, TLRPC.Document document, int i10) {
        this.f24425a = i10;
        this.f24426b = joVar;
        this.f24427c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24425a) {
            case 0:
                io ioVar = this.f24426b.d;
                if (ioVar != null) {
                    ioVar.c(this.f24427c);
                    return;
                }
                return;
            default:
                io ioVar2 = this.f24426b.d;
                if (ioVar2 != null) {
                    ioVar2.c(this.f24427c);
                    return;
                }
                return;
        }
    }
}

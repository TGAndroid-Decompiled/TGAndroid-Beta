package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class go implements View.OnClickListener {
    public final int f24428a;
    public final jo f24429b;
    public final TLRPC.Document f24430c;

    public go(jo joVar, TLRPC.Document document, int i10) {
        this.f24428a = i10;
        this.f24429b = joVar;
        this.f24430c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24428a) {
            case 0:
                io ioVar = this.f24429b.d;
                if (ioVar != null) {
                    ioVar.c(this.f24430c);
                    return;
                }
                return;
            default:
                io ioVar2 = this.f24429b.d;
                if (ioVar2 != null) {
                    ioVar2.c(this.f24430c);
                    return;
                }
                return;
        }
    }
}

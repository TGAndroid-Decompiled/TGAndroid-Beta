package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class go implements View.OnClickListener {
    public final int f24352a;
    public final jo f24353b;
    public final TLRPC.Document f24354c;

    public go(jo joVar, TLRPC.Document document, int i10) {
        this.f24352a = i10;
        this.f24353b = joVar;
        this.f24354c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24352a) {
            case 0:
                io ioVar = this.f24353b.d;
                if (ioVar != null) {
                    ioVar.c(this.f24354c);
                    return;
                }
                return;
            default:
                io ioVar2 = this.f24353b.d;
                if (ioVar2 != null) {
                    ioVar2.c(this.f24354c);
                    return;
                }
                return;
        }
    }
}

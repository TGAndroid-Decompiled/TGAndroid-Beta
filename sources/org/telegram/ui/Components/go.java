package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class go implements View.OnClickListener {
    public final int f24430a;
    public final jo f24431b;
    public final TLRPC.Document f24432c;

    public go(jo joVar, TLRPC.Document document, int i10) {
        this.f24430a = i10;
        this.f24431b = joVar;
        this.f24432c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24430a) {
            case 0:
                io ioVar = this.f24431b.d;
                if (ioVar != null) {
                    ioVar.c(this.f24432c);
                    return;
                }
                return;
            default:
                io ioVar2 = this.f24431b.d;
                if (ioVar2 != null) {
                    ioVar2.c(this.f24432c);
                    return;
                }
                return;
        }
    }
}

package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class go implements View.OnClickListener {
    public final int f24355a;
    public final jo f24356b;
    public final TLRPC.Document f24357c;

    public go(jo joVar, TLRPC.Document document, int i10) {
        this.f24355a = i10;
        this.f24356b = joVar;
        this.f24357c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24355a) {
            case 0:
                io ioVar = this.f24356b.d;
                if (ioVar != null) {
                    ioVar.c(this.f24357c);
                    return;
                }
                return;
            default:
                io ioVar2 = this.f24356b.d;
                if (ioVar2 != null) {
                    ioVar2.c(this.f24357c);
                    return;
                }
                return;
        }
    }
}

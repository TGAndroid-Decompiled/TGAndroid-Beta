package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class yo implements View.OnClickListener {
    public final int f33143a;
    public final bp f33144b;
    public final TLRPC.Document f33145c;

    public yo(bp bpVar, TLRPC.Document document, int i10) {
        this.f33143a = i10;
        this.f33144b = bpVar;
        this.f33145c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33143a) {
            case 0:
                ap apVar = this.f33144b.d;
                if (apVar != null) {
                    apVar.c(this.f33145c);
                    return;
                }
                return;
            default:
                ap apVar2 = this.f33144b.d;
                if (apVar2 != null) {
                    apVar2.c(this.f33145c);
                    return;
                }
                return;
        }
    }
}

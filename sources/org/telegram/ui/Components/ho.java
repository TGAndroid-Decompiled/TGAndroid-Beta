package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ho implements View.OnClickListener {
    public final int f24843a;
    public final ko f24844b;
    public final TLRPC.Document f24845c;

    public ho(ko koVar, TLRPC.Document document, int i10) {
        this.f24843a = i10;
        this.f24844b = koVar;
        this.f24845c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24843a) {
            case 0:
                jo joVar = this.f24844b.d;
                if (joVar != null) {
                    joVar.c(this.f24845c);
                    return;
                }
                return;
            default:
                jo joVar2 = this.f24844b.d;
                if (joVar2 != null) {
                    joVar2.c(this.f24845c);
                    return;
                }
                return;
        }
    }
}

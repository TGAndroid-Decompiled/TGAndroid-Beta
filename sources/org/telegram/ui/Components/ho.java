package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ho implements View.OnClickListener {
    public final int f24844a;
    public final ko f24845b;
    public final TLRPC.Document f24846c;

    public ho(ko koVar, TLRPC.Document document, int i10) {
        this.f24844a = i10;
        this.f24845b = koVar;
        this.f24846c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24844a) {
            case 0:
                jo joVar = this.f24845b.d;
                if (joVar != null) {
                    joVar.c(this.f24846c);
                    return;
                }
                return;
            default:
                jo joVar2 = this.f24845b.d;
                if (joVar2 != null) {
                    joVar2.c(this.f24846c);
                    return;
                }
                return;
        }
    }
}

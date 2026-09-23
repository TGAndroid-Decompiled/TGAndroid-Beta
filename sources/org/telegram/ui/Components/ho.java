package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ho implements View.OnClickListener {
    public final int f24760a;
    public final ko f24761b;
    public final TLRPC.Document f24762c;

    public ho(ko koVar, TLRPC.Document document, int i10) {
        this.f24760a = i10;
        this.f24761b = koVar;
        this.f24762c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24760a) {
            case 0:
                jo joVar = this.f24761b.d;
                if (joVar != null) {
                    joVar.c(this.f24762c);
                    return;
                }
                return;
            default:
                jo joVar2 = this.f24761b.d;
                if (joVar2 != null) {
                    joVar2.c(this.f24762c);
                    return;
                }
                return;
        }
    }
}

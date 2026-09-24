package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ho implements View.OnClickListener {
    public final int f24817a;
    public final ko f24818b;
    public final TLRPC.Document f24819c;

    public ho(ko koVar, TLRPC.Document document, int i10) {
        this.f24817a = i10;
        this.f24818b = koVar;
        this.f24819c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24817a) {
            case 0:
                jo joVar = this.f24818b.d;
                if (joVar != null) {
                    joVar.c(this.f24819c);
                    return;
                }
                return;
            default:
                jo joVar2 = this.f24818b.d;
                if (joVar2 != null) {
                    joVar2.c(this.f24819c);
                    return;
                }
                return;
        }
    }
}

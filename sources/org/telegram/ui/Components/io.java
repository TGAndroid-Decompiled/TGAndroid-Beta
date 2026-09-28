package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class io implements View.OnClickListener {
    public final int f25186a;
    public final lo f25187b;
    public final TLRPC.Document f25188c;

    public io(lo loVar, TLRPC.Document document, int i10) {
        this.f25186a = i10;
        this.f25187b = loVar;
        this.f25188c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25186a) {
            case 0:
                ko koVar = this.f25187b.d;
                if (koVar != null) {
                    koVar.c(this.f25188c);
                    return;
                }
                return;
            default:
                ko koVar2 = this.f25187b.d;
                if (koVar2 != null) {
                    koVar2.c(this.f25188c);
                    return;
                }
                return;
        }
    }
}

package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class io implements View.OnClickListener {
    public final int f25185a;
    public final lo f25186b;
    public final TLRPC.Document f25187c;

    public io(lo loVar, TLRPC.Document document, int i10) {
        this.f25185a = i10;
        this.f25186b = loVar;
        this.f25187c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25185a) {
            case 0:
                ko koVar = this.f25186b.d;
                if (koVar != null) {
                    koVar.c(this.f25187c);
                    return;
                }
                return;
            default:
                ko koVar2 = this.f25186b.d;
                if (koVar2 != null) {
                    koVar2.c(this.f25187c);
                    return;
                }
                return;
        }
    }
}

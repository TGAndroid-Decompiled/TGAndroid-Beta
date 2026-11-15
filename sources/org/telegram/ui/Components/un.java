package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class un implements View.OnClickListener {
    public final int f40130a;
    public final xn f40131b;
    public final TLRPC.Document f40132c;

    public un(xn xnVar, TLRPC.Document document, int i7) {
        this.f40130a = i7;
        this.f40131b = xnVar;
        this.f40132c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40130a) {
            case 0:
                wn wnVar = this.f40131b.d;
                if (wnVar != null) {
                    wnVar.c(this.f40132c);
                    return;
                }
                return;
            default:
                wn wnVar2 = this.f40131b.d;
                if (wnVar2 != null) {
                    wnVar2.c(this.f40132c);
                    return;
                }
                return;
        }
    }
}

package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class bo implements View.OnClickListener {
    public final int f33779a;
    public final fo f33780b;
    public final TLRPC.Document f33781c;

    public bo(fo foVar, TLRPC.Document document, int i7) {
        this.f33779a = i7;
        this.f33780b = foVar;
        this.f33781c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33779a) {
            case 0:
                eo eoVar = this.f33780b.d;
                if (eoVar != null) {
                    eoVar.c(this.f33781c);
                    return;
                }
                return;
            default:
                eo eoVar2 = this.f33780b.d;
                if (eoVar2 != null) {
                    eoVar2.c(this.f33781c);
                    return;
                }
                return;
        }
    }
}

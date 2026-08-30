package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class bo implements View.OnClickListener {
    public final int f23728a;
    public final fo f23729b;
    public final TLRPC.Document f23730c;

    public bo(fo foVar, TLRPC.Document document, int i10) {
        this.f23728a = i10;
        this.f23729b = foVar;
        this.f23730c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23728a) {
            case 0:
                eo eoVar = this.f23729b.d;
                if (eoVar != null) {
                    eoVar.b(this.f23730c);
                    return;
                }
                return;
            default:
                eo eoVar2 = this.f23729b.d;
                if (eoVar2 != null) {
                    eoVar2.b(this.f23730c);
                    return;
                }
                return;
        }
    }
}

package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class lo implements View.OnClickListener {
    public final int f25062a;
    public final oo f25063b;
    public final TLRPC.Document f25064c;

    public lo(oo ooVar, TLRPC.Document document, int i10) {
        this.f25062a = i10;
        this.f25063b = ooVar;
        this.f25064c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25062a) {
            case 0:
                no noVar = this.f25063b.d;
                if (noVar != null) {
                    noVar.c(this.f25064c);
                    return;
                }
                return;
            default:
                no noVar2 = this.f25063b.d;
                if (noVar2 != null) {
                    noVar2.c(this.f25064c);
                    return;
                }
                return;
        }
    }
}

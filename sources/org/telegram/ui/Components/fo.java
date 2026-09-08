package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class fo implements View.OnClickListener {
    public final int f26163a;
    public final io f26164b;
    public final TLRPC.Document f26165c;

    public fo(io ioVar, TLRPC.Document document, int i10) {
        this.f26163a = i10;
        this.f26164b = ioVar;
        this.f26165c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26163a) {
            case 0:
                ho hoVar = this.f26164b.d;
                if (hoVar != null) {
                    hoVar.d(this.f26165c);
                    return;
                }
                return;
            default:
                ho hoVar2 = this.f26164b.d;
                if (hoVar2 != null) {
                    hoVar2.d(this.f26165c);
                    return;
                }
                return;
        }
    }
}

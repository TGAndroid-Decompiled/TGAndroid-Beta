package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class fo implements View.OnClickListener {
    public final int f35286a;
    public final io f35287b;
    public final TLRPC.Document f35288c;

    public fo(io ioVar, TLRPC.Document document, int i7) {
        this.f35286a = i7;
        this.f35287b = ioVar;
        this.f35288c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35286a) {
            case 0:
                ho hoVar = this.f35287b.d;
                if (hoVar != null) {
                    hoVar.b(this.f35288c);
                    return;
                }
                return;
            default:
                ho hoVar2 = this.f35287b.d;
                if (hoVar2 != null) {
                    hoVar2.b(this.f35288c);
                    return;
                }
                return;
        }
    }
}

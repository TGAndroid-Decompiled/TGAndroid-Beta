package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class fo implements View.OnClickListener {
    public final int f35288a;
    public final io f35289b;
    public final TLRPC.Document f35290c;

    public fo(io ioVar, TLRPC.Document document, int i7) {
        this.f35288a = i7;
        this.f35289b = ioVar;
        this.f35290c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35288a) {
            case 0:
                ho hoVar = this.f35289b.d;
                if (hoVar != null) {
                    hoVar.b(this.f35290c);
                    return;
                }
                return;
            default:
                ho hoVar2 = this.f35289b.d;
                if (hoVar2 != null) {
                    hoVar2.b(this.f35290c);
                    return;
                }
                return;
        }
    }
}

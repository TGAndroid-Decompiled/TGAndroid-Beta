package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class fo implements View.OnClickListener {
    public final int f26137a;
    public final io f26138b;
    public final TLRPC.Document f26139c;

    public fo(io ioVar, TLRPC.Document document, int i10) {
        this.f26137a = i10;
        this.f26138b = ioVar;
        this.f26139c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26137a) {
            case 0:
                ho hoVar = this.f26138b.d;
                if (hoVar != null) {
                    hoVar.d(this.f26139c);
                    return;
                }
                return;
            default:
                ho hoVar2 = this.f26138b.d;
                if (hoVar2 != null) {
                    hoVar2.d(this.f26139c);
                    return;
                }
                return;
        }
    }
}

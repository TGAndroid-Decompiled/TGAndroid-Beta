package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class fo implements View.OnClickListener {
    public final int f26136a;
    public final io f26137b;
    public final TLRPC.Document f26138c;

    public fo(io ioVar, TLRPC.Document document, int i10) {
        this.f26136a = i10;
        this.f26137b = ioVar;
        this.f26138c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26136a) {
            case 0:
                ho hoVar = this.f26137b.d;
                if (hoVar != null) {
                    hoVar.d(this.f26138c);
                    return;
                }
                return;
            default:
                ho hoVar2 = this.f26137b.d;
                if (hoVar2 != null) {
                    hoVar2.d(this.f26138c);
                    return;
                }
                return;
        }
    }
}

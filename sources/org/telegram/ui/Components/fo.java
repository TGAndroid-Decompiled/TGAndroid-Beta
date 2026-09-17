package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class fo implements View.OnClickListener {
    public final int f26164a;
    public final io f26165b;
    public final TLRPC.Document f26166c;

    public fo(io ioVar, TLRPC.Document document, int i10) {
        this.f26164a = i10;
        this.f26165b = ioVar;
        this.f26166c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26164a) {
            case 0:
                ho hoVar = this.f26165b.d;
                if (hoVar != null) {
                    hoVar.d(this.f26166c);
                    return;
                }
                return;
            default:
                ho hoVar2 = this.f26165b.d;
                if (hoVar2 != null) {
                    hoVar2.d(this.f26166c);
                    return;
                }
                return;
        }
    }
}

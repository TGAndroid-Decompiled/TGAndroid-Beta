package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class un implements View.OnClickListener {
    public final int f30995a;
    public final xn f30996b;
    public final TLRPC.Document f30997c;

    public un(xn xnVar, TLRPC.Document document, int i10) {
        this.f30995a = i10;
        this.f30996b = xnVar;
        this.f30997c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30995a) {
            case 0:
                wn wnVar = this.f30996b.d;
                if (wnVar != null) {
                    wnVar.b(this.f30997c);
                    return;
                }
                return;
            default:
                wn wnVar2 = this.f30996b.d;
                if (wnVar2 != null) {
                    wnVar2.b(this.f30997c);
                    return;
                }
                return;
        }
    }
}

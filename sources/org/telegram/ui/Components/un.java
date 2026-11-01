package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class un implements View.OnClickListener {
    public final int f31041a;
    public final xn f31042b;
    public final TLRPC.Document f31043c;

    public un(xn xnVar, TLRPC.Document document, int i10) {
        this.f31041a = i10;
        this.f31042b = xnVar;
        this.f31043c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31041a) {
            case 0:
                wn wnVar = this.f31042b.d;
                if (wnVar != null) {
                    wnVar.b(this.f31043c);
                    return;
                }
                return;
            default:
                wn wnVar2 = this.f31042b.d;
                if (wnVar2 != null) {
                    wnVar2.b(this.f31043c);
                    return;
                }
                return;
        }
    }
}

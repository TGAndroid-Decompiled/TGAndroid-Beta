package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class mn implements View.OnClickListener {
    public final int f36024a;
    public final pn f36025b;
    public final TLRPC.Document f36026c;

    public mn(pn pnVar, TLRPC.Document document, int i7) {
        this.f36024a = i7;
        this.f36025b = pnVar;
        this.f36026c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36024a) {
            case 0:
                on onVar = this.f36025b.d;
                if (onVar != null) {
                    onVar.b(this.f36026c);
                    return;
                }
                return;
            default:
                on onVar2 = this.f36025b.d;
                if (onVar2 != null) {
                    onVar2.b(this.f36026c);
                    return;
                }
                return;
        }
    }
}

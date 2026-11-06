package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class mn implements View.OnClickListener {
    public final int f36042a;
    public final pn f36043b;
    public final TLRPC.Document f36044c;

    public mn(pn pnVar, TLRPC.Document document, int i7) {
        this.f36042a = i7;
        this.f36043b = pnVar;
        this.f36044c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36042a) {
            case 0:
                on onVar = this.f36043b.d;
                if (onVar != null) {
                    onVar.b(this.f36044c);
                    return;
                }
                return;
            default:
                on onVar2 = this.f36043b.d;
                if (onVar2 != null) {
                    onVar2.b(this.f36044c);
                    return;
                }
                return;
        }
    }
}

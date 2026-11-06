package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class mn implements View.OnClickListener {
    public final int f35996a;
    public final pn f35997b;
    public final TLRPC.Document f35998c;

    public mn(pn pnVar, TLRPC.Document document, int i7) {
        this.f35996a = i7;
        this.f35997b = pnVar;
        this.f35998c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35996a) {
            case 0:
                on onVar = this.f35997b.d;
                if (onVar != null) {
                    onVar.b(this.f35998c);
                    return;
                }
                return;
            default:
                on onVar2 = this.f35997b.d;
                if (onVar2 != null) {
                    onVar2.b(this.f35998c);
                    return;
                }
                return;
        }
    }
}

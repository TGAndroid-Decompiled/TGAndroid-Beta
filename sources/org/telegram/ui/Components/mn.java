package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class mn implements View.OnClickListener {
    public final int f35980a;
    public final pn f35981b;
    public final TLRPC.Document f35982c;

    public mn(pn pnVar, TLRPC.Document document, int i7) {
        this.f35980a = i7;
        this.f35981b = pnVar;
        this.f35982c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35980a) {
            case 0:
                on onVar = this.f35981b.d;
                if (onVar != null) {
                    onVar.b(this.f35982c);
                    return;
                }
                return;
            default:
                on onVar2 = this.f35981b.d;
                if (onVar2 != null) {
                    onVar2.b(this.f35982c);
                    return;
                }
                return;
        }
    }
}

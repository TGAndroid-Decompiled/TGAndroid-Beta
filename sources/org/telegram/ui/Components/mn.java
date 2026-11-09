package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class mn implements View.OnClickListener {
    public final int f36113a;
    public final pn f36114b;
    public final TLRPC.Document f36115c;

    public mn(pn pnVar, TLRPC.Document document, int i7) {
        this.f36113a = i7;
        this.f36114b = pnVar;
        this.f36115c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36113a) {
            case 0:
                on onVar = this.f36114b.d;
                if (onVar != null) {
                    onVar.b(this.f36115c);
                    return;
                }
                return;
            default:
                on onVar2 = this.f36114b.d;
                if (onVar2 != null) {
                    onVar2.b(this.f36115c);
                    return;
                }
                return;
        }
    }
}

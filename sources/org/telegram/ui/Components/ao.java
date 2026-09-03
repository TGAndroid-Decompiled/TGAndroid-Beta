package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ao implements View.OnClickListener {
    public final int f23461a;
    public final eo f23462b;
    public final TLRPC.Document f23463c;

    public ao(eo eoVar, TLRPC.Document document, int i10) {
        this.f23461a = i10;
        this.f23462b = eoVar;
        this.f23463c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23461a) {
            case 0:
                co coVar = this.f23462b.d;
                if (coVar != null) {
                    coVar.b(this.f23463c);
                    return;
                }
                return;
            default:
                co coVar2 = this.f23462b.d;
                if (coVar2 != null) {
                    coVar2.b(this.f23463c);
                    return;
                }
                return;
        }
    }
}

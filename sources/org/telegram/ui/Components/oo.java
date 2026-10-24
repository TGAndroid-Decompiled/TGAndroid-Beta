package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class oo implements View.OnClickListener {
    public final int f29351a;
    public final ro f29352b;
    public final TLRPC.Document f29353c;

    public oo(ro roVar, TLRPC.Document document, int i10) {
        this.f29351a = i10;
        this.f29352b = roVar;
        this.f29353c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29351a) {
            case 0:
                qo qoVar = this.f29352b.d;
                if (qoVar != null) {
                    qoVar.c(this.f29353c);
                    return;
                }
                return;
            default:
                qo qoVar2 = this.f29352b.d;
                if (qoVar2 != null) {
                    qoVar2.c(this.f29353c);
                    return;
                }
                return;
        }
    }
}

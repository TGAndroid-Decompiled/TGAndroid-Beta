package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class jo implements View.OnClickListener {
    public final int f27874a;
    public final mo f27875b;
    public final TLRPC.Document f27876c;

    public jo(mo moVar, TLRPC.Document document, int i10) {
        this.f27874a = i10;
        this.f27875b = moVar;
        this.f27876c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27874a) {
            case 0:
                lo loVar = this.f27875b.d;
                if (loVar != null) {
                    loVar.b(this.f27876c);
                    return;
                }
                return;
            default:
                lo loVar2 = this.f27875b.d;
                if (loVar2 != null) {
                    loVar2.b(this.f27876c);
                    return;
                }
                return;
        }
    }
}

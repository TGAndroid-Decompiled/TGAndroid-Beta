package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class jo implements View.OnClickListener {
    public final int f27868a;
    public final mo f27869b;
    public final TLRPC.Document f27870c;

    public jo(mo moVar, TLRPC.Document document, int i10) {
        this.f27868a = i10;
        this.f27869b = moVar;
        this.f27870c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27868a) {
            case 0:
                lo loVar = this.f27869b.d;
                if (loVar != null) {
                    loVar.b(this.f27870c);
                    return;
                }
                return;
            default:
                lo loVar2 = this.f27869b.d;
                if (loVar2 != null) {
                    loVar2.b(this.f27870c);
                    return;
                }
                return;
        }
    }
}

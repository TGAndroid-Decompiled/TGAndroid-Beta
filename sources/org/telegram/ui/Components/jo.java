package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class jo implements View.OnClickListener {
    public final int f27869a;
    public final mo f27870b;
    public final TLRPC.Document f27871c;

    public jo(mo moVar, TLRPC.Document document, int i10) {
        this.f27869a = i10;
        this.f27870b = moVar;
        this.f27871c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27869a) {
            case 0:
                lo loVar = this.f27870b.d;
                if (loVar != null) {
                    loVar.b(this.f27871c);
                    return;
                }
                return;
            default:
                lo loVar2 = this.f27870b.d;
                if (loVar2 != null) {
                    loVar2.b(this.f27871c);
                    return;
                }
                return;
        }
    }
}

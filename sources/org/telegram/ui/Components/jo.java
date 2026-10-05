package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class jo implements View.OnClickListener {
    public final int f27941a;
    public final mo f27942b;
    public final TLRPC.Document f27943c;

    public jo(mo moVar, TLRPC.Document document, int i10) {
        this.f27941a = i10;
        this.f27942b = moVar;
        this.f27943c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27941a) {
            case 0:
                lo loVar = this.f27942b.d;
                if (loVar != null) {
                    loVar.b(this.f27943c);
                    return;
                }
                return;
            default:
                lo loVar2 = this.f27942b.d;
                if (loVar2 != null) {
                    loVar2.b(this.f27943c);
                    return;
                }
                return;
        }
    }
}

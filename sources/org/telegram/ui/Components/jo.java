package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class jo implements View.OnClickListener {
    public final int f25523a;
    public final mo f25524b;
    public final TLRPC.Document f25525c;

    public jo(mo moVar, TLRPC.Document document, int i10) {
        this.f25523a = i10;
        this.f25524b = moVar;
        this.f25525c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25523a) {
            case 0:
                lo loVar = this.f25524b.d;
                if (loVar != null) {
                    loVar.c(this.f25525c);
                    return;
                }
                return;
            default:
                lo loVar2 = this.f25524b.d;
                if (loVar2 != null) {
                    loVar2.c(this.f25525c);
                    return;
                }
                return;
        }
    }
}

package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class io implements View.OnClickListener {
    public final int f25166a;
    public final lo f25167b;
    public final TLRPC.Document f25168c;

    public io(lo loVar, TLRPC.Document document, int i10) {
        this.f25166a = i10;
        this.f25167b = loVar;
        this.f25168c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25166a) {
            case 0:
                ko koVar = this.f25167b.d;
                if (koVar != null) {
                    koVar.c(this.f25168c);
                    return;
                }
                return;
            default:
                ko koVar2 = this.f25167b.d;
                if (koVar2 != null) {
                    koVar2.c(this.f25168c);
                    return;
                }
                return;
        }
    }
}

package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class io implements View.OnClickListener {
    public final int f25207a;
    public final lo f25208b;
    public final TLRPC.Document f25209c;

    public io(lo loVar, TLRPC.Document document, int i10) {
        this.f25207a = i10;
        this.f25208b = loVar;
        this.f25209c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25207a) {
            case 0:
                ko koVar = this.f25208b.d;
                if (koVar != null) {
                    koVar.b(this.f25209c);
                    return;
                }
                return;
            default:
                ko koVar2 = this.f25208b.d;
                if (koVar2 != null) {
                    koVar2.b(this.f25209c);
                    return;
                }
                return;
        }
    }
}

package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class zn implements View.OnClickListener {
    public final int f35376a;
    public final co f35377b;
    public final TLRPC.Document f35378c;

    public zn(co coVar, TLRPC.Document document, int i10) {
        this.f35376a = i10;
        this.f35377b = coVar;
        this.f35378c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35376a) {
            case 0:
                bo boVar = this.f35377b.d;
                if (boVar != null) {
                    boVar.d(this.f35378c);
                    return;
                }
                return;
            default:
                bo boVar2 = this.f35377b.d;
                if (boVar2 != null) {
                    boVar2.d(this.f35378c);
                    return;
                }
                return;
        }
    }
}

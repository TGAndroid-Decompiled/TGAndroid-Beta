package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class vn implements View.OnClickListener {
    public final int f33412a;
    public final yn f33413b;
    public final TLRPC.Document f33414c;

    public vn(yn ynVar, TLRPC.Document document, int i9) {
        this.f33412a = i9;
        this.f33413b = ynVar;
        this.f33414c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33412a) {
            case 0:
                xn xnVar = this.f33413b.d;
                if (xnVar != null) {
                    xnVar.d(this.f33414c);
                    return;
                }
                return;
            default:
                xn xnVar2 = this.f33413b.d;
                if (xnVar2 != null) {
                    xnVar2.d(this.f33414c);
                    return;
                }
                return;
        }
    }
}

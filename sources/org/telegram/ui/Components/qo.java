package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class qo implements View.OnClickListener {
    public final int f29721a;
    public final to f29722b;
    public final TLRPC.Document f29723c;

    public qo(to toVar, TLRPC.Document document, int i10) {
        this.f29721a = i10;
        this.f29722b = toVar;
        this.f29723c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29721a) {
            case 0:
                so soVar = this.f29722b.d;
                if (soVar != null) {
                    soVar.d(this.f29723c);
                    return;
                }
                return;
            default:
                so soVar2 = this.f29722b.d;
                if (soVar2 != null) {
                    soVar2.d(this.f29723c);
                    return;
                }
                return;
        }
    }
}

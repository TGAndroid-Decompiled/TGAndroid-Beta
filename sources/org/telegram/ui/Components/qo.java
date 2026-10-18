package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class qo implements View.OnClickListener {
    public final int f29714a;
    public final to f29715b;
    public final TLRPC.Document f29716c;

    public qo(to toVar, TLRPC.Document document, int i10) {
        this.f29714a = i10;
        this.f29715b = toVar;
        this.f29716c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29714a) {
            case 0:
                so soVar = this.f29715b.d;
                if (soVar != null) {
                    soVar.d(this.f29716c);
                    return;
                }
                return;
            default:
                so soVar2 = this.f29715b.d;
                if (soVar2 != null) {
                    soVar2.d(this.f29716c);
                    return;
                }
                return;
        }
    }
}

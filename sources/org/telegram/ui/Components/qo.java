package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class qo implements View.OnClickListener {
    public final int f29715a;
    public final to f29716b;
    public final TLRPC.Document f29717c;

    public qo(to toVar, TLRPC.Document document, int i10) {
        this.f29715a = i10;
        this.f29716b = toVar;
        this.f29717c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29715a) {
            case 0:
                so soVar = this.f29716b.d;
                if (soVar != null) {
                    soVar.d(this.f29717c);
                    return;
                }
                return;
            default:
                so soVar2 = this.f29716b.d;
                if (soVar2 != null) {
                    soVar2.d(this.f29717c);
                    return;
                }
                return;
        }
    }
}

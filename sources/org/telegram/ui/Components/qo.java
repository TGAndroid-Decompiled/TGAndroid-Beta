package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class qo implements View.OnClickListener {
    public final int f29687a;
    public final to f29688b;
    public final TLRPC.Document f29689c;

    public qo(to toVar, TLRPC.Document document, int i10) {
        this.f29687a = i10;
        this.f29688b = toVar;
        this.f29689c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29687a) {
            case 0:
                so soVar = this.f29688b.d;
                if (soVar != null) {
                    soVar.d(this.f29689c);
                    return;
                }
                return;
            default:
                so soVar2 = this.f29688b.d;
                if (soVar2 != null) {
                    soVar2.d(this.f29689c);
                    return;
                }
                return;
        }
    }
}

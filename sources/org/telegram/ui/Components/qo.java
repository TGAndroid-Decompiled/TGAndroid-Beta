package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class qo implements View.OnClickListener {
    public final int f29672a;
    public final to f29673b;
    public final TLRPC.Document f29674c;

    public qo(to toVar, TLRPC.Document document, int i10) {
        this.f29672a = i10;
        this.f29673b = toVar;
        this.f29674c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29672a) {
            case 0:
                so soVar = this.f29673b.d;
                if (soVar != null) {
                    soVar.d(this.f29674c);
                    return;
                }
                return;
            default:
                so soVar2 = this.f29673b.d;
                if (soVar2 != null) {
                    soVar2.d(this.f29674c);
                    return;
                }
                return;
        }
    }
}

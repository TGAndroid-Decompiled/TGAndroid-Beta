package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class qo implements View.OnClickListener {
    public final int f29670a;
    public final to f29671b;
    public final TLRPC.Document f29672c;

    public qo(to toVar, TLRPC.Document document, int i10) {
        this.f29670a = i10;
        this.f29671b = toVar;
        this.f29672c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29670a) {
            case 0:
                so soVar = this.f29671b.d;
                if (soVar != null) {
                    soVar.d(this.f29672c);
                    return;
                }
                return;
            default:
                so soVar2 = this.f29671b.d;
                if (soVar2 != null) {
                    soVar2.d(this.f29672c);
                    return;
                }
                return;
        }
    }
}

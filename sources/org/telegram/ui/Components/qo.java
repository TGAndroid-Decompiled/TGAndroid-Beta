package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class qo implements View.OnClickListener {
    public final int f29682a;
    public final to f29683b;
    public final TLRPC.Document f29684c;

    public qo(to toVar, TLRPC.Document document, int i10) {
        this.f29682a = i10;
        this.f29683b = toVar;
        this.f29684c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29682a) {
            case 0:
                so soVar = this.f29683b.d;
                if (soVar != null) {
                    soVar.d(this.f29684c);
                    return;
                }
                return;
            default:
                so soVar2 = this.f29683b.d;
                if (soVar2 != null) {
                    soVar2.d(this.f29684c);
                    return;
                }
                return;
        }
    }
}

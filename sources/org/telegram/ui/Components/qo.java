package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class qo implements View.OnClickListener {
    public final int f29683a;
    public final to f29684b;
    public final TLRPC.Document f29685c;

    public qo(to toVar, TLRPC.Document document, int i10) {
        this.f29683a = i10;
        this.f29684b = toVar;
        this.f29685c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29683a) {
            case 0:
                so soVar = this.f29684b.d;
                if (soVar != null) {
                    soVar.d(this.f29685c);
                    return;
                }
                return;
            default:
                so soVar2 = this.f29684b.d;
                if (soVar2 != null) {
                    soVar2.d(this.f29685c);
                    return;
                }
                return;
        }
    }
}

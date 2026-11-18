package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class co implements View.OnClickListener {
    public final int f34138a;
    public final go f34139b;
    public final TLRPC.Document f34140c;

    public co(go goVar, TLRPC.Document document, int i7) {
        this.f34138a = i7;
        this.f34139b = goVar;
        this.f34140c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34138a) {
            case 0:
                fo foVar = this.f34139b.d;
                if (foVar != null) {
                    foVar.b(this.f34140c);
                    return;
                }
                return;
            default:
                fo foVar2 = this.f34139b.d;
                if (foVar2 != null) {
                    foVar2.b(this.f34140c);
                    return;
                }
                return;
        }
    }
}

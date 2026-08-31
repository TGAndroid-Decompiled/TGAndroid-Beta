package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class eo implements View.OnClickListener {
    public final int f26594a;
    public final ho f26595b;
    public final TLRPC.Document f26596c;

    public eo(ho hoVar, TLRPC.Document document, int i10) {
        this.f26594a = i10;
        this.f26595b = hoVar;
        this.f26596c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26594a) {
            case 0:
                go goVar = this.f26595b.d;
                if (goVar != null) {
                    goVar.b(this.f26596c);
                    return;
                }
                return;
            default:
                go goVar2 = this.f26595b.d;
                if (goVar2 != null) {
                    goVar2.b(this.f26596c);
                    return;
                }
                return;
        }
    }
}

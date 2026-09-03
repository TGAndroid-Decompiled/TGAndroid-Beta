package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class co implements View.OnClickListener {
    public final int f26014a;
    public final ho f26015b;
    public final TLRPC.Document f26016c;

    public co(ho hoVar, TLRPC.Document document, int i10) {
        this.f26014a = i10;
        this.f26015b = hoVar;
        this.f26016c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26014a) {
            case 0:
                go goVar = this.f26015b.d;
                if (goVar != null) {
                    goVar.b(this.f26016c);
                    return;
                }
                return;
            default:
                go goVar2 = this.f26015b.d;
                if (goVar2 != null) {
                    goVar2.b(this.f26016c);
                    return;
                }
                return;
        }
    }
}

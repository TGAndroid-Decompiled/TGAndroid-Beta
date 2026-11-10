package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ln implements View.OnClickListener {
    public final int f35697a;
    public final on f35698b;
    public final TLRPC.Document f35699c;

    public ln(on onVar, TLRPC.Document document, int i7) {
        this.f35697a = i7;
        this.f35698b = onVar;
        this.f35699c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35697a) {
            case 0:
                nn nnVar = this.f35698b.d;
                if (nnVar != null) {
                    nnVar.b(this.f35699c);
                    return;
                }
                return;
            default:
                nn nnVar2 = this.f35698b.d;
                if (nnVar2 != null) {
                    nnVar2.b(this.f35699c);
                    return;
                }
                return;
        }
    }
}

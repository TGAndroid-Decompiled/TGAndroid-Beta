package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ln implements View.OnClickListener {
    public final int f35793a;
    public final on f35794b;
    public final TLRPC.Document f35795c;

    public ln(on onVar, TLRPC.Document document, int i3) {
        this.f35793a = i3;
        this.f35794b = onVar;
        this.f35795c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35793a) {
            case 0:
                nn nnVar = this.f35794b.d;
                if (nnVar != null) {
                    nnVar.b(this.f35795c);
                    return;
                }
                return;
            default:
                nn nnVar2 = this.f35794b.d;
                if (nnVar2 != null) {
                    nnVar2.b(this.f35795c);
                    return;
                }
                return;
        }
    }
}

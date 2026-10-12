package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class to implements View.OnClickListener {
    public final int f29474a;
    public final wo f29475b;
    public final TLRPC.Document f29476c;

    public to(wo woVar, TLRPC.Document document, int i10) {
        this.f29474a = i10;
        this.f29475b = woVar;
        this.f29476c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29474a) {
            case 0:
                vo voVar = this.f29475b.d;
                if (voVar != null) {
                    voVar.d(this.f29476c);
                    return;
                }
                return;
            default:
                vo voVar2 = this.f29475b.d;
                if (voVar2 != null) {
                    voVar2.d(this.f29476c);
                    return;
                }
                return;
        }
    }
}

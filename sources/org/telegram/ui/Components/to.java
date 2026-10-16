package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class to implements View.OnClickListener {
    public final int f29173a;
    public final wo f29174b;
    public final TLRPC.Document f29175c;

    public to(wo woVar, TLRPC.Document document, int i10) {
        this.f29173a = i10;
        this.f29174b = woVar;
        this.f29175c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29173a) {
            case 0:
                vo voVar = this.f29174b.d;
                if (voVar != null) {
                    voVar.d(this.f29175c);
                    return;
                }
                return;
            default:
                vo voVar2 = this.f29174b.d;
                if (voVar2 != null) {
                    voVar2.d(this.f29175c);
                    return;
                }
                return;
        }
    }
}

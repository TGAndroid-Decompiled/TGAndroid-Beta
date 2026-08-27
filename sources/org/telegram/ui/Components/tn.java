package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

public final class tn implements View.OnClickListener {

    public final int f32843a;

    public final wn f32844b;

    public final TLRPC.Document f32845c;

    public tn(wn wnVar, TLRPC.Document document, int i10) {
        this.f32843a = i10;
        this.f32844b = wnVar;
        this.f32845c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32843a) {
            case 0:
                vn vnVar = this.f32844b.d;
                if (vnVar != null) {
                    vnVar.d(this.f32845c);
                }
                break;
            default:
                vn vnVar2 = this.f32844b.d;
                if (vnVar2 != null) {
                    vnVar2.d(this.f32845c);
                }
                break;
        }
    }
}

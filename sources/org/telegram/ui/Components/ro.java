package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ro implements View.OnClickListener {
    public final int f32276a;
    public final vo f32277b;
    public final TLRPC.Document f32278c;

    public ro(vo voVar, TLRPC.Document document, int i10) {
        this.f32276a = i10;
        this.f32277b = voVar;
        this.f32278c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32276a) {
            case 0:
                uo uoVar = this.f32277b.d;
                if (uoVar != null) {
                    uoVar.b(this.f32278c);
                    return;
                }
                return;
            default:
                uo uoVar2 = this.f32277b.d;
                if (uoVar2 != null) {
                    uoVar2.b(this.f32278c);
                    return;
                }
                return;
        }
    }
}

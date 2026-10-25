package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ro implements View.OnClickListener {
    public final int f32274a;
    public final vo f32275b;
    public final TLRPC.Document f32276c;

    public ro(vo voVar, TLRPC.Document document, int i10) {
        this.f32274a = i10;
        this.f32275b = voVar;
        this.f32276c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32274a) {
            case 0:
                uo uoVar = this.f32275b.d;
                if (uoVar != null) {
                    uoVar.b(this.f32276c);
                    return;
                }
                return;
            default:
                uo uoVar2 = this.f32275b.d;
                if (uoVar2 != null) {
                    uoVar2.b(this.f32276c);
                    return;
                }
                return;
        }
    }
}

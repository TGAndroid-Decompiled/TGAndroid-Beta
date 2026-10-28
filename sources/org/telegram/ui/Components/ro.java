package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ro implements View.OnClickListener {
    public final int f32294a;
    public final vo f32295b;
    public final TLRPC.Document f32296c;

    public ro(vo voVar, TLRPC.Document document, int i10) {
        this.f32294a = i10;
        this.f32295b = voVar;
        this.f32296c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32294a) {
            case 0:
                uo uoVar = this.f32295b.d;
                if (uoVar != null) {
                    uoVar.b(this.f32296c);
                    return;
                }
                return;
            default:
                uo uoVar2 = this.f32295b.d;
                if (uoVar2 != null) {
                    uoVar2.b(this.f32296c);
                    return;
                }
                return;
        }
    }
}

package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class wo implements View.OnClickListener {
    public final int f32653a;
    public final zo f32654b;
    public final TLRPC.Document f32655c;

    public wo(zo zoVar, TLRPC.Document document, int i10) {
        this.f32653a = i10;
        this.f32654b = zoVar;
        this.f32655c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32653a) {
            case 0:
                yo yoVar = this.f32654b.d;
                if (yoVar != null) {
                    yoVar.c(this.f32655c);
                    return;
                }
                return;
            default:
                yo yoVar2 = this.f32654b.d;
                if (yoVar2 != null) {
                    yoVar2.c(this.f32655c);
                    return;
                }
                return;
        }
    }
}

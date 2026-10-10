package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class wo implements View.OnClickListener {
    public final int f32719a;
    public final zo f32720b;
    public final TLRPC.Document f32721c;

    public wo(zo zoVar, TLRPC.Document document, int i10) {
        this.f32719a = i10;
        this.f32720b = zoVar;
        this.f32721c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32719a) {
            case 0:
                yo yoVar = this.f32720b.d;
                if (yoVar != null) {
                    yoVar.c(this.f32721c);
                    return;
                }
                return;
            default:
                yo yoVar2 = this.f32720b.d;
                if (yoVar2 != null) {
                    yoVar2.c(this.f32721c);
                    return;
                }
                return;
        }
    }
}

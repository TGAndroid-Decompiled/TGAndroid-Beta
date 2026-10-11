package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class wo implements View.OnClickListener {
    public final int f32695a;
    public final zo f32696b;
    public final TLRPC.Document f32697c;

    public wo(zo zoVar, TLRPC.Document document, int i10) {
        this.f32695a = i10;
        this.f32696b = zoVar;
        this.f32697c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32695a) {
            case 0:
                yo yoVar = this.f32696b.d;
                if (yoVar != null) {
                    yoVar.c(this.f32697c);
                    return;
                }
                return;
            default:
                yo yoVar2 = this.f32696b.d;
                if (yoVar2 != null) {
                    yoVar2.c(this.f32697c);
                    return;
                }
                return;
        }
    }
}

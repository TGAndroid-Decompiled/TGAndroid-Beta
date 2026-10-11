package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class wo implements View.OnClickListener {
    public final int f32749a;
    public final zo f32750b;
    public final TLRPC.Document f32751c;

    public wo(zo zoVar, TLRPC.Document document, int i10) {
        this.f32749a = i10;
        this.f32750b = zoVar;
        this.f32751c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32749a) {
            case 0:
                yo yoVar = this.f32750b.d;
                if (yoVar != null) {
                    yoVar.c(this.f32751c);
                    return;
                }
                return;
            default:
                yo yoVar2 = this.f32750b.d;
                if (yoVar2 != null) {
                    yoVar2.c(this.f32751c);
                    return;
                }
                return;
        }
    }
}

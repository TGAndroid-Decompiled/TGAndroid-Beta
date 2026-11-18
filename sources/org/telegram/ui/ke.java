package org.telegram.ui;

import android.content.DialogInterface;
public final class ke implements DialogInterface.OnDismissListener {
    public final int f49254a;
    public final bn f49255b;

    public ke(bn bnVar, int i7) {
        this.f49254a = i7;
        this.f49255b = bnVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f49254a) {
            case 0:
                mj mjVar = this.f49255b.f46085m2;
                if (mjVar != null) {
                    mjVar.c(false);
                    return;
                }
                return;
            case 1:
                bn.j1(this.f49255b);
                return;
            case 2:
                this.f49255b.x8(false, true, 0.0f);
                return;
            case 3:
                this.f49255b.x8(false, true, 0.0f);
                return;
            case 4:
                this.f49255b.x8(false, true, 0.0f);
                return;
            case 5:
                this.f49255b.x8(false, true, 0.0f);
                return;
            case 6:
                this.f49255b.x8(false, true, 0.0f);
                return;
            case 7:
                this.f49255b.x8(false, true, 0.0f);
                return;
            default:
                this.f49255b.f46069kc = null;
                return;
        }
    }
}

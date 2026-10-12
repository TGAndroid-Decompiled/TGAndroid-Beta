package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class yo implements View.OnClickListener {
    public final int f33151a;
    public final bp f33152b;
    public final TLRPC.Document f33153c;

    public yo(bp bpVar, TLRPC.Document document, int i10) {
        this.f33151a = i10;
        this.f33152b = bpVar;
        this.f33153c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33151a) {
            case 0:
                ap apVar = this.f33152b.d;
                if (apVar != null) {
                    apVar.c(this.f33153c);
                    return;
                }
                return;
            default:
                ap apVar2 = this.f33152b.d;
                if (apVar2 != null) {
                    apVar2.c(this.f33153c);
                    return;
                }
                return;
        }
    }
}

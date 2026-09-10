package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.zd1;
public final class ip implements zd1 {
    public final int f24057a;
    public final jp f24058b;

    public ip(jp jpVar, int i10) {
        this.f24057a = i10;
        this.f24058b = jpVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f24057a) {
            case 0:
                sp spVar = this.f24058b.f24483a;
                spVar.Y.dismissInternal();
                spVar.dismiss();
                return;
            default:
                sp spVar2 = this.f24058b.f24483a;
                spVar2.Y.dismissInternal();
                spVar2.dismiss();
                return;
        }
    }
}

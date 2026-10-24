package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.oc1;
public final class ip implements oc1 {
    public final int f27462a;
    public final ri f27463b;
    public final org.telegram.ui.fc f27464c;

    public ip(ri riVar, org.telegram.ui.fc fcVar, int i10) {
        this.f27462a = i10;
        this.f27463b = riVar;
        this.f27464c = fcVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f27462a) {
            case 0:
                this.f27463b.dismissInternal();
                this.f27464c.run(tL_wallPaper);
                return;
            default:
                this.f27463b.dismissInternal();
                this.f27464c.run(tL_wallPaper);
                return;
        }
    }
}

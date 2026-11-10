package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.w71;
public final class jo implements w71 {
    public final int f35028a;
    public final ci f35029b;
    public final org.telegram.ui.wb f35030c;

    public jo(ci ciVar, org.telegram.ui.wb wbVar, int i7) {
        this.f35028a = i7;
        this.f35029b = ciVar;
        this.f35030c = wbVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f35028a) {
            case 0:
                this.f35029b.K();
                this.f35030c.a(tL_wallPaper);
                return;
            default:
                this.f35029b.K();
                this.f35030c.a(tL_wallPaper);
                return;
        }
    }
}

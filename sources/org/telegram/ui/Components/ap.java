package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nd1;
public final class ap implements nd1 {
    public final int f22479a;
    public final wi f22480b;
    public final org.telegram.ui.ec f22481c;

    public ap(wi wiVar, org.telegram.ui.ec ecVar, int i10) {
        this.f22479a = i10;
        this.f22480b = wiVar;
        this.f22481c = ecVar;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f22479a) {
            case 0:
                this.f22480b.dismissInternal();
                this.f22481c.run(tL_wallPaper);
                return;
            default:
                this.f22480b.dismissInternal();
                this.f22481c.run(tL_wallPaper);
                return;
        }
    }
}

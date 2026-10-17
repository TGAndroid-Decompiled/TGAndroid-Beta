package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class hc implements Utilities.Callback {
    public final int f37512a;
    public final dd f37513b;

    public hc(dd ddVar, int i10) {
        this.f37512a = i10;
        this.f37513b = ddVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37512a) {
            case 0:
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                dd ddVar = this.f37513b;
                ddVar.E = wallPaper;
                ddVar.F = wallPaper;
                ddVar.G = wallPaper;
                ddVar.X0(false);
                ddVar.a1(false);
                AndroidUtilities.runOnUIThread(new ic(ddVar, 1), 350L);
                return;
            case 1:
                dd.V(this.f37513b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            default:
                this.f37513b.W0((TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}

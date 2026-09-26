package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ec implements Utilities.Callback {
    public final int f33362a;
    public final ad f33363b;

    public ec(ad adVar, int i10) {
        this.f33362a = i10;
        this.f33363b = adVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33362a) {
            case 0:
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                ad adVar = this.f33363b;
                adVar.E = wallPaper;
                adVar.F = wallPaper;
                adVar.G = wallPaper;
                adVar.X0(false);
                adVar.a1(false);
                AndroidUtilities.runOnUIThread(new fc(adVar, 1), 350L);
                return;
            case 1:
                ad.V(this.f33363b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            default:
                this.f33363b.W0((TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}

package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class lc implements Utilities.Callback {
    public final int f37914a;
    public final hd f37915b;

    public lc(hd hdVar, int i10) {
        this.f37914a = i10;
        this.f37915b = hdVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37914a) {
            case 0:
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                hd hdVar = this.f37915b;
                hdVar.E = wallPaper;
                hdVar.F = wallPaper;
                hdVar.G = wallPaper;
                hdVar.X0(false);
                hdVar.a1(false);
                AndroidUtilities.runOnUIThread(new mc(hdVar, 1), 350L);
                return;
            case 1:
                hd.V(this.f37915b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            default:
                this.f37915b.W0((TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}

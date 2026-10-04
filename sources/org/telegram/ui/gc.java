package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class gc implements Utilities.Callback {
    public final int f36559a;
    public final cd f36560b;

    public gc(cd cdVar, int i10) {
        this.f36559a = i10;
        this.f36560b = cdVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f36559a) {
            case 0:
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                cd cdVar = this.f36560b;
                cdVar.E = wallPaper;
                cdVar.F = wallPaper;
                cdVar.G = wallPaper;
                cdVar.X0(false);
                cdVar.a1(false);
                AndroidUtilities.runOnUIThread(new hc(cdVar, 1), 350L);
                return;
            case 1:
                cd.T(this.f36560b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            default:
                this.f36560b.W0((TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}

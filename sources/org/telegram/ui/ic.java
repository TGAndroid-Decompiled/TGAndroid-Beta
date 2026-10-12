package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ic implements Utilities.Callback {
    public final int f38836a;
    public final fd f38837b;

    public ic(fd fdVar, int i10) {
        this.f38836a = i10;
        this.f38837b = fdVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38836a) {
            case 0:
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                fd fdVar = this.f38837b;
                fdVar.E = wallPaper;
                fdVar.F = wallPaper;
                fdVar.G = wallPaper;
                fdVar.X0(false);
                fdVar.a1(false);
                AndroidUtilities.runOnUIThread(new jc(fdVar, 1), 350L);
                return;
            case 1:
                fd.V(this.f38837b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            default:
                this.f38837b.W0((TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}

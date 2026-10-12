package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ic implements Utilities.Callback {
    public final int f38839a;
    public final fd f38840b;

    public ic(fd fdVar, int i10) {
        this.f38839a = i10;
        this.f38840b = fdVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38839a) {
            case 0:
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                fd fdVar = this.f38840b;
                fdVar.E = wallPaper;
                fdVar.F = wallPaper;
                fdVar.G = wallPaper;
                fdVar.X0(false);
                fdVar.a1(false);
                AndroidUtilities.runOnUIThread(new jc(fdVar, 1), 350L);
                return;
            case 1:
                fd.V(this.f38840b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            default:
                this.f38840b.W0((TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}

package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class gc implements Utilities.Callback {
    public final int f39583a;
    public final bd f39584b;

    public gc(bd bdVar, int i10) {
        this.f39583a = i10;
        this.f39584b = bdVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39583a) {
            case 0:
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                bd bdVar = this.f39584b;
                bdVar.E = wallPaper;
                bdVar.F = wallPaper;
                bdVar.G = wallPaper;
                bdVar.a1(false);
                bdVar.d1(false);
                AndroidUtilities.runOnUIThread(new hc(bdVar, 1), 350L);
                return;
            case 1:
                bd.W(this.f39584b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            default:
                this.f39584b.Z0((TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}

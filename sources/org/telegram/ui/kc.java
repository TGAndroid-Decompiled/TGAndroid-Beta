package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class kc implements Utilities.Callback {
    public final int f37344a;
    public final gd f37345b;

    public kc(gd gdVar, int i10) {
        this.f37344a = i10;
        this.f37345b = gdVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37344a) {
            case 0:
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                gd gdVar = this.f37345b;
                gdVar.E = wallPaper;
                gdVar.F = wallPaper;
                gdVar.G = wallPaper;
                gdVar.X0(false);
                gdVar.a1(false);
                AndroidUtilities.runOnUIThread(new lc(gdVar, 1), 350L);
                return;
            case 1:
                gd.V(this.f37345b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            default:
                this.f37345b.W0((TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}

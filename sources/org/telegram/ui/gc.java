package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class gc implements Utilities.Callback {
    public final int f33899a;
    public final cd f33900b;

    public gc(cd cdVar, int i10) {
        this.f33899a = i10;
        this.f33900b = cdVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33899a) {
            case 0:
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                cd cdVar = this.f33900b;
                cdVar.E = wallPaper;
                cdVar.F = wallPaper;
                cdVar.G = wallPaper;
                cdVar.X0(false);
                cdVar.a1(false);
                AndroidUtilities.runOnUIThread(new hc(cdVar, 1), 350L);
                return;
            case 1:
                cd.V(this.f33900b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            default:
                this.f33900b.W0((TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}

package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class fc implements Utilities.Callback {
    public final int f37294a;
    public final bd f37295b;

    public fc(bd bdVar, int i10) {
        this.f37294a = i10;
        this.f37295b = bdVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37294a) {
            case 0:
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                bd bdVar = this.f37295b;
                bdVar.E = wallPaper;
                bdVar.F = wallPaper;
                bdVar.G = wallPaper;
                bdVar.Z0(false);
                bdVar.c1(false);
                AndroidUtilities.runOnUIThread(new gc(bdVar, 1), 350L);
                return;
            case 1:
                bd.V(this.f37295b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            default:
                this.f37295b.Y0((TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}

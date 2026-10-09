package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class fc implements Utilities.Callback {
    public final int f37508a;
    public final bd f37509b;

    public fc(bd bdVar, int i10) {
        this.f37508a = i10;
        this.f37509b = bdVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37508a) {
            case 0:
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                bd bdVar = this.f37509b;
                bdVar.E = wallPaper;
                bdVar.F = wallPaper;
                bdVar.G = wallPaper;
                bdVar.X0(false);
                bdVar.a1(false);
                AndroidUtilities.runOnUIThread(new gc(bdVar, 1), 350L);
                return;
            case 1:
                bd.V(this.f37509b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            default:
                this.f37509b.W0((TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}

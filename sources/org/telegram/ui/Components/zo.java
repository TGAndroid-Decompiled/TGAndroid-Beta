package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class zo implements Utilities.Callback {
    public final int f31045a;
    public final pp f31046b;

    public zo(pp ppVar, int i10) {
        this.f31045a = i10;
        this.f31046b = ppVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f31045a) {
            case 0:
                pp ppVar = this.f31046b;
                ppVar.f27431f0 = (TL_stories.TL_premium_boostsStatus) obj;
                ppVar.f27429e0 = true;
                ppVar.F(true);
                ppVar.f27428d0 = false;
                return;
            default:
                pp.m(this.f31046b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}

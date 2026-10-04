package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class zo implements Utilities.Callback {
    public final int f33583a;
    public final pp f33584b;

    public zo(pp ppVar, int i10) {
        this.f33583a = i10;
        this.f33584b = ppVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33583a) {
            case 0:
                pp ppVar = this.f33584b;
                ppVar.f29691f0 = (TL_stories.TL_premium_boostsStatus) obj;
                ppVar.f29689e0 = true;
                ppVar.D(true);
                ppVar.f29687d0 = false;
                return;
            default:
                pp.m(this.f33584b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}

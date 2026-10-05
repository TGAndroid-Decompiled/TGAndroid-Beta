package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class zo implements Utilities.Callback {
    public final int f33597a;
    public final pp f33598b;

    public zo(pp ppVar, int i10) {
        this.f33597a = i10;
        this.f33598b = ppVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33597a) {
            case 0:
                pp ppVar = this.f33598b;
                ppVar.f29789f0 = (TL_stories.TL_premium_boostsStatus) obj;
                ppVar.f29787e0 = true;
                ppVar.D(true);
                ppVar.f29785d0 = false;
                return;
            default:
                pp.m(this.f33598b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}

package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class zo implements Utilities.Callback {
    public final int f33589a;
    public final pp f33590b;

    public zo(pp ppVar, int i10) {
        this.f33589a = i10;
        this.f33590b = ppVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33589a) {
            case 0:
                pp ppVar = this.f33590b;
                ppVar.f29696f0 = (TL_stories.TL_premium_boostsStatus) obj;
                ppVar.f29694e0 = true;
                ppVar.D(true);
                ppVar.f29692d0 = false;
                return;
            default:
                pp.m(this.f33590b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}

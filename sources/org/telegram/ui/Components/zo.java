package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class zo implements Utilities.Callback {
    public final int f33582a;
    public final pp f33583b;

    public zo(pp ppVar, int i10) {
        this.f33582a = i10;
        this.f33583b = ppVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33582a) {
            case 0:
                pp ppVar = this.f33583b;
                ppVar.f29690f0 = (TL_stories.TL_premium_boostsStatus) obj;
                ppVar.f29688e0 = true;
                ppVar.D(true);
                ppVar.f29686d0 = false;
                return;
            default:
                pp.m(this.f33583b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}

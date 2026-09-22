package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class wo implements e2.h {
    public final int f29756a;
    public final mp f29757b;

    public wo(mp mpVar, int i10) {
        this.f29756a = i10;
        this.f29757b = mpVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f29756a) {
            case 0:
                mp mpVar = this.f29757b;
                mpVar.f26200f0 = (TL_stories.TL_premium_boostsStatus) obj;
                mpVar.f26198e0 = true;
                mpVar.F(true);
                mpVar.f26197d0 = false;
                return;
            default:
                mp.m(this.f29757b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}

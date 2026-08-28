package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class mo implements d5.d {
    public final int f30899a;
    public final cp f30900b;

    public mo(cp cpVar, int i9) {
        this.f30899a = i9;
        this.f30900b = cpVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f30899a) {
            case 0:
                cp cpVar = this.f30900b;
                cpVar.f27522b0 = (TL_stories.TL_premium_boostsStatus) obj;
                cpVar.f27520a0 = true;
                cpVar.E(true);
                cpVar.Z = false;
                return;
            default:
                cp.m(this.f30900b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}

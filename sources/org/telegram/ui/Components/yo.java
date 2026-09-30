package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class yo implements Utilities.Callback {
    public final int f30730a;
    public final op f30731b;

    public yo(op opVar, int i10) {
        this.f30730a = i10;
        this.f30731b = opVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f30730a) {
            case 0:
                op opVar = this.f30731b;
                opVar.f27144f0 = (TL_stories.TL_premium_boostsStatus) obj;
                opVar.f27142e0 = true;
                opVar.F(true);
                opVar.f27141d0 = false;
                return;
            default:
                op.m(this.f30731b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}

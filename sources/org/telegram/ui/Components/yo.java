package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class yo implements Utilities.Callback {
    public final int f30735a;
    public final op f30736b;

    public yo(op opVar, int i10) {
        this.f30735a = i10;
        this.f30736b = opVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f30735a) {
            case 0:
                op opVar = this.f30736b;
                opVar.f27146f0 = (TL_stories.TL_premium_boostsStatus) obj;
                opVar.f27144e0 = true;
                opVar.F(true);
                opVar.f27143d0 = false;
                return;
            default:
                op.m(this.f30736b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}

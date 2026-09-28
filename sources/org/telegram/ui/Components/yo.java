package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class yo implements Utilities.Callback {
    public final int f30734a;
    public final op f30735b;

    public yo(op opVar, int i10) {
        this.f30734a = i10;
        this.f30735b = opVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f30734a) {
            case 0:
                op opVar = this.f30735b;
                opVar.f27145f0 = (TL_stories.TL_premium_boostsStatus) obj;
                opVar.f27143e0 = true;
                opVar.F(true);
                opVar.f27142d0 = false;
                return;
            default:
                op.m(this.f30735b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}

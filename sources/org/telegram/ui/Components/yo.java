package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class yo implements Utilities.Callback {
    public final int f30736a;
    public final op f30737b;

    public yo(op opVar, int i10) {
        this.f30736a = i10;
        this.f30737b = opVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f30736a) {
            case 0:
                op opVar = this.f30737b;
                opVar.f27168f0 = (TL_stories.TL_premium_boostsStatus) obj;
                opVar.f27166e0 = true;
                opVar.F(true);
                opVar.f27165d0 = false;
                return;
            default:
                op.m(this.f30737b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}

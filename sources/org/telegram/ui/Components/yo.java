package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class yo implements Utilities.Callback {
    public final int f30663a;
    public final op f30664b;

    public yo(op opVar, int i10) {
        this.f30663a = i10;
        this.f30664b = opVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f30663a) {
            case 0:
                op opVar = this.f30664b;
                opVar.f27075f0 = (TL_stories.TL_premium_boostsStatus) obj;
                opVar.f27073e0 = true;
                opVar.F(true);
                opVar.f27072d0 = false;
                return;
            default:
                op.m(this.f30664b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}

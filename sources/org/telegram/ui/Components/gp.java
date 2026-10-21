package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class gp implements Utilities.Callback {
    public final int f26624a;
    public final wp f26625b;

    public gp(wp wpVar, int i10) {
        this.f26624a = i10;
        this.f26625b = wpVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f26624a) {
            case 0:
                wp wpVar = this.f26625b;
                wpVar.f32212f0 = (TL_stories.TL_premium_boostsStatus) obj;
                wpVar.f32210e0 = true;
                wpVar.F(true);
                wpVar.f32209d0 = false;
                return;
            default:
                wp.n(this.f26625b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}

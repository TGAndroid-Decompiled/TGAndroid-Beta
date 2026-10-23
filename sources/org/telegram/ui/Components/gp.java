package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class gp implements Utilities.Callback {
    public final int f26628a;
    public final wp f26629b;

    public gp(wp wpVar, int i10) {
        this.f26628a = i10;
        this.f26629b = wpVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f26628a) {
            case 0:
                wp wpVar = this.f26629b;
                wpVar.f32216f0 = (TL_stories.TL_premium_boostsStatus) obj;
                wpVar.f32214e0 = true;
                wpVar.F(true);
                wpVar.f32213d0 = false;
                return;
            default:
                wp.n(this.f26629b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}

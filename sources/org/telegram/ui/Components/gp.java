package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class gp implements Utilities.Callback {
    public final int f26630a;
    public final wp f26631b;

    public gp(wp wpVar, int i10) {
        this.f26630a = i10;
        this.f26631b = wpVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f26630a) {
            case 0:
                wp wpVar = this.f26631b;
                wpVar.f32178f0 = (TL_stories.TL_premium_boostsStatus) obj;
                wpVar.f32176e0 = true;
                wpVar.G(true);
                wpVar.f32175d0 = false;
                return;
            default:
                wp.n(this.f26631b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}

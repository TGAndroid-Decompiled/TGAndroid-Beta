package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class gp implements Utilities.Callback {
    public final int f26637a;
    public final wp f26638b;

    public gp(wp wpVar, int i10) {
        this.f26637a = i10;
        this.f26638b = wpVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f26637a) {
            case 0:
                wp wpVar = this.f26638b;
                wpVar.f32185f0 = (TL_stories.TL_premium_boostsStatus) obj;
                wpVar.f32183e0 = true;
                wpVar.G(true);
                wpVar.f32182d0 = false;
                return;
            default:
                wp.n(this.f26638b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}

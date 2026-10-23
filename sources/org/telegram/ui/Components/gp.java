package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
public final class gp implements Utilities.Callback {
    public final int f26690a;
    public final wp f26691b;

    public gp(wp wpVar, int i10) {
        this.f26690a = i10;
        this.f26691b = wpVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f26690a) {
            case 0:
                wp wpVar = this.f26691b;
                wpVar.f32289e0 = (TL_stories.TL_premium_boostsStatus) obj;
                wpVar.f32288d0 = true;
                wpVar.L(true);
                wpVar.f32287c0 = false;
                return;
            default:
                wp.m(this.f26691b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}

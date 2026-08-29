package org.telegram.ui.Components;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class qo implements f5.d {
    public final int f32015a;
    public final gp f32016b;

    public qo(gp gpVar, int i10) {
        this.f32015a = i10;
        this.f32016b = gpVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f32015a) {
            case 0:
                gp gpVar = this.f32016b;
                gpVar.f28933b0 = (TL_stories.TL_premium_boostsStatus) obj;
                gpVar.f28931a0 = true;
                gpVar.E(true);
                gpVar.Z = false;
                return;
            default:
                gp.m(this.f32016b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}

package org.telegram.ui;

import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;
public final class bf implements Utilities.Callback {
    public final int f32352a;
    public final zn f32353b;

    public bf(zn znVar, int i10) {
        this.f32352a = i10;
        this.f32353b = znVar;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f32352a;
        zn znVar = this.f32353b;
        switch (i10) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                zn znVar2 = this.f32353b;
                znVar2.f40281g5 = messageSuggestionParams;
                znVar2.p5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                znVar2.yb(true, null, znVar2.p5, null, null, true, 0, null, false, 0L, null, true);
                return;
            case 1:
                znVar.vb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    znVar.finishFragment();
                    return;
                }
                return;
            case 2:
                znVar.da((String) obj, false);
                return;
            case 3:
                znVar.Db((MessageSuggestionParams) obj);
                return;
            case 4:
                Long l4 = (Long) obj;
                org.telegram.ui.Components.m31 m31Var = znVar.R1;
                if (m31Var != null) {
                    m31Var.m(l4.longValue(), true);
                    return;
                }
                return;
            case 5:
                hs hsVar = znVar.f40239d0;
                hsVar.f34226c.add(((org.telegram.ui.ActionBar.v0) obj).getIconView());
                return;
            case 6:
                int intValue = ((Integer) obj).intValue();
                int i11 = zn.Gc;
                znVar.Ba(intValue);
                return;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = zn.Gc;
                znVar.Ba(intValue2);
                return;
        }
    }
}

package org.telegram.ui;

import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;
public final class bf implements Utilities.Callback {
    public final int f34785a;
    public final co f34786b;

    public bf(co coVar, int i10) {
        this.f34785a = i10;
        this.f34786b = coVar;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f34785a;
        co coVar = this.f34786b;
        switch (i10) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                co coVar2 = this.f34786b;
                coVar2.f35268g5 = messageSuggestionParams;
                coVar2.p5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                coVar2.yb(true, null, coVar2.p5, null, null, null, false, true);
                return;
            case 1:
                coVar.vb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    coVar.finishFragment();
                    return;
                }
                return;
            case 2:
                coVar.da((String) obj, false);
                return;
            case 3:
                coVar.Db((MessageSuggestionParams) obj);
                return;
            case 4:
                Long l4 = (Long) obj;
                org.telegram.ui.Components.w21 w21Var = coVar.R1;
                if (w21Var != null) {
                    w21Var.m(l4.longValue(), true);
                    return;
                }
                return;
            case 5:
                hs hsVar = coVar.f35225d0;
                hsVar.f37102c.add(((org.telegram.ui.ActionBar.v0) obj).getIconView());
                return;
            case 6:
                int intValue = ((Integer) obj).intValue();
                int i11 = co.Hc;
                coVar.Ba(intValue);
                return;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = co.Hc;
                coVar.Ba(intValue2);
                return;
        }
    }
}

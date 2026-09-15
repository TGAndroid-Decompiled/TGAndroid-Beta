package org.telegram.ui;

import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;
public final class af implements Utilities.Callback {
    public final int f31803a;
    public final bo f31804b;

    public af(bo boVar, int i10) {
        this.f31803a = i10;
        this.f31804b = boVar;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f31803a;
        bo boVar = this.f31804b;
        switch (i10) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                bo boVar2 = this.f31804b;
                boVar2.f32317g5 = messageSuggestionParams;
                boVar2.p5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                boVar2.yb(true, null, boVar2.p5, null, null, true, 0, null, false, 0L, null, true);
                return;
            case 1:
                boVar.vb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    boVar.finishFragment();
                    return;
                }
                return;
            case 2:
                boVar.da((String) obj, false);
                return;
            case 3:
                boVar.Db((MessageSuggestionParams) obj);
                return;
            case 4:
                Long l4 = (Long) obj;
                org.telegram.ui.Components.x21 x21Var = boVar.R1;
                if (x21Var != null) {
                    x21Var.m(l4.longValue(), true);
                    return;
                }
                return;
            case 5:
                hs hsVar = boVar.f32275d0;
                hsVar.f34332c.add(((org.telegram.ui.ActionBar.v0) obj).getIconView());
                return;
            case 6:
                int intValue = ((Integer) obj).intValue();
                int i11 = bo.Hc;
                boVar.Ba(intValue);
                return;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = bo.Hc;
                boVar.Ba(intValue2);
                return;
        }
    }
}

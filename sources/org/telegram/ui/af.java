package org.telegram.ui;

import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;
public final class af implements Utilities.Callback {
    public final int f31777a;
    public final bo f31778b;

    public af(bo boVar, int i10) {
        this.f31777a = i10;
        this.f31778b = boVar;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f31777a;
        bo boVar = this.f31778b;
        switch (i10) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                bo boVar2 = this.f31778b;
                boVar2.f32313g5 = messageSuggestionParams;
                boVar2.p5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                boVar2.yb(true, null, boVar2.p5, null, null, null, false, true);
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
                hs hsVar = boVar.f32271d0;
                hsVar.f34348c.add(((org.telegram.ui.ActionBar.v0) obj).getIconView());
                return;
            case 6:
                int intValue = ((Integer) obj).intValue();
                int i11 = bo.Gc;
                boVar.Ba(intValue);
                return;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = bo.Gc;
                boVar.Ba(intValue2);
                return;
        }
    }
}

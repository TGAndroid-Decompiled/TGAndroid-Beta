package org.telegram.ui;

import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;
public final class cf implements Utilities.Callback {
    public final int f32774a;
    public final bo f32775b;

    public cf(bo boVar, int i10) {
        this.f32774a = i10;
        this.f32775b = boVar;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f32774a;
        bo boVar = this.f32775b;
        switch (i10) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                bo boVar2 = this.f32775b;
                boVar2.f32295g5 = messageSuggestionParams;
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
                org.telegram.ui.Components.y21 y21Var = boVar.R1;
                if (y21Var != null) {
                    y21Var.m(l4.longValue(), true);
                    return;
                }
                return;
            case 5:
                js jsVar = boVar.f32253d0;
                jsVar.f34924c.add(((org.telegram.ui.ActionBar.w0) obj).getIconView());
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

package org.telegram.ui;

import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;
public final class df implements Utilities.Callback {
    public final int f31892a;
    public final eo f31893b;

    public df(eo eoVar, int i10) {
        this.f31892a = i10;
        this.f31893b = eoVar;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f31892a;
        eo eoVar = this.f31893b;
        switch (i10) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                eo eoVar2 = this.f31893b;
                eoVar2.f32336g5 = messageSuggestionParams;
                eoVar2.p5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                eoVar2.yb(true, null, eoVar2.p5, null, null, null, false, true);
                return;
            case 1:
                eoVar.vb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    eoVar.finishFragment();
                    return;
                }
                return;
            case 2:
                eoVar.da((String) obj, false);
                return;
            case 3:
                eoVar.Db((MessageSuggestionParams) obj);
                return;
            case 4:
                Long l4 = (Long) obj;
                org.telegram.ui.Components.k31 k31Var = eoVar.R1;
                if (k31Var != null) {
                    k31Var.m(l4.longValue(), true);
                    return;
                }
                return;
            case 5:
                is isVar = eoVar.f32294d0;
                isVar.f33789c.add(((org.telegram.ui.ActionBar.w0) obj).getIconView());
                return;
            case 6:
                int intValue = ((Integer) obj).intValue();
                int i11 = eo.Hc;
                eoVar.Ba(intValue);
                return;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = eo.Hc;
                eoVar.Ba(intValue2);
                return;
        }
    }
}

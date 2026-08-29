package org.telegram.ui;

import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;
public final class qe implements Utilities.Callback {
    public final int f41698a;
    public final tn f41699b;

    public qe(tn tnVar, int i10) {
        this.f41698a = i10;
        this.f41699b = tnVar;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f41698a;
        tn tnVar = this.f41699b;
        switch (i10) {
            case 0:
                MessageSuggestionParams messageSuggestionParams = (MessageSuggestionParams) obj;
                tn tnVar2 = this.f41699b;
                tnVar2.f42768c5 = messageSuggestionParams;
                tnVar2.f42880l5.messageOwner.suggested_post = messageSuggestionParams.toTl();
                tnVar2.yb(true, null, tnVar2.f42880l5, null, null, null, false, true);
                return;
            case 1:
                tnVar.vb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    tnVar.finishFragment();
                    return;
                }
                return;
            case 2:
                tnVar.da((String) obj, false);
                return;
            case 3:
                tnVar.Db((MessageSuggestionParams) obj);
                return;
            case 4:
                Long l10 = (Long) obj;
                org.telegram.ui.Components.m21 m21Var = tnVar.N1;
                if (m21Var != null) {
                    m21Var.m(l10.longValue(), true);
                    return;
                }
                return;
            case 5:
                vr vrVar = tnVar.Z;
                vrVar.f43717c.add(((org.telegram.ui.ActionBar.w0) obj).getIconView());
                return;
            case 6:
                int intValue = ((Integer) obj).intValue();
                int i11 = tn.Dc;
                tnVar.Ba(intValue);
                return;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i12 = tn.Dc;
                tnVar.Ba(intValue2);
                return;
        }
    }
}

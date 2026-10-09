package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.e90;
public final class j implements Utilities.Callback {
    public final int f35057a;
    public final Object f35058b;

    public j(Object obj, int i10) {
        this.f35057a = i10;
        this.f35058b = obj;
    }

    @Override
    public final void run(Object obj) {
        String str;
        int i10;
        CharSequence formatSpannable;
        int i11 = this.f35057a;
        boolean z10 = false;
        Object obj2 = this.f35058b;
        switch (i11) {
            case 0:
                ai.j3 j3Var = (ai.j3) obj2;
                if (((String) obj) == null) {
                    z10 = true;
                }
                j3Var.run(Boolean.valueOf(z10));
                return;
            case 1:
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj2;
                h0 h0Var = (h0) obj;
                if (h0Var == null) {
                    str = "LOCAL_STORAGE_ERROR";
                } else {
                    str = null;
                }
                callback2.run(h0Var, str);
                return;
            case 2:
                String str2 = (String) obj;
                d2.k("approve session", str2);
                ((e90) obj2).run(str2);
                return;
            case 3:
                String str3 = (String) obj;
                d2.k("disconnect session", str3);
                ((Utilities.Callback) obj2).run(str3);
                return;
            default:
                a7 a7Var = (a7) obj2;
                a7Var.getClass();
                if (((Integer) obj).intValue() == 0) {
                    i10 = 12;
                } else {
                    i10 = 24;
                }
                if (a7Var.f34651a != i10) {
                    a7Var.f34651a = i10;
                    a7Var.W(a7Var.getParentActivity());
                    a7Var.Y();
                    ea0 ea0Var = a7Var.h;
                    if (a7Var.f34658s != null) {
                        formatSpannable = LocaleController.formatSpannable(R.string.WalletImportCurrentPhraseInfo, Integer.valueOf(i10));
                    } else {
                        formatSpannable = LocaleController.formatSpannable(R.string.WalletImportPhraseInfo, Integer.valueOf(i10));
                    }
                    ea0Var.setText(formatSpannable);
                    return;
                }
                return;
        }
    }
}

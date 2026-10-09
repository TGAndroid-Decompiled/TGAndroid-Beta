package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.e90;
public final class j implements Utilities.Callback {
    public final int f35043a;
    public final Object f35044b;

    public j(Object obj, int i10) {
        this.f35043a = i10;
        this.f35044b = obj;
    }

    @Override
    public final void run(Object obj) {
        String str;
        int i10;
        CharSequence formatSpannable;
        int i11 = this.f35043a;
        boolean z10 = false;
        Object obj2 = this.f35044b;
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
                z6 z6Var = (z6) obj2;
                z6Var.getClass();
                if (((Integer) obj).intValue() == 0) {
                    i10 = 12;
                } else {
                    i10 = 24;
                }
                if (z6Var.f35747a != i10) {
                    z6Var.f35747a = i10;
                    z6Var.W(z6Var.getParentActivity());
                    z6Var.Y();
                    ea0 ea0Var = z6Var.h;
                    if (z6Var.f35754s != null) {
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

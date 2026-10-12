package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.da0;
import org.telegram.ui.j90;
public final class j implements Utilities.Callback {
    public final int f33317a;
    public final Object f33318b;

    public j(Object obj, int i10) {
        this.f33317a = i10;
        this.f33318b = obj;
    }

    @Override
    public final void run(Object obj) {
        String str;
        int i10;
        CharSequence formatSpannable;
        int i11 = this.f33317a;
        boolean z10 = false;
        Object obj2 = this.f33318b;
        switch (i11) {
            case 0:
                bi.y2 y2Var = (bi.y2) obj2;
                if (((String) obj) == null) {
                    z10 = true;
                }
                y2Var.run(Boolean.valueOf(z10));
                return;
            case 1:
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj2;
                g0 g0Var = (g0) obj;
                if (g0Var == null) {
                    str = "LOCAL_STORAGE_ERROR";
                } else {
                    str = null;
                }
                callback2.run(g0Var, str);
                return;
            case 2:
                String str2 = (String) obj;
                d2.k("approve session", str2);
                ((j90) obj2).run(str2);
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
                if (z6Var.f33952a != i10) {
                    z6Var.f33952a = i10;
                    z6Var.W(z6Var.getParentActivity());
                    z6Var.Y();
                    da0 da0Var = z6Var.h;
                    if (z6Var.f33958s != null) {
                        formatSpannable = LocaleController.formatSpannable(R.string.WalletImportCurrentPhraseInfo, Integer.valueOf(i10));
                    } else {
                        formatSpannable = LocaleController.formatSpannable(R.string.WalletImportPhraseInfo, Integer.valueOf(i10));
                    }
                    da0Var.setText(formatSpannable);
                    return;
                }
                return;
        }
    }
}

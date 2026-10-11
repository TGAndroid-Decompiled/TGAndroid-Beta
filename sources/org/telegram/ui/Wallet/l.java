package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.d90;
public final class l implements Utilities.Callback {
    public final int f35183a;
    public final Object f35184b;

    public l(Object obj, int i10) {
        this.f35183a = i10;
        this.f35184b = obj;
    }

    @Override
    public final void run(Object obj) {
        String str;
        int i10;
        CharSequence formatSpannable;
        int i11 = this.f35183a;
        boolean z10 = false;
        Object obj2 = this.f35184b;
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
                i0 i0Var = (i0) obj;
                if (i0Var == null) {
                    str = "LOCAL_STORAGE_ERROR";
                } else {
                    str = null;
                }
                callback2.run(i0Var, str);
                return;
            case 2:
                String str2 = (String) obj;
                f2.k("approve session", str2);
                ((d90) obj2).run(str2);
                return;
            case 3:
                String str3 = (String) obj;
                f2.k("disconnect session", str3);
                ((Utilities.Callback) obj2).run(str3);
                return;
            default:
                c7 c7Var = (c7) obj2;
                c7Var.getClass();
                if (((Integer) obj).intValue() == 0) {
                    i10 = 12;
                } else {
                    i10 = 24;
                }
                if (c7Var.f34773a != i10) {
                    c7Var.f34773a = i10;
                    c7Var.W(c7Var.getParentActivity());
                    c7Var.Y();
                    fa0 fa0Var = c7Var.h;
                    if (c7Var.f34780s != null) {
                        formatSpannable = LocaleController.formatSpannable(R.string.WalletImportCurrentPhraseInfo, Integer.valueOf(i10));
                    } else {
                        formatSpannable = LocaleController.formatSpannable(R.string.WalletImportPhraseInfo, Integer.valueOf(i10));
                    }
                    fa0Var.setText(formatSpannable);
                    return;
                }
                return;
        }
    }
}

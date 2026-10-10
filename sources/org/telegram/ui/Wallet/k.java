package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.e90;
public final class k implements Utilities.Callback {
    public final int f35153a;
    public final Object f35154b;

    public k(Object obj, int i10) {
        this.f35153a = i10;
        this.f35154b = obj;
    }

    @Override
    public final void run(Object obj) {
        String str;
        int i10;
        CharSequence formatSpannable;
        int i11 = this.f35153a;
        boolean z10 = false;
        Object obj2 = this.f35154b;
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
                e2.k("approve session", str2);
                ((e90) obj2).run(str2);
                return;
            case 3:
                String str3 = (String) obj;
                e2.k("disconnect session", str3);
                ((Utilities.Callback) obj2).run(str3);
                return;
            default:
                b7 b7Var = (b7) obj2;
                b7Var.getClass();
                if (((Integer) obj).intValue() == 0) {
                    i10 = 12;
                } else {
                    i10 = 24;
                }
                if (b7Var.f34742a != i10) {
                    b7Var.f34742a = i10;
                    b7Var.W(b7Var.getParentActivity());
                    b7Var.Y();
                    fa0 fa0Var = b7Var.h;
                    if (b7Var.f34749s != null) {
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

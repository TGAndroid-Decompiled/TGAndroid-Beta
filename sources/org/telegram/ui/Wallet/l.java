package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.x90;
import org.telegram.ui.n80;
public final class l implements Utilities.Callback {
    public final int f34413a;
    public final Object f34414b;

    public l(Object obj, int i10) {
        this.f34413a = i10;
        this.f34414b = obj;
    }

    @Override
    public final void run(Object obj) {
        String str;
        CharSequence formatSpannable;
        int i10 = this.f34413a;
        int i11 = 12;
        boolean z10 = false;
        Object obj2 = this.f34414b;
        switch (i10) {
            case 0:
                ai.x8 x8Var = (ai.x8) obj2;
                if (((String) obj) == null) {
                    z10 = true;
                }
                x8Var.run(Boolean.valueOf(z10));
                return;
            case 1:
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj2;
                j0 j0Var = (j0) obj;
                if (j0Var == null) {
                    str = "LOCAL_STORAGE_ERROR";
                } else {
                    str = null;
                }
                callback2.run(j0Var, str);
                return;
            case 2:
                String str2 = (String) obj;
                f2.k("approve session", str2);
                ((n80) obj2).run(str2);
                return;
            case 3:
                String str3 = (String) obj;
                f2.k("disconnect session", str3);
                ((Utilities.Callback) obj2).run(str3);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new v3(12, (t7) obj2, (TLRPC.UserFull) obj));
                return;
            default:
                w7 w7Var = (w7) obj2;
                w7Var.getClass();
                if (((Integer) obj).intValue() != 0) {
                    i11 = 24;
                }
                if (w7Var.f35047a != i11) {
                    w7Var.f35047a = i11;
                    w7Var.W(w7Var.getParentActivity());
                    w7Var.Y();
                    x90 x90Var = w7Var.h;
                    if (w7Var.f35053s != null) {
                        formatSpannable = LocaleController.formatSpannable(R.string.WalletImportCurrentPhraseInfo, Integer.valueOf(i11));
                    } else {
                        formatSpannable = LocaleController.formatSpannable(R.string.WalletImportPhraseInfo, Integer.valueOf(i11));
                    }
                    x90Var.setText(formatSpannable);
                    return;
                }
                return;
        }
    }
}

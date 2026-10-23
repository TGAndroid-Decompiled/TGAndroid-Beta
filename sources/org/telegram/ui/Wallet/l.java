package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.x90;
import org.telegram.ui.l80;
public final class l implements Utilities.Callback {
    public final int f34449a;
    public final Object f34450b;

    public l(Object obj, int i10) {
        this.f34449a = i10;
        this.f34450b = obj;
    }

    @Override
    public final void run(Object obj) {
        String str;
        int i10;
        CharSequence formatSpannable;
        int i11 = this.f34449a;
        boolean z10 = false;
        Object obj2 = this.f34450b;
        switch (i11) {
            case 0:
                ai.y8 y8Var = (ai.y8) obj2;
                if (((String) obj) == null) {
                    z10 = true;
                }
                y8Var.run(Boolean.valueOf(z10));
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
                ((l80) obj2).run(str2);
                return;
            case 3:
                String str3 = (String) obj;
                f2.k("disconnect session", str3);
                ((Utilities.Callback) obj2).run(str3);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new z3(11, (t7) obj2, (TLRPC.UserFull) obj));
                return;
            default:
                w7 w7Var = (w7) obj2;
                w7Var.getClass();
                if (((Integer) obj).intValue() == 0) {
                    i10 = 12;
                } else {
                    i10 = 24;
                }
                if (w7Var.f35074a != i10) {
                    w7Var.f35074a = i10;
                    w7Var.W(w7Var.getParentActivity());
                    w7Var.Y();
                    x90 x90Var = w7Var.h;
                    if (w7Var.f35080s != null) {
                        formatSpannable = LocaleController.formatSpannable(R.string.WalletImportCurrentPhraseInfo, Integer.valueOf(i10));
                    } else {
                        formatSpannable = LocaleController.formatSpannable(R.string.WalletImportPhraseInfo, Integer.valueOf(i10));
                    }
                    x90Var.setText(formatSpannable);
                    return;
                }
                return;
        }
    }
}

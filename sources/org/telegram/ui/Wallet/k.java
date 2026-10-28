package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.r80;
public final class k implements Utilities.Callback {
    public final int f36785a;
    public final Object f36786b;

    public k(Object obj, int i10) {
        this.f36785a = i10;
        this.f36786b = obj;
    }

    @Override
    public final void run(Object obj) {
        String str;
        int i10;
        CharSequence formatSpannable;
        int i11 = this.f36785a;
        boolean z10 = false;
        Object obj2 = this.f36786b;
        switch (i11) {
            case 0:
                bi.t8 t8Var = (bi.t8) obj2;
                if (((String) obj) == null) {
                    z10 = true;
                }
                t8Var.run(Boolean.valueOf(z10));
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
                e2.k("approve session", str2);
                ((r80) obj2).run(str2);
                return;
            case 3:
                String str3 = (String) obj;
                e2.k("disconnect session", str3);
                ((Utilities.Callback) obj2).run(str3);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new a6(2, (t7) obj2, (TLRPC.UserFull) obj));
                return;
            default:
                w7 w7Var = (w7) obj2;
                w7Var.getClass();
                if (((Integer) obj).intValue() == 0) {
                    i10 = 12;
                } else {
                    i10 = 24;
                }
                if (w7Var.f37466a != i10) {
                    w7Var.f37466a = i10;
                    w7Var.X(w7Var.getParentActivity());
                    w7Var.Z();
                    aa0 aa0Var = w7Var.h;
                    if (w7Var.f37472s != null) {
                        formatSpannable = LocaleController.formatSpannable(R.string.WalletImportCurrentPhraseInfo, Integer.valueOf(i10));
                    } else {
                        formatSpannable = LocaleController.formatSpannable(R.string.WalletImportPhraseInfo, Integer.valueOf(i10));
                    }
                    aa0Var.setText(formatSpannable);
                    return;
                }
                return;
        }
    }
}

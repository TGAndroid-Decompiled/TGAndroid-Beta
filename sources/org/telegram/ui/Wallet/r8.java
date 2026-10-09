package org.telegram.ui.Wallet;

import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.ui.k9;
import org.telegram.ui.u9;
public final class r8 implements u9 {
    public final s8 f35462a;

    public r8(s8 s8Var) {
        this.f35462a = s8Var;
    }

    @Override
    public final void K(String str) {
        String trim;
        s8 s8Var = this.f35462a;
        if (!s8Var.isFinished && s8Var.M != null) {
            if (str == null) {
                trim = "";
            } else {
                try {
                    trim = str.trim();
                } catch (Throwable unused) {
                    AndroidUtilities.runOnUIThread(new m(s8Var, 14));
                    return;
                }
            }
            Uri parse = Uri.parse(trim);
            if ("ton".equalsIgnoreCase(parse.getScheme()) && "transfer".equalsIgnoreCase(parse.getAuthority()) && parse.getPathSegments().size() == 1) {
                String str2 = parse.getPathSegments().get(0);
                if (!WalletEngine2.isValidRecipientAddress(str2)) {
                    AndroidUtilities.runOnUIThread(new m(s8Var, 14));
                    return;
                }
                s8Var.M.setText(str2);
                ci.g2 g2Var = s8Var.M;
                g2Var.setSelection(g2Var.length());
                AndroidUtilities.hideKeyboard(s8Var.M);
                s8Var.f0(str2, null);
                return;
            }
            AndroidUtilities.runOnUIThread(new m(s8Var, 14));
        }
    }

    @Override
    public final boolean Z0(String str, k9 k9Var) {
        return false;
    }

    @Override
    public final String z0() {
        return null;
    }

    @Override
    public final void P0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}

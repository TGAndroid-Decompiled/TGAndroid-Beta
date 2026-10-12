package org.telegram.ui.Wallet;

import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.ui.n9;
import org.telegram.ui.x9;
public final class t8 implements x9 {
    public final u8 f35397a;

    public t8(u8 u8Var) {
        this.f35397a = u8Var;
    }

    @Override
    public final String A0() {
        return null;
    }

    @Override
    public final void K(String str) {
        String trim;
        u8 u8Var = this.f35397a;
        if (!u8Var.isFinished && u8Var.M != null) {
            if (str == null) {
                trim = "";
            } else {
                try {
                    trim = str.trim();
                } catch (Throwable unused) {
                    AndroidUtilities.runOnUIThread(new n(u8Var, 14));
                    return;
                }
            }
            Uri parse = Uri.parse(trim);
            if ("ton".equalsIgnoreCase(parse.getScheme()) && "transfer".equalsIgnoreCase(parse.getAuthority()) && parse.getPathSegments().size() == 1) {
                String str2 = parse.getPathSegments().get(0);
                if (!WalletEngine2.isValidRecipientAddress(str2)) {
                    AndroidUtilities.runOnUIThread(new n(u8Var, 14));
                    return;
                }
                u8Var.M.setText(str2);
                ci.g2 g2Var = u8Var.M;
                g2Var.setSelection(g2Var.length());
                AndroidUtilities.hideKeyboard(u8Var.M);
                u8Var.f0(str2, null);
                return;
            }
            AndroidUtilities.runOnUIThread(new n(u8Var, 14));
        }
    }

    @Override
    public final boolean Z0(String str, n9 n9Var) {
        return false;
    }

    @Override
    public final void P0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}

package org.telegram.ui.Wallet;

import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.ui.k9;
import org.telegram.ui.u9;
public final class s8 implements u9 {
    public final t8 f35557a;

    public s8(t8 t8Var) {
        this.f35557a = t8Var;
    }

    @Override
    public final void K(String str) {
        String trim;
        t8 t8Var = this.f35557a;
        if (!t8Var.isFinished && t8Var.M != null) {
            if (str == null) {
                trim = "";
            } else {
                try {
                    trim = str.trim();
                } catch (Throwable unused) {
                    AndroidUtilities.runOnUIThread(new n(t8Var, 14));
                    return;
                }
            }
            Uri parse = Uri.parse(trim);
            if ("ton".equalsIgnoreCase(parse.getScheme()) && "transfer".equalsIgnoreCase(parse.getAuthority()) && parse.getPathSegments().size() == 1) {
                String str2 = parse.getPathSegments().get(0);
                if (!WalletEngine2.isValidRecipientAddress(str2)) {
                    AndroidUtilities.runOnUIThread(new n(t8Var, 14));
                    return;
                }
                t8Var.M.setText(str2);
                ci.g2 g2Var = t8Var.M;
                g2Var.setSelection(g2Var.length());
                AndroidUtilities.hideKeyboard(t8Var.M);
                t8Var.f0(str2, null);
                return;
            }
            AndroidUtilities.runOnUIThread(new n(t8Var, 14));
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

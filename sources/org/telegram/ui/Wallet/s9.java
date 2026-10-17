package org.telegram.ui.Wallet;

import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
public final class s9 implements org.telegram.ui.x9 {
    public final t9 f34881a;

    public s9(t9 t9Var) {
        this.f34881a = t9Var;
    }

    @Override
    public final void E(String str) {
        String trim;
        t9 t9Var = this.f34881a;
        if (!t9Var.isFinished && t9Var.M != null) {
            if (str == null) {
                trim = "";
            } else {
                try {
                    trim = str.trim();
                } catch (Throwable unused) {
                    AndroidUtilities.runOnUIThread(new n(t9Var, 16));
                    return;
                }
            }
            Uri parse = Uri.parse(trim);
            if ("ton".equalsIgnoreCase(parse.getScheme()) && "transfer".equalsIgnoreCase(parse.getAuthority()) && parse.getPathSegments().size() == 1) {
                String str2 = parse.getPathSegments().get(0);
                if (!WalletEngine2.isValidRecipientAddress(str2)) {
                    AndroidUtilities.runOnUIThread(new n(t9Var, 16));
                    return;
                }
                t9Var.M.setText(str2);
                ei.e2 e2Var = t9Var.M;
                e2Var.setSelection(e2Var.length());
                AndroidUtilities.hideKeyboard(t9Var.M);
                t9Var.f0(str2, null);
                return;
            }
            AndroidUtilities.runOnUIThread(new n(t9Var, 16));
        }
    }

    @Override
    public final boolean U0(String str, org.telegram.ui.n9 n9Var) {
        return false;
    }

    @Override
    public final String p0() {
        return null;
    }

    @Override
    public final void onDismiss() {
    }

    @Override
    public final void F0(MrzRecognizer.Result result) {
    }
}

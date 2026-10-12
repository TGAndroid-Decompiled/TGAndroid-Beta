package org.telegram.ui.Wallet;

import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.ui.o9;
import org.telegram.ui.y9;
public final class q8 implements y9 {
    public final r8 f33632a;

    public q8(r8 r8Var) {
        this.f33632a = r8Var;
    }

    @Override
    public final String I0() {
        return null;
    }

    @Override
    public final void K(String str) {
        String trim;
        r8 r8Var = this.f33632a;
        if (!r8Var.isFinished && r8Var.M != null) {
            if (str == null) {
                trim = "";
            } else {
                try {
                    trim = str.trim();
                } catch (Throwable unused) {
                    AndroidUtilities.runOnUIThread(new m(r8Var, 14));
                    return;
                }
            }
            Uri parse = Uri.parse(trim);
            if ("ton".equalsIgnoreCase(parse.getScheme()) && "transfer".equalsIgnoreCase(parse.getAuthority()) && parse.getPathSegments().size() == 1) {
                String str2 = parse.getPathSegments().get(0);
                if (!WalletEngine2.isValidRecipientAddress(str2)) {
                    AndroidUtilities.runOnUIThread(new m(r8Var, 14));
                    return;
                }
                r8Var.M.setText(str2);
                di.g2 g2Var = r8Var.M;
                g2Var.setSelection(g2Var.length());
                AndroidUtilities.hideKeyboard(r8Var.M);
                r8Var.f0(str2, null);
                return;
            }
            AndroidUtilities.runOnUIThread(new m(r8Var, 14));
        }
    }

    @Override
    public final boolean e1(String str, o9 o9Var) {
        return false;
    }

    @Override
    public final void onDismiss() {
    }

    @Override
    public final void W0(MrzRecognizer.Result result) {
    }
}

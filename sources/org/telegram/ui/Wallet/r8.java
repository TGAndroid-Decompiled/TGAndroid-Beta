package org.telegram.ui.Wallet;

import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.ui.o9;
import org.telegram.ui.y9;
public final class r8 implements y9 {
    public final s8 f33406a;

    public r8(s8 s8Var) {
        this.f33406a = s8Var;
    }

    @Override
    public final String I0() {
        return null;
    }

    @Override
    public final void K(String str) {
        String trim;
        s8 s8Var = this.f33406a;
        if (!s8Var.isFinished && s8Var.M != null) {
            if (str == null) {
                trim = "";
            } else {
                try {
                    trim = str.trim();
                } catch (Throwable unused) {
                    AndroidUtilities.runOnUIThread(new n(s8Var, 14));
                    return;
                }
            }
            Uri parse = Uri.parse(trim);
            if ("ton".equalsIgnoreCase(parse.getScheme()) && "transfer".equalsIgnoreCase(parse.getAuthority()) && parse.getPathSegments().size() == 1) {
                String str2 = parse.getPathSegments().get(0);
                if (!WalletEngine2.isValidRecipientAddress(str2)) {
                    AndroidUtilities.runOnUIThread(new n(s8Var, 14));
                    return;
                }
                s8Var.M.setText(str2);
                di.g2 g2Var = s8Var.M;
                g2Var.setSelection(g2Var.length());
                AndroidUtilities.hideKeyboard(s8Var.M);
                s8Var.f0(str2, null);
                return;
            }
            AndroidUtilities.runOnUIThread(new n(s8Var, 14));
        }
    }

    @Override
    public final boolean d1(String str, o9 o9Var) {
        return false;
    }

    @Override
    public final void V0(MrzRecognizer.Result result) {
    }

    @Override
    public final void onDismiss() {
    }
}

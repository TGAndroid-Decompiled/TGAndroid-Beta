package org.telegram.ui.Wallet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
public final class p9 implements View.OnClickListener {
    public final int f43041a;
    public final w9 f43042b;

    public p9(w9 w9Var, int i7) {
        this.f43041a = i7;
        this.f43042b = w9Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43041a) {
            case 0:
                w9 w9Var = this.f43042b;
                if (w9Var.f43316y != null) {
                    org.telegram.messenger.g0.v1(w9Var.N);
                    w9Var.m0(w9Var.f43316y, null);
                    return;
                }
                return;
            case 1:
                w9 w9Var2 = this.f43042b;
                if (w9Var2.f43316y != null) {
                    org.telegram.messenger.g0.v1(w9Var2.N);
                    w9Var2.m0(w9Var2.f43316y, null);
                    return;
                }
                return;
            case 2:
                w9 w9Var3 = this.f43042b;
                ClipboardManager clipboardManager = (ClipboardManager) w9Var3.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(w9Var3.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            w9Var3.N.setText(coerceToText.toString().trim());
                            ah.i iVar = w9Var3.N;
                            iVar.setSelection(iVar.length());
                            return;
                        }
                        w9Var3.S = false;
                        w9Var3.p0(true);
                        return;
                    }
                    w9Var3.S = false;
                    w9Var3.p0(true);
                    return;
                }
                w9Var3.S = false;
                w9Var3.p0(true);
                return;
            default:
                this.f43042b.i0();
                return;
        }
    }
}

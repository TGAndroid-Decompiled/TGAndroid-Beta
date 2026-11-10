package org.telegram.ui.Wallet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
public final class r9 implements View.OnClickListener {
    public final int f43133a;
    public final y9 f43134b;

    public r9(y9 y9Var, int i7) {
        this.f43133a = i7;
        this.f43134b = y9Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43133a) {
            case 0:
                y9 y9Var = this.f43134b;
                if (y9Var.f43403y != null) {
                    org.telegram.messenger.g0.v1(y9Var.N);
                    y9Var.m0(y9Var.f43403y, null);
                    return;
                }
                return;
            case 1:
                y9 y9Var2 = this.f43134b;
                if (y9Var2.f43403y != null) {
                    org.telegram.messenger.g0.v1(y9Var2.N);
                    y9Var2.m0(y9Var2.f43403y, null);
                    return;
                }
                return;
            case 2:
                y9 y9Var3 = this.f43134b;
                ClipboardManager clipboardManager = (ClipboardManager) y9Var3.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(y9Var3.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            y9Var3.N.setText(coerceToText.toString().trim());
                            ah.i iVar = y9Var3.N;
                            iVar.setSelection(iVar.length());
                            return;
                        }
                        y9Var3.S = false;
                        y9Var3.p0(true);
                        return;
                    }
                    y9Var3.S = false;
                    y9Var3.p0(true);
                    return;
                }
                y9Var3.S = false;
                y9Var3.p0(true);
                return;
            default:
                this.f43134b.i0();
                return;
        }
    }
}

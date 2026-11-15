package org.telegram.ui.Wallet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
public final class s9 implements View.OnClickListener {
    public final int f44498a;
    public final z9 f44499b;

    public s9(z9 z9Var, int i7) {
        this.f44498a = i7;
        this.f44499b = z9Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44498a) {
            case 0:
                z9 z9Var = this.f44499b;
                if (z9Var.f44865y != null) {
                    org.telegram.messenger.g0.v1(z9Var.O);
                    z9Var.m0(z9Var.f44865y, null);
                    return;
                }
                return;
            case 1:
                z9 z9Var2 = this.f44499b;
                if (z9Var2.f44865y != null) {
                    org.telegram.messenger.g0.v1(z9Var2.O);
                    z9Var2.m0(z9Var2.f44865y, null);
                    return;
                }
                return;
            case 2:
                z9 z9Var3 = this.f44499b;
                ClipboardManager clipboardManager = (ClipboardManager) z9Var3.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(z9Var3.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            z9Var3.O.setText(coerceToText.toString().trim());
                            ah.i iVar = z9Var3.O;
                            iVar.setSelection(iVar.length());
                            return;
                        }
                        z9Var3.T = false;
                        z9Var3.p0(true);
                        return;
                    }
                    z9Var3.T = false;
                    z9Var3.p0(true);
                    return;
                }
                z9Var3.T = false;
                z9Var3.p0(true);
                return;
            default:
                this.f44499b.i0();
                return;
        }
    }
}

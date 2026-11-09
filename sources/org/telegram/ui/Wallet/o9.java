package org.telegram.ui.Wallet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
public final class o9 implements View.OnClickListener {
    public final int f42959a;
    public final v9 f42960b;

    public o9(v9 v9Var, int i7) {
        this.f42959a = i7;
        this.f42960b = v9Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42959a) {
            case 0:
                v9 v9Var = this.f42960b;
                if (v9Var.f43234y != null) {
                    org.telegram.messenger.g0.v1(v9Var.N);
                    v9Var.m0(v9Var.f43234y, null);
                    return;
                }
                return;
            case 1:
                v9 v9Var2 = this.f42960b;
                if (v9Var2.f43234y != null) {
                    org.telegram.messenger.g0.v1(v9Var2.N);
                    v9Var2.m0(v9Var2.f43234y, null);
                    return;
                }
                return;
            case 2:
                v9 v9Var3 = this.f42960b;
                ClipboardManager clipboardManager = (ClipboardManager) v9Var3.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(v9Var3.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            v9Var3.N.setText(coerceToText.toString().trim());
                            ah.i iVar = v9Var3.N;
                            iVar.setSelection(iVar.length());
                            return;
                        }
                        v9Var3.S = false;
                        v9Var3.p0(true);
                        return;
                    }
                    v9Var3.S = false;
                    v9Var3.p0(true);
                    return;
                }
                v9Var3.S = false;
                v9Var3.p0(true);
                return;
            default:
                this.f42960b.i0();
                return;
        }
    }
}

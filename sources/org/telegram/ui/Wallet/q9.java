package org.telegram.ui.Wallet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
public final class q9 implements View.OnClickListener {
    public final int f43073a;
    public final x9 f43074b;

    public q9(x9 x9Var, int i7) {
        this.f43073a = i7;
        this.f43074b = x9Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43073a) {
            case 0:
                x9 x9Var = this.f43074b;
                if (x9Var.f43348y != null) {
                    org.telegram.messenger.g0.v1(x9Var.N);
                    x9Var.m0(x9Var.f43348y, null);
                    return;
                }
                return;
            case 1:
                x9 x9Var2 = this.f43074b;
                if (x9Var2.f43348y != null) {
                    org.telegram.messenger.g0.v1(x9Var2.N);
                    x9Var2.m0(x9Var2.f43348y, null);
                    return;
                }
                return;
            case 2:
                x9 x9Var3 = this.f43074b;
                ClipboardManager clipboardManager = (ClipboardManager) x9Var3.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(x9Var3.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            x9Var3.N.setText(coerceToText.toString().trim());
                            ah.i iVar = x9Var3.N;
                            iVar.setSelection(iVar.length());
                            return;
                        }
                        x9Var3.S = false;
                        x9Var3.p0(true);
                        return;
                    }
                    x9Var3.S = false;
                    x9Var3.p0(true);
                    return;
                }
                x9Var3.S = false;
                x9Var3.p0(true);
                return;
            default:
                this.f43074b.i0();
                return;
        }
    }
}

package org.telegram.ui.Wallet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
public final class p9 implements View.OnClickListener {
    public final int f43063a;
    public final w9 f43064b;

    public p9(w9 w9Var, int i3) {
        this.f43063a = i3;
        this.f43064b = w9Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43063a) {
            case 0:
                w9 w9Var = this.f43064b;
                if (w9Var.f43369y != null) {
                    org.telegram.messenger.g0.v1(w9Var.O);
                    w9Var.m0(w9Var.f43369y, null);
                    return;
                }
                return;
            case 1:
                w9 w9Var2 = this.f43064b;
                if (w9Var2.f43369y != null) {
                    org.telegram.messenger.g0.v1(w9Var2.O);
                    w9Var2.m0(w9Var2.f43369y, null);
                    return;
                }
                return;
            case 2:
                w9 w9Var3 = this.f43064b;
                ClipboardManager clipboardManager = (ClipboardManager) w9Var3.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(w9Var3.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            w9Var3.O.setText(coerceToText.toString().trim());
                            bh.g gVar = w9Var3.O;
                            gVar.setSelection(gVar.length());
                            return;
                        }
                        w9Var3.T = false;
                        w9Var3.p0(true);
                        return;
                    }
                    w9Var3.T = false;
                    w9Var3.p0(true);
                    return;
                }
                w9Var3.T = false;
                w9Var3.p0(true);
                return;
            default:
                this.f43064b.i0();
                return;
        }
    }
}

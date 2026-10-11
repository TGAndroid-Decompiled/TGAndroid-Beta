package org.telegram.ui.Wallet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class o8 implements View.OnClickListener {
    public final int f35385a;
    public final u8 f35386b;

    public o8(u8 u8Var, int i10) {
        this.f35385a = i10;
        this.f35386b = u8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35385a) {
            case 0:
                u8 u8Var = this.f35386b;
                if (u8Var.f35618w != null) {
                    AndroidUtilities.hideKeyboard(u8Var.M);
                    u8Var.f0(u8Var.f35618w, null);
                    return;
                }
                return;
            case 1:
                u8 u8Var2 = this.f35386b;
                if (u8Var2.f35618w != null) {
                    AndroidUtilities.hideKeyboard(u8Var2.M);
                    u8Var2.f0(u8Var2.f35618w, null);
                    return;
                }
                return;
            case 2:
                u8 u8Var3 = this.f35386b;
                ClipboardManager clipboardManager = (ClipboardManager) u8Var3.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(u8Var3.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            u8Var3.M.setText(coerceToText.toString().trim());
                            ci.g2 g2Var = u8Var3.M;
                            g2Var.setSelection(g2Var.length());
                            return;
                        }
                        u8Var3.R = false;
                        u8Var3.i0(true);
                        return;
                    }
                    u8Var3.R = false;
                    u8Var3.i0(true);
                    return;
                }
                u8Var3.R = false;
                u8Var3.i0(true);
                return;
            default:
                this.f35386b.c0();
                return;
        }
    }
}

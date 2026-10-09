package org.telegram.ui.Wallet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class l8 implements View.OnClickListener {
    public final int f35198a;
    public final r8 f35199b;

    public l8(r8 r8Var, int i10) {
        this.f35198a = i10;
        this.f35199b = r8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35198a) {
            case 0:
                r8 r8Var = this.f35199b;
                if (r8Var.f35429w != null) {
                    AndroidUtilities.hideKeyboard(r8Var.M);
                    r8Var.f0(r8Var.f35429w, null);
                    return;
                }
                return;
            case 1:
                r8 r8Var2 = this.f35199b;
                if (r8Var2.f35429w != null) {
                    AndroidUtilities.hideKeyboard(r8Var2.M);
                    r8Var2.f0(r8Var2.f35429w, null);
                    return;
                }
                return;
            case 2:
                r8 r8Var3 = this.f35199b;
                ClipboardManager clipboardManager = (ClipboardManager) r8Var3.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(r8Var3.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            r8Var3.M.setText(coerceToText.toString().trim());
                            ci.g2 g2Var = r8Var3.M;
                            g2Var.setSelection(g2Var.length());
                            return;
                        }
                        r8Var3.R = false;
                        r8Var3.i0(true);
                        return;
                    }
                    r8Var3.R = false;
                    r8Var3.i0(true);
                    return;
                }
                r8Var3.R = false;
                r8Var3.i0(true);
                return;
            default:
                this.f35199b.c0();
                return;
        }
    }
}

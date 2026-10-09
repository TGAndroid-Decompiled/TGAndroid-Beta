package org.telegram.ui.Wallet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class m8 implements View.OnClickListener {
    public final int f35262a;
    public final s8 f35263b;

    public m8(s8 s8Var, int i10) {
        this.f35262a = i10;
        this.f35263b = s8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35262a) {
            case 0:
                s8 s8Var = this.f35263b;
                if (s8Var.f35495w != null) {
                    AndroidUtilities.hideKeyboard(s8Var.M);
                    s8Var.f0(s8Var.f35495w, null);
                    return;
                }
                return;
            case 1:
                s8 s8Var2 = this.f35263b;
                if (s8Var2.f35495w != null) {
                    AndroidUtilities.hideKeyboard(s8Var2.M);
                    s8Var2.f0(s8Var2.f35495w, null);
                    return;
                }
                return;
            case 2:
                s8 s8Var3 = this.f35263b;
                ClipboardManager clipboardManager = (ClipboardManager) s8Var3.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(s8Var3.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            s8Var3.M.setText(coerceToText.toString().trim());
                            ci.g2 g2Var = s8Var3.M;
                            g2Var.setSelection(g2Var.length());
                            return;
                        }
                        s8Var3.R = false;
                        s8Var3.i0(true);
                        return;
                    }
                    s8Var3.R = false;
                    s8Var3.i0(true);
                    return;
                }
                s8Var3.R = false;
                s8Var3.i0(true);
                return;
            default:
                this.f35263b.c0();
                return;
        }
    }
}

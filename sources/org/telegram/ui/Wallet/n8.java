package org.telegram.ui.Wallet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class n8 implements View.OnClickListener {
    public final int f35355a;
    public final t8 f35356b;

    public n8(t8 t8Var, int i10) {
        this.f35355a = i10;
        this.f35356b = t8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35355a) {
            case 0:
                t8 t8Var = this.f35356b;
                if (t8Var.f35588w != null) {
                    AndroidUtilities.hideKeyboard(t8Var.M);
                    t8Var.f0(t8Var.f35588w, null);
                    return;
                }
                return;
            case 1:
                t8 t8Var2 = this.f35356b;
                if (t8Var2.f35588w != null) {
                    AndroidUtilities.hideKeyboard(t8Var2.M);
                    t8Var2.f0(t8Var2.f35588w, null);
                    return;
                }
                return;
            case 2:
                t8 t8Var3 = this.f35356b;
                ClipboardManager clipboardManager = (ClipboardManager) t8Var3.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(t8Var3.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            t8Var3.M.setText(coerceToText.toString().trim());
                            ci.g2 g2Var = t8Var3.M;
                            g2Var.setSelection(g2Var.length());
                            return;
                        }
                        t8Var3.R = false;
                        t8Var3.i0(true);
                        return;
                    }
                    t8Var3.R = false;
                    t8Var3.i0(true);
                    return;
                }
                t8Var3.R = false;
                t8Var3.i0(true);
                return;
            default:
                this.f35356b.c0();
                return;
        }
    }
}

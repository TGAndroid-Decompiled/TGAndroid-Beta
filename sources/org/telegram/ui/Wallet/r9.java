package org.telegram.ui.Wallet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class r9 implements View.OnClickListener {
    public final int f34853a;
    public final w9 f34854b;

    public r9(w9 w9Var, int i10) {
        this.f34853a = i10;
        this.f34854b = w9Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34853a) {
            case 0:
                w9 w9Var = this.f34854b;
                if (w9Var.f35050w != null) {
                    AndroidUtilities.hideKeyboard(w9Var.M);
                    w9Var.f0(w9Var.f35050w, null);
                    return;
                }
                return;
            case 1:
                w9 w9Var2 = this.f34854b;
                if (w9Var2.f35050w != null) {
                    AndroidUtilities.hideKeyboard(w9Var2.M);
                    w9Var2.f0(w9Var2.f35050w, null);
                    return;
                }
                return;
            case 2:
                w9 w9Var3 = this.f34854b;
                ClipboardManager clipboardManager = (ClipboardManager) w9Var3.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(w9Var3.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            w9Var3.M.setText(coerceToText.toString().trim());
                            ei.e2 e2Var = w9Var3.M;
                            e2Var.setSelection(e2Var.length());
                            return;
                        }
                        w9Var3.R = false;
                        w9Var3.i0(true);
                        return;
                    }
                    w9Var3.R = false;
                    w9Var3.i0(true);
                    return;
                }
                w9Var3.R = false;
                w9Var3.i0(true);
                return;
            default:
                this.f34854b.c0();
                return;
        }
    }
}

package org.telegram.ui.Wallet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class m9 implements View.OnClickListener {
    public final int f34882a;
    public final s9 f34883b;

    public m9(s9 s9Var, int i10) {
        this.f34882a = i10;
        this.f34883b = s9Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34882a) {
            case 0:
                s9 s9Var = this.f34883b;
                if (s9Var.f35188w != null) {
                    AndroidUtilities.hideKeyboard(s9Var.M);
                    s9Var.h0(s9Var.f35188w, null);
                    return;
                }
                return;
            case 1:
                s9 s9Var2 = this.f34883b;
                if (s9Var2.f35188w != null) {
                    AndroidUtilities.hideKeyboard(s9Var2.M);
                    s9Var2.h0(s9Var2.f35188w, null);
                    return;
                }
                return;
            case 2:
                s9 s9Var3 = this.f34883b;
                ClipboardManager clipboardManager = (ClipboardManager) s9Var3.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(s9Var3.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            s9Var3.M.setText(coerceToText.toString().trim());
                            ei.e2 e2Var = s9Var3.M;
                            e2Var.setSelection(e2Var.length());
                            return;
                        }
                        s9Var3.R = false;
                        s9Var3.k0(true);
                        return;
                    }
                    s9Var3.R = false;
                    s9Var3.k0(true);
                    return;
                }
                s9Var3.R = false;
                s9Var3.k0(true);
                return;
            default:
                this.f34883b.d0();
                return;
        }
    }
}
